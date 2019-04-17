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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplateFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DocumentStructureTemplate'"
 * @generated
 */
public interface DocumentStructureTemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/emf/1.0.0/documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	DocumentStructureTemplatePackage eINSTANCE = org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate <em>Document Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getDocumentTemplate()
	 * @generated
	 */
	int DOCUMENT_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Semantic Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Graphical Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Document Template Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Kind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__KIND_ID = 5;

	/**
	 * The feature id for the '<em><b>Document Structure Generator Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION = 6;

	/**
	 * The number of structural features of the '<em>Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE___GET_TYPE = 0;

	/**
	 * The operation id for the '<em>Get Icon Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE___GET_ICON_PATH = 1;

	/**
	 * The number of operations of the '<em>Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentTemplatePrototypeImpl <em>Document Template Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentTemplatePrototypeImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getDocumentTemplatePrototype()
	 * @generated
	 */
	int DOCUMENT_TEMPLATE_PROTOTYPE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_PROTOTYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_PROTOTYPE__ICON_PATH = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_PROTOTYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Document Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE = 3;

	/**
	 * The number of structural features of the '<em>Document Template Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_PROTOTYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Template Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_PROTOTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl <em>Text Document Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getTextDocumentTemplate()
	 * @generated
	 */
	int TEXT_DOCUMENT_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Semantic Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT = DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT;

	/**
	 * The feature id for the '<em><b>Graphical Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT = DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Document Template Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE = DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__NAME = DOCUMENT_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__DESCRIPTION = DOCUMENT_TEMPLATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__KIND_ID = DOCUMENT_TEMPLATE__KIND_ID;

	/**
	 * The feature id for the '<em><b>Document Structure Generator Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION = DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Main Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__MAIN_TITLE = DOCUMENT_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART = DOCUMENT_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE_FEATURE_COUNT = DOCUMENT_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE___GET_TYPE = DOCUMENT_TEMPLATE___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Icon Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE___GET_ICON_PATH = DOCUMENT_TEMPLATE___GET_ICON_PATH;

	/**
	 * The number of operations of the '<em>Text Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE_OPERATION_COUNT = DOCUMENT_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart <em>Document Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getDocumentPart()
	 * @generated
	 */
	int DOCUMENT_PART = 3;

	/**
	 * The number of structural features of the '<em>Document Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_FEATURE_COUNT = 0;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TableOfContentsImpl <em>Table Of Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TableOfContentsImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getTableOfContents()
	 * @generated
	 */
	int TABLE_OF_CONTENTS = 4;

	/**
	 * The feature id for the '<em><b>Toc Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__TOC_TITLE = DOCUMENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Of Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_FEATURE_COUNT = DOCUMENT_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Of Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_OPERATION_COUNT = DOCUMENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.BodyImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getBody()
	 * @generated
	 */
	int BODY = 5;

	/**
	 * The feature id for the '<em><b>Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY__BODY_PART_TEMPLATE = DOCUMENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = DOCUMENT_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = DOCUMENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate <em>IBody Section Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getIBodySectionPartTemplate()
	 * @generated
	 */
	int IBODY_SECTION_PART_TEMPLATE = 7;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IBODY_SECTION_PART_TEMPLATE__GENERATE = 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE = 1;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE = 2;

	/**
	 * The number of structural features of the '<em>IBody Section Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IBODY_SECTION_PART_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>IBody Section Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IBODY_SECTION_PART_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate <em>IBody Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getIBodyPartTemplate()
	 * @generated
	 */
	int IBODY_PART_TEMPLATE = 6;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IBODY_PART_TEMPLATE__GENERATE = IBODY_SECTION_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IBODY_PART_TEMPLATE__GENERATE_TITLE = IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IBODY_PART_TEMPLATE__CUSTOM_TITLE = IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The number of structural features of the '<em>IBody Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IBODY_PART_TEMPLATE_FEATURE_COUNT = IBODY_SECTION_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IBody Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IBODY_PART_TEMPLATE_OPERATION_COUNT = IBODY_SECTION_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate <em>IComposed Body Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getIComposedBodyPartTemplate()
	 * @generated
	 */
	int ICOMPOSED_BODY_PART_TEMPLATE = 8;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_BODY_PART_TEMPLATE__GENERATE = IBODY_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_BODY_PART_TEMPLATE__GENERATE_TITLE = IBODY_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_BODY_PART_TEMPLATE__CUSTOM_TITLE = IBODY_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Sub Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_BODY_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE = IBODY_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IComposed Body Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_BODY_PART_TEMPLATE_FEATURE_COUNT = IBODY_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IComposed Body Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_BODY_PART_TEMPLATE_OPERATION_COUNT = IBODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate <em>ISub Body Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getISubBodyPartTemplate()
	 * @generated
	 */
	int ISUB_BODY_PART_TEMPLATE = 9;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ISUB_BODY_PART_TEMPLATE__GENERATE = IBODY_SECTION_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ISUB_BODY_PART_TEMPLATE__GENERATE_TITLE = IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ISUB_BODY_PART_TEMPLATE__CUSTOM_TITLE = IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The number of structural features of the '<em>ISub Body Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ISUB_BODY_PART_TEMPLATE_FEATURE_COUNT = IBODY_SECTION_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISub Body Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ISUB_BODY_PART_TEMPLATE_OPERATION_COUNT = IBODY_SECTION_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate <em>ILeaf Body Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getILeafBodyPartTemplate()
	 * @generated
	 */
	int ILEAF_BODY_PART_TEMPLATE = 10;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ILEAF_BODY_PART_TEMPLATE__GENERATE = IBODY_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ILEAF_BODY_PART_TEMPLATE__GENERATE_TITLE = IBODY_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ILEAF_BODY_PART_TEMPLATE__CUSTOM_TITLE = IBODY_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The number of structural features of the '<em>ILeaf Body Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ILEAF_BODY_PART_TEMPLATE_FEATURE_COUNT = IBODY_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ILeaf Body Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ILEAF_BODY_PART_TEMPLATE_OPERATION_COUNT = IBODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate <em>IComposed Sub Body Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getIComposedSubBodyPartTemplate()
	 * @generated
	 */
	int ICOMPOSED_SUB_BODY_PART_TEMPLATE = 11;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_SUB_BODY_PART_TEMPLATE__GENERATE = ISUB_BODY_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_SUB_BODY_PART_TEMPLATE__GENERATE_TITLE = ISUB_BODY_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_SUB_BODY_PART_TEMPLATE__CUSTOM_TITLE = ISUB_BODY_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_SUB_BODY_PART_TEMPLATE__BODY_PART_TEMPLATE = ISUB_BODY_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IComposed Sub Body Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_SUB_BODY_PART_TEMPLATE_FEATURE_COUNT = ISUB_BODY_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IComposed Sub Body Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ICOMPOSED_SUB_BODY_PART_TEMPLATE_OPERATION_COUNT = ISUB_BODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafSubBodyPartTemplate <em>ILeaf Sub Body Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafSubBodyPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getILeafSubBodyPartTemplate()
	 * @generated
	 */
	int ILEAF_SUB_BODY_PART_TEMPLATE = 12;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ILEAF_SUB_BODY_PART_TEMPLATE__GENERATE = ISUB_BODY_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ILEAF_SUB_BODY_PART_TEMPLATE__GENERATE_TITLE = ISUB_BODY_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ILEAF_SUB_BODY_PART_TEMPLATE__CUSTOM_TITLE = ISUB_BODY_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The number of structural features of the '<em>ILeaf Sub Body Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ILEAF_SUB_BODY_PART_TEMPLATE_FEATURE_COUNT = ISUB_BODY_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ILeaf Sub Body Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ILEAF_SUB_BODY_PART_TEMPLATE_OPERATION_COUNT = ISUB_BODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassPartTemplateImpl <em>EClass Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassPartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEClassPartTemplate()
	 * @generated
	 */
	int ECLASS_PART_TEMPLATE = 13;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_PART_TEMPLATE__GENERATE = ICOMPOSED_SUB_BODY_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_PART_TEMPLATE__GENERATE_TITLE = ICOMPOSED_SUB_BODY_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_PART_TEMPLATE__CUSTOM_TITLE = ICOMPOSED_SUB_BODY_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_PART_TEMPLATE__BODY_PART_TEMPLATE = ICOMPOSED_SUB_BODY_PART_TEMPLATE__BODY_PART_TEMPLATE;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_PART_TEMPLATE__ECLASS = ICOMPOSED_SUB_BODY_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_PART_TEMPLATE__FILTER_RULE = ICOMPOSED_SUB_BODY_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EClass Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_PART_TEMPLATE_FEATURE_COUNT = ICOMPOSED_SUB_BODY_PART_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Matching Filter Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_PART_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT = ICOMPOSED_SUB_BODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_PART_TEMPLATE___BUILD_TITLE__EOBJECT = ICOMPOSED_SUB_BODY_PART_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>EClass Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_PART_TEMPLATE_OPERATION_COUNT = ICOMPOSED_SUB_BODY_PART_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferencePartTemplateImpl <em>EReference Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferencePartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEReferencePartTemplate()
	 * @generated
	 */
	int EREFERENCE_PART_TEMPLATE = 14;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PART_TEMPLATE__GENERATE = ICOMPOSED_BODY_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PART_TEMPLATE__GENERATE_TITLE = ICOMPOSED_BODY_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PART_TEMPLATE__CUSTOM_TITLE = ICOMPOSED_BODY_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Sub Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE = ICOMPOSED_BODY_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE;

	/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PART_TEMPLATE__EREFERENCE = ICOMPOSED_BODY_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EReference Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PART_TEMPLATE_FEATURE_COUNT = ICOMPOSED_BODY_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Build Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PART_TEMPLATE___BUILD_TITLE = ICOMPOSED_BODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Matching Referenced EObjects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PART_TEMPLATE___GET_MATCHING_REFERENCED_EOBJECTS__EOBJECT = ICOMPOSED_BODY_PART_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>EReference Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_PART_TEMPLATE_OPERATION_COUNT = ICOMPOSED_BODY_PART_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView <em>ITemplate Part View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getITemplatePartView()
	 * @generated
	 */
	int ITEMPLATE_PART_VIEW = 15;

	/**
	 * The number of structural features of the '<em>ITemplate Part View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITEMPLATE_PART_VIEW_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ITemplate Part View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITEMPLATE_PART_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceListViewImpl <em>EReference List View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceListViewImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEReferenceListView()
	 * @generated
	 */
	int EREFERENCE_LIST_VIEW = 16;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_LIST_VIEW__GENERATE = EREFERENCE_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_LIST_VIEW__GENERATE_TITLE = EREFERENCE_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_LIST_VIEW__CUSTOM_TITLE = EREFERENCE_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Sub Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_LIST_VIEW__SUB_BODY_PART_TEMPLATE = EREFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE;

	/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_LIST_VIEW__EREFERENCE = EREFERENCE_PART_TEMPLATE__EREFERENCE;

	/**
	 * The number of structural features of the '<em>EReference List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_LIST_VIEW_FEATURE_COUNT = EREFERENCE_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_LIST_VIEW___BUILD_TITLE = EREFERENCE_PART_TEMPLATE___BUILD_TITLE;

	/**
	 * The operation id for the '<em>Get Matching Referenced EObjects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_LIST_VIEW___GET_MATCHING_REFERENCED_EOBJECTS__EOBJECT = EREFERENCE_PART_TEMPLATE___GET_MATCHING_REFERENCED_EOBJECTS__EOBJECT;

	/**
	 * The number of operations of the '<em>EReference List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_LIST_VIEW_OPERATION_COUNT = EREFERENCE_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior <em>EClass Filter Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEClassFilterBehavior()
	 * @generated
	 */
	int ECLASS_FILTER_BEHAVIOR = 17;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate <em>Document Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Document Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate
	 * @generated
	 */
	EClass getDocumentTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getSemanticContext <em>Semantic Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Semantic Context</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getSemanticContext()
	 * @see #getDocumentTemplate()
	 * @generated
	 */
	EReference getDocumentTemplate_SemanticContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getGraphicalContext <em>Graphical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Graphical Context</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getGraphicalContext()
	 * @see #getDocumentTemplate()
	 * @generated
	 */
	EReference getDocumentTemplate_GraphicalContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDocumentTemplatePrototype <em>Document Template Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Document Template Prototype</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDocumentTemplatePrototype()
	 * @see #getDocumentTemplate()
	 * @generated
	 */
	EReference getDocumentTemplate_DocumentTemplatePrototype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getName()
	 * @see #getDocumentTemplate()
	 * @generated
	 */
	EAttribute getDocumentTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDescription()
	 * @see #getDocumentTemplate()
	 * @generated
	 */
	EAttribute getDocumentTemplate_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getKindId <em>Kind Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Kind Id</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getKindId()
	 * @see #getDocumentTemplate()
	 * @generated
	 */
	EAttribute getDocumentTemplate_KindId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDocumentStructureGeneratorConfiguration <em>Document Structure Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Document Structure Generator Configuration</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDocumentStructureGeneratorConfiguration()
	 * @see #getDocumentTemplate()
	 * @generated
	 */
	EReference getDocumentTemplate_DocumentStructureGeneratorConfiguration();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getType()
	 * @generated
	 */
	EOperation getDocumentTemplate__GetType();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getIconPath() <em>Get Icon Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Icon Path</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getIconPath()
	 * @generated
	 */
	EOperation getDocumentTemplate__GetIconPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype <em>Document Template Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Document Template Prototype</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype
	 * @generated
	 */
	EClass getDocumentTemplatePrototype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getType()
	 * @see #getDocumentTemplatePrototype()
	 * @generated
	 */
	EAttribute getDocumentTemplatePrototype_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getIconPath <em>Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Icon Path</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getIconPath()
	 * @see #getDocumentTemplatePrototype()
	 * @generated
	 */
	EAttribute getDocumentTemplatePrototype_IconPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getDescription()
	 * @see #getDocumentTemplatePrototype()
	 * @generated
	 */
	EAttribute getDocumentTemplatePrototype_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getDocumentTemplate <em>Document Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Document Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getDocumentTemplate()
	 * @see #getDocumentTemplatePrototype()
	 * @generated
	 */
	EReference getDocumentTemplatePrototype_DocumentTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate <em>Text Document Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Text Document Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate
	 * @generated
	 */
	EClass getTextDocumentTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate#getMainTitle <em>Main Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Main Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate#getMainTitle()
	 * @see #getTextDocumentTemplate()
	 * @generated
	 */
	EAttribute getTextDocumentTemplate_MainTitle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate#getDocumentParts <em>Document Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Document Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate#getDocumentParts()
	 * @see #getTextDocumentTemplate()
	 * @generated
	 */
	EReference getTextDocumentTemplate_DocumentPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart <em>Document Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Document Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart
	 * @generated
	 */
	EClass getDocumentPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents <em>Table Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Table Of Contents</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents
	 * @generated
	 */
	EClass getTableOfContents();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents#getTocTitle <em>Toc Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Toc Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents#getTocTitle()
	 * @see #getTableOfContents()
	 * @generated
	 */
	EAttribute getTableOfContents_TocTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Body</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body#getBodyPartTemplates <em>Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Body Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body#getBodyPartTemplates()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_BodyPartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate <em>IBody Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>IBody Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate
	 * @generated
	 */
	EClass getIBodyPartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate <em>IBody Section Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>IBody Section Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate
	 * @generated
	 */
	EClass getIBodySectionPartTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#isGenerate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Generate</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#isGenerate()
	 * @see #getIBodySectionPartTemplate()
	 * @generated
	 */
	EAttribute getIBodySectionPartTemplate_Generate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#isGenerateTitle <em>Generate Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Generate Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#isGenerateTitle()
	 * @see #getIBodySectionPartTemplate()
	 * @generated
	 */
	EAttribute getIBodySectionPartTemplate_GenerateTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#getCustomTitle <em>Custom Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Custom Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#getCustomTitle()
	 * @see #getIBodySectionPartTemplate()
	 * @generated
	 */
	EAttribute getIBodySectionPartTemplate_CustomTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate <em>IComposed Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>IComposed Body Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate
	 * @generated
	 */
	EClass getIComposedBodyPartTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate#getSubBodyPartTemplates <em>Sub Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Sub Body Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate#getSubBodyPartTemplates()
	 * @see #getIComposedBodyPartTemplate()
	 * @generated
	 */
	EReference getIComposedBodyPartTemplate_SubBodyPartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate <em>ISub Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>ISub Body Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate
	 * @generated
	 */
	EClass getISubBodyPartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate <em>ILeaf Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>ILeaf Body Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate
	 * @generated
	 */
	EClass getILeafBodyPartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate <em>IComposed Sub Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>IComposed Sub Body Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate
	 * @generated
	 */
	EClass getIComposedSubBodyPartTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate#getBodyPartTemplates <em>Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Body Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate#getBodyPartTemplates()
	 * @see #getIComposedSubBodyPartTemplate()
	 * @generated
	 */
	EReference getIComposedSubBodyPartTemplate_BodyPartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafSubBodyPartTemplate <em>ILeaf Sub Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>ILeaf Sub Body Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafSubBodyPartTemplate
	 * @generated
	 */
	EClass getILeafSubBodyPartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate <em>EClass Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EClass Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate
	 * @generated
	 */
	EClass getEClassPartTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate#getEClass()
	 * @see #getEClassPartTemplate()
	 * @generated
	 */
	EReference getEClassPartTemplate_EClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate#getFilterRule <em>Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Filter Rule</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate#getFilterRule()
	 * @see #getEClassPartTemplate()
	 * @generated
	 */
	EAttribute getEClassPartTemplate_FilterRule();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate#isMatchingFilterRule(org.eclipse.emf.ecore.EObject) <em>Is Matching Filter Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Is Matching Filter Rule</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate#isMatchingFilterRule(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEClassPartTemplate__IsMatchingFilterRule__EObject();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate#buildTitle(org.eclipse.emf.ecore.EObject) <em>Build Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Build Title</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate#buildTitle(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEClassPartTemplate__BuildTitle__EObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate <em>EReference Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EReference Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate
	 * @generated
	 */
	EClass getEReferencePartTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate#getEReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>EReference</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate#getEReference()
	 * @see #getEReferencePartTemplate()
	 * @generated
	 */
	EReference getEReferencePartTemplate_EReference();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate#buildTitle() <em>Build Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Build Title</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate#buildTitle()
	 * @generated
	 */
	EOperation getEReferencePartTemplate__BuildTitle();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate#getMatchingReferencedEObjects(org.eclipse.emf.ecore.EObject) <em>Get Matching Referenced EObjects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Matching Referenced EObjects</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate#getMatchingReferencedEObjects(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEReferencePartTemplate__GetMatchingReferencedEObjects__EObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView <em>ITemplate Part View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>ITemplate Part View</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView
	 * @generated
	 */
	EClass getITemplatePartView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceListView <em>EReference List View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EReference List View</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceListView
	 * @generated
	 */
	EClass getEReferenceListView();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior <em>EClass Filter Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>EClass Filter Behavior</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior
	 * @generated
	 */
	EEnum getEClassFilterBehavior();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocumentStructureTemplateFactory getDocumentStructureTemplateFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate <em>Document Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getDocumentTemplate()
		 * @generated
		 */
		EClass DOCUMENT_TEMPLATE = eINSTANCE.getDocumentTemplate();

		/**
		 * The meta object literal for the '<em><b>Semantic Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT = eINSTANCE.getDocumentTemplate_SemanticContext();

		/**
		 * The meta object literal for the '<em><b>Graphical Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT = eINSTANCE.getDocumentTemplate_GraphicalContext();

		/**
		 * The meta object literal for the '<em><b>Document Template Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE = eINSTANCE.getDocumentTemplate_DocumentTemplatePrototype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_TEMPLATE__NAME = eINSTANCE.getDocumentTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_TEMPLATE__DESCRIPTION = eINSTANCE.getDocumentTemplate_Description();

		/**
		 * The meta object literal for the '<em><b>Kind Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_TEMPLATE__KIND_ID = eINSTANCE.getDocumentTemplate_KindId();

		/**
		 * The meta object literal for the '<em><b>Document Structure Generator Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION = eINSTANCE.getDocumentTemplate_DocumentStructureGeneratorConfiguration();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation DOCUMENT_TEMPLATE___GET_TYPE = eINSTANCE.getDocumentTemplate__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Icon Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation DOCUMENT_TEMPLATE___GET_ICON_PATH = eINSTANCE.getDocumentTemplate__GetIconPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentTemplatePrototypeImpl <em>Document Template Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentTemplatePrototypeImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getDocumentTemplatePrototype()
		 * @generated
		 */
		EClass DOCUMENT_TEMPLATE_PROTOTYPE = eINSTANCE.getDocumentTemplatePrototype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_TEMPLATE_PROTOTYPE__TYPE = eINSTANCE.getDocumentTemplatePrototype_Type();

		/**
		 * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_TEMPLATE_PROTOTYPE__ICON_PATH = eINSTANCE.getDocumentTemplatePrototype_IconPath();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_TEMPLATE_PROTOTYPE__DESCRIPTION = eINSTANCE.getDocumentTemplatePrototype_Description();

		/**
		 * The meta object literal for the '<em><b>Document Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE = eINSTANCE.getDocumentTemplatePrototype_DocumentTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl <em>Text Document Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getTextDocumentTemplate()
		 * @generated
		 */
		EClass TEXT_DOCUMENT_TEMPLATE = eINSTANCE.getTextDocumentTemplate();

		/**
		 * The meta object literal for the '<em><b>Main Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TEXT_DOCUMENT_TEMPLATE__MAIN_TITLE = eINSTANCE.getTextDocumentTemplate_MainTitle();

		/**
		 * The meta object literal for the '<em><b>Document Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART = eINSTANCE.getTextDocumentTemplate_DocumentPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart <em>Document Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getDocumentPart()
		 * @generated
		 */
		EClass DOCUMENT_PART = eINSTANCE.getDocumentPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TableOfContentsImpl <em>Table Of Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TableOfContentsImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getTableOfContents()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.BodyImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Body Part Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BODY__BODY_PART_TEMPLATE = eINSTANCE.getBody_BodyPartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate <em>IBody Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getIBodyPartTemplate()
		 * @generated
		 */
		EClass IBODY_PART_TEMPLATE = eINSTANCE.getIBodyPartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate <em>IBody Section Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getIBodySectionPartTemplate()
		 * @generated
		 */
		EClass IBODY_SECTION_PART_TEMPLATE = eINSTANCE.getIBodySectionPartTemplate();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IBODY_SECTION_PART_TEMPLATE__GENERATE = eINSTANCE.getIBodySectionPartTemplate_Generate();

		/**
		 * The meta object literal for the '<em><b>Generate Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE = eINSTANCE.getIBodySectionPartTemplate_GenerateTitle();

		/**
		 * The meta object literal for the '<em><b>Custom Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE = eINSTANCE.getIBodySectionPartTemplate_CustomTitle();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate <em>IComposed Body Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getIComposedBodyPartTemplate()
		 * @generated
		 */
		EClass ICOMPOSED_BODY_PART_TEMPLATE = eINSTANCE.getIComposedBodyPartTemplate();

		/**
		 * The meta object literal for the '<em><b>Sub Body Part Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ICOMPOSED_BODY_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE = eINSTANCE.getIComposedBodyPartTemplate_SubBodyPartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate <em>ISub Body Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getISubBodyPartTemplate()
		 * @generated
		 */
		EClass ISUB_BODY_PART_TEMPLATE = eINSTANCE.getISubBodyPartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate <em>ILeaf Body Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getILeafBodyPartTemplate()
		 * @generated
		 */
		EClass ILEAF_BODY_PART_TEMPLATE = eINSTANCE.getILeafBodyPartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate <em>IComposed Sub Body Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getIComposedSubBodyPartTemplate()
		 * @generated
		 */
		EClass ICOMPOSED_SUB_BODY_PART_TEMPLATE = eINSTANCE.getIComposedSubBodyPartTemplate();

		/**
		 * The meta object literal for the '<em><b>Body Part Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ICOMPOSED_SUB_BODY_PART_TEMPLATE__BODY_PART_TEMPLATE = eINSTANCE.getIComposedSubBodyPartTemplate_BodyPartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafSubBodyPartTemplate <em>ILeaf Sub Body Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafSubBodyPartTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getILeafSubBodyPartTemplate()
		 * @generated
		 */
		EClass ILEAF_SUB_BODY_PART_TEMPLATE = eINSTANCE.getILeafSubBodyPartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassPartTemplateImpl <em>EClass Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassPartTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEClassPartTemplate()
		 * @generated
		 */
		EClass ECLASS_PART_TEMPLATE = eINSTANCE.getEClassPartTemplate();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ECLASS_PART_TEMPLATE__ECLASS = eINSTANCE.getEClassPartTemplate_EClass();

		/**
		 * The meta object literal for the '<em><b>Filter Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ECLASS_PART_TEMPLATE__FILTER_RULE = eINSTANCE.getEClassPartTemplate_FilterRule();

		/**
		 * The meta object literal for the '<em><b>Is Matching Filter Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation ECLASS_PART_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT = eINSTANCE.getEClassPartTemplate__IsMatchingFilterRule__EObject();

		/**
		 * The meta object literal for the '<em><b>Build Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation ECLASS_PART_TEMPLATE___BUILD_TITLE__EOBJECT = eINSTANCE.getEClassPartTemplate__BuildTitle__EObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferencePartTemplateImpl <em>EReference Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferencePartTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEReferencePartTemplate()
		 * @generated
		 */
		EClass EREFERENCE_PART_TEMPLATE = eINSTANCE.getEReferencePartTemplate();

		/**
		 * The meta object literal for the '<em><b>EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EREFERENCE_PART_TEMPLATE__EREFERENCE = eINSTANCE.getEReferencePartTemplate_EReference();

		/**
		 * The meta object literal for the '<em><b>Build Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation EREFERENCE_PART_TEMPLATE___BUILD_TITLE = eINSTANCE.getEReferencePartTemplate__BuildTitle();

		/**
		 * The meta object literal for the '<em><b>Get Matching Referenced EObjects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation EREFERENCE_PART_TEMPLATE___GET_MATCHING_REFERENCED_EOBJECTS__EOBJECT = eINSTANCE.getEReferencePartTemplate__GetMatchingReferencedEObjects__EObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView <em>ITemplate Part View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getITemplatePartView()
		 * @generated
		 */
		EClass ITEMPLATE_PART_VIEW = eINSTANCE.getITemplatePartView();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceListViewImpl <em>EReference List View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceListViewImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEReferenceListView()
		 * @generated
		 */
		EClass EREFERENCE_LIST_VIEW = eINSTANCE.getEReferenceListView();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior <em>EClass Filter Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEClassFilterBehavior()
		 * @generated
		 */
		EEnum ECLASS_FILTER_BEHAVIOR = eINSTANCE.getEClassFilterBehavior();

	}

} // DocumentStructureTemplatePackage
