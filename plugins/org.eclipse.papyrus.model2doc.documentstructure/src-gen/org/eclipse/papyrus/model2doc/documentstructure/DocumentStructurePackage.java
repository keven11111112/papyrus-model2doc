/**
 * Copyright (c) 2018 CEA LIST.
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
package org.eclipse.papyrus.model2doc.documentstructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentStructureFactory
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
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/1.0.0/documentstructure"; //$NON-NLS-1$

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
	DocumentStructurePackage eINSTANCE = org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.Text <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.Text
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getText()
	 * @generated
	 */
	int TEXT = 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.Document <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.Document
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 5;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 0;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.TextDocumentImpl <em>Text Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.TextDocumentImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getTextDocument()
	 * @generated
	 */
	int TEXT_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__BODY = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.BodyImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getBody()
	 * @generated
	 */
	int BODY = 2;

	/**
	 * The feature id for the '<em><b>Document Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY__DOCUMENT_PART = 0;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.DocumentPart <em>Document Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentPart
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getDocumentPart()
	 * @generated
	 */
	int DOCUMENT_PART = 3;

	/**
	 * The feature id for the '<em><b>Text Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART__TEXT_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Sub Document Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART__SUB_DOCUMENT_PART = 1;

	/**
	 * The number of structural features of the '<em>Document Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.TextSource <em>Text Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.TextSource
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getTextSource()
	 * @generated
	 */
	int TEXT_SOURCE = 4;

	/**
	 * The number of structural features of the '<em>Text Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.ListImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getList()
	 * @generated
	 */
	int LIST = 6;

	/**
	 * The feature id for the '<em><b>Text Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LIST__TEXT_SOURCE = DOCUMENT_PART__TEXT_SOURCE;

	/**
	 * The feature id for the '<em><b>Sub Document Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LIST__SUB_DOCUMENT_PART = DOCUMENT_PART__SUB_DOCUMENT_PART;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = DOCUMENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = DOCUMENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.TextPart <em>Text Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.TextPart
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getTextPart()
	 * @generated
	 */
	int TEXT_PART = 8;

	/**
	 * The feature id for the '<em><b>Text Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_PART__TEXT_SOURCE = DOCUMENT_PART__TEXT_SOURCE;

	/**
	 * The feature id for the '<em><b>Sub Document Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_PART__SUB_DOCUMENT_PART = DOCUMENT_PART__SUB_DOCUMENT_PART;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_PART__TEXT = DOCUMENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_PART_FEATURE_COUNT = DOCUMENT_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_PART_OPERATION_COUNT = DOCUMENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.ParagraphImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 7;

	/**
	 * The feature id for the '<em><b>Text Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT_SOURCE = TEXT_PART__TEXT_SOURCE;

	/**
	 * The feature id for the '<em><b>Sub Document Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__SUB_DOCUMENT_PART = TEXT_PART__SUB_DOCUMENT_PART;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = TEXT_PART__TEXT;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = TEXT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = TEXT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.TitleImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 9;

	/**
	 * The feature id for the '<em><b>Text Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE__TEXT_SOURCE = TEXT_PART__TEXT_SOURCE;

	/**
	 * The feature id for the '<em><b>Sub Document Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE__SUB_DOCUMENT_PART = TEXT_PART__SUB_DOCUMENT_PART;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE__TEXT = TEXT_PART__TEXT;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = TEXT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = TEXT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.ImageImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 10;

	/**
	 * The feature id for the '<em><b>Text Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE__TEXT_SOURCE = TEXT_PART__TEXT_SOURCE;

	/**
	 * The feature id for the '<em><b>Sub Document Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE__SUB_DOCUMENT_PART = TEXT_PART__SUB_DOCUMENT_PART;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE__TEXT = TEXT_PART__TEXT;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = TEXT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = TEXT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.StringTextImpl <em>String Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.StringTextImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getStringText()
	 * @generated
	 */
	int STRING_TEXT = 11;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_TEXT__TEXT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_TEXT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.EObjectFeatureTextSourceImpl <em>EObject Feature Text Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.EObjectFeatureTextSourceImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getEObjectFeatureTextSource()
	 * @generated
	 */
	int EOBJECT_FEATURE_TEXT_SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Eobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_FEATURE_TEXT_SOURCE__EOBJECT = TEXT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_FEATURE_TEXT_SOURCE__FEATURE = TEXT_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EObject Feature Text Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_FEATURE_TEXT_SOURCE_FEATURE_COUNT = TEXT_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EObject Feature Text Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_FEATURE_TEXT_SOURCE_OPERATION_COUNT = TEXT_SOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.TextDocument <em>Text Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Text Document</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.TextDocument
	 * @generated
	 */
	EClass getTextDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.documentstructure.TextDocument#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.TextDocument#getBody()
	 * @see #getTextDocument()
	 * @generated
	 */
	EReference getTextDocument_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Body</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.documentstructure.Body#getDocumentPart <em>Document Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Document Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.Body#getDocumentPart()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_DocumentPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.DocumentPart <em>Document Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Document Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentPart
	 * @generated
	 */
	EClass getDocumentPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.documentstructure.DocumentPart#getTextSource <em>Text Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Text Source</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentPart#getTextSource()
	 * @see #getDocumentPart()
	 * @generated
	 */
	EReference getDocumentPart_TextSource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.documentstructure.DocumentPart#getSubDocumentPart <em>Sub Document Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Sub Document Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentPart#getSubDocumentPart()
	 * @see #getDocumentPart()
	 * @generated
	 */
	EReference getDocumentPart_SubDocumentPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.TextSource <em>Text Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Text Source</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.TextSource
	 * @generated
	 */
	EClass getTextSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.TextPart <em>Text Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Text Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.TextPart
	 * @generated
	 */
	EClass getTextPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.documentstructure.TextPart#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.TextPart#getText()
	 * @see #getTextPart()
	 * @generated
	 */
	EReference getTextPart_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.StringText <em>String Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>String Text</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.StringText
	 * @generated
	 */
	EClass getStringText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentstructure.StringText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.StringText#getText()
	 * @see #getStringText()
	 * @generated
	 */
	EAttribute getStringText_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructure.EObjectFeatureTextSource <em>EObject Feature Text Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EObject Feature Text Source</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.EObjectFeatureTextSource
	 * @generated
	 */
	EClass getEObjectFeatureTextSource();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.documentstructure.EObjectFeatureTextSource#getEobject <em>Eobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Eobject</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.EObjectFeatureTextSource#getEobject()
	 * @see #getEObjectFeatureTextSource()
	 * @generated
	 */
	EReference getEObjectFeatureTextSource_Eobject();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.documentstructure.EObjectFeatureTextSource#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.EObjectFeatureTextSource#getFeature()
	 * @see #getEObjectFeatureTextSource()
	 * @generated
	 */
	EReference getEObjectFeatureTextSource_Feature();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.Text <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.Text
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.TextDocumentImpl <em>Text Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.TextDocumentImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getTextDocument()
		 * @generated
		 */
		EClass TEXT_DOCUMENT = eINSTANCE.getTextDocument();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TEXT_DOCUMENT__BODY = eINSTANCE.getTextDocument_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.BodyImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Document Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BODY__DOCUMENT_PART = eINSTANCE.getBody_DocumentPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.DocumentPart <em>Document Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentPart
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getDocumentPart()
		 * @generated
		 */
		EClass DOCUMENT_PART = eINSTANCE.getDocumentPart();

		/**
		 * The meta object literal for the '<em><b>Text Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT_PART__TEXT_SOURCE = eINSTANCE.getDocumentPart_TextSource();

		/**
		 * The meta object literal for the '<em><b>Sub Document Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT_PART__SUB_DOCUMENT_PART = eINSTANCE.getDocumentPart_SubDocumentPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.TextSource <em>Text Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.TextSource
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getTextSource()
		 * @generated
		 */
		EClass TEXT_SOURCE = eINSTANCE.getTextSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.Document <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.Document
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.ListImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.ParagraphImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.TextPart <em>Text Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.TextPart
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getTextPart()
		 * @generated
		 */
		EClass TEXT_PART = eINSTANCE.getTextPart();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TEXT_PART__TEXT = eINSTANCE.getTextPart_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.TitleImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.ImageImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.StringTextImpl <em>String Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.StringTextImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getStringText()
		 * @generated
		 */
		EClass STRING_TEXT = eINSTANCE.getStringText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STRING_TEXT__TEXT = eINSTANCE.getStringText_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructure.impl.EObjectFeatureTextSourceImpl <em>EObject Feature Text Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.EObjectFeatureTextSourceImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructure.impl.DocumentStructurePackageImpl#getEObjectFeatureTextSource()
		 * @generated
		 */
		EClass EOBJECT_FEATURE_TEXT_SOURCE = eINSTANCE.getEObjectFeatureTextSource();

		/**
		 * The meta object literal for the '<em><b>Eobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EOBJECT_FEATURE_TEXT_SOURCE__EOBJECT = eINSTANCE.getEObjectFeatureTextSource_Eobject();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EOBJECT_FEATURE_TEXT_SOURCE__FEATURE = eINSTANCE.getEObjectFeatureTextSource_Feature();

	}

} // DocumentStructurePackage
