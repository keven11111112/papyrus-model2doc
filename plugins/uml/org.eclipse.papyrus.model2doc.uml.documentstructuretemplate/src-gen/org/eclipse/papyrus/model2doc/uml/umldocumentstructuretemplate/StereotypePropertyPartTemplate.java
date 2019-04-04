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
package org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Property Part Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PartTemplate used to navigate in the stereotype property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePropertyPartTemplate#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePropertyPartTemplate()
 * @model
 * @generated
 */
public interface StereotypePropertyPartTemplate extends IComposedBodyPartTemplate {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the stereotype property.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePropertyPartTemplate_PropertyName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePropertyPartTemplate#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

} // StereotypePropertyPartTemplate
