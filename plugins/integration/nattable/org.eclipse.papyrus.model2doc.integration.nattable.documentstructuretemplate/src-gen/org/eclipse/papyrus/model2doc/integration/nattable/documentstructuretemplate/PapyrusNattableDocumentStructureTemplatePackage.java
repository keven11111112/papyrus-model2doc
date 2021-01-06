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
package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate;

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
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplateFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PapyrusNattableDocumentStructureTemplate'"
 * @generated
 */
public interface PapyrusNattableDocumentStructureTemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/nattable/integration/1.0.0/documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PapyrusNattableDocumentStructureTemplatePackage eINSTANCE = org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl <em>Papyrus Table View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplatePackageImpl#getPapyrusTableView()
	 * @generated
	 */
	int PAPYRUS_TABLE_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW__GENERATE = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW__GENERATE_TITLE = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW__CUSTOM_TITLE = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Generate Branch Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW__GENERATE_BRANCH_CONDITION = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE__GENERATE_BRANCH_CONDITION;

	/**
	 * The feature id for the '<em><b>Generate If Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW__GENERATE_IF_EMPTY = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE__GENERATE_IF_EMPTY;

	/**
	 * The feature id for the '<em><b>Default Text If Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW__DEFAULT_TEXT_IF_EMPTY = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE__DEFAULT_TEXT_IF_EMPTY;

	/**
	 * The feature id for the '<em><b>Table Kind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW__TABLE_KIND_ID = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW__TABLE_TYPE = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context Filter Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW__CONTEXT_FILTER_RULE = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW__IMPORT_METHOD = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Papyrus Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW_FEATURE_COUNT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT;

	/**
	 * The operation id for the '<em>Generate Branch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW___GENERATE_BRANCH__EOBJECT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE___GENERATE_BRANCH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Matching Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW___GET_MATCHING_TABLES__EOBJECT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Part Template Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT_1 = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Papyrus Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_TABLE_VIEW_OPERATION_COUNT = DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.Table <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.Table
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplatePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior <em>Context Filter Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplatePackageImpl#getContextFilterBehavior()
	 * @generated
	 */
	int CONTEXT_FILTER_BEHAVIOR = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod <em>Import Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplatePackageImpl#getImportMethod()
	 * @generated
	 */
	int IMPORT_METHOD = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView <em>Papyrus Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Papyrus Table View</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView
	 * @generated
	 */
	EClass getPapyrusTableView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getTableKindId <em>Table Kind Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Kind Id</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getTableKindId()
	 * @see #getPapyrusTableView()
	 * @generated
	 */
	EAttribute getPapyrusTableView_TableKindId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getTableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Type</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getTableType()
	 * @see #getPapyrusTableView()
	 * @generated
	 */
	EAttribute getPapyrusTableView_TableType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getContextFilterRule <em>Context Filter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Filter Rule</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getContextFilterRule()
	 * @see #getPapyrusTableView()
	 * @generated
	 */
	EAttribute getPapyrusTableView_ContextFilterRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getImportMethod <em>Import Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Method</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getImportMethod()
	 * @see #getPapyrusTableView()
	 * @generated
	 */
	EAttribute getPapyrusTableView_ImportMethod();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getMatchingTables(org.eclipse.emf.ecore.EObject) <em>Get Matching Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Matching Tables</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getMatchingTables(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPapyrusTableView__GetMatchingTables__EObject();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#buildPartTemplateTitle(org.eclipse.emf.ecore.EObject) <em>Build Part Template Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Part Template Title</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#buildPartTemplateTitle(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPapyrusTableView__BuildPartTemplateTitle__EObject_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.Table
	 * @model instanceClass="org.eclipse.papyrus.infra.nattable.model.nattable.Table"
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior <em>Context Filter Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Filter Behavior</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior
	 * @generated
	 */
	EEnum getContextFilterBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod <em>Import Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Import Method</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod
	 * @generated
	 */
	EEnum getImportMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PapyrusNattableDocumentStructureTemplateFactory getPapyrusNattableDocumentStructureTemplateFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl <em>Papyrus Table View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl
		 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplatePackageImpl#getPapyrusTableView()
		 * @generated
		 */
		EClass PAPYRUS_TABLE_VIEW = eINSTANCE.getPapyrusTableView();

		/**
		 * The meta object literal for the '<em><b>Table Kind Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPYRUS_TABLE_VIEW__TABLE_KIND_ID = eINSTANCE.getPapyrusTableView_TableKindId();

		/**
		 * The meta object literal for the '<em><b>Table Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPYRUS_TABLE_VIEW__TABLE_TYPE = eINSTANCE.getPapyrusTableView_TableType();

		/**
		 * The meta object literal for the '<em><b>Context Filter Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPYRUS_TABLE_VIEW__CONTEXT_FILTER_RULE = eINSTANCE.getPapyrusTableView_ContextFilterRule();

		/**
		 * The meta object literal for the '<em><b>Import Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPYRUS_TABLE_VIEW__IMPORT_METHOD = eINSTANCE.getPapyrusTableView_ImportMethod();

		/**
		 * The meta object literal for the '<em><b>Get Matching Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAPYRUS_TABLE_VIEW___GET_MATCHING_TABLES__EOBJECT = eINSTANCE.getPapyrusTableView__GetMatchingTables__EObject();

		/**
		 * The meta object literal for the '<em><b>Build Part Template Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAPYRUS_TABLE_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT_1 = eINSTANCE.getPapyrusTableView__BuildPartTemplateTitle__EObject_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.Table <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.Table
		 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplatePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior <em>Context Filter Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior
		 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplatePackageImpl#getContextFilterBehavior()
		 * @generated
		 */
		EEnum CONTEXT_FILTER_BEHAVIOR = eINSTANCE.getContextFilterBehavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod <em>Import Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod
		 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplatePackageImpl#getImportMethod()
		 * @generated
		 */
		EEnum IMPORT_METHOD = eINSTANCE.getImportMethod();

	}

} //PapyrusNattableDocumentStructureTemplatePackage
