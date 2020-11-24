/**
 * Copyright (c) 2020 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.core.styles;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.core.styles.StylesPackage
 * @generated
 */
public interface StylesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	StylesFactory eINSTANCE = org.eclipse.papyrus.model2doc.core.styles.impl.StylesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Int Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Int Named Style</em>'.
	 * @generated
	 */
	IntNamedStyle createIntNamedStyle();

	/**
	 * Returns a new object of class '<em>String Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>String Named Style</em>'.
	 * @generated
	 */
	StringNamedStyle createStringNamedStyle();

	/**
	 * Returns a new object of class '<em>Boolean Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Boolean Named Style</em>'.
	 * @generated
	 */
	BooleanNamedStyle createBooleanNamedStyle();

	/**
	 * Returns a new object of class '<em>Double Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Double Named Style</em>'.
	 * @generated
	 */
	DoubleNamedStyle createDoubleNamedStyle();

	/**
	 * Returns a new object of class '<em>Int List Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Int List Named Style</em>'.
	 * @generated
	 */
	IntListNamedStyle createIntListNamedStyle();

	/**
	 * Returns a new object of class '<em>String List Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>String List Named Style</em>'.
	 * @generated
	 */
	StringListNamedStyle createStringListNamedStyle();

	/**
	 * Returns a new object of class '<em>Boolean List Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Boolean List Named Style</em>'.
	 * @generated
	 */
	BooleanListNamedStyle createBooleanListNamedStyle();

	/**
	 * Returns a new object of class '<em>Double List Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Double List Named Style</em>'.
	 * @generated
	 */
	DoubleListNamedStyle createDoubleListNamedStyle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	StylesPackage getStylesPackage();

} // StylesFactory
