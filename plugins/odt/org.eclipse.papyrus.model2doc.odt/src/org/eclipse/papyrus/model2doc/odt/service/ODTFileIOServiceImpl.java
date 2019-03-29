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
package org.eclipse.papyrus.model2doc.odt.service;

import java.io.File;

import org.eclipse.papyrus.model2doc.odt.internal.util.ODTFileIOUtil;

/**
 * Implemented service class for FILE I/O management dedicated to LibreOffice concerns.
 *
 * @since 2.0
 *
 */
public class ODTFileIOServiceImpl implements ODTFileIOService {


	@Override
	public String getFileURL(File file) {
		return ODTFileIOUtil.getFileURL(file);
	}

	@Override
	public String convertFileFromWorkspacePathForLibreOffice(String path) {
		return ODTFileIOUtil.convertFileFromWorkspacePathForLibreOffice(path);
	}

	@Override
	public String updatePathOfFileInWorkspace(String path) {
		return ODTFileIOUtil.updatePathOfFileInWorkspace(path);
	}


	@Override
	public String getODTFilePrefix() {
		return ODTFileIOUtil.ODT_FILE_PREFIX;
	}

}
