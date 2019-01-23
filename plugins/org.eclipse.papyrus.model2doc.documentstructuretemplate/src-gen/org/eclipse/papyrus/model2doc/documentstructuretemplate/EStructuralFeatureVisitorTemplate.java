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
package org.eclipse.papyrus.model2doc.documentstructuretemplate;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructural Feature Visitor Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureVisitorTemplate#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage#getEStructuralFeatureVisitorTemplate()
 * @model
 * @generated
 */
public interface EStructuralFeatureVisitorTemplate extends FeatureVisitor, EStructuralFeatureDocumentPartTemplate {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage#getEStructuralFeatureVisitorTemplate_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureVisitorTemplate#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

} // EStructuralFeatureVisitorTemplate
