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
 * A representation of the model object '<em><b>Body Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getBodyPart()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BodyPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(DataSource)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getBodyPart_DataSource()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

} // BodyPart
