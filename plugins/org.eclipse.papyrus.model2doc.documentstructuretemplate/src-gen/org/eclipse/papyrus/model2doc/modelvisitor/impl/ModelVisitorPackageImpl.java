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
package org.eclipse.papyrus.model2doc.modelvisitor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplatePackage;
import org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage;

import org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl;

import org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor;
import org.eclipse.papyrus.model2doc.modelvisitor.ModelVisitorFactory;
import org.eclipse.papyrus.model2doc.modelvisitor.ModelVisitorPackage;
import org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor;
import org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModelVisitorPackageImpl extends EPackageImpl implements ModelVisitorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass objectVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass featureVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass startModelVisitorEClass = null;

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
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.ModelVisitorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelVisitorPackageImpl() {
		super(eNS_URI, ModelVisitorFactory.eINSTANCE);
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
	 * This method is used to initialize {@link ModelVisitorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelVisitorPackage init() {
		if (isInited) {
			return (ModelVisitorPackage) EPackage.Registry.INSTANCE.getEPackage(ModelVisitorPackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredModelVisitorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelVisitorPackageImpl theModelVisitorPackage = registeredModelVisitorPackage instanceof ModelVisitorPackageImpl ? (ModelVisitorPackageImpl) registeredModelVisitorPackage : new ModelVisitorPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DocumentStructureTemplatePackage.eNS_URI);
		DocumentStructureTemplatePackageImpl theDocumentStructureTemplatePackage = (DocumentStructureTemplatePackageImpl) (registeredPackage instanceof DocumentStructureTemplatePackageImpl ? registeredPackage : DocumentStructureTemplatePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DocumentPartTemplatePackage.eNS_URI);
		DocumentPartTemplatePackageImpl theDocumentPartTemplatePackage = (DocumentPartTemplatePackageImpl) (registeredPackage instanceof DocumentPartTemplatePackageImpl ? registeredPackage : DocumentPartTemplatePackage.eINSTANCE);

		// Create package meta-data objects
		theModelVisitorPackage.createPackageContents();
		theDocumentStructureTemplatePackage.createPackageContents();
		theDocumentPartTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theModelVisitorPackage.initializePackageContents();
		theDocumentStructureTemplatePackage.initializePackageContents();
		theDocumentPartTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelVisitorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelVisitorPackage.eNS_URI, theModelVisitorPackage);
		return theModelVisitorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getObjectVisitor() {
		return objectVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getObjectVisitor_FeatureVisitor() {
		return (EReference) objectVisitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFeatureVisitor() {
		return featureVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFeatureVisitor_ModelVisitor() {
		return (EReference) featureVisitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStartModelVisitor() {
		return startModelVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ModelVisitorFactory getModelVisitorFactory() {
		return (ModelVisitorFactory) getEFactoryInstance();
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
		objectVisitorEClass = createEClass(OBJECT_VISITOR);
		createEReference(objectVisitorEClass, OBJECT_VISITOR__FEATURE_VISITOR);

		featureVisitorEClass = createEClass(FEATURE_VISITOR);
		createEReference(featureVisitorEClass, FEATURE_VISITOR__MODEL_VISITOR);

		startModelVisitorEClass = createEClass(START_MODEL_VISITOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		startModelVisitorEClass.getESuperTypes().add(this.getObjectVisitor());

		// Initialize classes, features, and operations; add parameters
		initEClass(objectVisitorEClass, ObjectVisitor.class, "ObjectVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getObjectVisitor_FeatureVisitor(), this.getFeatureVisitor(), null, "featureVisitor", null, 0, -1, ObjectVisitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		initEClass(featureVisitorEClass, FeatureVisitor.class, "FeatureVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFeatureVisitor_ModelVisitor(), this.getObjectVisitor(), null, "modelVisitor", null, 0, -1, FeatureVisitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		initEClass(startModelVisitorEClass, StartModelVisitor.class, "StartModelVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
						"originalName", "ModelVisitor" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // ModelVisitorPackageImpl
