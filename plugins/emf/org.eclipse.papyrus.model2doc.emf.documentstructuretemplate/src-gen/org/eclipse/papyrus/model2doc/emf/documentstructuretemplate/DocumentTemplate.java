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
 * A representation of the model object '<em><b>Document Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getSemanticContext <em>Semantic Context</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getGraphicalContent <em>Graphical Content</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDocumentTemplatePrototype <em>Document Template Prototype</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DocumentTemplate extends EObject {

	/**
	 * Returns the value of the '<em><b>Semantic Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Semantic Context</em>' reference.
	 * @see #setSemanticContext(EObject)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate_SemanticContext()
	 * @model ordered="false"
	 * @generated
	 */
	EObject getSemanticContext();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getSemanticContext <em>Semantic Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Semantic Context</em>' reference.
	 * @see #getSemanticContext()
	 * @generated
	 */
	void setSemanticContext(EObject value);

	/**
	 * Returns the value of the '<em><b>Graphical Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphical Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Graphical Content</em>' reference.
	 * @see #setGraphicalContent(EObject)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate_GraphicalContent()
	 * @model ordered="false"
	 * @generated
	 */
	EObject getGraphicalContent();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getGraphicalContent <em>Graphical Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Graphical Content</em>' reference.
	 * @see #getGraphicalContent()
	 * @generated
	 */
	void setGraphicalContent(EObject value);

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
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate_Type()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Document Template Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Template Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Document Template Prototype</em>' reference.
	 * @see #setDocumentTemplatePrototype(DocumentTemplatePrototype)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate_DocumentTemplatePrototype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DocumentTemplatePrototype getDocumentTemplatePrototype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDocumentTemplatePrototype <em>Document Template Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Document Template Prototype</em>' reference.
	 * @see #getDocumentTemplatePrototype()
	 * @generated
	 */
	void setDocumentTemplatePrototype(DocumentTemplatePrototype value);
} // DocumentTemplate
