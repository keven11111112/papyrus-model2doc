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
package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmf.runtime.notation.Diagram;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;

import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PapyrusGMFDocumentStructureTemplatePackageImpl extends EPackageImpl implements PapyrusGMFDocumentStructureTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass papyrusGMFDiagramViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum contextFilterBehaviorEEnum = null;

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
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PapyrusGMFDocumentStructureTemplatePackageImpl() {
		super(eNS_URI, PapyrusGMFDocumentStructureTemplateFactory.eINSTANCE);
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
	 * This method is used to initialize {@link PapyrusGMFDocumentStructureTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PapyrusGMFDocumentStructureTemplatePackage init() {
		if (isInited) {
			return (PapyrusGMFDocumentStructureTemplatePackage) EPackage.Registry.INSTANCE.getEPackage(PapyrusGMFDocumentStructureTemplatePackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredPapyrusGMFDocumentStructureTemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PapyrusGMFDocumentStructureTemplatePackageImpl thePapyrusGMFDocumentStructureTemplatePackage = registeredPapyrusGMFDocumentStructureTemplatePackage instanceof PapyrusGMFDocumentStructureTemplatePackageImpl
				? (PapyrusGMFDocumentStructureTemplatePackageImpl) registeredPapyrusGMFDocumentStructureTemplatePackage
				: new PapyrusGMFDocumentStructureTemplatePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DocumentStructureTemplatePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		GeneratorConfigurationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePapyrusGMFDocumentStructureTemplatePackage.createPackageContents();

		// Initialize created meta-data
		thePapyrusGMFDocumentStructureTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePapyrusGMFDocumentStructureTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PapyrusGMFDocumentStructureTemplatePackage.eNS_URI, thePapyrusGMFDocumentStructureTemplatePackage);
		return thePapyrusGMFDocumentStructureTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getPapyrusGMFDiagramView() {
		return papyrusGMFDiagramViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getPapyrusGMFDiagramView_DiagramKindId() {
		return (EAttribute) papyrusGMFDiagramViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getPapyrusGMFDiagramView_DiagramType() {
		return (EAttribute) papyrusGMFDiagramViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getPapyrusGMFDiagramView_ContextFilterRule() {
		return (EAttribute) papyrusGMFDiagramViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getPapyrusGMFDiagramView__GetMatchingDiagrams__EObject() {
		return papyrusGMFDiagramViewEClass.getEOperations().get(0);
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
	public EEnum getContextFilterBehavior() {
		return contextFilterBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PapyrusGMFDocumentStructureTemplateFactory getPapyrusGMFDocumentStructureTemplateFactory() {
		return (PapyrusGMFDocumentStructureTemplateFactory) getEFactoryInstance();
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
		papyrusGMFDiagramViewEClass = createEClass(PAPYRUS_GMF_DIAGRAM_VIEW);
		createEAttribute(papyrusGMFDiagramViewEClass, PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID);
		createEAttribute(papyrusGMFDiagramViewEClass, PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE);
		createEAttribute(papyrusGMFDiagramViewEClass, PAPYRUS_GMF_DIAGRAM_VIEW__CONTEXT_FILTER_RULE);
		createEOperation(papyrusGMFDiagramViewEClass, PAPYRUS_GMF_DIAGRAM_VIEW___GET_MATCHING_DIAGRAMS__EOBJECT);

		diagramEClass = createEClass(DIAGRAM);

		// Create enums
		contextFilterBehaviorEEnum = createEEnum(CONTEXT_FILTER_BEHAVIOR);
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
		papyrusGMFDiagramViewEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getITemplatePartView());
		papyrusGMFDiagramViewEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getILeafBodyPartTemplate());

		// Initialize classes, features, and operations; add parameters
		initEClass(papyrusGMFDiagramViewEClass, PapyrusGMFDiagramView.class, "PapyrusGMFDiagramView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPapyrusGMFDiagramView_DiagramKindId(), theEcorePackage.getEString(), "diagramKindId", null, 0, 1, PapyrusGMFDiagramView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPapyrusGMFDiagramView_DiagramType(), theEcorePackage.getEString(), "diagramType", null, 0, 1, PapyrusGMFDiagramView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPapyrusGMFDiagramView_ContextFilterRule(), this.getContextFilterBehavior(), "contextFilterRule", null, 1, 1, PapyrusGMFDiagramView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		EOperation op = initEOperation(getPapyrusGMFDiagramView__GetMatchingDiagrams__EObject(), this.getDiagram(), "getMatchingDiagrams", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "expectedDiagramContext", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramEClass, Diagram.class, "Diagram", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(contextFilterBehaviorEEnum, ContextFilterBehavior.class, "ContextFilterBehavior"); //$NON-NLS-1$
		addEEnumLiteral(contextFilterBehaviorEEnum, ContextFilterBehavior.SEMANTIC_CONTEXT);
		addEEnumLiteral(contextFilterBehaviorEEnum, ContextFilterBehavior.GRAPHICAL_CONTEXT);
		addEEnumLiteral(contextFilterBehaviorEEnum, ContextFilterBehavior.BOTH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// duplicates
		createDuplicatesAnnotations();
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
						"originalName", "PapyrusGMFDocumentStructureTemplate" //$NON-NLS-1$ //$NON-NLS-2$
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
		addAnnotation(papyrusGMFDiagramViewEClass,
				source,
				new String[] {
				});
	}

} // PapyrusGMFDocumentStructureTemplatePackageImpl
