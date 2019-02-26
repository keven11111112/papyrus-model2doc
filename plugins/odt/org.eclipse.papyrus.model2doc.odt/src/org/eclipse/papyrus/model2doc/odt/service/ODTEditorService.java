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

/**
 * ODT Editor Service.
 *
 * @since 3.0
 * 
 */
public interface ODTEditorService {
	
	public final static String DOCUMENT_KIND = "odt"; //$NON-NLS-1$
	
	/**
	 * Open document.
	 * 
	 * @param projectFolder 
	 * 			the project folder in workspace (ex.: /projectName)
	 * @param documentURL 
	 * 			the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 */
	public void openDocument(String projectFolder, String documentURL);

	/**
	 * Close document.
	 * 
	 * @param projectFolder 
	 * 			the project folder in workspace (ex.: /projectName)
	 * @param documentURL 
	 * 			the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 */
	public void closeDocument(String projectFolder, String documentURL);

	/**
	 * Export document.
	 * 
	 * @param fileName
	 * @param documentURL
	 * 			the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 * @param extension to export
	 * @param projectFolder 
	 * 			the project folder in workspace (ex.: /projectName)
	 * 
	 * @return
	 * 		the full URL of exported document (LibreOffice format, ex.: file:///C:/folder/projectName/document.pdf)	
	 */
	public String exportDocument(String fileName, String documentURL, String extension, String projectFolder);

	/**
	 * Send mail with attached document.
	 * 
	 * @param subject
	 * @param documentToAttach
	 *  	the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 * @param projectFolder 
	 * 			the project folder in workspace (ex.: /projectName)
	 */
	public void sendMail(String subject, String documentToAttach, String projectFolder);
	
	/**
	 * Get PDF Extension.
	 * 
	 * @return
	 */
	public String getPDFExtension();

}
