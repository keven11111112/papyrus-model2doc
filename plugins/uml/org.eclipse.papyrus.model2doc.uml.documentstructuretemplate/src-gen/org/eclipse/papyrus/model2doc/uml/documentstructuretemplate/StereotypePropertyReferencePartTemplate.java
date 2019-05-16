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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Property Reference Part Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element is used to represent a stereotype property typed with a reference (EReference in Ecore). So primitives types are not supported here.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePropertyReferencePartTemplate()
 * @model
 * @generated
 */
public interface StereotypePropertyReferencePartTemplate extends StereotypePropertyPart, IComposedBodyPartTemplate, IUMLBodyPartTemplateTitle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns a collection of EObject, referenced by the property of stereotype represented by this element, for the given context.
	 * <!-- end-model-doc -->
	 *
	 * @model ordered="false" contextRequired="true" contextOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final java.util.List&lt;Object&gt; values = getStereotypePropertyValues(context);\nfinal java.util.List&lt;org.eclipse.emf.ecore.EObject&gt; eobjects =
	 *        values.stream()\n\t\t.filter(org.eclipse.emf.ecore.EObject.class::isInstance)\n\t\t.map(org.eclipse.emf.ecore.EObject.class::cast)\n\t\t.collect(java.util.stream.Collectors.toList());\nreturn
	 *        org.eclipse.emf.common.util.ECollections.toEList(eobjects);'"
	 * @generated
	 */
	EList<EObject> getStereotypePropertyReferenceValues(EObject context);

} // StereotypePropertyReferencePartTemplate
