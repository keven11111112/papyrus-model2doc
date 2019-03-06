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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__ICON_PATH = 3;

	/**
	 * The feature id for the '<em><b>Document Template Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Kind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE__KIND_ID = 7;

	/**
	 * The number of structural features of the '<em>Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate <em>Document Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getDocumentPartTemplate()
	 * @generated
	 */
	int DOCUMENT_PART_TEMPLATE = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.FeaturePartTemplate <em>Feature Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.FeaturePartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getFeaturePartTemplate()
	 * @generated
	 */
	int FEATURE_PART_TEMPLATE = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureDocumentPartTemplateImpl <em>EStructural Feature Document Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureDocumentPartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEStructuralFeatureDocumentPartTemplate()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ObjectPartTemplate <em>Object Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ObjectPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getObjectPartTemplate()
	 * @generated
	 */
	int OBJECT_PART_TEMPLATE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl <em>EClass Document Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEClassDocumentPartTemplate()
	 * @generated
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EObjectDocumentPartTemplateImpl <em>EObject Document Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EObjectDocumentPartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEObjectDocumentPartTemplate()
	 * @generated
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TableOfContentsImpl <em>Table Of Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TableOfContentsImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getTableOfContents()
	 * @generated
	 */
	int TABLE_OF_CONTENTS = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.BodyImpl
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getBody()
	 * @generated
	 */
	int BODY = 11;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__TYPE = DOCUMENT_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__ICON_PATH = DOCUMENT_TEMPLATE__ICON_PATH;

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
	 * The feature id for the '<em><b>Document Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART = DOCUMENT_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE_FEATURE_COUNT = DOCUMENT_TEMPLATE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE__GENERATE = 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE__GENERATE_TITLE = 1;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE = 2;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE = 3;

	/**
	 * The number of structural features of the '<em>Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_PART_TEMPLATE__GENERATE = DOCUMENT_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_PART_TEMPLATE__GENERATE_TITLE = DOCUMENT_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_PART_TEMPLATE__DEFAULT_TITLE = DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_PART_TEMPLATE__CUSTOM_TITLE = DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Object Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_PART_TEMPLATE__OBJECT_PART_TEMPLATE = DOCUMENT_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_PART_TEMPLATE_FEATURE_COUNT = DOCUMENT_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_PART_TEMPLATE_OPERATION_COUNT = DOCUMENT_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__GENERATE = FEATURE_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE = FEATURE_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE = FEATURE_PART_TEMPLATE__DEFAULT_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE = FEATURE_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Object Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__OBJECT_PART_TEMPLATE = FEATURE_PART_TEMPLATE__OBJECT_PART_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__FEATURE = FEATURE_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EStructural Feature Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE_FEATURE_COUNT = FEATURE_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EStructural Feature Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE_OPERATION_COUNT = FEATURE_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_PART_TEMPLATE__GENERATE = DOCUMENT_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_PART_TEMPLATE__GENERATE_TITLE = DOCUMENT_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_PART_TEMPLATE__DEFAULT_TITLE = DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_PART_TEMPLATE__CUSTOM_TITLE = DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Feature Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_PART_TEMPLATE__FEATURE_PART_TEMPLATE = DOCUMENT_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_PART_TEMPLATE_FEATURE_COUNT = DOCUMENT_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_PART_TEMPLATE_OPERATION_COUNT = DOCUMENT_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE = OBJECT_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE = OBJECT_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE = OBJECT_PART_TEMPLATE__DEFAULT_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE = OBJECT_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Feature Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE__FEATURE_PART_TEMPLATE = OBJECT_PART_TEMPLATE__FEATURE_PART_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE__ECLASS = OBJECT_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EClass Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE_FEATURE_COUNT = OBJECT_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EClass Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE_OPERATION_COUNT = OBJECT_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE__GENERATE = OBJECT_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE = OBJECT_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE = OBJECT_PART_TEMPLATE__DEFAULT_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE = OBJECT_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Feature Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE__FEATURE_PART_TEMPLATE = OBJECT_PART_TEMPLATE__FEATURE_PART_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Eobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE__EOBJECT = OBJECT_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE_FEATURE_COUNT = OBJECT_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EObject Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE_OPERATION_COUNT = OBJECT_PART_TEMPLATE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Object Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BODY__OBJECT_PART_TEMPLATE = DOCUMENT_PART_FEATURE_COUNT + 0;

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
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getType()
	 * @see #getDocumentTemplate()
	 * @generated
	 */
	EAttribute getDocumentTemplate_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getIconPath <em>Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Icon Path</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getIconPath()
	 * @see #getDocumentTemplate()
	 * @generated
	 */
	EAttribute getDocumentTemplate_IconPath();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate#getDocumentPart <em>Document Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Document Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate#getDocumentPart()
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
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate <em>Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Document Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate
	 * @generated
	 */
	EClass getDocumentPartTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate#isGenerate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Generate</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate#isGenerate()
	 * @see #getDocumentPartTemplate()
	 * @generated
	 */
	EAttribute getDocumentPartTemplate_Generate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate#isGenerateTitle <em>Generate Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Generate Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate#isGenerateTitle()
	 * @see #getDocumentPartTemplate()
	 * @generated
	 */
	EAttribute getDocumentPartTemplate_GenerateTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate#getDefaultTitle <em>Default Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Default Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate#getDefaultTitle()
	 * @see #getDocumentPartTemplate()
	 * @generated
	 */
	EAttribute getDocumentPartTemplate_DefaultTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate#getCustomTitle <em>Custom Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Custom Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate#getCustomTitle()
	 * @see #getDocumentPartTemplate()
	 * @generated
	 */
	EAttribute getDocumentPartTemplate_CustomTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureDocumentPartTemplate <em>EStructural Feature Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EStructural Feature Document Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureDocumentPartTemplate
	 * @generated
	 */
	EClass getEStructuralFeatureDocumentPartTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureDocumentPartTemplate#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureDocumentPartTemplate#getFeature()
	 * @see #getEStructuralFeatureDocumentPartTemplate()
	 * @generated
	 */
	EReference getEStructuralFeatureDocumentPartTemplate_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.FeaturePartTemplate <em>Feature Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Feature Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.FeaturePartTemplate
	 * @generated
	 */
	EClass getFeaturePartTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.FeaturePartTemplate#getObjectPartTemplate <em>Object Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Object Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.FeaturePartTemplate#getObjectPartTemplate()
	 * @see #getFeaturePartTemplate()
	 * @generated
	 */
	EReference getFeaturePartTemplate_ObjectPartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ObjectPartTemplate <em>Object Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Object Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ObjectPartTemplate
	 * @generated
	 */
	EClass getObjectPartTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ObjectPartTemplate#getFeaturePartTemplate <em>Feature Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Feature Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ObjectPartTemplate#getFeaturePartTemplate()
	 * @see #getObjectPartTemplate()
	 * @generated
	 */
	EReference getObjectPartTemplate_FeaturePartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate <em>EClass Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EClass Document Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate
	 * @generated
	 */
	EClass getEClassDocumentPartTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate#getEclass <em>Eclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Eclass</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate#getEclass()
	 * @see #getEClassDocumentPartTemplate()
	 * @generated
	 */
	EReference getEClassDocumentPartTemplate_Eclass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EObjectDocumentPartTemplate <em>EObject Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EObject Document Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EObjectDocumentPartTemplate
	 * @generated
	 */
	EClass getEObjectDocumentPartTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EObjectDocumentPartTemplate#getEobject <em>Eobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Eobject</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EObjectDocumentPartTemplate#getEobject()
	 * @see #getEObjectDocumentPartTemplate()
	 * @generated
	 */
	EReference getEObjectDocumentPartTemplate_Eobject();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body#getObjectPartTemplate <em>Object Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Object Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body#getObjectPartTemplate()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_ObjectPartTemplate();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_TEMPLATE__TYPE = eINSTANCE.getDocumentTemplate_Type();

		/**
		 * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_TEMPLATE__ICON_PATH = eINSTANCE.getDocumentTemplate_IconPath();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate <em>Document Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPartTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getDocumentPartTemplate()
		 * @generated
		 */
		EClass DOCUMENT_PART_TEMPLATE = eINSTANCE.getDocumentPartTemplate();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_PART_TEMPLATE__GENERATE = eINSTANCE.getDocumentPartTemplate_Generate();

		/**
		 * The meta object literal for the '<em><b>Generate Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_PART_TEMPLATE__GENERATE_TITLE = eINSTANCE.getDocumentPartTemplate_GenerateTitle();

		/**
		 * The meta object literal for the '<em><b>Default Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE = eINSTANCE.getDocumentPartTemplate_DefaultTitle();

		/**
		 * The meta object literal for the '<em><b>Custom Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE = eINSTANCE.getDocumentPartTemplate_CustomTitle();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureDocumentPartTemplateImpl <em>EStructural Feature Document Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureDocumentPartTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEStructuralFeatureDocumentPartTemplate()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE = eINSTANCE.getEStructuralFeatureDocumentPartTemplate();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__FEATURE = eINSTANCE.getEStructuralFeatureDocumentPartTemplate_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.FeaturePartTemplate <em>Feature Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.FeaturePartTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getFeaturePartTemplate()
		 * @generated
		 */
		EClass FEATURE_PART_TEMPLATE = eINSTANCE.getFeaturePartTemplate();

		/**
		 * The meta object literal for the '<em><b>Object Part Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FEATURE_PART_TEMPLATE__OBJECT_PART_TEMPLATE = eINSTANCE.getFeaturePartTemplate_ObjectPartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ObjectPartTemplate <em>Object Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ObjectPartTemplate
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getObjectPartTemplate()
		 * @generated
		 */
		EClass OBJECT_PART_TEMPLATE = eINSTANCE.getObjectPartTemplate();

		/**
		 * The meta object literal for the '<em><b>Feature Part Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference OBJECT_PART_TEMPLATE__FEATURE_PART_TEMPLATE = eINSTANCE.getObjectPartTemplate_FeaturePartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl <em>EClass Document Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEClassDocumentPartTemplate()
		 * @generated
		 */
		EClass ECLASS_DOCUMENT_PART_TEMPLATE = eINSTANCE.getEClassDocumentPartTemplate();

		/**
		 * The meta object literal for the '<em><b>Eclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ECLASS_DOCUMENT_PART_TEMPLATE__ECLASS = eINSTANCE.getEClassDocumentPartTemplate_Eclass();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EObjectDocumentPartTemplateImpl <em>EObject Document Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EObjectDocumentPartTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEObjectDocumentPartTemplate()
		 * @generated
		 */
		EClass EOBJECT_DOCUMENT_PART_TEMPLATE = eINSTANCE.getEObjectDocumentPartTemplate();

		/**
		 * The meta object literal for the '<em><b>Eobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EOBJECT_DOCUMENT_PART_TEMPLATE__EOBJECT = eINSTANCE.getEObjectDocumentPartTemplate_Eobject();

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
		 * The meta object literal for the '<em><b>Object Part Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BODY__OBJECT_PART_TEMPLATE = eINSTANCE.getBody_ObjectPartTemplate();

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

	}

} // DocumentStructureTemplatePackage
