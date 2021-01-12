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
package org.eclipse.papyrus.model2doc.core.builtintypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Reference Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.builtintypes.FileReferenceCell#getFileReference <em>File Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getFileReferenceCell()
 * @model
 * @generated
 */
public interface FileReferenceCell extends Cell {
	/**
	 * Returns the value of the '<em><b>File Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>File Reference</em>' containment reference.
	 * @see #setFileReference(IFileReference)
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getFileReferenceCell_FileReference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IFileReference getFileReference();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.FileReferenceCell#getFileReference <em>File Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>File Reference</em>' containment reference.
	 * @see #getFileReference()
	 * @generated
	 */
	void setFileReference(IFileReference value);

} // FileReferenceCell
