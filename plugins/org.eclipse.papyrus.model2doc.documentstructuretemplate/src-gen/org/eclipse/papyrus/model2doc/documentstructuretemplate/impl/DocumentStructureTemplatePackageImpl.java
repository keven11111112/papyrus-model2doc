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
package org.eclipse.papyrus.model2doc.documentstructuretemplate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.EClassDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.EObjectDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.FeaturePartTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.ObjectPartTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.TextDocumentTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DocumentStructureTemplatePackageImpl extends EPackageImpl implements DocumentStructureTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass documentTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass textDocumentTemplateEClass = null;

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
	private EClass eStructuralFeatureDocumentPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass featurePartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass objectPartTemplateEClass = null;

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
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocumentStructureTemplatePackageImpl() {
		super(eNS_URI, DocumentStructureTemplateFactory.eINSTANCE);
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
	 * This method is used to initialize {@link DocumentStructureTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocumentStructureTemplatePackage init() {
		if (isInited) {
			return (DocumentStructureTemplatePackage) EPackage.Registry.INSTANCE.getEPackage(DocumentStructureTemplatePackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredDocumentStructureTemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DocumentStructureTemplatePackageImpl theDocumentStructureTemplatePackage = registeredDocumentStructureTemplatePackage instanceof DocumentStructureTemplatePackageImpl ? (DocumentStructureTemplatePackageImpl) registeredDocumentStructureTemplatePackage
				: new DocumentStructureTemplatePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDocumentStructureTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theDocumentStructureTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocumentStructureTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocumentStructureTemplatePackage.eNS_URI, theDocumentStructureTemplatePackage);
		return theDocumentStructureTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDocumentTemplate() {
		return documentTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getTextDocumentTemplate() {
		return textDocumentTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getTextDocumentTemplate_DocumentPartTemplate() {
		return (EReference) textDocumentTemplateEClass.getEStructuralFeatures().get(0);
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
	public EReference getEStructuralFeatureDocumentPartTemplate_Feature() {
		return (EReference) eStructuralFeatureDocumentPartTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFeaturePartTemplate() {
		return featurePartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFeaturePartTemplate_ObjectPartTemplate() {
		return (EReference) featurePartTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getObjectPartTemplate() {
		return objectPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getObjectPartTemplate_FeaturePartTemplate() {
		return (EReference) objectPartTemplateEClass.getEStructuralFeatures().get(0);
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
	public EReference getEClassDocumentPartTemplate_Eclass() {
		return (EReference) eClassDocumentPartTemplateEClass.getEStructuralFeatures().get(0);
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
	public EReference getEObjectDocumentPartTemplate_Eobject() {
		return (EReference) eObjectDocumentPartTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DocumentStructureTemplateFactory getDocumentStructureTemplateFactory() {
		return (DocumentStructureTemplateFactory) getEFactoryInstance();
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
		documentTemplateEClass = createEClass(DOCUMENT_TEMPLATE);

		textDocumentTemplateEClass = createEClass(TEXT_DOCUMENT_TEMPLATE);
		createEReference(textDocumentTemplateEClass, TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART_TEMPLATE);

		documentPartTemplateEClass = createEClass(DOCUMENT_PART_TEMPLATE);
		createEAttribute(documentPartTemplateEClass, DOCUMENT_PART_TEMPLATE__GENERATE);
		createEAttribute(documentPartTemplateEClass, DOCUMENT_PART_TEMPLATE__GENERATE_TITLE);
		createEAttribute(documentPartTemplateEClass, DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE);
		createEAttribute(documentPartTemplateEClass, DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE);

		eStructuralFeatureDocumentPartTemplateEClass = createEClass(ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE);
		createEReference(eStructuralFeatureDocumentPartTemplateEClass, ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__FEATURE);

		featurePartTemplateEClass = createEClass(FEATURE_PART_TEMPLATE);
		createEReference(featurePartTemplateEClass, FEATURE_PART_TEMPLATE__OBJECT_PART_TEMPLATE);

		objectPartTemplateEClass = createEClass(OBJECT_PART_TEMPLATE);
		createEReference(objectPartTemplateEClass, OBJECT_PART_TEMPLATE__FEATURE_PART_TEMPLATE);

		eClassDocumentPartTemplateEClass = createEClass(ECLASS_DOCUMENT_PART_TEMPLATE);
		createEReference(eClassDocumentPartTemplateEClass, ECLASS_DOCUMENT_PART_TEMPLATE__ECLASS);

		eObjectDocumentPartTemplateEClass = createEClass(EOBJECT_DOCUMENT_PART_TEMPLATE);
		createEReference(eObjectDocumentPartTemplateEClass, EOBJECT_DOCUMENT_PART_TEMPLATE__EOBJECT);
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
		textDocumentTemplateEClass.getESuperTypes().add(this.getDocumentTemplate());
		eStructuralFeatureDocumentPartTemplateEClass.getESuperTypes().add(this.getFeaturePartTemplate());
		featurePartTemplateEClass.getESuperTypes().add(this.getDocumentPartTemplate());
		objectPartTemplateEClass.getESuperTypes().add(this.getDocumentPartTemplate());
		eClassDocumentPartTemplateEClass.getESuperTypes().add(this.getObjectPartTemplate());
		eObjectDocumentPartTemplateEClass.getESuperTypes().add(this.getObjectPartTemplate());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentTemplateEClass, DocumentTemplate.class, "DocumentTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(textDocumentTemplateEClass, TextDocumentTemplate.class, "TextDocumentTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTextDocumentTemplate_DocumentPartTemplate(), this.getDocumentPartTemplate(), null, "documentPartTemplate", null, 1, -1, TextDocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, //$NON-NLS-1$
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(documentPartTemplateEClass, DocumentPartTemplate.class, "DocumentPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDocumentPartTemplate_Generate(), ecorePackage.getEBoolean(), "generate", null, 1, 1, DocumentPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocumentPartTemplate_GenerateTitle(), theEcorePackage.getEBoolean(), "generateTitle", null, 1, 1, DocumentPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocumentPartTemplate_DefaultTitle(), theEcorePackage.getEString(), "defaultTitle", null, 1, 1, DocumentPartTemplate.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocumentPartTemplate_CustomTitle(), theEcorePackage.getEString(), "customTitle", null, 0, 1, DocumentPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eStructuralFeatureDocumentPartTemplateEClass, EStructuralFeatureDocumentPartTemplate.class, "EStructuralFeatureDocumentPartTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEStructuralFeatureDocumentPartTemplate_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, EStructuralFeatureDocumentPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featurePartTemplateEClass, FeaturePartTemplate.class, "FeaturePartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFeaturePartTemplate_ObjectPartTemplate(), this.getObjectPartTemplate(), null, "objectPartTemplate", null, 0, -1, FeaturePartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, //$NON-NLS-1$
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectPartTemplateEClass, ObjectPartTemplate.class, "ObjectPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getObjectPartTemplate_FeaturePartTemplate(), this.getFeaturePartTemplate(), null, "featurePartTemplate", null, 0, -1, ObjectPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, //$NON-NLS-1$
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eClassDocumentPartTemplateEClass, EClassDocumentPartTemplate.class, "EClassDocumentPartTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEClassDocumentPartTemplate_Eclass(), theEcorePackage.getEClass(), null, "eclass", null, 1, 1, EClassDocumentPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);

		initEClass(eObjectDocumentPartTemplateEClass, EObjectDocumentPartTemplate.class, "EObjectDocumentPartTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEObjectDocumentPartTemplate_Eobject(), theEcorePackage.getEObject(), null, "eobject", null, 1, 1, EObjectDocumentPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, //$NON-NLS-1$
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
						"originalName", "DocumentStructureTemplate" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // DocumentStructureTemplatePackageImpl
