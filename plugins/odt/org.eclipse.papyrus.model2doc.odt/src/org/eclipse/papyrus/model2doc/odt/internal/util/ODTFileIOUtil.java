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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
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
			fileURL.append(canonicalPath.replace('\\', '/')); // $NON-NLS-1$

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
