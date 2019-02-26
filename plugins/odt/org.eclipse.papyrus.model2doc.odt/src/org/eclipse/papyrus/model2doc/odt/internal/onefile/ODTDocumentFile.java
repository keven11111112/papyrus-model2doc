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
package org.eclipse.papyrus.model2doc.odt.internal.onefile;

import org.eclipse.core.resources.IFile;

import org.eclipse.papyrus.model2doc.core.onefile.file.GeneratedDocumentFile;
import org.eclipse.papyrus.model2doc.odt.service.ODTEditorService;

/**
 * This class for dealing with generated odt document files.
 *  
 * @since 3.0
 */
public class ODTDocumentFile extends GeneratedDocumentFile {

	/**
	 * Constructor.
	 *
	 * @param file
	 */
	public ODTDocumentFile(IFile file) {
		super(file);
	}

	@Override
	protected boolean isExtensionOfGeneratedDocument(String extension) {
		return ODTEditorService.DOCUMENT_KIND.equals(extension);
	}

}
