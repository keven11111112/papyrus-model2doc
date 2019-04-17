/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.uml.architecture;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.infra.architecture.representation.PapyrusRepresentationKind;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.EditorNameInitializer;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.command.ICreateDocumentTemplateEditorCommand;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.viewpoint.PapyrusDocumentTemplateViewPrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.modelresource.DocumentTemplateModel;
import org.eclipse.swt.widgets.Display;

//TODO : move me in another plugin
//TODO change me in the architecture
//TODO : String externalization will be done when this code will be in the good plugin
public class CreateDocumentEditorCommand implements ICreateDocumentTemplateEditorCommand {

	/**
	 * Prompts the user the future document's name
	 *
	 * @return The name, or <code>null</code> if the user cancelled the creation
	 */
	public String askName(final ViewPrototype prototype, final EObject semanticContext) {
		final String defaultName = "New" + prototype.getLabel().replace(" ", "");

		final String nameWithIncrement = EditorNameInitializer.getNameWithIncrement(DocumentStructureTemplatePackage.eINSTANCE.getTextDocumentTemplate(), DocumentStructureTemplatePackage.eINSTANCE.getDocumentTemplate_Name(), defaultName, semanticContext);

		final InputDialog dialog = new InputDialog(Display.getCurrent().getActiveShell(), "Papyrus Document Creation", "Enter the name for the new document", nameWithIncrement, null);
		if (dialog.open() == Window.OK) {
			return dialog.getValue();
		}
		return null;
	}


	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.command.ICreateDocumentTemplateEditorCommand#execute(org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.viewpoint.PapyrusDocumentTemplateViewPrototype,
	 *      org.eclipse.emf.ecore.EObject, java.lang.String)
	 *
	 * @param prototype
	 * @param semanticContext
	 * @param name
	 * @return
	 */
	@Override
	public boolean execute(final PapyrusDocumentTemplateViewPrototype prototype, final EObject semanticContext, final String name) {
		PapyrusRepresentationKind representation = prototype.getRepresentationKind();
		PapyrusDocumentPrototype docProto = null;
		if (representation instanceof PapyrusDocumentPrototype) {
			docProto = (PapyrusDocumentPrototype) representation;
		} else {
			// TODO : log error
			return false;
		}

		final DocumentTemplatePrototype docTemplateProto = docProto.getDocumentTemplatePrototype();
		final String documentName = askName(prototype, semanticContext);

		final EStructuralFeature nameFeature = semanticContext.eClass().getEStructuralFeature("name"); // TODO use a label provider for that
		final String elementName = (String) semanticContext.eGet(nameFeature);

		final Resource res = semanticContext.eResource();
		final URI semanticURI = res.getURI();
		if (semanticURI.isPlatformPlugin()) {
			System.out.println("Documentation for Platform resource is not yet supported");
			return false;
		}

		try {
			final ServicesRegistry serviceRegistry = ServiceUtilsForEObject.getInstance().getServiceRegistry(semanticContext);
			final TransactionalEditingDomain domain = ServiceUtils.getInstance().getTransactionalEditingDomain(serviceRegistry);
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					final DocumentTemplate template = docTemplateProto.getDocumentTemplate();
					final DocumentTemplate newInstance = EcoreUtil.copy(template);

					if (newInstance instanceof TextDocumentTemplate) {
						((TextDocumentTemplate) newInstance).setMainTitle(elementName);
					}

					newInstance.setDocumentTemplatePrototype(docTemplateProto);
					newInstance.setGraphicalContext(semanticContext);
					newInstance.setSemanticContext(semanticContext);
					newInstance.setName(documentName);

					final IDocumentStructureGeneratorConfiguration generator = newInstance.getDocumentStructureGeneratorConfiguration();
					if (null == generator) {
						// TODO : log warning when we will be in the good plugin
					}
					generator.setDocumentName(documentName);


					ModelSet modelSet = null;
					try {
						modelSet = ServiceUtils.getInstance().getModelSet(serviceRegistry);
					} catch (ServiceException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					DocumentTemplateModel model = null;
					try {
						model = (DocumentTemplateModel) modelSet.getModelChecked(DocumentTemplateModel.DOCUMENT_MODEL_ID);
					} catch (NotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					model.addDocument(newInstance);

					IPageManager pageMngr = null;
					try {
						pageMngr = ServiceUtils.getInstance().getService(IPageManager.class, serviceRegistry);
					} catch (ServiceException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// add the new editor model to the sash.
					pageMngr.openPage(newInstance);
					// try {
					// String documentKind = ((PapyrusDocument) prototype.getRepresentationKind()).getDocumentKind();
					// String documentRepresentationKindId = prototype.getRepresentationKind().getId();
					// createDocumentViewEditor(serviceRegistry, documentName, documentFileName, documentKind, documentRepresentationKindId, semanticContext, this.description);
					// } catch (Exception e) {
					// // TODO
					// System.out.println(e);
					// // Activator.log.error(e);
					// }
				}

			});
			return true;
		} catch (Exception e) {
			// TODO
			System.out.println(e);
			// Activator.log.error(e);
			return false;
		}

	};


}
