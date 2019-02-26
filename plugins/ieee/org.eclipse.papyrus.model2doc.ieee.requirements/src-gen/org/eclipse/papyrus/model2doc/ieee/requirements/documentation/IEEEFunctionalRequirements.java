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
package org.eclipse.papyrus.model2doc.ieee.requirements.documentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEEE Functional Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Functional Requirement Stereotype allowing to define the mode of the Package requirements</p>
 *
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEEFunctionalRequirements#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementsDocumentationPackage#getIEEEFunctionalRequirements()
 * @model
 * @generated
 */
public interface IEEEFunctionalRequirements extends IEEERequirements {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(int)
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementsDocumentationPackage#getIEEEFunctionalRequirements_Mode()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEEFunctionalRequirements#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(int value);

} // IEEEFunctionalRequirements
