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

import org.eclipse.papyrus.model2doc.odt.internal.util.ExtensionConstants;
import org.eclipse.papyrus.model2doc.odt.internal.util.ODTEditorUtil;

/**
 * Implementation of ODT Editor Service.
 * 
 * @since 3.0
 *
 */
public class ODTEditorServiceImpl implements ODTEditorService {
	
	/**
	 * Open document.
	 * 
	 * @param projectFolder 
	 * 			the project folder in workspace (ex.: /projectName)
	 * @param documentURL 
	 * 			the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 */
	public void openDocument(String projectFolder, String documentURL) {
		ODTEditorUtil.openDocument(projectFolder, documentURL);
	}
	
	/**
	 * Close document.
	 * 
	 * @param projectFolder 
	 * 			the project folder in workspace (ex.: /projectName)
	 * @param documentURL 
	 * 			the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 */
	public void closeDocument(String projectFolder, String documentURL) {
		ODTEditorUtil.closeDocument(projectFolder, documentURL);
	}

	/**
	 * Export document.
	 * 
	 * @see org.eclipse.papyrus.model2doc.odt.service.ODTEditorService#saveDocument(java.lang.String, java.lang.String)
	 *
	 * @param fileName
	 * @param documentURL
	 * 			the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 * @param extension to export
	 * @param projectFolder 
	 * 			the project folder in workspace (ex.: /projectName)
	 * @return
	 * 		the full URL of exported document (LibreOffice format, ex.: file:///C:/folder/projectName/document.pdf)	
	 */
	@Override
	public String exportDocument(String fileName, String documentURL, String extension, String projectFolder) {
		return ODTEditorUtil.exportDocument(fileName, documentURL, extension, projectFolder);
	}

	/**
	 * Send mail with attached document.
	 * 
	 * @see org.eclipse.papyrus.model2doc.odt.service.ODTEditorService#sendMail(java.lang.String, java.lang.String)
	 *
	 * @param subject
	 * @param documentToAttach
	 * 			the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 * @param projectFolder 
	 * 			the project folder in workspace (ex.: /projectName)
	 */
	@Override
	public void sendMail(String subject, String documentToAttach, String projectFolder) {
		ODTEditorUtil.sendMail(subject, documentToAttach, projectFolder);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.odt.service.ODTEditorService#getPDFExtension()
	 *
	 * @return
	 */
	@Override
	public String getPDFExtension() {
		return ExtensionConstants.PDF;
	}

}
