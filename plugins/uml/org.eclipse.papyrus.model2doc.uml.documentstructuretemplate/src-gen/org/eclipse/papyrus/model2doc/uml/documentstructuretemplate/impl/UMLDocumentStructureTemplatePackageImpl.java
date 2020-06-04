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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.infra.emf.expressions.ExpressionsPackage;
import org.eclipse.papyrus.model2doc.core.author.AuthorPackage;
import org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypePropertyTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeWithEClassTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeListItemTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttribute;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttributeAsParagraph;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttributeListItemTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyColumn;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyListItemTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReference;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceListItemTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceTableView;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.util.UMLDocumentStructureTemplateValidator;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UMLDocumentStructureTemplatePackageImpl extends EPackageImpl implements UMLDocumentStructureTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass mandatoryStereotypeWithEClassTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass mandatoryStereotypeTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypeTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iumlBodyPartTemplateTitleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePropertyReferencePartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePropertyTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass commentAsParagraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePropertyColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass mandatoryStereotypePropertyTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePropertyReferenceTableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePropertyReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypeListItemTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePropertyReferenceListItemTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePropertyListItemTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePropertyAttributeListItemTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePropertyAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stereotypePropertyAttributeAsParagraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum stereotypeFilterBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum commentChoiceEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UMLDocumentStructureTemplatePackageImpl() {
		super(eNS_URI, UMLDocumentStructureTemplateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link UMLDocumentStructureTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UMLDocumentStructureTemplatePackage init() {
		if (isInited) {
			return (UMLDocumentStructureTemplatePackage) EPackage.Registry.INSTANCE.getEPackage(UMLDocumentStructureTemplatePackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredUMLDocumentStructureTemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UMLDocumentStructureTemplatePackageImpl theUMLDocumentStructureTemplatePackage = registeredUMLDocumentStructureTemplatePackage instanceof UMLDocumentStructureTemplatePackageImpl
				? (UMLDocumentStructureTemplatePackageImpl) registeredUMLDocumentStructureTemplatePackage
				: new UMLDocumentStructureTemplatePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DocumentStructureTemplatePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		GeneratorConfigurationPackage.eINSTANCE.eClass();
		AuthorPackage.eINSTANCE.eClass();
		ExpressionsPackage.eINSTANCE.eClass();
		BuiltInTypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUMLDocumentStructureTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theUMLDocumentStructureTemplatePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theUMLDocumentStructureTemplatePackage,
				new EValidator.Descriptor() {
					@Override
					public EValidator getEValidator() {
						return UMLDocumentStructureTemplateValidator.INSTANCE;
					}
				});

		// Mark meta-data to indicate it can't be changed
		theUMLDocumentStructureTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UMLDocumentStructureTemplatePackage.eNS_URI, theUMLDocumentStructureTemplatePackage);
		return theUMLDocumentStructureTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePartTemplate() {
		return stereotypePartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getMandatoryStereotypeWithEClassTemplate() {
		return mandatoryStereotypeWithEClassTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getMandatoryStereotypeTemplate() {
		return mandatoryStereotypeTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypeTemplate() {
		return stereotypeTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStereotypeTemplate_StereotypeFilterRule() {
		return (EAttribute) stereotypeTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStereotypeTemplate_StereotypeQualifiedName() {
		return (EAttribute) stereotypeTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getStereotypeTemplate__GetFirstMatchingStereotypeApplication__EObject() {
		return stereotypeTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIUMLBodyPartTemplateTitle() {
		return iumlBodyPartTemplateTitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePropertyReferencePartTemplate() {
		return stereotypePropertyReferencePartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getStereotypePropertyReferencePartTemplate__GetStereotypePropertyReferenceValues__EObject() {
		return stereotypePropertyReferencePartTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePropertyTemplate() {
		return stereotypePropertyTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStereotypePropertyTemplate_PropertyName() {
		return (EAttribute) stereotypePropertyTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getStereotypePropertyTemplate__GetStereotypePropertyValues__EObject() {
		return stereotypePropertyTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getCommentAsParagraph() {
		return commentAsParagraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getCommentAsParagraph_CommentChoice() {
		return (EAttribute) commentAsParagraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getCommentAsParagraph__GetMatchingComments__EObject() {
		return commentAsParagraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePropertyColumn() {
		return stereotypePropertyColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getStereotypePropertyColumn__BuildCellLabel__Object_1() {
		return stereotypePropertyColumnEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getMandatoryStereotypePropertyTemplate() {
		return mandatoryStereotypePropertyTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePropertyReferenceTableView() {
		return stereotypePropertyReferenceTableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePropertyReference() {
		return stereotypePropertyReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypeListItemTemplate() {
		return stereotypeListItemTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePropertyReferenceListItemTemplate() {
		return stereotypePropertyReferenceListItemTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePropertyListItemTemplate() {
		return stereotypePropertyListItemTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePropertyAttributeListItemTemplate() {
		return stereotypePropertyAttributeListItemTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePropertyAttribute() {
		return stereotypePropertyAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStereotypePropertyAttributeAsParagraph() {
		return stereotypePropertyAttributeAsParagraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEnum getStereotypeFilterBehavior() {
		return stereotypeFilterBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEnum getCommentChoice() {
		return commentChoiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UMLDocumentStructureTemplateFactory getUMLDocumentStructureTemplateFactory() {
		return (UMLDocumentStructureTemplateFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		stereotypePartTemplateEClass = createEClass(STEREOTYPE_PART_TEMPLATE);

		mandatoryStereotypeWithEClassTemplateEClass = createEClass(MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE);

		mandatoryStereotypeTemplateEClass = createEClass(MANDATORY_STEREOTYPE_TEMPLATE);

		stereotypeTemplateEClass = createEClass(STEREOTYPE_TEMPLATE);
		createEAttribute(stereotypeTemplateEClass, STEREOTYPE_TEMPLATE__STEREOTYPE_FILTER_RULE);
		createEAttribute(stereotypeTemplateEClass, STEREOTYPE_TEMPLATE__STEREOTYPE_QUALIFIED_NAME);
		createEOperation(stereotypeTemplateEClass, STEREOTYPE_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT);

		iumlBodyPartTemplateTitleEClass = createEClass(IUML_BODY_PART_TEMPLATE_TITLE);

		stereotypePropertyReferencePartTemplateEClass = createEClass(STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE);
		createEOperation(stereotypePropertyReferencePartTemplateEClass, STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_STEREOTYPE_PROPERTY_REFERENCE_VALUES__EOBJECT);

		stereotypePropertyTemplateEClass = createEClass(STEREOTYPE_PROPERTY_TEMPLATE);
		createEAttribute(stereotypePropertyTemplateEClass, STEREOTYPE_PROPERTY_TEMPLATE__PROPERTY_NAME);
		createEOperation(stereotypePropertyTemplateEClass, STEREOTYPE_PROPERTY_TEMPLATE___GET_STEREOTYPE_PROPERTY_VALUES__EOBJECT);

		stereotypePropertyReferenceEClass = createEClass(STEREOTYPE_PROPERTY_REFERENCE);

		commentAsParagraphEClass = createEClass(COMMENT_AS_PARAGRAPH);
		createEAttribute(commentAsParagraphEClass, COMMENT_AS_PARAGRAPH__COMMENT_CHOICE);
		createEOperation(commentAsParagraphEClass, COMMENT_AS_PARAGRAPH___GET_MATCHING_COMMENTS__EOBJECT);

		commentEClass = createEClass(COMMENT);

		stereotypePropertyColumnEClass = createEClass(STEREOTYPE_PROPERTY_COLUMN);
		createEOperation(stereotypePropertyColumnEClass, STEREOTYPE_PROPERTY_COLUMN___BUILD_CELL_LABEL__OBJECT_1);

		mandatoryStereotypePropertyTemplateEClass = createEClass(MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE);

		stereotypePropertyReferenceTableViewEClass = createEClass(STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW);

		stereotypeListItemTemplateEClass = createEClass(STEREOTYPE_LIST_ITEM_TEMPLATE);

		stereotypePropertyReferenceListItemTemplateEClass = createEClass(STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM_TEMPLATE);

		stereotypePropertyListItemTemplateEClass = createEClass(STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE);

		stereotypePropertyAttributeListItemTemplateEClass = createEClass(STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM_TEMPLATE);

		stereotypePropertyAttributeEClass = createEClass(STEREOTYPE_PROPERTY_ATTRIBUTE);

		stereotypePropertyAttributeAsParagraphEClass = createEClass(STEREOTYPE_PROPERTY_ATTRIBUTE_AS_PARAGRAPH);

		// Create enums
		stereotypeFilterBehaviorEEnum = createEEnum(STEREOTYPE_FILTER_BEHAVIOR);
		commentChoiceEEnum = createEEnum(COMMENT_CHOICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DocumentStructureTemplatePackage theDocumentStructureTemplatePackage = (DocumentStructureTemplatePackage) EPackage.Registry.INSTANCE.getEPackage(DocumentStructureTemplatePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stereotypePartTemplateEClass.getESuperTypes().add(this.getMandatoryStereotypeWithEClassTemplate());
		stereotypePartTemplateEClass.getESuperTypes().add(this.getIUMLBodyPartTemplateTitle());
		stereotypePartTemplateEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getIComposedSubBodyPartTemplate());
		mandatoryStereotypeWithEClassTemplateEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getEClassTemplate());
		mandatoryStereotypeWithEClassTemplateEClass.getESuperTypes().add(this.getMandatoryStereotypeTemplate());
		mandatoryStereotypeTemplateEClass.getESuperTypes().add(this.getStereotypeTemplate());
		iumlBodyPartTemplateTitleEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getIBodySectionPartTemplate());
		stereotypePropertyReferencePartTemplateEClass.getESuperTypes().add(this.getStereotypePropertyTemplate());
		stereotypePropertyReferencePartTemplateEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getIComposedBodyPartTemplate());
		stereotypePropertyReferencePartTemplateEClass.getESuperTypes().add(this.getIUMLBodyPartTemplateTitle());
		stereotypePropertyReferencePartTemplateEClass.getESuperTypes().add(this.getStereotypePropertyReference());
		stereotypePropertyTemplateEClass.getESuperTypes().add(this.getStereotypeTemplate());
		commentAsParagraphEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getILeafBodyPartTemplate());
		commentAsParagraphEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getITemplatePartView());
		commentAsParagraphEClass.getESuperTypes().add(this.getIUMLBodyPartTemplateTitle());
		stereotypePropertyColumnEClass.getESuperTypes().add(this.getMandatoryStereotypePropertyTemplate());
		stereotypePropertyColumnEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getIColumn());
		mandatoryStereotypePropertyTemplateEClass.getESuperTypes().add(this.getStereotypePropertyTemplate());
		stereotypePropertyReferenceTableViewEClass.getESuperTypes().add(this.getStereotypePropertyTemplate());
		stereotypePropertyReferenceTableViewEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getITableView());
		stereotypePropertyReferenceTableViewEClass.getESuperTypes().add(this.getIUMLBodyPartTemplateTitle());
		stereotypePropertyReferenceTableViewEClass.getESuperTypes().add(this.getStereotypePropertyReference());
		stereotypeListItemTemplateEClass.getESuperTypes().add(this.getMandatoryStereotypeWithEClassTemplate());
		stereotypeListItemTemplateEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getIComposedSubListItemTemplate());
		stereotypePropertyReferenceListItemTemplateEClass.getESuperTypes().add(this.getStereotypePropertyListItemTemplate());
		stereotypePropertyReferenceListItemTemplateEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getIComposedListItemTemplate());
		stereotypePropertyReferenceListItemTemplateEClass.getESuperTypes().add(this.getStereotypePropertyReference());
		stereotypePropertyListItemTemplateEClass.getESuperTypes().add(this.getMandatoryStereotypePropertyTemplate());
		stereotypePropertyListItemTemplateEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getIListItemTemplate());
		stereotypePropertyAttributeListItemTemplateEClass.getESuperTypes().add(this.getStereotypePropertyListItemTemplate());
		stereotypePropertyAttributeListItemTemplateEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getILeafListItemTemplate());
		stereotypePropertyAttributeListItemTemplateEClass.getESuperTypes().add(this.getStereotypePropertyAttribute());
		stereotypePropertyAttributeAsParagraphEClass.getESuperTypes().add(this.getStereotypePropertyTemplate());
		stereotypePropertyAttributeAsParagraphEClass.getESuperTypes().add(this.getStereotypePropertyAttribute());
		stereotypePropertyAttributeAsParagraphEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getILeafBodyPartTemplate());
		stereotypePropertyAttributeAsParagraphEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getITemplatePartView());
		stereotypePropertyAttributeAsParagraphEClass.getESuperTypes().add(this.getIUMLBodyPartTemplateTitle());

		// Initialize classes, features, and operations; add parameters
		initEClass(stereotypePartTemplateEClass, StereotypePartTemplate.class, "StereotypePartTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(mandatoryStereotypeWithEClassTemplateEClass, MandatoryStereotypeWithEClassTemplate.class, "MandatoryStereotypeWithEClassTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(mandatoryStereotypeTemplateEClass, MandatoryStereotypeTemplate.class, "MandatoryStereotypeTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stereotypeTemplateEClass, StereotypeTemplate.class, "StereotypeTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStereotypeTemplate_StereotypeFilterRule(), this.getStereotypeFilterBehavior(), "stereotypeFilterRule", "STEREOTYPE_KIND_OF", 1, 1, StereotypeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, //$NON-NLS-1$ //$NON-NLS-2$
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStereotypeTemplate_StereotypeQualifiedName(), ecorePackage.getEString(), "stereotypeQualifiedName", null, 0, 1, StereotypeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		EOperation op = initEOperation(getStereotypeTemplate__GetFirstMatchingStereotypeApplication__EObject(), theEcorePackage.getEObject(), "getFirstMatchingStereotypeApplication", 0, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(iumlBodyPartTemplateTitleEClass, IUMLBodyPartTemplateTitle.class, "IUMLBodyPartTemplateTitle", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stereotypePropertyReferencePartTemplateEClass, StereotypePropertyReferencePartTemplate.class, "StereotypePropertyReferencePartTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = initEOperation(getStereotypePropertyReferencePartTemplate__GetStereotypePropertyReferenceValues__EObject(), theEcorePackage.getEObject(), "getStereotypePropertyReferenceValues", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "context", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(stereotypePropertyTemplateEClass, StereotypePropertyTemplate.class, "StereotypePropertyTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStereotypePropertyTemplate_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, StereotypePropertyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		op = initEOperation(getStereotypePropertyTemplate__GetStereotypePropertyValues__EObject(), theEcorePackage.getEJavaObject(), "getStereotypePropertyValues", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "eobject", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(stereotypePropertyReferenceEClass, StereotypePropertyReference.class, "StereotypePropertyReference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(commentAsParagraphEClass, CommentAsParagraph.class, "CommentAsParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCommentAsParagraph_CommentChoice(), this.getCommentChoice(), "commentChoice", "FIRST_OWNED_COMMENT", 1, 1, CommentAsParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$ //$NON-NLS-2$
				!IS_ORDERED);

		op = initEOperation(getCommentAsParagraph__GetMatchingComments__EObject(), this.getComment(), "getMatchingComments", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(commentEClass, Comment.class, "Comment", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stereotypePropertyColumnEClass, StereotypePropertyColumn.class, "StereotypePropertyColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = initEOperation(getStereotypePropertyColumn__BuildCellLabel__Object_1(), ecorePackage.getEString(), "buildCellLabel", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "cellElement", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(mandatoryStereotypePropertyTemplateEClass, MandatoryStereotypePropertyTemplate.class, "MandatoryStereotypePropertyTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stereotypePropertyReferenceTableViewEClass, StereotypePropertyReferenceTableView.class, "StereotypePropertyReferenceTableView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stereotypeListItemTemplateEClass, StereotypeListItemTemplate.class, "StereotypeListItemTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stereotypePropertyReferenceListItemTemplateEClass, StereotypePropertyReferenceListItemTemplate.class, "StereotypePropertyReferenceListItemTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stereotypePropertyListItemTemplateEClass, StereotypePropertyListItemTemplate.class, "StereotypePropertyListItemTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stereotypePropertyAttributeListItemTemplateEClass, StereotypePropertyAttributeListItemTemplate.class, "StereotypePropertyAttributeListItemTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stereotypePropertyAttributeEClass, StereotypePropertyAttribute.class, "StereotypePropertyAttribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stereotypePropertyAttributeAsParagraphEClass, StereotypePropertyAttributeAsParagraph.class, "StereotypePropertyAttributeAsParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(stereotypeFilterBehaviorEEnum, StereotypeFilterBehavior.class, "StereotypeFilterBehavior"); //$NON-NLS-1$
		addEEnumLiteral(stereotypeFilterBehaviorEEnum, StereotypeFilterBehavior.STEREOTYPE_TYPE_OF);
		addEEnumLiteral(stereotypeFilterBehaviorEEnum, StereotypeFilterBehavior.STEREOTYPE_KIND_OF);

		initEEnum(commentChoiceEEnum, CommentChoice.class, "CommentChoice"); //$NON-NLS-1$
		addEEnumLiteral(commentChoiceEEnum, CommentChoice.FIRST_OWNED_COMMENT);
		addEEnumLiteral(commentChoiceEEnum, CommentChoice.ALL_OWNED_COMMENTS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// redefines
		createRedefinesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$
		addAnnotation(this,
				source,
				new String[] {
						"originalName", "UMLDocumentStructureTemplate" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates"; //$NON-NLS-1$
		addAnnotation(mandatoryStereotypeWithEClassTemplateEClass,
				source,
				new String[] {
				});
		addAnnotation(mandatoryStereotypeTemplateEClass,
				source,
				new String[] {
				});
		addAnnotation(mandatoryStereotypeTemplateEClass,
				new boolean[] { true },
				"stereotypeQualifiedName", //$NON-NLS-1$
				new String[] {
						"lowerBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(iumlBodyPartTemplateTitleEClass,
				source,
				new String[] {
				});
		addAnnotation(stereotypePropertyColumnEClass,
				source,
				new String[] {
				});
		addAnnotation(mandatoryStereotypePropertyTemplateEClass,
				source,
				new String[] {
				});
		addAnnotation(mandatoryStereotypePropertyTemplateEClass,
				new boolean[] { true },
				"stereotypeQualifiedName", //$NON-NLS-1$
				new String[] {
						"lowerBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(stereotypePropertyReferenceTableViewEClass,
				source,
				new String[] {
				});
		addAnnotation(stereotypeListItemTemplateEClass,
				source,
				new String[] {
				});
		addAnnotation(stereotypePropertyListItemTemplateEClass,
				source,
				new String[] {
				});
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines"; //$NON-NLS-1$
		addAnnotation(getStereotypePropertyColumn__BuildCellLabel__Object_1(),
				source,
				new String[] {
				},
				new URI[] {
						URI.createURI(DocumentStructureTemplatePackage.eNS_URI).appendFragment("//IColumn/buildCellLabel") //$NON-NLS-1$
				});
	}

} // UMLDocumentStructureTemplatePackageImpl
