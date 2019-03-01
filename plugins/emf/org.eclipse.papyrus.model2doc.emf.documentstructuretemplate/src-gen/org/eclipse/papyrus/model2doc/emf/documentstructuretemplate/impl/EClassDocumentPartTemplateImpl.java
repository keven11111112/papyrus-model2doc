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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.FeaturePartTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass Document Part Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl#isGenerate <em>Generate</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl#isGenerateTitle <em>Generate Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl#getDefaultTitle <em>Default Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl#getCustomTitle <em>Custom Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl#getFeaturePartTemplate <em>Feature Part Template</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl#getEclass <em>Eclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EClassDocumentPartTemplateImpl extends MinimalEObjectImpl.Container implements EClassDocumentPartTemplate {
	/**
	 * The default value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_EDEFAULT = false;

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
	protected static final boolean GENERATE_TITLE_EDEFAULT = false;

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
	 * The default value of the '{@link #getDefaultTitle() <em>Default Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDefaultTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TITLE_EDEFAULT = null;

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
	 * The cached value of the '{@link #getFeaturePartTemplate() <em>Feature Part Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFeaturePartTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<FeaturePartTemplate> featurePartTemplate;

	/**
	 * The cached value of the '{@link #getEclass() <em>Eclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEclass()
	 * @generated
	 * @ordered
	 */
	protected EClass eclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EClassDocumentPartTemplateImpl() {
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
		return DocumentStructureTemplatePackage.Literals.ECLASS_DOCUMENT_PART_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE, oldGenerate, generate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE, oldGenerateTitle, generateTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDefaultTitle() {
		// TODO: implement this method to return the 'Default Title' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		return "tutu";
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE, oldCustomTitle, customTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<FeaturePartTemplate> getFeaturePartTemplate() {
		if (featurePartTemplate == null) {
			featurePartTemplate = new EObjectContainmentEList<>(FeaturePartTemplate.class, this, DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__FEATURE_PART_TEMPLATE);
		}
		return featurePartTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEclass() {
		if (eclass != null && eclass.eIsProxy()) {
			InternalEObject oldEclass = (InternalEObject) eclass;
			eclass = (EClass) eResolveProxy(oldEclass);
			if (eclass != oldEclass) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__ECLASS, oldEclass, eclass));
				}
			}
		}
		return eclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass basicGetEclass() {
		return eclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEclass(EClass newEclass) {
		EClass oldEclass = eclass;
		eclass = newEclass;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__ECLASS, oldEclass, eclass));
		}
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
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__FEATURE_PART_TEMPLATE:
			return ((InternalEList<?>) getFeaturePartTemplate()).basicRemove(otherEnd, msgs);
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
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE:
			return isGenerate();
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE:
			return isGenerateTitle();
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE:
			return getDefaultTitle();
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE:
			return getCustomTitle();
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__FEATURE_PART_TEMPLATE:
			return getFeaturePartTemplate();
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__ECLASS:
			if (resolve) {
				return getEclass();
			}
			return basicGetEclass();
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
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE:
			setGenerate((Boolean) newValue);
			return;
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE:
			setGenerateTitle((Boolean) newValue);
			return;
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE:
			setCustomTitle((String) newValue);
			return;
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__FEATURE_PART_TEMPLATE:
			getFeaturePartTemplate().clear();
			getFeaturePartTemplate().addAll((Collection<? extends FeaturePartTemplate>) newValue);
			return;
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__ECLASS:
			setEclass((EClass) newValue);
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
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE:
			setGenerate(GENERATE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE:
			setGenerateTitle(GENERATE_TITLE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE:
			setCustomTitle(CUSTOM_TITLE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__FEATURE_PART_TEMPLATE:
			getFeaturePartTemplate().clear();
			return;
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__ECLASS:
			setEclass((EClass) null);
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
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE:
			return generate != GENERATE_EDEFAULT;
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE:
			return generateTitle != GENERATE_TITLE_EDEFAULT;
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE:
			return DEFAULT_TITLE_EDEFAULT == null ? getDefaultTitle() != null : !DEFAULT_TITLE_EDEFAULT.equals(getDefaultTitle());
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE:
			return CUSTOM_TITLE_EDEFAULT == null ? customTitle != null : !CUSTOM_TITLE_EDEFAULT.equals(customTitle);
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__FEATURE_PART_TEMPLATE:
			return featurePartTemplate != null && !featurePartTemplate.isEmpty();
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE__ECLASS:
			return eclass != null;
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
		result.append(')');
		return result.toString();
	}

} // EClassDocumentPartTemplateImpl
