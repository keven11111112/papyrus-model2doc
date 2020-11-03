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

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.docx.internal.transcription.DocxTranscription;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.helpers.ITranscriptionFactory;

/**
 * transcription factory to create Docx transcription
 */
public class DocxTranscriptionFactory implements ITranscriptionFactory {

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.structure2document.generator.helpers.ITranscriptionFactory#createTranscription(org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration)
	 *
	 * @param ddgc
	 * @return
	 */
	@Override
	public Transcription createTranscription(IDocumentGeneratorConfiguration ddgc) {
		return new DocxTranscription(ddgc);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.structure2document.generator.helpers.ITranscriptionFactory#createFileURI(java.lang.String)
	 *
	 * @param transcribe
	 * @return
	 */
	@Override
	public String createFileURI(String fileURI) {
		// TODO Auto-generated method stub
		return "";
	}

}
