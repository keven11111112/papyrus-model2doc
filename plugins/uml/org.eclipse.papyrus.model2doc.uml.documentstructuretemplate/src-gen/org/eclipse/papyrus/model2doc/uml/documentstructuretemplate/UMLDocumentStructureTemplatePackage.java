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
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypeWithEClassTemplateImpl <em>Mandatory Stereotype With EClass Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypeWithEClassTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getMandatoryStereotypeWithEClassTemplate()
	 * @generated
	 */
	int MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__ECLASS = DocumentStructureTemplatePackage.ECLASS_TEMPLATE__ECLASS;

	/**
	 * The feature id for the '<em><b>Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__FILTER_RULE = DocumentStructureTemplatePackage.ECLASS_TEMPLATE__FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__STEREOTYPE_FILTER_RULE = DocumentStructureTemplatePackage.ECLASS_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = DocumentStructureTemplatePackage.ECLASS_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mandatory Stereotype With EClass Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT = DocumentStructureTemplatePackage.ECLASS_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Matching Filter Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT = DocumentStructureTemplatePackage.ECLASS_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = DocumentStructureTemplatePackage.ECLASS_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mandatory Stereotype With EClass Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_OPERATION_COUNT = DocumentStructureTemplatePackage.ECLASS_TEMPLATE_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__ECLASS = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__ECLASS;

	/**
	 * The feature id for the '<em><b>Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__FILTER_RULE = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__GENERATE = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__GENERATE_TITLE = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__CUSTOM_TITLE = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generate Branch Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__GENERATE_BRANCH_CONDITION = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__BODY_PART_TEMPLATE = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Stereotype Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE_FEATURE_COUNT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Matching Filter Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Branch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE___GENERATE_BRANCH__EOBJECT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stereotype Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE_OPERATION_COUNT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeTemplateImpl <em>Stereotype Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypeTemplate()
	 * @generated
	 */
	int STEREOTYPE_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_TEMPLATE__STEREOTYPE_FILTER_RULE = 0;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = 1;

	/**
	 * The number of structural features of the '<em>Stereotype Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Stereotype Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_TEMPLATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypeTemplateImpl <em>Mandatory Stereotype Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypeTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getMandatoryStereotypeTemplate()
	 * @generated
	 */
	int MANDATORY_STEREOTYPE_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_TEMPLATE__STEREOTYPE_FILTER_RULE = STEREOTYPE_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Mandatory Stereotype Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_TEMPLATE_FEATURE_COUNT = STEREOTYPE_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The number of operations of the '<em>Mandatory Stereotype Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_TEMPLATE_OPERATION_COUNT = STEREOTYPE_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle <em>IUML Body Part Template Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getIUMLBodyPartTemplateTitle()
	 * @generated
	 */
	int IUML_BODY_PART_TEMPLATE_TITLE = 4;

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
	 * The feature id for the '<em><b>Generate Branch Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IUML_BODY_PART_TEMPLATE_TITLE__GENERATE_BRANCH_CONDITION = DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_BRANCH_CONDITION;

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
	 * The operation id for the '<em>Generate Branch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IUML_BODY_PART_TEMPLATE_TITLE___GENERATE_BRANCH__EOBJECT = DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE___GENERATE_BRANCH__EOBJECT;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyTemplateImpl <em>Stereotype Property Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyTemplate()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_TEMPLATE = 6;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_FILTER_RULE = STEREOTYPE_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_TEMPLATE__PROPERTY_NAME = STEREOTYPE_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stereotype Property Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT = STEREOTYPE_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = STEREOTYPE_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stereotype Property Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT = STEREOTYPE_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl <em>Stereotype Property Reference Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReferencePartTemplate()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE = 5;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE = STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__PROPERTY_NAME = STEREOTYPE_PROPERTY_TEMPLATE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE_TITLE = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__CUSTOM_TITLE = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generate Branch Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE_BRANCH_CONDITION = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Stereotype Property Reference Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE_FEATURE_COUNT = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Branch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GENERATE_BRANCH__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Stereotype Property Reference Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_STEREOTYPE_PROPERTY_REFERENCE_VALUES__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stereotype Property Reference Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE_OPERATION_COUNT = STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl <em>Comment As Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentAsParagraph()
	 * @generated
	 */
	int COMMENT_AS_PARAGRAPH = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.Comment <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.uml2.uml.Comment
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePropertyTemplateImpl <em>Mandatory Stereotype Property Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePropertyTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getMandatoryStereotypePropertyTemplate()
	 * @generated
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyColumnImpl <em>Stereotype Property Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyColumnImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyColumn()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_COLUMN = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl <em>Stereotype Property Reference Table View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReferenceTableView()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReference <em>Stereotype Property Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReference
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReference()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_REFERENCE = 7;

	/**
	 * The number of structural features of the '<em>Stereotype Property Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stereotype Property Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Generate Branch Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH__GENERATE_BRANCH_CONDITION = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE__GENERATE_BRANCH_CONDITION;

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
	 * The operation id for the '<em>Generate Branch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH___GENERATE_BRANCH__EOBJECT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE___GENERATE_BRANCH__EOBJECT;

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
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_FILTER_RULE = STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE__PROPERTY_NAME = STEREOTYPE_PROPERTY_TEMPLATE__PROPERTY_NAME;

	/**
	 * The number of structural features of the '<em>Mandatory Stereotype Property Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The number of operations of the '<em>Mandatory Stereotype Property Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT = STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN__STEREOTYPE_FILTER_RULE = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN__STEREOTYPE_QUALIFIED_NAME = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN__PROPERTY_NAME = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Custom Column Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN__CUSTOM_COLUMN_TITLE = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stereotype Property Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN_FEATURE_COUNT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The operation id for the '<em>Build Column Header Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___BUILD_COLUMN_HEADER_LABEL = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cell Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___GET_CELL_VALUE__EOBJECT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Build Cell Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___BUILD_CELL_LABEL__OBJECT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Build Cell Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN___BUILD_CELL_LABEL__OBJECT_1 = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Stereotype Property Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_COLUMN_OPERATION_COUNT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__STEREOTYPE_FILTER_RULE = STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__PROPERTY_NAME = STEREOTYPE_PROPERTY_TEMPLATE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_TITLE = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__CUSTOM_TITLE = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generate Branch Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__COLUMNS = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generate Row Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generate Column Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Stereotype Property Reference Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW_FEATURE_COUNT = STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Branch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GENERATE_BRANCH__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Rows</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GET_ROWS__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Build Row Header Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___BUILD_ROW_HEADER_LABEL__EOBJECT = STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Stereotype Property Reference Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW_OPERATION_COUNT = STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeListItemTemplateImpl <em>Stereotype List Item Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeListItemTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypeListItemTemplate()
	 * @generated
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE = 13;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE__ECLASS = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__ECLASS;

	/**
	 * The feature id for the '<em><b>Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE__FILTER_RULE = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE__STEREOTYPE_FILTER_RULE = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Generate Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE__GENERATE_ITEM = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Item Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Item Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stereotype List Item Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE_FEATURE_COUNT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Matching Filter Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Build Item Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE___BUILD_ITEM_LABEL__OBJECT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE___GET_ITEMS__EOBJECT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stereotype List Item Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_LIST_ITEM_TEMPLATE_OPERATION_COUNT = MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyListItemTemplateImpl <em>Stereotype Property List Item Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyListItemTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyListItemTemplate()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE = 15;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__STEREOTYPE_FILTER_RULE = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__PROPERTY_NAME = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Generate Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__GENERATE_ITEM = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Item Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stereotype Property List Item Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE_FEATURE_COUNT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The operation id for the '<em>Build Item Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___BUILD_ITEM_LABEL__OBJECT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___GET_ITEMS__EOBJECT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stereotype Property List Item Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE_OPERATION_COUNT = MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceListItemImpl <em>Stereotype Property Reference List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceListItemImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReferenceListItem()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM__STEREOTYPE_FILTER_RULE = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM__PROPERTY_NAME = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Generate Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM__GENERATE_ITEM = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__GENERATE_ITEM;

	/**
	 * The feature id for the '<em><b>Custom Item Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM__CUSTOM_ITEM_LABEL = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL;

	/**
	 * The feature id for the '<em><b>Sub List Item Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM__SUB_LIST_ITEM_TEMPLATE = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stereotype Property Reference List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM_FEATURE_COUNT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The operation id for the '<em>Build Item Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM___BUILD_ITEM_LABEL__OBJECT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___BUILD_ITEM_LABEL__OBJECT;

	/**
	 * The operation id for the '<em>Get Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM___GET_ITEMS__EOBJECT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___GET_ITEMS__EOBJECT;

	/**
	 * The number of operations of the '<em>Stereotype Property Reference List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM_OPERATION_COUNT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyAttributeListItemImpl <em>Stereotype Property Attribute List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyAttributeListItemImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyAttributeListItem()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM = 16;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM__STEREOTYPE_FILTER_RULE = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__STEREOTYPE_FILTER_RULE;

	/**
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM__STEREOTYPE_QUALIFIED_NAME = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__STEREOTYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM__PROPERTY_NAME = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Generate Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM__GENERATE_ITEM = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__GENERATE_ITEM;

	/**
	 * The feature id for the '<em><b>Custom Item Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM__CUSTOM_ITEM_LABEL = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL;

	/**
	 * The number of structural features of the '<em>Stereotype Property Attribute List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM_FEATURE_COUNT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT;

	/**
	 * The operation id for the '<em>Get Stereotype Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT;

	/**
	 * The operation id for the '<em>Build Item Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM___BUILD_ITEM_LABEL__OBJECT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___BUILD_ITEM_LABEL__OBJECT;

	/**
	 * The operation id for the '<em>Get Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM___GET_ITEMS__EOBJECT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE___GET_ITEMS__EOBJECT;

	/**
	 * The number of operations of the '<em>Stereotype Property Attribute List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM_OPERATION_COUNT = STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttribute <em>Stereotype Property Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttribute
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyAttribute()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE = 17;

	/**
	 * The number of structural features of the '<em>Stereotype Property Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stereotype Property Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior <em>Stereotype Filter Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypeFilterBehavior()
	 * @generated
	 */
	int STEREOTYPE_FILTER_BEHAVIOR = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice <em>Comment Choice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentChoice()
	 * @generated
	 */
	int COMMENT_CHOICE = 19;


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
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeWithEClassTemplate <em>Mandatory Stereotype With EClass Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Mandatory Stereotype With EClass Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeWithEClassTemplate
	 * @generated
	 */
	EClass getMandatoryStereotypeWithEClassTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeTemplate <em>Mandatory Stereotype Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Mandatory Stereotype Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeTemplate
	 * @generated
	 */
	EClass getMandatoryStereotypeTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate <em>Stereotype Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate
	 * @generated
	 */
	EClass getStereotypeTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Stereotype Filter Rule</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate#getStereotypeFilterRule()
	 * @see #getStereotypeTemplate()
	 * @generated
	 */
	EAttribute getStereotypeTemplate_StereotypeFilterRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Stereotype Qualified Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate#getStereotypeQualifiedName()
	 * @see #getStereotypeTemplate()
	 * @generated
	 */
	EAttribute getStereotypeTemplate_StereotypeQualifiedName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate#getFirstMatchingStereotypeApplication(org.eclipse.emf.ecore.EObject) <em>Get First Matching Stereotype Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate#getFirstMatchingStereotypeApplication(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStereotypeTemplate__GetFirstMatchingStereotypeApplication__EObject();

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
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate <em>Stereotype Property Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate
	 * @generated
	 */
	EClass getStereotypePropertyTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate#getPropertyName()
	 * @see #getStereotypePropertyTemplate()
	 * @generated
	 */
	EAttribute getStereotypePropertyTemplate_PropertyName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate#getStereotypePropertyValues(org.eclipse.emf.ecore.EObject) <em>Get Stereotype Property Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Stereotype Property Values</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate#getStereotypePropertyValues(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStereotypePropertyTemplate__GetStereotypePropertyValues__EObject();

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
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyColumn#buildCellLabel(java.lang.Object) <em>Build Cell Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Build Cell Label</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyColumn#buildCellLabel(java.lang.Object)
	 * @generated
	 */
	EOperation getStereotypePropertyColumn__BuildCellLabel__Object_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypePropertyTemplate <em>Mandatory Stereotype Property Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Mandatory Stereotype Property Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypePropertyTemplate
	 * @generated
	 */
	EClass getMandatoryStereotypePropertyTemplate();

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
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReference <em>Stereotype Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property Reference</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReference
	 * @generated
	 */
	EClass getStereotypePropertyReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeListItemTemplate <em>Stereotype List Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype List Item Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeListItemTemplate
	 * @generated
	 */
	EClass getStereotypeListItemTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceListItem <em>Stereotype Property Reference List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property Reference List Item</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceListItem
	 * @generated
	 */
	EClass getStereotypePropertyReferenceListItem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyListItemTemplate <em>Stereotype Property List Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property List Item Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyListItemTemplate
	 * @generated
	 */
	EClass getStereotypePropertyListItemTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttributeListItem <em>Stereotype Property Attribute List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property Attribute List Item</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttributeListItem
	 * @generated
	 */
	EClass getStereotypePropertyAttributeListItem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttribute <em>Stereotype Property Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property Attribute</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttribute
	 * @generated
	 */
	EClass getStereotypePropertyAttribute();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypeWithEClassTemplateImpl <em>Mandatory Stereotype With EClass Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypeWithEClassTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getMandatoryStereotypeWithEClassTemplate()
		 * @generated
		 */
		EClass MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE = eINSTANCE.getMandatoryStereotypeWithEClassTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypeTemplateImpl <em>Mandatory Stereotype Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypeTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getMandatoryStereotypeTemplate()
		 * @generated
		 */
		EClass MANDATORY_STEREOTYPE_TEMPLATE = eINSTANCE.getMandatoryStereotypeTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeTemplateImpl <em>Stereotype Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypeTemplate()
		 * @generated
		 */
		EClass STEREOTYPE_TEMPLATE = eINSTANCE.getStereotypeTemplate();

		/**
		 * The meta object literal for the '<em><b>Stereotype Filter Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STEREOTYPE_TEMPLATE__STEREOTYPE_FILTER_RULE = eINSTANCE.getStereotypeTemplate_StereotypeFilterRule();

		/**
		 * The meta object literal for the '<em><b>Stereotype Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STEREOTYPE_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = eINSTANCE.getStereotypeTemplate_StereotypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Get First Matching Stereotype Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STEREOTYPE_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = eINSTANCE.getStereotypeTemplate__GetFirstMatchingStereotypeApplication__EObject();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyTemplateImpl <em>Stereotype Property Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyTemplate()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_TEMPLATE = eINSTANCE.getStereotypePropertyTemplate();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STEREOTYPE_PROPERTY_TEMPLATE__PROPERTY_NAME = eINSTANCE.getStereotypePropertyTemplate_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Get Stereotype Property Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STEREOTYPE_PROPERTY_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT = eINSTANCE.getStereotypePropertyTemplate__GetStereotypePropertyValues__EObject();

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
		 * The meta object literal for the '<em><b>Build Cell Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STEREOTYPE_PROPERTY_COLUMN___BUILD_CELL_LABEL__OBJECT_1 = eINSTANCE.getStereotypePropertyColumn__BuildCellLabel__Object_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePropertyTemplateImpl <em>Mandatory Stereotype Property Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.MandatoryStereotypePropertyTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getMandatoryStereotypePropertyTemplate()
		 * @generated
		 */
		EClass MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE = eINSTANCE.getMandatoryStereotypePropertyTemplate();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReference <em>Stereotype Property Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReference
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReference()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_REFERENCE = eINSTANCE.getStereotypePropertyReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeListItemTemplateImpl <em>Stereotype List Item Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeListItemTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypeListItemTemplate()
		 * @generated
		 */
		EClass STEREOTYPE_LIST_ITEM_TEMPLATE = eINSTANCE.getStereotypeListItemTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceListItemImpl <em>Stereotype Property Reference List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceListItemImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReferenceListItem()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM = eINSTANCE.getStereotypePropertyReferenceListItem();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyListItemTemplateImpl <em>Stereotype Property List Item Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyListItemTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyListItemTemplate()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE = eINSTANCE.getStereotypePropertyListItemTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyAttributeListItemImpl <em>Stereotype Property Attribute List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyAttributeListItemImpl
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyAttributeListItem()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM = eINSTANCE.getStereotypePropertyAttributeListItem();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttribute <em>Stereotype Property Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttribute
		 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyAttribute()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_ATTRIBUTE = eINSTANCE.getStereotypePropertyAttribute();

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
