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
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.odt.internal.util;

import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;

import org.eclipse.papyrus.model2doc.core.config.GeneratorConfig;
import org.eclipse.papyrus.model2doc.odt.Activator;

/**
 * Utility class for FILE I/O management dedicated to LibreOffice concerns.
 *
 */
public class ODTFileIOUtil {

	public static final String ODT_FILE_PREFIX = "file:///"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	private ODTFileIOUtil() {
		// to avoid instantiation
	}

	/**
	 * Convert file path to URL format.
	 * 
	 * @param filePath
	 *            the name of the ODT file to write
	 * @param outputFolder
	 *            the output folder
	 * @return the string formatted for LibreOffice to allow it to save the written
	 *         file
	 */
	public static String fileNameToURL(String filePath, String outputFolder) {
		IContainer container = null;
		int nbToken = new StringTokenizer(outputFolder, "/").countTokens(); //$NON-NLS-1$
		if (nbToken == 1) {// it is a project
			container = ResourcesPlugin.getWorkspace().getRoot().getProject(outputFolder);// only one /
		} else {// it is a folder in a project
			container = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(outputFolder));
		}
		outputFolder = container.getLocation().toString();
		StringBuilder sb = new StringBuilder(ODT_FILE_PREFIX); // $NON-NLS-1$
		sb.append(outputFolder);
		sb.append("/"); //$NON-NLS-1$
		sb.append(filePath);
		return sb.toString();
	}

	/**
	 * Convert template path for LibreOffice.
	 * 
	 * @param generatorConfig
	 *            the odt generator configuration
	 * @return the string formatted for LibreOffice to allow it to find the template
	 *         file
	 */
	public static String convertTemplatePathForLibreOffice(final GeneratorConfig generatorConfig) {
		String templatePath = generatorConfig.getTemplateStyleFileURI(); // $NON-NLS-1$
		if (templatePath == null || templatePath.isEmpty()) {
			return "";//$NON-NLS-1$
		}

		// Verify if the selected template is by default or from user project
		if (generatorConfig.getTemplateStyleFileURI().startsWith(generatorConfig.getProject())) {
			// If the selected template is from user project than updating path
			templatePath = updatePathOfFileInWorkspace(templatePath);
		} else {
			// If the selected template is by default
			templatePath = generatorConfig.getTemplateStyleFileURI();
		}

		StringBuilder sb = new StringBuilder(ODT_FILE_PREFIX);
		sb.append(templatePath);
		return sb.toString();
	}

	/**
	 * Get URL from file.
	 * 
	 * @param file
	 * @return
	 */
	public static String getFileURL(File file) {
		try {
			String canonicalPath = file.getCanonicalPath();

			// Set file URL
			StringBuilder fileURL = new StringBuilder(ODT_FILE_PREFIX);
			fileURL.append(canonicalPath.replace('\\', '/')); // $NON-NLS-1$ //$NON-NLS-2$

			return fileURL.toString();
		} catch (IOException e) {
			Activator.log.error(e);
		}

		return null;
	}

	/**
	 * Convert file path from workspace for LibreOffice.
	 * 
	 * @param path
	 * @return
	 */
	public static String convertFileFromWorkspacePathForLibreOffice(String path) {
		// updating path
		path = updatePathOfFileInWorkspace(path);
		StringBuilder sb = new StringBuilder(ODT_FILE_PREFIX);
		sb.append(path);
		return sb.toString();
	}

	/**
	 * Update path of file in Workspace.
	 * 
	 * @param path
	 * @return
	 */
	public static String updatePathOfFileInWorkspace(String path) {
		// Verify if file exist for updating path
		IFile resource = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path));
		if ((resource != null) && (new File(resource.getLocation().toString()).exists())) {
			path = resource.getLocation().toString();
		} else {
			return "";//$NON-NLS-1$
		}
		return path;
	}

}
