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
 *   Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructure.edit.validators.StringVersionValidator;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.command.GenerateDocumentStructureCommand;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.messages.Messages;
import org.eclipse.swt.widgets.Display;

/**
 * This allows to manage utility methods and functions for the generation of document structure.
 */
public class GenerateDocumentStructureUtils {

	/**
	 * The title of the Dialog.
	 */
	public static final String DIALOG_TITLE = "Papyrus-Model2Doc"; //$NON-NLS-1$

	/**
	 * The file extension of the property file.
	 */
	private static final String PROPERTIES_FILE_EXTENSION = "versions"; //$NON-NLS-1$

	/**
	 * The name of the file used to save the version of the generated document.
	 */
	private static final String VERSION_FILE_NAME = "LastGeneratedDocumentVersion"; //$NON-NLS-1$

	/**
	 * The model2doc folder name (to be created in the preferences).
	 */
	private static final String MODEL2DOC_PREFERENCE_FOLDER_NAME = "model2doc"; //$NON-NLS-1$

	/**
	 * This allows to generate the document structure from a document template.
	 *
	 * @param domain
	 *            The transactional editing domain.
	 * @param command
	 *            The command to execute to create the document template
	 * @param documentTemplate
	 *            The document template.
	 * @return The result of the command.
	 */
	public static Collection<?> generateDocumentStructure(final TransactionalEditingDomain domain, final Command command, final DocumentTemplate documentTemplate) {
		if (null == documentTemplate) {
			return null;
		}

		final String previousVersion = getPreviousGeneratedVersion(documentTemplate);
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

		return generateDocumentStructure(domain, command, documentTemplate, defineVersion.getValue());
	}

	/**
	 * This allows to generate the document structure from a document template for a specific version.
	 *
	 * @param domain
	 *            The transactional editing domain.
	 * @param command
	 *            The command to execute to create the document template
	 * @param documentTemplate
	 *            The document template.
	 * @param version
	 *            The version of the document to generate.
	 * @return The result of the command.
	 */
	public static Collection<?> generateDocumentStructure(final TransactionalEditingDomain domain, final Command command, final DocumentTemplate documentTemplate, final String version) {
		if (null == documentTemplate) {
			return null;
		}

		// The result document if created
		Collection<?> result = null;

		if (null != version && false == version.isEmpty() && command instanceof GenerateDocumentStructureCommand) {
			((GenerateDocumentStructureCommand) command).setVersion(version);
		}
		if (null != domain && null != command && command.canExecute()) {
			domain.getCommandStack().execute(command);
			// save last generated version for this document template
			saveLastGeneratedDocumentVersion(documentTemplate, version);
			result = command.getResult();

			// we refresh the workspace
			refreshProjects(documentTemplate);
		}

		return result;
	}

	/**
	 * Get the previous generated version.
	 *
	 * @return
	 *         The previous generated version for the current DocumentTemplate or the empty string if it is the first generation.
	 */
	private static String getPreviousGeneratedVersion(final DocumentTemplate docTemplate) {
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
	 * This allows to save the version of the last generation.
	 *
	 * @param docTemplate
	 *            A document template.
	 * @param version
	 *            The version of the document for the current generation.
	 */
	private static void saveLastGeneratedDocumentVersion(final DocumentTemplate docTemplate, final String version) {
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
	 * Get the xmi:id of an EObject.
	 *
	 * @param eobject
	 *            An EObject.
	 * @return
	 *         The XMI_ID of this object.
	 */
	private static String getXMI_ID(final EObject eobject) {
		if (eobject.eResource() instanceof XMIResource) {
			return ((XMIResource) eobject.eResource()).getID(eobject);
		}
		return null;
	}

	/**
	 * Get the version of the file.
	 *
	 * @return
	 *         The file used to save the last version number of the generated document.
	 */
	private static File getVersionFile() {
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
	 * This method refresh the project concerned by the DocumentStructure generation.
	 */
	private static void refreshProjects(final DocumentTemplate documentTemplate) {
		final Collection<String> projectsToRefresh = GeneratorConfigurationOperations.getWorkspaceProjectToRefresh(documentTemplate.getDocumentStructureGeneratorConfiguration());
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

}
