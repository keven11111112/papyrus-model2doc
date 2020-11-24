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
package org.eclipse.papyrus.model2doc.core.styles.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.model2doc.core.styles.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StylesFactoryImpl extends EFactoryImpl implements StylesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static StylesFactory init() {
		try {
			StylesFactory theStylesFactory = (StylesFactory) EPackage.Registry.INSTANCE.getEFactory(StylesPackage.eNS_URI);
			if (theStylesFactory != null) {
				return theStylesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StylesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public StylesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StylesPackage.INT_NAMED_STYLE:
			return createIntNamedStyle();
		case StylesPackage.STRING_NAMED_STYLE:
			return createStringNamedStyle();
		case StylesPackage.BOOLEAN_NAMED_STYLE:
			return createBooleanNamedStyle();
		case StylesPackage.DOUBLE_NAMED_STYLE:
			return createDoubleNamedStyle();
		case StylesPackage.INT_LIST_NAMED_STYLE:
			return createIntListNamedStyle();
		case StylesPackage.STRING_LIST_NAMED_STYLE:
			return createStringListNamedStyle();
		case StylesPackage.BOOLEAN_LIST_NAMED_STYLE:
			return createBooleanListNamedStyle();
		case StylesPackage.DOUBLE_LIST_NAMED_STYLE:
			return createDoubleListNamedStyle();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IntNamedStyle createIntNamedStyle() {
		IntNamedStyleImpl intNamedStyle = new IntNamedStyleImpl();
		return intNamedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StringNamedStyle createStringNamedStyle() {
		StringNamedStyleImpl stringNamedStyle = new StringNamedStyleImpl();
		return stringNamedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BooleanNamedStyle createBooleanNamedStyle() {
		BooleanNamedStyleImpl booleanNamedStyle = new BooleanNamedStyleImpl();
		return booleanNamedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DoubleNamedStyle createDoubleNamedStyle() {
		DoubleNamedStyleImpl doubleNamedStyle = new DoubleNamedStyleImpl();
		return doubleNamedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IntListNamedStyle createIntListNamedStyle() {
		IntListNamedStyleImpl intListNamedStyle = new IntListNamedStyleImpl();
		return intListNamedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StringListNamedStyle createStringListNamedStyle() {
		StringListNamedStyleImpl stringListNamedStyle = new StringListNamedStyleImpl();
		return stringListNamedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BooleanListNamedStyle createBooleanListNamedStyle() {
		BooleanListNamedStyleImpl booleanListNamedStyle = new BooleanListNamedStyleImpl();
		return booleanListNamedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DoubleListNamedStyle createDoubleListNamedStyle() {
		DoubleListNamedStyleImpl doubleListNamedStyle = new DoubleListNamedStyleImpl();
		return doubleListNamedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StylesPackage getStylesPackage() {
		return (StylesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StylesPackage getPackage() {
		return StylesPackage.eINSTANCE;
	}

} // StylesFactoryImpl
