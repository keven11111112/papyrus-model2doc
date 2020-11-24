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

package org.eclipse.papyrus.model2doc.core.styles.internal.operations;

import java.util.List;

import org.eclipse.papyrus.model2doc.core.styles.NamedStyle;

/**
 * This class provide method to about Styles
 */
public final class NamedStyleOperations {

	/**
	 * Singleton of this class
	 */
	public static final NamedStyleOperations INSTANCE = new NamedStyleOperations();

	/**
	 *
	 * Constructor.
	 * protected to allow to extend this class if required
	 */
	protected NamedStyleOperations() {
		// nothing to do
	}

	/**
	 *
	 * @param namedStyles
	 *            a list of named style
	 * @param name
	 *            the name of the wanted named style
	 * @return
	 *         the first found named style or <code>null</code>
	 */
	public NamedStyle getNamedStyle(final List<NamedStyle> namedStyles, final String name) {
		if (namedStyles != null && name != null) {
			return namedStyles.stream().filter(ns -> name.equals(ns.getName())).findFirst().orElse(null);
		}
		return null;
	}


}
