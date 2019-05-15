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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.command.GenerateDocumentStructureCommand;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.messages.Messages;
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
		if (null != this.domain && null != this.command && this.command.canExecute()) {
			domain.getCommandStack().execute(this.command);
		}

		// we refresg the workspace
		refreshProjects();

		// we open a dialog at the end of the generation
		MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Papyrus-Model2Doc", Messages.GenerateDocumentStructureHandler_GenerationIsFinished); //$NON-NLS-1$

		resetFields();

		return null;
	}

	/**
	 * This method refresh the project concerned by the DocumentStructure generation
	 *
	 */
	private void refreshProjects() {
		final Collection<String> projectsToRefresh = GeneratorConfigurationOperations.getWorkspaceProjectToRefresh(this.selectedDocumentTemplate.getDocumentStructureGeneratorConfiguration());
		for (final String current : projectsToRefresh) {
			final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(current);
			if (null != project) {
				try {
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					Activator.log.error(NLS.bind("An exception occurred refresh the project {0}", current), e); //$NON-NLS-1$
				}
			}
		}
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
		this.command = new GenerateDocumentStructureCommand(domain, this.selectedDocumentTemplate);
	}

	/**
	 * resset the editing domain and the command to <code>null</code>
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
