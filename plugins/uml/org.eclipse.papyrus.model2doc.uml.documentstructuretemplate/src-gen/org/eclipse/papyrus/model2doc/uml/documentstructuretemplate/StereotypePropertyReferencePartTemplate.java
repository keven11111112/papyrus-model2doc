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
 * PartTemplate used to navigate in the stereotype property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getPropertyName <em>Property Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePropertyReferencePartTemplate()
 * @model
 * @generated
 */
public interface StereotypePropertyReferencePartTemplate extends IComposedBodyPartTemplate, IStereotypePartTemplate {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the stereotype property.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePropertyReferencePartTemplate_PropertyName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getPropertyName <em>Property Name</em>}' attribute.
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
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePropertyReferencePartTemplate_StereotypeQualifiedName()
	 * @model ordered="false"
	 * @generated
	 */
	@Override
	String getStereotypeQualifiedName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getStereotypeQualifiedName <em>Stereotype Qualified Name</em>}' attribute.
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
	 * Description of the way to use to filter the applied stereotype. This field is used only when the parent of the element is an EClassPartTemplate, and not a StereotypePartTemplate.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Stereotype Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeFilterBehavior
	 * @see #setStereotypeFilterRule(StereotypeFilterBehavior)
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePropertyReferencePartTemplate_StereotypeFilterRule()
	 * @model ordered="false"
	 * @generated
	 */
	@Override
	StereotypeFilterBehavior getStereotypeFilterRule();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate#getStereotypeFilterRule <em>Stereotype Filter Rule</em>}' attribute.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the object referenced by the property for the given eobject in paramater.
	 * <!-- end-model-doc -->
	 *
	 * @model ordered="false" eobjectRequired="true" eobjectOrdered="false"
	 * @generated
	 */
	EList<EObject> getMatchingReferencedEObjects(EObject eobject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String buildTitle();

} // StereotypePropertyReferencePartTemplate
