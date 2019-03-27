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
package org.eclipse.papyrus.model2doc.core.generatorconfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GeneratorConfiguration'"
 * @generated
 */
public interface GeneratorConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "generatorconfiguration"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/1.0.0/generatorconfiguration"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "generatorconfiguration"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	GeneratorConfigurationPackage eINSTANCE = org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationImpl <em>Generator Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationImpl
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getGeneratorConfiguration()
	 * @generated
	 */
	int GENERATOR_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Document Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONFIGURATION__DOCUMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Document Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONFIGURATION__DOCUMENT_FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Document Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID = 2;

	/**
	 * The number of structural features of the '<em>Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentGeneratorConfigurationImpl <em>Abstract Document Generator Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentGeneratorConfigurationImpl
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getAbstractDocumentGeneratorConfiguration()
	 * @generated
	 */
	int ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Document Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_NAME = GENERATOR_CONFIGURATION__DOCUMENT_NAME;

	/**
	 * The feature id for the '<em><b>Document Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER = GENERATOR_CONFIGURATION__DOCUMENT_FOLDER;

	/**
	 * The feature id for the '<em><b>Document Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID = GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID;

	/**
	 * The feature id for the '<em><b>Save Document Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE = GENERATOR_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Save Images</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES = GENERATOR_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Document Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION_FEATURE_COUNT = GENERATOR_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Document Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION_OPERATION_COUNT = GENERATOR_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentStructureGeneratorConfigurationImpl <em>Abstract Document Structure Generator Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentStructureGeneratorConfigurationImpl
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getAbstractDocumentStructureGeneratorConfiguration()
	 * @generated
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Document Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__DOCUMENT_NAME = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_NAME;

	/**
	 * The feature id for the '<em><b>Document Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER;

	/**
	 * The feature id for the '<em><b>Document Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID;

	/**
	 * The feature id for the '<em><b>Save Document Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Save Images</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__SAVE_IMAGES = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES;

	/**
	 * The feature id for the '<em><b>Structure Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Document Structure Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION_FEATURE_COUNT = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Document Structure Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION_OPERATION_COUNT = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.DefaultDocumentStructureGeneratorConfigurationImpl <em>Default Document Structure Generator Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.DefaultDocumentStructureGeneratorConfigurationImpl
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getDefaultDocumentStructureGeneratorConfiguration()
	 * @generated
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Document Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__DOCUMENT_NAME = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__DOCUMENT_NAME;

	/**
	 * The feature id for the '<em><b>Document Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER;

	/**
	 * The feature id for the '<em><b>Document Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID;

	/**
	 * The feature id for the '<em><b>Save Document Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Save Images</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__SAVE_IMAGES = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__SAVE_IMAGES;

	/**
	 * The feature id for the '<em><b>Structure Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID;

	/**
	 * The feature id for the '<em><b>Image Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER;

	/**
	 * The feature id for the '<em><b>Structure Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER;

	/**
	 * The number of structural features of the '<em>Default Document Structure Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION_FEATURE_COUNT = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Document Generator Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_GENERATOR_CONFIGURATION = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Document Structure Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION_OPERATION_COUNT = ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration <em>IDocument Structure Generator Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getIDocumentStructureGeneratorConfiguration()
	 * @generated
	 */
	int IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION = 4;

	/**
	 * The number of structural features of the '<em>IDocument Structure Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Document Generator Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_GENERATOR_CONFIGURATION = 0;

	/**
	 * The number of operations of the '<em>IDocument Structure Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration <em>IDocument Generator Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getIDocumentGeneratorConfiguration()
	 * @generated
	 */
	int IDOCUMENT_GENERATOR_CONFIGURATION = 5;

	/**
	 * The number of structural features of the '<em>IDocument Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IDOCUMENT_GENERATOR_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IDocument Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IDOCUMENT_GENERATOR_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.DefaultDocumentGeneratorConfigurationImpl <em>Default Document Generator Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.DefaultDocumentGeneratorConfigurationImpl
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getDefaultDocumentGeneratorConfiguration()
	 * @generated
	 */
	int DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Document Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_NAME = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_NAME;

	/**
	 * The feature id for the '<em><b>Document Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_FOLDER;

	/**
	 * The feature id for the '<em><b>Document Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID;

	/**
	 * The feature id for the '<em><b>Save Document Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Save Images</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES;

	/**
	 * The number of structural features of the '<em>Default Document Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION_FEATURE_COUNT = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Document Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION_OPERATION_COUNT = ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration <em>Default Document Structure Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Default Document Structure Generator Configuration</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration
	 * @generated
	 */
	EClass getDefaultDocumentStructureGeneratorConfiguration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration <em>Abstract Document Structure Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Abstract Document Structure Generator Configuration</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration
	 * @generated
	 */
	EClass getAbstractDocumentStructureGeneratorConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getStructureGeneratorId <em>Structure Generator Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Structure Generator Id</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getStructureGeneratorId()
	 * @see #getAbstractDocumentStructureGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getAbstractDocumentStructureGeneratorConfiguration_StructureGeneratorId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getImageFolder <em>Image Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Image Folder</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getImageFolder()
	 * @see #getAbstractDocumentStructureGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getAbstractDocumentStructureGeneratorConfiguration_ImageFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getStructureFolder <em>Structure Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Structure Folder</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getStructureFolder()
	 * @see #getAbstractDocumentStructureGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getAbstractDocumentStructureGeneratorConfiguration_StructureFolder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration <em>Abstract Document Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Abstract Document Generator Configuration</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration
	 * @generated
	 */
	EClass getAbstractDocumentGeneratorConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#isSaveDocumentStructure <em>Save Document Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Save Document Structure</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#isSaveDocumentStructure()
	 * @see #getAbstractDocumentGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getAbstractDocumentGeneratorConfiguration_SaveDocumentStructure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#isSaveImages <em>Save Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Save Images</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#isSaveImages()
	 * @see #getAbstractDocumentGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getAbstractDocumentGeneratorConfiguration_SaveImages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration <em>Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Generator Configuration</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration
	 * @generated
	 */
	EClass getGeneratorConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentName <em>Document Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Document Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentName()
	 * @see #getGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getGeneratorConfiguration_DocumentName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentFolder <em>Document Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Document Folder</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentFolder()
	 * @see #getGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getGeneratorConfiguration_DocumentFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentGeneratorId <em>Document Generator Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Document Generator Id</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentGeneratorId()
	 * @see #getGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getGeneratorConfiguration_DocumentGeneratorId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration <em>IDocument Structure Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>IDocument Structure Generator Configuration</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration
	 * @generated
	 */
	EClass getIDocumentStructureGeneratorConfiguration();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration#createDocumentGeneratorConfiguration() <em>Create Document Generator Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Create Document Generator Configuration</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration#createDocumentGeneratorConfiguration()
	 * @generated
	 */
	EOperation getIDocumentStructureGeneratorConfiguration__CreateDocumentGeneratorConfiguration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration <em>IDocument Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>IDocument Generator Configuration</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration
	 * @generated
	 */
	EClass getIDocumentGeneratorConfiguration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration <em>Default Document Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Default Document Generator Configuration</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration
	 * @generated
	 */
	EClass getDefaultDocumentGeneratorConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratorConfigurationFactory getGeneratorConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.DefaultDocumentStructureGeneratorConfigurationImpl <em>Default Document Structure Generator Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.DefaultDocumentStructureGeneratorConfigurationImpl
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getDefaultDocumentStructureGeneratorConfiguration()
		 * @generated
		 */
		EClass DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION = eINSTANCE.getDefaultDocumentStructureGeneratorConfiguration();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentStructureGeneratorConfigurationImpl <em>Abstract Document Structure Generator Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentStructureGeneratorConfigurationImpl
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getAbstractDocumentStructureGeneratorConfiguration()
		 * @generated
		 */
		EClass ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION = eINSTANCE.getAbstractDocumentStructureGeneratorConfiguration();

		/**
		 * The meta object literal for the '<em><b>Structure Generator Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID = eINSTANCE.getAbstractDocumentStructureGeneratorConfiguration_StructureGeneratorId();

		/**
		 * The meta object literal for the '<em><b>Image Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER = eINSTANCE.getAbstractDocumentStructureGeneratorConfiguration_ImageFolder();

		/**
		 * The meta object literal for the '<em><b>Structure Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER = eINSTANCE.getAbstractDocumentStructureGeneratorConfiguration_StructureFolder();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentGeneratorConfigurationImpl <em>Abstract Document Generator Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.AbstractDocumentGeneratorConfigurationImpl
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getAbstractDocumentGeneratorConfiguration()
		 * @generated
		 */
		EClass ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION = eINSTANCE.getAbstractDocumentGeneratorConfiguration();

		/**
		 * The meta object literal for the '<em><b>Save Document Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE = eINSTANCE.getAbstractDocumentGeneratorConfiguration_SaveDocumentStructure();

		/**
		 * The meta object literal for the '<em><b>Save Images</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES = eINSTANCE.getAbstractDocumentGeneratorConfiguration_SaveImages();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationImpl <em>Generator Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationImpl
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getGeneratorConfiguration()
		 * @generated
		 */
		EClass GENERATOR_CONFIGURATION = eINSTANCE.getGeneratorConfiguration();

		/**
		 * The meta object literal for the '<em><b>Document Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute GENERATOR_CONFIGURATION__DOCUMENT_NAME = eINSTANCE.getGeneratorConfiguration_DocumentName();

		/**
		 * The meta object literal for the '<em><b>Document Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute GENERATOR_CONFIGURATION__DOCUMENT_FOLDER = eINSTANCE.getGeneratorConfiguration_DocumentFolder();

		/**
		 * The meta object literal for the '<em><b>Document Generator Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID = eINSTANCE.getGeneratorConfiguration_DocumentGeneratorId();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration <em>IDocument Structure Generator Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getIDocumentStructureGeneratorConfiguration()
		 * @generated
		 */
		EClass IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION = eINSTANCE.getIDocumentStructureGeneratorConfiguration();

		/**
		 * The meta object literal for the '<em><b>Create Document Generator Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_GENERATOR_CONFIGURATION = eINSTANCE.getIDocumentStructureGeneratorConfiguration__CreateDocumentGeneratorConfiguration();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration <em>IDocument Generator Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getIDocumentGeneratorConfiguration()
		 * @generated
		 */
		EClass IDOCUMENT_GENERATOR_CONFIGURATION = eINSTANCE.getIDocumentGeneratorConfiguration();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.DefaultDocumentGeneratorConfigurationImpl <em>Default Document Generator Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.DefaultDocumentGeneratorConfigurationImpl
		 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationPackageImpl#getDefaultDocumentGeneratorConfiguration()
		 * @generated
		 */
		EClass DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION = eINSTANCE.getDefaultDocumentGeneratorConfiguration();

	}

} // GeneratorConfigurationPackage
