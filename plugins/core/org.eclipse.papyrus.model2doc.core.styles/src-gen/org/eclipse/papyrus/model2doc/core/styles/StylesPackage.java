/**
 * Copyright (c) 2020 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.core.styles;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.papyrus.model2doc.core.styles.StylesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Styles'"
 * @generated
 */
public interface StylesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "styles"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/core/1.0.0/Styles"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "styles"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	StylesPackage eINSTANCE = org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.styles.NamedStyle <em>Named Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.styles.NamedStyle
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getNamedStyle()
	 * @generated
	 */
	int NAMED_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NAMED_STYLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NAMED_STYLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NAMED_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.IntNamedStyleImpl <em>Int Named Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.IntNamedStyleImpl
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getIntNamedStyle()
	 * @generated
	 */
	int INT_NAMED_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_NAMED_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_NAMED_STYLE__VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_NAMED_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_NAMED_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.StringNamedStyleImpl <em>String Named Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StringNamedStyleImpl
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getStringNamedStyle()
	 * @generated
	 */
	int STRING_NAMED_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_NAMED_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_NAMED_STYLE__VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_NAMED_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_NAMED_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.BooleanNamedStyleImpl <em>Boolean Named Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.BooleanNamedStyleImpl
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getBooleanNamedStyle()
	 * @generated
	 */
	int BOOLEAN_NAMED_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NAMED_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NAMED_STYLE__VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NAMED_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_NAMED_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.DoubleNamedStyleImpl <em>Double Named Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.DoubleNamedStyleImpl
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getDoubleNamedStyle()
	 * @generated
	 */
	int DOUBLE_NAMED_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_NAMED_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_NAMED_STYLE__VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_NAMED_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_NAMED_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.IntListNamedStyleImpl <em>Int List Named Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.IntListNamedStyleImpl
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getIntListNamedStyle()
	 * @generated
	 */
	int INT_LIST_NAMED_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_LIST_NAMED_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_LIST_NAMED_STYLE__VALUES = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int List Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_LIST_NAMED_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int List Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_LIST_NAMED_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.StringListNamedStyleImpl <em>String List Named Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StringListNamedStyleImpl
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getStringListNamedStyle()
	 * @generated
	 */
	int STRING_LIST_NAMED_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_NAMED_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_NAMED_STYLE__VALUES = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String List Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_NAMED_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String List Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_NAMED_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.BooleanListNamedStyleImpl <em>Boolean List Named Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.BooleanListNamedStyleImpl
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getBooleanListNamedStyle()
	 * @generated
	 */
	int BOOLEAN_LIST_NAMED_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LIST_NAMED_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LIST_NAMED_STYLE__VALUES = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean List Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LIST_NAMED_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean List Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LIST_NAMED_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.DoubleListNamedStyleImpl <em>Double List Named Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.DoubleListNamedStyleImpl
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getDoubleListNamedStyle()
	 * @generated
	 */
	int DOUBLE_LIST_NAMED_STYLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LIST_NAMED_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LIST_NAMED_STYLE__VALUES = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double List Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LIST_NAMED_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double List Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LIST_NAMED_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.core.styles.StyledElement <em>Styled Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.core.styles.StyledElement
	 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getStyledElement()
	 * @generated
	 */
	int STYLED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Named Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT__NAMED_STYLES = 0;

	/**
	 * The number of structural features of the '<em>Styled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT___GET_NAMED_STYLE__STRING = 0;

	/**
	 * The number of operations of the '<em>Styled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.styles.NamedStyle <em>Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Named Style</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.NamedStyle
	 * @generated
	 */
	EClass getNamedStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.styles.NamedStyle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.NamedStyle#getName()
	 * @see #getNamedStyle()
	 * @generated
	 */
	EAttribute getNamedStyle_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.styles.IntNamedStyle <em>Int Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Int Named Style</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.IntNamedStyle
	 * @generated
	 */
	EClass getIntNamedStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.styles.IntNamedStyle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.IntNamedStyle#getValue()
	 * @see #getIntNamedStyle()
	 * @generated
	 */
	EAttribute getIntNamedStyle_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.styles.StringNamedStyle <em>String Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>String Named Style</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StringNamedStyle
	 * @generated
	 */
	EClass getStringNamedStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.styles.StringNamedStyle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StringNamedStyle#getValue()
	 * @see #getStringNamedStyle()
	 * @generated
	 */
	EAttribute getStringNamedStyle_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.styles.BooleanNamedStyle <em>Boolean Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Boolean Named Style</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.BooleanNamedStyle
	 * @generated
	 */
	EClass getBooleanNamedStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.styles.BooleanNamedStyle#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.BooleanNamedStyle#isValue()
	 * @see #getBooleanNamedStyle()
	 * @generated
	 */
	EAttribute getBooleanNamedStyle_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.styles.DoubleNamedStyle <em>Double Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Double Named Style</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.DoubleNamedStyle
	 * @generated
	 */
	EClass getDoubleNamedStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.core.styles.DoubleNamedStyle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.DoubleNamedStyle#getValue()
	 * @see #getDoubleNamedStyle()
	 * @generated
	 */
	EAttribute getDoubleNamedStyle_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.styles.IntListNamedStyle <em>Int List Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Int List Named Style</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.IntListNamedStyle
	 * @generated
	 */
	EClass getIntListNamedStyle();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.model2doc.core.styles.IntListNamedStyle#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.IntListNamedStyle#getValues()
	 * @see #getIntListNamedStyle()
	 * @generated
	 */
	EAttribute getIntListNamedStyle_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.styles.StringListNamedStyle <em>String List Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>String List Named Style</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StringListNamedStyle
	 * @generated
	 */
	EClass getStringListNamedStyle();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.model2doc.core.styles.StringListNamedStyle#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StringListNamedStyle#getValues()
	 * @see #getStringListNamedStyle()
	 * @generated
	 */
	EAttribute getStringListNamedStyle_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.styles.BooleanListNamedStyle <em>Boolean List Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Boolean List Named Style</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.BooleanListNamedStyle
	 * @generated
	 */
	EClass getBooleanListNamedStyle();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.model2doc.core.styles.BooleanListNamedStyle#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.BooleanListNamedStyle#getValues()
	 * @see #getBooleanListNamedStyle()
	 * @generated
	 */
	EAttribute getBooleanListNamedStyle_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.styles.DoubleListNamedStyle <em>Double List Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Double List Named Style</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.DoubleListNamedStyle
	 * @generated
	 */
	EClass getDoubleListNamedStyle();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.model2doc.core.styles.DoubleListNamedStyle#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.DoubleListNamedStyle#getValues()
	 * @see #getDoubleListNamedStyle()
	 * @generated
	 */
	EAttribute getDoubleListNamedStyle_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.core.styles.StyledElement <em>Styled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Styled Element</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StyledElement
	 * @generated
	 */
	EClass getStyledElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.core.styles.StyledElement#getNamedStyles <em>Named Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Named Styles</em>'.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StyledElement#getNamedStyles()
	 * @see #getStyledElement()
	 * @generated
	 */
	EReference getStyledElement_NamedStyles();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.model2doc.core.styles.StyledElement#getNamedStyle(java.lang.String) <em>Get Named Style</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Named Style</em>' operation.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StyledElement#getNamedStyle(java.lang.String)
	 * @generated
	 */
	EOperation getStyledElement__GetNamedStyle__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StylesFactory getStylesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.styles.NamedStyle <em>Named Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.styles.NamedStyle
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getNamedStyle()
		 * @generated
		 */
		EClass NAMED_STYLE = eINSTANCE.getNamedStyle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute NAMED_STYLE__NAME = eINSTANCE.getNamedStyle_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.IntNamedStyleImpl <em>Int Named Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.IntNamedStyleImpl
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getIntNamedStyle()
		 * @generated
		 */
		EClass INT_NAMED_STYLE = eINSTANCE.getIntNamedStyle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute INT_NAMED_STYLE__VALUE = eINSTANCE.getIntNamedStyle_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.StringNamedStyleImpl <em>String Named Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StringNamedStyleImpl
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getStringNamedStyle()
		 * @generated
		 */
		EClass STRING_NAMED_STYLE = eINSTANCE.getStringNamedStyle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STRING_NAMED_STYLE__VALUE = eINSTANCE.getStringNamedStyle_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.BooleanNamedStyleImpl <em>Boolean Named Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.BooleanNamedStyleImpl
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getBooleanNamedStyle()
		 * @generated
		 */
		EClass BOOLEAN_NAMED_STYLE = eINSTANCE.getBooleanNamedStyle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute BOOLEAN_NAMED_STYLE__VALUE = eINSTANCE.getBooleanNamedStyle_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.DoubleNamedStyleImpl <em>Double Named Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.DoubleNamedStyleImpl
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getDoubleNamedStyle()
		 * @generated
		 */
		EClass DOUBLE_NAMED_STYLE = eINSTANCE.getDoubleNamedStyle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOUBLE_NAMED_STYLE__VALUE = eINSTANCE.getDoubleNamedStyle_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.IntListNamedStyleImpl <em>Int List Named Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.IntListNamedStyleImpl
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getIntListNamedStyle()
		 * @generated
		 */
		EClass INT_LIST_NAMED_STYLE = eINSTANCE.getIntListNamedStyle();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute INT_LIST_NAMED_STYLE__VALUES = eINSTANCE.getIntListNamedStyle_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.StringListNamedStyleImpl <em>String List Named Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StringListNamedStyleImpl
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getStringListNamedStyle()
		 * @generated
		 */
		EClass STRING_LIST_NAMED_STYLE = eINSTANCE.getStringListNamedStyle();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STRING_LIST_NAMED_STYLE__VALUES = eINSTANCE.getStringListNamedStyle_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.BooleanListNamedStyleImpl <em>Boolean List Named Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.BooleanListNamedStyleImpl
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getBooleanListNamedStyle()
		 * @generated
		 */
		EClass BOOLEAN_LIST_NAMED_STYLE = eINSTANCE.getBooleanListNamedStyle();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute BOOLEAN_LIST_NAMED_STYLE__VALUES = eINSTANCE.getBooleanListNamedStyle_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.styles.impl.DoubleListNamedStyleImpl <em>Double List Named Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.DoubleListNamedStyleImpl
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getDoubleListNamedStyle()
		 * @generated
		 */
		EClass DOUBLE_LIST_NAMED_STYLE = eINSTANCE.getDoubleListNamedStyle();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOUBLE_LIST_NAMED_STYLE__VALUES = eINSTANCE.getDoubleListNamedStyle_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.core.styles.StyledElement <em>Styled Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.core.styles.StyledElement
		 * @see org.eclipse.papyrus.model2doc.core.styles.impl.StylesPackageImpl#getStyledElement()
		 * @generated
		 */
		EClass STYLED_ELEMENT = eINSTANCE.getStyledElement();

		/**
		 * The meta object literal for the '<em><b>Named Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference STYLED_ELEMENT__NAMED_STYLES = eINSTANCE.getStyledElement_NamedStyles();

		/**
		 * The meta object literal for the '<em><b>Get Named Style</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STYLED_ELEMENT___GET_NAMED_STYLE__STRING = eINSTANCE.getStyledElement__GetNamedStyle__String();

	}

} // StylesPackage
