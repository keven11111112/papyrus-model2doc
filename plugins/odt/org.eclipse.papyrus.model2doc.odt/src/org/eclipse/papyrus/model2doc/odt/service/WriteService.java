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
package org.eclipse.papyrus.model2doc.odt.service;

import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;
import org.eclipse.papyrus.model2doc.core.transcription.Table;
import org.eclipse.papyrus.model2doc.odt.internal.editor.ODTEditor;

import com.sun.star.text.XTextContent;
import com.sun.star.text.XTextCursor;

/**
 * Service interface for writing odt documents.
 *
 * @since 2.0
 *
 */
public interface WriteService {

	/**
	 * Add Paragraph.
	 *
	 * @param xTextCursor
	 * @param text
	 * @param processRichText
	 */
	public void addParagraph(XTextCursor xTextCursor, String text, boolean processRichText);


	/**
	 * Add control character to end of document.
	 *
	 * @param xTextCursor
	 * @param controlCharacter
	 */
	public void addControlCharacter(XTextCursor xTextCursor, short controlCharacter);

	/**
	 * Add Text.
	 *
	 * @param xTextCursor
	 * @param text
	 */
	public void addText(XTextCursor xTextCursor, String text);

	/**
	 * Add TextContent.
	 *
	 * @param xTextCursor
	 * @param text
	 */
	public void addTextContent(XTextCursor xTextCursor, XTextContent xTextContent);

	/**
	 * Add Image as a Link.
	 *
	 * @param image
	 * @param xTextCursor
	 * @param odtEditor
	 */
	public void addImageLink(ImageDescription image, String caption, XTextCursor xTextCursor, ODTEditor odtEditor);

	/**
	 * End line.
	 *
	 * @param xTextCursor
	 */
	public void endLine(XTextCursor xTextCursor);

	/**
	 * End paragraph.
	 *
	 * @param xTextCursor
	 */
	public void endParagraph(XTextCursor xTextCursor);

	/**
	 * Insert content from text file.
	 *
	 * @param xTextCursor
	 * @param fileURL
	 */
	public void insertTextFile(XTextCursor xTextCursor, String fileURL);

	/**
	 * Remove HTML/RichText tags from string.
	 *
	 * @param text
	 * @return
	 */
	public String removeHTMLTags(String text);

	/**
	 * Add Paragraph with Rich Text format.
	 *
	 * @param xTextCursor
	 * @param text
	 */
	public void addParagraphWithRichText(XTextCursor xTextCursor, String text);

	/**
	 * Add table.
	 *
	 * @param xTextCursor
	 * @param table
	 * @param odtEditor
	 * @param style
	 *            define background color (HEX format, e.x. 0xE06666).
	 */
	public void addTable(XTextCursor xTextCursor, Table table, ODTEditor odtEditor, Object style);


	/**
	 * @param imagePath
	 * @param caption
	 * @param xTextCursor
	 * @param odtEditor
	 */
	void addImageLink(String imagePath, String caption, XTextCursor xTextCursor, ODTEditor odtEditor);

}
