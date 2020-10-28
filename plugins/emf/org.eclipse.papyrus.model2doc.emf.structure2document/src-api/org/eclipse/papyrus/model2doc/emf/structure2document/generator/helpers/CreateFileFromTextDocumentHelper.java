/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.structure2document.generator.helpers;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.transcriber.Transcriber;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.structure2document.Activator;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.transcriber.StructureToTranscriber;

/**
 * This helper allows to create a file from a {@link TextDocument}
 */
public class CreateFileFromTextDocumentHelper {

	/**
	 * The transcription factory
	 */
	private ITranscriptionFactory transcriptionFactory;

	/**
	 * The initial text document
	 */
	private TextDocument textDocument;

	/**
	 *
	 * Constructor.
	 *
	 * @param textDocument
	 *            the text document we want to process
	 * @param transcriptionFactory
	 *            the transcription factory to use
	 *
	 */
	public CreateFileFromTextDocumentHelper(final TextDocument textDocument, final ITranscriptionFactory transcriptionFactory) {
		this.textDocument = textDocument;
		this.transcriptionFactory = transcriptionFactory;
	}


	/**
	 * This method generate the final odt document
	 *
	 * @return a string representing the path of the new document, starting with file:/
	 *
	 */
	public String generate() {// TODO : must return the generated file
		if (this.textDocument == null) {
			Activator.log.warn("The TextDocument is null"); //$NON-NLS-1$
			return null;
		}
		final IDocumentGeneratorConfiguration ddgc = textDocument.getDocumentGeneratorConfiguration();

		final Transcription transcription = transcriptionFactory.createTranscription(ddgc);

		Transcriber t = createTranscriber(textDocument, transcription);
		return transcriptionFactory.createFileURI(t.transcribe());
	}


	/**
	 *
	 * @param textDocument
	 *            the text document
	 * @param transcription
	 *            the transcription to use
	 * @return
	 *         the Transcriber in charge to cross the TextDocument to write the final document using the Transcription element
	 */
	protected Transcriber createTranscriber(final TextDocument textDocument, final Transcription transcription) {
		return new StructureToTranscriber(textDocument, transcription);
	}


}
