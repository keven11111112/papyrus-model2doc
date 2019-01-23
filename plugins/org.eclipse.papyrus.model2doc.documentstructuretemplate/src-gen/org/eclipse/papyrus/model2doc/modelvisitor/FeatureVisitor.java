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
package org.eclipse.papyrus.model2doc.modelvisitor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor#getModelVisitor <em>Model Visitor</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.modelvisitor.ModelVisitorPackage#getFeatureVisitor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FeatureVisitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Visitor</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Visitor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Model Visitor</em>' containment reference list.
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.ModelVisitorPackage#getFeatureVisitor_ModelVisitor()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ObjectVisitor> getModelVisitor();

} // FeatureVisitor
