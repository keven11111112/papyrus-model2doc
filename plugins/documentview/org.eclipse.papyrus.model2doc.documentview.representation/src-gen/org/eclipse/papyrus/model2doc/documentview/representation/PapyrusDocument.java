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
package org.eclipse.papyrus.model2doc.documentview.representation;

import org.eclipse.papyrus.infra.architecture.representation.PapyrusRepresentationKind;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Papyrus
 * Document</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentview.representation.PapyrusDocument#getCreationCommandClass <em>Creation Command Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentview.representation.PapyrusDocument#getDocumentKind <em>Document Kind</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.documentview.representation.RepresentationPackage#getPapyrusDocument()
 * @model
 * @generated
 */
public interface PapyrusDocument extends PapyrusRepresentationKind {
	/**
	 * Returns the value of the '<em><b>Creation Command Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Command Class</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Creation Command Class</em>' attribute.
	 * @see #setCreationCommandClass(Class)
	 * @see org.eclipse.papyrus.model2doc.documentview.representation.RepresentationPackage#getPapyrusDocument_CreationCommandClass()
	 * @model required="true"
	 * @generated
	 */
	Class<?> getCreationCommandClass();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.representation.PapyrusDocument#getCreationCommandClass <em>Creation Command Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Creation Command Class</em>' attribute.
	 * @see #getCreationCommandClass()
	 * @generated
	 */
	void setCreationCommandClass(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Document Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Document Kind</em>' attribute.
	 * @see #setDocumentKind(String)
	 * @see org.eclipse.papyrus.model2doc.documentview.representation.RepresentationPackage#getPapyrusDocument_DocumentKind()
	 * @model required="true"
	 * @generated
	 */
	String getDocumentKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.representation.PapyrusDocument#getDocumentKind <em>Document Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Document Kind</em>' attribute.
	 * @see #getDocumentKind()
	 * @generated
	 */
	void setDocumentKind(String value);

} // PapyrusDocument
