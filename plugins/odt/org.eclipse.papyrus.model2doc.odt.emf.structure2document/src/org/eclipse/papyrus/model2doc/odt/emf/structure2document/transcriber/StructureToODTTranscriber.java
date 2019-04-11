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
import org.eclipse.papyrus.model2doc.emf.documentstructure.Image;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;

/**
 * This class crosses a {@link TextDocument} to fill an odt file
 */
public class StructureToODTTranscriber implements Transcriber {

	private Transcription transcription = null;

	private TextDocument textDocument;

	private boolean refreshTableOfContents = false;

	/**
	 *
	 * Constructor.
	 *
	 * @param document
	 * @param transcription
	 */
	public StructureToODTTranscriber(final TextDocument document, final Transcription transcription) {
		this.textDocument = document;
		this.transcription = transcription;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.transcriber.Transcriber#transcribe()
	 *
	 */
	@Override
	public void transcribe() {
		final String mainTitle = textDocument.getMainTitle();
		if (mainTitle != null && !mainTitle.isEmpty()) {
			transcription.writeDocumentMainTitle(mainTitle);
		}

		Iterator<TextDocumentPart> iter = textDocument.getTextDocumentPart().iterator(); // TODO : pluralize me
		while (iter.hasNext()) {
			transcribe(iter.next());
		}
		if (this.refreshTableOfContents) {
			this.transcription.refreshTableOfContents();// TODO should be done directly by the transcriptor
		}
		this.transcription.save(""); // TODO : remove this argument //$NON-NLS-1$
	}

	/**
	 * This method is in charge to transcribe a TextDocumentPart in the output document
	 *
	 * @param part
	 *            a TextDocumentPart
	 */
	private void transcribe(final TextDocumentPart part) {
		if (part instanceof TableOfContents) {
			transcribeTableOfContent((TableOfContents) part);
		} else if (part instanceof Body) {
			transcribeBody((Body) part);
		}
		// do nothing in other case (but there is not others cases!
	}

	/**
	 * This method is in charge to transcribe the body of the document
	 *
	 * @param body
	 *            the document body
	 */
	private void transcribeBody(final Body body) {
		final Iterator<BodyPart> iter = body.getBodyPart().iterator();

		while (iter.hasNext()) {
			transcribeBodyPart(iter.next());
		}
	}

	/**
	 * This methods is in charge to transcribe a body part and its sub-body part in the output document
	 *
	 * @param bodyPart
	 *            a body part
	 */
	private void transcribeBodyPart(final BodyPart bodyPart) {
		if (bodyPart instanceof Title) {
			transcribeTitle((Title) bodyPart);
		} else if (bodyPart instanceof TableOfContents) {
			transcribeTableOfContent((TableOfContents) bodyPart);
		} else if (bodyPart instanceof Paragraph) {
			transcribteParagraph((Paragraph) bodyPart);
		} else if (bodyPart instanceof Image) {
			transcribeImage((Image) bodyPart);
		}

		// then we iterate on the children of the bodyPart
		final Iterator<BodyPart> iter = bodyPart.getSubBodyPart().iterator();
		while (iter.hasNext()) {
			transcribeBodyPart(iter.next());
		}

		// at the end:
	}

	/**
	 * This method transcribes the {@link Title} into a title in the output document
	 *
	 * @param title
	 *            a title
	 */
	private void transcribeTitle(final Title title) {
		transcription.writeSectionTitle(title.getTitle(), title.getLevel());
	}


	/**
	 * This method creates a table of contents in the output document
	 *
	 * @param toc
	 *            the table of contents
	 */
	private void transcribeTableOfContent(final TableOfContents toc) {
		transcription.writeTableOfContents(toc.getTocTitle());
		this.refreshTableOfContents = true;
	}

	/**
	 * This method set the referenced image in the output document
	 *
	 * @param image
	 *            an image
	 */
	private void transcribeImage(final Image image) {
		transcription.writeImage(image.getImagePath(), image.getCaption());
	}

	/**
	 * This method transcribe the paragraph in the output document
	 *
	 * @param paragraph
	 *            a paragraph
	 */
	private void transcribteParagraph(final Paragraph paragraph) {
		transcription.writeParagraph(paragraph.getText(), false);
	}
}
