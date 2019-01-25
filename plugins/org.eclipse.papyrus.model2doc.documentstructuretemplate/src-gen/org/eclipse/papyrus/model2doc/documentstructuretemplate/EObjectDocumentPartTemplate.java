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
package org.eclipse.papyrus.model2doc.documentstructuretemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Document Part Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element allow to define from which specific element of a model, the documentation process must start
 * This element can only be owned by a DocumentTemplate. In other case, we will return a validation error.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EObjectDocumentPartTemplate#getEobject <em>Eobject</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage#getEObjectDocumentPartTemplate()
 * @model
 * @generated
 */
public interface EObjectDocumentPartTemplate extends ObjectPartTemplate {
	/**
	 * Returns the value of the '<em><b>Eobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The field eobject is [0..1], in order to be get a valid model when we use this model as a registered template prototype and not as a final user template
	 * The field eobject must reference an eobject of the user model, in other case the model validation will return an error.
	 *
	 *
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Eobject</em>' reference.
	 * @see #setEobject(EObject)
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage#getEObjectDocumentPartTemplate_Eobject()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EObject getEobject();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EObjectDocumentPartTemplate#getEobject <em>Eobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Eobject</em>' reference.
	 * @see #getEobject()
	 * @generated
	 */
	void setEobject(EObject value);

} // EObjectDocumentPartTemplate
