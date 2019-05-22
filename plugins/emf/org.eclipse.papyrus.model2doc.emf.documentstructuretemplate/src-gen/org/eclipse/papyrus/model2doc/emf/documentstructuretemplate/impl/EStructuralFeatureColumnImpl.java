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

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructural Feature Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureColumnImpl#getCustomColumnTitle <em>Custom Column Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EStructuralFeatureColumnImpl extends EStructuralFeatureTemplateImpl implements EStructuralFeatureColumn {
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
	public String buildColumnHeaderLabel() {
		return org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations.EStructuralFeatureColumnOperations.buildColumnHeaderLabel(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getCellValue(final EObject row) {
		return org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations.EStructuralFeatureColumnOperations.getCellValue(this, row);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String buildCellLabel(final Object cellValue) {
		return org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations.EStructuralFeatureColumnOperations.buildCellLabel(this, cellValue);
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IColumn.class) {
			switch (derivedFeatureID) {
			case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__CUSTOM_COLUMN_TITLE:
				return DocumentStructureTemplatePackage.ICOLUMN__CUSTOM_COLUMN_TITLE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IColumn.class) {
			switch (baseFeatureID) {
			case DocumentStructureTemplatePackage.ICOLUMN__CUSTOM_COLUMN_TITLE:
				return DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN__CUSTOM_COLUMN_TITLE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IColumn.class) {
			switch (baseOperationID) {
			case DocumentStructureTemplatePackage.ICOLUMN___BUILD_COLUMN_HEADER_LABEL:
				return DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN___BUILD_COLUMN_HEADER_LABEL;
			case DocumentStructureTemplatePackage.ICOLUMN___GET_CELL_VALUE__EOBJECT:
				return DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN___GET_CELL_VALUE__EOBJECT;
			case DocumentStructureTemplatePackage.ICOLUMN___BUILD_CELL_LABEL__OBJECT:
				return DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN___BUILD_CELL_LABEL__OBJECT;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
