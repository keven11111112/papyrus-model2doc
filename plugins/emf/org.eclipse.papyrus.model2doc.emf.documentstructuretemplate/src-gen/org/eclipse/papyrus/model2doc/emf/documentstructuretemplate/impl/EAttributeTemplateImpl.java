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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EAttributeTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAttribute Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EAttributeTemplateImpl#getEAttribute <em>EAttribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EAttributeTemplateImpl extends MinimalEObjectImpl.Container implements EAttributeTemplate {
	/**
	 * The cached value of the '{@link #getEAttribute() <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute eAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EAttributeTemplateImpl() {
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
		return DocumentStructureTemplatePackage.Literals.EATTRIBUTE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEAttribute() {
		if (eAttribute != null && eAttribute.eIsProxy()) {
			InternalEObject oldEAttribute = (InternalEObject) eAttribute;
			eAttribute = (EAttribute) eResolveProxy(oldEAttribute);
			if (eAttribute != oldEAttribute) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructureTemplatePackage.EATTRIBUTE_TEMPLATE__EATTRIBUTE, oldEAttribute, eAttribute));
				}
			}
		}
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute basicGetEAttribute() {
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEAttribute(EAttribute newEAttribute) {
		EAttribute oldEAttribute = eAttribute;
		eAttribute = newEAttribute;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.EATTRIBUTE_TEMPLATE__EATTRIBUTE, oldEAttribute, eAttribute));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String buildEAttributeValueLabel(final Object value) {
		return org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations.EAttributeTemplateOperations.buildEAttributeValueLabel(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Object> getEAttributeValues(final EObject context) {
		return org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations.EAttributeTemplateOperations.getEAttributeValues(this, context);
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
		case DocumentStructureTemplatePackage.EATTRIBUTE_TEMPLATE__EATTRIBUTE:
			if (resolve) {
				return getEAttribute();
			}
			return basicGetEAttribute();
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
		case DocumentStructureTemplatePackage.EATTRIBUTE_TEMPLATE__EATTRIBUTE:
			setEAttribute((EAttribute) newValue);
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
		case DocumentStructureTemplatePackage.EATTRIBUTE_TEMPLATE__EATTRIBUTE:
			setEAttribute((EAttribute) null);
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
		case DocumentStructureTemplatePackage.EATTRIBUTE_TEMPLATE__EATTRIBUTE:
			return eAttribute != null;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DocumentStructureTemplatePackage.EATTRIBUTE_TEMPLATE___BUILD_EATTRIBUTE_VALUE_LABEL__OBJECT:
			return buildEAttributeValueLabel(arguments.get(0));
		case DocumentStructureTemplatePackage.EATTRIBUTE_TEMPLATE___GET_EATTRIBUTE_VALUES__EOBJECT:
			return getEAttributeValues((EObject) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // EAttributeTemplateImpl
