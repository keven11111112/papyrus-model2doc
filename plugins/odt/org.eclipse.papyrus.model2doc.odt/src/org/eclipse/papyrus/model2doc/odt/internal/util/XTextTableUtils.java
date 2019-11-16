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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.odt.Activator;

import com.sun.star.beans.PropertyVetoException;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertySet;
import com.sun.star.lang.IllegalArgumentException;
import com.sun.star.lang.WrappedTargetException;
import com.sun.star.table.TableBorder2;
import com.sun.star.table.TableBorderDistances;
import com.sun.star.table.XCell;
import com.sun.star.text.TableColumnSeparator;
import com.sun.star.text.XTextTable;
import com.sun.star.uno.UnoRuntime;

/**
 * Utils methods to manipulate {@link XTextTable}
 */
public class XTextTableUtils {

	/**
	 *
	 * Constructor.
	 *
	 */
	private XTextTableUtils() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param textTable
	 *            the edited textTable
	 * @param columnsWitdhInUnit
	 *            the list of the columns size in a user unit (typically centimeters).
	 *            This unit is indicative and the final result will be approximatively the wanted result, due to the real width of the table in the page
	 */
	public static final void setColumnsWidthInUnit(final XTextTable textTable, final List<Double> columnsWitdhInUnit) {
		double fullUnit = 0;
		for (final Double current : columnsWitdhInUnit) {
			fullUnit += current.doubleValue();
		}
		if (fullUnit != 0) {
			final List<Double> percentage = new ArrayList<>(columnsWitdhInUnit.size());
			for (int i = 0; i < columnsWitdhInUnit.size(); i++) {
				percentage.add(Double.valueOf(columnsWitdhInUnit.get(i).doubleValue() / fullUnit));
			}
			setColumnsWidth(textTable, percentage);
		} else {
			Activator.log.warn("The columns width has not been set, because you don't give us values > 0"); //$NON-NLS-1$
		}
	}

	/**
	 *
	 * @param table
	 * @param columnsSize
	 *
	 * @see https://wiki.openoffice.org/wiki/API/Samples/Java/Writer/TextTable
	 */
	public static final void setColumnsWidth(final XTextTable textTable, final List<Double> columnsInPercentage) {
		try {
			XPropertySet xPS = UnoRuntime.queryInterface(XPropertySet.class, textTable);
			Object xObj = xPS.getPropertyValue(XTextTableConstants.TABLE_COLUMN_SEPARATOR);

			short tableWidthRelative = (short) PropertySetUtil.getPropertyValue(textTable, XTextTableConstants.TABLE_COLUMN_RELATIVE_SUM);

			TableColumnSeparator[] colSep1 = UnoRuntime.queryInterface(TableColumnSeparator[].class, xObj);
			Assert.isTrue(columnsInPercentage.size() == colSep1.length + 1, NLS.bind("There are {0} column's separators for {1} width to set.", colSep1.length, columnsInPercentage.size())); //$NON-NLS-1$
			double consumedWidth = 0;
			for (int j = 0; j < colSep1.length; j++) {
				double result = columnsInPercentage.get(j) * tableWidthRelative;
				consumedWidth += result;
				colSep1[j].Position = (short) Math.ceil(consumedWidth);
			}
			xPS.setPropertyValue(XTextTableConstants.TABLE_COLUMN_SEPARATOR, colSep1);
		} catch (IllegalArgumentException | UnknownPropertyException | WrappedTargetException | PropertyVetoException e) {
			Activator.log.error(e);
		}
	}

	/**
	 *
	 * @param xTextTable
	 *            the table for which we want to define the witdh of the border
	 */
	public static final void setTableBorderWidth(final XTextTable xTextTable, final int borderWidth) {
		TableBorder2 tb2 = (TableBorder2) PropertySetUtil.getPropertyValue(xTextTable, XTextTableConstants.TABLE_BORDER2);
		tb2.LeftLine.LineWidth = borderWidth;
		tb2.RightLine.LineWidth = borderWidth;
		tb2.TopLine.LineWidth = borderWidth;
		tb2.BottomLine.LineWidth = borderWidth;

		PropertySetUtil.setProperty(xTextTable, XTextTableConstants.TABLE_BORDER2, tb2);
	}

