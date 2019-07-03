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
 *    Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.handler;

import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.command.Template2StructureCommandFactory;
import org.eclipse.papyrus.model2doc.emf.template2structure.utils.GenerateDocumentStructureUtils;
import org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.utils.GenerateODTFileUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * This handler allows to generate the LibreOffice odt file from a DocumentStructure
 */
public class GenerateDocumentStructureAndODTFileHandler extends AbstractHandler {

	/**
	 * The command to execute.
	 */
	private Command command;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomain domain;

	/**
	 * The selected document template used for the generation
	 */
	private DocumentTemplate selectedDocumentTemplate;

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		// Execute the super command
		final Collection<?> superResult = GenerateDocumentStructureUtils.generateDocumentStructure(domain, command, selectedDocumentTemplate);

		// Get the Text document from the super execution
		final TextDocument textDocument = getTextDocument(superResult);
		if (null != textDocument) {
			GenerateODTFileUtils.generateODTFile(textDocument);

			// open a dialog add the end of the generation
			MessageDialog.openInformation(Display.getDefault().getActiveShell(), GenerateDocumentStructureUtils.DIALOG_TITLE, "The DocumentStructure and the ODT file have been successfully generated."); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * This re-implementation allows to define the selected document template.
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		super.setEnabled(evaluationContext);
		if (isEnabled()) {
			initFields();
			setBaseEnabled(null != this.domain && null != this.command && this.command.canExecute());
		}
	}

	/**
	 * This allows to calculate the value of editing domain and command.
	 */
	private void initFields() {
		resetFields();// to be sure
		this.selectedDocumentTemplate = getSelectedDocumentTemplate();
		if (null == this.selectedDocumentTemplate) {
			return;
		}
		this.domain = TransactionUtil.getEditingDomain(this.selectedDocumentTemplate);
		if (null == domain) {
			return;
		}
		this.command = Template2StructureCommandFactory.eINSTANCE.getGenerateDocumentStructureCommand(domain, this.selectedDocumentTemplate);
	}

	/**
	 * This allows to reset the editing domain and the command to <code>null</code>.
	 */
	private void resetFields() {
		this.domain = null;
		this.command = null;
		this.selectedDocumentTemplate = null;
	}

	/**
	 * Get the selected document template.
	 *
	 * @return
	 *         The first selected document template.
	 */
	private DocumentTemplate getSelectedDocumentTemplate() {
		Object firstSelectedElement = null;
		final IWorkbench wb = PlatformUI.getWorkbench();
		if (null != wb) {
			final IWorkbenchWindow wW = wb.getActiveWorkbenchWindow();
			if (null != wW) {
				final ISelectionService ss = wW.getSelectionService();
				if (null != ss) {
					final ISelection selection = ss.getSelection();
					if (selection instanceof IStructuredSelection && false == selection.isEmpty()) {
						firstSelectedElement = ((IStructuredSelection) selection).getFirstElement();
					}
				}
			}
		}
		if (firstSelectedElement instanceof IAdaptable) {
			firstSelectedElement = ((IAdaptable) firstSelectedElement).getAdapter(EObject.class);
		}
		if (firstSelectedElement instanceof DocumentTemplate) {
			return (DocumentTemplate) firstSelectedElement;
		}

		return null;
	}

	/**
	 * Get the text document generated by the first generation (generation of document structure).
	 *
	 * @param result
	 *            The result of first generation.
	 * @return The TextDocument if exists, else <code>null</code>.
	 */
	private TextDocument getTextDocument(final Object result) {
		if (result instanceof Collection<?>) {
			return ((Collection<?>) result).stream().filter(TextDocument.class::isInstance).map(TextDocument.class::cast).findFirst().orElse(null);
		} else if (result instanceof TextDocument) {
			return (TextDocument) result;
		}
		return null;
	}

}
