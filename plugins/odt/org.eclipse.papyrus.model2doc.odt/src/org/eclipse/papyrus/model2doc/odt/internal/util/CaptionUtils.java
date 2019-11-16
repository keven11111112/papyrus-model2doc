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

import com.sun.star.beans.XPropertySet;
import com.sun.star.container.XNameAccess;
import com.sun.star.lang.XMultiServiceFactory;
import com.sun.star.text.XDependentTextField;
import com.sun.star.text.XTextCursor;
import com.sun.star.text.XTextFieldsSupplier;
import com.sun.star.uno.UnoRuntime;
import com.sun.star.util.NumberFormat;

/**
 * This class provides methods related to {@link XTextFieldsSupplier} and others to create and insert caption
 */
public class CaptionUtils {

	/**
	 * This string allows to create a master SetExpression for figure
	 */
	public static final String TEXT_FIELDMASTER_SET_EXPRESSION_FIGURE = "com.sun.star.text.fieldmaster.SetExpression.Figure"; //$NON-NLS-1$

	/**
	 * This string allows to create the dependant expression to get the figure number
	 */
	public static final String TEXTFIELD_SET_EXPRESSION = "com.sun.star.text.textfield.SetExpression"; //$NON-NLS-1$

	private CaptionUtils() {
		// to prevent instanciation
	}

	/**
	 * This method allows to write the caption of the figure
	 *
	 * @param xTextCursor
	 *            the xTextCursor to use to create the caption
	 * @param caption
	 *            the caption text itself
	 * @param odtEditor
	 *            the odtEditor to use to get the services
	 */
	public static final void writeFigureCaption(final XTextCursor xTextCursor, final String caption, final ODTEditor odtEditor) {
		try {
			// managing the caption, we need a text field master
			XTextFieldsSupplier supplier = UnoRuntime.queryInterface(XTextFieldsSupplier.class, odtEditor.getXTextDocument());
			XNameAccess masters = supplier.getTextFieldMasters();
			Object masterSetExpressionForFigure = masters.getByName(TEXT_FIELDMASTER_SET_EXPRESSION_FIGURE);

			// create a dependent SetExpression
			XMultiServiceFactory xMultiServiceFactory = odtEditor.getXMultiServiceFactory();
			Object textFieldSetExpression = xMultiServiceFactory.createInstance(TEXTFIELD_SET_EXPRESSION);

			XPropertySet textFieldSetExpressionPropertySet = UnoRuntime.queryInterface(XPropertySet.class, textFieldSetExpression);
			textFieldSetExpressionPropertySet.setPropertyValue("NumberingType", com.sun.star.style.NumberingType.ARABIC); //$NON-NLS-1$
			textFieldSetExpressionPropertySet.setPropertyValue("NumberFormat", NumberFormat.NUMBER); //$NON-NLS-1$
			textFieldSetExpressionPropertySet.setPropertyValue("Content", "Figure + 1"); //$NON-NLS-1$ //$NON-NLS-2$
			XDependentTextField xDependeantTextField = UnoRuntime.queryInterface(XDependentTextField.class, textFieldSetExpression);

			// attach the dependent SetExpression to its master
			xDependeantTextField.attachTextFieldMaster(UnoRuntime.queryInterface(XPropertySet.class, masterSetExpressionForFigure));

			xTextCursor.getText().insertString(xTextCursor, "Figure ", false); //$NON-NLS-1$

			// insert the SetExpression
			xTextCursor.getText().insertTextContent(xTextCursor, xDependeantTextField, true);


			if (caption != null && !caption.isEmpty()) {
				xTextCursor.getText().insertString(xTextCursor, ": " + caption, false); //$NON-NLS-1$
			}
		} catch (com.sun.star.uno.Exception e) {
			Activator.log.error(e);
		}
	}
}
