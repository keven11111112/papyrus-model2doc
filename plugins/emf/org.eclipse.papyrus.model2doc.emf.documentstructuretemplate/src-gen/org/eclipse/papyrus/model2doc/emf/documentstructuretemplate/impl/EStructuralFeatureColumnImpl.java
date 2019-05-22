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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureColumn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructural Feature Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureColumnImpl#getCustomColumnTitle <em>Custom Column Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureColumnImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EStructuralFeatureColumnImpl extends MinimalEObjectImpl.Container implements EStructuralFeatureColumn {
	/**
	 * The default value of the '{@link #getCustomColumnTitle() <em>Custom Column Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCustomColumnTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_COLUMN_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomColumnTitle() <em>Custom Column Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCustomColumnTitle()
	 * @generated
	 * @ordered
	 */
	protected String customColumnTitle = CUSTOM_COLUMN_TITLE_EDEFAULT;

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
	protected EStructuralFeatureColumnImpl() {
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
		return DocumentStructureTemplatePackage.Literals.ESTRUCTURAL_FEATURE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getCustomColumnTitle() {
		return customColumnTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCustomColumnTitle(String newCustomColumnTitle) {
		String oldCustomColumnTitle = customColumnTitle;
		customColumnTitle = newCustomColumnTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__CUSTOM_COLUMN_TITLE, oldCustomColumnTitle, customColumnTitle));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__FEATURE, oldFeature, feature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__FEATURE, oldFeature, feature));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String buildColumnHeaderLabel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getCellValue(EObject row) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String buildCellLabel(Object cellElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__CUSTOM_COLUMN_TITLE:
			return getCustomColumnTitle();
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__FEATURE:
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
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__CUSTOM_COLUMN_TITLE:
			setCustomColumnTitle((String) newValue);
			return;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__FEATURE:
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
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__CUSTOM_COLUMN_TITLE:
			setCustomColumnTitle(CUSTOM_COLUMN_TITLE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__FEATURE:
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
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__CUSTOM_COLUMN_TITLE:
			return CUSTOM_COLUMN_TITLE_EDEFAULT == null ? customColumnTitle != null : !CUSTOM_COLUMN_TITLE_EDEFAULT.equals(customColumnTitle);
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__FEATURE:
			return feature != null;
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
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN___BUILD_COLUMN_HEADER_LABEL:
			return buildColumnHeaderLabel();
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN___GET_CELL_VALUE__EOBJECT:
			return getCellValue((EObject) arguments.get(0));
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN___BUILD_CELL_LABEL__OBJECT:
			return buildCellLabel(arguments.get(0));
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
		result.append(" (customColumnTitle: "); //$NON-NLS-1$
		result.append(customColumnTitle);
		result.append(')');
		return result.toString();
	}

} // EStructuralFeatureColumnImpl
