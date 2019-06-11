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
package org.eclipse.papyrus.model2doc.core.author.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.model2doc.core.author.Author;
import org.eclipse.papyrus.model2doc.core.author.AuthorFactory;
import org.eclipse.papyrus.model2doc.core.author.AuthorPackage;
import org.eclipse.papyrus.model2doc.core.author.IAuthor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthorPackageImpl extends EPackageImpl implements AuthorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorEClass = null;

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
	 * @see org.eclipse.papyrus.model2doc.core.author.AuthorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AuthorPackageImpl() {
		super(eNS_URI, AuthorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AuthorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AuthorPackage init() {
		if (isInited) {
			return (AuthorPackage) EPackage.Registry.INSTANCE.getEPackage(AuthorPackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredAuthorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AuthorPackageImpl theAuthorPackage = registeredAuthorPackage instanceof AuthorPackageImpl ? (AuthorPackageImpl) registeredAuthorPackage : new AuthorPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAuthorPackage.createPackageContents();

		// Initialize created meta-data
		theAuthorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAuthorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AuthorPackage.eNS_URI, theAuthorPackage);
		return theAuthorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIAuthor() {
		return iAuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIAuthor__GetFirstName() {
		return iAuthorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIAuthor__GetLastName() {
		return iAuthorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIAuthor__SetFirstName__String() {
		return iAuthorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIAuthor__SetLastName__String() {
		return iAuthorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIAuthor__BuildAuthorLabel() {
		return iAuthorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIAuthor__BuildMultiAuthorLabel__EList() {
		return iAuthorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthor() {
		return authorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthor_FirstName() {
		return (EAttribute) authorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthor_LastName() {
		return (EAttribute) authorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorFactory getAuthorFactory() {
		return (AuthorFactory) getEFactoryInstance();
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
		iAuthorEClass = createEClass(IAUTHOR);
		createEOperation(iAuthorEClass, IAUTHOR___GET_FIRST_NAME);
		createEOperation(iAuthorEClass, IAUTHOR___GET_LAST_NAME);
		createEOperation(iAuthorEClass, IAUTHOR___SET_FIRST_NAME__STRING);
		createEOperation(iAuthorEClass, IAUTHOR___SET_LAST_NAME__STRING);
		createEOperation(iAuthorEClass, IAUTHOR___BUILD_AUTHOR_LABEL);
		createEOperation(iAuthorEClass, IAUTHOR___BUILD_MULTI_AUTHOR_LABEL__ELIST);

		authorEClass = createEClass(AUTHOR);
		createEAttribute(authorEClass, AUTHOR__FIRST_NAME);
		createEAttribute(authorEClass, AUTHOR__LAST_NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		authorEClass.getESuperTypes().add(this.getIAuthor());

		// Initialize classes, features, and operations; add parameters
		initEClass(iAuthorEClass, IAuthor.class, "IAuthor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEOperation(getIAuthor__GetFirstName(), ecorePackage.getEString(), "getFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getIAuthor__GetLastName(), ecorePackage.getEString(), "getLastName", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getIAuthor__SetFirstName__String(), null, "setFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getIAuthor__SetLastName__String(), null, "setLastName", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getIAuthor__BuildAuthorLabel(), ecorePackage.getEString(), "buildAuthorLabel", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getIAuthor__BuildMultiAuthorLabel__EList(), ecorePackage.getEString(), "buildMultiAuthorLabel", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getIAuthor(), "authors", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAuthor_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAuthor_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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
						"originalName", "Author" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} //AuthorPackageImpl
