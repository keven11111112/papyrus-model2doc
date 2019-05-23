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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IList Item Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IListItemTemplate#isGenerateItem <em>Generate Item</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IListItemTemplate#getCustomItemLabel <em>Custom Item Label</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getIListItemTemplate()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IListItemTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Generate Item</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Generate Item</em>' attribute.
	 * @see #setGenerateItem(boolean)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getIListItemTemplate_GenerateItem()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isGenerateItem();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IListItemTemplate#isGenerateItem <em>Generate Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Generate Item</em>' attribute.
	 * @see #isGenerateItem()
	 * @generated
	 */
	void setGenerateItem(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Item Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Item Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Custom Item Label</em>' attribute.
	 * @see #setCustomItemLabel(String)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getIListItemTemplate_CustomItemLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getCustomItemLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IListItemTemplate#getCustomItemLabel <em>Custom Item Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Custom Item Label</em>' attribute.
	 * @see #getCustomItemLabel()
	 * @generated
	 */
	void setCustomItemLabel(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns a label for the item.
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false" itemRequired="true" itemOrdered="false"
	 * @generated
	 */
	String buildItemLabel(Object item);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the items for the list, according to the given context.
	 * <!-- end-model-doc -->
	 *
	 * @model ordered="false" contextRequired="true" contextOrdered="false"
	 * @generated
	 */
	EList<Object> getItems(EObject context);

} // IListItemTemplate
