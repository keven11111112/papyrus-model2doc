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

import org.eclipse.papyrus.model2doc.odt.internal.util.PropertySetUtil;

/**
 * Implemented service class for PropertySet management.
 * 
 * @since 2.0
 *
 */
public class PropertySetServiceImpl implements PropertySetService {

	@Override
	public Object getPropertyValue(Object object, String propertyName) {
		return PropertySetUtil.getPropertyValue(object, propertyName);
	}

	@Override
	public void setProperty(Object object, String propertyName, Object propertyValue) {
		PropertySetUtil.setProperty(object, propertyName, propertyValue);
	}

}
