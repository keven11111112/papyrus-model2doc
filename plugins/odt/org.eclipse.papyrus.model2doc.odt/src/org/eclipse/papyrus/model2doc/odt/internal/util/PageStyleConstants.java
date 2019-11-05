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
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.internal.util;

/**
 * the constants used for manipulating PageStyle
 */
public final class PageStyleConstants {

	private PageStyleConstants() {
		// to prevent instanciation
	}

	/**
	 * the qualified name to use to create a PageStyle
	 */
	public static final String PAGESTYLE_INSTANCE_NAME = "com.sun.star.style.PageStyle"; //$NON-NLS-1$

	/**
	 * the container of style sheets for pages
	 */
	public static final String PAGESTYLE_FAMILY_NAME = "PageStyles"; //$NON-NLS-1$

	/*
	 * Here some existing PageStyle names
	 */

	/**
	 * This page style is provided by LibreOffice
	 */
	public static final String PAGESTYLE_NAME_STANDARD = "Standard"; //$NON-NLS-1$

	/**
	 * This page style can be created by Papyrus-Model2Doc
	 */
	public static final String PAGESTYLE_NAME_CUSTOMLANDSCAPE = "CustomLandscape"; //$NON-NLS-1$

	/*
	 * Here some useful properties to use to edit a PageStyle
	 */
	/**
	 * the width field name
	 */
	public static final String WIDTH = "Width"; //$NON-NLS-1$

	/**
	 * the height field name
	 */
	public static final String HEIGHT = "Height"; //$NON-NLS-1$

	/**
	 * the size field name
	 */
	public static final String SIZE = "Size"; //$NON-NLS-1$

	/**
	 * the isLandscape field name
	 */
	public static final String IS_LANDSCAPE = "IsLandscape"; //$NON-NLS-1$

}
