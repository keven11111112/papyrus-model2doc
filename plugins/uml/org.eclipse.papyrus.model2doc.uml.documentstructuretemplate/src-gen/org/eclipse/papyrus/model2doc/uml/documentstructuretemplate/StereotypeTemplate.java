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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract element used to represent an Optional Stereotype.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypeTemplate()
 * @model abstract="true"
 * @generated
 */
public interface StereotypeTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * The default value is <code>"STEREOTYPE_KIND_OF"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the way to use to filter the applied stereotype. This field is used only when the parent of the element is an EClassPartTemplate, and not a StereotypePartTemplate.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Stereotype Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior
	 * @see #setStereotypeFilterRule(StereotypeFilterBehavior)
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypeTemplate_StereotypeFilterRule()
	 * @model default="STEREOTYPE_KIND_OF" required="true" ordered="false"
	 * @generated
	 */
	StereotypeFilterBehavior getStereotypeFilterRule();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Stereotype Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior
	 * @see #getStereotypeFilterRule()
	 * @generated
	 */
	void setStereotypeFilterRule(StereotypeFilterBehavior value);

	/**
	 * Returns the value of the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualified name of the stereotype. This field is used, only when the parent of the object is an EClassPartTemplate and not a StereotypePartTemplate.
	 * In other case, this field is ignored.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Stereotype Qualified Name</em>' attribute.
	 * @see #setStereotypeQualifiedName(String)
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypeTemplate_StereotypeQualifiedName()
	 * @model ordered="false"
	 * @generated
	 */
	String getStereotypeQualifiedName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Stereotype Qualified Name</em>' attribute.
	 * @see #getStereotypeQualifiedName()
	 * @generated
	 */
	void setStereotypeQualifiedName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the first stereotype application for the element given in parameter. The parameter is EObject to avoid to have to check type before calling the method.
	 * <!-- end-model-doc -->
	 *
	 * @model ordered="false" elementRequired="true" elementOrdered="false"
	 * @generated
	 */
	EObject getFirstMatchingStereotypeApplication(EObject element);

} // StereotypeTemplate
