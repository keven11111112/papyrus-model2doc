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

import com.sun.star.table.BorderLine;
import com.sun.star.table.BorderLine2;
import com.sun.star.table.XCell;

/**
 * Constants used to manipulate {@link XCell}
 */
public interface XCellConstants {

	/**
	 * The right border property name. The value will be a {@link BorderLine} (or a {@link BorderLine2})
	 */
	public static final String RIGHT_BORDER = "RightBorder"; //$NON-NLS-1$

	/**
	 * The left border property name. The value will be a {@link BorderLine} (or a {@link BorderLine2})
	 */
	public static final String LEFT_BORDER = "LeftBorder"; //$NON-NLS-1$

	/**
	 * The top border property name. The value will be a {@link BorderLine} (or a {@link BorderLine2})
	 */
	public static final String TOP_BORDER = "TopBorder"; //$NON-NLS-1$

	/**
	 * The bottom border property name. The value will be a {@link BorderLine} (or a {@link BorderLine2})
	 */
	public static final String BOTTOM_BORDER = "BottomBorder"; //$NON-NLS-1$
}
