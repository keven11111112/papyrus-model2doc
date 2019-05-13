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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EClass Filter Behavior</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This enumeration allows to describe how to implement the filter rule in EClassPartTemplate.
 * <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#getEClassFilterBehavior()
 * @model
 * @generated
 */
public enum EClassFilterBehavior implements Enumerator {
	/**
	 * The '<em><b>TYPE OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #TYPE_OF_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_OF(0, "TYPE_OF", "TYPE_OF"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>KIND OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #KIND_OF_VALUE
	 * @generated
	 * @ordered
	 */
	KIND_OF(1, "KIND_OF", "KIND_OF"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>TYPE OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #TYPE_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_OF_VALUE = 0;

	/**
	 * The '<em><b>KIND OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #KIND_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KIND_OF_VALUE = 1;

	/**
	 * An array of all the '<em><b>EClass Filter Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final EClassFilterBehavior[] VALUES_ARRAY = new EClassFilterBehavior[] {
			TYPE_OF,
			KIND_OF,
	};

	/**
	 * A public read-only list of all the '<em><b>EClass Filter Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<EClassFilterBehavior> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EClass Filter Behavior</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param literal
	 *                    the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EClassFilterBehavior get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EClassFilterBehavior result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EClass Filter Behavior</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param name
	 *                 the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EClassFilterBehavior getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EClassFilterBehavior result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EClass Filter Behavior</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EClassFilterBehavior get(int value) {
		switch (value) {
		case TYPE_OF_VALUE:
			return TYPE_OF;
		case KIND_OF_VALUE:
			return KIND_OF;
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
	private EClassFilterBehavior(int value, String name, String literal) {
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

} // EClassFilterBehavior
