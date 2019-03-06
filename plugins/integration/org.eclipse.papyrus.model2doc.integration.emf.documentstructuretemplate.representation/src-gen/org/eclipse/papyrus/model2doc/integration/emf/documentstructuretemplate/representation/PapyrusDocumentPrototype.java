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
package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation;

import org.eclipse.papyrus.infra.architecture.representation.PapyrusRepresentationKind;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Papyrus Document Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class allows to reference the DocumentTemplatePrototype to use to create a new DocumentTemplate
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype#getDocumentTemplatePrototype <em>Document Template Prototype</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype#getCreationCommandClass <em>Creation Command Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.RepresentationPackage#getPapyrusDocumentPrototype()
 * @model
 * @generated
 */
public interface PapyrusDocumentPrototype extends PapyrusRepresentationKind {
	/**
	 * Returns the value of the '<em><b>Document Template Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Template Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This feature references the DocumentTemplatePrototype to use to create a new DocumentTemplate
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Document Template Prototype</em>' reference.
	 * @see #setDocumentTemplatePrototype(DocumentTemplatePrototype)
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.RepresentationPackage#getPapyrusDocumentPrototype_DocumentTemplatePrototype()
	 * @model required="true"
	 * @generated
	 */
	DocumentTemplatePrototype getDocumentTemplatePrototype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype#getDocumentTemplatePrototype <em>Document Template Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Document Template Prototype</em>' reference.
	 * @see #getDocumentTemplatePrototype()
	 * @generated
	 */
	void setDocumentTemplatePrototype(DocumentTemplatePrototype value);

	/**
	 * Returns the value of the '<em><b>Creation Command Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This feature allows to define the class to use to create the new document.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Creation Command Class</em>' attribute.
	 * @see #setCreationCommandClass(Class)
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.RepresentationPackage#getPapyrusDocumentPrototype_CreationCommandClass()
	 * @model required="true"
	 * @generated
	 */
	Class<?> getCreationCommandClass();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype#getCreationCommandClass <em>Creation Command Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Creation Command Class</em>' attribute.
	 * @see #getCreationCommandClass()
	 * @generated
	 */
	void setCreationCommandClass(Class<?> value);

} // PapyrusDocumentPrototype
