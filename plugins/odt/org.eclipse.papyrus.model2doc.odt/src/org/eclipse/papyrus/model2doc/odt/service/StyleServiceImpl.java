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

import org.eclipse.papyrus.model2doc.odt.internal.util.StyleConstants;
import org.eclipse.papyrus.model2doc.odt.internal.util.StyleUtil;
import com.sun.star.beans.XPropertySet;
import com.sun.star.container.XNameContainer;
import com.sun.star.text.XText;
import com.sun.star.text.XTextCursor;
import com.sun.star.text.XTextDocument;

/**
 * Implemented service class for Style management.
 *
 * @since 2.0
 * 
 */
public class StyleServiceImpl implements StyleService {

	@Override
	public void applyStyle(XText xText, String propertyName, Object propertyValue) {
		StyleUtil.applyStyle(xText, propertyName, propertyValue);
	}

	@Override
	public void applyStyleLeft(XTextCursor cursor, int cursorStartPosition, String propertyName, Object propertyValue) {
		StyleUtil.applyStyleLeft(cursor, cursorStartPosition, propertyName, propertyValue);
	}

	@Override
	public void applyStylePreviousParagraph(XTextCursor cursor, String propertyName, Object propertyValue) {
		StyleUtil.applyStylePreviousParagraph(cursor, propertyName, propertyValue);
	}

	@Override
	public XPropertySet getStylePropertySet(XTextDocument xTextDocument, String familyStyleName, String propertySetName) {
		return StyleUtil.getStylePropertySet(xTextDocument, familyStyleName, propertySetName);
	}

	@Override
	public XNameContainer getStyleContainer(XTextDocument xTextDocument, String familyStyleName) {
		return StyleUtil.getStyleContainer(xTextDocument, familyStyleName);
	}

	@Override
	public String getPageStylesFamilyName() {
		return StyleConstants.PAGESTYLES_FAMILY;
	}

	@Override
	public String getStandardPropertySetName() {
		return StyleConstants.STANDARD_PROPERTYSET;
	}

	@Override
	public String getParaStyleNamePropertyName() {
		return StyleConstants.PARASTYLENAME_PROPERTY;
	}

	@Override
	public String getNumberStyleNamePropertyName() {
		return StyleConstants.NUMBERINGSTYLENAME_PROPERTY;
	}

	@Override
	public String getParaAdjustPropertyName() {
		return StyleConstants.PARAADJUST_PROPERTY;
	}

	@Override
	public String getCharPorturePropertyName() {
		return StyleConstants.CHARPOSTURE_PROPERTY;
	}

	@Override
	public String getTitleStyleValue() {
		return StyleConstants.TITLE_STYLE_VALUE;
	}

	@Override
	public String getHeadingStyleValue() {
		return StyleConstants.HEADING_STYLE_VALUE;
	}

	@Override
	public String getList1StyleValue() {
		return StyleConstants.LIST_1_STYLE_VALUE;
	}

}
