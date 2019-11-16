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

import org.eclipse.papyrus.model2doc.odt.Activator;
import org.eclipse.papyrus.model2doc.odt.internal.editor.ODTEditor;

import com.sun.star.beans.PropertyVetoException;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertySet;
import com.sun.star.lang.IllegalArgumentException;
import com.sun.star.lang.WrappedTargetException;
import com.sun.star.lang.XMultiServiceFactory;
import com.sun.star.text.XTextCursor;
import com.sun.star.text.XTextField;
import com.sun.star.uno.Exception;
import com.sun.star.uno.UnoRuntime;

/**
 * This class contains useful methods to add the current page number and the total page number
 * somewhere in the document
 */
public class PageNumberUtils {

	/**
	 * The string value to create a page number
	 */
	public static final String TEXTFIELD_PAGE_NUMBER = "com.sun.star.text.textfield.PageNumber"; //$NON-NLS-1$

	/**
	 * The string value to create a page count
	 */
	public static final String TEXTFIELD_PAGE_COUNT = "com.sun.star.text.textfield.PageCount"; //$NON-NLS-1$

	/**
	 * The name of the property used to define how must be done the numbering.
	 * Values are givent by the enumeration {@link com.sun.star.style.NumberingType}
	 */
	public static final String NUMBERING_TYPE = "NumberingType"; //$NON-NLS-1$

	/**
	 *
	 * Constructor.
	 *
	 */
	private PageNumberUtils() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param xTextCursor
	 *            the xTextCuror
	 * @param odtEditor
	 *            the odtEditor
	 */
	public static final void addPageNumberOnTotalPages(final XTextCursor xTextCursor, final ODTEditor odtEditor) {
		addPageNumberOnTotalPages(xTextCursor, odtEditor, "page: "); //$NON-NLS-1$
	}

	/**
	 *
	 * @param xTextCursor
	 *            the {@link XTextCursor} to use to set the page number properties
	 * @param odtEditor
	 *            the {@link ODTEditor}
	 * @param pageFieldLabel
	 *            the label used to insert the page's number The result will be : "pageFieldLabel currentPageNumber/totalPageNumber"
	 */
	public static final void addPageNumberOnTotalPages(final XTextCursor xTextCursor, final ODTEditor odtEditor, final String pageFieldLabel) {
		XMultiServiceFactory xMultiServiceFactory = odtEditor.getXMultiServiceFactory();
		try {
			final Object textFieldPageNumber = xMultiServiceFactory.createInstance(TEXTFIELD_PAGE_NUMBER);
			final XTextField f = UnoRuntime.queryInterface(XTextField.class, textFieldPageNumber);
			XPropertySet textFieldSetExpressionPropertySet = UnoRuntime.queryInterface(XPropertySet.class, f);
			textFieldSetExpressionPropertySet.setPropertyValue(NUMBERING_TYPE, com.sun.star.style.NumberingType.ARABIC);

			if (pageFieldLabel != null) {
				xTextCursor.getText().insertString(xTextCursor, pageFieldLabel, false);
			}
			xTextCursor.getText().insertTextContent(xTextCursor, f, false);

			Object textFieldPageCount = xMultiServiceFactory.createInstance(TEXTFIELD_PAGE_COUNT);
			XTextField pageCount = UnoRuntime.queryInterface(XTextField.class, textFieldPageCount);
			XPropertySet pageCountExpressionPropertySet = UnoRuntime.queryInterface(XPropertySet.class, pageCount);
			pageCountExpressionPropertySet.setPropertyValue(NUMBERING_TYPE, com.sun.star.style.NumberingType.ARABIC);
			xTextCursor.getText().insertString(xTextCursor, "/", false); //$NON-NLS-1$
			xTextCursor.getText().insertTextContent(xTextCursor, pageCount, false);
		} catch (IllegalArgumentException | UnknownPropertyException | PropertyVetoException | WrappedTargetException e) {
			Activator.log.error(e);
		} catch (Exception e) {
			Activator.log.error(e);
		}
	}


}
