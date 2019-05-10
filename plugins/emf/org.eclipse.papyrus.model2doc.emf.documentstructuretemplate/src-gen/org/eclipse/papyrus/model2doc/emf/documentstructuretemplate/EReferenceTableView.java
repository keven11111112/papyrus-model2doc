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

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference Table View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView#getEReference <em>EReference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEReferenceTableView()
 * @model
 * @generated
 */
public interface EReferenceTableView extends ITableView {
	/**
	 * Returns the value of the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A EReference which should be provided by the EClass of the upper level.
	 * This reference will be used to fill the table with its value for the context element.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>EReference</em>' reference.
	 * @see #setEReference(EReference)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEReferenceTableView_EReference()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyEditorFactory='editor://documentstructuretemplate/EReferenceTableView/EReference/'"
	 * @generated
	 */
	EReference getEReference();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView#getEReference <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>EReference</em>' reference.
	 * @see #getEReference()
	 * @generated
	 */
	void setEReference(EReference value);

} // EReferenceTableView
