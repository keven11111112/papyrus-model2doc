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
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.internal.editor;

import com.sun.star.beans.PropertyValue;

/**
 * Name of properties ({@link PropertyValue}) used by the save action
 */
public final class StorePropertiesConstants {

	/**
	 *
	 * Constructor.
	 *
	 */
	private StorePropertiesConstants() {
		// to prevent instanciation
	}

	/**
	 * Constant indicating if the save can overwrite or not an existing file
	 * (seem bugged setting it to false?!).
	 * The value type is {@link Boolean}
	 */
	public static final String OVERWRITE = "Overwrite"; //$NON-NLS-1$

	/**
	 * Constant indicating which method must be used to save the file
	 * The value type is a String (see {@link ODTFilterName})
	 */
	public static final String FILTER_NAME = "FilterName"; //$NON-NLS-1$

	/**
	 * Constant used to define parameters for the save, according to the save type (output file extension)
	 * The value type is an array of {@link PropertyValue}
	 */
	public static final String FILTER_DATA = "FilterData"; //$NON-NLS-1$

}
