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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cell Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This enumeration allows to define the location of each cell.
 * <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getCellLocation()
 * @model
 * @generated
 */
public enum CellLocation implements Enumerator {
	/**
	 * The '<em><b>CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #CORNER_VALUE
	 * @generated
	 * @ordered
	 */
	CORNER(0, "CORNER", "CORNER"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>COLUMN HEADER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #COLUMN_HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	COLUMN_HEADER(1, "COLUMN_HEADER", "COLUMN_HEADER"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>ROW HEADER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #ROW_HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	ROW_HEADER(2, "ROW_HEADER", "ROW_HEADER"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>BODY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #BODY_VALUE
	 * @generated
	 * @ordered
	 */
	BODY(3, "BODY", "BODY"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CORNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #CORNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CORNER_VALUE = 0;

	/**
	 * The '<em><b>COLUMN HEADER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #COLUMN_HEADER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLUMN_HEADER_VALUE = 1;

	/**
	 * The '<em><b>ROW HEADER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #ROW_HEADER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROW_HEADER_VALUE = 2;

	/**
	 * The '<em><b>BODY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #BODY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BODY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Cell Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final CellLocation[] VALUES_ARRAY = new CellLocation[] {
			CORNER,
			COLUMN_HEADER,
			ROW_HEADER,
			BODY,
	};

	/**
	 * A public read-only list of all the '<em><b>Cell Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<CellLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cell Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param literal
	 *                    the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CellLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param name
	 *                 the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CellLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CellLocation get(int value) {
		switch (value) {
		case CORNER_VALUE:
			return CORNER;
		case COLUMN_HEADER_VALUE:
			return COLUMN_HEADER;
		case ROW_HEADER_VALUE:
			return ROW_HEADER;
		case BODY_VALUE:
			return BODY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private CellLocation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
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
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // CellLocation
