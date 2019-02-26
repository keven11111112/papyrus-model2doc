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

import org.eclipse.papyrus.model2doc.odt.Activator;
import com.sun.star.beans.PropertyVetoException;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertySet;
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
		XPropertySet propertySet = UnoRuntime.queryInterface(XPropertySet.class, object);
		if (propertySet != null) {
			try {
		    	propertyValue = propertySet.getPropertyValue(propertyName);
		    }
		    catch (Exception e) {
		      Activator.log.error("Could not get property " + propertyName, e); //$NON-NLS-1$
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
					 Activator.log.error("Property " + propertyName + " argument is illegal", e); //$NON-NLS-1$
				} catch (UnknownPropertyException | PropertyVetoException | WrappedTargetException e) {
					Activator.log.error("Could not set property " + propertyName, e); //$NON-NLS-1$
				}
		}
		
	}
}
