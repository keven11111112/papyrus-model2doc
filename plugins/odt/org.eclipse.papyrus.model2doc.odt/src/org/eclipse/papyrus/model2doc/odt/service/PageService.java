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

import com.sun.star.awt.Size;
import com.sun.star.text.XTextDocument;

/**
 * Service interface for Page management.
 *
 * @since 2.0
 */
public interface PageService {
	
	/**
	 * Get writable size.
	 * 
	 * @param xTextDocument
	 * @param familyStyleName
	 * @param propertySetName
	 * @return
	 */
	public Size getWritableSize(XTextDocument xTextDocument, String familyStyleName, String propertySetName);
	
	/**
	 * Get "Height" property name;
	 * 
	 * @return "Height"
	 */
	public String getHeightPropertyName();
	
	/**
	 * Get "Width" property name;
	 * 
	 * @return "Width"
	 */
	public String getWidthPropertyName();

	/**
	 * Get "TopMargin" property name;
	 * 
	 * @return "TopMargin"
	 */
	public String getTopMarginPropertyName();
	
	/**
	 * Get "BottomMargin" property name;
	 * 
	 * @return "BottomMargin"
	 */
	public String getBottomMarginPropertyName();
	
	/**
	 * Get "LeftMargin" property name;
	 * 
	 * @return "LeftMargin"
	 */
	public String getLeftMarginPropertyName();
	
	/**
	 * Get "RightMargin" property name;
	 * 
	 * @return "RightMargin"
	 */
	public String getRightMarginPropertyName();
}
