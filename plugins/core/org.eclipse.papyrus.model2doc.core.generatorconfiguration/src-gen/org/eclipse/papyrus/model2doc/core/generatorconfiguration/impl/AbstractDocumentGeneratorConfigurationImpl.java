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

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Document Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentGeneratorConfigurationImpl#isSaveDocumentStructure <em>Save Document Structure</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentGeneratorConfigurationImpl#isSaveImages <em>Save Images</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentGeneratorConfigurationImpl#getTemplateFile <em>Template File</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentGeneratorConfigurationImpl#getDocumentName <em>Document Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentGeneratorConfigurationImpl#getDocumentFolder <em>Document Folder</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentGeneratorConfigurationImpl#getDocumentGeneratorId <em>Document Generator Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDocumentGeneratorConfigurationImpl extends MinimalEObjectImpl.Container implements AbstractDocumentGeneratorConfiguration {
	/**
	 * The default value of the '{@link #isSaveDocumentStructure() <em>Save Document Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isSaveDocumentStructure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAVE_DOCUMENT_STRUCTURE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSaveDocumentStructure() <em>Save Document Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isSaveDocumentStructure()
	 * @generated
	 * @ordered
	 */
	protected boolean saveDocumentStructure = SAVE_DOCUMENT_STRUCTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSaveImages() <em>Save Images</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isSaveImages()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAVE_IMAGES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSaveImages() <em>Save Images</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isSaveImages()
	 * @generated
	 * @ordered
	 */
	protected boolean saveImages = SAVE_IMAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateFile() <em>Template File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTemplateFile()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateFile() <em>Template File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTemplateFile()
	 * @generated
	 * @ordered
	 */
	protected String templateFile = TEMPLATE_FILE_EDEFAULT;

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
	protected AbstractDocumentGeneratorConfigurationImpl() {
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
		return GeneratorConfigurationPackage.Literals.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSaveDocumentStructure() {
		return saveDocumentStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSaveDocumentStructure(boolean newSaveDocumentStructure) {
		boolean oldSaveDocumentStructure = saveDocumentStructure;
		saveDocumentStructure = newSaveDocumentStructure;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE, oldSaveDocumentStructure, saveDocumentStructure));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSaveImages() {
		return saveImages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSaveImages(boolean newSaveImages) {
		boolean oldSaveImages = saveImages;
		saveImages = newSaveImages;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES, oldSaveImages, saveImages));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getTemplateFile() {
		return templateFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTemplateFile(String newTemplateFile) {
		String oldTemplateFile = templateFile;
		templateFile = newTemplateFile;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__TEMPLATE_FILE, oldTemplateFile, templateFile));
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_NAME, oldDocumentName, documentName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER, oldDocumentFolder, documentFolder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID, oldDocumentGeneratorId, documentGeneratorId));
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
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE:
			return isSaveDocumentStructure();
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES:
			return isSaveImages();
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__TEMPLATE_FILE:
			return getTemplateFile();
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_NAME:
			return getDocumentName();
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER:
			return getDocumentFolder();
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID:
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
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE:
			setSaveDocumentStructure((Boolean) newValue);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES:
			setSaveImages((Boolean) newValue);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__TEMPLATE_FILE:
			setTemplateFile((String) newValue);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_NAME:
			setDocumentName((String) newValue);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER:
			setDocumentFolder((String) newValue);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID:
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
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE:
			setSaveDocumentStructure(SAVE_DOCUMENT_STRUCTURE_EDEFAULT);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES:
			setSaveImages(SAVE_IMAGES_EDEFAULT);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__TEMPLATE_FILE:
			setTemplateFile(TEMPLATE_FILE_EDEFAULT);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_NAME:
			setDocumentName(DOCUMENT_NAME_EDEFAULT);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER:
			setDocumentFolder(DOCUMENT_FOLDER_EDEFAULT);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID:
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
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE:
			return saveDocumentStructure != SAVE_DOCUMENT_STRUCTURE_EDEFAULT;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES:
			return saveImages != SAVE_IMAGES_EDEFAULT;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__TEMPLATE_FILE:
			return TEMPLATE_FILE_EDEFAULT == null ? templateFile != null : !TEMPLATE_FILE_EDEFAULT.equals(templateFile);
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_NAME:
			return DOCUMENT_NAME_EDEFAULT == null ? documentName != null : !DOCUMENT_NAME_EDEFAULT.equals(documentName);
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER:
			return DOCUMENT_FOLDER_EDEFAULT == null ? documentFolder != null : !DOCUMENT_FOLDER_EDEFAULT.equals(documentFolder);
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID:
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
		result.append(" (saveDocumentStructure: "); //$NON-NLS-1$
		result.append(saveDocumentStructure);
		result.append(", saveImages: "); //$NON-NLS-1$
		result.append(saveImages);
		result.append(", templateFile: "); //$NON-NLS-1$
		result.append(templateFile);
		result.append(", documentName: "); //$NON-NLS-1$
		result.append(documentName);
		result.append(", documentFolder: "); //$NON-NLS-1$
		result.append(documentFolder);
		result.append(", documentGeneratorId: "); //$NON-NLS-1$
		result.append(documentGeneratorId);
		result.append(')');
		return result.toString();
	}

} // AbstractDocumentGeneratorConfigurationImpl
