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
package org.eclipse.papyrus.model2doc.odt.internal.editor;

import org.eclipse.papyrus.model2doc.odt.editor.StyleEditor;
import org.eclipse.papyrus.model2doc.odt.service.StyleService;
import org.eclipse.papyrus.model2doc.odt.service.StyleServiceImpl;
import com.sun.star.awt.FontSlant;
import com.sun.star.style.ParagraphAdjust;
import com.sun.star.text.XText;
import com.sun.star.text.XTextCursor;

/**
 * This class provide a default style editor. 
 *
 */
public class DefaultStyleEditor implements StyleEditor {

	/** Maximum number of section's level. */
	private static final int MAX_SECTION_LEVEL = 10;
	
	private StyleService styleService = null;
	
	/**
	 * Constructor.
	 *
	 */
	public DefaultStyleEditor() {
		styleService = new StyleServiceImpl();
	}

	@Override
	public void applyMainTitleStyle(XText text) {
		styleService.applyStyle(text, styleService.getParaStyleNamePropertyName(), styleService.getTitleStyleValue());
	}

	@Override
	public void applySectionTitleStyle(XTextCursor cursor, int sectionLevel) {
		if (sectionLevel <= MAX_SECTION_LEVEL) {
			styleService.applyStylePreviousParagraph(cursor, styleService.getParaStyleNamePropertyName(), styleService.getHeadingStyleValue() + " " + sectionLevel); //$NON-NLS-1$
		}
	}

	@Override
	public void applyListStyle(XTextCursor cursor, int cursorStartPosition) {
		styleService.applyStyleLeft(cursor, cursorStartPosition, styleService.getNumberStyleNamePropertyName(), styleService.getList1StyleValue());

	}
	
	@Override
	public void applyImageStyle(XTextCursor cursor) {
		styleService.applyStylePreviousParagraph(cursor, styleService.getParaAdjustPropertyName(), ParagraphAdjust.CENTER);
	}

	@Override
	public void applyImageSubtitleStyle(XTextCursor cursor) {
		styleService.applyStylePreviousParagraph(cursor, styleService.getParaAdjustPropertyName(), ParagraphAdjust.CENTER);
		styleService.applyStylePreviousParagraph(cursor, styleService.getCharPorturePropertyName(), FontSlant.ITALIC);
	}

}