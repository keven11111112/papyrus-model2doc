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

package org.eclipse.papyrus.model2doc.docx.internal.poi;

import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.eclipse.papyrus.model2doc.docx.Activator;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STMerge;

/**
 * This custom implementation allow to add some missing methods in the apache api
 */
public class CustomXWPFTable extends XWPFTable {

	/**
	 * Constructor.
	 *
	 * @param table
	 * @param part
	 */
	public CustomXWPFTable(CTTbl table, IBody part) {
		super(table, part);
	}

	/**
	 * Constructor.
	 *
	 * @param table
	 * @param part
	 * @param row
	 * @param col
	 */
	public CustomXWPFTable(CTTbl table, IBody part, int row, int col) {
		super(table, part, row, col);
	}

	/**
	 * Merge cells present between the startCell and the endCell, the content of the merge cell is the content of the startCell
	 *
	 * @param rowIndex
	 *            the position of the row to merge
	 * @param startCellIndex
	 *            the position in the row of the first cell to merge
	 * @param endCell
	 *            the position in the row of the last cell to merge
	 */
	public void horizontalCellMerge(int rowIndex, int startCellIndex, int endCellIndex) {
		// some check
		if (rowIndex >= getNumberOfRows()) {
			Activator.log.warn("The merge of cells is not possible since the range of cells is out of bounds"); //$NON-NLS-1$
		}
		if (startCellIndex >= getRow(rowIndex).getTableCells().size() || endCellIndex >= getRow(rowIndex).getTableCells().size()) {
			Activator.log.warn("The merge of cells is not possible since the range of cells is out of bounds"); //$NON-NLS-1$
		}

		// merge
		CTHMerge startMerge = CTHMerge.Factory.newInstance();
		startMerge.setVal(STMerge.RESTART);
		CTHMerge continueMerge = CTHMerge.Factory.newInstance();
		continueMerge.setVal(STMerge.CONTINUE);

		XWPFTableCell startCell = getRow(rowIndex).getCell(startCellIndex);
		startCell.getCTTc().addNewTcPr().setHMerge(startMerge);

		int index = startCellIndex + 1;
		while (index <= endCellIndex) {
			XWPFTableCell continueCell = getRow(rowIndex).getCell(index);
			CTTcPr tcpr = continueCell.getCTTc().getTcPr();
			if (tcpr == null) {
				tcpr = continueCell.getCTTc().addNewTcPr();
			}
			tcpr.setHMerge(continueMerge);
			index++;
		}
	}

	/**
	 * Merge cells present between the startCell and the endCell, the content of the merge cell is the content of the startCell
	 *
	 * @param columnIndex
	 *            the position of the column to merge
	 * @param startRowIndex
	 *            the position of the first row to merge
	 * @param endRowIndex
	 *            the position of the last row to merge
	 */
	public void verticalCellMerge(int columnIndex, int startRowIndex, int endRowIndex) {
		// some check
		if (startRowIndex >= getNumberOfRows() || endRowIndex >= getNumberOfRows()) {
			Activator.log.warn("The merge of cells is not possible since the range of cells is out of bounds"); //$NON-NLS-1$
		}
		if (columnIndex >= getRow(0).getTableCells().size()) {
			Activator.log.warn("The merge of cells is not possible since the range of cells is out of bounds"); //$NON-NLS-1$
		}

		// merge
		CTVMerge startMerge = CTVMerge.Factory.newInstance();
		startMerge.setVal(STMerge.RESTART);
		CTVMerge continueMerge = CTVMerge.Factory.newInstance();
		continueMerge.setVal(STMerge.CONTINUE);

		XWPFTableCell startCell = getRow(startRowIndex).getCell(columnIndex);
		startCell.getCTTc().addNewTcPr().setVMerge(startMerge);

		int index = startRowIndex + 1;
		while (index <= endRowIndex) {
			XWPFTableCell continueCell = getRow(index).getCell(columnIndex);
			CTTcPr tcpr = continueCell.getCTTc().getTcPr();
			if (tcpr == null) {
				tcpr = continueCell.getCTTc().addNewTcPr();
			}
			tcpr.setVMerge(continueMerge);
			index++;
		}
	}



}
