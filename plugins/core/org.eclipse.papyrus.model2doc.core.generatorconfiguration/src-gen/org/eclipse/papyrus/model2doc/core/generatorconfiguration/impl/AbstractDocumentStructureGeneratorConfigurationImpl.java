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

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Document Structure Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentStructureGeneratorConfigurationImpl#getStructureGeneratorId <em>Structure Generator Id</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentStructureGeneratorConfigurationImpl#getImageFolder <em>Image Folder</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentStructureGeneratorConfigurationImpl#getStructureFolder <em>Structure Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDocumentStructureGeneratorConfigurationImpl extends AbstractDocumentGeneratorConfigurationImpl implements AbstractDocumentStructureGeneratorConfiguration {
	/**
	 * The default value of the '{@link #getStructureGeneratorId() <em>Structure Generator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStructureGeneratorId()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCTURE_GENERATOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructureGeneratorId() <em>Structure Generator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStructureGeneratorId()
	 * @generated
	 * @ordered
	 */
	protected String structureGeneratorId = STRUCTURE_GENERATOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageFolder() <em>Image Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getImageFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageFolder() <em>Image Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getImageFolder()
	 * @generated
	 * @ordered
	 */
	protected String imageFolder = IMAGE_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStructureFolder() <em>Structure Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStructureFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCTURE_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructureFolder() <em>Structure Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStructureFolder()
	 * @generated
	 * @ordered
	 */
	protected String structureFolder = STRUCTURE_FOLDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected AbstractDocumentStructureGeneratorConfigurationImpl() {
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
		return GeneratorConfigurationPackage.Literals.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getStructureGeneratorId() {
		return structureGeneratorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setStructureGeneratorId(String newStructureGeneratorId) {
		String oldStructureGeneratorId = structureGeneratorId;
		structureGeneratorId = newStructureGeneratorId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID, oldStructureGeneratorId, structureGeneratorId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getImageFolder() {
		return imageFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setImageFolder(String newImageFolder) {
		String oldImageFolder = imageFolder;
		imageFolder = newImageFolder;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER, oldImageFolder, imageFolder));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getStructureFolder() {
		return structureFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setStructureFolder(String newStructureFolder) {
		String oldStructureFolder = structureFolder;
		structureFolder = newStructureFolder;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER, oldStructureFolder, structureFolder));
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
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID:
			return getStructureGeneratorId();
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER:
			return getImageFolder();
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER:
			return getStructureFolder();
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
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID:
			setStructureGeneratorId((String) newValue);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER:
			setImageFolder((String) newValue);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER:
			setStructureFolder((String) newValue);
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
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID:
			setStructureGeneratorId(STRUCTURE_GENERATOR_ID_EDEFAULT);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER:
			setImageFolder(IMAGE_FOLDER_EDEFAULT);
			return;
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER:
			setStructureFolder(STRUCTURE_FOLDER_EDEFAULT);
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
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID:
			return STRUCTURE_GENERATOR_ID_EDEFAULT == null ? structureGeneratorId != null : !STRUCTURE_GENERATOR_ID_EDEFAULT.equals(structureGeneratorId);
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER:
			return IMAGE_FOLDER_EDEFAULT == null ? imageFolder != null : !IMAGE_FOLDER_EDEFAULT.equals(imageFolder);
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER:
			return STRUCTURE_FOLDER_EDEFAULT == null ? structureFolder != null : !STRUCTURE_FOLDER_EDEFAULT.equals(structureFolder);
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
		result.append(" (structureGeneratorId: "); //$NON-NLS-1$
		result.append(structureGeneratorId);
		result.append(", imageFolder: "); //$NON-NLS-1$
		result.append(imageFolder);
		result.append(", structureFolder: "); //$NON-NLS-1$
		result.append(structureFolder);
		result.append(')');
		return result.toString();
	}

} // AbstractDocumentStructureGeneratorConfigurationImpl
