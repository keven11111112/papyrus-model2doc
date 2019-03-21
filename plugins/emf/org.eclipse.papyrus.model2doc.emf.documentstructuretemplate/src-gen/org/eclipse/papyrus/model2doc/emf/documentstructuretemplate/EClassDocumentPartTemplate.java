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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Document Part Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate#getEClass <em>EClass</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate#getFilterRule <em>Filter Rule</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEClassDocumentPartTemplate()
 * @model
 * @generated
 */
public interface EClassDocumentPartTemplate extends ObjectPartTemplate {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEClassDocumentPartTemplate_EClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate#getEClass <em>EClass</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Filter Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior
	 * @see #setFilterRule(EClassFilterBehavior)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEClassDocumentPartTemplate_FilterRule()
	 * @model default="TYPE_OF" required="true" ordered="false"
	 * @generated
	 */
	EClassFilterBehavior getFilterRule();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate#getFilterRule <em>Filter Rule</em>}' attribute.
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

} // EClassDocumentPartTemplate
