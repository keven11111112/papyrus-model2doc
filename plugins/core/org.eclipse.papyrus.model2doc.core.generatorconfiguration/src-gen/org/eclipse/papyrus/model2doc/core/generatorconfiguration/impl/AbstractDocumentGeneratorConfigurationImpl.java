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
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDocumentGeneratorConfigurationImpl extends GeneratorConfigurationImpl implements AbstractDocumentGeneratorConfiguration {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE:
			return isSaveDocumentStructure();
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES:
			return isSaveImages();
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__TEMPLATE_FILE:
			return getTemplateFile();
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
		result.append(')');
		return result.toString();
	}

} // AbstractDocumentGeneratorConfigurationImpl
