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

package org.eclipse.papyrus.model2doc.odt.emf.structure2document.transcriber;

import java.util.Iterator;

import org.eclipse.papyrus.model2doc.core.transcriber.Transcriber;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Body;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;

/**
 *
 */
public class StructureToODTTranscriber implements Transcriber {

	private Transcription transcription = null;

	private TextDocument textDocument;

	private boolean refreshTableOfContents = false;

	public StructureToODTTranscriber(final TextDocument document, Transcription transcription) {
		this.textDocument = document;
		this.transcription = transcription;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.transcriber.Transcriber#transcribe()
	 *
	 */
	@Override
	public void transcribe() {
		// TODO Auto-generated method stub
		final String mainTitle = textDocument.getMainTitle();
		if (mainTitle != null && !mainTitle.isEmpty()) {
			transcription.writeDocumentMainTitle(mainTitle);
		}

		Iterator<TextDocumentPart> iter = textDocument.getTextDocumentPart().iterator(); // TODO : pluralize me
		while (iter.hasNext()) {
			transcribe(iter.next());
		}
		if (refreshTableOfContents) {
			transcription.refreshTableOfContents();// TODO should be done directly by the transcriptor
		}
		transcription.save(""); // TODO : remove this argument
	}

	private void transcribe(TextDocumentPart part) {
		if (part instanceof BodyPart) {
			transcribeBodyPart((BodyPart) part);
		}
		if (part instanceof Title) {
			transcribeTitle((Title) part);
		}
		if (part instanceof TableOfContents) {
			transcribeTableOfCOntent((TableOfContents) part);
		}
		if (part instanceof BodyPart) {
			Iterator<BodyPart> iter = ((BodyPart) part).getSubBodyPart().iterator();

			while (iter.hasNext()) {
				transcribeBodyPart(iter.next());
			}
		}
		if (part instanceof Body) {
			transcribeBody((Body) part);
		}
		// at the end:
	}

	private void transcribeBody(final Body body) {// TODO : is body concept required???
		Iterator<BodyPart> iter = body.getBodyPart().iterator();

		while (iter.hasNext()) {
			transcribeBodyPart(iter.next());
		}
	}

	private void transcribeBodyPart(BodyPart part) {
		if (part instanceof Title) {
			transcribeTitle((Title) part);
		}
		if (part instanceof TableOfContents) {
			transcribeTableOfCOntent((TableOfContents) part);
		}
		if (part instanceof BodyPart) {
			Iterator<BodyPart> iter = part.getSubBodyPart().iterator();

			while (iter.hasNext()) {
				transcribeBodyPart(iter.next());
			}
		}
		// at the end:
	}


	private void transcribeTitle(final Title title) {
		System.out.println("write title" + title.getTitle());
		transcription.writeSectionTitle(title.getTitle(), title.getLevel());
	}

	private void transcribeTableOfCOntent(final TableOfContents toc) {
		transcription.writeTableOfContents(toc.getTocTitle());
		this.refreshTableOfContents = true;
	}
}
