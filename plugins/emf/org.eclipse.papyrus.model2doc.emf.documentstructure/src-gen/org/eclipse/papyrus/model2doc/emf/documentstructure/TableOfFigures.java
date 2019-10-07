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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Of Figures</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element represents a Table Of Figures in the final document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfFigures#getTofTitle <em>Tof Title</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getTableOfFigures()
 * @model
 * @generated
 */
public interface TableOfFigures extends TextDocumentPart {
	/**
	 * Returns the value of the '<em><b>Tof Title</b></em>' attribute.
	 * The default value is <code>"Table Of Figures"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title to use for the created Table of Figures.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Tof Title</em>' attribute.
	 * @see #setTofTitle(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getTableOfFigures_TofTitle()
	 * @model default="Table Of Figures" required="true" ordered="false"
	 * @generated
	 */
	String getTofTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfFigures#getTofTitle <em>Tof Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Tof Title</em>' attribute.
	 * @see #getTofTitle()
	 * @generated
	 */
	void setTofTitle(String value);

} // TableOfFigures
