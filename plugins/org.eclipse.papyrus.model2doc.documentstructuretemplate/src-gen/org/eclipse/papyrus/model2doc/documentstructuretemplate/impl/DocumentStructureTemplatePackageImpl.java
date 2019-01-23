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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplatePackage;
import org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.EClassVisitorTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureVisitorTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEClassVisitorTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEObjectVisitorTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.TextDocumentTemplate;

import org.eclipse.papyrus.model2doc.modelvisitor.ModelVisitorPackage;

import org.eclipse.papyrus.model2doc.modelvisitor.impl.ModelVisitorPackageImpl;

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
	private EClass startEObjectVisitorTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass startEClassVisitorTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eClassVisitorTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eStructuralFeatureVisitorTemplateEClass = null;

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

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelVisitorPackage.eNS_URI);
		ModelVisitorPackageImpl theModelVisitorPackage = (ModelVisitorPackageImpl) (registeredPackage instanceof ModelVisitorPackageImpl ? registeredPackage : ModelVisitorPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DocumentPartTemplatePackage.eNS_URI);
		DocumentPartTemplatePackageImpl theDocumentPartTemplatePackage = (DocumentPartTemplatePackageImpl) (registeredPackage instanceof DocumentPartTemplatePackageImpl ? registeredPackage : DocumentPartTemplatePackage.eINSTANCE);

		// Create package meta-data objects
		theDocumentStructureTemplatePackage.createPackageContents();
		theModelVisitorPackage.createPackageContents();
		theDocumentPartTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theDocumentStructureTemplatePackage.initializePackageContents();
		theModelVisitorPackage.initializePackageContents();
		theDocumentPartTemplatePackage.initializePackageContents();

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
	public EReference getTextDocumentTemplate_StartModelVisitor() {
		return (EReference) textDocumentTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStartEObjectVisitorTemplate() {
		return startEObjectVisitorTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getStartEObjectVisitorTemplate_Eobject() {
		return (EReference) startEObjectVisitorTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStartEClassVisitorTemplate() {
		return startEClassVisitorTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEClassVisitorTemplate() {
		return eClassVisitorTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEClassVisitorTemplate_Eclass() {
		return (EReference) eClassVisitorTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEStructuralFeatureVisitorTemplate() {
		return eStructuralFeatureVisitorTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEStructuralFeatureVisitorTemplate_Feature() {
		return (EReference) eStructuralFeatureVisitorTemplateEClass.getEStructuralFeatures().get(0);
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
		createEReference(textDocumentTemplateEClass, TEXT_DOCUMENT_TEMPLATE__START_MODEL_VISITOR);

		startEObjectVisitorTemplateEClass = createEClass(START_EOBJECT_VISITOR_TEMPLATE);
		createEReference(startEObjectVisitorTemplateEClass, START_EOBJECT_VISITOR_TEMPLATE__EOBJECT);

		startEClassVisitorTemplateEClass = createEClass(START_ECLASS_VISITOR_TEMPLATE);

		eClassVisitorTemplateEClass = createEClass(ECLASS_VISITOR_TEMPLATE);
		createEReference(eClassVisitorTemplateEClass, ECLASS_VISITOR_TEMPLATE__ECLASS);

		eStructuralFeatureVisitorTemplateEClass = createEClass(ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE);
		createEReference(eStructuralFeatureVisitorTemplateEClass, ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__FEATURE);
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
		ModelVisitorPackage theModelVisitorPackage = (ModelVisitorPackage) EPackage.Registry.INSTANCE.getEPackage(ModelVisitorPackage.eNS_URI);
		DocumentPartTemplatePackage theDocumentPartTemplatePackage = (DocumentPartTemplatePackage) EPackage.Registry.INSTANCE.getEPackage(DocumentPartTemplatePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theModelVisitorPackage);
		getESubpackages().add(theDocumentPartTemplatePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textDocumentTemplateEClass.getESuperTypes().add(this.getDocumentTemplate());
		startEObjectVisitorTemplateEClass.getESuperTypes().add(theModelVisitorPackage.getStartModelVisitor());
		startEObjectVisitorTemplateEClass.getESuperTypes().add(theDocumentPartTemplatePackage.getEObjectDocumentPartTemplate());
		startEClassVisitorTemplateEClass.getESuperTypes().add(this.getEClassVisitorTemplate());
		startEClassVisitorTemplateEClass.getESuperTypes().add(theModelVisitorPackage.getStartModelVisitor());
		eClassVisitorTemplateEClass.getESuperTypes().add(theModelVisitorPackage.getObjectVisitor());
		eClassVisitorTemplateEClass.getESuperTypes().add(theDocumentPartTemplatePackage.getEClassDocumentPartTemplate());
		eStructuralFeatureVisitorTemplateEClass.getESuperTypes().add(theModelVisitorPackage.getFeatureVisitor());
		eStructuralFeatureVisitorTemplateEClass.getESuperTypes().add(theDocumentPartTemplatePackage.getEStructuralFeatureDocumentPartTemplate());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentTemplateEClass, DocumentTemplate.class, "DocumentTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(textDocumentTemplateEClass, TextDocumentTemplate.class, "TextDocumentTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTextDocumentTemplate_StartModelVisitor(), theModelVisitorPackage.getStartModelVisitor(), null, "startModelVisitor", null, 0, -1, TextDocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, //$NON-NLS-1$
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(startEObjectVisitorTemplateEClass, StartEObjectVisitorTemplate.class, "StartEObjectVisitorTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStartEObjectVisitorTemplate_Eobject(), theEcorePackage.getEObject(), null, "eobject", null, 0, 1, StartEObjectVisitorTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, //$NON-NLS-1$
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(startEClassVisitorTemplateEClass, StartEClassVisitorTemplate.class, "StartEClassVisitorTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eClassVisitorTemplateEClass, EClassVisitorTemplate.class, "EClassVisitorTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEClassVisitorTemplate_Eclass(), theEcorePackage.getEClass(), null, "eclass", null, 1, 1, EClassVisitorTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);

		initEClass(eStructuralFeatureVisitorTemplateEClass, EStructuralFeatureVisitorTemplate.class, "EStructuralFeatureVisitorTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEStructuralFeatureVisitorTemplate_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, EStructuralFeatureVisitorTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, //$NON-NLS-1$
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
