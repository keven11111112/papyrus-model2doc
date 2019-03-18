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

import org.eclipse.papyrus.model2doc.emf.documentstructure.CoverPage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.GenerationConfiguration;
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
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl#getCoverPage <em>Cover Page</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl#getGenerationConfiguration <em>Generation Configuration</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl#getMainTitle <em>Main Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl#getTextDocumentPart <em>Text Document Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextDocumentImpl extends MinimalEObjectImpl.Container implements TextDocument {
	/**
	 * The cached value of the '{@link #getCoverPage() <em>Cover Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCoverPage()
	 * @generated
	 * @ordered
	 */
	protected CoverPage coverPage;

	/**
	 * The cached value of the '{@link #getGenerationConfiguration() <em>Generation Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getGenerationConfiguration()
	 * @generated
	 * @ordered
	 */
	protected GenerationConfiguration generationConfiguration;

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
	public CoverPage getCoverPage() {
		return coverPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetCoverPage(CoverPage newCoverPage, NotificationChain msgs) {
		CoverPage oldCoverPage = coverPage;
		coverPage = newCoverPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TEXT_DOCUMENT__COVER_PAGE, oldCoverPage, newCoverPage);
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
	public void setCoverPage(CoverPage newCoverPage) {
		if (newCoverPage != coverPage) {
			NotificationChain msgs = null;
			if (coverPage != null) {
				msgs = ((InternalEObject) coverPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TEXT_DOCUMENT__COVER_PAGE, null, msgs);
			}
			if (newCoverPage != null) {
				msgs = ((InternalEObject) newCoverPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TEXT_DOCUMENT__COVER_PAGE, null, msgs);
			}
			msgs = basicSetCoverPage(newCoverPage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TEXT_DOCUMENT__COVER_PAGE, newCoverPage, newCoverPage));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public GenerationConfiguration getGenerationConfiguration() {
		return generationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetGenerationConfiguration(GenerationConfiguration newGenerationConfiguration, NotificationChain msgs) {
		GenerationConfiguration oldGenerationConfiguration = generationConfiguration;
		generationConfiguration = newGenerationConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TEXT_DOCUMENT__GENERATION_CONFIGURATION, oldGenerationConfiguration, newGenerationConfiguration);
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
	public void setGenerationConfiguration(GenerationConfiguration newGenerationConfiguration) {
		if (newGenerationConfiguration != generationConfiguration) {
			NotificationChain msgs = null;
			if (generationConfiguration != null) {
				msgs = ((InternalEObject) generationConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TEXT_DOCUMENT__GENERATION_CONFIGURATION, null, msgs);
			}
			if (newGenerationConfiguration != null) {
				msgs = ((InternalEObject) newGenerationConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TEXT_DOCUMENT__GENERATION_CONFIGURATION, null, msgs);
			}
			msgs = basicSetGenerationConfiguration(newGenerationConfiguration, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TEXT_DOCUMENT__GENERATION_CONFIGURATION, newGenerationConfiguration, newGenerationConfiguration));
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
		case DocumentStructurePackage.TEXT_DOCUMENT__COVER_PAGE:
			return basicSetCoverPage(null, msgs);
		case DocumentStructurePackage.TEXT_DOCUMENT__GENERATION_CONFIGURATION:
			return basicSetGenerationConfiguration(null, msgs);
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
		case DocumentStructurePackage.TEXT_DOCUMENT__COVER_PAGE:
			return getCoverPage();
		case DocumentStructurePackage.TEXT_DOCUMENT__GENERATION_CONFIGURATION:
			return getGenerationConfiguration();
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
		case DocumentStructurePackage.TEXT_DOCUMENT__COVER_PAGE:
			setCoverPage((CoverPage) newValue);
			return;
		case DocumentStructurePackage.TEXT_DOCUMENT__GENERATION_CONFIGURATION:
			setGenerationConfiguration((GenerationConfiguration) newValue);
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
		case DocumentStructurePackage.TEXT_DOCUMENT__COVER_PAGE:
			setCoverPage((CoverPage) null);
			return;
		case DocumentStructurePackage.TEXT_DOCUMENT__GENERATION_CONFIGURATION:
			setGenerationConfiguration((GenerationConfiguration) null);
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
		case DocumentStructurePackage.TEXT_DOCUMENT__COVER_PAGE:
			return coverPage != null;
		case DocumentStructurePackage.TEXT_DOCUMENT__GENERATION_CONFIGURATION:
			return generationConfiguration != null;
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
