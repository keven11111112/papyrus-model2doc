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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Bug 548896
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.handler;

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
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.command.Template2StructureCommandFactory;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.messages.Messages;
import org.eclipse.papyrus.model2doc.emf.template2structure.utils.GenerateDocumentStructureUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Handler use to create a document structure from a document structure template
 */
public class GenerateDocumentStructureHandler extends AbstractHandler {

	/**
	 * the command to execute
	 */
	private Command command;

	/**
	 * the editing domain
	 */
	private TransactionalEditingDomain domain;

	/**
	 * The selected document template used for the generation
	 */
	private DocumentTemplate selectedDocumentTemplate;

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Collection<?> result = GenerateDocumentStructureUtils.generateDocumentStructure(domain, command, selectedDocumentTemplate);

		// we open a dialog at the end of the generation
		MessageDialog.openInformation(Display.getDefault().getActiveShell(), GenerateDocumentStructureUtils.DIALOG_TITLE, Messages.GenerateDocumentStructureHandler_TheGenerationOfDocumentStructureIsFinished); // $NON-NLS-1$

		resetFields();

		return result;
	}

	/**
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
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
	 * calculate the value of editing domain and command
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
	 * reset the editing domain and the command to <code>null</code>
	 */
	private void resetFields() {
		this.domain = null;
		this.command = null;
		this.selectedDocumentTemplate = null;
	}

	/**
	 *
	 * @return
	 *         the first selected document template
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
}
