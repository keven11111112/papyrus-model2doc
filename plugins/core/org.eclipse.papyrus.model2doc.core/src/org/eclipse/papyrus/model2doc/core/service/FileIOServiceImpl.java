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

import org.eclipse.papyrus.model2doc.core.internal.util.FileIOUtil;

/**
 * Implemented service class for FILE I/O management.
 * 
 * @since 2.0
 *
 */
public class FileIOServiceImpl implements FileIOService {

	@Override
	public String folderInWorkspaceToURL(String folderPath) {
		return FileIOUtil.folderInWorkspaceToURL(folderPath);
	}

	@Override
	public File createFile(String pathName, String text) {
		return FileIOUtil.createFile(pathName, text);
	}

	@Override
	public void removeFile(File file) {
		FileIOUtil.removeFile(file);
	}

	@Override
	public void createFoldersPath(String foldersPath) {
		FileIOUtil.createFoldersPath(foldersPath);
	}

}