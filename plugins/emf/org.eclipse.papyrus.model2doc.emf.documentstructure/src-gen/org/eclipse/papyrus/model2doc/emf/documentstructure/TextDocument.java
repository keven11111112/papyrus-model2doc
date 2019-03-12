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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument#getTextDocumentPart <em>Text Document Part</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument#getTocTitle <em>Toc Title</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getTextDocument()
 * @model
 * @generated
 */
public interface TextDocument extends Document {
	/**
	 * Returns the value of the '<em><b>Text Document Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Document Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Text Document Part</em>' containment reference list.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getTextDocument_TextDocumentPart()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TextDocumentPart> getTextDocumentPart();

	/**
	 * Returns the value of the '<em><b>Toc Title</b></em>' attribute.
	 * The default value is <code>"Table Of Contents"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toc Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Toc Title</em>' attribute.
	 * @see #setTocTitle(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getTextDocument_TocTitle()
	 * @model default="Table Of Contents" required="true" ordered="false"
	 * @generated
	 */
	String getTocTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument#getTocTitle <em>Toc Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Toc Title</em>' attribute.
	 * @see #getTocTitle()
	 * @generated
	 */
	void setTocTitle(String value);

} // TextDocument
