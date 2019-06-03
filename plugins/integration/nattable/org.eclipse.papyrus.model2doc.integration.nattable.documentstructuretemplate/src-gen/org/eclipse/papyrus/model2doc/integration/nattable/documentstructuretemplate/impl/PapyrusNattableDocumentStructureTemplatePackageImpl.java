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
package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.infra.nattable.model.nattable.Table;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;

import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PapyrusNattableDocumentStructureTemplatePackageImpl extends EPackageImpl implements PapyrusNattableDocumentStructureTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass papyrusTableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextFilterBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum importMethodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PapyrusNattableDocumentStructureTemplatePackageImpl() {
		super(eNS_URI, PapyrusNattableDocumentStructureTemplateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PapyrusNattableDocumentStructureTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PapyrusNattableDocumentStructureTemplatePackage init() {
		if (isInited) {
			return (PapyrusNattableDocumentStructureTemplatePackage) EPackage.Registry.INSTANCE.getEPackage(PapyrusNattableDocumentStructureTemplatePackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredPapyrusNattableDocumentStructureTemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PapyrusNattableDocumentStructureTemplatePackageImpl thePapyrusNattableDocumentStructureTemplatePackage = registeredPapyrusNattableDocumentStructureTemplatePackage instanceof PapyrusNattableDocumentStructureTemplatePackageImpl
				? (PapyrusNattableDocumentStructureTemplatePackageImpl) registeredPapyrusNattableDocumentStructureTemplatePackage
				: new PapyrusNattableDocumentStructureTemplatePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DocumentStructureTemplatePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		GeneratorConfigurationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePapyrusNattableDocumentStructureTemplatePackage.createPackageContents();

		// Initialize created meta-data
		thePapyrusNattableDocumentStructureTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePapyrusNattableDocumentStructureTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PapyrusNattableDocumentStructureTemplatePackage.eNS_URI, thePapyrusNattableDocumentStructureTemplatePackage);
		return thePapyrusNattableDocumentStructureTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPapyrusTableView() {
		return papyrusTableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPapyrusTableView_TableKindId() {
		return (EAttribute) papyrusTableViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPapyrusTableView_TableType() {
		return (EAttribute) papyrusTableViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPapyrusTableView_ContextFilterRule() {
		return (EAttribute) papyrusTableViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPapyrusTableView_ImportMethod() {
		return (EAttribute) papyrusTableViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPapyrusTableView__GetMatchingTables__EObject() {
		return papyrusTableViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPapyrusTableView__BuildPartTemplateTitle__EObject_1() {
		return papyrusTableViewEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContextFilterBehavior() {
		return contextFilterBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImportMethod() {
		return importMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PapyrusNattableDocumentStructureTemplateFactory getPapyrusNattableDocumentStructureTemplateFactory() {
		return (PapyrusNattableDocumentStructureTemplateFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		papyrusTableViewEClass = createEClass(PAPYRUS_TABLE_VIEW);
		createEAttribute(papyrusTableViewEClass, PAPYRUS_TABLE_VIEW__TABLE_KIND_ID);
		createEAttribute(papyrusTableViewEClass, PAPYRUS_TABLE_VIEW__TABLE_TYPE);
		createEAttribute(papyrusTableViewEClass, PAPYRUS_TABLE_VIEW__CONTEXT_FILTER_RULE);
		createEAttribute(papyrusTableViewEClass, PAPYRUS_TABLE_VIEW__IMPORT_METHOD);
		createEOperation(papyrusTableViewEClass, PAPYRUS_TABLE_VIEW___GET_MATCHING_TABLES__EOBJECT);
		createEOperation(papyrusTableViewEClass, PAPYRUS_TABLE_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT_1);

		tableEClass = createEClass(TABLE);

		// Create enums
		contextFilterBehaviorEEnum = createEEnum(CONTEXT_FILTER_BEHAVIOR);
		importMethodEEnum = createEEnum(IMPORT_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		papyrusTableViewEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getILeafBodyPartTemplate());
		papyrusTableViewEClass.getESuperTypes().add(theDocumentStructureTemplatePackage.getITemplatePartView());

		// Initialize classes, features, and operations; add parameters
		initEClass(papyrusTableViewEClass, PapyrusTableView.class, "PapyrusTableView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPapyrusTableView_TableKindId(), ecorePackage.getEString(), "tableKindId", null, 0, 1, PapyrusTableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPapyrusTableView_TableType(), ecorePackage.getEString(), "tableType", null, 0, 1, PapyrusTableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPapyrusTableView_ContextFilterRule(), this.getContextFilterBehavior(), "contextFilterRule", "SEMANTIC_CONTEXT", 1, 1, PapyrusTableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$//$NON-NLS-2$
				!IS_ORDERED);
		initEAttribute(getPapyrusTableView_ImportMethod(), this.getImportMethod(), "importMethod", "TABLE", 1, 1, PapyrusTableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		EOperation op = initEOperation(getPapyrusTableView__GetMatchingTables__EObject(), this.getTable(), "getMatchingTables", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "expectedTableContext", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getPapyrusTableView__BuildPartTemplateTitle__EObject_1(), ecorePackage.getEString(), "buildPartTemplateTitle", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "tableContext", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(tableEClass, Table.class, "Table", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(contextFilterBehaviorEEnum, ContextFilterBehavior.class, "ContextFilterBehavior"); //$NON-NLS-1$
		addEEnumLiteral(contextFilterBehaviorEEnum, ContextFilterBehavior.SEMANTIC_CONTEXT);
		addEEnumLiteral(contextFilterBehaviorEEnum, ContextFilterBehavior.GRAPHICAL_CONTEXT);
		addEEnumLiteral(contextFilterBehaviorEEnum, ContextFilterBehavior.BOTH);

		initEEnum(importMethodEEnum, ImportMethod.class, "ImportMethod"); //$NON-NLS-1$
		addEEnumLiteral(importMethodEEnum, ImportMethod.IMAGE);
		addEEnumLiteral(importMethodEEnum, ImportMethod.TABLE);

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
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$
		addAnnotation(this,
				source,
				new String[] {
						"originalName", "PapyrusNattableDocumentStructureTemplate" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} //PapyrusNattableDocumentStructureTemplatePackageImpl
