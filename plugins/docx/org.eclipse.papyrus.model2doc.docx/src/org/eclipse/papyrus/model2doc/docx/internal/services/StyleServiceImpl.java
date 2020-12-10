/*****************************************************************************
 * Copyright (c) 2020 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	 Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.docx.internal.services;

import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation;
import org.eclipse.papyrus.model2doc.core.builtintypes.Row;
import org.eclipse.papyrus.model2doc.docx.Activator;
import org.eclipse.papyrus.model2doc.docx.internal.util.StyleConstants;
import org.eclipse.papyrus.model2doc.docx.services.StyleService;

public class StyleServiceImpl implements StyleService {

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#applyDocumentMainTitleStyle(org.apache.poi.xwpf.usermodel.XWPFParagraph)
	 *
	 * @param paragraph
	 * @return
	 */
	@Override
	public boolean applyDocumentMainTitleStyle(XWPFParagraph paragraph) {
		String style = getDocumentMainTitleStyle();
		return applyStyle(paragraph, style);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#applySectionTitleStyle(org.apache.poi.xwpf.usermodel.XWPFParagraph, int)
	 *
	 * @param paragraph
	 * @param sectionLevel
	 * @return
	 */
	@Override
	public boolean applySectionTitleStyle(XWPFParagraph paragraph, int sectionLevel) {
		String style = getSectionTitleStyle(sectionLevel);
		return applyStyle(paragraph, style);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#applyTableStyle(org.apache.poi.xwpf.usermodel.XWPFTable, XWPFDocument, String)
	 *
	 * @param xwpfTable
	 * @param document
	 * @param tableDescription
	 * @return
	 */
	@Override
	public boolean applyTableStyle(XWPFTable xwpfTable, XWPFDocument document, AbstractTable tableDescription) {
		String styleName;
		boolean isRowHeader = false;
		boolean isColumnHeader = false;
		if (tableDescription.getRowsNumber() != 0) {
			List<Row> rows = tableDescription.getRows();
			isRowHeader = rows.stream()
					.allMatch(
							r -> r.getCells().get(0).getLocation().equals(CellLocation.ROW_HEADER)
									|| r.getCells().get(0).getLocation().equals(CellLocation.CORNER));
		}
		if (tableDescription.getColumnsNumber() != 0) {
			List<Row> rows = tableDescription.getRows();
			isColumnHeader = rows.get(0).getCells().stream()
					.allMatch(
							c -> c.getLocation() == CellLocation.COLUMN_HEADER
									|| c.getLocation() == CellLocation.CORNER);
		}

		if (isRowHeader && isColumnHeader) {
			styleName = StyleConstants.ROW_AND_COLUMN_HEADER_STYLE_VALUE;
		} else if (isRowHeader) {
			styleName = StyleConstants.ROW_HEADER_ONLY_STYLE_VALUE;
		} else if (isColumnHeader) {
			styleName = StyleConstants.COLUMN_HEADER_ONLY_STYLE_VALUE;
		} else {
			styleName = StyleConstants.NO_HEADER_STYLE_VALUE;
		}

		if (document.getStyles() != null && document.getStyles().styleExist(styleName)) {
			xwpfTable.setStyleID(styleName);
			return true;
		}
		Activator.log.warn(NLS.bind("the style {0} does not exist in the template file", styleName)); //$NON-NLS-1$
		return false;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#applyCaptionStyle(org.apache.poi.xwpf.usermodel.XWPFParagraph, org.apache.poi.xwpf.usermodel.XWPFDocument)
	 *
	 * @param paragraph
	 * @param document
	 * @return
	 */
	@Override
	public boolean applyCaptionStyle(XWPFParagraph paragraph, XWPFDocument document) {
		String style = getCaptionStyleValue();
		return applyStyle(paragraph, style);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#applyListStyle(org.apache.poi.xwpf.usermodel.XWPFParagraph)
	 *
	 * @param paragraph
	 * @return
	 */
	@Override
	public boolean applyListStyle(XWPFParagraph paragraph) {
		String style = getListStyleValue();
		return applyStyle(paragraph, style);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#applyStyle(org.apache.poi.xwpf.usermodel.XWPFParagraph, java.lang.String)
	 *
	 * @param paragraph
	 * @param styleName
	 * @return
	 */
	@Override
	public boolean applyStyle(XWPFParagraph paragraph, String styleName) {
		XWPFDocument document = paragraph.getDocument();
		if (document.getStyles() != null && document.getStyles().styleExist(styleName)) {
			paragraph.setStyle(styleName);
			return true;
		}
		Activator.log.warn(NLS.bind("the style {0} does not exist in the template file", styleName)); //$NON-NLS-1$
		return false;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#getDocumentMainTitleStyle()
	 *
	 * @return
	 */
	@Override
	public String getDocumentMainTitleStyle() {
		return StyleConstants.TITLE_STYLE_VALUE;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#getSectionTitleStyle(int)
	 *
	 * @param sectionLevel
	 * @return
	 */
	@Override
	public String getSectionTitleStyle(int sectionLevel) {
		return getSectionStylePrefix() + sectionLevel;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#getSectionStylePrefix()
	 *
	 * @return
	 */
	@Override
	public String getSectionStylePrefix() {
		return StyleConstants.SECTION_STYLE_PREFIX;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#getSectionStylePrefix()
	 *
	 * @return
	 */
	@Override
	public String getCaptionStyleValue() {
		return StyleConstants.CAPTION_STYLE_VALUE;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#getListStyleValue()
	 *
	 * @return
	 */
	@Override
	public String getListStyleValue() {
		return StyleConstants.LIST_STYLE_VALUE;
	}
}
