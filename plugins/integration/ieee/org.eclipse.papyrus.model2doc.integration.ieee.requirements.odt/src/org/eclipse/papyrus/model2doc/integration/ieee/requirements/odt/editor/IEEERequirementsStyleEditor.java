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
package org.eclipse.papyrus.model2doc.integration.ieee.requirements.odt.editor;

import org.eclipse.papyrus.model2doc.odt.editor.StyleEditor;
import org.eclipse.papyrus.model2doc.odt.editor.StyleEditorFactory;
import org.eclipse.papyrus.model2doc.odt.service.StyleService;
import org.eclipse.papyrus.model2doc.odt.service.StyleServiceImpl;
import com.sun.star.text.XText;
import com.sun.star.text.XTextCursor;

/**
 * IEEE Requirements Style Editor.
 *
 */
public class IEEERequirementsStyleEditor implements StyleEditor {
	
	private StyleEditor styleEditor = null;
	
	private StyleService styleService =null;
	
	/**
	 * Constructor.
	 *
	 */
	public IEEERequirementsStyleEditor() {
		styleEditor = StyleEditorFactory.INSTANCE.getDefaultStyleEditor();
		styleService = new StyleServiceImpl();
	}

	@Override
	public void applyMainTitleStyle(XText text) {
		styleService.applyStyle(text, styleService.getParaStyleNamePropertyName(), styleService.getHeadingStyleValue());
	}

	@Override
	public void applySectionTitleStyle(XTextCursor cursor, int sectionLevel) {
		styleEditor.applySectionTitleStyle(cursor, sectionLevel);
	}

	@Override
	public void applyListStyle(XTextCursor cursor, int cursorStartPosition) {
		styleEditor.applyListStyle(cursor, cursorStartPosition);
	}

	@Override
	public void applyImageStyle(XTextCursor cursor) {
		styleEditor.applyImageStyle(cursor);
	}

	@Override
	public void applyImageSubtitleStyle(XTextCursor cursor) {
		styleEditor.applyImageSubtitleStyle(cursor);
	}

}
