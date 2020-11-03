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
import org.eclipse.papyrus.model2doc.docx.internal.util.StyleConstants;

public class StyleServiceImpl implements StyleService {

	@Override
	public boolean applyDocumentMainTitleStyle(XWPFParagraph paragraph) {
		String style = getDocumentMainTitleStyle();
		return applyStyle(paragraph, style);
	}

	@Override
	public boolean applySectionTitleStyle(XWPFParagraph paragraph, int sectionLevel) {
		String style = getSectionTitleStyle(sectionLevel);
		return applyStyle(paragraph, style);
	}

	@Override
	public boolean applyStyle(XWPFParagraph paragraph, String styleName) {
		XWPFDocument document = paragraph.getDocument();
		if (document.getStyles() != null && document.getStyles().styleExist(styleName)) {
			paragraph.setStyle(styleName);
			return true;
		}
		return false;
	}

	@Override
	public String getDocumentMainTitleStyle() {
		return StyleConstants.TITLE_STYLE_VALUE;
	}

	@Override
	public String getSectionTitleStyle(int sectionLevel) {
		return getHeadingStyleValue() + sectionLevel;
	}

	@Override
	public String getHeadingStyleValue() {
		return StyleConstants.HEADING_STYLE_VALUE;
	}
}
