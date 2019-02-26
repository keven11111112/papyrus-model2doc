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
package org.eclipse.papyrus.model2doc.odt.service;

/**
 * Service interface for PropertySet management.
 *
 * @since 2.0
 */
public interface PropertySetService {
	
	/**
	 * Get Property value.
	 * 
	 * @param object
	 * @param propertyName
	 * @return
	 */
	public Object getPropertyValue(Object object, String propertyName);
	
	/**
	 * Set Property.
	 * 
	 * @param object
	 * @param propertyName
	 * @param propertyValue
	 */
	public void setProperty(Object object, String propertyName, Object propertyValue);

}
