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
package org.eclipse.papyrus.model2doc.documentparttemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Part Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#isGenerate <em>Generate</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#isGenerateTitle <em>Generate Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#getDefaultTitle <em>Default Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#getCustomTitle <em>Custom Title</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplatePackage#getDocumentPartTemplate()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DocumentPartTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Generate</em>' attribute.
	 * @see #setGenerate(boolean)
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplatePackage#getDocumentPartTemplate_Generate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isGenerate();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#isGenerate <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Generate</em>' attribute.
	 * @see #isGenerate()
	 * @generated
	 */
	void setGenerate(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Generate Title</em>' attribute.
	 * @see #setGenerateTitle(boolean)
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplatePackage#getDocumentPartTemplate_GenerateTitle()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isGenerateTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#isGenerateTitle <em>Generate Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Generate Title</em>' attribute.
	 * @see #isGenerateTitle()
	 * @generated
	 */
	void setGenerateTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Default Title</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplatePackage#getDocumentPartTemplate_DefaultTitle()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getDefaultTitle();

	/**
	 * Returns the value of the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Custom Title</em>' attribute.
	 * @see #setCustomTitle(String)
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplatePackage#getDocumentPartTemplate_CustomTitle()
	 * @model ordered="false"
	 * @generated
	 */
	String getCustomTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#getCustomTitle <em>Custom Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Custom Title</em>' attribute.
	 * @see #getCustomTitle()
	 * @generated
	 */
	void setCustomTitle(String value);

} // DocumentPartTemplate
