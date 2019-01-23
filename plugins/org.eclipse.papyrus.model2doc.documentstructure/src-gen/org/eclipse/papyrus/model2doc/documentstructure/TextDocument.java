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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.TextDocument#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentStructurePackage#getTextDocument()
 * @model
 * @generated
 */
public interface TextDocument extends Document {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Body)
	 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentStructurePackage#getTextDocument_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentstructure.TextDocument#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

} // TextDocument
