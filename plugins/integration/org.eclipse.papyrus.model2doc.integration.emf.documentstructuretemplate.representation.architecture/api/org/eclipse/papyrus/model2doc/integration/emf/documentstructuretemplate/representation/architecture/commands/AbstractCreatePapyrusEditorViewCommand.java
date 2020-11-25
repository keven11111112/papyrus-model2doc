/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.architecture.commands;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.architecture.Activator;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.modelresource.DocumentTemplateModel;

/**
 * Abstract Command allowing to create a {@link DocumentTemplate}
 */
public abstract class AbstractCreatePapyrusEditorViewCommand<T extends EObject> extends RecordingCommand {

	/**
	 * the semantic context of the created view
	 */
	protected final EObject semanticContext;

	/**
	 * the graphical context of the created view
	 */
	protected final EObject graphicalContext;

	/**
	 * if <code>true</code>, we open the created editor after the creation
	 */
	protected final boolean openAfterCreation;

	/**
	 * the editor name
	 */
	protected final String editorViewName;

	/**
	 * The created editor view
	 */
	protected T createdEditorView;

	/**
	 *
	 * Constructor.
	 *
	 * @param domain
	 *            the editing domain in which the command will be executed
	 * @param label
	 *            the label of the command
	 * @param editorViewName
	 *            the name of the created editor representation
	 * @param semanticContext
	 *            the semantic context for the created editor view
	 * @param graphicalContext
	 *            the graphical context for the editor (used to display it in the ModelExplorer)
	 * @param openAfterCreation
	 *            if <code>true</code> the created editor will be opened after its creation
	 */
	public AbstractCreatePapyrusEditorViewCommand(final TransactionalEditingDomain domain, final String label, final String editorViewName, final EObject semanticContext, final EObject graphicalContext, final boolean openAfterCreation) {
		super(domain, label);
		this.semanticContext = semanticContext;
		this.graphicalContext = graphicalContext != null ? graphicalContext : semanticContext;
		this.openAfterCreation = openAfterCreation;
		this.editorViewName = editorViewName;
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param domain
	 *            the editing domain in which the command will be executed
	 * @param label
	 *            the label of the command
	 * @param editorViewName
	 *            the name of the created editor representation
	 * @param semanticContext
	 *            the semantic context for the created editor view
	 * @param openAfterCreation
	 *            if <code>true</code> the created editor will be opened after its creation
	 */
	public AbstractCreatePapyrusEditorViewCommand(final TransactionalEditingDomain domain, final String label, final String editorViewName, final EObject semanticContext, final boolean openAfterCreation) {
		this(domain, label, editorViewName, semanticContext, null, openAfterCreation);
	}


	/**
	 *
	 * @return
	 *         the created editor view
	 */
	public final T getCreatedEditorView() {
		return this.createdEditorView;
	}

	/**
	 *
	 * @param modelElement
	 *            an element of the edited model
	 * @param docTemplate
	 *            the document template to save
	 */
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
	 * @param modelElement
	 *            an element of the edited model
	 * @return
	 *         the service registry or <code>null</code> if not found
	 */
	protected final ServicesRegistry getServiceRegistry(final EObject modelElement) {
		try {
			return ServiceUtilsForEObject.getInstance().getServiceRegistry(modelElement);
		} catch (ServiceException e) {
			Activator.log.error("ServicesRegistry not found", e); //$NON-NLS-1$
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

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#getResult()
	 *
	 * @return
	 */
	@Override
	public Collection<?> getResult() {
		if (this.createdEditorView != null) {
			return Collections.singleton(this.createdEditorView);
		}
		return Collections.emptyList();
	}
}
