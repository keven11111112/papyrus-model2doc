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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Document Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate#getMainTitle <em>Main Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate#getDocumentParts <em>Document Part</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getTextDocumentTemplate()
 * @model
 * @generated
 */
public interface TextDocumentTemplate extends DocumentTemplate {
	/**
	 * Returns the value of the '<em><b>Main Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Main Title</em>' attribute.
	 * @see #setMainTitle(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getTextDocumentTemplate_MainTitle()
	 * @model ordered="false"
	 * @generated
	 */
	String getMainTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate#getMainTitle <em>Main Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Main Title</em>' attribute.
	 * @see #getMainTitle()
	 * @generated
	 */
	void setMainTitle(String value);

	/**
	 * Returns the value of the '<em><b>Document Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Document Part</em>' containment reference list.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getTextDocumentTemplate_DocumentPart()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DocumentPart> getDocumentParts();

} // TextDocumentTemplate