	/**
	 * This method allows to define the distance between the table's border and the table contents
	 *
	 * @param xTextTable
	 *            the edited {@link XTextTable}
	 * @param distance
	 *            the distance between the table's border and the table contents
	 */
	public static final void setTableMarginDistance(final XTextTable xTextTable, final short distance) {
		final TableBorder2 tb2 = (TableBorder2) PropertySetUtil.getPropertyValue(xTextTable, XTextTableConstants.TABLE_BORDER2);

		tb2.LeftLine.LineDistance = distance;
		tb2.RightLine.LineDistance = distance;
		tb2.TopLine.LineDistance = distance;
		tb2.BottomLine.LineDistance = distance;

		PropertySetUtil.setProperty(xTextTable, XTextTableConstants.TABLE_BORDER2, tb2);
	}

	/**
	 * This methods allows to remove the margin between the border and the table contents
	 *
	 * @param xTextTable
	 *            the edited {@link XTextTable}
	 *
	 */
	public static final void removeTableMargin(final XTextTable xTextTable) {
		setTableMarginDistance(xTextTable, (short) 0);
	}

	/**
	 *
	 * @param xTextTable
	 *            the edited {@link XTextTable}
	 * @param border
	 *            the border's name to hide (the name of the border can be
	 *            <ul>
	 *            <li>{@link XCellConstants#RIGHT_BORDER}</li>
	 *            <li>{@link XCellConstants#BOTTOM_BORDER}</li>
	 *            <li>{@link XCellConstants#LEFT_BORDER}</li>
	 *            <li>{@link XCellConstants#RIGHT_BORDER}</li>
	 */
	public static final void hideTableBorder(final XTextTable xTextTable, final String border) {
		final List<String> cellNames = Arrays.asList(xTextTable.getCellNames());
		final Iterator<String> libreOfficeCellNamesIter = cellNames.iterator();
		while (libreOfficeCellNamesIter.hasNext()) {
			XCell cell = xTextTable.getCellByName(libreOfficeCellNamesIter.next());
			XCellUtils.hideCellBorder(cell, border);
		}
	}

	/**
	 * This method hides the top border of the table
	 *
	 * @param xTextTable
	 *            the edited {@link XTextTable}
	 */
	public static final void hideTableTopBorder(final XTextTable xTextTable) {
		hideTableBorder(xTextTable, XCellConstants.TOP_BORDER);
	}

	/**
	 * This method hides the bottom border of the table
	 *
	 * @param xTextTable
	 *            the edited {@link XTextTable}
	 */
	public static final void hideTableBottomBorder(final XTextTable xTextTable) {
		hideTableBorder(xTextTable, XCellConstants.BOTTOM_BORDER);
	}

	/**
	 * This method hides the left border of the table
	 *
	 * @param xTextTable
	 *            the edited {@link XTextTable}
	 */
	public static final void hideTableLeftBorder(final XTextTable xTextTable) {
		hideTableBorder(xTextTable, XCellConstants.LEFT_BORDER);
	}

	/**
	 * This method hides the right border of the table
	 *
	 * @param xTextTable
	 *            the edited {@link XTextTable}
	 */
	public static final void hideTableRightBorder(final XTextTable xTextTable) {
		hideTableBorder(xTextTable, XCellConstants.RIGHT_BORDER);
	}

	/**
	 * This method allows to remove the distance between the border and the table contents
	 *
	 * @param xTextTable
	 *            the edited XTextTable
	 */
	public static final void removeTableBorderDistance(final XTextTable xTextTable) {
		TableBorderDistances d = (TableBorderDistances) PropertySetUtil.getPropertyValue(xTextTable, XTextTableConstants.TABLE_BORDER_DISTANCE);
		d.BottomDistance = 0;
		d.LeftDistance = 0;
		d.RightDistance = 0;
		d.TopDistance = 0;

		PropertySetUtil.setProperty(xTextTable, XTextTableConstants.TABLE_BORDER_DISTANCE, d);

	}

}
