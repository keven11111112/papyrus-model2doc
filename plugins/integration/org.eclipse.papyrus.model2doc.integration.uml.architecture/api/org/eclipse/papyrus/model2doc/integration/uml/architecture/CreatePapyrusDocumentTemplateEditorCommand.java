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

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.emf.ui.providers.labelproviders.DelegatingToEMFLabelProvider;
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
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.command.ICreateDocumentTemplateEditorCommand;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.viewpoint.PapyrusDocumentTemplateViewPrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.modelresource.DocumentTemplateModel;
import org.eclipse.papyrus.model2doc.integration.uml.architecture.internal.messages.AbstractCreateDocumentTemplateEditorCommand;
import org.eclipse.papyrus.model2doc.integration.uml.architecture.internal.messages.Activator;
import org.eclipse.papyrus.model2doc.integration.uml.architecture.internal.messages.Messages;

/**
 * This class allows to create new DocumentTemplate instance and open the papyrus editor for it
 */
public final class CreatePapyrusDocumentTemplateEditorCommand extends AbstractCreateDocumentTemplateEditorCommand implements ICreateDocumentTemplateEditorCommand {

	/**
	 * Prompts the user the future document's name
	 *
	 * @return The name, or <code>null</code> if the user cancelled the creation
	 */
	private String askName(final ViewPrototype prototype, final EObject semanticContext) {
		final String defaultName = getDefaultName(prototype, semanticContext);
		return askDocumentName(Messages.CreatePapyrusDocumentTemplateEditorCommand_CreateDocumentTemplateDialogTitle, defaultName);
	}

	/**
	 *
	 * @param prototype
	 *            the ViewPrototype
	 * @param semanticContext
	 *            the semantic context for the created DocumentTemplate
	 * @return
	 *         the default name to use
	 */
	private String getDefaultName(final ViewPrototype prototype, final EObject semanticContext) {
		final StringBuilder nameBuilder = new StringBuilder("New"); //$NON-NLS-1$
		nameBuilder.append(prototype.getLabel().trim());
		final String nameWithIncrement = EditorNameInitializer.getNameWithIncrement(DocumentStructureTemplatePackage.eINSTANCE.getTextDocumentTemplate(), DocumentStructureTemplatePackage.eINSTANCE.getDocumentTemplate_Name(), nameBuilder.toString(),
				semanticContext);
		return nameWithIncrement;
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
		final PapyrusRepresentationKind representation = prototype.getRepresentationKind();
		Assert.isTrue(representation instanceof PapyrusDocumentPrototype, "The representation associated to the PapyrusDocumentTemplateViewPrototype must be an instanceof PapyrusDocumentPrototype."); //$NON-NLS-1$
		PapyrusDocumentPrototype docProto = (PapyrusDocumentPrototype) representation;
		final DocumentTemplatePrototype docTemplateProto = docProto.getDocumentTemplatePrototype();
		final String documentName = (name == null || name.isEmpty()) ? askName(prototype, semanticContext) : name;
		if (null == documentName) {
			return true; // the creation is cancelled
		}
		return super.execute(docTemplateProto, semanticContext, documentName);
	};


	/**
	 *
	 * @param modelElement
	 *            an element of the edited model
	 * @param docTemplate
	 *            the document template to save
	 */
	@Override
	protected final void attachToResource(final EObject modelElement, final DocumentTemplate docTemplate) {
		final ServicesRegistry sReg = getServiceRegistry(modelElement);
		if (sReg == null) {
			return;
		}
		final ModelSet modelSet = getModelSet(sReg);
		if (null == modelSet) {
			return;
		}

		DocumentTemplateModel model = null;
		try {
			model = (DocumentTemplateModel) modelSet.getModelChecked(DocumentTemplateModel.DOCUMENT_MODEL_ID);
		} catch (NotFoundException e) {
			Activator.log.error("DocumentTemplateModel not found", e); //$NON-NLS-1$
			return;
		}
		model.addDocument(docTemplate, modelElement);
	}

	/**
	 *
	 * @param semanticContext
	 *            the semantic context for the create DocumentTemplate
	 * @return
	 *         the label to use as main title for the generated document
	 */
	@Override
	protected final String getDocumentMainTitle(final EObject semanticContext) {
		return DelegatingToEMFLabelProvider.INSTANCE.getText(semanticContext);
	}

	/**
	 *
	 * @param modelElement
	 *            an element of the edited model
	 * @return
	 *         the service registry or <code>null</code> if not found
	 */
	private ServicesRegistry getServiceRegistry(final EObject modelElement) {
		try {
			return ServiceUtilsForEObject.getInstance().getServiceRegistry(modelElement);
		} catch (ServiceException e) {
			Activator.log.error("ServicesRegistry not found", e); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 *
	 * @param modelElement
	 *            an element of the edited model
	 * @return
	 *         the editing domain or <code>null</code> if not found
	 */
	@Override
	protected final TransactionalEditingDomain getEditingDomain(final EObject modelElement) {
		final ServicesRegistry servicesRegistry = getServiceRegistry(modelElement);
		if (null == servicesRegistry) {
			return null;
		}
		try {
			return ServiceUtils.getInstance().getTransactionalEditingDomain(servicesRegistry);
		} catch (ServiceException e) {
			Activator.log.error("EditingDomain not found", e); //$NON-NLS-1$
		}
		return null;
	}


	/**
	 *
	 * @param servicesRegistry
	 * @return
	 *         the ModelSet, or <code>null</code> if not found
	 */
	private ModelSet getModelSet(final ServicesRegistry servicesRegistry) {
		try {
			return ServiceUtils.getInstance().getModelSet(servicesRegistry);
		} catch (ServiceException e) {
			Activator.log.error("ModelSet not found", e); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 *
	 * @param servicesRegistry
	 *            the servicesRegistry
	 * @return
	 *         the page manager or <code>null</code> if not found
	 */
	private IPageManager getPageManager(final ServicesRegistry servicesRegistry) {
		try {
			return ServiceUtils.getInstance().getService(IPageManager.class, servicesRegistry);
		} catch (ServiceException e) {
			Activator.log.error("IPageManager not found", e); //$NON-NLS-1$
		}
		return null;

	}

	/**
	 * Open the editor for the document template
	 *
	 * @param template
	 *            the document template
	 */
	@Override
	protected final void openEditor(final DocumentTemplate template) {
		final ServicesRegistry sReg = getServiceRegistry(template.getSemanticContext());
		if (null == sReg) {
			return;
		}
		final IPageManager pageManager = getPageManager(sReg);
		if (null == pageManager) {
			return;
		}
		pageManager.openPage(template);
	}
}
