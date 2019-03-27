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
package org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationImpl#getDocumentName <em>Document Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationImpl#getDocumentFolder <em>Document Folder</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationImpl#getDocumentGeneratorId <em>Document Generator Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorConfigurationImpl extends MinimalEObjectImpl.Container implements GeneratorConfiguration {
	/**
	 * The default value of the '{@link #getDocumentName() <em>Document Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentName() <em>Document Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentName()
	 * @generated
	 * @ordered
	 */
	protected String documentName = DOCUMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentFolder() <em>Document Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentFolder() <em>Document Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentFolder()
	 * @generated
	 * @ordered
	 */
	protected String documentFolder = DOCUMENT_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentGeneratorId() <em>Document Generator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentGeneratorId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_GENERATOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentGeneratorId() <em>Document Generator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentGeneratorId()
	 * @generated
	 * @ordered
	 */
	protected String documentGeneratorId = DOCUMENT_GENERATOR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected GeneratorConfigurationImpl() {
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
		return GeneratorConfigurationPackage.Literals.GENERATOR_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDocumentName() {
		return documentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDocumentName(String newDocumentName) {
		String oldDocumentName = documentName;
		documentName = newDocumentName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_NAME, oldDocumentName, documentName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDocumentFolder() {
		return documentFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDocumentFolder(String newDocumentFolder) {
		String oldDocumentFolder = documentFolder;
		documentFolder = newDocumentFolder;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_FOLDER, oldDocumentFolder, documentFolder));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDocumentGeneratorId() {
		return documentGeneratorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDocumentGeneratorId(String newDocumentGeneratorId) {
		String oldDocumentGeneratorId = documentGeneratorId;
		documentGeneratorId = newDocumentGeneratorId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID, oldDocumentGeneratorId, documentGeneratorId));
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
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_NAME:
			return getDocumentName();
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_FOLDER:
			return getDocumentFolder();
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID:
			return getDocumentGeneratorId();
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
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_NAME:
			setDocumentName((String) newValue);
			return;
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_FOLDER:
			setDocumentFolder((String) newValue);
			return;
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID:
			setDocumentGeneratorId((String) newValue);
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
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_NAME:
			setDocumentName(DOCUMENT_NAME_EDEFAULT);
			return;
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_FOLDER:
			setDocumentFolder(DOCUMENT_FOLDER_EDEFAULT);
			return;
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID:
			setDocumentGeneratorId(DOCUMENT_GENERATOR_ID_EDEFAULT);
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
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_NAME:
			return DOCUMENT_NAME_EDEFAULT == null ? documentName != null : !DOCUMENT_NAME_EDEFAULT.equals(documentName);
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_FOLDER:
			return DOCUMENT_FOLDER_EDEFAULT == null ? documentFolder != null : !DOCUMENT_FOLDER_EDEFAULT.equals(documentFolder);
		case GeneratorConfigurationPackage.GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID:
			return DOCUMENT_GENERATOR_ID_EDEFAULT == null ? documentGeneratorId != null : !DOCUMENT_GENERATOR_ID_EDEFAULT.equals(documentGeneratorId);
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
		result.append(" (documentName: "); //$NON-NLS-1$
		result.append(documentName);
		result.append(", documentFolder: "); //$NON-NLS-1$
		result.append(documentFolder);
		result.append(", documentGeneratorId: "); //$NON-NLS-1$
		result.append(documentGeneratorId);
		result.append(')');
		return result.toString();
	}

} // GeneratorConfigurationImpl
