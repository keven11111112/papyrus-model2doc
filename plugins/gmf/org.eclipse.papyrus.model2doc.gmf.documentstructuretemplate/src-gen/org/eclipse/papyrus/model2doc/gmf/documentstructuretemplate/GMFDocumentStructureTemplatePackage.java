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
package org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDocumentStructureTemplateFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GMFdocumentstructuretemplate'"
 * @generated
 */
public interface GMFDocumentStructureTemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/gmf/1.0.0/documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "gmfdocumentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	GMFDocumentStructureTemplatePackage eINSTANCE = org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDocumentStructureTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDiagramViewImpl <em>GMF Diagram View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDiagramViewImpl
	 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDocumentStructureTemplatePackageImpl#getGMFDiagramView()
	 * @generated
	 */
	int GMF_DIAGRAM_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GMF_DIAGRAM_VIEW__GENERATE = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GMF_DIAGRAM_VIEW__GENERATE_TITLE = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GMF_DIAGRAM_VIEW__CUSTOM_TITLE = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diagram Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GMF_DIAGRAM_VIEW__DIAGRAM_TYPE = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GMF Diagram View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GMF_DIAGRAM_VIEW_FEATURE_COUNT = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GMF_DIAGRAM_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Matching Diagrams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GMF_DIAGRAM_VIEW___GET_MATCHING_DIAGRAMS__EOBJECT = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>GMF Diagram View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GMF_DIAGRAM_VIEW_OPERATION_COUNT = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.Diagram <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.gmf.runtime.notation.Diagram
	 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDocumentStructureTemplatePackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 1;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView <em>GMF Diagram View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>GMF Diagram View</em>'.
	 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView
	 * @generated
	 */
	EClass getGMFDiagramView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView#getDiagramType <em>Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Diagram Type</em>'.
	 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView#getDiagramType()
	 * @see #getGMFDiagramView()
	 * @generated
	 */
	EAttribute getGMFDiagramView_DiagramType();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView#getMatchingDiagrams(org.eclipse.emf.ecore.EObject) <em>Get Matching Diagrams</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Matching Diagrams</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView#getMatchingDiagrams(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getGMFDiagramView__GetMatchingDiagrams__EObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Diagram
	 * @model instanceClass="org.eclipse.gmf.runtime.notation.Diagram"
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFDocumentStructureTemplateFactory getGMFDocumentStructureTemplateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDiagramViewImpl <em>GMF Diagram View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDiagramViewImpl
		 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDocumentStructureTemplatePackageImpl#getGMFDiagramView()
		 * @generated
		 */
		EClass GMF_DIAGRAM_VIEW = eINSTANCE.getGMFDiagramView();

		/**
		 * The meta object literal for the '<em><b>Diagram Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute GMF_DIAGRAM_VIEW__DIAGRAM_TYPE = eINSTANCE.getGMFDiagramView_DiagramType();

		/**
		 * The meta object literal for the '<em><b>Get Matching Diagrams</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation GMF_DIAGRAM_VIEW___GET_MATCHING_DIAGRAMS__EOBJECT = eINSTANCE.getGMFDiagramView__GetMatchingDiagrams__EObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.runtime.notation.Diagram <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.gmf.runtime.notation.Diagram
		 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDocumentStructureTemplatePackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

	}

} // GMFDocumentStructureTemplatePackage
