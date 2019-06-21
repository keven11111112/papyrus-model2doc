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
	 * @generated
	 */
	EList<Cell> getAllCells();

} // AbstractTable
