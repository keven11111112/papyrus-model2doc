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
package org.eclipse.papyrus.model2doc.odt.ui.share.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import org.eclipse.papyrus.model2doc.documentview.Document;

/**
 *  Handler class for exporting pdf format.
 *
 */
public class PDFExportHandler extends ShareDocumentHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Document document = getSelection();
		String projectFolder = getWorkspaceResourceService().calculateProjectFolder(document.getContext());
		String documentURL = getODTFileIOService().convertFileFromWorkspacePathForLibreOffice(document.getGeneratedDocumentFileURI());
		String pdf = getODTEditorService().getPDFExtension();
		getODTEditorService().exportDocument(document.getName(), documentURL, pdf, projectFolder); //$NON-NLS-1$
		
		getWorkspaceResourceService().refreshWorkspace(projectFolder);
		return null;
	}

}