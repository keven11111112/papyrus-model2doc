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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;

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
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplateFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='UMLDocumentStructureTemplate'"
 * @generated
 */
public interface UMLDocumentStructureTemplatePackage extends EPackage {
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
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/uml/1.0.0/documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "umldocumentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	UMLDocumentStructureTemplatePackage eINSTANCE = org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartTemplateImpl <em>Stereotype Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePartTemplate()
	 * @generated
	 */
	int STEREOTYPE_PART_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__GENERATE = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__GENERATE_TITLE = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__CUSTOM_TITLE = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__BODY_PART_TEMPLATE = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE__BODY_PART_TEMPLATE;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__ECLASS = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE__ECLASS;

	/**
	 * The feature id for the '<em><b>Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__FILTER_RULE = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE__FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stereotype Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE_FEATURE_COUNT = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT;

	/**
	 * The operation id for the '<em>Is Matching Filter Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stereotype Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE_OPERATION_COUNT = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartImpl <em>Stereotype Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePart()
	 * @generated
	 */
	int STEREOTYPE_PART = 2;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART__STEREOTYPE_FILTER_RULE = 0;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART__STEREOTYPE_QUALIFIED_NAME = 1;

	/**
	 * The number of structural features of the '<em>Stereotype Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Stereotype Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePartImpl <em>Mandatory Stereotype Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePartImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getMandatoryStereotypePart()
	 * @generated
	 */
	int MANDATORY_STEREOTYPE_PART = 1;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PART__STEREOTYPE_FILTER_RULE = STEREOTYPE_PART__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PART__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_PART__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Mandatory Stereotype Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PART_FEATURE_COUNT = STEREOTYPE_PART_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The number of operations of the '<em>Mandatory Stereotype Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PART_OPERATION_COUNT = STEREOTYPE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle <em>IUML Body Part Template Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getIUMLBodyPartTemplateTitle()
	 * @generated
	 */
	int IUML_BODY_PART_TEMPLATE_TITLE = 3;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IUML_BODY_PART_TEMPLATE_TITLE__GENERATE = DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IUML_BODY_PART_TEMPLATE_TITLE__GENERATE_TITLE = DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IUML_BODY_PART_TEMPLATE_TITLE__CUSTOM_TITLE = DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The number of structural features of the '<em>IUML Body Part Template Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IUML_BODY_PART_TEMPLATE_TITLE_FEATURE_COUNT = DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IUML_BODY_PART_TEMPLATE_TITLE___BUILD_PART_TEMPLATE_TITLE__EOBJECT = DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT;

	/**
	 * The number of operations of the '<em>IUML Body Part Template Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IUML_BODY_PART_TEMPLATE_TITLE_OPERATION_COUNT = DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyPartImpl <em>Stereotype Property Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyPartImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyPart()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_PART = 5;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART__STEREOTYPE_FILTER_RULE = STEREOTYPE_PART__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_PART__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART__PROPERTY_NAME = STEREOTYPE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stereotype Property Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART_FEATURE_COUNT = STEREOTYPE_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = STEREOTYPE_PART_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stereotype Property Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART_OPERATION_COUNT = STEREOTYPE_PART_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl <em>Stereotype Property Reference Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReferencePartTemplate()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE = STEREOTYPE_PROPERTY_PART__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_PROPERTY_PART__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__PROPERTY_NAME = STEREOTYPE_PROPERTY_PART__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE_TITLE = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__CUSTOM_TITLE = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Stereotype Property Reference Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE_FEATURE_COUNT = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_PROPERTY_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = STEREOTYPE_PROPERTY_PART___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT = STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Stereotype Property Reference Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_STEREOTYPE_PROPERTY_REFERENCE_VALUES__EOBJECT = STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stereotype Property Reference Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE_OPERATION_COUNT = STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl <em>Comment As Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentAsParagraph()
	 * @generated
	 */
	int COMMENT_AS_PARAGRAPH = 6;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH__GENERATE = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH__GENERATE_TITLE = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH__CUSTOM_TITLE = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Comment Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH__COMMENT_CHOICE = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment As Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH_FEATURE_COUNT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH___BUILD_PART_TEMPLATE_TITLE__EOBJECT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT;

