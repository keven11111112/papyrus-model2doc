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
package org.eclipse.papyrus.model2doc.emf.documentstructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.model2doc.core.author.IAuthor;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getDocumentGeneratorConfiguration <em>Document Generator Configuration</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getAuthors <em>Author</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getDocument()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Generator Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Generator Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Document Generator Configuration</em>' containment reference.
	 * @see #setDocumentGeneratorConfiguration(IDocumentGeneratorConfiguration)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getDocument_DocumentGeneratorConfiguration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IDocumentGeneratorConfiguration getDocumentGeneratorConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getDocumentGeneratorConfiguration <em>Document Generator Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Document Generator Configuration</em>' containment reference.
	 * @see #getDocumentGeneratorConfiguration()
	 * @generated
	 */
	void setDocumentGeneratorConfiguration(IDocumentGeneratorConfiguration value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.model2doc.core.author.IAuthor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getDocument_Author()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<IAuthor> getAuthors();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Version)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getDocument_Version()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

} // Document
