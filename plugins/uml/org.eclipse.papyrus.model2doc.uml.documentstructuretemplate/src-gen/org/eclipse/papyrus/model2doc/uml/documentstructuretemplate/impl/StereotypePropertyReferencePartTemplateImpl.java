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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IStereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype Property Reference Part Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl#isGenerate <em>Generate</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl#isGenerateTitle <em>Generate Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl#getCustomTitle <em>Custom Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl#getSubBodyPartTemplates <em>Sub Body Part Template</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl#getPropertyName <em>Property Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypePropertyReferencePartTemplateImpl extends MinimalEObjectImpl.Container implements StereotypePropertyReferencePartTemplate {
	/**
	 * The default value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected boolean generate = GENERATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateTitle() <em>Generate Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TITLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateTitle() <em>Generate Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTitle = GENERATE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomTitle() <em>Custom Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCustomTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomTitle() <em>Custom Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCustomTitle()
	 * @generated
	 * @ordered
	 */
	protected String customTitle = CUSTOM_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubBodyPartTemplates() <em>Sub Body Part Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSubBodyPartTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ISubBodyPartTemplate> subBodyPartTemplates;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

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
	protected StereotypePropertyReferencePartTemplateImpl() {
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
		return UMLDocumentStructureTemplatePackage.Literals.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerate() {
		return generate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerate(boolean newGenerate) {
		boolean oldGenerate = generate;
		generate = newGenerate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE, oldGenerate, generate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerateTitle() {
		return generateTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerateTitle(boolean newGenerateTitle) {
		boolean oldGenerateTitle = generateTitle;
		generateTitle = newGenerateTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE_TITLE, oldGenerateTitle, generateTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getCustomTitle() {
		return customTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCustomTitle(String newCustomTitle) {
		String oldCustomTitle = customTitle;
		customTitle = newCustomTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__CUSTOM_TITLE, oldCustomTitle, customTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<ISubBodyPartTemplate> getSubBodyPartTemplates() {
		if (subBodyPartTemplates == null) {
			subBodyPartTemplates = new EObjectContainmentEList<>(ISubBodyPartTemplate.class, this, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE);
		}
		return subBodyPartTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__PROPERTY_NAME, oldPropertyName, propertyName));
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME, oldStereotypeQualifiedName, stereotypeQualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE, oldStereotypeFilterRule, stereotypeFilterRule));
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
	public EList<EObject> getMatchingReferencedEObjects(EObject eobject) {
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
	public String buildTitle() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE:
			return ((InternalEList<?>) getSubBodyPartTemplates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE:
			return isGenerate();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE_TITLE:
			return isGenerateTitle();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__CUSTOM_TITLE:
			return getCustomTitle();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE:
			return getSubBodyPartTemplates();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__PROPERTY_NAME:
			return getPropertyName();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME:
			return getStereotypeQualifiedName();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE:
			setGenerate((Boolean) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE_TITLE:
			setGenerateTitle((Boolean) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__CUSTOM_TITLE:
			setCustomTitle((String) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE:
			getSubBodyPartTemplates().clear();
			getSubBodyPartTemplates().addAll((Collection<? extends ISubBodyPartTemplate>) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__PROPERTY_NAME:
			setPropertyName((String) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME:
			setStereotypeQualifiedName((String) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE:
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE:
			setGenerate(GENERATE_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE_TITLE:
			setGenerateTitle(GENERATE_TITLE_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__CUSTOM_TITLE:
			setCustomTitle(CUSTOM_TITLE_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE:
			getSubBodyPartTemplates().clear();
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__PROPERTY_NAME:
			setPropertyName(PROPERTY_NAME_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME:
			setStereotypeQualifiedName(STEREOTYPE_QUALIFIED_NAME_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE:
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE:
			return generate != GENERATE_EDEFAULT;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE_TITLE:
			return generateTitle != GENERATE_TITLE_EDEFAULT;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__CUSTOM_TITLE:
			return CUSTOM_TITLE_EDEFAULT == null ? customTitle != null : !CUSTOM_TITLE_EDEFAULT.equals(customTitle);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE:
			return subBodyPartTemplates != null && !subBodyPartTemplates.isEmpty();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__PROPERTY_NAME:
			return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME:
			return STEREOTYPE_QUALIFIED_NAME_EDEFAULT == null ? stereotypeQualifiedName != null : !STEREOTYPE_QUALIFIED_NAME_EDEFAULT.equals(stereotypeQualifiedName);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE:
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
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_STEREOTYPE_QUALIFIED_NAME;
			case UMLDocumentStructureTemplatePackage.ISTEREOTYPE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;
			case UMLDocumentStructureTemplatePackage.ISTEREOTYPE_PART_TEMPLATE___GET_STEREOTYPE_FILTER_RULE:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_STEREOTYPE_FILTER_RULE;
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT:
			return getFirstMatchingStereotypeApplication((EObject) arguments.get(0));
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_MATCHING_REFERENCED_EOBJECTS__EOBJECT:
			return getMatchingReferencedEObjects((EObject) arguments.get(0));
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___BUILD_TITLE:
			return buildTitle();
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
		result.append(" (generate: "); //$NON-NLS-1$
		result.append(generate);
		result.append(", generateTitle: "); //$NON-NLS-1$
		result.append(generateTitle);
		result.append(", customTitle: "); //$NON-NLS-1$
		result.append(customTitle);
		result.append(", propertyName: "); //$NON-NLS-1$
		result.append(propertyName);
		result.append(", stereotypeQualifiedName: "); //$NON-NLS-1$
		result.append(stereotypeQualifiedName);
		result.append(", stereotypeFilterRule: "); //$NON-NLS-1$
		result.append(stereotypeFilterRule);
		result.append(')');
		return result.toString();
	}

} // StereotypePropertyReferencePartTemplateImpl
