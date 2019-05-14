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
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference Body Section Part Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AbstractPartTemplate with a EReference field and a method to get the value of a EReference for a given EObject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceBodySectionPartTemplate#getEReference <em>EReference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEReferenceBodySectionPartTemplate()
 * @model abstract="true"
 * @generated
 */
public interface EReferenceBodySectionPartTemplate extends IBodySectionPartTemplate {
	/**
	 * Returns the value of the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A EReference which should be provided by the EClass of the upper level.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>EReference</em>' reference.
	 * @see #setEReference(EReference)
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEReferenceBodySectionPartTemplate_EReference()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyEditorFactory='editor://documentstructuretemplate/EReferenceBodySectionPartTemplate/EReference/'"
	 * @generated
	 */
	EReference getEReference();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceBodySectionPartTemplate#getEReference <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>EReference</em>' reference.
	 * @see #getEReference()
	 * @generated
	 */
	void setEReference(EReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the matching elements referenced by the EReference for the EObject in argument.
	 * <!-- end-model-doc -->
	 *
	 * @model ordered="false" contextRequired="true" contextOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final java.util.List&lt;EObject&gt; elements = new java.util.ArrayList&lt;&gt;();\nfinal EReference eReference = getEReference();\nif (null != eReference) {\n\tif
	 *        (context.eClass().getEAllReferences().contains(eReference)) {\n\t\tif (eReference.isMany()) {\n\t\t\telements.addAll(((java.util.Collection&lt;?&gt;)
	 *        context.eGet(eReference)).stream().filter(EObject.class::isInstance).map(EObject.class::cast).collect(java.util.stream.Collectors.toList()));\n\t\t} else {\n\t\t\telements.add((EObject) context.eGet(eReference));\n\t\t}\n\t}\n}\nreturn
	 *        org.eclipse.emf.common.util.ECollections.unmodifiableEList(elements);'"
	 * @generated
	 */
	EList<EObject> getEReferenceValues(EObject context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the label of the element given as parameter.
	 * The goal of this method is to return a label for each element returned by the method getEReferenceValues()
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider.INSTANCE.getText(context);'"
	 * @generated
	 */
	String buildEReferenceValueLabel(EObject context);

} // EReferenceBodySectionPartTemplate
