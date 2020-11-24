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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.papyrus.model2doc.core.styles.DoubleListNamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double List Named Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.styles.impl.DoubleListNamedStyleImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.styles.impl.DoubleListNamedStyleImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleListNamedStyleImpl extends MinimalEObjectImpl.Container implements DoubleListNamedStyle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DoubleListNamedStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylesPackage.Literals.DOUBLE_LIST_NAMED_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.DOUBLE_LIST_NAMED_STYLE__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Double> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<>(Double.class, this, StylesPackage.DOUBLE_LIST_NAMED_STYLE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StylesPackage.DOUBLE_LIST_NAMED_STYLE__NAME:
			return getName();
		case StylesPackage.DOUBLE_LIST_NAMED_STYLE__VALUES:
			return getValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StylesPackage.DOUBLE_LIST_NAMED_STYLE__NAME:
			setName((String) newValue);
			return;
		case StylesPackage.DOUBLE_LIST_NAMED_STYLE__VALUES:
			getValues().clear();
			getValues().addAll((Collection<? extends Double>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StylesPackage.DOUBLE_LIST_NAMED_STYLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StylesPackage.DOUBLE_LIST_NAMED_STYLE__VALUES:
			getValues().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StylesPackage.DOUBLE_LIST_NAMED_STYLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StylesPackage.DOUBLE_LIST_NAMED_STYLE__VALUES:
			return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", values: "); //$NON-NLS-1$
		result.append(values);
		result.append(')');
		return result.toString();
	}

} // DoubleListNamedStyleImpl
