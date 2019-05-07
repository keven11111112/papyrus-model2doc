/**
 * Copyright (c) 2019 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.core.builtintypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract class used to represent a Table in the Model2Doc API.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getCaption <em>Caption</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getAbstractTable()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The caption of the table.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getAbstractTable_Caption()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.model2doc.core.builtintypes.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rows owned by the table.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getAbstractTable_Rows()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Row> getRows();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the numbers of rows of the table.
	 * <!-- end-model-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getRows().size();'"
	 * @generated
	 */
	int getRowsNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the number of columns of the table.
	 * <!-- end-model-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getRowsNumber() &gt; 0) {\n\t// we assume all rows have the same number of cells.\n\tfinal Row firstRow = getRows().get(0);\n\tif (null != firstRow) {\n\t\treturn
	 *        firstRow.getCells().size();\n\t}\n}\nreturn 0;'"
	 * @generated
	 */
	int getColumnsNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns all Cells as a List. This list concatenates the Cells Row by Row. So for a table with 3 columns and 5 rows.
	 * The 3 first cells will represents the first row, then the cell, 4, 5 and 6, will represents the 2 rows, and so on.
	 * <!-- end-model-doc -->
	 *
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final java.util.List&lt;Cell&gt; cells = new java.util.ArrayList&lt;Cell&gt;();\nfor (final Row row : getRows()) {\n\tcells.addAll(row.getCells());\n}\nreturn
	 *        org.eclipse.emf.common.util.ECollections.asEList(cells);\n'"
	 * @generated
	 */
	EList<Cell> getAllCells();

} // AbstractTable
