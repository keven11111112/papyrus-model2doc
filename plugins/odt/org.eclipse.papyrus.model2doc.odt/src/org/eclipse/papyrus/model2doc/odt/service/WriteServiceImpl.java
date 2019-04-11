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
import org.eclipse.papyrus.model2doc.odt.internal.util.WriteUtil;

import com.sun.star.text.XTextContent;
import com.sun.star.text.XTextCursor;

/**
 * Implemented service class for writing odt documents.
 *
 * @since 2.0
 *
 */
public class WriteServiceImpl implements WriteService {

	@Override
	public void addParagraph(XTextCursor xTextCursor, String text, boolean processRichText) {
		WriteUtil.addParagraph(xTextCursor, text, processRichText);
	}

	@Override
	public void addControlCharacter(XTextCursor xTextCursor, short controlCharacter) {
		WriteUtil.addControlCharacter(xTextCursor, controlCharacter);
	}

	@Override
	public void addText(XTextCursor xTextCursor, String text) {
		WriteUtil.addText(xTextCursor, text);
	}

	@Override
	public void addTextContent(XTextCursor xTextCursor, XTextContent xTextContent) {
		WriteUtil.addTextContent(xTextCursor, xTextContent);
	}

	@Override
	public void addImageLink(ImageDescription image, String caption, XTextCursor xTextCursor, ODTEditor odtEditor) {
		WriteUtil.addImageLink(image, caption, xTextCursor, odtEditor);
	}

	@Override
	public void addImageLink(final String imagePath, String caption, XTextCursor xTextCursor, ODTEditor odtEditor) {
		WriteUtil.addImageLink(imagePath, caption, xTextCursor, odtEditor);
	}

	@Override
	public void endLine(XTextCursor xTextCursor) {
		WriteUtil.endLine(xTextCursor);
	}

	@Override
	public void endParagraph(XTextCursor xTextCursor) {
		WriteUtil.endParagraph(xTextCursor);
	}

	@Override
	public void insertTextFile(XTextCursor xTextCursor, String fileURL) {
		WriteUtil.insertTextFile(xTextCursor, fileURL);
	}

	@Override
	public String removeHTMLTags(String text) {
		return WriteUtil.removeHTMLTags(text);
	}

	@Override
	public void addParagraphWithRichText(XTextCursor xTextCursor, String text) {
		WriteUtil.addParagraphWithRichText(xTextCursor, text);
	}

	@Override
	public void addTable(XTextCursor xTextCursor, Table table, ODTEditor odtEditor, Object style) {
		WriteUtil.addTable(xTextCursor, table, odtEditor, style);
	}

}
