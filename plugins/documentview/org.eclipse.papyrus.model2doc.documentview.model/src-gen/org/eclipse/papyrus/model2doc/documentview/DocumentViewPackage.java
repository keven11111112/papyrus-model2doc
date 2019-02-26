/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.documentview;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.model2doc.documentview.DocumentViewFactory
 * @model kind="package"
 * @generated
 */
public interface DocumentViewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "documentview"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/documentview/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "documentView"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocumentViewPackage eINSTANCE = org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentViewPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl
	 * @see org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentViewPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Document Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_KIND = 1;

	/**
	 * The feature id for the '<em><b>Document Representation Kind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_REPRESENTATION_KIND_ID = 2;

	/**
	 * The feature id for the '<em><b>DOI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOI = 3;

	/**
	 * The feature id for the '<em><b>Template Style File URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TEMPLATE_STYLE_FILE_URI = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNER = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Generated Document File URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__GENERATED_DOCUMENT_FILE_URI = 8;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentview.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentview.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentview.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentview.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentview.Document#getDocumentKind <em>Document Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Kind</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentview.Document#getDocumentKind()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DocumentKind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentview.Document#getDocumentRepresentationKindId <em>Document Representation Kind Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Representation Kind Id</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentview.Document#getDocumentRepresentationKindId()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DocumentRepresentationKindId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentview.Document#getDOI <em>DOI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DOI</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentview.Document#getDOI()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DOI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentview.Document#getTemplateStyleFileURI <em>Template Style File URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Style File URI</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentview.Document#getTemplateStyleFileURI()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_TemplateStyleFileURI();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.documentview.Document#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentview.Document#getOwner()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Owner();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.documentview.Document#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentview.Document#getContext()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentview.Document#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentview.Document#getDescription()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentview.Document#getGeneratedDocumentFileURI <em>Generated Document File URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Document File URI</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentview.Document#getGeneratedDocumentFileURI()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_GeneratedDocumentFileURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocumentViewFactory getDocumentViewFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl
		 * @see org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentViewPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Document Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCUMENT_KIND = eINSTANCE.getDocument_DocumentKind();

		/**
		 * The meta object literal for the '<em><b>Document Representation Kind Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCUMENT_REPRESENTATION_KIND_ID = eINSTANCE.getDocument_DocumentRepresentationKindId();

		/**
		 * The meta object literal for the '<em><b>DOI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOI = eINSTANCE.getDocument_DOI();

		/**
		 * The meta object literal for the '<em><b>Template Style File URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__TEMPLATE_STYLE_FILE_URI = eINSTANCE.getDocument_TemplateStyleFileURI();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__OWNER = eINSTANCE.getDocument_Owner();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__CONTEXT = eINSTANCE.getDocument_Context();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DESCRIPTION = eINSTANCE.getDocument_Description();

		/**
		 * The meta object literal for the '<em><b>Generated Document File URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__GENERATED_DOCUMENT_FILE_URI = eINSTANCE.getDocument_GeneratedDocumentFileURI();

	}

} //DocumentViewPackage
