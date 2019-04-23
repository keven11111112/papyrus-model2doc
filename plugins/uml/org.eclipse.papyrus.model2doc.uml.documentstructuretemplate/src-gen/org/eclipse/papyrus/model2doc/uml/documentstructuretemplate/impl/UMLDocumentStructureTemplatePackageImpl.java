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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IStereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

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
	private EClass iStereotypePartTemplateEClass = null;

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

		// Create package meta-data objects
		theUMLDocumentStructureTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theUMLDocumentStructureTemplatePackage.initializePackageContents();

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
	public EAttribute getStereotypePartTemplate_StereotypeQualifiedName() {
		return (EAttribute) stereotypePartTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStereotypePartTemplate_StereotypeFilterRule() {
		return (EAttribute) stereotypePartTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIStereotypePartTemplate() {
		return iStereotypePartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getIStereotypePartTemplate__GetStereotypeQualifiedName() {
		return iStereotypePartTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getIStereotypePartTemplate__GetFirstMatchingStereotypeApplication__EObject() {
		return iStereotypePartTemplateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getIStereotypePartTemplate__GetStereotypeFilterRule() {
		return iStereotypePartTemplateEClass.getEOperations().get(2);
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
	public EAttribute getStereotypePropertyReferencePartTemplate_PropertyName() {
		return (EAttribute) stereotypePropertyReferencePartTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStereotypePropertyReferencePartTemplate_StereotypeQualifiedName() {
		return (EAttribute) stereotypePropertyReferencePartTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStereotypePropertyReferencePartTemplate_StereotypeFilterRule() {
		return (EAttribute) stereotypePropertyReferencePartTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getStereotypePropertyReferencePartTemplate__GetMatchingReferencedEObjects__EObject() {
		return stereotypePropertyReferencePartTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getStereotypePropertyReferencePartTemplate__BuildTitle() {
		return stereotypePropertyReferencePartTemplateEClass.getEOperations().get(1);
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
	public EOperation getCommentAsParagraph__BuildTitle() {
		return commentAsParagraphEClass.getEOperations().get(1);
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
		createEAttribute(stereotypePartTemplateEClass, STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME);
		createEAttribute(stereotypePartTemplateEClass, STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE);

		iStereotypePartTemplateEClass = createEClass(ISTEREOTYPE_PART_TEMPLATE);
		createEOperation(iStereotypePartTemplateEClass, ISTEREOTYPE_PART_TEMPLATE___GET_STEREOTYPE_QUALIFIED_NAME);
		createEOperation(iStereotypePartTemplateEClass, ISTEREOTYPE_PART_TEMPLATE___GET_FIRST_MATCHING_STEREOTYPE_APPLICATION__EOBJECT);
		createEOperation(iStereotypePartTemplateEClass, ISTEREOTYPE_PART_TEMPLATE___GET_STEREOTYPE_FILTER_RULE);

		stereotypePropertyReferencePartTemplateEClass = createEClass(STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE);
		createEAttribute(stereotypePropertyReferencePartTemplateEClass, STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__PROPERTY_NAME);
		createEAttribute(stereotypePropertyReferencePartTemplateEClass, STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME);
		createEAttribute(stereotypePropertyReferencePartTemplateEClass, STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE);
		createEOperation(stereotypePropertyReferencePartTemplateEClass, STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___GET_MATCHING_REFERENCED_EOBJECTS__EOBJECT);
		createEOperation(stereotypePropertyReferencePartTemplateEClass, STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE___BUILD_TITLE);

		commentAsParagraphEClass = createEClass(COMMENT_AS_PARAGRAPH);
		createEAttribute(commentAsParagraphEClass, COMMENT_AS_PARAGRAPH__COMMENT_CHOICE);
		createEOperation(commentAsParagraphEClass, COMMENT_AS_PARAGRAPH___GET_MATCHING_COMMENTS__EOBJECT);
		createEOperation(commentAsParagraphEClass, COMMENT_AS_PARAGRAPH___BUILD_TITLE);

		commentEClass = createEClass(COMMENT);

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
		stereotypePartTemplateEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getEClassPartTemplate());
		stereotypePartTemplateEClass.getESuperTypes().add(this.getIStereotypePartTemplate());
		stereotypePropertyReferencePartTemplateEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getIComposedBodyPartTemplate());
		stereotypePropertyReferencePartTemplateEClass.getESuperTypes().add(this.getIStereotypePartTemplate());
		commentAsParagraphEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getILeafBodyPartTemplate());
		commentAsParagraphEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getITemplatePartView());

		// Initialize classes, features, and operations; add parameters
		initEClass(stereotypePartTemplateEClass, StereotypePartTemplate.class, "StereotypePartTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStereotypePartTemplate_StereotypeQualifiedName(), ecorePackage.getEString(), "stereotypeQualifiedName", null, 1, 1, StereotypePartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStereotypePartTemplate_StereotypeFilterRule(), this.getStereotypeFilterBehavior(), "stereotypeFilterRule", null, 1, 1, StereotypePartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);

		initEClass(iStereotypePartTemplateEClass, IStereotypePartTemplate.class, "IStereotypePartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEOperation(getIStereotypePartTemplate__GetStereotypeQualifiedName(), ecorePackage.getEString(), "getStereotypeQualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getIStereotypePartTemplate__GetFirstMatchingStereotypeApplication__EObject(), theEcorePackage.getEObject(), "getFirstMatchingStereotypeApplication", 0, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getIStereotypePartTemplate__GetStereotypeFilterRule(), this.getStereotypeFilterBehavior(), "getStereotypeFilterRule", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(stereotypePropertyReferencePartTemplateEClass, StereotypePropertyReferencePartTemplate.class, "StereotypePropertyReferencePartTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStereotypePropertyReferencePartTemplate_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, StereotypePropertyReferencePartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, //$NON-NLS-1$
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStereotypePropertyReferencePartTemplate_StereotypeQualifiedName(), ecorePackage.getEString(), "stereotypeQualifiedName", null, 0, 1, StereotypePropertyReferencePartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStereotypePropertyReferencePartTemplate_StereotypeFilterRule(), this.getStereotypeFilterBehavior(), "stereotypeFilterRule", null, 0, 1, StereotypePropertyReferencePartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStereotypePropertyReferencePartTemplate__GetMatchingReferencedEObjects__EObject(), theEcorePackage.getEObject(), "getMatchingReferencedEObjects", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "eobject", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getStereotypePropertyReferencePartTemplate__BuildTitle(), ecorePackage.getEString(), "buildTitle", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(commentAsParagraphEClass, CommentAsParagraph.class, "CommentAsParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCommentAsParagraph_CommentChoice(), this.getCommentChoice(), "commentChoice", "FIRST_OWNED_COMMENT", 1, 1, CommentAsParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$ //$NON-NLS-2$
				!IS_ORDERED);

		op = initEOperation(getCommentAsParagraph__GetMatchingComments__EObject(), this.getComment(), "getMatchingComments", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCommentAsParagraph__BuildTitle(), ecorePackage.getEString(), "buildTitle", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(commentEClass, Comment.class, "Comment", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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

} // UMLDocumentStructureTemplatePackageImpl
