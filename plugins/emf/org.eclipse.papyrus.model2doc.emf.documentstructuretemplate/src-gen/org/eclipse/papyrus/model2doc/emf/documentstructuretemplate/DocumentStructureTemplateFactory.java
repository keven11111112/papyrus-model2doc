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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage
 * @generated
 */
public interface DocumentStructureTemplateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	DocumentStructureTemplateFactory eINSTANCE = org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Template Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Document Template Prototype</em>'.
	 * @generated
	 */
	DocumentTemplatePrototype createDocumentTemplatePrototype();

	/**
	 * Returns a new object of class '<em>Text Document Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Text Document Template</em>'.
	 * @generated
	 */
	TextDocumentTemplate createTextDocumentTemplate();

	/**
	 * Returns a new object of class '<em>Table Of Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Table Of Contents</em>'.
	 * @generated
	 */
	TableOfContents createTableOfContents();

	/**
	 * Returns a new object of class '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Body</em>'.
	 * @generated
	 */
	Body createBody();

	/**
	 * Returns a new object of class '<em>EClass Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EClass Part Template</em>'.
	 * @generated
	 */
	EClassPartTemplate createEClassPartTemplate();

	/**
	 * Returns a new object of class '<em>EReference Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EReference Part Template</em>'.
	 * @generated
	 */
	EReferencePartTemplate createEReferencePartTemplate();

	/**
	 * Returns a new object of class '<em>EReference Table View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EReference Table View</em>'.
	 * @generated
	 */
	EReferenceTableView createEReferenceTableView();

	/**
	 * Returns a new object of class '<em>EStructural Feature Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EStructural Feature Column</em>'.
	 * @generated
	 */
	EStructuralFeatureColumn createEStructuralFeatureColumn();

	/**
	 * Returns a new object of class '<em>EReference List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EReference List Item Template</em>'.
	 * @generated
	 */
	EReferenceListItemTemplate createEReferenceListItemTemplate();

	/**
	 * Returns a new object of class '<em>EAttribute List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EAttribute List Item Template</em>'.
	 * @generated
	 */
	EAttributeListItemTemplate createEAttributeListItemTemplate();

	/**
	 * Returns a new object of class '<em>EClass List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EClass List Item Template</em>'.
	 * @generated
	 */
	EClassListItemTemplate createEClassListItemTemplate();

	/**
	 * Returns a new object of class '<em>Tree List View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Tree List View</em>'.
	 * @generated
	 */
	TreeListView createTreeListView();

	/**
	 * Returns a new object of class '<em>Insert File Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Insert File Template</em>'.
	 * @generated
	 */
	InsertFileTemplate createInsertFileTemplate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	DocumentStructureTemplatePackage getDocumentStructureTemplatePackage();

} // DocumentStructureTemplateFactory
