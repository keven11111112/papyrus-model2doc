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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.TextDocumentTemplate;

import org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Document Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.TextDocumentTemplateImpl#getStartModelVisitor <em>Start Model Visitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextDocumentTemplateImpl extends MinimalEObjectImpl.Container implements TextDocumentTemplate {
	/**
	 * The cached value of the '{@link #getStartModelVisitor() <em>Start Model Visitor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStartModelVisitor()
	 * @generated
	 * @ordered
	 */
	protected EList<StartModelVisitor> startModelVisitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TextDocumentTemplateImpl() {
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
		return DocumentStructureTemplatePackage.Literals.TEXT_DOCUMENT_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<StartModelVisitor> getStartModelVisitor() {
		if (startModelVisitor == null) {
			startModelVisitor = new EObjectContainmentEList<>(StartModelVisitor.class, this, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__START_MODEL_VISITOR);
		}
		return startModelVisitor;
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__START_MODEL_VISITOR:
			return ((InternalEList<?>) getStartModelVisitor()).basicRemove(otherEnd, msgs);
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__START_MODEL_VISITOR:
			return getStartModelVisitor();
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__START_MODEL_VISITOR:
			getStartModelVisitor().clear();
			getStartModelVisitor().addAll((Collection<? extends StartModelVisitor>) newValue);
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__START_MODEL_VISITOR:
			getStartModelVisitor().clear();
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__START_MODEL_VISITOR:
			return startModelVisitor != null && !startModelVisitor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TextDocumentTemplateImpl
