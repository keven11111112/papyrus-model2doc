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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.GenerationConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.GenerationConfigurationImpl#getOutputFile <em>Output File</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.GenerationConfigurationImpl#getOutputFolder <em>Output Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationConfigurationImpl extends MinimalEObjectImpl.Container implements GenerationConfiguration {
	/**
	 * The default value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected String outputFile = OUTPUT_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputFolder() <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOutputFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFolder() <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOutputFolder()
	 * @generated
	 * @ordered
	 */
	protected String outputFolder = OUTPUT_FOLDER_EDEFAULT;

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
		return DocumentStructurePackage.Literals.GENERATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getOutputFile() {
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOutputFile(String newOutputFile) {
		String oldOutputFile = outputFile;
		outputFile = newOutputFile;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.GENERATION_CONFIGURATION__OUTPUT_FILE, oldOutputFile, outputFile));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getOutputFolder() {
		return outputFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOutputFolder(String newOutputFolder) {
		String oldOutputFolder = outputFolder;
		outputFolder = newOutputFolder;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.GENERATION_CONFIGURATION__OUTPUT_FOLDER, oldOutputFolder, outputFolder));
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
		case DocumentStructurePackage.GENERATION_CONFIGURATION__OUTPUT_FILE:
			return getOutputFile();
		case DocumentStructurePackage.GENERATION_CONFIGURATION__OUTPUT_FOLDER:
			return getOutputFolder();
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
		case DocumentStructurePackage.GENERATION_CONFIGURATION__OUTPUT_FILE:
			setOutputFile((String) newValue);
			return;
		case DocumentStructurePackage.GENERATION_CONFIGURATION__OUTPUT_FOLDER:
			setOutputFolder((String) newValue);
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
		case DocumentStructurePackage.GENERATION_CONFIGURATION__OUTPUT_FILE:
			setOutputFile(OUTPUT_FILE_EDEFAULT);
			return;
		case DocumentStructurePackage.GENERATION_CONFIGURATION__OUTPUT_FOLDER:
			setOutputFolder(OUTPUT_FOLDER_EDEFAULT);
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
		case DocumentStructurePackage.GENERATION_CONFIGURATION__OUTPUT_FILE:
			return OUTPUT_FILE_EDEFAULT == null ? outputFile != null : !OUTPUT_FILE_EDEFAULT.equals(outputFile);
		case DocumentStructurePackage.GENERATION_CONFIGURATION__OUTPUT_FOLDER:
			return OUTPUT_FOLDER_EDEFAULT == null ? outputFolder != null : !OUTPUT_FOLDER_EDEFAULT.equals(outputFolder);
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
		result.append(" (outputFile: "); //$NON-NLS-1$
		result.append(outputFile);
		result.append(", outputFolder: "); //$NON-NLS-1$
		result.append(outputFolder);
		result.append(')');
		return result.toString();
	}

} // GenerationConfigurationImpl
