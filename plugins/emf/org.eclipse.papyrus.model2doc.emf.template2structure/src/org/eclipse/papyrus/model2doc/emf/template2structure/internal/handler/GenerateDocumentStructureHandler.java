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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Properties;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructure.edit.validators.StringVersionValidator;
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
	 * The title of the Dialog
	 */
	private static final String DIALOG_TITLE = "Papyrus-Model2Doc"; //$NON-NLS-1$

	/**
	 * the file extension of the property file
	 */
	private static final String PROPERTIES_FILE_EXTENSION = "versions"; //$NON-NLS-1$

	/**
	 * the name of the file used to save the version of the generated document
	 */
	private static final String VERSION_FILE_NAME = "LastGeneratedDocumentVersion"; //$NON-NLS-1$

	/**
	 * the command to execute
	 */
	private GenerateDocumentStructureCommand command;

	/**
	 * the editing domain
	 */
	private TransactionalEditingDomain domain;

	/**
	 * The selected document template used for the generation
	 */
	private DocumentTemplate selectedDocumentTemplate;

	private static final String MODEL2DOC_PREFERENCE_FOLDER_NAME = "model2doc"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final String previousVersion = getPreviousGeneratedVersion(this.selectedDocumentTemplate);
		final String dialogMessage;
		if (previousVersion == null || previousVersion.isEmpty()) {
			dialogMessage = Messages.GenerateDocumentStructureHandler_EnterTheDocumentVersion;
		} else {
			dialogMessage = NLS.bind(Messages.GenerateDocumentStructureHandler_EnterTheDocumentVersionWithLastVersion, previousVersion);
		}

		final InputDialog defineVersion = new InputDialog(Display.getDefault().getActiveShell(), DIALOG_TITLE, dialogMessage, "", new StringVersionValidator()); //$NON-NLS-1$
		if (IDialogConstants.OK_ID != defineVersion.open()) {
			return null;
		}

		final String version = defineVersion.getValue();
		if (null != version && false == version.isEmpty()) {
			this.command.setVersion(defineVersion.getValue());
		}
		if (null != this.domain && null != this.command && this.command.canExecute()) {
			domain.getCommandStack().execute(this.command);
			// save last generated version for this document template
			saveLastGeneratedDocumentVersion(this.selectedDocumentTemplate, version);
		}


		// we refresg the workspace
		refreshProjects();

		// we open a dialog at the end of the generation
		MessageDialog.openInformation(Display.getDefault().getActiveShell(), DIALOG_TITLE, Messages.GenerateDocumentStructureHandler_TheGenerationOfDocumentStructureIsFinished); // $NON-NLS-1$

		resetFields();

		return null;
	}

	/**
	 *
	 * @return
	 *         the previous generated version for the current DocumentTemplate or the empty string if it is the first generation;
	 */
	private String getPreviousGeneratedVersion(final DocumentTemplate docTemplate) {
		final String xmiID = getXMI_ID(docTemplate);
		if (null == xmiID) {
			return ""; //$NON-NLS-1$
		}
		final File f = getVersionFile();
		String lastVersion = ""; //$NON-NLS-1$
		try (InputStream input = new FileInputStream(f)) {
			Properties prop = new Properties();
			prop.load(input);
			// set the properties value
			lastVersion = prop.getProperty(xmiID);
			input.close();

		} catch (IOException io) {
			io.printStackTrace();
		}

		return lastVersion;
	}

	/**
	 *
	 * @param docTemplate
	 *            a document template
	 * @param version
	 *            the version of the document for the current generation
	 */
	private void saveLastGeneratedDocumentVersion(final DocumentTemplate docTemplate, final String version) {
		final String xmiID = getXMI_ID(docTemplate);
		if (null == xmiID) {
			return;
		}
		final File f = getVersionFile();
		try (OutputStream output = new FileOutputStream(f)) {
			Properties prop = new Properties();
			// set the properties value
			prop.setProperty(xmiID, version);

			// save properties to project root folder
			prop.store(output, null);
			output.close();
		} catch (IOException io) {
			Activator.log.error(io);
		}

	}

	/**
	 *
	 * @param eobject
	 *            an EObject
	 * @return
	 *         the XMI_ID of this object
	 */
	private String getXMI_ID(final EObject eobject) {
		if (eobject.eResource() instanceof XMIResource) {
			return ((XMIResource) eobject.eResource()).getID(eobject);
		}
		return null;
	}

	/**
	 *
	 * @return
	 *         the file used to save the last version number of the generated document
	 */
	private File getVersionFile() {
		IPath preferencePath = Activator.getDefault().getStateLocation();
		preferencePath.append(MODEL2DOC_PREFERENCE_FOLDER_NAME);

		// create folders if required
		final File folder = preferencePath.toFile();
		if (false == folder.exists()) {
			folder.mkdirs();
		}
		preferencePath = preferencePath.append(VERSION_FILE_NAME).addFileExtension(PROPERTIES_FILE_EXTENSION);
		final File f = preferencePath.toFile();
		if (false == f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return f;
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
