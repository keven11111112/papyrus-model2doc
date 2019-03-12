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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.architecture.representation.PapyrusRepresentationKind;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.command.ICreateDocumentTemplateEditorCommand;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.viewpoint.PapyrusDocumentTemplateViewPrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.modelresource.DocumentTemplateModel;

//TODO : move me in another plugin
//TODO change me in the architecture
public class CreateDocumentEditorCommand implements ICreateDocumentTemplateEditorCommand {


	// TODO : ask name before or durign the creation
	@Override
	public boolean execute(PapyrusDocumentTemplateViewPrototype prototype,
			EObject semanticContext, String name) {


		PapyrusRepresentationKind representation = prototype.getRepresentationKind();
		PapyrusDocumentPrototype docProto = null;
		if (representation instanceof PapyrusDocumentPrototype) {
			docProto = (PapyrusDocumentPrototype) representation;
		} else {
			// TODO : log error
			return false;
		}
		DocumentTemplatePrototype docTemplateProto = docProto.getDocumentTemplatePrototype();

		// TODO add validation rule and ensure, not null;





		// return true;


		// name = name != null ? name : askName(context, prototype);
		// if (name == null) {
		// return false;
		// }
		//
		// StringBuilder documentFileNameBuilder = new StringBuilder();
		// String prefixName = getPrefixName(context);
		// documentFileNameBuilder.append(prefixName);
		// documentFileNameBuilder.append("_"); //$NON-NLS-1$
		// documentFileNameBuilder.append(name);
		//
		// final String documentFileName = documentFileNameBuilder.toString();
		final String documentName = name;
		try {
			final ServicesRegistry serviceRegistry = ServiceUtilsForEObject.getInstance().getServiceRegistry(semanticContext);
			final TransactionalEditingDomain domain = ServiceUtils.getInstance().getTransactionalEditingDomain(serviceRegistry);
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					final DocumentTemplate template = docTemplateProto.getDocumentTemplate();
					final DocumentTemplate newInstance = EcoreUtil.copy(template);

					newInstance.setDocumentTemplatePrototype(docTemplateProto);
					newInstance.setGraphicalContext(semanticContext);
					newInstance.setSemanticContext(semanticContext);

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
