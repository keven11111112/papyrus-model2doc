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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITable View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView#getColumns <em>Columns</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView#isGenerateRowHeader <em>Generate Row Header</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView#isGenerateColumnHeader <em>Generate Column Header</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getITableView()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ITableView extends ILeafBodyPartTemplate, ITemplatePartView {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getITableView_Columns()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Generate Row Header</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating if a Row Header must be generated or not.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Generate Row Header</em>' attribute.
	 * @see #setGenerateRowHeader(boolean)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getITableView_GenerateRowHeader()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isGenerateRowHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView#isGenerateRowHeader <em>Generate Row Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Generate Row Header</em>' attribute.
	 * @see #isGenerateRowHeader()
	 * @generated
	 */
	void setGenerateRowHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Column Header</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating if a Column Header must be generated or not.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Generate Column Header</em>' attribute.
	 * @see #setGenerateColumnHeader(boolean)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getITableView_GenerateColumnHeader()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isGenerateColumnHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView#isGenerateColumnHeader <em>Generate Column Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Generate Column Header</em>' attribute.
	 * @see #isGenerateColumnHeader()
	 * @generated
	 */
	void setGenerateColumnHeader(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the elements to use as row from the context element given in parameter.
	 * <!-- end-model-doc -->
	 *
	 * @model ordered="false" contextRequired="true" contextOrdered="false"
	 * @generated
	 */
	EList<EObject> getRows(EObject context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates the label for the row header, from the rowElement given as parameter.
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false" rowElementRequired="true" rowElementOrdered="false"
	 * @generated
	 */
	String buildRowHeaderLabel(EObject rowElement);

} // ITableView
