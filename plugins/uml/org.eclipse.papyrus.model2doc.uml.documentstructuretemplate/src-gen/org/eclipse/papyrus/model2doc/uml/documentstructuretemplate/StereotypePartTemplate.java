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

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Part Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PartTemplate used to navigate in the stereotype application.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePartTemplate()
 * @model
 * @generated
 */
public interface StereotypePartTemplate extends EClassPartTemplate, IStereotypePartTemplate {
	/**
	 * Returns the value of the '<em><b>Stereotype Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualifiedName of the stereotype to find.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Stereotype Qualified Name</em>' attribute.
	 * @see #setStereotypeQualifiedName(String)
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePartTemplate_StereotypeQualifiedName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	@Override
	String getStereotypeQualifiedName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Stereotype Filter Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the way to use to filter the applied stereotype in the inherited method isMatchingFilterRule.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Stereotype Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior
	 * @see #setStereotypeFilterRule(StereotypeFilterBehavior)
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePartTemplate_StereotypeFilterRule()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	@Override
	StereotypeFilterBehavior getStereotypeFilterRule();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}' attribute.
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

} // StereotypePartTemplate
