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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyColumn;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype Property Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyColumnImpl#getCustomColumnTitle <em>Custom Column Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypePropertyColumnImpl extends MandatoryStereotypePropertyPartImpl implements StereotypePropertyColumn {
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
	protected StereotypePropertyColumnImpl() {
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
		return UMLDocumentStructureTemplatePackage.Literals.STEREOTYPE_PROPERTY_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN__CUSTOM_COLUMN_TITLE, oldCustomColumnTitle, customColumnTitle));
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
		return org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.operations.StereotypePropertyColumnOperations.buildColumnHeaderLabel(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getCellValue(final EObject row) {
		final org.eclipse.emf.ecore.EObject stereotypeApplication = getFirstMatchingStereotypeApplication(row);
		if (null == stereotypeApplication) {
			return "N/A"; //$NON-NLS-1$
		}
		if (this.propertyName == null || this.propertyName.isEmpty()) {
			return "N/A"; //$NON-NLS-1$
		}
		final org.eclipse.emf.ecore.EStructuralFeature feature = stereotypeApplication.eClass().getEStructuralFeature(getPropertyName());
		if (null == feature) {
			return "N/A"; //$NON-NLS-1$
		}
		final java.util.List<Object> res = getStereotypePropertyValues(row);
		if (feature.isMany()) {
			return res;
		}
		if (res.size() == 1) {
			return res.get(0);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String buildCellLabel(final Object cellElement) {
		return org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.operations.StereotypePropertyColumnOperations.buildCellLabel(this, cellElement);
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN__CUSTOM_COLUMN_TITLE:
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN__CUSTOM_COLUMN_TITLE:
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN__CUSTOM_COLUMN_TITLE:
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN__CUSTOM_COLUMN_TITLE:
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
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN__CUSTOM_COLUMN_TITLE:
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
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN__CUSTOM_COLUMN_TITLE;
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
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN___BUILD_COLUMN_HEADER_LABEL;
			case DocumentStructureTemplatePackage.ICOLUMN___GET_CELL_VALUE__EOBJECT:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN___GET_CELL_VALUE__EOBJECT;
			case DocumentStructureTemplatePackage.ICOLUMN___BUILD_CELL_LABEL__OBJECT:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN___BUILD_CELL_LABEL__OBJECT;
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN___BUILD_COLUMN_HEADER_LABEL:
			return buildColumnHeaderLabel();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN___GET_CELL_VALUE__EOBJECT:
			return getCellValue((EObject) arguments.get(0));
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN___BUILD_CELL_LABEL__OBJECT:
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

} // StereotypePropertyColumnImpl
