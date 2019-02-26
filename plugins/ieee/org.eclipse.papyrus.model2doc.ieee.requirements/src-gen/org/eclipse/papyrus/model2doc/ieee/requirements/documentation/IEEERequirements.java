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
 * A representation of the model object '<em><b>IEEE Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stereotype to apply on Package. It will allows to document user's model according to the IEEE specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirements#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementsDocumentationPackage#getIEEERequirements()
 * @model
 * @generated
 */
public interface IEEERequirements extends AbstractRequirements {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementCategory
	 * @see #setCategory(IEEERequirementCategory)
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementsDocumentationPackage#getIEEERequirements_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IEEERequirementCategory getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirements#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(IEEERequirementCategory value);

} // IEEERequirements
