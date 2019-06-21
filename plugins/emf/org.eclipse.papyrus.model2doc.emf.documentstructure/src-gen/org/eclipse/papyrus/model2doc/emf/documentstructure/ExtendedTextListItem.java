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
package org.eclipse.papyrus.model2doc.emf.documentstructure;

import org.eclipse.papyrus.model2doc.core.builtintypes.TextListItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Text List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextListItem#getDatasource <em>Datasource</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getExtendedTextListItem()
 * @model
 * @generated
 */
public interface ExtendedTextListItem extends TextListItem {
	/**
	 * Returns the value of the '<em><b>Datasource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Datasource</em>' containment reference.
	 * @see #setDatasource(DataSource)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getExtendedTextListItem_Datasource()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataSource getDatasource();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextListItem#getDatasource <em>Datasource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Datasource</em>' containment reference.
	 * @see #getDatasource()
	 * @generated
	 */
	void setDatasource(DataSource value);

} // ExtendedTextListItem
