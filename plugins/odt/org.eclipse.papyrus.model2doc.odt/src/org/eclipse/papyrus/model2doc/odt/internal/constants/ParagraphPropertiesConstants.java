/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.internal.constants;

/**
 * This class groups the Constants used by Papyrus-Model2Doc and applicable on Paragraph
 *
 * see LibreOffice documentation here: https://api.libreoffice.org/docs/idl/ref/servicecom_1_1sun_1_1star_1_1style_1_1ParagraphProperties.html
 */
public class ParagraphPropertiesConstants {

	private ParagraphPropertiesConstants() {
		// to prevent instanciation
	}

	/**
	 * This constant is used to manage the indentation of paragraph elements
	 * The value type is short
	 */
	public static final String NUMBERING_LEVEL = "NumberingLevel"; //$NON-NLS-1$

	/**
	 * This constant is used to manage the numbering style
	 * The value type is String
	 */
	public static final String NUMBERING_STYLE = "NumberingStyleName"; //$NON-NLS-1$

	/**
	 * determines the top margin of the paragraph in 100th mm
	 * The value type is long
	 */
	public static final String PARA_TOP_MARGIN = "ParaTopMargin"; //$NON-NLS-1$

	/**
	 * determines the bottom margin of the paragraph in 100th mm
	 * The value type is long
	 */
	public static final String PARA_BOTTOM_MARGIN = "ParaBottomMargin"; //$NON-NLS-1$
}
