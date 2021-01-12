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
package org.eclipse.papyrus.model2doc.emf.documentstructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage;

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
 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DocumentStructure'"
 * @generated
 */
public interface DocumentStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "documentstructure"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/emf/1.0.0/documentstructure"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "documentstructure"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	DocumentStructurePackage eINSTANCE = org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Document
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Document Generator Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl <em>Text Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getTextDocument()
	 * @generated
	 */
	int TEXT_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Document Generator Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION = DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__AUTHOR = DOCUMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__VERSION = DOCUMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Main Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__MAIN_TITLE = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Document Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__TEXT_DOCUMENT_PART = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart <em>Text Document Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getTextDocumentPart()
	 * @generated
	 */
	int TEXT_DOCUMENT_PART = 1;

	/**
	 * The number of structural features of the '<em>Text Document Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_PART_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Document Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Version <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Version
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 3;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VERSION___GET_VERSION = 0;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.BodyImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getBody()
	 * @generated
	 */
	int BODY = 4;

	/**
	 * The feature id for the '<em><b>Body Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY__BODY_PART = TEXT_DOCUMENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = TEXT_DOCUMENT_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = TEXT_DOCUMENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart <em>Body Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getBodyPart()
	 * @generated
	 */
	int BODY_PART = 5;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY_PART__DATA_SOURCE = 0;

	/**
	 * The number of structural features of the '<em>Body Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY_PART_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Body Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 6;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ComposedBodyPart <em>Composed Body Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ComposedBodyPart
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getComposedBodyPart()
	 * @generated
	 */
	int COMPOSED_BODY_PART = 8;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSED_BODY_PART__DATA_SOURCE = BODY_PART__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Sub Body Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSED_BODY_PART__SUB_BODY_PART = BODY_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composed Body Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSED_BODY_PART_FEATURE_COUNT = BODY_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composed Body Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSED_BODY_PART_OPERATION_COUNT = BODY_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ParagraphImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 7;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__DATA_SOURCE = COMPOSED_BODY_PART__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Sub Body Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__SUB_BODY_PART = COMPOSED_BODY_PART__SUB_BODY_PART;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = COMPOSED_BODY_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = COMPOSED_BODY_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = COMPOSED_BODY_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TitleImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 9;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE__DATA_SOURCE = COMPOSED_BODY_PART__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Sub Body Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE__SUB_BODY_PART = COMPOSED_BODY_PART__SUB_BODY_PART;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE__TITLE = COMPOSED_BODY_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = COMPOSED_BODY_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE___GET_LEVEL = COMPOSED_BODY_PART_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = COMPOSED_BODY_PART_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.LeafBodyPart <em>Leaf Body Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.LeafBodyPart
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getLeafBodyPart()
	 * @generated
	 */
	int LEAF_BODY_PART = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ImageImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 10;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE__FILE_PATH = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE__FILE_PATH;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE__DATA_SOURCE = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE__CAPTION = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get File Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE___GET_FILE_PATH = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE___GET_FILE_PATH;

	/**
	 * The operation id for the '<em>Get File Accessor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE___GET_FILE_ACCESSOR = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE___GET_FILE_ACCESSOR;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LEAF_BODY_PART__DATA_SOURCE = BODY_PART__DATA_SOURCE;

	/**
	 * The number of structural features of the '<em>Leaf Body Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LEAF_BODY_PART_FEATURE_COUNT = BODY_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leaf Body Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LEAF_BODY_PART_OPERATION_COUNT = BODY_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.IGeneratedFile <em>IGenerated File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.IGeneratedFile
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getIGeneratedFile()
	 * @generated
	 */
	int IGENERATED_FILE = 12;

	/**
	 * The number of structural features of the '<em>IGenerated File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IGENERATED_FILE_FEATURE_COUNT = BuiltInTypesPackage.IFILE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get File Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IGENERATED_FILE___GET_FILE_PATH = BuiltInTypesPackage.IFILE_REFERENCE___GET_FILE_PATH;

	/**
	 * The operation id for the '<em>Get File Accessor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IGENERATED_FILE___GET_FILE_ACCESSOR = BuiltInTypesPackage.IFILE_REFERENCE___GET_FILE_ACCESSOR;

	/**
	 * The number of operations of the '<em>IGenerated File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IGENERATED_FILE_OPERATION_COUNT = BuiltInTypesPackage.IFILE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.EMFDataSourceImpl <em>EMF Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.EMFDataSourceImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getEMFDataSource()
	 * @generated
	 */
	int EMF_DATA_SOURCE = 13;

	/**
	 * The feature id for the '<em><b>Eobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EMF_DATA_SOURCE__EOBJECT = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EMF_DATA_SOURCE__FEATURE = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMF Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EMF_DATA_SOURCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EMF Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EMF_DATA_SOURCE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TableOfFiguresImpl <em>Table Of Figures</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TableOfFiguresImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getTableOfFigures()
	 * @generated
	 */
	int TABLE_OF_FIGURES = 14;

	/**
	 * The feature id for the '<em><b>Tof Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_FIGURES__TOF_TITLE = TEXT_DOCUMENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Of Figures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_FIGURES_FEATURE_COUNT = TEXT_DOCUMENT_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Of Figures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_FIGURES_OPERATION_COUNT = TEXT_DOCUMENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TableOfContentsImpl <em>Table Of Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TableOfContentsImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getTableOfContents()
	 * @generated
	 */
	int TABLE_OF_CONTENTS = 15;

	/**
	 * The feature id for the '<em><b>Toc Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__TOC_TITLE = TEXT_DOCUMENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Of Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_FEATURE_COUNT = TEXT_DOCUMENT_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Of Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_OPERATION_COUNT = TEXT_DOCUMENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedBasicTableImpl <em>Extended Basic Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedBasicTableImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getExtendedBasicTable()
	 * @generated
	 */
	int EXTENDED_BASIC_TABLE = 16;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_TABLE__CAPTION = BuiltInTypesPackage.BASIC_TABLE__CAPTION;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_TABLE__ROWS = BuiltInTypesPackage.BASIC_TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_TABLE__DATA_SOURCE = BuiltInTypesPackage.BASIC_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Basic Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_TABLE_FEATURE_COUNT = BuiltInTypesPackage.BASIC_TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Rows Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_TABLE___GET_ROWS_NUMBER = BuiltInTypesPackage.BASIC_TABLE___GET_ROWS_NUMBER;

	/**
	 * The operation id for the '<em>Get Columns Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_TABLE___GET_COLUMNS_NUMBER = BuiltInTypesPackage.BASIC_TABLE___GET_COLUMNS_NUMBER;

	/**
	 * The operation id for the '<em>Get All Cells</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_TABLE___GET_ALL_CELLS = BuiltInTypesPackage.BASIC_TABLE___GET_ALL_CELLS;

	/**
	 * The number of operations of the '<em>Extended Basic Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_TABLE_OPERATION_COUNT = BuiltInTypesPackage.BASIC_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedTextCellImpl <em>Extended Text Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedTextCellImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getExtendedTextCell()
	 * @generated
	 */
	int EXTENDED_TEXT_CELL = 17;

	/**
	 * The feature id for the '<em><b>Named Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_CELL__NAMED_STYLES = BuiltInTypesPackage.TEXT_CELL__NAMED_STYLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_CELL__LOCATION = BuiltInTypesPackage.TEXT_CELL__LOCATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_CELL__TEXT = BuiltInTypesPackage.TEXT_CELL__TEXT;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_CELL__DATA_SOURCE = BuiltInTypesPackage.TEXT_CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Text Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_CELL_FEATURE_COUNT = BuiltInTypesPackage.TEXT_CELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_CELL___GET_NAMED_STYLE__STRING = BuiltInTypesPackage.TEXT_CELL___GET_NAMED_STYLE__STRING;

	/**
	 * The number of operations of the '<em>Extended Text Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_CELL_OPERATION_COUNT = BuiltInTypesPackage.TEXT_CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedBasicListImpl <em>Extended Basic List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedBasicListImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getExtendedBasicList()
	 * @generated
	 */
	int EXTENDED_BASIC_LIST = 18;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_LIST__ITEMS = BuiltInTypesPackage.BASIC_LIST__ITEMS;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_LIST__DATA_SOURCE = BuiltInTypesPackage.BASIC_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Basic List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_LIST_FEATURE_COUNT = BuiltInTypesPackage.BASIC_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extended Basic List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BASIC_LIST_OPERATION_COUNT = BuiltInTypesPackage.BASIC_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedTextListItemImpl <em>Extended Text List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedTextListItemImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getExtendedTextListItem()
	 * @generated
	 */
	int EXTENDED_TEXT_LIST_ITEM = 19;

	/**
	 * The feature id for the '<em><b>Sub Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_LIST_ITEM__SUB_ITEMS = BuiltInTypesPackage.TEXT_LIST_ITEM__SUB_ITEMS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_LIST_ITEM__TEXT = BuiltInTypesPackage.TEXT_LIST_ITEM__TEXT;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_LIST_ITEM__DATASOURCE = BuiltInTypesPackage.TEXT_LIST_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Text List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_LIST_ITEM_FEATURE_COUNT = BuiltInTypesPackage.TEXT_LIST_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_LIST_ITEM___GET_LEVEL = BuiltInTypesPackage.TEXT_LIST_ITEM___GET_LEVEL;

	/**
	 * The number of operations of the '<em>Extended Text List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TEXT_LIST_ITEM_OPERATION_COUNT = BuiltInTypesPackage.TEXT_LIST_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.StringVersionImpl <em>String Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.StringVersionImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getStringVersion()
	 * @generated
	 */
	int STRING_VERSION = 20;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_VERSION__VERSION = VERSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_VERSION_FEATURE_COUNT = VERSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_VERSION___GET_VERSION = VERSION___GET_VERSION;

	/**
	 * The number of operations of the '<em>String Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_VERSION_OPERATION_COUNT = VERSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.InsertedFileImpl <em>Inserted File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.InsertedFileImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getInsertedFile()
	 * @generated
	 */
	int INSERTED_FILE = 21;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_FILE__FILE_PATH = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE__FILE_PATH;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_FILE__DATA_SOURCE = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inserted File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_FILE_FEATURE_COUNT = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get File Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_FILE___GET_FILE_PATH = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE___GET_FILE_PATH;

	/**
	 * The operation id for the '<em>Get File Accessor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_FILE___GET_FILE_ACCESSOR = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE___GET_FILE_ACCESSOR;

	/**
	 * The number of operations of the '<em>Inserted File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_FILE_OPERATION_COUNT = BuiltInTypesPackage.DEFAULT_FILE_REFERENCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.EmptyLineImpl <em>Empty Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.EmptyLineImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getEmptyLine()
	 * @generated
	 */
	int EMPTY_LINE = 22;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EMPTY_LINE__DATA_SOURCE = LEAF_BODY_PART__DATA_SOURCE;

	/**
	 * The number of structural features of the '<em>Empty Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EMPTY_LINE_FEATURE_COUNT = LEAF_BODY_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EMPTY_LINE_OPERATION_COUNT = LEAF_BODY_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedFileReferenceCellImpl <em>Extended File Reference Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedFileReferenceCellImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getExtendedFileReferenceCell()
	 * @generated
	 */
	int EXTENDED_FILE_REFERENCE_CELL = 23;

	/**
	 * The feature id for the '<em><b>Named Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FILE_REFERENCE_CELL__NAMED_STYLES = BuiltInTypesPackage.FILE_REFERENCE_CELL__NAMED_STYLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FILE_REFERENCE_CELL__LOCATION = BuiltInTypesPackage.FILE_REFERENCE_CELL__LOCATION;

	/**
	 * The feature id for the '<em><b>File Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FILE_REFERENCE_CELL__FILE_REFERENCE = BuiltInTypesPackage.FILE_REFERENCE_CELL__FILE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FILE_REFERENCE_CELL__DATASOURCE = BuiltInTypesPackage.FILE_REFERENCE_CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended File Reference Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FILE_REFERENCE_CELL_FEATURE_COUNT = BuiltInTypesPackage.FILE_REFERENCE_CELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FILE_REFERENCE_CELL___GET_NAMED_STYLE__STRING = BuiltInTypesPackage.FILE_REFERENCE_CELL___GET_NAMED_STYLE__STRING;

	/**
	 * The number of operations of the '<em>Extended File Reference Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FILE_REFERENCE_CELL_OPERATION_COUNT = BuiltInTypesPackage.FILE_REFERENCE_CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.InsertedGeneratedFileImpl <em>Inserted Generated File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.InsertedGeneratedFileImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getInsertedGeneratedFile()
	 * @generated
	 */
	int INSERTED_GENERATED_FILE = 24;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_GENERATED_FILE__FILE_PATH = INSERTED_FILE__FILE_PATH;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_GENERATED_FILE__DATA_SOURCE = INSERTED_FILE__DATA_SOURCE;

	/**
	 * The number of structural features of the '<em>Inserted Generated File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_GENERATED_FILE_FEATURE_COUNT = INSERTED_FILE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get File Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_GENERATED_FILE___GET_FILE_PATH = INSERTED_FILE___GET_FILE_PATH;

	/**
	 * The operation id for the '<em>Get File Accessor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_GENERATED_FILE___GET_FILE_ACCESSOR = INSERTED_FILE___GET_FILE_ACCESSOR;

	/**
	 * The number of operations of the '<em>Inserted Generated File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSERTED_GENERATED_FILE_OPERATION_COUNT = INSERTED_FILE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument <em>Text Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Text Document</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument
	 * @generated
	 */
	EClass getTextDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument#getMainTitle <em>Main Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Main Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument#getMainTitle()
	 * @see #getTextDocument()
	 * @generated
	 */
	EAttribute getTextDocument_MainTitle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument#getTextDocumentParts <em>Text Document Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Text Document Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument#getTextDocumentParts()
	 * @see #getTextDocument()
	 * @generated
	 */
	EReference getTextDocument_TextDocumentPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart <em>Text Document Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Text Document Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart
	 * @generated
	 */
	EClass getTextDocumentPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getDocumentGeneratorConfiguration <em>Document Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Document Generator Configuration</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getDocumentGeneratorConfiguration()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_DocumentGeneratorConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getAuthors()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Author();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getVersion()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Version#getVersion() <em>Get Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Version</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Version#getVersion()
	 * @generated
	 */
	EOperation getVersion__GetVersion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Body</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Body#getBodyParts <em>Body Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Body Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Body#getBodyParts()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_BodyPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart <em>Body Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Body Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart
	 * @generated
	 */
	EClass getBodyPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Data Source</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart#getDataSource()
	 * @see #getBodyPart()
	 * @generated
	 */
	EReference getBodyPart_DataSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph#getText()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ComposedBodyPart <em>Composed Body Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Composed Body Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ComposedBodyPart
	 * @generated
	 */
	EClass getComposedBodyPart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ComposedBodyPart#getSubBodyParts <em>Sub Body Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Sub Body Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ComposedBodyPart#getSubBodyParts()
	 * @see #getComposedBodyPart()
	 * @generated
	 */
	EReference getComposedBodyPart_SubBodyPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Title#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Title#getTitle()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Title();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Title#getLevel() <em>Get Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Level</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Title#getLevel()
	 * @generated
	 */
	EOperation getTitle__GetLevel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Image#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Image#getCaption()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Caption();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.LeafBodyPart <em>Leaf Body Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Leaf Body Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.LeafBodyPart
	 * @generated
	 */
	EClass getLeafBodyPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.IGeneratedFile <em>IGenerated File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>IGenerated File</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.IGeneratedFile
	 * @generated
	 */
	EClass getIGeneratedFile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.EMFDataSource <em>EMF Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EMF Data Source</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.EMFDataSource
	 * @generated
	 */
	EClass getEMFDataSource();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.EMFDataSource#getEobject <em>Eobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Eobject</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.EMFDataSource#getEobject()
	 * @see #getEMFDataSource()
	 * @generated
	 */
	EReference getEMFDataSource_Eobject();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.EMFDataSource#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.EMFDataSource#getFeature()
	 * @see #getEMFDataSource()
	 * @generated
	 */
	EReference getEMFDataSource_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfFigures <em>Table Of Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Table Of Figures</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfFigures
	 * @generated
	 */
	EClass getTableOfFigures();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfFigures#getTofTitle <em>Tof Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Tof Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfFigures#getTofTitle()
	 * @see #getTableOfFigures()
	 * @generated
	 */
	EAttribute getTableOfFigures_TofTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents <em>Table Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Table Of Contents</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents
	 * @generated
	 */
	EClass getTableOfContents();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents#getTocTitle <em>Toc Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Toc Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents#getTocTitle()
	 * @see #getTableOfContents()
	 * @generated
	 */
	EAttribute getTableOfContents_TocTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicTable <em>Extended Basic Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Extended Basic Table</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicTable
	 * @generated
	 */
	EClass getExtendedBasicTable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextCell <em>Extended Text Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Extended Text Cell</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextCell
	 * @generated
	 */
	EClass getExtendedTextCell();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextCell#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Data Source</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextCell#getDataSource()
	 * @see #getExtendedTextCell()
	 * @generated
	 */
	EReference getExtendedTextCell_DataSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicList <em>Extended Basic List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Extended Basic List</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicList
	 * @generated
	 */
	EClass getExtendedBasicList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextListItem <em>Extended Text List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Extended Text List Item</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextListItem
	 * @generated
	 */
	EClass getExtendedTextListItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextListItem#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Datasource</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextListItem#getDatasource()
	 * @see #getExtendedTextListItem()
	 * @generated
	 */
	EReference getExtendedTextListItem_Datasource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.StringVersion <em>String Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>String Version</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.StringVersion
	 * @generated
	 */
	EClass getStringVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.StringVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.StringVersion#getVersion()
	 * @see #getStringVersion()
	 * @generated
	 */
	EAttribute getStringVersion_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedFile <em>Inserted File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Inserted File</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedFile
	 * @generated
	 */
	EClass getInsertedFile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.EmptyLine <em>Empty Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Empty Line</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.EmptyLine
	 * @generated
	 */
	EClass getEmptyLine();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedFileReferenceCell <em>Extended File Reference Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Extended File Reference Cell</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedFileReferenceCell
	 * @generated
	 */
	EClass getExtendedFileReferenceCell();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedFileReferenceCell#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Datasource</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedFileReferenceCell#getDatasource()
	 * @see #getExtendedFileReferenceCell()
	 * @generated
	 */
	EReference getExtendedFileReferenceCell_Datasource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedGeneratedFile <em>Inserted Generated File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Inserted Generated File</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedGeneratedFile
	 * @generated
	 */
	EClass getInsertedGeneratedFile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocumentStructureFactory getDocumentStructureFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl <em>Text Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TextDocumentImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getTextDocument()
		 * @generated
		 */
		EClass TEXT_DOCUMENT = eINSTANCE.getTextDocument();

		/**
		 * The meta object literal for the '<em><b>Main Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TEXT_DOCUMENT__MAIN_TITLE = eINSTANCE.getTextDocument_MainTitle();

		/**
		 * The meta object literal for the '<em><b>Text Document Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TEXT_DOCUMENT__TEXT_DOCUMENT_PART = eINSTANCE.getTextDocument_TextDocumentPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart <em>Text Document Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getTextDocumentPart()
		 * @generated
		 */
		EClass TEXT_DOCUMENT_PART = eINSTANCE.getTextDocumentPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Document
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Document Generator Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION = eINSTANCE.getDocument_DocumentGeneratorConfiguration();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT__AUTHOR = eINSTANCE.getDocument_Author();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT__VERSION = eINSTANCE.getDocument_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Version <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.Version
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Get Version</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation VERSION___GET_VERSION = eINSTANCE.getVersion__GetVersion();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.BodyImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Body Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BODY__BODY_PART = eINSTANCE.getBody_BodyPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart <em>Body Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getBodyPart()
		 * @generated
		 */
		EClass BODY_PART = eINSTANCE.getBodyPart();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BODY_PART__DATA_SOURCE = eINSTANCE.getBodyPart_DataSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ParagraphImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PARAGRAPH__TEXT = eINSTANCE.getParagraph_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.ComposedBodyPart <em>Composed Body Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.ComposedBodyPart
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getComposedBodyPart()
		 * @generated
		 */
		EClass COMPOSED_BODY_PART = eINSTANCE.getComposedBodyPart();

		/**
		 * The meta object literal for the '<em><b>Sub Body Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference COMPOSED_BODY_PART__SUB_BODY_PART = eINSTANCE.getComposedBodyPart_SubBodyPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TitleImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TITLE__TITLE = eINSTANCE.getTitle_Title();

		/**
		 * The meta object literal for the '<em><b>Get Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation TITLE___GET_LEVEL = eINSTANCE.getTitle__GetLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ImageImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IMAGE__CAPTION = eINSTANCE.getImage_Caption();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.LeafBodyPart <em>Leaf Body Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.LeafBodyPart
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getLeafBodyPart()
		 * @generated
		 */
		EClass LEAF_BODY_PART = eINSTANCE.getLeafBodyPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.IGeneratedFile <em>IGenerated File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.IGeneratedFile
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getIGeneratedFile()
		 * @generated
		 */
		EClass IGENERATED_FILE = eINSTANCE.getIGeneratedFile();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.EMFDataSourceImpl <em>EMF Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.EMFDataSourceImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getEMFDataSource()
		 * @generated
		 */
		EClass EMF_DATA_SOURCE = eINSTANCE.getEMFDataSource();

		/**
		 * The meta object literal for the '<em><b>Eobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EMF_DATA_SOURCE__EOBJECT = eINSTANCE.getEMFDataSource_Eobject();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EMF_DATA_SOURCE__FEATURE = eINSTANCE.getEMFDataSource_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TableOfFiguresImpl <em>Table Of Figures</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TableOfFiguresImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getTableOfFigures()
		 * @generated
		 */
		EClass TABLE_OF_FIGURES = eINSTANCE.getTableOfFigures();

		/**
		 * The meta object literal for the '<em><b>Tof Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TABLE_OF_FIGURES__TOF_TITLE = eINSTANCE.getTableOfFigures_TofTitle();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TableOfContentsImpl <em>Table Of Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TableOfContentsImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getTableOfContents()
		 * @generated
		 */
		EClass TABLE_OF_CONTENTS = eINSTANCE.getTableOfContents();

		/**
		 * The meta object literal for the '<em><b>Toc Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TABLE_OF_CONTENTS__TOC_TITLE = eINSTANCE.getTableOfContents_TocTitle();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedBasicTableImpl <em>Extended Basic Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedBasicTableImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getExtendedBasicTable()
		 * @generated
		 */
		EClass EXTENDED_BASIC_TABLE = eINSTANCE.getExtendedBasicTable();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedTextCellImpl <em>Extended Text Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedTextCellImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getExtendedTextCell()
		 * @generated
		 */
		EClass EXTENDED_TEXT_CELL = eINSTANCE.getExtendedTextCell();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EXTENDED_TEXT_CELL__DATA_SOURCE = eINSTANCE.getExtendedTextCell_DataSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedBasicListImpl <em>Extended Basic List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedBasicListImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getExtendedBasicList()
		 * @generated
		 */
		EClass EXTENDED_BASIC_LIST = eINSTANCE.getExtendedBasicList();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedTextListItemImpl <em>Extended Text List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedTextListItemImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getExtendedTextListItem()
		 * @generated
		 */
		EClass EXTENDED_TEXT_LIST_ITEM = eINSTANCE.getExtendedTextListItem();

		/**
		 * The meta object literal for the '<em><b>Datasource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EXTENDED_TEXT_LIST_ITEM__DATASOURCE = eINSTANCE.getExtendedTextListItem_Datasource();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.StringVersionImpl <em>String Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.StringVersionImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getStringVersion()
		 * @generated
		 */
		EClass STRING_VERSION = eINSTANCE.getStringVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STRING_VERSION__VERSION = eINSTANCE.getStringVersion_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.InsertedFileImpl <em>Inserted File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.InsertedFileImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getInsertedFile()
		 * @generated
		 */
		EClass INSERTED_FILE = eINSTANCE.getInsertedFile();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.EmptyLineImpl <em>Empty Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.EmptyLineImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getEmptyLine()
		 * @generated
		 */
		EClass EMPTY_LINE = eINSTANCE.getEmptyLine();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedFileReferenceCellImpl <em>Extended File Reference Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedFileReferenceCellImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getExtendedFileReferenceCell()
		 * @generated
		 */
		EClass EXTENDED_FILE_REFERENCE_CELL = eINSTANCE.getExtendedFileReferenceCell();

		/**
		 * The meta object literal for the '<em><b>Datasource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EXTENDED_FILE_REFERENCE_CELL__DATASOURCE = eINSTANCE.getExtendedFileReferenceCell_Datasource();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.InsertedGeneratedFileImpl <em>Inserted Generated File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.InsertedGeneratedFileImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructurePackageImpl#getInsertedGeneratedFile()
		 * @generated
		 */
		EClass INSERTED_GENERATED_FILE = eINSTANCE.getInsertedGeneratedFile();

	}

} // DocumentStructurePackage
