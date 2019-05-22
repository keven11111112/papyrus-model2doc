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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract Template to represent EClasses.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassTemplate#getEClass <em>EClass</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassTemplate#getFilterRule <em>Filter Rule</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEClassTemplate()
 * @model abstract="true"
 * @generated
 */
public interface EClassTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An EClass used to filter EObject.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEClassTemplate_EClass()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyEditorFactory='editor://documentstructuretemplate/EClassTemplate/EClass/'"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassTemplate#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Filter Rule</b></em>' attribute.
	 * The default value is <code>"TYPE_OF"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the way to use to filter EObject in the method isMatchingFilterRule.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior
	 * @see #setFilterRule(EClassFilterBehavior)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEClassTemplate_FilterRule()
	 * @model default="TYPE_OF" required="true" ordered="false"
	 * @generated
	 */
	EClassFilterBehavior getFilterRule();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassTemplate#getFilterRule <em>Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior
	 * @see #getFilterRule()
	 * @generated
	 */
	void setFilterRule(EClassFilterBehavior value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method will return true, when the eClass field is null or if the EObject in argument match the filter behavior and false otherwise.
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false" inputEObjectRequired="true" inputEObjectOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations.EClassTemplateOperations.isMatchingFilterRule(this, inputEObject);'"
	 * @generated
	 */
	boolean isMatchingFilterRule(EObject inputEObject);

} // EClassTemplate
