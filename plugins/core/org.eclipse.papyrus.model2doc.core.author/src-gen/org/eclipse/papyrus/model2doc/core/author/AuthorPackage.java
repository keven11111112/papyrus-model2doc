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
package org.eclipse.papyrus.model2doc.core.author;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.model2doc.core.author.AuthorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Author'"
 * @generated
 */
public interface AuthorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "author"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/core/1.0.0/Author"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "author"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuthorPackage eINSTANCE = org.eclipse.papyrus.model2doc.core.author.impl.AuthorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.author.IAuthor <em>IAuthor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.core.author.IAuthor
	 * @see org.eclipse.papyrus.model2doc.core.author.impl.AuthorPackageImpl#getIAuthor()
	 * @generated
	 */
	int IAUTHOR = 0;

	/**
	 * The number of structural features of the '<em>IAuthor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAUTHOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAUTHOR___GET_FIRST_NAME = 0;

	/**
	 * The operation id for the '<em>Get Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAUTHOR___GET_LAST_NAME = 1;

	/**
	 * The operation id for the '<em>Set First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAUTHOR___SET_FIRST_NAME__STRING = 2;

	/**
	 * The operation id for the '<em>Set Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAUTHOR___SET_LAST_NAME__STRING = 3;

	/**
	 * The number of operations of the '<em>IAuthor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAUTHOR_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.author.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.core.author.impl.AuthorImpl
	 * @see org.eclipse.papyrus.model2doc.core.author.impl.AuthorPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__FIRST_NAME = IAUTHOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__LAST_NAME = IAUTHOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = IAUTHOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___GET_FIRST_NAME = IAUTHOR___GET_FIRST_NAME;

	/**
	 * The operation id for the '<em>Get Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___GET_LAST_NAME = IAUTHOR___GET_LAST_NAME;

	/**
	 * The operation id for the '<em>Set First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___SET_FIRST_NAME__STRING = IAUTHOR___SET_FIRST_NAME__STRING;

	/**
	 * The operation id for the '<em>Set Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___SET_LAST_NAME__STRING = IAUTHOR___SET_LAST_NAME__STRING;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = IAUTHOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.author.IAuthor <em>IAuthor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAuthor</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.author.IAuthor
	 * @generated
	 */
	EClass getIAuthor();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.core.author.IAuthor#getFirstName() <em>Get First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Name</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.core.author.IAuthor#getFirstName()
	 * @generated
	 */
	EOperation getIAuthor__GetFirstName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.core.author.IAuthor#getLastName() <em>Get Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Name</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.core.author.IAuthor#getLastName()
	 * @generated
	 */
	EOperation getIAuthor__GetLastName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.core.author.IAuthor#setFirstName(java.lang.String) <em>Set First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set First Name</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.core.author.IAuthor#setFirstName(java.lang.String)
	 * @generated
	 */
	EOperation getIAuthor__SetFirstName__String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.core.author.IAuthor#setLastName(java.lang.String) <em>Set Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Last Name</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.core.author.IAuthor#setLastName(java.lang.String)
	 * @generated
	 */
	EOperation getIAuthor__SetLastName__String();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.author.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.author.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.author.Author#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.author.Author#getFirstName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.author.Author#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.author.Author#getLastName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_LastName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AuthorFactory getAuthorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.author.IAuthor <em>IAuthor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.core.author.IAuthor
		 * @see org.eclipse.papyrus.model2doc.core.author.impl.AuthorPackageImpl#getIAuthor()
		 * @generated
		 */
		EClass IAUTHOR = eINSTANCE.getIAuthor();

		/**
		 * The meta object literal for the '<em><b>Get First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAUTHOR___GET_FIRST_NAME = eINSTANCE.getIAuthor__GetFirstName();

		/**
		 * The meta object literal for the '<em><b>Get Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAUTHOR___GET_LAST_NAME = eINSTANCE.getIAuthor__GetLastName();

		/**
		 * The meta object literal for the '<em><b>Set First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAUTHOR___SET_FIRST_NAME__STRING = eINSTANCE.getIAuthor__SetFirstName__String();

		/**
		 * The meta object literal for the '<em><b>Set Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAUTHOR___SET_LAST_NAME__STRING = eINSTANCE.getIAuthor__SetLastName__String();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.author.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.core.author.impl.AuthorImpl
		 * @see org.eclipse.papyrus.model2doc.core.author.impl.AuthorPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__FIRST_NAME = eINSTANCE.getAuthor_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__LAST_NAME = eINSTANCE.getAuthor_LastName();

	}

} //AuthorPackage
