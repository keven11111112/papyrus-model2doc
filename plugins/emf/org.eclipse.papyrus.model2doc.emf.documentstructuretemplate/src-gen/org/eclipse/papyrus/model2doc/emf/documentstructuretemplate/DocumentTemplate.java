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
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getGraphicalContext <em>Graphical Context</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getIconPath <em>Icon Path</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDocumentTemplatePrototype <em>Document Template Prototype</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDescription <em>Description</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getKindId <em>Kind Id</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * Reference to the element of the documented model from which the generated documentation will start.
	 * <!-- end-model-doc -->
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
	 * Returns the value of the '<em><b>Graphical Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphical Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference the element under which the DocumentTemplate will be displayed in a TreeViewer (for example).
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Graphical Context</em>' reference.
	 * @see #setGraphicalContext(EObject)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate_GraphicalContext()
	 * @model ordered="false"
	 * @generated
	 */
	EObject getGraphicalContext();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getGraphicalContext <em>Graphical Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Graphical Context</em>' reference.
	 * @see #getGraphicalContext()
	 * @generated
	 */
	void setGraphicalContext(EObject value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Field derived from the type defined in the referenced DocumentTemplatePrototype.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate_Type()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Field derived from the iconPath defined in the referenced DocumentTemplatePrototype.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Icon Path</em>' attribute.
	 * @see #setIconPath(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate_IconPath()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getIconPath();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getIconPath <em>Icon Path</em>}' attribute.
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
	 * Returns the value of the '<em><b>Document Template Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Template Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference the DocumentTemplatePrototype used to initialize this DocumentTemplate.
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the document. This name will be used as label in widget displaying the DocumentTemplate.
	 * This field won't be used in the generated document.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the DocumentTemplate.
	 * This field is here for documentation of the DocumentStructureModel, but won't be used in the generated document.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate_Description()
	 * @model ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getDescription <em>Description</em>}' attribute.
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
	 * Returns the value of the '<em><b>Kind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field will allow a better integration with the Papyrus Architecture Framework.
	 * The value will be something like "org.eclipse.papyrus.uml.genericdocumenttemplate".
	 * This field will be used to find the ViewPrototype of an instance of DocumentTemplate.
	 * This field is useless for usage outside of Papyrus, but we set its multiplicity to [1] to avoid possible mistake in Papyrus usages.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Kind Id</em>' attribute.
	 * @see #setKindId(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getDocumentTemplate_KindId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getKindId();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate#getKindId <em>Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Kind Id</em>' attribute.
	 * @see #getKindId()
	 * @generated
	 */
	void setKindId(String value);
} // DocumentTemplate