	/**
	 * The operation id for the '<em>Get Matching Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH___GET_MATCHING_COMMENTS__EOBJECT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comment As Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH_OPERATION_COUNT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.Comment <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.uml2.uml.Comment
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 7;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePropertyPartImpl <em>Mandatory Stereotype Property Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePropertyPartImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getMandatoryStereotypePropertyPart()
	 * @generated
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_PART = 9;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_PART__STEREOTYPE_FILTER_RULE = STEREOTYPE_PROPERTY_PART__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_PART__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_PROPERTY_PART__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_PART__PROPERTY_NAME = STEREOTYPE_PROPERTY_PART__PROPERTY_NAME;

	/**
	 * The number of structural features of the '<em>Mandatory Stereotype Property Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_PART_FEATURE_COUNT = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_PROPERTY_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_PART___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = STEREOTYPE_PROPERTY_PART___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The number of operations of the '<em>Mandatory Stereotype Property Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_PART_OPERATION_COUNT = STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyColumnImpl <em>Stereotype Property Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyColumnImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyColumn()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN__STEREOTYPE_FILTER_RULE = MANDATORY_STEREOTYPE_PROPERTY_PART__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN__STEREOTYPE_QUALIFIED_NAME = MANDATORY_STEREOTYPE_PROPERTY_PART__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN__PROPERTY_NAME = MANDATORY_STEREOTYPE_PROPERTY_PART__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Custom Column Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN__CUSTOM_COLUMN_TITLE = MANDATORY_STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stereotype Property Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN_FEATURE_COUNT = MANDATORY_STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = MANDATORY_STEREOTYPE_PROPERTY_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = MANDATORY_STEREOTYPE_PROPERTY_PART___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The operation id for the '<em>Build Column Header Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___BUILD_COLUMN_HEADER_LABEL = MANDATORY_STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cell Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___GET_CELL_VALUE__EOBJECT = MANDATORY_STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Build Cell Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___BUILD_CELL_LABEL__OBJECT = MANDATORY_STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stereotype Property Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN_OPERATION_COUNT = MANDATORY_STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl <em>Stereotype Property Reference Table View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReferenceTableView()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW = 10;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__STEREOTYPE_FILTER_RULE = STEREOTYPE_PROPERTY_PART__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_PROPERTY_PART__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__PROPERTY_NAME = STEREOTYPE_PROPERTY_PART__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_TITLE = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__CUSTOM_TITLE = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__COLUMNS = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generate Row Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generate Column Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Stereotype Property Reference Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW_FEATURE_COUNT = STEREOTYPE_PROPERTY_PART_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_PROPERTY_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = STEREOTYPE_PROPERTY_PART___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT = STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Rows</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GET_ROWS__EOBJECT = STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Build Row Header Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___BUILD_ROW_HEADER_LABEL__EOBJECT = STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stereotype Property Reference Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW_OPERATION_COUNT = STEREOTYPE_PROPERTY_PART_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior <em>Stereotype Filter Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypeFilterBehavior()
	 * @generated
	 */
	int STEREOTYPE_FILTER_BEHAVIOR = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice <em>Comment Choice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentChoice()
	 * @generated
	 */
	int COMMENT_CHOICE = 12;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate <em>Stereotype Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate
	 * @generated
	 */
	EClass getStereotypePartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypePart <em>Mandatory Stereotype Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Mandatory Stereotype Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypePart
	 * @generated
	 */
	EClass getMandatoryStereotypePart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePart <em>Stereotype Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePart
	 * @generated
	 */
	EClass getStereotypePart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePart#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Stereotype Filter Rule</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePart#getStereotypeFilterRule()
	 * @see #getStereotypePart()
	 * @generated
	 */
	EAttribute getStereotypePart_StereotypeFilterRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePart#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Stereotype Qualified Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePart#getStereotypeQualifiedName()
	 * @see #getStereotypePart()
	 * @generated
	 */
	EAttribute getStereotypePart_StereotypeQualifiedName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePart#getFirstMatchingStereotypeApplication(org.eclipse.emf.ecore.EObject) <em>Get First Matching Stereotype Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePart#getFirstMatchingStereotypeApplication(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStereotypePart__GetFirstMatchingStereotypeApplication__EObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle <em>IUML Body Part Template Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>IUML Body Part Template Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle
	 * @generated
	 */
	EClass getIUMLBodyPartTemplateTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate <em>Stereotype Property Reference Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property Reference Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate
	 * @generated
	 */
	EClass getStereotypePropertyReferencePartTemplate();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getStereotypePropertyReferenceValues(org.eclipse.emf.ecore.EObject) <em>Get Stereotype Property Reference
	 * Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Stereotype Property Reference Values</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getStereotypePropertyReferenceValues(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStereotypePropertyReferencePartTemplate__GetStereotypePropertyReferenceValues__EObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyPart <em>Stereotype Property Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyPart
	 * @generated
	 */
	EClass getStereotypePropertyPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyPart#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyPart#getPropertyName()
	 * @see #getStereotypePropertyPart()
	 * @generated
	 */
	EAttribute getStereotypePropertyPart_PropertyName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyPart#getStereotypePropertyValues(org.eclipse.emf.ecore.EObject) <em>Get Stereotype Property Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Stereotype Property Values</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyPart#getStereotypePropertyValues(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStereotypePropertyPart__GetStereotypePropertyValues__EObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph <em>Comment As Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Comment As Paragraph</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph
	 * @generated
	 */
	EClass getCommentAsParagraph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph#getCommentChoice <em>Comment Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Comment Choice</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph#getCommentChoice()
	 * @see #getCommentAsParagraph()
	 * @generated
	 */
	EAttribute getCommentAsParagraph_CommentChoice();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph#getMatchingComments(org.eclipse.emf.ecore.EObject) <em>Get Matching Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Matching Comments</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph#getMatchingComments(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getCommentAsParagraph__GetMatchingComments__EObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.eclipse.uml2.uml.Comment
	 * @model instanceClass="org.eclipse.uml2.uml.Comment"
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyColumn <em>Stereotype Property Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property Column</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyColumn
	 * @generated
	 */
	EClass getStereotypePropertyColumn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypePropertyPart <em>Mandatory Stereotype Property Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Mandatory Stereotype Property Part</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypePropertyPart
	 * @generated
	 */
	EClass getMandatoryStereotypePropertyPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceTableView <em>Stereotype Property Reference Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property Reference Table View</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceTableView
	 * @generated
	 */
	EClass getStereotypePropertyReferenceTableView();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior <em>Stereotype Filter Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Stereotype Filter Behavior</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior
	 * @generated
	 */
	EEnum getStereotypeFilterBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice <em>Comment Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Comment Choice</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice
	 * @generated
	 */
	EEnum getCommentChoice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMLDocumentStructureTemplateFactory getUMLDocumentStructureTemplateFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartTemplateImpl <em>Stereotype Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePartTemplate()
		 * @generated
		 */
		EClass STEREOTYPE_PART_TEMPLATE = eINSTANCE.getStereotypePartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePartImpl <em>Mandatory Stereotype Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePartImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getMandatoryStereotypePart()
		 * @generated
		 */
		EClass MANDATORY_STEREOTYPE_PART = eINSTANCE.getMandatoryStereotypePart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartImpl <em>Stereotype Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePart()
		 * @generated
		 */
		EClass STEREOTYPE_PART = eINSTANCE.getStereotypePart();

		/**
		 * The meta object literal for the '<em><b>Stereotype Filter Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STEREOTYPE_PART__STEREOTYPE_FILTER_RULE = eINSTANCE.getStereotypePart_StereotypeFilterRule();

		/**
		 * The meta object literal for the '<em><b>Stereotype Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STEREOTYPE_PART__STEREOTYPE_QUALIFIED_NAME = eINSTANCE.getStereotypePart_StereotypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Get First Matching Stereotype Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STEREOTYPE_PART___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = eINSTANCE.getStereotypePart__GetFirstMatchingStereotypeApplication__EObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle <em>IUML Body Part Template Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getIUMLBodyPartTemplateTitle()
		 * @generated
		 */
		EClass IUML_BODY_PART_TEMPLATE_TITLE = eINSTANCE.getIUMLBodyPartTemplateTitle();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl <em>Stereotype Property Reference Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReferencePartTemplate()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE = eINSTANCE.getStereotypePropertyReferencePartTemplate();

		/**
		 * The meta object literal for the '<em><b>Get Stereotype Property Reference Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_STEREOTYPE_PROPERTY_REFERENCE_VALUES__EOBJECT = eINSTANCE.getStereotypePropertyReferencePartTemplate__GetStereotypePropertyReferenceValues__EObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyPartImpl <em>Stereotype Property Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyPartImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyPart()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_PART = eINSTANCE.getStereotypePropertyPart();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STEREOTYPE_PROPERTY_PART__PROPERTY_NAME = eINSTANCE.getStereotypePropertyPart_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Get Stereotype Property Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STEREOTYPE_PROPERTY_PART___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = eINSTANCE.getStereotypePropertyPart__GetStereotypePropertyValues__EObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl <em>Comment As Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentAsParagraph()
		 * @generated
		 */
		EClass COMMENT_AS_PARAGRAPH = eINSTANCE.getCommentAsParagraph();

		/**
		 * The meta object literal for the '<em><b>Comment Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute COMMENT_AS_PARAGRAPH__COMMENT_CHOICE = eINSTANCE.getCommentAsParagraph_CommentChoice();

		/**
		 * The meta object literal for the '<em><b>Get Matching Comments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation COMMENT_AS_PARAGRAPH___GET_MATCHING_COMMENTS__EOBJECT = eINSTANCE.getCommentAsParagraph__GetMatchingComments__EObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.Comment <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.uml2.uml.Comment
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyColumnImpl <em>Stereotype Property Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyColumnImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyColumn()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_COLUMN = eINSTANCE.getStereotypePropertyColumn();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePropertyPartImpl <em>Mandatory Stereotype Property Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePropertyPartImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getMandatoryStereotypePropertyPart()
		 * @generated
		 */
		EClass MANDATORY_STEREOTYPE_PROPERTY_PART = eINSTANCE.getMandatoryStereotypePropertyPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl <em>Stereotype Property Reference Table View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReferenceTableView()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW = eINSTANCE.getStereotypePropertyReferenceTableView();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior <em>Stereotype Filter Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypeFilterBehavior()
		 * @generated
		 */
		EEnum STEREOTYPE_FILTER_BEHAVIOR = eINSTANCE.getStereotypeFilterBehavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice <em>Comment Choice</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentChoice()
		 * @generated
		 */
		EEnum COMMENT_CHOICE = eINSTANCE.getCommentChoice();

	}

} // UMLDocumentStructureTemplatePackage
