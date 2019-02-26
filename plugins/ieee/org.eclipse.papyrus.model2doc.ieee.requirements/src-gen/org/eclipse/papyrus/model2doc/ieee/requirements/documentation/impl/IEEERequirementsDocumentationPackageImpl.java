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
package org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl;

import org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirementCategory;
import org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirements;
import org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEEFunctionalRequirements;
import org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementCategory;
import org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirements;
import org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementsDocumentationFactory;
import org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementsDocumentationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IEEERequirementsDocumentationPackageImpl extends EPackageImpl implements IEEERequirementsDocumentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieeeRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieeeFunctionalRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ieeeRequirementCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum abstractRequirementCategoryEEnum = null;

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
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementsDocumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IEEERequirementsDocumentationPackageImpl() {
		super(eNS_URI, IEEERequirementsDocumentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IEEERequirementsDocumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IEEERequirementsDocumentationPackage init() {
		if (isInited) {
			return (IEEERequirementsDocumentationPackage) EPackage.Registry.INSTANCE.getEPackage(IEEERequirementsDocumentationPackage.eNS_URI);
		}

		// Obtain or create and register package
		IEEERequirementsDocumentationPackageImpl theIEEERequirementsDocumentationPackage = (IEEERequirementsDocumentationPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IEEERequirementsDocumentationPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new IEEERequirementsDocumentationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIEEERequirementsDocumentationPackage.createPackageContents();

		// Initialize created meta-data
		theIEEERequirementsDocumentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIEEERequirementsDocumentationPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IEEERequirementsDocumentationPackage.eNS_URI, theIEEERequirementsDocumentationPackage);
		return theIEEERequirementsDocumentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIEEERequirements() {
		return ieeeRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIEEERequirements_Category() {
		return (EAttribute) ieeeRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractRequirements() {
		return abstractRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRequirements_Base_Package() {
		return (EReference) abstractRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractRequirements_ReqCategory() {
		return (EAttribute) abstractRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIEEEFunctionalRequirements() {
		return ieeeFunctionalRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIEEEFunctionalRequirements_Mode() {
		return (EAttribute) ieeeFunctionalRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIEEERequirementCategory() {
		return ieeeRequirementCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAbstractRequirementCategory() {
		return abstractRequirementCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IEEERequirementsDocumentationFactory getIEEERequirementsDocumentationFactory() {
		return (IEEERequirementsDocumentationFactory) getEFactoryInstance();
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
		ieeeRequirementsEClass = createEClass(IEEE_REQUIREMENTS);
		createEAttribute(ieeeRequirementsEClass, IEEE_REQUIREMENTS__CATEGORY);

		abstractRequirementsEClass = createEClass(ABSTRACT_REQUIREMENTS);
		createEReference(abstractRequirementsEClass, ABSTRACT_REQUIREMENTS__BASE_PACKAGE);
		createEAttribute(abstractRequirementsEClass, ABSTRACT_REQUIREMENTS__REQ_CATEGORY);

		ieeeFunctionalRequirementsEClass = createEClass(IEEE_FUNCTIONAL_REQUIREMENTS);
		createEAttribute(ieeeFunctionalRequirementsEClass, IEEE_FUNCTIONAL_REQUIREMENTS__MODE);

		// Create enums
		ieeeRequirementCategoryEEnum = createEEnum(IEEE_REQUIREMENT_CATEGORY);
		abstractRequirementCategoryEEnum = createEEnum(ABSTRACT_REQUIREMENT_CATEGORY);
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
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ieeeRequirementsEClass.getESuperTypes().add(this.getAbstractRequirements());
		ieeeFunctionalRequirementsEClass.getESuperTypes().add(this.getIEEERequirements());

		// Initialize classes, features, and operations; add parameters
		initEClass(ieeeRequirementsEClass, IEEERequirements.class, "IEEERequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIEEERequirements_Category(), this.getIEEERequirementCategory(), "category", null, 1, 1, IEEERequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractRequirementsEClass, AbstractRequirements.class, "AbstractRequirements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAbstractRequirements_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, AbstractRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractRequirements_ReqCategory(), this.getAbstractRequirementCategory(), "reqCategory", null, 0, 1, AbstractRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		initEClass(ieeeFunctionalRequirementsEClass, IEEEFunctionalRequirements.class, "IEEEFunctionalRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIEEEFunctionalRequirements_Mode(), theTypesPackage.getInteger(), "mode", "1", 1, 1, IEEEFunctionalRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Initialize enums and add enum literals
		initEEnum(ieeeRequirementCategoryEEnum, IEEERequirementCategory.class, "IEEERequirementCategory"); //$NON-NLS-1$
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.SPECIFIC_REQUIREMENTS);
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.EXTERNAL_INTERFACE_REQUIREMENTS);
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.USER_INTERFACES);
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.HARDWARE_INTERFACES);
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.SOFTWARE_INTERFACES);
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.COMMUNICATION_INTERFACES);
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.FUNCTIONAL_REQUIREMENTS);
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.PERFORMANCE_REQUIREMENTS);
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.DESIGN_CONSTRAINTS);
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.SOFTWARE_SYSTEM_ATTRIBUTES);
		addEEnumLiteral(ieeeRequirementCategoryEEnum, IEEERequirementCategory.OTHER_REQUIREMENTS);

		initEEnum(abstractRequirementCategoryEEnum, AbstractRequirementCategory.class, "AbstractRequirementCategory"); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
						"originalName", "IEEERequirementsDocumentation" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"; //$NON-NLS-1$
		addAnnotation(ieeeRequirementCategoryEEnum,
				source,
				new String[] {
						"baseType", "AbstractRequirementCategory" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} //IEEERequirementsDocumentationPackageImpl
