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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage
 * @generated
 */
public interface UMLDocumentStructureTemplateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	UMLDocumentStructureTemplateFactory eINSTANCE = org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Stereotype Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Stereotype Part Template</em>'.
	 * @generated
	 */
	StereotypePartTemplate createStereotypePartTemplate();

	/**
	 * Returns a new object of class '<em>Stereotype Property Reference Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Stereotype Property Reference Part Template</em>'.
	 * @generated
	 */
	StereotypePropertyReferencePartTemplate createStereotypePropertyReferencePartTemplate();

	/**
	 * Returns a new object of class '<em>Comment As Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Comment As Paragraph</em>'.
	 * @generated
	 */
	CommentAsParagraph createCommentAsParagraph();

	/**
	 * Returns a new object of class '<em>Stereotype Property Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Stereotype Property Column</em>'.
	 * @generated
	 */
	StereotypePropertyColumn createStereotypePropertyColumn();

	/**
	 * Returns a new object of class '<em>Stereotype Property Reference Table View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Stereotype Property Reference Table View</em>'.
	 * @generated
	 */
	StereotypePropertyReferenceTableView createStereotypePropertyReferenceTableView();

	/**
	 * Returns a new object of class '<em>Stereotype List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Stereotype List Item Template</em>'.
	 * @generated
	 */
	StereotypeListItemTemplate createStereotypeListItemTemplate();

	/**
	 * Returns a new object of class '<em>Stereotype Property Reference List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Stereotype Property Reference List Item Template</em>'.
	 * @generated
	 */
	StereotypePropertyReferenceListItemTemplate createStereotypePropertyReferenceListItemTemplate();

	/**
	 * Returns a new object of class '<em>Stereotype Property Attribute List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Stereotype Property Attribute List Item Template</em>'.
	 * @generated
	 */
	StereotypePropertyAttributeListItemTemplate createStereotypePropertyAttributeListItemTemplate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	UMLDocumentStructureTemplatePackage getUMLDocumentStructureTemplatePackage();

} // UMLDocumentStructureTemplateFactory
