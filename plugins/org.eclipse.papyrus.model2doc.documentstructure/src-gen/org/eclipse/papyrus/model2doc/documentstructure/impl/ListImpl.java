/**
 * Copyright (c) 2018 CEA LIST.
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
package org.eclipse.papyrus.model2doc.documentstructure.impl;

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

import org.eclipse.papyrus.model2doc.documentstructure.DocumentPart;
import org.eclipse.papyrus.model2doc.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.documentstructure.List;
import org.eclipse.papyrus.model2doc.documentstructure.TextSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.impl.ListImpl#getTextSource <em>Text Source</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.impl.ListImpl#getSubDocumentPart <em>Sub Document Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends MinimalEObjectImpl.Container implements List {
	/**
	 * The cached value of the '{@link #getTextSource() <em>Text Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTextSource()
	 * @generated
	 * @ordered
	 */
	protected TextSource textSource;

	/**
	 * The cached value of the '{@link #getSubDocumentPart() <em>Sub Document Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSubDocumentPart()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentPart> subDocumentPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ListImpl() {
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
		return DocumentStructurePackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TextSource getTextSource() {
		return textSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetTextSource(TextSource newTextSource, NotificationChain msgs) {
		TextSource oldTextSource = textSource;
		textSource = newTextSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.LIST__TEXT_SOURCE, oldTextSource, newTextSource);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTextSource(TextSource newTextSource) {
		if (newTextSource != textSource) {
			NotificationChain msgs = null;
			if (textSource != null) {
				msgs = ((InternalEObject) textSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.LIST__TEXT_SOURCE, null, msgs);
			}
			if (newTextSource != null) {
				msgs = ((InternalEObject) newTextSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.LIST__TEXT_SOURCE, null, msgs);
			}
			msgs = basicSetTextSource(newTextSource, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.LIST__TEXT_SOURCE, newTextSource, newTextSource));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<DocumentPart> getSubDocumentPart() {
		if (subDocumentPart == null) {
			subDocumentPart = new EObjectContainmentEList<>(DocumentPart.class, this, DocumentStructurePackage.LIST__SUB_DOCUMENT_PART);
		}
		return subDocumentPart;
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
		case DocumentStructurePackage.LIST__TEXT_SOURCE:
			return basicSetTextSource(null, msgs);
		case DocumentStructurePackage.LIST__SUB_DOCUMENT_PART:
			return ((InternalEList<?>) getSubDocumentPart()).basicRemove(otherEnd, msgs);
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
		case DocumentStructurePackage.LIST__TEXT_SOURCE:
			return getTextSource();
		case DocumentStructurePackage.LIST__SUB_DOCUMENT_PART:
			return getSubDocumentPart();
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
		case DocumentStructurePackage.LIST__TEXT_SOURCE:
			setTextSource((TextSource) newValue);
			return;
		case DocumentStructurePackage.LIST__SUB_DOCUMENT_PART:
			getSubDocumentPart().clear();
			getSubDocumentPart().addAll((Collection<? extends DocumentPart>) newValue);
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
		case DocumentStructurePackage.LIST__TEXT_SOURCE:
			setTextSource((TextSource) null);
			return;
		case DocumentStructurePackage.LIST__SUB_DOCUMENT_PART:
			getSubDocumentPart().clear();
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
		case DocumentStructurePackage.LIST__TEXT_SOURCE:
			return textSource != null;
		case DocumentStructurePackage.LIST__SUB_DOCUMENT_PART:
			return subDocumentPart != null && !subDocumentPart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ListImpl
