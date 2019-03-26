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
package org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IEEE Requirement Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p>Abstract Stereotype created to ease future extension</p>
 *
 * <!-- end-model-doc -->
 * @see org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEERequirementsDocumentationPackage#getIEEERequirementCategory()
 * @model extendedMetaData="baseType='AbstractRequirementCategory'"
 * @generated
 */
public enum IEEERequirementCategory implements Enumerator {
	/**
	 * The '<em><b>SPECIFIC REQUIREMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIFIC_REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIFIC_REQUIREMENTS(0, "SPECIFIC_REQUIREMENTS", "SPECIFIC_REQUIREMENTS"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>EXTERNAL INTERFACE REQUIREMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_INTERFACE_REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_INTERFACE_REQUIREMENTS(1, "EXTERNAL_INTERFACE_REQUIREMENTS", "EXTERNAL_INTERFACE_REQUIREMENTS"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>USER INTERFACES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_INTERFACES_VALUE
	 * @generated
	 * @ordered
	 */
	USER_INTERFACES(2, "USER_INTERFACES", "USER_INTERFACES"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>HARDWARE INTERFACES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_INTERFACES_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWARE_INTERFACES(3, "HARDWARE_INTERFACES", "HARDWARE_INTERFACES"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SOFTWARE INTERFACES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_INTERFACES_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_INTERFACES(4, "SOFTWARE_INTERFACES", "SOFTWARE_INTERFACES"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>COMMUNICATION INTERFACES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_INTERFACES_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_INTERFACES(5, "COMMUNICATION_INTERFACES", "COMMUNICATION_INTERFACES"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FUNCTIONAL REQUIREMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL_REQUIREMENTS(6, "FUNCTIONAL_REQUIREMENTS", "FUNCTIONAL_REQUIREMENTS"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>PERFORMANCE REQUIREMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE_REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORMANCE_REQUIREMENTS(7, "PERFORMANCE_REQUIREMENTS", "PERFORMANCE_REQUIREMENTS"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DESIGN CONSTRAINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_CONSTRAINTS_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN_CONSTRAINTS(8, "DESIGN_CONSTRAINTS", "DESIGN_CONSTRAINTS"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SOFTWARE SYSTEM ATTRIBUTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_SYSTEM_ATTRIBUTES_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_SYSTEM_ATTRIBUTES(9, "SOFTWARE_SYSTEM_ATTRIBUTES", "SOFTWARE_SYSTEM_ATTRIBUTES"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>OTHER REQUIREMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_REQUIREMENTS(10, "OTHER_REQUIREMENTS", "OTHER_REQUIREMENTS"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SPECIFIC REQUIREMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPECIFIC REQUIREMENTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIFIC_REQUIREMENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFIC_REQUIREMENTS_VALUE = 0;

	/**
	 * The '<em><b>EXTERNAL INTERFACE REQUIREMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTERNAL INTERFACE REQUIREMENTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_INTERFACE_REQUIREMENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_INTERFACE_REQUIREMENTS_VALUE = 1;

	/**
	 * The '<em><b>USER INTERFACES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER INTERFACES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_INTERFACES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_INTERFACES_VALUE = 2;

	/**
	 * The '<em><b>HARDWARE INTERFACES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HARDWARE INTERFACES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_INTERFACES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_INTERFACES_VALUE = 3;

	/**
	 * The '<em><b>SOFTWARE INTERFACES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOFTWARE INTERFACES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_INTERFACES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_INTERFACES_VALUE = 4;

	/**
	 * The '<em><b>COMMUNICATION INTERFACES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMUNICATION INTERFACES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_INTERFACES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_INTERFACES_VALUE = 5;

	/**
	 * The '<em><b>FUNCTIONAL REQUIREMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCTIONAL REQUIREMENTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_REQUIREMENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_REQUIREMENTS_VALUE = 6;

	/**
	 * The '<em><b>PERFORMANCE REQUIREMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERFORMANCE REQUIREMENTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE_REQUIREMENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERFORMANCE_REQUIREMENTS_VALUE = 7;

	/**
	 * The '<em><b>DESIGN CONSTRAINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESIGN CONSTRAINTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESIGN_CONSTRAINTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_CONSTRAINTS_VALUE = 8;

	/**
	 * The '<em><b>SOFTWARE SYSTEM ATTRIBUTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOFTWARE SYSTEM ATTRIBUTES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_SYSTEM_ATTRIBUTES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_SYSTEM_ATTRIBUTES_VALUE = 9;

	/**
	 * The '<em><b>OTHER REQUIREMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER REQUIREMENTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_REQUIREMENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_REQUIREMENTS_VALUE = 10;

	/**
	 * An array of all the '<em><b>IEEE Requirement Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IEEERequirementCategory[] VALUES_ARRAY = new IEEERequirementCategory[] {
			SPECIFIC_REQUIREMENTS,
			EXTERNAL_INTERFACE_REQUIREMENTS,
			USER_INTERFACES,
			HARDWARE_INTERFACES,
			SOFTWARE_INTERFACES,
			COMMUNICATION_INTERFACES,
			FUNCTIONAL_REQUIREMENTS,
			PERFORMANCE_REQUIREMENTS,
			DESIGN_CONSTRAINTS,
			SOFTWARE_SYSTEM_ATTRIBUTES,
			OTHER_REQUIREMENTS,
	};

	/**
	 * A public read-only list of all the '<em><b>IEEE Requirement Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IEEERequirementCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IEEE Requirement Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IEEERequirementCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IEEERequirementCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IEEE Requirement Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IEEERequirementCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IEEERequirementCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IEEE Requirement Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IEEERequirementCategory get(int value) {
		switch (value) {
		case SPECIFIC_REQUIREMENTS_VALUE:
			return SPECIFIC_REQUIREMENTS;
		case EXTERNAL_INTERFACE_REQUIREMENTS_VALUE:
			return EXTERNAL_INTERFACE_REQUIREMENTS;
		case USER_INTERFACES_VALUE:
			return USER_INTERFACES;
		case HARDWARE_INTERFACES_VALUE:
			return HARDWARE_INTERFACES;
		case SOFTWARE_INTERFACES_VALUE:
			return SOFTWARE_INTERFACES;
		case COMMUNICATION_INTERFACES_VALUE:
			return COMMUNICATION_INTERFACES;
		case FUNCTIONAL_REQUIREMENTS_VALUE:
			return FUNCTIONAL_REQUIREMENTS;
		case PERFORMANCE_REQUIREMENTS_VALUE:
			return PERFORMANCE_REQUIREMENTS;
		case DESIGN_CONSTRAINTS_VALUE:
			return DESIGN_CONSTRAINTS;
		case SOFTWARE_SYSTEM_ATTRIBUTES_VALUE:
			return SOFTWARE_SYSTEM_ATTRIBUTES;
		case OTHER_REQUIREMENTS_VALUE:
			return OTHER_REQUIREMENTS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IEEERequirementCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //IEEERequirementCategory
