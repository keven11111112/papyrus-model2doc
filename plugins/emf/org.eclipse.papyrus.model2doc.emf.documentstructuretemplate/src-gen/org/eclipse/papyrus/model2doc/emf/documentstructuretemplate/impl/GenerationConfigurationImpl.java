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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.GenerationConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.GenerationConfigurationImpl#getOuputFile <em>Ouput File</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.GenerationConfigurationImpl#getOuputFolder <em>Ouput Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationConfigurationImpl extends MinimalEObjectImpl.Container implements GenerationConfiguration {
	/**
	 * The default value of the '{@link #getOuputFile() <em>Ouput File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOuputFile()
	 * @generated
	 * @ordered
	 */
	protected static final String OUPUT_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOuputFile() <em>Ouput File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOuputFile()
	 * @generated
	 * @ordered
	 */
	protected String ouputFile = OUPUT_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOuputFolder() <em>Ouput Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOuputFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String OUPUT_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOuputFolder() <em>Ouput Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOuputFolder()
	 * @generated
	 * @ordered
	 */
	protected String ouputFolder = OUPUT_FOLDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected GenerationConfigurationImpl() {
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
		return DocumentStructureTemplatePackage.Literals.GENERATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getOuputFile() {
		return ouputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOuputFile(String newOuputFile) {
		String oldOuputFile = ouputFile;
		ouputFile = newOuputFile;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.GENERATION_CONFIGURATION__OUPUT_FILE, oldOuputFile, ouputFile));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getOuputFolder() {
		return ouputFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOuputFolder(String newOuputFolder) {
		String oldOuputFolder = ouputFolder;
		ouputFolder = newOuputFolder;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.GENERATION_CONFIGURATION__OUPUT_FOLDER, oldOuputFolder, ouputFolder));
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
		case DocumentStructureTemplatePackage.GENERATION_CONFIGURATION__OUPUT_FILE:
			return getOuputFile();
		case DocumentStructureTemplatePackage.GENERATION_CONFIGURATION__OUPUT_FOLDER:
			return getOuputFolder();
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
		case DocumentStructureTemplatePackage.GENERATION_CONFIGURATION__OUPUT_FILE:
			setOuputFile((String) newValue);
			return;
		case DocumentStructureTemplatePackage.GENERATION_CONFIGURATION__OUPUT_FOLDER:
			setOuputFolder((String) newValue);
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
		case DocumentStructureTemplatePackage.GENERATION_CONFIGURATION__OUPUT_FILE:
			setOuputFile(OUPUT_FILE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.GENERATION_CONFIGURATION__OUPUT_FOLDER:
			setOuputFolder(OUPUT_FOLDER_EDEFAULT);
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
		case DocumentStructureTemplatePackage.GENERATION_CONFIGURATION__OUPUT_FILE:
			return OUPUT_FILE_EDEFAULT == null ? ouputFile != null : !OUPUT_FILE_EDEFAULT.equals(ouputFile);
		case DocumentStructureTemplatePackage.GENERATION_CONFIGURATION__OUPUT_FOLDER:
			return OUPUT_FOLDER_EDEFAULT == null ? ouputFolder != null : !OUPUT_FOLDER_EDEFAULT.equals(ouputFolder);
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
		result.append(" (ouputFile: "); //$NON-NLS-1$
		result.append(ouputFile);
		result.append(", ouputFolder: "); //$NON-NLS-1$
		result.append(ouputFolder);
		result.append(')');
		return result.toString();
	}

} // GenerationConfigurationImpl
