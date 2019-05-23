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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element allows to represents an EAttribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EAttributeTemplate#getEAttribute <em>EAttribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEAttributeTemplate()
 * @model abstract="true"
 * @generated
 */
public interface EAttributeTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>EAttribute</em>' reference.
	 * @see #setEAttribute(EAttribute)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEAttributeTemplate_EAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EAttribute getEAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EAttributeTemplate#getEAttribute <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>EAttribute</em>' reference.
	 * @see #getEAttribute()
	 * @generated
	 */
	void setEAttribute(EAttribute value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations.EAttributeTemplateOperations.buildEAttributeValueLabel(this, value);'"
	 * @generated
	 */
	String buildEAttributeValueLabel(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model ordered="false" contextRequired="true" contextOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations.EAttributeTemplateOperations.getEAttributeValues(this, context);'"
	 * @generated
	 */
	EList<Object> getEAttributeValues(EObject context);

} // EAttributeTemplate
