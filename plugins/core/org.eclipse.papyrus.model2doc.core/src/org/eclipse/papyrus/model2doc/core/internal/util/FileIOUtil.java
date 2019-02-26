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
package org.eclipse.papyrus.model2doc.core.internal.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;

import org.eclipse.papyrus.model2doc.core.Activator;

/**
 * Utility class for FILE I/O management.
 *
 */
public class FileIOUtil {

	/**
	 * Constructor.
	 *
	 */
	private FileIOUtil() {
		// to avoid instantiation
	}

	/**
	 * Convert folder in workspace to URL format.
	 * 
	 * @param folderPath
	 *            the path of the folder
	 * @return the string of URL of folder path.
	 */
	public static String folderInWorkspaceToURL(String folderPath) {
		IContainer container = null;
		int nbToken = new StringTokenizer(folderPath, "/").countTokens(); //$NON-NLS-1$
		if (nbToken == 1) {// it is a project
			container = ResourcesPlugin.getWorkspace().getRoot().getProject(folderPath);// only one /
		} else {// it is a folder in a project
			container = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(folderPath));
		}

		return container != null ? container.getLocation().toString() : null;
	}

	/**
	 * Create file.
	 * 
	 * @param pathName
	 * @param text
	 * 
	 * @return
	 */
	public static File createFile(String pathName, String text) {
		// Create file
		File file = new File(pathName);
		try  (BufferedWriter output = new BufferedWriter(new FileWriter(file))) {
			// Write file
			output.write(text);

			return file;
		} catch (IOException e) {
			Activator.log.error(e);
		}

		return null;
	}
	
	/**
	 * Remove file.
	 * 
	 * @param file
	 */
	public static void removeFile(File file) {
		java.nio.file.Path path = Paths.get(file.getAbsolutePath());
		try {
			Files.deleteIfExists(path);
		} catch (IOException e) {
			Activator.log.error(e);
		}
	}
	
	/**
	 * Create folders path.
	 * 
	 * @param foldersPath
	 * @return
	 */
	public static void createFoldersPath(String foldersPath) {
		File folders = new File(foldersPath);

		if (!folders.exists()) {
			folders.mkdirs();
		}
	}

}
