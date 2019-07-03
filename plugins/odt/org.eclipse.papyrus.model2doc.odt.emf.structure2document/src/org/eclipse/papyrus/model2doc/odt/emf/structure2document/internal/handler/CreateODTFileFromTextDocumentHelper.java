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
import org.eclipse.papyrus.model2doc.odt.internal.transcription.ODTTranscription;

/**
 *
 */
public class CreateODTFileFromTextDocumentHelper {

	private TextDocument textDocument;

	protected CreateODTFileFromTextDocumentHelper() {
		// nothing to do
	}

	public CreateODTFileFromTextDocumentHelper(final TextDocument textDocument) {
		setTextDocument(textDocument);
	}


	public void generate() {
		if (this.textDocument == null) {
			Activator.log.warn("The TextDocument is null"); //$NON-NLS-1$
			return;
		}
		final IDocumentGeneratorConfiguration ddgc = textDocument.getDocumentGeneratorConfiguration();

		DefaultStyleEditor styleEditor = new DefaultStyleEditor();
		Transcription transcription = new ODTTranscription(styleEditor, ddgc);

		Transcriber t = new StructureToODTTranscriber(textDocument, transcription);
		t.transcribe();
	}



	protected void setTextDocument(final TextDocument textDocument) {
		this.textDocument = textDocument;
	}

}
