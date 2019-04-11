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
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This object represents an image inserted in the document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Image#getImagePath <em>Image Path</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Image#getCaption <em>Caption</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getImage()
 * @model
 * @generated
 */
public interface Image extends TextPart {

	/**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path can be in the user workspace in platform:/resource or, somewhere on the user computer, so for windows, it will be in C:/ for example.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getImage_ImagePath()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Image#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The caption of the image.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#getImage_Caption()
	 * @model ordered="false"
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructure.Image#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);
} // Image
