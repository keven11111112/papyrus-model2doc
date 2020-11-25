/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.styles;

/**
 * This class list every style available
 */
public final class NamedStyleConstants {

	/**
	 * Merge the cell with the cell just in the right
	 *
	 * This style can be apply on Cell
	 * This style wait for a boolean value
	 */
	public static final String MERGED_WITH_RIGHT_CELL = "mergedWithRightCell"; //$NON-NLS-1$

	/**
	 * Merge the cell with the cell just in the bottom
	 *
	 * This style can be apply on Cell
	 * This style wait for a boolean value
	 */
	public static final String MERGED_WITH_BOTTOM_CELL = "mergedWithBottomCell"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	private NamedStyleConstants() {
		// avoid instantiation
	}
}
