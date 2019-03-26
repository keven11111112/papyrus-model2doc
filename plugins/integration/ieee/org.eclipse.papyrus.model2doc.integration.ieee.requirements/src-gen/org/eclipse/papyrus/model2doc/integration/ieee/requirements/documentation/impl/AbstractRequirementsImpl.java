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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.AbstractRequirementCategory;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.AbstractRequirements;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEERequirementsDocumentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.impl.AbstractRequirementsImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.impl.AbstractRequirementsImpl#getReqCategory <em>Req Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRequirementsImpl extends MinimalEObjectImpl.Container implements AbstractRequirements {
	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * The default value of the '{@link #getReqCategory() <em>Req Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqCategory()
	 * @generated
	 * @ordered
	 */
	protected static final AbstractRequirementCategory REQ_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqCategory() <em>Req Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqCategory()
	 * @generated
	 * @ordered
	 */
	protected AbstractRequirementCategory reqCategory = REQ_CATEGORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IEEERequirementsDocumentationPackage.Literals.ABSTRACT_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject) base_Package;
			base_Package = (org.eclipse.uml2.uml.Package) eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__BASE_PACKAGE, oldBase_Package, base_Package));
				}
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__BASE_PACKAGE, oldBase_Package, base_Package));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRequirementCategory getReqCategory() {
		return reqCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReqCategory(AbstractRequirementCategory newReqCategory) {
		AbstractRequirementCategory oldReqCategory = reqCategory;
		reqCategory = newReqCategory == null ? REQ_CATEGORY_EDEFAULT : newReqCategory;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__REQ_CATEGORY, oldReqCategory, reqCategory));
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
		case IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__BASE_PACKAGE:
			if (resolve) {
				return getBase_Package();
			}
			return basicGetBase_Package();
		case IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__REQ_CATEGORY:
			return getReqCategory();
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
		case IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__BASE_PACKAGE:
			setBase_Package((org.eclipse.uml2.uml.Package) newValue);
			return;
		case IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__REQ_CATEGORY:
			setReqCategory((AbstractRequirementCategory) newValue);
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
		case IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__BASE_PACKAGE:
			setBase_Package((org.eclipse.uml2.uml.Package) null);
			return;
		case IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__REQ_CATEGORY:
			setReqCategory(REQ_CATEGORY_EDEFAULT);
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
		case IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__BASE_PACKAGE:
			return base_Package != null;
		case IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENTS__REQ_CATEGORY:
			return reqCategory != REQ_CATEGORY_EDEFAULT;
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
		result.append(" (reqCategory: "); //$NON-NLS-1$
		result.append(reqCategory);
		result.append(')');
		return result.toString();
	}

} //AbstractRequirementsImpl
