/*****************************************************************************
 * Copyright (c) 2019, 2020 CEA LIST.
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
 *    Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - bug 568341
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.structure2document.generator.transcriber;

import java.util.Iterator;

import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractList;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable;
import org.eclipse.papyrus.model2doc.core.transcriber.Transcriber;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Body;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ComposedBodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Image;
import org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedFile;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfFigures;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;

/**
 * This class crosses a {@link TextDocument} to fill a file
 */
public class StructureToTranscriber implements Transcriber {

	private Transcription transcription = null;

	private TextDocument textDocument;

	/**
	 *
	 * Constructor.
	 *
	 * @param document
	 * @param transcription
	 */
	public StructureToTranscriber(final TextDocument document, final Transcription transcription) {
		this.textDocument = document;
		this.transcription = transcription;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.transcriber.Transcriber#transcribe()
	 *
	 */
	@Override
	public String transcribe() {
		final String mainTitle = this.textDocument.getMainTitle();
		if (mainTitle != null && !mainTitle.isEmpty()) {
			this.transcription.writeDocumentMainTitle(mainTitle);
			this.transcription.writeAuthors(this.textDocument.getAuthors());
			if (null != this.textDocument.getVersion()) {
				this.transcription.writeVersion(this.textDocument.getVersion().getVersion());
			}
		}


		Iterator<TextDocumentPart> iter = textDocument.getTextDocumentParts().iterator();
		while (iter.hasNext()) {
			transcribe(iter.next());
		}
		this.transcription.refreshTablesOfIndexes();// TODO should be done directly by the transcriptor

		return this.transcription.save(""); // TODO : remove this argument //$NON-NLS-1$
	}

	/**
	 * This method is in charge to transcribe a TextDocumentPart in the output document
	 *
	 * @param part
	 *            a TextDocumentPart
	 */
	private void transcribe(final TextDocumentPart part) {
		if (part instanceof TableOfContents) {
			transcribeTableOfContents((TableOfContents) part);
		} else if (part instanceof TableOfFigures) {
			transcribeTableOfFigures((TableOfFigures) part);
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
		final Iterator<BodyPart> iter = body.getBodyParts().iterator();

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
		} else if (bodyPart instanceof Paragraph) {
			transcribteParagraph((Paragraph) bodyPart);
		} else if (bodyPart instanceof Image) {
			transcribeImage((Image) bodyPart);
		} else if (bodyPart instanceof AbstractTable) {
			transcribeTable((AbstractTable) bodyPart);
		} else if (bodyPart instanceof AbstractList) {
			transcribeList((AbstractList) bodyPart);
		} else if (bodyPart instanceof InsertedFile) {
			transcribeInsertedFile(((InsertedFile) bodyPart));
		}

		// then we iterate on the children of the bodyPart
		if (bodyPart instanceof ComposedBodyPart) {
			final Iterator<BodyPart> iter = ((ComposedBodyPart) bodyPart).getSubBodyParts().iterator();
			while (iter.hasNext()) {
				transcribeBodyPart(iter.next());
			}
		}

		// at the end:
	}

	/**
	 * @param insertedFile
	 */
	private void transcribeInsertedFile(final InsertedFile insertedFile) {
		transcription.insertFile(insertedFile);
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
	private void transcribeTableOfContents(final TableOfContents toc) {
		transcription.writeTableOfContents(toc.getTocTitle());
	}

	/**
	 * This method creates a table of figures in the output document
	 *
	 * @param toc
	 *            the table of contents
	 */
	private void transcribeTableOfFigures(final TableOfFigures tof) {
		transcription.writeTableOfFigures(tof.getTofTitle());
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

	/**
	 * This method transcribe an {@link AbstractTable} into a Table in a text document
	 *
	 * @param table
	 *            a table
	 */
	private void transcribeTable(final AbstractTable table) {
		transcription.writeTable(table);
	}

	/**
	 * This method transcribes an {@link AbstractList} into a list in the text document
	 *
	 * @param list
	 *            a list
	 */
	private void transcribeList(final AbstractList list) {
		transcription.writeList(list, false);
	}
}
