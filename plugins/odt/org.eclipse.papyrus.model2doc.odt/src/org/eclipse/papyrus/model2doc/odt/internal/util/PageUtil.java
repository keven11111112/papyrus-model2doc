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

import com.sun.star.awt.Size;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertySet;
import com.sun.star.lang.WrappedTargetException;
import com.sun.star.text.XTextDocument;

/**
 * Utility class for Page management.
 *
 */
public class PageUtil {

	/**
	 * Constructor.
	 *
	 */
	private PageUtil() {
		// to avoid instantiation
	}

	/**
	 * Get writable size.
	 *
	 * @param xTextDocument
	 * @param familyStyleName
	 * @param propertySetName
	 * @return
	 */
	public static Size getWritableSize(XTextDocument xTextDocument, String familyStyleName, String propertySetName) {
		XPropertySet propertySet = StyleUtil.getStylePropertySet(xTextDocument, familyStyleName, propertySetName);

		if (propertySet != null) {
			try {
				int width = ((Integer) propertySet.getPropertyValue(SizeConstants.WIDTH)).intValue();
				int height = ((Integer) propertySet.getPropertyValue(SizeConstants.HEIGHT)).intValue();
				int leftMargin = ((Integer) propertySet.getPropertyValue(SizeConstants.LEFT_MARGIN)).intValue();
				int rightMargin = ((Integer) propertySet.getPropertyValue(SizeConstants.RIGHT_MARGIN)).intValue();
				int topMargin = ((Integer) propertySet.getPropertyValue(SizeConstants.TOPMARGIN)).intValue();
				int bottomMargin = ((Integer) propertySet.getPropertyValue(SizeConstants.BOTTOM_MARGIN)).intValue();

				return new Size(width - (leftMargin + rightMargin), height - (topMargin + bottomMargin));
			} catch (UnknownPropertyException | WrappedTargetException e) {
				Activator.log.error(e);
			}
		}
		return null;
	}

}
