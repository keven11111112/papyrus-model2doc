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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAuthor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This interface allows to represent a document's author with some basic informations
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.model2doc.core.author.AuthorPackage#getIAuthor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IAuthor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the first name of the author.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the last name of the author.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method allows to set the first name of the author.
	 * <!-- end-model-doc -->
	 * @model firstNameRequired="true" firstNameOrdered="false"
	 * @generated
	 */
	void setFirstName(String firstName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method allows to set the last name of the author.
	 * <!-- end-model-doc -->
	 * @model firstNameRequired="true" firstNameOrdered="false"
	 * @generated
	 */
	void setLastName(String firstName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the label to use for the author.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.papyrus.model2doc.core.author.internal.operations.IAuthorsOperations.buildAuthorLabel(this);'"
	 * @generated
	 */
	String buildAuthorLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method allows to build a label for a collection of author.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" authorsMany="true" authorsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.papyrus.model2doc.core.author.internal.operations.IAuthorsOperations.buildMultiAuthorLabel(authors);'"
	 * @generated
	 */
	String buildMultiAuthorLabel(EList<IAuthor> authors);

} // IAuthor
