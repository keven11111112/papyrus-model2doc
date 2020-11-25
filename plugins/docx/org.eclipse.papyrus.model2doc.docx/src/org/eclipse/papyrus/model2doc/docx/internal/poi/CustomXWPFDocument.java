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
 *   Pauline DEVILLE (CEA LIST) <pauline.deville@cea.fr> - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.docx.internal.poi;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;

/**
 * This custom implementation allow to add some missing methods in the apache api
 */
public class CustomXWPFDocument extends XWPFDocument {

	/**
	 * Constructor.
	 *
	 */
	public CustomXWPFDocument() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param template
	 * @throws IOException
	 */
	public CustomXWPFDocument(InputStream template) throws IOException {
		super(template);
	}

	/**
	 *
	 * @see org.apache.poi.xwpf.usermodel.XWPFDocument#createTOC()
	 *
	 */
	@Override
	public void createTOC() {
		XWPFParagraph paragraph = createParagraph();
		CTP ctP = paragraph.getCTP();

		CTSimpleField toc = ctP.addNewFldSimple();
		toc.setInstr("TOC \\o"); //$NON-NLS-1$
		toc.setDirty(STOnOff.TRUE); // FIXME a pop up appear when we open the document
	}

	/**
	 * Create a Table of Figure
	 */
	public void createTOF() {
		XWPFParagraph paragraph = createParagraph();
		CTSimpleField toc = paragraph.getCTP().addNewFldSimple();
		toc.setInstr("TOC \\c \"figure\" \\* MERGEFORMAT"); //$NON-NLS-1$
		toc.setDirty(STOnOff.TRUE); // FIXME a pop up appear when we open the document
	}

	/**
	 * Create an empty table with one row and one column as default.
	 *
	 * @return a new table
	 */
	@Override
	public XWPFTable createTable() {
		XWPFTable table = new CustomXWPFTable(getDocument().getBody().addNewTbl(), this);
		bodyElements.add(table);
		tables.add(table);
		return table;
	}

	/**
	 * Create an empty table with a number of rows and cols specified
	 *
	 * @param rows
	 * @param cols
	 * @return table
	 */
	@Override
	public XWPFTable createTable(int rows, int cols) {
		XWPFTable table = new CustomXWPFTable(getDocument().getBody().addNewTbl(), this, rows, cols);
		bodyElements.add(table);
		tables.add(table);
		return table;
	}

}
