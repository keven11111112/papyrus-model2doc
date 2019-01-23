/**
 * Copyright (c) 2018 CEA LIST.
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
package org.eclipse.papyrus.model2doc.documentstructure.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.model2doc.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.documentstructure.EObjectFeatureTextSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject Feature Text Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.impl.EObjectFeatureTextSourceImpl#getEobject <em>Eobject</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.impl.EObjectFeatureTextSourceImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EObjectFeatureTextSourceImpl extends MinimalEObjectImpl.Container implements EObjectFeatureTextSource {
	/**
	 * The cached value of the '{@link #getEobject() <em>Eobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEobject()
	 * @generated
	 * @ordered
	 */
	protected EObject eobject;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EObjectFeatureTextSourceImpl() {
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
		return DocumentStructurePackage.Literals.EOBJECT_FEATURE_TEXT_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject getEobject() {
		if (eobject != null && eobject.eIsProxy()) {
			InternalEObject oldEobject = (InternalEObject) eobject;
			eobject = eResolveProxy(oldEobject);
			if (eobject != oldEobject) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__EOBJECT, oldEobject, eobject));
				}
			}
		}
		return eobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EObject basicGetEobject() {
		return eobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEobject(EObject newEobject) {
		EObject oldEobject = eobject;
		eobject = newEobject;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__EOBJECT, oldEobject, eobject));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject) feature;
			feature = (EStructuralFeature) eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__FEATURE, oldFeature, feature));
				}
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__FEATURE, oldFeature, feature));
		}
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
		case DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__EOBJECT:
			if (resolve) {
				return getEobject();
			}
			return basicGetEobject();
		case DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__FEATURE:
			if (resolve) {
				return getFeature();
			}
			return basicGetFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__EOBJECT:
			setEobject((EObject) newValue);
			return;
		case DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__FEATURE:
			setFeature((EStructuralFeature) newValue);
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
		case DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__EOBJECT:
			setEobject((EObject) null);
			return;
		case DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__FEATURE:
			setFeature((EStructuralFeature) null);
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
		case DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__EOBJECT:
			return eobject != null;
		case DocumentStructurePackage.EOBJECT_FEATURE_TEXT_SOURCE__FEATURE:
			return feature != null;
		}
		return super.eIsSet(featureID);
	}

} // EObjectFeatureTextSourceImpl
