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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IColumn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn#getCustomColumnTitle <em>Custom Column Title</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getIColumn()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Custom Column Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A custom title to use for the column.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Custom Column Title</em>' attribute.
	 * @see #setCustomColumnTitle(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getIColumn_CustomColumnTitle()
	 * @model ordered="false"
	 * @generated
	 */
	String getCustomColumnTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn#getCustomColumnTitle <em>Custom Column Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Custom Column Title</em>' attribute.
	 * @see #getCustomColumnTitle()
	 * @generated
	 */
	void setCustomColumnTitle(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the title to use for this column.
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String buildColumnHeaderLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the value of the cell. This value is deduced from the element represented by the column and from the row element given as parameter).
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false" rowRequired="true" rowOrdered="false"
	 * @generated
	 */
	Object getCellValue(EObject row);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates the label from the cell value given as parameter.
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false" cellElementRequired="true" cellElementOrdered="false"
	 * @generated
	 */
	String buildCellLabel(Object cellElement);

} // IColumn
