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

import org.eclipse.core.runtime.Assert;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.odt.Activator;

import com.sun.star.beans.Property;
import com.sun.star.beans.PropertyVetoException;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertySet;
import com.sun.star.beans.XPropertySetInfo;
import com.sun.star.lang.IllegalArgumentException;
import com.sun.star.lang.WrappedTargetException;
import com.sun.star.uno.UnoRuntime;

/**
 * Utility class for PropertySet management.
 *
 */
public class PropertySetUtil {

	/**
	 * Constructor.
	 *
	 */
	private PropertySetUtil() {
		// to avoid instantiation
	}

	/**
	 * Get Property value.
	 *
	 * @param object
	 * @param propertyName
	 * @return
	 */
	public static Object getPropertyValue(Object object, String propertyName) {
		Object propertyValue = null;
		XPropertySet propertySet = null;
		if (object instanceof XPropertySet) {
			propertySet = (XPropertySet) object;
		} else {
			propertySet = UnoRuntime.queryInterface(XPropertySet.class, object);
		}
		if (propertySet != null)

		{
			try {
				propertyValue = propertySet.getPropertyValue(propertyName);
			} catch (Exception e) {
				// we don't display the expection, because it spam the console when we are debugging
				propertyValue = "Not available : exception generated"; //$NON-NLS-1$
				// Activator.log.error("Could not get property " + propertyName, e); //$NON-NLS-1$
			}
		}
		return propertyValue;
	}

	/**
	 * Set Property.
	 *
	 * @param object
	 * @param propertyName
	 * @param propertyValue
	 */
	public static void setProperty(Object object, String propertyName, Object propertyValue) {
		XPropertySet propertySet = UnoRuntime.queryInterface(XPropertySet.class, object);
		if (propertySet != null) {
			try {
				propertySet.setPropertyValue(propertyName, propertyValue);
			} catch (IllegalArgumentException e) {
				Activator.log.error("Property " + propertyName + " argument is illegal", e); //$NON-NLS-1$ //$NON-NLS-2$
			} catch (UnknownPropertyException | PropertyVetoException | WrappedTargetException e) {
				Activator.log.error("Could not set property " + propertyName, e); //$NON-NLS-1$
			}
		}
	}

	/**
	 *
	 * A method for debug purpose
	 *
	 * @param propertySet
	 *            a property set
	 * @param relativeObjectName
	 *            the name of the object for which we want explore the property set
	 */
	public static final void displayPropertySet(final XPropertySet propertySet, final String relativeObjectName) {
		Assert.isNotNull(propertySet);
		Assert.isNotNull(relativeObjectName);
		System.out.println(NLS.bind("-----------------------properties of {0}--------------------", relativeObjectName)); //$NON-NLS-1$
		XPropertySetInfo set12 = propertySet.getPropertySetInfo();
		for (Property tmp : set12.getProperties()) {
			System.out.println("prop Name " + tmp.Name); //$NON-NLS-1$
			System.out.println("prop attr " + tmp.Attributes); //$NON-NLS-1$
			System.out.println("prop type " + tmp.Type); //$NON-NLS-1$
			System.out.println("prop value " + getPropertyValue(propertySet, tmp.Name)); //$NON-NLS-1$
			System.out.println("\n"); //$NON-NLS-1$
		}
	}

	/**
	 *
	 * A method for debug purpose
	 *
	 * @param propertySet
	 *            a property set
	 * @param relativeObjectName
	 *            the name of the object for which we want explore the property set
	 */
	public static final void displayPropertySet(final Object object, final String relativeObjectName) {
		XPropertySet propertySet = UnoRuntime.queryInterface(XPropertySet.class, object);
		displayPropertySet(propertySet, relativeObjectName);
	}


	/**
	 *
	 * @param source
	 *            the source property to copy
	 * @param target
	 *            the destination property
	 */
	public static final void copyPropertySet(final XPropertySet source, final XPropertySet target) {
		final XPropertySetInfo pSetInfo = source.getPropertySetInfo();
		for (Property tmp : pSetInfo.getProperties()) {
			if (!PropertyUtil.isReadOnly(tmp)) {
				final String propName = tmp.Name;
				try {
					target.setPropertyValue(propName, getPropertyValue(source, propName));
				} catch (IllegalArgumentException | UnknownPropertyException | PropertyVetoException | WrappedTargetException e) {
					Activator.log.error(NLS.bind("An error occured during the copy of a propertySet, for the property {0}", propName), e); //$NON-NLS-1$
				}
			}
		}
	}


}
