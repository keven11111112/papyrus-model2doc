/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.documentview.representation.internal.impl;

import org.eclipse.papyrus.model2doc.documentview.representation.PapyrusDocument;
import org.eclipse.papyrus.model2doc.documentview.representation.RepresentationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.infra.architecture.representation.impl.PapyrusRepresentationKindImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Papyrus
 * Document</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentview.representation.internal.impl.PapyrusDocumentImpl#getCreationCommandClass <em>Creation Command Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentview.representation.internal.impl.PapyrusDocumentImpl#getDocumentKind <em>Document Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PapyrusDocumentImpl extends PapyrusRepresentationKindImpl implements PapyrusDocument {
	/**
	 * The cached value of the '{@link #getCreationCommandClass() <em>Creation Command Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getCreationCommandClass()
	 * @generated
	 * @ordered
	 */
	protected Class<?> creationCommandClass;

	/**
	 * The default value of the '{@link #getDocumentKind() <em>Document Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentKind()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentKind() <em>Document Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentKind()
	 * @generated
	 * @ordered
	 */
	protected String documentKind = DOCUMENT_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected PapyrusDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepresentationPackage.Literals.PAPYRUS_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Class<?> getCreationCommandClass() {
		return creationCommandClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCreationCommandClass(Class<?> newCreationCommandClass) {
		Class<?> oldCreationCommandClass = creationCommandClass;
		creationCommandClass = newCreationCommandClass;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RepresentationPackage.PAPYRUS_DOCUMENT__CREATION_COMMAND_CLASS, oldCreationCommandClass, creationCommandClass));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDocumentKind() {
		return documentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDocumentKind(String newDocumentKind) {
		String oldDocumentKind = documentKind;
		documentKind = newDocumentKind;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RepresentationPackage.PAPYRUS_DOCUMENT__DOCUMENT_KIND, oldDocumentKind, documentKind));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RepresentationPackage.PAPYRUS_DOCUMENT__CREATION_COMMAND_CLASS:
			return getCreationCommandClass();
		case RepresentationPackage.PAPYRUS_DOCUMENT__DOCUMENT_KIND:
			return getDocumentKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RepresentationPackage.PAPYRUS_DOCUMENT__CREATION_COMMAND_CLASS:
			setCreationCommandClass((Class<?>) newValue);
			return;
		case RepresentationPackage.PAPYRUS_DOCUMENT__DOCUMENT_KIND:
			setDocumentKind((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RepresentationPackage.PAPYRUS_DOCUMENT__CREATION_COMMAND_CLASS:
			setCreationCommandClass((Class<?>) null);
			return;
		case RepresentationPackage.PAPYRUS_DOCUMENT__DOCUMENT_KIND:
			setDocumentKind(DOCUMENT_KIND_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RepresentationPackage.PAPYRUS_DOCUMENT__CREATION_COMMAND_CLASS:
			return creationCommandClass != null;
		case RepresentationPackage.PAPYRUS_DOCUMENT__DOCUMENT_KIND:
			return DOCUMENT_KIND_EDEFAULT == null ? documentKind != null : !DOCUMENT_KIND_EDEFAULT.equals(documentKind);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (creationCommandClass: "); //$NON-NLS-1$
		result.append(creationCommandClass);
		result.append(", documentKind: "); //$NON-NLS-1$
		result.append(documentKind);
		result.append(')');
		return result.toString();
	}

} // PapyrusDocumentImpl
