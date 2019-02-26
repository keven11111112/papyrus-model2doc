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
package org.eclipse.papyrus.model2doc.documentview;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.Document#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.Document#getDocumentKind <em>Document Kind</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.Document#getDocumentRepresentationKindId <em>Document Representation Kind Id</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.Document#getDOI <em>DOI</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.Document#getTemplateStyleFileURI <em>Template Style File URI</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.Document#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.Document#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.Document#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.Document#getGeneratedDocumentFileURI <em>Generated Document File URI</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage#getDocument_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.Document#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Document Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Kind</em>' attribute.
	 * @see #setDocumentKind(String)
	 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage#getDocument_DocumentKind()
	 * @model required="true"
	 * @generated
	 */
	String getDocumentKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.Document#getDocumentKind <em>Document Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Kind</em>' attribute.
	 * @see #getDocumentKind()
	 * @generated
	 */
	void setDocumentKind(String value);

	/**
	 * Returns the value of the '<em><b>Document Representation Kind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Representation Kind Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Representation Kind Id</em>' attribute.
	 * @see #setDocumentRepresentationKindId(String)
	 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage#getDocument_DocumentRepresentationKindId()
	 * @model required="true"
	 * @generated
	 */
	String getDocumentRepresentationKindId();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.Document#getDocumentRepresentationKindId <em>Document Representation Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Representation Kind Id</em>' attribute.
	 * @see #getDocumentRepresentationKindId()
	 * @generated
	 */
	void setDocumentRepresentationKindId(String value);

	/**
	 * Returns the value of the '<em><b>DOI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DOI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DOI</em>' attribute.
	 * @see #setDOI(String)
	 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage#getDocument_DOI()
	 * @model
	 * @generated
	 */
	String getDOI();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.Document#getDOI <em>DOI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DOI</em>' attribute.
	 * @see #getDOI()
	 * @generated
	 */
	void setDOI(String value);

	/**
	 * Returns the value of the '<em><b>Template Style File URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Style File URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Style File URI</em>' attribute.
	 * @see #setTemplateStyleFileURI(String)
	 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage#getDocument_TemplateStyleFileURI()
	 * @model
	 * @generated
	 */
	String getTemplateStyleFileURI();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.Document#getTemplateStyleFileURI <em>Template Style File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Style File URI</em>' attribute.
	 * @see #getTemplateStyleFileURI()
	 * @generated
	 */
	void setTemplateStyleFileURI(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(EObject)
	 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage#getDocument_Owner()
	 * @model required="true"
	 * @generated
	 */
	EObject getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.Document#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(EObject value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(EObject)
	 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage#getDocument_Context()
	 * @model required="true"
	 * @generated
	 */
	EObject getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.Document#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(EObject value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage#getDocument_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.Document#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Generated Document File URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Document File URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Document File URI</em>' attribute.
	 * @see #setGeneratedDocumentFileURI(String)
	 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage#getDocument_GeneratedDocumentFileURI()
	 * @model required="true"
	 * @generated
	 */
	String getGeneratedDocumentFileURI();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentview.Document#getGeneratedDocumentFileURI <em>Generated Document File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Document File URI</em>' attribute.
	 * @see #getGeneratedDocumentFileURI()
	 * @generated
	 */
	void setGeneratedDocumentFileURI(String value);

} // Document
