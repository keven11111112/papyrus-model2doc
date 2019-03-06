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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Template Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getIconPath <em>Icon Path</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getDescription <em>Description</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getDocumentTemplate <em>Document Template</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplatePrototype()
 * @model
 * @generated
 */
public interface DocumentTemplatePrototype extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplatePrototype_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Icon Path</em>' attribute.
	 * @see #setIconPath(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplatePrototype_IconPath()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getIconPath();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getIconPath <em>Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Icon Path</em>' attribute.
	 * @see #getIconPath()
	 * @generated
	 */
	void setIconPath(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplatePrototype_Description()
	 * @model ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Document Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Document Template</em>' containment reference.
	 * @see #setDocumentTemplate(DocumentTemplate)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplatePrototype_DocumentTemplate()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DocumentTemplate getDocumentTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype#getDocumentTemplate <em>Document Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Document Template</em>' containment reference.
	 * @see #getDocumentTemplate()
	 * @generated
	 */
	void setDocumentTemplate(DocumentTemplate value);

} // DocumentTemplatePrototype
