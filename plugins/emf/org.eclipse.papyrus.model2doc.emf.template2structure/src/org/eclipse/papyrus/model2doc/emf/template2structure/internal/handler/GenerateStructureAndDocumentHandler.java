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
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.handler;

import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
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
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.IStructure2DocumentGenerator;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.Structure2DocumentRegistry;
import org.eclipse.papyrus.model2doc.emf.template2structure.command.Template2StructureCommandFactory;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.Template2StructureRegistry;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.menu.MenuConstants;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.messages.Messages;
import org.eclipse.papyrus.model2doc.emf.template2structure.utils.GenerateDocumentStructureUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * This handler allows to generate the document structure and the final document in one step
 */
public class GenerateStructureAndDocumentHandler extends AbstractHandler {

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
			final IStructure2DocumentGenerator generator = Structure2DocumentRegistry.INSTANCE.getGenerator(textDocument);
			if (generator.handles(textDocument)) {
				generator.generate(textDocument);
			} else {
				MessageDialog.openError(Display.getCurrent().getActiveShell(), Messages.GenerateStructureAndDocumentHandler_GenerateAllActions, Messages.GenerateStructureAndDocumentHandler_GenerationNotSupportedErrorMessage);
			}

			// open a dialog add the end of the generation
			MessageDialog.openInformation(Display.getDefault().getActiveShell(), GenerateDocumentStructureUtils.DIALOG_TITLE, "The DocumentStructure and the ODT file have been successfully generated."); //$NON-NLS-1$
		} else {
			MessageDialog.openError(Display.getCurrent().getActiveShell(), Messages.GenerateStructureAndDocumentHandler_GenerateAllActions, Messages.GenerateStructureAndDocumentHandler_TheDocumentStructureHasNotBeenGeneratedError);
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
		initFields();
		boolean enable = null != this.domain && null != this.command && this.command.canExecute();

		String menuLabel = MenuConstants.NO_GENERATOR_ID;
		if (enable) {
			enable = false;
			final String s2docId = this.selectedDocumentTemplate.getDocumentStructureGeneratorConfiguration().getDocumentGeneratorId();
			if (s2docId != null) {
				final IStructure2DocumentGenerator s2docGenerator = Structure2DocumentRegistry.INSTANCE.getGenerator(s2docId);
				final ITemplate2StructureGenerator t2sGenerator = Template2StructureRegistry.INSTANCE.getGenerator(this.selectedDocumentTemplate);
				if (s2docGenerator != null && t2sGenerator != null) {
					final StringBuilder builder = new StringBuilder();
					builder.append(t2sGenerator.getGenerateMenuLabel());
					builder.append(Messages.GenerateStructureAndDocumentHandler_PlusSymbole);
					builder.append(s2docGenerator.getGenerateMenuLabel());
					menuLabel = builder.toString();
					enable = true;
				}
			}
		}
		if (evaluationContext instanceof IEvaluationContext) {
			final IEvaluationContext iEvaluationContext = (IEvaluationContext) evaluationContext;
			iEvaluationContext.addVariable(MenuConstants.VARIABLE_GENERATOR_MENU_LABEL, menuLabel);
		}
		setBaseEnabled(enable);
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
