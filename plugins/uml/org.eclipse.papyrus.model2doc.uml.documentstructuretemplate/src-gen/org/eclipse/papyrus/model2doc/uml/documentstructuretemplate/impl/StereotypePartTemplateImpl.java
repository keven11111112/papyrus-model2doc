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

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassPartTemplateImpl;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IStereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype Part Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartTemplateImpl#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartTemplateImpl#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypePartTemplateImpl extends EClassPartTemplateImpl implements StereotypePartTemplate {
	/**
	 * The default value of the '{@link #getStereotypeQualifiedName() <em>Stereotype Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStereotypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREOTYPE_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStereotypeQualifiedName() <em>Stereotype Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStereotypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String stereotypeQualifiedName = STEREOTYPE_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStereotypeFilterRule() <em>Stereotype Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStereotypeFilterRule()
	 * @generated
	 * @ordered
	 */
	protected static final StereotypeFilterBehavior STEREOTYPE_FILTER_RULE_EDEFAULT = StereotypeFilterBehavior.STEREOTYPE_TYPE_OF;

	/**
	 * The cached value of the '{@link #getStereotypeFilterRule() <em>Stereotype Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStereotypeFilterRule()
	 * @generated
	 * @ordered
	 */
	protected StereotypeFilterBehavior stereotypeFilterRule = STEREOTYPE_FILTER_RULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected StereotypePartTemplateImpl() {
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
		return UMLDocumentStructureTemplatePackage.Literals.STEREOTYPE_PART_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getStereotypeQualifiedName() {
		return stereotypeQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setStereotypeQualifiedName(String newStereotypeQualifiedName) {
		String oldStereotypeQualifiedName = stereotypeQualifiedName;
		stereotypeQualifiedName = newStereotypeQualifiedName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME, oldStereotypeQualifiedName, stereotypeQualifiedName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StereotypeFilterBehavior getStereotypeFilterRule() {
		return stereotypeFilterRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setStereotypeFilterRule(StereotypeFilterBehavior newStereotypeFilterRule) {
		StereotypeFilterBehavior oldStereotypeFilterRule = stereotypeFilterRule;
		stereotypeFilterRule = newStereotypeFilterRule == null ? STEREOTYPE_FILTER_RULE_EDEFAULT : newStereotypeFilterRule;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE, oldStereotypeFilterRule, stereotypeFilterRule));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject getFirstMatchingStereotypeApplication(EObject element) {
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
	public String buildPartTemplateTitle(final EObject context) {
		return org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.operations.UMLBodySectionPartTemplateTitleHelper.UML_INSTANCE.buildPartTemplateTitle(this, context);
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME:
			return getStereotypeQualifiedName();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE:
			return getStereotypeFilterRule();
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME:
			setStereotypeQualifiedName((String) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE:
			setStereotypeFilterRule((StereotypeFilterBehavior) newValue);
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME:
			setStereotypeQualifiedName(STEREOTYPE_QUALIFIED_NAME_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE:
			setStereotypeFilterRule(STEREOTYPE_FILTER_RULE_EDEFAULT);
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME:
			return STEREOTYPE_QUALIFIED_NAME_EDEFAULT == null ? stereotypeQualifiedName != null : !STEREOTYPE_QUALIFIED_NAME_EDEFAULT.equals(stereotypeQualifiedName);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE:
			return stereotypeFilterRule != STEREOTYPE_FILTER_RULE_EDEFAULT;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IStereotypePartTemplate.class) {
			switch (baseOperationID) {
			case UMLDocumentStructureTemplatePackage.ISTEREOTYPE_PART_TEMPLATE___GET_STEREOTYPE_QUALIFIED_NAME:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE___GET_STEREOTYPE_QUALIFIED_NAME;
			case UMLDocumentStructureTemplatePackage.ISTEREOTYPE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;
			case UMLDocumentStructureTemplatePackage.ISTEREOTYPE_PART_TEMPLATE___GET_STEREOTYPE_FILTER_RULE:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE___GET_STEREOTYPE_FILTER_RULE;
			default:
				return -1;
			}
		}
		if (baseClass == IUMLBodyPartTemplateTitle.class) {
			switch (baseOperationID) {
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT:
			return getFirstMatchingStereotypeApplication((EObject) arguments.get(0));
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT:
			return buildPartTemplateTitle((EObject) arguments.get(0));
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
		result.append(" (stereotypeQualifiedName: "); //$NON-NLS-1$
		result.append(stereotypeQualifiedName);
		result.append(", stereotypeFilterRule: "); //$NON-NLS-1$
		result.append(stereotypeFilterRule);
		result.append(')');
		return result.toString();
	}

} // StereotypePartTemplateImpl
