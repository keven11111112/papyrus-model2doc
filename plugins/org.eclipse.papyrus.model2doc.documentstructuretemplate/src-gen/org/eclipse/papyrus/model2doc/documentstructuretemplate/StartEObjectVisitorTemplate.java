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
import org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start EObject Visitor Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEObjectVisitorTemplate#getEobject <em>Eobject</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage#getStartEObjectVisitorTemplate()
 * @model
 * @generated
 */
public interface StartEObjectVisitorTemplate extends StartModelVisitor, EObjectDocumentPartTemplate {
	/**
	 * Returns the value of the '<em><b>Eobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The field eobject is [0..1], in order to be get a valid model when we use this model as a registered
	 * prototype and not as a user visitor description.
	 *
	 * The field eobject must reference an object of the user model. In other case the model validation will return an error.
	 *
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Eobject</em>' reference.
	 * @see #setEobject(EObject)
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage#getStartEObjectVisitorTemplate_Eobject()
	 * @model ordered="false"
	 * @generated
	 */
	EObject getEobject();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEObjectVisitorTemplate#getEobject <em>Eobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Eobject</em>' reference.
	 * @see #getEobject()
	 * @generated
	 */
	void setEobject(EObject value);

} // StartEObjectVisitorTemplate
