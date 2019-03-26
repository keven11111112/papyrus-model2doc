/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEEFunctionalRequirements;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEERequirementsDocumentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEEE Functional Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.impl.IEEEFunctionalRequirementsImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IEEEFunctionalRequirementsImpl extends IEEERequirementsImpl implements IEEEFunctionalRequirements {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final int MODE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected int mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEEEFunctionalRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IEEERequirementsDocumentationPackage.Literals.IEEE_FUNCTIONAL_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(int newMode) {
		int oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, IEEERequirementsDocumentationPackage.IEEE_FUNCTIONAL_REQUIREMENTS__MODE, oldMode, mode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IEEERequirementsDocumentationPackage.IEEE_FUNCTIONAL_REQUIREMENTS__MODE:
			return getMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IEEERequirementsDocumentationPackage.IEEE_FUNCTIONAL_REQUIREMENTS__MODE:
			setMode((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case IEEERequirementsDocumentationPackage.IEEE_FUNCTIONAL_REQUIREMENTS__MODE:
			setMode(MODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case IEEERequirementsDocumentationPackage.IEEE_FUNCTIONAL_REQUIREMENTS__MODE:
			return mode != MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mode: "); //$NON-NLS-1$
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //IEEEFunctionalRequirementsImpl
