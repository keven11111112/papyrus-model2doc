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
import com.sun.star.beans.XPropertySet;
import com.sun.star.container.XNameAccess;
import com.sun.star.container.XNameContainer;
import com.sun.star.style.XStyleFamiliesSupplier;
import com.sun.star.text.XParagraphCursor;
import com.sun.star.text.XText;
import com.sun.star.text.XTextCursor;
import com.sun.star.text.XTextDocument;
import com.sun.star.text.XTextRange;
import com.sun.star.uno.UnoRuntime;

/**
 * Utility class for Style management.
 *
 */
public class StyleUtil {
	
	/**
	 * Constructor.
	 *
	 */
	private StyleUtil() {
		// to avoid instantiation
	}

	/**
	 * Apply Style.
	 * 
	 * @param xText
	 * @param propertyName
	 * @param propertyValue
	 */
	public static void applyStyle(XText xText, String propertyName, Object propertyValue) {
		XTextRange xTextRange = xText.getEnd();
		PropertySetUtil.setProperty(xTextRange, propertyName, propertyValue);
	}

	/**
	 * Apply Style Left.
	 * 
	 * @param cursor
	 * @param cursorStartPosition
	 * @param propertyName
	 * @param propertyValue
	 */
	public static void applyStyleLeft(XTextCursor cursor, int cursorStartPosition, String propertyName, Object propertyValue) {
		Object oldPropertyValue = PropertySetUtil.getPropertyValue(cursor, propertyName);

		int cursorCurrentPosition = (cursor.getText().getString()).length();
		cursor.goLeft((short) (cursorCurrentPosition - cursorStartPosition), true);

		PropertySetUtil.setProperty(cursor, propertyName, propertyValue);
		cursor.goRight((short) (cursorCurrentPosition - cursorStartPosition), false);
		PropertySetUtil.setProperty(cursor, propertyName, oldPropertyValue);
	}

	/**
	 * Apply Style to previous paragraph.
	 * 
	 * @param cursor
	 * @param propertyName
	 * @param propertyValue
	 */
	public static void applyStylePreviousParagraph(XTextCursor cursor, String propertyName, Object propertyValue) {
		Object oldPropertyValue = PropertySetUtil.getPropertyValue(cursor, propertyName);

		XParagraphCursor paragraphCursor = UnoRuntime.queryInterface(XParagraphCursor.class, cursor);
		// Select previous paragraph
		paragraphCursor.gotoPreviousParagraph(true);
		PropertySetUtil.setProperty(paragraphCursor, propertyName, propertyValue);

		// Reset
		paragraphCursor.gotoNextParagraph(false);
		PropertySetUtil.setProperty(cursor, propertyName, oldPropertyValue);
	}

	/**
	 * Get the named property set from the given style family.
	 * 
	 * @param xTextDocument
	 * @param familyStyleName
	 * @param propertySetName
	 * @return
	 */
	public static XPropertySet getStylePropertySet(XTextDocument xTextDocument, String familyStyleName, String propertySetName) {
		XNameContainer styleContainer = getStyleContainer(xTextDocument, familyStyleName);
		if (styleContainer == null)
			return null;
		else {
			XPropertySet stylePropertySet = null;
			try {
				stylePropertySet = UnoRuntime.queryInterface(XPropertySet.class, styleContainer.getByName(propertySetName));
			} catch (Exception e) {
				Activator.log.error("Could not access style porpetyset " + propertySetName, e); //$NON-NLS-1$
			}
			return stylePropertySet;
		}
	}

	/**
	 * Get the container for a specified style family name.
	 * 
	 * @param xTextDocument
	 * @param familyStyleName
	 * @return
	 */
	public static XNameContainer getStyleContainer(XTextDocument xTextDocument, String familyStyleName) {
		try {
			XStyleFamiliesSupplier xSupplier = UnoRuntime.queryInterface(XStyleFamiliesSupplier.class, xTextDocument);
			XNameAccess nameAccess = xSupplier.getStyleFamilies();
			return UnoRuntime.queryInterface(XNameContainer.class, nameAccess.getByName(familyStyleName));
		} catch (Exception e) {
			Activator.log.error("Could not access the family style " + familyStyleName, e); //$NON-NLS-1$
		}
		
		return null;
	}
}
