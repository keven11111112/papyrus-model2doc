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

import org.eclipse.papyrus.model2doc.core.config.GeneratorConfig;

/**
 * Service interface for FILE I/O management dedicated to LibreOffice concerns.
 * 
 * @since 2.0
 *
 */
public interface ODTFileIOService {
	
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
	public String fileNameToURL(String filePath, String outputFolder);
	
	/**
	 * Convert template path for LibreOffice.
	 * 
	 * @param generatorConfig
	 *            the odt generator configuration
	 * @return the string formatted for LibreOffice to allow it to find the template
	 *         file
	 */
	public String convertTemplatePathForLibreOffice(final GeneratorConfig generatorConfig);
	
	/**
	 * Get URL from file.
	 * 
	 * @param file
	 * @return
	 */
	public String getFileURL(File file);
	
	/**
	 * Convert file path from workspace for LibreOffice.
	 * 
	 * @param path
	 * @return
	 */
	public String convertFileFromWorkspacePathForLibreOffice(String path);
	
	/**
	 * Update path of file in Workspace.
	 * 
	 * @param path
	 * @return
	 */
	public String updatePathOfFileInWorkspace(String path);


	/**
	 * Get ODT file prefix
	 * 
	 * @return
	 * 		"file:///"
	 */
	public String getODTFilePrefix();
}
