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
package org.eclipse.papyrus.model2doc.odt.editor;

import com.sun.star.text.XText;
import com.sun.star.text.XTextCursor;

/**
 * Style Editor Interface.
 *
 */
public interface StyleEditor {

	/**
	 * Apply Main Title Style.
	 * 
	 * @param text
	 */
	public void applyMainTitleStyle(XText text);

	/**
	 * Apply Section Title Style.
	 * 
	 * @param cursor
	 * @param sectionLevel
	 */
	public void applySectionTitleStyle(XTextCursor cursor, int sectionLevel);

	/**
	 * Apply List Style.
	 * 
	 * @param cursor
	 * @param cursorStartPosition
	 */
	public void applyListStyle(XTextCursor cursor, int cursorStartPosition);
	
	/**
	 * Apply Image Style.
	 * 
	 * @param cursor
	 */
	public void applyImageStyle(XTextCursor cursor);

	/**
	 * Apply Image Subtitle Style.
	 * 
	 * @param cursor
	 */
	public void applyImageSubtitleStyle(XTextCursor cursor);

}
