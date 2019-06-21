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
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Interface to use to create new kind of ListItem
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.builtintypes.ListItem#getSubItems <em>Sub Items</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getListItem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ListItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.model2doc.core.builtintypes.ListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property allows us to make items with children called subItems.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Sub Items</em>' containment reference list.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getListItem_SubItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getSubItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation returns the level of the ListItem. Default value is 1;
	 * <!-- end-model-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getLevel();

} // ListItem
