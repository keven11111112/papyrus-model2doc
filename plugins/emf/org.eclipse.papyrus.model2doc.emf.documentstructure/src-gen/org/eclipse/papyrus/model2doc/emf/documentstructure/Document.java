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
package org.eclipse.papyrus.model2doc.emf.documentstructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getCoverPage <em>Cover Page</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getGenerationConfiguration <em>Generation Configuration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getDocument()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Cover Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cover Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Cover Page</em>' containment reference.
	 * @see #setCoverPage(CoverPage)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getDocument_CoverPage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CoverPage getCoverPage();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getCoverPage <em>Cover Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Cover Page</em>' containment reference.
	 * @see #getCoverPage()
	 * @generated
	 */
	void setCoverPage(CoverPage value);

	/**
	 * Returns the value of the '<em><b>Generation Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Generation Configuration</em>' containment reference.
	 * @see #setGenerationConfiguration(GenerationConfiguration)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getDocument_GenerationConfiguration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	GenerationConfiguration getGenerationConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Document#getGenerationConfiguration <em>Generation Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Generation Configuration</em>' containment reference.
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	void setGenerationConfiguration(GenerationConfiguration value);

} // Document