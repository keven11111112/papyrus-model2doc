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
package org.eclipse.papyrus.model2doc.core.service;

import java.io.File;

/**
 * Service interface for FILE I/O management.
 *
 * @since 2.0
 */
public interface FileIOService {

	/**
	 * Convert folder in workspace to URL format.
	 * 
	 * @param folderPath
	 *            the path of the folder
	 * @return the string of URL of folder path.
	 */
	public String folderInWorkspaceToURL(String folderPath);

	/**
	 * Create file.
	 * 
	 * @param pathName
	 * @param text
	 * 
	 * @return
	 */
	public File createFile(String pathName, String text);

	/**
	 * Remove file.
	 * 
	 * @param file
	 */
	public void removeFile(File file);

	/**
	 * Create folders path.
	 * 
	 * @param foldersPath
	 * @return
	 */
	public void createFoldersPath(String foldersPath);

}
