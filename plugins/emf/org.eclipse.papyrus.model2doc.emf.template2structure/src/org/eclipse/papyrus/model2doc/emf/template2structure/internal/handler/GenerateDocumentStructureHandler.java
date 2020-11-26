/*****************************************************************************
 * Copyright (c) 2019, 2020 CEA LIST and others.
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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Bug 569252
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.model2doc.core.status.GenerationStatusDialogHelper;
import org.eclipse.papyrus.model2doc.core.status.IGenerationStatus;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.Template2StructureGeneratorWrapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.helpers.DocumentStructureVersionHelper;
import org.eclipse.papyrus.model2doc.emf.template2structure.helpers.DocumentStructureVersionUIHelper;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Handler use to create a document structure from a document structure template
 */
public class GenerateDocumentStructureHandler extends AbstractHandler {

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
		final DocumentStructureVersionHelper versionHelper = new DocumentStructureVersionUIHelper(this.selectedDocumentTemplate);
		final Template2StructureGeneratorWrapper wrapper = new Template2StructureGeneratorWrapper(this.selectedDocumentTemplate, versionHelper);
		final IGenerationStatus status = wrapper.generateDocumentStructure();
		GenerationStatusDialogHelper.INSTANCE.openMessageDialog(status);
		return status;
	}

	/**
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		super.setEnabled(evaluationContext);
		this.selectedDocumentTemplate = getSelectedDocumentTemplate();
		if (isEnabled()) {
			setBaseEnabled(this.selectedDocumentTemplate != null);
		}
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
