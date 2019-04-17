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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element represents the body of the future document. Its children describe how to traverse the user model in order to build the final document.
 * Its children are an alternation of two kinds of objects: IBodyPartTemplate and ISubBodyPartTemplate. The IBodyPartTemplate children are ISubBodyPartTemplate, and in turn, the ISubBodyPartTemplate children are IBodyPartTemplate again. This occurs at each
 * level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body#getBodyPartTemplates <em>Body Part Template</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getBody()
 * @model
 * @generated
 */
public interface Body extends DocumentPart {
	/**
	 * Returns the value of the '<em><b>Body Part Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Part Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Body Part Template</em>' containment reference list.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getBody_BodyPartTemplate()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<IBodyPartTemplate> getBodyPartTemplates();

} // Body
