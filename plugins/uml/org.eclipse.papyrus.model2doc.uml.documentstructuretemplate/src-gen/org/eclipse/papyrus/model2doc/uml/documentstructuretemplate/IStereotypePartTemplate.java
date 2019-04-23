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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IStereotype Part Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This interface has been created to manipulate easily StereotypePartTemplate and StereotypePropertyPartTemplate with a common front end
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getIStereotypePartTemplate()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IStereotypePartTemplate extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the qualified name of the wanted stereotype applicaton.
	 * <!-- end-model-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getStereotypeQualifiedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the first stereotype application for the element given in parameter. The parameter is EObject to avoid to have to check type before calling the method.
	 * <!-- end-model-doc -->
	 *
	 * @model ordered="false" elementRequired="true" elementOrdered="false"
	 * @generated
	 */
	EObject getFirstMatchingStereotypeApplication(EObject element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the filter rule to apply to find the stereotype.
	 * <!-- end-model-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	StereotypeFilterBehavior getStereotypeFilterRule();

} // IStereotypePartTemplate
