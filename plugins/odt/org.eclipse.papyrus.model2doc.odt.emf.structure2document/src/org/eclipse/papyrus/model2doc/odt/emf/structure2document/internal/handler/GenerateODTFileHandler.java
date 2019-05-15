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
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.odt.emf.structure2document.Activator;
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
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO : check it is a TextDocumentTemplate
		final TextDocument docTemplate = getSelectedTextDocument();
		CreateODTFileFromTextDocumentHelper helper = new CreateODTFileFromTextDocumentHelper(docTemplate);
		helper.generate();


		// refresh workspace
		String path = GeneratorConfigurationOperations.getDocumentFileLocalPath(docTemplate.getDocumentGeneratorConfiguration(), "odt"); //$NON-NLS-1$
		final java.net.URI worskpaceURI = ResourcesPlugin.getWorkspace().getRoot().getLocationURI();
		if (path.startsWith(worskpaceURI.toString())) {
			final String result = path.replaceFirst(worskpaceURI.toString(), ""); //$NON-NLS-1$
			if (null != result && false == result.isEmpty()) {
				final String projectName = org.eclipse.emf.common.util.URI.createURI(result).segment(0);
				final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				if (null != project) {
					try {
						// refresh project
						project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
					} catch (CoreException e) {
						Activator.log.error(NLS.bind("An exception occured during the refresh of the project {0}", projectName), e); //$NON-NLS-1$
					}
				}

			}
		}

		// open a dialog add the end of the generation
		MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Papyrus-Model2Doc", "The odt file has been generated."); //$NON-NLS-1$ //$NON-NLS-2$
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
