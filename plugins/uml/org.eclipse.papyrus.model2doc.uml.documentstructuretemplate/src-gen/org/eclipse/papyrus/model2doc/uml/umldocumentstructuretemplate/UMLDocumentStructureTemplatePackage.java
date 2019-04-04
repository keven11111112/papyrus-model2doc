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
package org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.UMLDocumentStructureTemplateFactory
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
	String eNAME = "umldocumentstructuretemplate"; //$NON-NLS-1$

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
	UMLDocumentStructureTemplatePackage eINSTANCE = org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePartTemplateImpl <em>Stereotype Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePartTemplate()
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
	 * The number of operations of the '<em>Stereotype Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PART_TEMPLATE_OPERATION_COUNT = DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePropertyPartTemplateImpl <em>Stereotype Property Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePropertyPartTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyPartTemplate()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY_PART_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART_TEMPLATE__GENERATE = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART_TEMPLATE__GENERATE_TITLE = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART_TEMPLATE__CUSTOM_TITLE = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Sub Body Part Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART_TEMPLATE__PROPERTY_NAME = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stereotype Property Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART_TEMPLATE_FEATURE_COUNT = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stereotype Property Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY_PART_TEMPLATE_OPERATION_COUNT = DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.CommentAsParagraphImpl <em>Comment As Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.CommentAsParagraphImpl
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentAsParagraph()
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
	 * The number of operations of the '<em>Comment As Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMMENT_AS_PARAGRAPH_OPERATION_COUNT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypeFilterBehavior <em>Stereotype Filter Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypeFilterBehavior
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypeFilterBehavior()
	 * @generated
	 */
	int STEREOTYPE_FILTER_BEHAVIOR = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentChoice <em>Comment Choice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentChoice
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentChoice()
	 * @generated
	 */
	int COMMENT_CHOICE = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePartTemplate <em>Stereotype Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePartTemplate
	 * @generated
	 */
	EClass getStereotypePartTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePartTemplate#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Stereotype Qualified Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePartTemplate#getStereotypeQualifiedName()
	 * @see #getStereotypePartTemplate()
	 * @generated
	 */
	EAttribute getStereotypePartTemplate_StereotypeQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePartTemplate#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Stereotype Filter Rule</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePartTemplate#getStereotypeFilterRule()
	 * @see #getStereotypePartTemplate()
	 * @generated
	 */
	EAttribute getStereotypePartTemplate_StereotypeFilterRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePropertyPartTemplate <em>Stereotype Property Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stereotype Property Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePropertyPartTemplate
	 * @generated
	 */
	EClass getStereotypePropertyPartTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePropertyPartTemplate#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePropertyPartTemplate#getPropertyName()
	 * @see #getStereotypePropertyPartTemplate()
	 * @generated
	 */
	EAttribute getStereotypePropertyPartTemplate_PropertyName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentAsParagraph <em>Comment As Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Comment As Paragraph</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentAsParagraph
	 * @generated
	 */
	EClass getCommentAsParagraph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentAsParagraph#getCommentChoice <em>Comment Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Comment Choice</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentAsParagraph#getCommentChoice()
	 * @see #getCommentAsParagraph()
	 * @generated
	 */
	EAttribute getCommentAsParagraph_CommentChoice();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypeFilterBehavior <em>Stereotype Filter Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Stereotype Filter Behavior</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypeFilterBehavior
	 * @generated
	 */
	EEnum getStereotypeFilterBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentChoice <em>Comment Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Comment Choice</em>'.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentChoice
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePartTemplateImpl <em>Stereotype Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePartTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePartTemplate()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePropertyPartTemplateImpl <em>Stereotype Property Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePropertyPartTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypePropertyPartTemplate()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY_PART_TEMPLATE = eINSTANCE.getStereotypePropertyPartTemplate();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STEREOTYPE_PROPERTY_PART_TEMPLATE__PROPERTY_NAME = eINSTANCE.getStereotypePropertyPartTemplate_PropertyName();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.CommentAsParagraphImpl <em>Comment As Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.CommentAsParagraphImpl
		 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentAsParagraph()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypeFilterBehavior <em>Stereotype Filter Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypeFilterBehavior
		 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getStereotypeFilterBehavior()
		 * @generated
		 */
		EEnum STEREOTYPE_FILTER_BEHAVIOR = eINSTANCE.getStereotypeFilterBehavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentChoice <em>Comment Choice</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentChoice
		 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplatePackageImpl#getCommentChoice()
		 * @generated
		 */
		EEnum COMMENT_CHOICE = eINSTANCE.getCommentChoice();

	}

} // UMLDocumentStructureTemplatePackage
