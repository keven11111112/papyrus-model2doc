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

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;

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
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl#getDocumentGeneratorConfiguration <em>Document Generator Configuration</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl#getMainTitle <em>Main Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl#getTextDocumentPart <em>Text Document Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextDocumentImpl extends MinimalEObjectImpl.Container implements TextDocument {
	/**
	 * The cached value of the '{@link #getDocumentGeneratorConfiguration() <em>Document Generator Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentGeneratorConfiguration()
	 * @generated
	 * @ordered
	 */
	protected IDocumentGeneratorConfiguration documentGeneratorConfiguration;

	/**
	 * The default value of the '{@link #getMainTitle() <em>Main Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMainTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainTitle() <em>Main Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMainTitle()
	 * @generated
	 * @ordered
	 */
	protected String mainTitle = MAIN_TITLE_EDEFAULT;

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
	public IDocumentGeneratorConfiguration getDocumentGeneratorConfiguration() {
		return documentGeneratorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetDocumentGeneratorConfiguration(IDocumentGeneratorConfiguration newDocumentGeneratorConfiguration, NotificationChain msgs) {
		IDocumentGeneratorConfiguration oldDocumentGeneratorConfiguration = documentGeneratorConfiguration;
		documentGeneratorConfiguration = newDocumentGeneratorConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TEXT_DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION, oldDocumentGeneratorConfiguration, newDocumentGeneratorConfiguration);
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
	public void setDocumentGeneratorConfiguration(IDocumentGeneratorConfiguration newDocumentGeneratorConfiguration) {
		if (newDocumentGeneratorConfiguration != documentGeneratorConfiguration) {
			NotificationChain msgs = null;
			if (documentGeneratorConfiguration != null) {
				msgs = ((InternalEObject) documentGeneratorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TEXT_DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION, null, msgs);
			}
			if (newDocumentGeneratorConfiguration != null) {
				msgs = ((InternalEObject) newDocumentGeneratorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TEXT_DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION, null, msgs);
			}
			msgs = basicSetDocumentGeneratorConfiguration(newDocumentGeneratorConfiguration, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TEXT_DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION, newDocumentGeneratorConfiguration, newDocumentGeneratorConfiguration));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getMainTitle() {
		return mainTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMainTitle(String newMainTitle) {
		String oldMainTitle = mainTitle;
		mainTitle = newMainTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TEXT_DOCUMENT__MAIN_TITLE, oldMainTitle, mainTitle));
		}
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DocumentStructurePackage.TEXT_DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION:
			return basicSetDocumentGeneratorConfiguration(null, msgs);
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
		case DocumentStructurePackage.TEXT_DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION:
			return getDocumentGeneratorConfiguration();
		case DocumentStructurePackage.TEXT_DOCUMENT__MAIN_TITLE:
			return getMainTitle();
		case DocumentStructurePackage.TEXT_DOCUMENT__TEXT_DOCUMENT_PART:
			return getTextDocumentPart();
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
		case DocumentStructurePackage.TEXT_DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION:
			setDocumentGeneratorConfiguration((IDocumentGeneratorConfiguration) newValue);
			return;
		case DocumentStructurePackage.TEXT_DOCUMENT__MAIN_TITLE:
			setMainTitle((String) newValue);
			return;
		case DocumentStructurePackage.TEXT_DOCUMENT__TEXT_DOCUMENT_PART:
			getTextDocumentPart().clear();
			getTextDocumentPart().addAll((Collection<? extends TextDocumentPart>) newValue);
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
		case DocumentStructurePackage.TEXT_DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION:
			setDocumentGeneratorConfiguration((IDocumentGeneratorConfiguration) null);
			return;
		case DocumentStructurePackage.TEXT_DOCUMENT__MAIN_TITLE:
			setMainTitle(MAIN_TITLE_EDEFAULT);
			return;
		case DocumentStructurePackage.TEXT_DOCUMENT__TEXT_DOCUMENT_PART:
			getTextDocumentPart().clear();
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
		case DocumentStructurePackage.TEXT_DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION:
			return documentGeneratorConfiguration != null;
		case DocumentStructurePackage.TEXT_DOCUMENT__MAIN_TITLE:
			return MAIN_TITLE_EDEFAULT == null ? mainTitle != null : !MAIN_TITLE_EDEFAULT.equals(mainTitle);
		case DocumentStructurePackage.TEXT_DOCUMENT__TEXT_DOCUMENT_PART:
			return textDocumentPart != null && !textDocumentPart.isEmpty();
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
		result.append(" (mainTitle: "); //$NON-NLS-1$
		result.append(mainTitle);
		result.append(')');
		return result.toString();
	}

} // TextDocumentImpl
