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
package org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmf.runtime.notation.Diagram;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;

import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView;
import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDocumentStructureTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GMFDocumentStructureTemplatePackageImpl extends EPackageImpl implements GMFDocumentStructureTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass gmfDiagramViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass diagramEClass = null;

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
	 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDocumentStructureTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GMFDocumentStructureTemplatePackageImpl() {
		super(eNS_URI, GMFDocumentStructureTemplateFactory.eINSTANCE);
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
	 * This method is used to initialize {@link GMFDocumentStructureTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GMFDocumentStructureTemplatePackage init() {
		if (isInited) {
			return (GMFDocumentStructureTemplatePackage) EPackage.Registry.INSTANCE.getEPackage(GMFDocumentStructureTemplatePackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredGMFDocumentStructureTemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GMFDocumentStructureTemplatePackageImpl theGMFDocumentStructureTemplatePackage = registeredGMFDocumentStructureTemplatePackage instanceof GMFDocumentStructureTemplatePackageImpl
				? (GMFDocumentStructureTemplatePackageImpl) registeredGMFDocumentStructureTemplatePackage
				: new GMFDocumentStructureTemplatePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DocumentStructureTemplatePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		GeneratorConfigurationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGMFDocumentStructureTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theGMFDocumentStructureTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGMFDocumentStructureTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GMFDocumentStructureTemplatePackage.eNS_URI, theGMFDocumentStructureTemplatePackage);
		return theGMFDocumentStructureTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getGMFDiagramView() {
		return gmfDiagramViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getGMFDiagramView_DiagramType() {
		return (EAttribute) gmfDiagramViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getGMFDiagramView__GetMatchingDiagrams__EObject() {
		return gmfDiagramViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public GMFDocumentStructureTemplateFactory getGMFDocumentStructureTemplateFactory() {
		return (GMFDocumentStructureTemplateFactory) getEFactoryInstance();
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
		gmfDiagramViewEClass = createEClass(GMF_DIAGRAM_VIEW);
		createEAttribute(gmfDiagramViewEClass, GMF_DIAGRAM_VIEW__DIAGRAM_TYPE);
		createEOperation(gmfDiagramViewEClass, GMF_DIAGRAM_VIEW___GET_MATCHING_DIAGRAMS__EOBJECT);

		diagramEClass = createEClass(DIAGRAM);
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
		gmfDiagramViewEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getITemplatePartView());
		gmfDiagramViewEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getILeafBodyPartTemplate());

		// Initialize classes, features, and operations; add parameters
		initEClass(gmfDiagramViewEClass, GMFDiagramView.class, "GMFDiagramView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getGMFDiagramView_DiagramType(), ecorePackage.getEString(), "diagramType", null, 0, 1, GMFDiagramView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getGMFDiagramView__GetMatchingDiagrams__EObject(), this.getDiagram(), "getMatchingDiagrams", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "expectedDiagramContext", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramEClass, Diagram.class, "Diagram", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
						"originalName", "GMFdocumentstructuretemplate" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // GMFDocumentStructureTemplatePackageImpl
