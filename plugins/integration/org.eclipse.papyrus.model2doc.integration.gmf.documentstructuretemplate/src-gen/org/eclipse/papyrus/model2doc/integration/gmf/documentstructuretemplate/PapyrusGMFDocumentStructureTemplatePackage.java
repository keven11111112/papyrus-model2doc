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
package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplateFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PapyrusGMFDocumentStructureTemplate'"
 * @generated
 */
public interface PapyrusGMFDocumentStructureTemplatePackage extends EPackage {
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
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/gmf/integration/1.0.0/documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	PapyrusGMFDocumentStructureTemplatePackage eINSTANCE = org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDocumentStructureTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl <em>Papyrus GMF Diagram View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDocumentStructureTemplatePackageImpl#getPapyrusGMFDiagramView()
	 * @generated
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_TITLE = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW__CUSTOM_TITLE = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generate Branch Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diagram Kind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Diagram Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Context Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW__CONTEXT_FILTER_RULE = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Papyrus GMF Diagram View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW_FEATURE_COUNT = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Branch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW___GENERATE_BRANCH__EOBJECT = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Matching Diagrams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW___GET_MATCHING_DIAGRAMS__EOBJECT = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Papyrus GMF Diagram View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_GMF_DIAGRAM_VIEW_OPERATION_COUNT = DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.Diagram <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.gmf.runtime.notation.Diagram
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDocumentStructureTemplatePackageImpl#getDiagram()
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
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior <em>Context Filter Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDocumentStructureTemplatePackageImpl#getContextFilterBehavior()
	 * @generated
	 */
	int CONTEXT_FILTER_BEHAVIOR = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView <em>Papyrus GMF Diagram View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Papyrus GMF Diagram View</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView
	 * @generated
	 */
	EClass getPapyrusGMFDiagramView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getDiagramKindId <em>Diagram Kind Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Diagram Kind Id</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getDiagramKindId()
	 * @see #getPapyrusGMFDiagramView()
	 * @generated
	 */
	EAttribute getPapyrusGMFDiagramView_DiagramKindId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getDiagramType <em>Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Diagram Type</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getDiagramType()
	 * @see #getPapyrusGMFDiagramView()
	 * @generated
	 */
	EAttribute getPapyrusGMFDiagramView_DiagramType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getContextFilterRule <em>Context Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Context Filter Rule</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getContextFilterRule()
	 * @see #getPapyrusGMFDiagramView()
	 * @generated
	 */
	EAttribute getPapyrusGMFDiagramView_ContextFilterRule();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getMatchingDiagrams(org.eclipse.emf.ecore.EObject) <em>Get Matching Diagrams</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Matching Diagrams</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getMatchingDiagrams(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPapyrusGMFDiagramView__GetMatchingDiagrams__EObject();

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
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior <em>Context Filter Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Context Filter Behavior</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior
	 * @generated
	 */
	EEnum getContextFilterBehavior();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PapyrusGMFDocumentStructureTemplateFactory getPapyrusGMFDocumentStructureTemplateFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl <em>Papyrus GMF Diagram View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl
		 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDocumentStructureTemplatePackageImpl#getPapyrusGMFDiagramView()
		 * @generated
		 */
		EClass PAPYRUS_GMF_DIAGRAM_VIEW = eINSTANCE.getPapyrusGMFDiagramView();

		/**
		 * The meta object literal for the '<em><b>Diagram Kind Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID = eINSTANCE.getPapyrusGMFDiagramView_DiagramKindId();

		/**
		 * The meta object literal for the '<em><b>Diagram Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE = eINSTANCE.getPapyrusGMFDiagramView_DiagramType();

		/**
		 * The meta object literal for the '<em><b>Context Filter Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PAPYRUS_GMF_DIAGRAM_VIEW__CONTEXT_FILTER_RULE = eINSTANCE.getPapyrusGMFDiagramView_ContextFilterRule();

		/**
		 * The meta object literal for the '<em><b>Get Matching Diagrams</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation PAPYRUS_GMF_DIAGRAM_VIEW___GET_MATCHING_DIAGRAMS__EOBJECT = eINSTANCE.getPapyrusGMFDiagramView__GetMatchingDiagrams__EObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.runtime.notation.Diagram <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.gmf.runtime.notation.Diagram
		 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDocumentStructureTemplatePackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior <em>Context Filter Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior
		 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDocumentStructureTemplatePackageImpl#getContextFilterBehavior()
		 * @generated
		 */
		EEnum CONTEXT_FILTER_BEHAVIOR = eINSTANCE.getContextFilterBehavior();

	}

} // PapyrusGMFDocumentStructureTemplatePackage
