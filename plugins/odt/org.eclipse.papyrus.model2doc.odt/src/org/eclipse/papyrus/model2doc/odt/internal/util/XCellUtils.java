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

import com.sun.star.table.BorderLine2;
import com.sun.star.table.BorderLineStyle;
import com.sun.star.table.XCell;

/**
 * Utils methods to manipulate {@link XCell}
 */
public final class XCellUtils {

	/**
	 *
	 * Constructor.
	 *
	 */
	private XCellUtils() {
		// to prevent instanciation
	}

	/**
	 * This method allows to hide the top border
	 *
	 * @param cell
	 *            the edited cell
	 */
	public static void hideTopCellBorder(final XCell cell) {
		hideCellBorder(cell, XCellConstants.TOP_BORDER);
	}

	/**
	 * This method allows to hide the bottom border
	 *
	 * @param cell
	 *            the edited cell
	 */
	public static void hideBottomCellBorder(final XCell cell) {
		hideCellBorder(cell, XCellConstants.BOTTOM_BORDER);
	}

	/**
	 * This method allows to hide the left border
	 *
	 * @param cell
	 *            the edited cell
	 */
	public static void hideLeftCellBorder(final XCell cell) {
		hideCellBorder(cell, XCellConstants.LEFT_BORDER);
	}

	/**
	 * This method allows to hide the right border
	 *
	 * @param cell
	 *            the edited cell
	 */
	public static void hideRightCellBorder(final XCell cell) {
		hideCellBorder(cell, XCellConstants.RIGHT_BORDER);
	}

	/**
	 *
	 * @param cell
	 *            the edited cell
	 * @param border
	 *            the border's name to hide (the name of the border can be
	 *            <ul>
	 *            <li>{@link XCellConstants#RIGHT_BORDER}</li>
	 *            <li>{@link XCellConstants#BOTTOM_BORDER}</li>
	 *            <li>{@link XCellConstants#LEFT_BORDER}</li>
	 *            <li>{@link XCellConstants#RIGHT_BORDER}</li>
	 *            </ul>
	 */
	public static void hideCellBorder(final XCell cell, final String border) {
		BorderLine2 borderLine = (BorderLine2) PropertySetUtil.getPropertyValue(cell, border);
		borderLine.LineStyle = BorderLineStyle.NONE;
		borderLine.LineWidth = 0;
		borderLine.InnerLineWidth = 0;
		borderLine.OuterLineWidth = 0;
		PropertySetUtil.setProperty(cell, border, borderLine);
	}
}
