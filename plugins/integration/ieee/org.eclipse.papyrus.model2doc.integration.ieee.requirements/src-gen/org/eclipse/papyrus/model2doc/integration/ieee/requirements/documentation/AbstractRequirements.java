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
package org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Abstract Stereotype created to ease future extension</p>
 *
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.AbstractRequirements#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.AbstractRequirements#getReqCategory <em>Req Category</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEERequirementsDocumentationPackage#getAbstractRequirements()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRequirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEERequirementsDocumentationPackage#getAbstractRequirements_Base_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.AbstractRequirements#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Req Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.AbstractRequirementCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Category</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.AbstractRequirementCategory
	 * @see #setReqCategory(AbstractRequirementCategory)
	 * @see org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEERequirementsDocumentationPackage#getAbstractRequirements_ReqCategory()
	 * @model ordered="false"
	 * @generated
	 */
	AbstractRequirementCategory getReqCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.AbstractRequirements#getReqCategory <em>Req Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Category</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.AbstractRequirementCategory
	 * @see #getReqCategory()
	 * @generated
	 */
	void setReqCategory(AbstractRequirementCategory value);

} // AbstractRequirements
