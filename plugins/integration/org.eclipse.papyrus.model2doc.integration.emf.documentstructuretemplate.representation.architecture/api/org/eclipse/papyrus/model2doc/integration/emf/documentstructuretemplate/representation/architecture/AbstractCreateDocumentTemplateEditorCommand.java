/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
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

package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.architecture;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.emf.ui.providers.labelproviders.DelegatingToEMFLabelProvider;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.eclipse.papyrus.model2doc.integration.architecture.internal.messages.Messages;
import org.eclipse.swt.widgets.Display;

/**
 * This class provides useful method to create a new DocumentTemplate and open its editor
 */
public abstract class AbstractCreateDocumentTemplateEditorCommand {

	/**
	 *
	 * @param dialogTitle
	 *            the dialog title
	 * @param proposedName
	 *            the proposed name
	 * @return
	 *         the name entered by the user, or <code>null</code> in case of cancel
	 */
	protected String askDocumentName(final String dialogTitle, final String proposedName) {
		final InputDialog dialog = new InputDialog(Display.getCurrent().getActiveShell(), dialogTitle, Messages.AbstractCreateDocumentTemplateEditorCommand_DialogMessage, proposedName, null);
		if (dialog.open() == Window.OK) {
			return dialog.getValue();
		}
		return null;
	}

	/**
	 *
	 * @param documentTemplatePrototype
	 *            the document template prototype
	 * @param semanticContext
	 *            the semantic context for the {@link DocumentTemplate} to create
	 * @param documentName
	 *            the name of the document to create
	 * @return
	 */
	protected boolean execute(final DocumentTemplatePrototype documentTemplatePrototype, final EObject semanticContext, final String documentName) {
		final Resource res = semanticContext.eResource();
		final URI semanticURI = res.getURI();
		if (semanticURI.isPlatformPlugin()) {
			Activator.log.error(new UnsupportedOperationException("Documentation for element stored as platform plugin is not yet supported")); //$NON-NLS-1$
			return false;
		}

		final TransactionalEditingDomain domain = getEditingDomain(semanticContext);
		if (null == domain) {
			return false;
		}
		domain.getCommandStack().execute(new RecordingCommand(domain, "Create new DocumentTemplate") { //$NON-NLS-1$

			@Override
			protected void doExecute() {
				final DocumentTemplate template = documentTemplatePrototype.getDocumentTemplate();
				final DocumentTemplate newInstance = EcoreUtil.copy(template);

				if (newInstance instanceof TextDocumentTemplate) {
					((TextDocumentTemplate) newInstance).setMainTitle(getDocumentMainTitle(semanticContext));
				}


				attachToResource(semanticContext, newInstance);

				final IDocumentStructureGeneratorConfiguration generator = newInstance.getDocumentStructureGeneratorConfiguration();
				if (null != generator) {
					generator.setDocumentName(documentName);
				}

				newInstance.setDocumentTemplatePrototype(documentTemplatePrototype);
				newInstance.setGraphicalContext(semanticContext);
				newInstance.setSemanticContext(semanticContext);
				newInstance.setName(documentName);

				openEditor(newInstance);
			}

		});
		return true;
	}


	/**
	 *
	 * @param semanticContext
	 *            the semantic context for the create DocumentTemplate
	 * @return
	 *         the label to use as main title for the generated document
	 */
	protected String getDocumentMainTitle(final EObject semanticContext) {
		return DelegatingToEMFLabelProvider.INSTANCE.getText(semanticContext);
	}


	/**
	 *
	 * @param modelElement
	 *            an element of the edited model
	 * @return
	 *         the editing domain or <code>null</code> if not found
	 */
	protected TransactionalEditingDomain getEditingDomain(final EObject modelElement) {
		return TransactionUtil.getEditingDomain(modelElement);
	}

	/**
	 *
	 * @param modelElement
	 *            an element of the edited model
	 * @param docTemplate
	 *            the document template to save
	 */
	protected abstract void attachToResource(final EObject modelElement, final DocumentTemplate docTemplate);


	/**
	 * Open the editor for the document template
	 *
	 * @param template
	 *            the document template
	 */
	protected abstract void openEditor(final DocumentTemplate template);
}
