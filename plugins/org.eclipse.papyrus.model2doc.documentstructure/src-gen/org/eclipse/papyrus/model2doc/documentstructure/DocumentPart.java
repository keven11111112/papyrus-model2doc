/**
 * Copyright (c) 2018 CEA LIST.
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
package org.eclipse.papyrus.model2doc.documentstructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.DocumentPart#getTextSource <em>Text Source</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.DocumentPart#getSubDocumentPart <em>Sub Document Part</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentStructurePackage#getDocumentPart()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DocumentPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Text Source</em>' containment reference.
	 * @see #setTextSource(TextSource)
	 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentStructurePackage#getDocumentPart_TextSource()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TextSource getTextSource();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentstructure.DocumentPart#getTextSource <em>Text Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Text Source</em>' containment reference.
	 * @see #getTextSource()
	 * @generated
	 */
	void setTextSource(TextSource value);

	/**
	 * Returns the value of the '<em><b>Sub Document Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.model2doc.documentstructure.DocumentPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Document Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Sub Document Part</em>' containment reference list.
	 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentStructurePackage#getDocumentPart_SubDocumentPart()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DocumentPart> getSubDocumentPart();

} // DocumentPart
