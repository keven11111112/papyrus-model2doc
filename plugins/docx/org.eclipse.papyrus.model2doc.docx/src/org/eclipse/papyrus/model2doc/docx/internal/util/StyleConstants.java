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
package org.eclipse.papyrus.model2doc.docx.internal.util;

/**
 * Style Constants.
 *
 */
public class StyleConstants {

	/**
	 * Style values.
	 */
	// This string should not be in french
	// FIXME https://bugs.eclipse.org/bugs/show_bug.cgi?id=568598
	public static final String TITLE_STYLE_VALUE = "Titre"; //$NON-NLS-1$

	public static final String SECTION_STYLE_PREFIX = "Titre"; //$NON-NLS-1$

	public static final String CAPTION_STYLE_VALUE = "Lgende"; //$NON-NLS-1$

	public static final String ROW_AND_COLUMN_HEADER_STYLE_VALUE = "TableStyleWithBothHeader"; //$NON-NLS-1$

	public static final String ROW_HEADER_ONLY_STYLE_VALUE = "TableStyleWithRowHeaderOnly"; //$NON-NLS-1$

	public static final String COLUMN_HEADER_ONLY_STYLE_VALUE = "TableStyleWithColumnHeaderOnly"; //$NON-NLS-1$

	public static final String NO_HEADER_STYLE_VALUE = "TableWithoutHeader"; //$NON-NLS-1$

	public static final String LIST_STYLE_VALUE = "Paragraphedeliste"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	private StyleConstants() {
		// to avoid instantiation
	}
}
