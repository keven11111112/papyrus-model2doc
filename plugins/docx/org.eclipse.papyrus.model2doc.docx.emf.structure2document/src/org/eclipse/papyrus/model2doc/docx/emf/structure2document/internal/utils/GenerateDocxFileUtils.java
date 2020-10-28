/*****************************************************************************
 * Copyright (c) 2020 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	 Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.docx.emf.structure2document.internal.utils;

import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.helpers.CreateFileFromTextDocumentHelper;

/**
 * This class provides Utilities method for Docx file generations
 * TODO : check if it it really necessary to get a such class
 */
public class GenerateDocxFileUtils {

	public static String generateDocxFile(final TextDocument docTemplate) {
		final CreateFileFromTextDocumentHelper helper = new CreateFileFromTextDocumentHelper(docTemplate, new DocxTranscriptionFactory());
		final String generatedFilePath = helper.generate();

		return generatedFilePath;
	}

}
