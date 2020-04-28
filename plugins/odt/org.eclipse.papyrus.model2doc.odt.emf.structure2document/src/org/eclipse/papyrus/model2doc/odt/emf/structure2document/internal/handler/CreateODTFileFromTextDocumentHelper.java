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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.handler;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.transcriber.Transcriber;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.odt.emf.structure2document.Activator;
import org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.transcriber.StructureToODTTranscriber;
import org.eclipse.papyrus.model2doc.odt.internal.editor.DefaultStyleEditor;
import org.eclipse.papyrus.model2doc.odt.internal.editor.ODTEditor;
import org.eclipse.papyrus.model2doc.odt.internal.transcription.ODTTranscription;

/**
 * This helper allows to create the ODT file from a {@link TextDocument}
 */
// TODO : a such class should be API, without dependencies on ODT
public class CreateODTFileFromTextDocumentHelper {

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
	 */
	public CreateODTFileFromTextDocumentHelper(final TextDocument textDocument) {
		this.textDocument = textDocument;
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

		final Transcription transcription = createTranscription(ddgc);

		Transcriber t = createTranscriber(textDocument, transcription);
		return ODTEditor.convertToGenericFileURI(t.transcribe());
	}

	/**
	 *
	 * @param ddgc
	 *            the document generation configuration
	 * @return
	 *         the transcription to use to write the ODT documentF
	 */
	protected Transcription createTranscription(final IDocumentGeneratorConfiguration ddgc) {
		return new ODTTranscription(new DefaultStyleEditor(), ddgc);
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
		return new StructureToODTTranscriber(textDocument, transcription);
	}

}
