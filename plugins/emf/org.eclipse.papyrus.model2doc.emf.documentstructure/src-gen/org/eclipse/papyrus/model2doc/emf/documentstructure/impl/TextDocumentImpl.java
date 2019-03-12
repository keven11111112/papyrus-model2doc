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
package org.eclipse.papyrus.model2doc.emf.documentstructure.impl;

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

import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl#getTextDocumentPart <em>Text Document Part</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl#getTocTitle <em>Toc Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextDocumentImpl extends MinimalEObjectImpl.Container implements TextDocument {
	/**
	 * The cached value of the '{@link #getTextDocumentPart() <em>Text Document Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTextDocumentPart()
	 * @generated
	 * @ordered
	 */
	protected EList<TextDocumentPart> textDocumentPart;

	/**
	 * The default value of the '{@link #getTocTitle() <em>Toc Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTocTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TOC_TITLE_EDEFAULT = "Table Of Contents"; //$NON-NLS-1$
	/**
	 * The cached value of the '{@link #getTocTitle() <em>Toc Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTocTitle()
	 * @generated
	 * @ordered
	 */
	protected String tocTitle = TOC_TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TextDocumentImpl() {
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
		return DocumentStructurePackage.Literals.TEXT_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TextDocumentPart> getTextDocumentPart() {
		if (textDocumentPart == null) {
			textDocumentPart = new EObjectContainmentEList<>(TextDocumentPart.class, this, DocumentStructurePackage.TEXT_DOCUMENT__TEXT_DOCUMENT_PART);
		}
		return textDocumentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getTocTitle() {
		return tocTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTocTitle(String newTocTitle) {
		String oldTocTitle = tocTitle;
		tocTitle = newTocTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TEXT_DOCUMENT__TOC_TITLE, oldTocTitle, tocTitle));
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
		case DocumentStructurePackage.TEXT_DOCUMENT__TEXT_DOCUMENT_PART:
			return ((InternalEList<?>) getTextDocumentPart()).basicRemove(otherEnd, msgs);
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
		case DocumentStructurePackage.TEXT_DOCUMENT__TEXT_DOCUMENT_PART:
			return getTextDocumentPart();
		case DocumentStructurePackage.TEXT_DOCUMENT__TOC_TITLE:
			return getTocTitle();
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
		case DocumentStructurePackage.TEXT_DOCUMENT__TEXT_DOCUMENT_PART:
			getTextDocumentPart().clear();
			getTextDocumentPart().addAll((Collection<? extends TextDocumentPart>) newValue);
			return;
		case DocumentStructurePackage.TEXT_DOCUMENT__TOC_TITLE:
			setTocTitle((String) newValue);
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
		case DocumentStructurePackage.TEXT_DOCUMENT__TEXT_DOCUMENT_PART:
			getTextDocumentPart().clear();
			return;
		case DocumentStructurePackage.TEXT_DOCUMENT__TOC_TITLE:
			setTocTitle(TOC_TITLE_EDEFAULT);
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
		case DocumentStructurePackage.TEXT_DOCUMENT__TEXT_DOCUMENT_PART:
			return textDocumentPart != null && !textDocumentPart.isEmpty();
		case DocumentStructurePackage.TEXT_DOCUMENT__TOC_TITLE:
			return TOC_TITLE_EDEFAULT == null ? tocTitle != null : !TOC_TITLE_EDEFAULT.equals(tocTitle);
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
		result.append(" (tocTitle: "); //$NON-NLS-1$
		result.append(tocTitle);
		result.append(')');
		return result.toString();
	}

} // TextDocumentImpl
