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
package org.eclipse.papyrus.model2doc.odt.internal.util;

/**
 * Style Constants.
 *
 */
public class StyleConstants {
	
	/**
	 * Style families.
	 */
	public static final String PAGESTYLES_FAMILY = "PageStyles"; //$NON-NLS-1$
	
	/**
	 * Style property sets.
	 */
	public static final  String STANDARD_PROPERTYSET = "Standard"; //$NON-NLS-1$
	
	/**
	 * Style properties.
	 */
	public static final String PARASTYLENAME_PROPERTY = "ParaStyleName"; //$NON-NLS-1$

	public static final String NUMBERINGSTYLENAME_PROPERTY = "NumberingStyleName"; //$NON-NLS-1$
	
	public static final String PARAADJUST_PROPERTY = "ParaAdjust"; //$NON-NLS-1$
	
	public static final String CHARPOSTURE_PROPERTY = "CharPosture"; //$NON-NLS-1$

	/**
	 * Style values.
	 */
	public static final String TITLE_STYLE_VALUE = "Title"; //$NON-NLS-1$

	public static final String HEADING_STYLE_VALUE = "Heading"; //$NON-NLS-1$

	public static final String LIST_1_STYLE_VALUE = "List 1"; //$NON-NLS-1$
	
	/**
	 * Constructor.
	 *
	 */
	private StyleConstants() {
		// to avoid instantiation
	}
}
