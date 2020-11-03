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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.builtintypes.Cell#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getCell()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The default value is <code>"BODY"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location of the cells.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation
	 * @see #setLocation(CellLocation)
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getCell_Location()
	 * @model default="BODY" required="true" ordered="false"
	 * @generated
	 */
	CellLocation getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.Cell#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Location</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(CellLocation value);

} // Cell
