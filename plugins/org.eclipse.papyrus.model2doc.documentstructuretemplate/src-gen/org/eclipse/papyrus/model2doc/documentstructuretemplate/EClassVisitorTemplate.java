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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Visitor Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EClassVisitorTemplate#getEclass <em>Eclass</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage#getEClassVisitorTemplate()
 * @model
 * @generated
 */
public interface EClassVisitorTemplate extends ObjectVisitor, EClassDocumentPartTemplate {
	/**
	 * Returns the value of the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Eclass</em>' reference.
	 * @see #setEclass(EClass)
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage#getEClassVisitorTemplate_Eclass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EClass getEclass();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EClassVisitorTemplate#getEclass <em>Eclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Eclass</em>' reference.
	 * @see #getEclass()
	 * @generated
	 */
	void setEclass(EClass value);

} // EClassVisitorTemplate
