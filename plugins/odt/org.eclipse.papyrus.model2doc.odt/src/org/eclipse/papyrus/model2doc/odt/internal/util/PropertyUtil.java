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

import com.sun.star.beans.Property;
import com.sun.star.beans.PropertyAttribute;

/**
 * @see https://api.libreoffice.org/docs/idl/ref/namespacecom_1_1sun_1_1star_1_1beans_1_1PropertyAttribute.html for documentation
 */
public class PropertyUtil {

	/**
	 *
	 * @param property
	 * @return
	 */
	public static final boolean isMayBeVoid(final Property property) {
		return isProperty(property, PropertyAttribute.MAYBEVOID);
	}

	/**
	 *
	 * @param property
	 * @return
	 */
	public static final boolean isBound(final Property property) {
		return isProperty(property, PropertyAttribute.BOUND);
	}

	/**
	 *
	 * @param property
	 * @return
	 */
	public static final boolean isConstrained(final Property property) {
		return isProperty(property, PropertyAttribute.CONSTRAINED);
	}

	/**
	 *
	 * @param property
	 * @return
	 */
	public static final boolean isTransient(final Property property) {
		return isProperty(property, PropertyAttribute.TRANSIENT);
	}

	/**
	 *
	 * @param property
	 * @return
	 */
	public static final boolean isReadOnly(final Property property) {
		return isProperty(property, PropertyAttribute.READONLY);
	}

	/**
	 *
	 * @param property
	 * @return
	 */
	public static final boolean isMayBeAmbiguous(final Property property) {
		return isProperty(property, PropertyAttribute.MAYBEAMBIGUOUS);
	}

	/**
	 *
	 * @param property
	 * @return
	 */
	public static final boolean isMayBeDefault(final Property property) {
		return isProperty(property, PropertyAttribute.MAYBEDEFAULT);
	}

	/**
	 *
	 * @param property
	 * @return
	 */
	public static final boolean isRemovable(final Property property) {
		return isProperty(property, PropertyAttribute.REMOVABLE);
	}

	/**
	 *
	 * @param property
	 * @return
	 */
	public static final boolean isOptional(final Property property) {
		return isProperty(property, PropertyAttribute.OPTIONAL);
	}


	/**
	 *
	 * @param property
	 *            a property
	 * @param tag
	 *            the property value to test
	 * @return
	 *         <code>true</code> if the property matches the tag and <code>false</code> otherwise
	 */
	private static final boolean isProperty(final Property property, final short tag) {
		return tag == (property.Attributes & tag);
	}
}
