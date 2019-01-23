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
package org.eclipse.papyrus.model2doc.documentstructuretemplate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplatePackage;
import org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureVisitorTemplate;

import org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructural Feature Visitor Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EStructuralFeatureVisitorTemplateImpl#getModelVisitor <em>Model Visitor</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EStructuralFeatureVisitorTemplateImpl#isGenerate <em>Generate</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EStructuralFeatureVisitorTemplateImpl#isGenerateTitle <em>Generate Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EStructuralFeatureVisitorTemplateImpl#getDefaultTitle <em>Default Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EStructuralFeatureVisitorTemplateImpl#getCustomTitle <em>Custom Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EStructuralFeatureVisitorTemplateImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EStructuralFeatureVisitorTemplateImpl extends MinimalEObjectImpl.Container implements EStructuralFeatureVisitorTemplate {
	/**
	 * The cached value of the '{@link #getModelVisitor() <em>Model Visitor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getModelVisitor()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectVisitor> modelVisitor;

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
	protected EStructuralFeatureVisitorTemplateImpl() {
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
		return DocumentStructureTemplatePackage.Literals.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<ObjectVisitor> getModelVisitor() {
		if (modelVisitor == null) {
			modelVisitor = new EObjectContainmentEList<>(ObjectVisitor.class, this, DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__MODEL_VISITOR);
		}
		return modelVisitor;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE, oldGenerate, generate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE_TITLE, oldGenerateTitle, generateTitle));
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
		throw new UnsupportedOperationException();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__CUSTOM_TITLE, oldCustomTitle, customTitle));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__FEATURE, oldFeature, feature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__FEATURE, oldFeature, feature));
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
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__MODEL_VISITOR:
			return ((InternalEList<?>) getModelVisitor()).basicRemove(otherEnd, msgs);
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
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__MODEL_VISITOR:
			return getModelVisitor();
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE:
			return isGenerate();
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE_TITLE:
			return isGenerateTitle();
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__DEFAULT_TITLE:
			return getDefaultTitle();
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__CUSTOM_TITLE:
			return getCustomTitle();
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__FEATURE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__MODEL_VISITOR:
			getModelVisitor().clear();
			getModelVisitor().addAll((Collection<? extends ObjectVisitor>) newValue);
			return;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE:
			setGenerate((Boolean) newValue);
			return;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE_TITLE:
			setGenerateTitle((Boolean) newValue);
			return;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__CUSTOM_TITLE:
			setCustomTitle((String) newValue);
			return;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__FEATURE:
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
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__MODEL_VISITOR:
			getModelVisitor().clear();
			return;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE:
			setGenerate(GENERATE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE_TITLE:
			setGenerateTitle(GENERATE_TITLE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__CUSTOM_TITLE:
			setCustomTitle(CUSTOM_TITLE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__FEATURE:
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
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__MODEL_VISITOR:
			return modelVisitor != null && !modelVisitor.isEmpty();
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE:
			return generate != GENERATE_EDEFAULT;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE_TITLE:
			return generateTitle != GENERATE_TITLE_EDEFAULT;
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__DEFAULT_TITLE:
			return DEFAULT_TITLE_EDEFAULT == null ? getDefaultTitle() != null : !DEFAULT_TITLE_EDEFAULT.equals(getDefaultTitle());
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__CUSTOM_TITLE:
			return CUSTOM_TITLE_EDEFAULT == null ? customTitle != null : !CUSTOM_TITLE_EDEFAULT.equals(customTitle);
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__FEATURE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DocumentPartTemplate.class) {
			switch (derivedFeatureID) {
			case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE:
				return DocumentPartTemplatePackage.DOCUMENT_PART_TEMPLATE__GENERATE;
			case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE_TITLE:
				return DocumentPartTemplatePackage.DOCUMENT_PART_TEMPLATE__GENERATE_TITLE;
			case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__DEFAULT_TITLE:
				return DocumentPartTemplatePackage.DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE;
			case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__CUSTOM_TITLE:
				return DocumentPartTemplatePackage.DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE;
			default:
				return -1;
			}
		}
		if (baseClass == EStructuralFeatureDocumentPartTemplate.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == DocumentPartTemplate.class) {
			switch (baseFeatureID) {
			case DocumentPartTemplatePackage.DOCUMENT_PART_TEMPLATE__GENERATE:
				return DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE;
			case DocumentPartTemplatePackage.DOCUMENT_PART_TEMPLATE__GENERATE_TITLE:
				return DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE_TITLE;
			case DocumentPartTemplatePackage.DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE:
				return DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__DEFAULT_TITLE;
			case DocumentPartTemplatePackage.DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE:
				return DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__CUSTOM_TITLE;
			default:
				return -1;
			}
		}
		if (baseClass == EStructuralFeatureDocumentPartTemplate.class) {
			switch (baseFeatureID) {
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

} // EStructuralFeatureVisitorTemplateImpl
