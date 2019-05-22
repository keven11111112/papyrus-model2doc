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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassTemplateImpl#getEClass <em>EClass</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassTemplateImpl#getFilterRule <em>Filter Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EClassTemplateImpl extends MinimalEObjectImpl.Container implements EClassTemplate {
	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The default value of the '{@link #getFilterRule() <em>Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFilterRule()
	 * @generated
	 * @ordered
	 */
	protected static final EClassFilterBehavior FILTER_RULE_EDEFAULT = EClassFilterBehavior.TYPE_OF;

	/**
	 * The cached value of the '{@link #getFilterRule() <em>Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFilterRule()
	 * @generated
	 * @ordered
	 */
	protected EClassFilterBehavior filterRule = FILTER_RULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EClassTemplateImpl() {
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
		return DocumentStructureTemplatePackage.Literals.ECLASS_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject) eClass;
			eClass = (EClass) eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructureTemplatePackage.ECLASS_TEMPLATE__ECLASS, oldEClass, eClass));
				}
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ECLASS_TEMPLATE__ECLASS, oldEClass, eClass));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClassFilterBehavior getFilterRule() {
		return filterRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFilterRule(EClassFilterBehavior newFilterRule) {
		EClassFilterBehavior oldFilterRule = filterRule;
		filterRule = newFilterRule == null ? FILTER_RULE_EDEFAULT : newFilterRule;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ECLASS_TEMPLATE__FILTER_RULE, oldFilterRule, filterRule));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isMatchingFilterRule(final EObject inputEObject) {
		return org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations.EClassTemplateOperations.isMatchingFilterRule(this, inputEObject);
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
		case DocumentStructureTemplatePackage.ECLASS_TEMPLATE__ECLASS:
			if (resolve) {
				return getEClass();
			}
			return basicGetEClass();
		case DocumentStructureTemplatePackage.ECLASS_TEMPLATE__FILTER_RULE:
			return getFilterRule();
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
		case DocumentStructureTemplatePackage.ECLASS_TEMPLATE__ECLASS:
			setEClass((EClass) newValue);
			return;
		case DocumentStructureTemplatePackage.ECLASS_TEMPLATE__FILTER_RULE:
			setFilterRule((EClassFilterBehavior) newValue);
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
		case DocumentStructureTemplatePackage.ECLASS_TEMPLATE__ECLASS:
			setEClass((EClass) null);
			return;
		case DocumentStructureTemplatePackage.ECLASS_TEMPLATE__FILTER_RULE:
			setFilterRule(FILTER_RULE_EDEFAULT);
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
		case DocumentStructureTemplatePackage.ECLASS_TEMPLATE__ECLASS:
			return eClass != null;
		case DocumentStructureTemplatePackage.ECLASS_TEMPLATE__FILTER_RULE:
			return filterRule != FILTER_RULE_EDEFAULT;
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
		case DocumentStructureTemplatePackage.ECLASS_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT:
			return isMatchingFilterRule((EObject) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (filterRule: "); //$NON-NLS-1$
		result.append(filterRule);
		result.append(')');
		return result.toString();
	}

} // EClassTemplateImpl
