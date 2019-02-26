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

import com.sun.star.beans.XPropertySet;
import com.sun.star.container.XNameContainer;
import com.sun.star.text.XText;
import com.sun.star.text.XTextCursor;
import com.sun.star.text.XTextDocument;

/**
 * Service interface for Style management.
 *
 * @since 2.0
 * 
 */
public interface StyleService {


	/**
	 * Apply Style.
	 * 
	 * @param xText
	 * @param propertyName
	 * @param propertyValue
	 */
	public void applyStyle(XText xText, String propertyName, Object propertyValue);

	/**
	 * Apply Style Left.
	 * 
	 * @param cursor
	 * @param cursorStartPosition
	 * @param propertyName
	 * @param propertyValue
	 */
	public void applyStyleLeft(XTextCursor cursor, int cursorStartPosition, String propertyName, Object propertyValue);

	/**
	 * Apply Style to previous paragraph.
	 * 
	 * @param cursor
	 * @param propertyName
	 * @param propertyValue
	 */
	public void applyStylePreviousParagraph(XTextCursor cursor, String propertyName, Object propertyValue);

	/**
	 * Get the named property set from the given style family.
	 * 
	 * @param xTextDocument
	 * @param familyStyleName
	 * @param propertySetName
	 * @return
	 */
	public XPropertySet getStylePropertySet(XTextDocument xTextDocument, String familyStyleName, String propertySetName);

	/**
	 * Get the container for a specified style family name.
	 * 
	 * @param xTextDocument
	 * @param familyStyleName
	 * @return
	 */
	public XNameContainer getStyleContainer(XTextDocument xTextDocument, String familyStyleName);

	/**
	 * Get "PageStyles" family name.
	 * 
	 * @returnb "PageStyles"
	 */
	public String getPageStylesFamilyName();

	/**
	 * Get "Standard" PropertySet name.
	 * 
	 * @return "Standard"
	 */
	public String getStandardPropertySetName();

	/**
	 * Get "ParaStyleName" property name.
	 * 
	 * @return "ParaStyleName"
	 */
	public String getParaStyleNamePropertyName();

	/**
	 * Get "NumberStyleName" property name.
	 * 
	 * @return "NumberStyleName"
	 */
	public String getNumberStyleNamePropertyName();

	/**
	 * Get "ParaAdjust" property name.
	 * 
	 * @return "ParaAdjust"
	 */
	public String getParaAdjustPropertyName();

	/**
	 * Get "CharPorture" property name.
	 * 
	 * @return "CharPorture"
	 */
	public String getCharPorturePropertyName();

	/**
	 * Get "TitleStyle" value.
	 * 
	 * @return "TitleStyle"
	 */
	public String getTitleStyleValue();

	/**
	 * Get "HeadingStyle" value.
	 * 
	 * @return "HeadingStyle"
	 */
	public String getHeadingStyleValue();

	/**
	 * Get "ListStyle" value.
	 * 
	 * @return "ListStyle"
	 */
	public String getList1StyleValue();
}
