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
package org.eclipse.papyrus.model2doc.emf.structure2document.internal.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.model2doc.core.status.GenerationStatus;
import org.eclipse.papyrus.model2doc.core.status.GenerationStatusDialogHelper;
import org.eclipse.papyrus.model2doc.core.status.IGenerationStatus;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.IStructure2DocumentGenerator;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.Structure2DocumentRegistry;
import org.eclipse.papyrus.model2doc.emf.structure2document.internal.menu.MenuConstants;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * This handler is in charge to generate the final document from a {@link Document}
 */
public class GenerateDocumentFileHandler extends AbstractHandler {

	/**
	 * the selected document
	 */
	private Document selectedDocument;

	/**
	 * the generator to use to generate the final document
	 */
	private IStructure2DocumentGenerator generator;

	/**
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IGenerationStatus status = generate();
		GenerationStatusDialogHelper.INSTANCE.openMessageDialog(status);
		return status;
	}

	/**
	 *
	 * @return
	 *         the status of the generation
	 */
	protected IGenerationStatus generate() {
		final Object result = this.generator.generate(this.selectedDocument);
		IGenerationStatus status = new GenerationStatus(IStatus.OK, org.eclipse.papyrus.model2doc.emf.structure2document.Activator.PLUGIN_ID, "The file has been generated."); //$NON-NLS-1$
		status.setResult(result);
		return status;
	}

	/**
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public final void setEnabled(Object evaluationContext) {
		setBaseEnabled(computeEnable(evaluationContext));
	}

	protected boolean computeEnable(Object evaluationContext) {
		this.selectedDocument = getSelectedDocument();
		boolean enabled = this.selectedDocument != null;

		if (enabled) {
			this.generator = Structure2DocumentRegistry.INSTANCE.getGenerator(this.selectedDocument);
			// we check the declared generator support the selected document
			enabled = this.generator.handles(this.selectedDocument);
		}

		if (enabled && evaluationContext instanceof IEvaluationContext) {
			final IEvaluationContext iEvaluationContext = (IEvaluationContext) evaluationContext;
			iEvaluationContext.addVariable(MenuConstants.VARIABLE_GENERATOR_MENU_LABEL, this.generator.getEditorLabel());
		} else {
			enabled = false;
			this.selectedDocument = null;
			this.generator = null;
			if (evaluationContext instanceof IEvaluationContext) {
				final IEvaluationContext iEvaluationContext = (IEvaluationContext) evaluationContext;
				iEvaluationContext.addVariable(MenuConstants.VARIABLE_GENERATOR_MENU_LABEL, MenuConstants.NO_GENERATOR_ID);
			}
		}
		return enabled;
	}

	/**
	 *
	 * @return
	 *         the first selected document template
	 */
	private Document getSelectedDocument() {
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
		if (firstSelectedElement instanceof Document) {
			return (Document) firstSelectedElement;
		}

		return null;
	}
}
