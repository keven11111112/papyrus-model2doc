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
	 * The feature id for the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Is Matching Filter Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT;

	/**
	 * The operation id for the '<em>Build Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE___BUILD_TITLE__EOBJECT = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE___BUILD_TITLE__EOBJECT;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl <em>Stereotype Property Reference Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyReferencePartTemplate()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__GENERATE_TITLE = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__CUSTOM_TITLE = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Sub Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__PROPERTY_NAME = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stereotype Property Reference Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE_FEATURE_COUNT = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Matching Referenced EObjects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_MATCHING_REFERENCED_EOBJECTS__EOBJECT = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___BUILD_TITLE = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stereotype Property Reference Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE_OPERATION_COUNT = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl <em>Comment As Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentAsParagraph()
	 * @generated
	 */
	int COMMENT_AS_PARAGRAPH = 2;

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
	 * The operation id for the '<em>Get Matching Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH___GET_MATCHING_COMMENTS__EOBJECT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH___BUILD_TITLE = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment As Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH_OPERATION_COUNT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.Comment <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.uml2.uml.Comment
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 3;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior <em>Stereotype Filter Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypeFilterBehavior()
	 * @generated
	 */
	int STEREOTYPE_FILTER_BEHAVIOR = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice <em>Comment Choice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentChoice()
	 * @generated
	 */
	int COMMENT_CHOICE = 5;


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
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Stereotype Qualified Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate#getStereotypeQualifiedName()
	 * @see #getStereotypePartTemplate()
	 * @generated
	 */
	EAttribute getStereotypePartTemplate_StereotypeQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Stereotype Filter Rule</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate#getStereotypeFilterRule()
	 * @see #getStereotypePartTemplate()
	 * @generated
	 */
	EAttribute getStereotypePartTemplate_StereotypeFilterRule();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate#getFirstMatchingStereotypeApplication(org.eclipse.emf.ecore.EObject) <em>Get First Matching Stereotype Application</em>}'
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get First Matching Stereotype Application</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate#getFirstMatchingStereotypeApplication(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStereotypePartTemplate__GetFirstMatchingStereotypeApplication__EObject();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getPropertyName()
	 * @see #getStereotypePropertyReferencePartTemplate()
	 * @generated
	 */
	EAttribute getStereotypePropertyReferencePartTemplate_PropertyName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getMatchingReferencedEObjects(org.eclipse.emf.ecore.EObject) <em>Get Matching Referenced EObjects</em>}'
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Matching Referenced EObjects</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getMatchingReferencedEObjects(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStereotypePropertyReferencePartTemplate__GetMatchingReferencedEObjects__EObject();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#buildTitle() <em>Build Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Build Title</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#buildTitle()
	 * @generated
	 */
	EOperation getStereotypePropertyReferencePartTemplate__BuildTitle();

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
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph#buildTitle() <em>Build Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Build Title</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph#buildTitle()
	 * @generated
	 */
	EOperation getCommentAsParagraph__BuildTitle();

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
		 * The meta object literal for the '<em><b>Stereotype Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME = eINSTANCE.getStereotypePartTemplate_StereotypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Stereotype Filter Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE = eINSTANCE.getStereotypePartTemplate_StereotypeFilterRule();

		/**
		 * The meta object literal for the '<em><b>Get First Matching Stereotype Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STEREOTYPE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT = eINSTANCE.getStereotypePartTemplate__GetFirstMatchingStereotypeApplication__EObject();

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
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__PROPERTY_NAME = eINSTANCE.getStereotypePropertyReferencePartTemplate_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Get Matching Referenced EObjects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_MATCHING_REFERENCED_EOBJECTS__EOBJECT = eINSTANCE.getStereotypePropertyReferencePartTemplate__GetMatchingReferencedEObjects__EObject();

		/**
		 * The meta object literal for the '<em><b>Build Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___BUILD_TITLE = eINSTANCE.getStereotypePropertyReferencePartTemplate__BuildTitle();

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
		 * The meta object literal for the '<em><b>Build Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation COMMENT_AS_PARAGRAPH___BUILD_TITLE = eINSTANCE.getCommentAsParagraph__BuildTitle();

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
