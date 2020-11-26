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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Bug 569252
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2document.internal.handler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.model2doc.core.status.GenerationStatusDialogHelper;
import org.eclipse.papyrus.model2doc.core.status.IGenerationStatus;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2document.internal.generators.Template2DocumentGeneratorUI;
import org.eclipse.papyrus.model2doc.emf.template2document.internal.menu.Template2DocumentMenuConstants;
import org.eclipse.papyrus.model2doc.emf.template2document.internal.messages.Messages;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * This handler allows to generate the document structure and the final document in one step
 */
public class GenerateStructureAndDocumentHandler extends AbstractHandler {

	/**
	 * the generator used to create the final document from the template
	 */
	private Template2DocumentGeneratorUI generator = null;

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
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
		final IGenerationStatus resultStatus = this.generator.generate();
		return resultStatus;
	}

	/**
	 * {@inheritDoc}
	 * This re-implementation allows to define the selected document template.
	 * This method can't be overrided, use {@link #computeEnable(Object)} instead
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 */
	@Override
	public final void setEnabled(final Object evaluationContext) {
		setBaseEnabled(computeEnable(evaluationContext));
	}

	/**
	 *
	 * @param evaluationContext
	 *            the evaluation context
	 * @return
	 *         <code>true</code> if the handler can be enable and false otherwise
	 *         + build the name of the action provided in the contextual menu
	 */
	protected boolean computeEnable(final Object evaluationContext) {
		final DocumentTemplate template = getSelectedDocumentTemplate();
		String menuLabel = Template2DocumentMenuConstants.NO_GENERATOR_ID;
		boolean enable = template != null;
		if (enable) {
			this.generator = new Template2DocumentGeneratorUI(template);
			// we create the name of the menu
			if (enable && evaluationContext instanceof IEvaluationContext) {
				final List<String> labels = new ArrayList<>();
				labels.add(this.generator.getTemplate2StructureGeneratorMenuLabel());
				labels.add(this.generator.getStructure2DocumentGeneratorMenuLabel());
				menuLabel = createMenuLabel(labels);
			}
		}
		if (evaluationContext instanceof IEvaluationContext) {
			final IEvaluationContext iEvaluationContext = (IEvaluationContext) evaluationContext;
			iEvaluationContext.addVariable(Template2DocumentMenuConstants.VARIABLE_GENERATOR_MENU_LABEL, menuLabel);
		}

		return enable;
	}

	/**
	 *
	 * @param labels
	 *            the labels of the menu
	 * @return
	 *         the created labels to use by the menu using the handler
	 */
	protected String createMenuLabel(final List<String> labels) {
		final StringBuilder builder = new StringBuilder();
		final Iterator<String> iter = labels.iterator();
		while (iter.hasNext()) {
			builder.append(iter.next());
			if (iter.hasNext()) {
				builder.append(Messages.GenerateStructureAndDocumentHandler_PlusSymbole);
			}
		}
		return builder.toString();
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

}
