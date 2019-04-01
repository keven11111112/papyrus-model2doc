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
package org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationFactory;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GeneratorConfigurationPackageImpl extends EPackageImpl implements GeneratorConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass defaultDocumentStructureGeneratorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass abstractDocumentStructureGeneratorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass abstractDocumentGeneratorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass generatorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iDocumentStructureGeneratorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iDocumentGeneratorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass defaultDocumentGeneratorConfigurationEClass = null;

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
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratorConfigurationPackageImpl() {
		super(eNS_URI, GeneratorConfigurationFactory.eINSTANCE);
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
	 * This method is used to initialize {@link GeneratorConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneratorConfigurationPackage init() {
		if (isInited) {
			return (GeneratorConfigurationPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratorConfigurationPackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredGeneratorConfigurationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GeneratorConfigurationPackageImpl theGeneratorConfigurationPackage = registeredGeneratorConfigurationPackage instanceof GeneratorConfigurationPackageImpl ? (GeneratorConfigurationPackageImpl) registeredGeneratorConfigurationPackage
				: new GeneratorConfigurationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGeneratorConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratorConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneratorConfigurationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratorConfigurationPackage.eNS_URI, theGeneratorConfigurationPackage);
		return theGeneratorConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDefaultDocumentStructureGeneratorConfiguration() {
		return defaultDocumentStructureGeneratorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getAbstractDocumentStructureGeneratorConfiguration() {
		return abstractDocumentStructureGeneratorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDocumentStructureGeneratorConfiguration_StructureGeneratorId() {
		return (EAttribute) abstractDocumentStructureGeneratorConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDocumentStructureGeneratorConfiguration_ImageFolder() {
		return (EAttribute) abstractDocumentStructureGeneratorConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDocumentStructureGeneratorConfiguration_StructureFolder() {
		return (EAttribute) abstractDocumentStructureGeneratorConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getAbstractDocumentGeneratorConfiguration() {
		return abstractDocumentGeneratorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDocumentGeneratorConfiguration_SaveDocumentStructure() {
		return (EAttribute) abstractDocumentGeneratorConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDocumentGeneratorConfiguration_SaveImages() {
		return (EAttribute) abstractDocumentGeneratorConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDocumentGeneratorConfiguration_TemplateFile() {
		return (EAttribute) abstractDocumentGeneratorConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getGeneratorConfiguration() {
		return generatorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorConfiguration_DocumentName() {
		return (EAttribute) generatorConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorConfiguration_DocumentFolder() {
		return (EAttribute) generatorConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorConfiguration_DocumentGeneratorId() {
		return (EAttribute) generatorConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIDocumentStructureGeneratorConfiguration() {
		return iDocumentStructureGeneratorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getIDocumentStructureGeneratorConfiguration__CreateDocumentGeneratorConfiguration() {
		return iDocumentStructureGeneratorConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIDocumentGeneratorConfiguration() {
		return iDocumentGeneratorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDefaultDocumentGeneratorConfiguration() {
		return defaultDocumentGeneratorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public GeneratorConfigurationFactory getGeneratorConfigurationFactory() {
		return (GeneratorConfigurationFactory) getEFactoryInstance();
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
		defaultDocumentStructureGeneratorConfigurationEClass = createEClass(DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION);

		abstractDocumentStructureGeneratorConfigurationEClass = createEClass(ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION);
		createEAttribute(abstractDocumentStructureGeneratorConfigurationEClass, ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID);
		createEAttribute(abstractDocumentStructureGeneratorConfigurationEClass, ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER);
		createEAttribute(abstractDocumentStructureGeneratorConfigurationEClass, ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER);

		abstractDocumentGeneratorConfigurationEClass = createEClass(ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION);
		createEAttribute(abstractDocumentGeneratorConfigurationEClass, ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_DOCUMENT_STRUCTURE);
		createEAttribute(abstractDocumentGeneratorConfigurationEClass, ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__SAVE_IMAGES);
		createEAttribute(abstractDocumentGeneratorConfigurationEClass, ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION__TEMPLATE_FILE);

		generatorConfigurationEClass = createEClass(GENERATOR_CONFIGURATION);
		createEAttribute(generatorConfigurationEClass, GENERATOR_CONFIGURATION__DOCUMENT_NAME);
		createEAttribute(generatorConfigurationEClass, GENERATOR_CONFIGURATION__DOCUMENT_FOLDER);
		createEAttribute(generatorConfigurationEClass, GENERATOR_CONFIGURATION__DOCUMENT_GENERATOR_ID);

		iDocumentStructureGeneratorConfigurationEClass = createEClass(IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION);
		createEOperation(iDocumentStructureGeneratorConfigurationEClass, IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_GENERATOR_CONFIGURATION);

		iDocumentGeneratorConfigurationEClass = createEClass(IDOCUMENT_GENERATOR_CONFIGURATION);

		defaultDocumentGeneratorConfigurationEClass = createEClass(DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION);
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
		defaultDocumentStructureGeneratorConfigurationEClass.getESuperTypes().add(this.getAbstractDocumentStructureGeneratorConfiguration());
		defaultDocumentStructureGeneratorConfigurationEClass.getESuperTypes().add(this.getIDocumentStructureGeneratorConfiguration());
		abstractDocumentStructureGeneratorConfigurationEClass.getESuperTypes().add(this.getAbstractDocumentGeneratorConfiguration());
		abstractDocumentGeneratorConfigurationEClass.getESuperTypes().add(this.getGeneratorConfiguration());
		defaultDocumentGeneratorConfigurationEClass.getESuperTypes().add(this.getAbstractDocumentGeneratorConfiguration());
		defaultDocumentGeneratorConfigurationEClass.getESuperTypes().add(this.getIDocumentGeneratorConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(defaultDocumentStructureGeneratorConfigurationEClass, DefaultDocumentStructureGeneratorConfiguration.class, "DefaultDocumentStructureGeneratorConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(abstractDocumentStructureGeneratorConfigurationEClass, AbstractDocumentStructureGeneratorConfiguration.class, "AbstractDocumentStructureGeneratorConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAbstractDocumentStructureGeneratorConfiguration_StructureGeneratorId(), ecorePackage.getEString(), "structureGeneratorId", null, 0, 1, AbstractDocumentStructureGeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractDocumentStructureGeneratorConfiguration_ImageFolder(), ecorePackage.getEString(), "imageFolder", null, 0, 1, AbstractDocumentStructureGeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, //$NON-NLS-1$
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractDocumentStructureGeneratorConfiguration_StructureFolder(), ecorePackage.getEString(), "structureFolder", null, 0, 1, AbstractDocumentStructureGeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractDocumentGeneratorConfigurationEClass, AbstractDocumentGeneratorConfiguration.class, "AbstractDocumentGeneratorConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAbstractDocumentGeneratorConfiguration_SaveDocumentStructure(), ecorePackage.getEBoolean(), "saveDocumentStructure", "true", 1, 1, AbstractDocumentGeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$ //$NON-NLS-2$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractDocumentGeneratorConfiguration_SaveImages(), ecorePackage.getEBoolean(), "saveImages", "true", 1, 1, AbstractDocumentGeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, //$NON-NLS-1$ //$NON-NLS-2$
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractDocumentGeneratorConfiguration_TemplateFile(), ecorePackage.getEString(), "templateFile", null, 0, 1, AbstractDocumentGeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);

		initEClass(generatorConfigurationEClass, GeneratorConfiguration.class, "GeneratorConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getGeneratorConfiguration_DocumentName(), ecorePackage.getEString(), "documentName", null, 0, 1, GeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGeneratorConfiguration_DocumentFolder(), ecorePackage.getEString(), "documentFolder", null, 0, 1, GeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGeneratorConfiguration_DocumentGeneratorId(), ecorePackage.getEString(), "documentGeneratorId", null, 0, 1, GeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		initEClass(iDocumentStructureGeneratorConfigurationEClass, IDocumentStructureGeneratorConfiguration.class, "IDocumentStructureGeneratorConfiguration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEOperation(getIDocumentStructureGeneratorConfiguration__CreateDocumentGeneratorConfiguration(), this.getIDocumentGeneratorConfiguration(), "createDocumentGeneratorConfiguration", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(iDocumentGeneratorConfigurationEClass, IDocumentGeneratorConfiguration.class, "IDocumentGeneratorConfiguration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(defaultDocumentGeneratorConfigurationEClass, DefaultDocumentGeneratorConfiguration.class, "DefaultDocumentGeneratorConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
						"originalName", "GeneratorConfiguration" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // GeneratorConfigurationPackageImpl