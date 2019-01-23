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
import org.eclipse.papyrus.model2doc.documentstructure.Text;
import org.eclipse.papyrus.model2doc.documentstructure.TextSource;
import org.eclipse.papyrus.model2doc.documentstructure.Title;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.impl.TitleImpl#getTextSource <em>Text Source</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.impl.TitleImpl#getSubDocumentPart <em>Sub Document Part</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.impl.TitleImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitleImpl extends MinimalEObjectImpl.Container implements Title {
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
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Text text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TitleImpl() {
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
		return DocumentStructurePackage.Literals.TITLE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TITLE__TEXT_SOURCE, oldTextSource, newTextSource);
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
				msgs = ((InternalEObject) textSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TITLE__TEXT_SOURCE, null, msgs);
			}
			if (newTextSource != null) {
				msgs = ((InternalEObject) newTextSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TITLE__TEXT_SOURCE, null, msgs);
			}
			msgs = basicSetTextSource(newTextSource, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TITLE__TEXT_SOURCE, newTextSource, newTextSource));
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
			subDocumentPart = new EObjectContainmentEList<>(DocumentPart.class, this, DocumentStructurePackage.TITLE__SUB_DOCUMENT_PART);
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
	public Text getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetText(Text newText, NotificationChain msgs) {
		Text oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TITLE__TEXT, oldText, newText);
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
	public void setText(Text newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null) {
				msgs = ((InternalEObject) text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TITLE__TEXT, null, msgs);
			}
			if (newText != null) {
				msgs = ((InternalEObject) newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TITLE__TEXT, null, msgs);
			}
			msgs = basicSetText(newText, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TITLE__TEXT, newText, newText));
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
		case DocumentStructurePackage.TITLE__TEXT_SOURCE:
			return basicSetTextSource(null, msgs);
		case DocumentStructurePackage.TITLE__SUB_DOCUMENT_PART:
			return ((InternalEList<?>) getSubDocumentPart()).basicRemove(otherEnd, msgs);
		case DocumentStructurePackage.TITLE__TEXT:
			return basicSetText(null, msgs);
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
		case DocumentStructurePackage.TITLE__TEXT_SOURCE:
			return getTextSource();
		case DocumentStructurePackage.TITLE__SUB_DOCUMENT_PART:
			return getSubDocumentPart();
		case DocumentStructurePackage.TITLE__TEXT:
			return getText();
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
		case DocumentStructurePackage.TITLE__TEXT_SOURCE:
			setTextSource((TextSource) newValue);
			return;
		case DocumentStructurePackage.TITLE__SUB_DOCUMENT_PART:
			getSubDocumentPart().clear();
			getSubDocumentPart().addAll((Collection<? extends DocumentPart>) newValue);
			return;
		case DocumentStructurePackage.TITLE__TEXT:
			setText((Text) newValue);
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
		case DocumentStructurePackage.TITLE__TEXT_SOURCE:
			setTextSource((TextSource) null);
			return;
		case DocumentStructurePackage.TITLE__SUB_DOCUMENT_PART:
			getSubDocumentPart().clear();
			return;
		case DocumentStructurePackage.TITLE__TEXT:
			setText((Text) null);
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
		case DocumentStructurePackage.TITLE__TEXT_SOURCE:
			return textSource != null;
		case DocumentStructurePackage.TITLE__SUB_DOCUMENT_PART:
			return subDocumentPart != null && !subDocumentPart.isEmpty();
		case DocumentStructurePackage.TITLE__TEXT:
			return text != null;
		}
		return super.eIsSet(featureID);
	}

} // TitleImpl
