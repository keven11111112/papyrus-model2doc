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
package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.infra.architecture.representation.impl.PapyrusRepresentationKindImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;

import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.RepresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Papyrus Document Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.PapyrusDocumentPrototypeImpl#getDocumentTemplatePrototype <em>Document Template Prototype</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.PapyrusDocumentPrototypeImpl#getCreationCommandClass <em>Creation Command Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PapyrusDocumentPrototypeImpl extends PapyrusRepresentationKindImpl implements PapyrusDocumentPrototype {
	/**
	 * The cached value of the '{@link #getDocumentTemplatePrototype() <em>Document Template Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentTemplatePrototype()
	 * @generated
	 * @ordered
	 */
	protected DocumentTemplatePrototype documentTemplatePrototype;

	/**
	 * The cached value of the '{@link #getCreationCommandClass() <em>Creation Command Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCreationCommandClass()
	 * @generated
	 * @ordered
	 */
	protected Class<?> creationCommandClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected PapyrusDocumentPrototypeImpl() {
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
		return RepresentationPackage.Literals.PAPYRUS_DOCUMENT_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DocumentTemplatePrototype getDocumentTemplatePrototype() {
		if (documentTemplatePrototype != null && documentTemplatePrototype.eIsProxy()) {
			InternalEObject oldDocumentTemplatePrototype = (InternalEObject) documentTemplatePrototype;
			documentTemplatePrototype = (DocumentTemplatePrototype) eResolveProxy(oldDocumentTemplatePrototype);
			if (documentTemplatePrototype != oldDocumentTemplatePrototype) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__DOCUMENT_TEMPLATE_PROTOTYPE, oldDocumentTemplatePrototype, documentTemplatePrototype));
				}
			}
		}
		return documentTemplatePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DocumentTemplatePrototype basicGetDocumentTemplatePrototype() {
		return documentTemplatePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDocumentTemplatePrototype(DocumentTemplatePrototype newDocumentTemplatePrototype) {
		DocumentTemplatePrototype oldDocumentTemplatePrototype = documentTemplatePrototype;
		documentTemplatePrototype = newDocumentTemplatePrototype;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__DOCUMENT_TEMPLATE_PROTOTYPE, oldDocumentTemplatePrototype, documentTemplatePrototype));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Class<?> getCreationCommandClass() {
		return creationCommandClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCreationCommandClass(Class<?> newCreationCommandClass) {
		Class<?> oldCreationCommandClass = creationCommandClass;
		creationCommandClass = newCreationCommandClass;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__CREATION_COMMAND_CLASS, oldCreationCommandClass, creationCommandClass));
		}
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
		case RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__DOCUMENT_TEMPLATE_PROTOTYPE:
			if (resolve) {
				return getDocumentTemplatePrototype();
			}
			return basicGetDocumentTemplatePrototype();
		case RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__CREATION_COMMAND_CLASS:
			return getCreationCommandClass();
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
		case RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__DOCUMENT_TEMPLATE_PROTOTYPE:
			setDocumentTemplatePrototype((DocumentTemplatePrototype) newValue);
			return;
		case RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__CREATION_COMMAND_CLASS:
			setCreationCommandClass((Class<?>) newValue);
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
		case RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__DOCUMENT_TEMPLATE_PROTOTYPE:
			setDocumentTemplatePrototype((DocumentTemplatePrototype) null);
			return;
		case RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__CREATION_COMMAND_CLASS:
			setCreationCommandClass((Class<?>) null);
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
		case RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__DOCUMENT_TEMPLATE_PROTOTYPE:
			return documentTemplatePrototype != null;
		case RepresentationPackage.PAPYRUS_DOCUMENT_PROTOTYPE__CREATION_COMMAND_CLASS:
			return creationCommandClass != null;
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
		result.append(" (creationCommandClass: "); //$NON-NLS-1$
		result.append(creationCommandClass);
		result.append(')');
		return result.toString();
	}

} // PapyrusDocumentPrototypeImpl
