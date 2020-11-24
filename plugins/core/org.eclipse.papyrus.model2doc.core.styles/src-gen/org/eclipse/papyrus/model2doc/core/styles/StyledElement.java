/**
 * Copyright (c) 2020 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.core.styles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Styled Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.styles.StyledElement#getNamedStyles <em>Named Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.core.styles.StylesPackage#getStyledElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StyledElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Named Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.model2doc.core.styles.NamedStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Styles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Named Styles</em>' containment reference list.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StylesPackage#getStyledElement_NamedStyles()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NamedStyle> getNamedStyles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method return the NamedStyle corresponding to the given name
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	NamedStyle getNamedStyle(String name);

} // StyledElement
