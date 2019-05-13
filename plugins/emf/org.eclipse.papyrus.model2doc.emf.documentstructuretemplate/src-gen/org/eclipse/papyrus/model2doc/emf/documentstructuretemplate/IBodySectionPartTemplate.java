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
 * A representation of the model object '<em><b>IBody Section Part Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#isGenerate <em>Generate</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#isGenerateTitle <em>Generate Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#getCustomTitle <em>Custom Title</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getIBodySectionPartTemplate()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBodySectionPartTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Generate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, we will generate something for this body part.
	 * If false, we will use the object to cross the user model, but we will generate nothing to this body part.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Generate</em>' attribute.
	 * @see #setGenerate(boolean)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getIBodySectionPartTemplate_Generate()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isGenerate();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#isGenerate <em>Generate</em>}' attribute.
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
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, we will generate a main title here, before to traverse the document model.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Generate Title</em>' attribute.
	 * @see #setGenerateTitle(boolean)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getIBodySectionPartTemplate_GenerateTitle()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isGenerateTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#isGenerateTitle <em>Generate Title</em>}' attribute.
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
	 * Returns the value of the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title to use for this section instead using the calculated one.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Custom Title</em>' attribute.
	 * @see #setCustomTitle(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getIBodySectionPartTemplate_CustomTitle()
	 * @model ordered="false"
	 * @generated
	 */
	String getCustomTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate#getCustomTitle <em>Custom Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Custom Title</em>' attribute.
	 * @see #getCustomTitle()
	 * @generated
	 */
	void setCustomTitle(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates the title.
	 * In the general case, the ISubBodyPartTemplate uses the context element to build the title, wheareas the IBodyPartTemplate don't use it.
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false"
	 * @generated
	 */
	String buildPartTemplateTitle(EObject context);

} // IBodySectionPartTemplate
