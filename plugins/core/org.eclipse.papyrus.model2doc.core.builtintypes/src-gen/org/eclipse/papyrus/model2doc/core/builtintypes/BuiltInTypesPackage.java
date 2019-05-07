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
package org.eclipse.papyrus.model2doc.core.builtintypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BuiltInTypes'"
 * @generated
 */
public interface BuiltInTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "builtintypes"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/core/1.0.0/BuiltInTypes"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "builtintypes"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	BuiltInTypesPackage eINSTANCE = org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.AbstractTableImpl <em>Abstract Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.AbstractTableImpl
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getAbstractTable()
	 * @generated
	 */
	int ABSTRACT_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE__CAPTION = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE__ROWS = 1;

	/**
	 * The number of structural features of the '<em>Abstract Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Rows Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE___GET_ROWS_NUMBER = 0;

	/**
	 * The operation id for the '<em>Get Columns Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE___GET_COLUMNS_NUMBER = 1;

	/**
	 * The operation id for the '<em>Get All Cells</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE___GET_ALL_CELLS = 2;

	/**
	 * The number of operations of the '<em>Abstract Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.Row <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.Row
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 1;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ROW__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.Cell <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.Cell
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CELL__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.BasicTableImpl <em>Basic Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BasicTableImpl
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getBasicTable()
	 * @generated
	 */
	int BASIC_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BASIC_TABLE__CAPTION = ABSTRACT_TABLE__CAPTION;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BASIC_TABLE__ROWS = ABSTRACT_TABLE__ROWS;

	/**
	 * The number of structural features of the '<em>Basic Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BASIC_TABLE_FEATURE_COUNT = ABSTRACT_TABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Rows Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BASIC_TABLE___GET_ROWS_NUMBER = ABSTRACT_TABLE___GET_ROWS_NUMBER;

	/**
	 * The operation id for the '<em>Get Columns Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BASIC_TABLE___GET_COLUMNS_NUMBER = ABSTRACT_TABLE___GET_COLUMNS_NUMBER;

	/**
	 * The operation id for the '<em>Get All Cells</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BASIC_TABLE___GET_ALL_CELLS = ABSTRACT_TABLE___GET_ALL_CELLS;

	/**
	 * The number of operations of the '<em>Basic Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BASIC_TABLE_OPERATION_COUNT = ABSTRACT_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.BasicRowImpl <em>Basic Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BasicRowImpl
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getBasicRow()
	 * @generated
	 */
	int BASIC_ROW = 4;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BASIC_ROW__CELLS = ROW__CELLS;

	/**
	 * The number of structural features of the '<em>Basic Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BASIC_ROW_FEATURE_COUNT = ROW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BASIC_ROW_OPERATION_COUNT = ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.TextCellImpl <em>Text Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.TextCellImpl
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getTextCell()
	 * @generated
	 */
	int TEXT_CELL = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_CELL__LOCATION = CELL__LOCATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_CELL__TEXT = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation <em>Cell Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getCellLocation()
	 * @generated
	 */
	int CELL_LOCATION = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable <em>Abstract Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Abstract Table</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable
	 * @generated
	 */
	EClass getAbstractTable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getCaption()
	 * @see #getAbstractTable()
	 * @generated
	 */
	EAttribute getAbstractTable_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getRows()
	 * @see #getAbstractTable()
	 * @generated
	 */
	EReference getAbstractTable_Rows();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getRowsNumber() <em>Get Rows Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Rows Number</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getRowsNumber()
	 * @generated
	 */
	EOperation getAbstractTable__GetRowsNumber();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getColumnsNumber() <em>Get Columns Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Columns Number</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getColumnsNumber()
	 * @generated
	 */
	EOperation getAbstractTable__GetColumnsNumber();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getAllCells() <em>Get All Cells</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get All Cells</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable#getAllCells()
	 * @generated
	 */
	EOperation getAbstractTable__GetAllCells();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.builtintypes.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Row</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.core.builtintypes.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.Row#getCells()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Cells();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.builtintypes.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.builtintypes.Cell#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.Cell#getLocation()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Location();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.builtintypes.BasicTable <em>Basic Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Basic Table</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BasicTable
	 * @generated
	 */
	EClass getBasicTable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.builtintypes.BasicRow <em>Basic Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Basic Row</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BasicRow
	 * @generated
	 */
	EClass getBasicRow();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.builtintypes.TextCell <em>Text Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Text Cell</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.TextCell
	 * @generated
	 */
	EClass getTextCell();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.builtintypes.TextCell#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.TextCell#getText()
	 * @see #getTextCell()
	 * @generated
	 */
	EAttribute getTextCell_Text();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation <em>Cell Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Cell Location</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation
	 * @generated
	 */
	EEnum getCellLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuiltInTypesFactory getBuiltInTypesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.AbstractTableImpl <em>Abstract Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.AbstractTableImpl
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getAbstractTable()
		 * @generated
		 */
		EClass ABSTRACT_TABLE = eINSTANCE.getAbstractTable();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ABSTRACT_TABLE__CAPTION = eINSTANCE.getAbstractTable_Caption();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ABSTRACT_TABLE__ROWS = eINSTANCE.getAbstractTable_Rows();

		/**
		 * The meta object literal for the '<em><b>Get Rows Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation ABSTRACT_TABLE___GET_ROWS_NUMBER = eINSTANCE.getAbstractTable__GetRowsNumber();

		/**
		 * The meta object literal for the '<em><b>Get Columns Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation ABSTRACT_TABLE___GET_COLUMNS_NUMBER = eINSTANCE.getAbstractTable__GetColumnsNumber();

		/**
		 * The meta object literal for the '<em><b>Get All Cells</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation ABSTRACT_TABLE___GET_ALL_CELLS = eINSTANCE.getAbstractTable__GetAllCells();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.Row <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.Row
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ROW__CELLS = eINSTANCE.getRow_Cells();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.Cell <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.Cell
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CELL__LOCATION = eINSTANCE.getCell_Location();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.BasicTableImpl <em>Basic Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BasicTableImpl
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getBasicTable()
		 * @generated
		 */
		EClass BASIC_TABLE = eINSTANCE.getBasicTable();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.BasicRowImpl <em>Basic Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BasicRowImpl
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getBasicRow()
		 * @generated
		 */
		EClass BASIC_ROW = eINSTANCE.getBasicRow();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.TextCellImpl <em>Text Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.TextCellImpl
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getTextCell()
		 * @generated
		 */
		EClass TEXT_CELL = eINSTANCE.getTextCell();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TEXT_CELL__TEXT = eINSTANCE.getTextCell_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation <em>Cell Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation
		 * @see org.eclipse.papyrus.model2doc.core.builtintypes.impl.BuiltInTypesPackageImpl#getCellLocation()
		 * @generated
		 */
		EEnum CELL_LOCATION = eINSTANCE.getCellLocation();

	}

} // BuiltInTypesPackage
