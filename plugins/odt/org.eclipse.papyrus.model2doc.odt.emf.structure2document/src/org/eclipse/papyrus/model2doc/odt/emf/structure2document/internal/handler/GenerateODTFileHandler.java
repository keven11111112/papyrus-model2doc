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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *    Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Bug 548896
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
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
public class GenerateODTFileHandler extends AbstractHandler {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final TextDocument docTemplate = getSelectedTextDocument();
		if (null != docTemplate) {
			GenerateODTFileUtils.generateODTFile(docTemplate);

			// open a dialog add the end of the generation
			MessageDialog.openInformation(Display.getDefault().getActiveShell(), GenerateDocumentStructureUtils.DIALOG_TITLE, "The odt file has been generated."); //$NON-NLS-1$
		}

		return null;
	}




	// TODO : duplicated from GenerateDocumentStructureHandler
	// TODO : check it is a TextDocumentStructure

	/**
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		// super.setEnabled(evaluationContext);
		// if (isEnabled()) {
		setBaseEnabled(null != getSelectedTextDocument());
		// }
	}


	/**
	 *
	 * @return
	 *         the first selected document template
	 */
	private TextDocument getSelectedTextDocument() {
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
		if (firstSelectedElement instanceof TextDocument) {
			return (TextDocument) firstSelectedElement;
		}

		return null;
	}
}
