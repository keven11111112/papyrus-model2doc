/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.documentview.representation.internal.impl;

import org.eclipse.papyrus.model2doc.documentview.representation.PapyrusDocument;
import org.eclipse.papyrus.model2doc.documentview.representation.RepresentationFactory;
import org.eclipse.papyrus.model2doc.documentview.representation.RepresentationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.infra.constraints.ConstraintsPackage;

import org.eclipse.papyrus.infra.core.architecture.ArchitecturePackage;

import org.eclipse.papyrus.infra.types.ElementTypesConfigurationsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class RepresentationPackageImpl extends EPackageImpl implements RepresentationPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass papyrusDocumentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.model2doc.documentview.representation.RepresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RepresentationPackageImpl() {
		super(eNS_URI, RepresentationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and
	 * for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link RepresentationPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RepresentationPackage init() {
		if (isInited) {
			return (RepresentationPackage) EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredRepresentationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RepresentationPackageImpl theRepresentationPackage = registeredRepresentationPackage instanceof RepresentationPackageImpl ? (RepresentationPackageImpl) registeredRepresentationPackage : new RepresentationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ArchitecturePackage.eINSTANCE.eClass();
		ConstraintsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ElementTypesConfigurationsPackage.eINSTANCE.eClass();
		org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRepresentationPackage.createPackageContents();

		// Initialize created meta-data
		theRepresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRepresentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RepresentationPackage.eNS_URI, theRepresentationPackage);
		return theRepresentationPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getPapyrusDocument() {
		return papyrusDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getPapyrusDocument_CreationCommandClass() {
		return (EAttribute) papyrusDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getPapyrusDocument_DocumentKind() {
		return (EAttribute) papyrusDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public RepresentationFactory getRepresentationFactory() {
		return (RepresentationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		papyrusDocumentEClass = createEClass(PAPYRUS_DOCUMENT);
		createEAttribute(papyrusDocumentEClass, PAPYRUS_DOCUMENT__CREATION_COMMAND_CLASS);
		createEAttribute(papyrusDocumentEClass, PAPYRUS_DOCUMENT__DOCUMENT_KIND);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is
	 * guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
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
		org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage theRepresentationPackage_1 = (org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		papyrusDocumentEClass.getESuperTypes().add(theRepresentationPackage_1.getPapyrusRepresentationKind());

		// Initialize classes, features, and operations; add parameters
		initEClass(papyrusDocumentEClass, PapyrusDocument.class, "PapyrusDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getPapyrusDocument_CreationCommandClass(), g1, "creationCommandClass", null, 1, 1, PapyrusDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPapyrusDocument_DocumentKind(), ecorePackage.getEString(), "documentKind", null, 1, 1, PapyrusDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} // RepresentationPackageImpl
