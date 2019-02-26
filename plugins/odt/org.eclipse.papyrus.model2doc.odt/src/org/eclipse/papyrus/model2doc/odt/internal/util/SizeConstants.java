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
 * Size Constants.
 *
 */
public class SizeConstants {
	
	/**
	 * Property names.
	 */
	public static final String WIDTH = "Width"; //$NON-NLS-1$
	
	public static final String HEIGHT = "Height"; //$NON-NLS-1$
	
	public static final String TOPMARGIN = "TopMargin"; //$NON-NLS-1$
	
	public static final String BOTTOM_MARGIN = "BottomMargin"; //$NON-NLS-1$
	
	public static final String LEFT_MARGIN = "LeftMargin"; //$NON-NLS-1$
	
	public static final String RIGHT_MARGIN = "RightMargin"; //$NON-NLS-1$
	
	/** Measuring Image's size by 1/100 mm. It is very useful for scaling image. */
	public static final String SIZE100TH_MM = "Size100thMM"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	private SizeConstants() {
		// to avoid instantiation
	}
	
}
