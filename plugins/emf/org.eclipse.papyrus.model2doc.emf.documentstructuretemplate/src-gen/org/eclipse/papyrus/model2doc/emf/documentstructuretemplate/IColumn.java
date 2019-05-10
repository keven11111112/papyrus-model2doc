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
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getIColumn()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IColumn extends EObject {
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
