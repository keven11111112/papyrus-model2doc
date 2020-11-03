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
package org.eclipse.papyrus.model2doc.docx.services;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.docx.Activator;
import org.eclipse.papyrus.model2doc.docx.internal.util.StyleConstants;

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
	 * @see org.eclipse.papyrus.model2doc.docx.services.StyleService#applyTableStyle(org.apache.poi.xwpf.usermodel.XWPFTable, XWPFDocument)
	 *
	 * @param table
	 * @return
	 */
	@Override
	public boolean applyTableStyle(XWPFTable table, XWPFDocument document) {
		String styleName = StyleConstants.TABLE_STYLE_VALUE;
		if (document.getStyles().styleExist(styleName)) {
			table.setStyleID(styleName);
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
}
