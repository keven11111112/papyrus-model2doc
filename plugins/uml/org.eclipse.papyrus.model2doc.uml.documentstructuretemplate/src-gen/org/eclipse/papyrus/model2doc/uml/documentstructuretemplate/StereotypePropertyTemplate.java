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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Property Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract element used to represent a stereotype property
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePropertyTemplate()
 * @model abstract="true"
 * @generated
 */
public interface StereotypePropertyTemplate extends StereotypeTemplate {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the stereotype's property.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePropertyTemplate_PropertyName()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyEditorFactory='editor://umldocumentstructuretemplate/StereotypePropertyTemplate/propertyName/'"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the value of the stereotype property.
	 * <!-- end-model-doc -->
	 *
	 * @model ordered="false" eobjectRequired="true" eobjectOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (null == this.propertyName || this.propertyName.isEmpty()) {\n\treturn org.eclipse.emf.common.util.ECollections.emptyEList();\n}\n\tEObject stereotypeApplication = null;\nif (eobject
	 *        instanceof org.eclipse.uml2.uml.Element) {\n\tstereotypeApplication = getFirstMatchingStereotypeApplication(eobject);\n} else {\n\tstereotypeApplication = eobject;\n}\nif (stereotypeApplication == null) {\n\treturn
	 *        org.eclipse.emf.common.util.ECollections.emptyEList();\n}\nfinal org.eclipse.emf.ecore.EStructuralFeature feature = stereotypeApplication.eClass().getEStructuralFeature(this.propertyName);\nif (null == feature) {\n\treturn
	 *        org.eclipse.emf.common.util.ECollections.emptyEList();\n}\n\nfinal Object featureValue = stereotypeApplication.eGet(feature, true);\nif (null == featureValue) {\n\treturn org.eclipse.emf.common.util.ECollections.emptyEList();\n}\nif
	 *        (feature.isMany()) {\n\treturn org.eclipse.emf.common.util.ECollections.toEList((java.util.Collection&lt;?&gt;) featureValue);\n}\nreturn org.eclipse.emf.common.util.ECollections.singletonEList(featureValue);'"
	 * @generated
	 */
	EList<Object> getStereotypePropertyValues(EObject eobject);

} // StereotypePropertyTemplate
