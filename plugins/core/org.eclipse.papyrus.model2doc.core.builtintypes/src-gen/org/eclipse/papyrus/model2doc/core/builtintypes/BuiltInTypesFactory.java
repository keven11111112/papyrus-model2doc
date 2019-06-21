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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage
 * @generated
 */
public interface BuiltInTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	BuiltInTypesFactory eINSTANCE = org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Basic Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Basic Table</em>'.
	 * @generated
	 */
	BasicTable createBasicTable();

	/**
	 * Returns a new object of class '<em>Basic Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Basic Row</em>'.
	 * @generated
	 */
	BasicRow createBasicRow();

	/**
	 * Returns a new object of class '<em>Text Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Text Cell</em>'.
	 * @generated
	 */
	TextCell createTextCell();

	/**
	 * Returns a new object of class '<em>Text List Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Text List Item</em>'.
	 * @generated
	 */
	TextListItem createTextListItem();

	/**
	 * Returns a new object of class '<em>Basic List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Basic List</em>'.
	 * @generated
	 */
	BasicList createBasicList();

	/**
	 * Returns a new object of class '<em>Default File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Default File Reference</em>'.
	 * @generated
	 */
	DefaultFileReference createDefaultFileReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	BuiltInTypesPackage getBuiltInTypesPackage();

} // BuiltInTypesFactory
