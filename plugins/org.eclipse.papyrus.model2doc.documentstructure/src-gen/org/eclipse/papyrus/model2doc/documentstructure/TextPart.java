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
 * A representation of the model object '<em><b>Text Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructure.TextPart#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentStructurePackage#getTextPart()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TextPart extends DocumentPart {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Text)
	 * @see org.eclipse.papyrus.model2doc.documentstructure.DocumentStructurePackage#getTextPart_Text()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentstructure.TextPart#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

} // TextPart
