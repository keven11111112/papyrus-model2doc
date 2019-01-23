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
package org.eclipse.papyrus.model2doc.documentparttemplate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplateFactory;
import org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplatePackage;
import org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate;

import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage;

import org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl;

import org.eclipse.papyrus.model2doc.modelvisitor.ModelVisitorPackage;

import org.eclipse.papyrus.model2doc.modelvisitor.impl.ModelVisitorPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DocumentPartTemplatePackageImpl extends EPackageImpl implements DocumentPartTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass documentPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eClassDocumentPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eStructuralFeatureDocumentPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eObjectDocumentPartTemplateEClass = null;

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
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocumentPartTemplatePackageImpl() {
		super(eNS_URI, DocumentPartTemplateFactory.eINSTANCE);
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
	 * This method is used to initialize {@link DocumentPartTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocumentPartTemplatePackage init() {
		if (isInited) {
			return (DocumentPartTemplatePackage) EPackage.Registry.INSTANCE.getEPackage(DocumentPartTemplatePackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredDocumentPartTemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DocumentPartTemplatePackageImpl theDocumentPartTemplatePackage = registeredDocumentPartTemplatePackage instanceof DocumentPartTemplatePackageImpl ? (DocumentPartTemplatePackageImpl) registeredDocumentPartTemplatePackage
				: new DocumentPartTemplatePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DocumentStructureTemplatePackage.eNS_URI);
		DocumentStructureTemplatePackageImpl theDocumentStructureTemplatePackage = (DocumentStructureTemplatePackageImpl) (registeredPackage instanceof DocumentStructureTemplatePackageImpl ? registeredPackage : DocumentStructureTemplatePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelVisitorPackage.eNS_URI);
		ModelVisitorPackageImpl theModelVisitorPackage = (ModelVisitorPackageImpl) (registeredPackage instanceof ModelVisitorPackageImpl ? registeredPackage : ModelVisitorPackage.eINSTANCE);

		// Create package meta-data objects
		theDocumentPartTemplatePackage.createPackageContents();
		theDocumentStructureTemplatePackage.createPackageContents();
		theModelVisitorPackage.createPackageContents();

		// Initialize created meta-data
		theDocumentPartTemplatePackage.initializePackageContents();
		theDocumentStructureTemplatePackage.initializePackageContents();
		theModelVisitorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocumentPartTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocumentPartTemplatePackage.eNS_URI, theDocumentPartTemplatePackage);
		return theDocumentPartTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDocumentPartTemplate() {
		return documentPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDocumentPartTemplate_Generate() {
		return (EAttribute) documentPartTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDocumentPartTemplate_GenerateTitle() {
		return (EAttribute) documentPartTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDocumentPartTemplate_DefaultTitle() {
		return (EAttribute) documentPartTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDocumentPartTemplate_CustomTitle() {
		return (EAttribute) documentPartTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEClassDocumentPartTemplate() {
		return eClassDocumentPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEStructuralFeatureDocumentPartTemplate() {
		return eStructuralFeatureDocumentPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEObjectDocumentPartTemplate() {
		return eObjectDocumentPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DocumentPartTemplateFactory getDocumentPartTemplateFactory() {
		return (DocumentPartTemplateFactory) getEFactoryInstance();
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
		documentPartTemplateEClass = createEClass(DOCUMENT_PART_TEMPLATE);
		createEAttribute(documentPartTemplateEClass, DOCUMENT_PART_TEMPLATE__GENERATE);
		createEAttribute(documentPartTemplateEClass, DOCUMENT_PART_TEMPLATE__GENERATE_TITLE);
		createEAttribute(documentPartTemplateEClass, DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE);
		createEAttribute(documentPartTemplateEClass, DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE);

		eClassDocumentPartTemplateEClass = createEClass(ECLASS_DOCUMENT_PART_TEMPLATE);

		eStructuralFeatureDocumentPartTemplateEClass = createEClass(ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE);

		eObjectDocumentPartTemplateEClass = createEClass(EOBJECT_DOCUMENT_PART_TEMPLATE);
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
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eClassDocumentPartTemplateEClass.getESuperTypes().add(this.getDocumentPartTemplate());
		eStructuralFeatureDocumentPartTemplateEClass.getESuperTypes().add(this.getDocumentPartTemplate());
		eObjectDocumentPartTemplateEClass.getESuperTypes().add(this.getDocumentPartTemplate());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentPartTemplateEClass, DocumentPartTemplate.class, "DocumentPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDocumentPartTemplate_Generate(), ecorePackage.getEBoolean(), "generate", null, 1, 1, DocumentPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocumentPartTemplate_GenerateTitle(), theEcorePackage.getEBoolean(), "generateTitle", null, 1, 1, DocumentPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocumentPartTemplate_DefaultTitle(), theEcorePackage.getEString(), "defaultTitle", null, 1, 1, DocumentPartTemplate.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocumentPartTemplate_CustomTitle(), theEcorePackage.getEString(), "customTitle", null, 0, 1, DocumentPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eClassDocumentPartTemplateEClass, EClassDocumentPartTemplate.class, "EClassDocumentPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eStructuralFeatureDocumentPartTemplateEClass, EStructuralFeatureDocumentPartTemplate.class, "EStructuralFeatureDocumentPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eObjectDocumentPartTemplateEClass, EObjectDocumentPartTemplate.class, "EObjectDocumentPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
						"originalName", "DocumentPartTemplate" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // DocumentPartTemplatePackageImpl
