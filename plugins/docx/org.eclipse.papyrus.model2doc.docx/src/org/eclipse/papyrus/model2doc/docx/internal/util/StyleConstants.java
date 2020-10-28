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
	 * Style families.
	 */
	// public static final String PAGESTYLES_FAMILY = "PageStyles"; //$NON-NLS-1$
	//

	/**
	 * Style values.
	 *
	 * WARNING : since a bug in {@link XWPFDocument.createTOC()} the style should
	 * have a name bigger than 7 characters and if it should be reference in the TOC
	 * it should start with "Heading" ({@link https://bz.apache.org/bugzilla/show_bug.cgi?id=55196})
	 */
	public static final String TITLE_STYLE_VALUE = "Heading"; //$NON-NLS-1$

	public static final String HEADING_STYLE_VALUE = "Heading"; //$NON-NLS-1$

	public static final String TABLE_STYLE_VALUE = "Grilledutableau"; //$NON-NLS-1$

	// public static final String LIST_1_STYLE_VALUE = "List 1"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	private StyleConstants() {
		// to avoid instantiation
	}
}
