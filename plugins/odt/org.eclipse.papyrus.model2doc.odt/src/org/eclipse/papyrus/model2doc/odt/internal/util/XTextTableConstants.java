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

import com.sun.star.table.TableBorder2;
import com.sun.star.table.TableBorderDistances;
import com.sun.star.text.TableColumnSeparator;
import com.sun.star.text.XTextTable;

/**
 * This interface defines the constants used to edit {@link XTextTable}
 */
public interface XTextTableConstants {

	/**
	 * This string allows to create the LibreOffice TextTable (that we will adapt into {@link XTextTable}
	 */
	public static final String TEXT_TABLE = "com.sun.star.text.TextTable"; //$NON-NLS-1$

	/**
	 * This property allows to define the style of the table boder
	 * The value is a {@link TableBorder2}
	 */
	public static final String TABLE_BORDER2 = "TableBorder2"; //$NON-NLS-1$

	/**
	 * This property allows to get all column separators of the tables. We use them to define the column width
	 * The value is a an array of {@link TableColumnSeparator}
	 */
	public static final String TABLE_COLUMN_SEPARATOR = "TableColumnSeparators"; //$NON-NLS-1$

	/**
	 * This property allows to get the sum (size) of all columns width.
	 * The value is a {@link Short}
	 */
	public static final String TABLE_COLUMN_RELATIVE_SUM = "TableColumnRelativeSum"; //$NON-NLS-1$

	/**
	 * This property allows to define the distance between the border and inserted contents.
	 * The value of this property is {@link TableBorderDistances}
	 */
	public static final String TABLE_BORDER_DISTANCE = "TableBorderDistances"; //$NON-NLS-1$
}
