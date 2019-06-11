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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Default implementation for the interface IBasicAuthor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.model2doc.core.author.Author#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.core.author.Author#getLastName <em>Last Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.core.author.AuthorPackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends IAuthor {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first name of the author.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.eclipse.papyrus.model2doc.core.author.AuthorPackage#getAuthor_FirstName()
	 * @model ordered="false"
	 * @generated
	 */
	@Override
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.author.Author#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The last name of the author.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.eclipse.papyrus.model2doc.core.author.AuthorPackage#getAuthor_LastName()
	 * @model ordered="false"
	 * @generated
	 */
	@Override
	String getLastName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.author.Author#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

} // Author
