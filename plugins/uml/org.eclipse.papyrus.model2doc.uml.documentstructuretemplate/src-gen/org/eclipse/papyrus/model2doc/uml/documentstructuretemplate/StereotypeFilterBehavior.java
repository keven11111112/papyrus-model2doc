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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stereotype Filter Behavior</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This enumeration allows to describe how to implement the filter rule in StereotypePartTemplate.
 * <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypeFilterBehavior()
 * @model
 * @generated
 */
public enum StereotypeFilterBehavior implements Enumerator {
	/**
	 * The '<em><b>STEREOTYPE TYPE OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #STEREOTYPE_TYPE_OF_VALUE
	 * @generated
	 * @ordered
	 */
	STEREOTYPE_TYPE_OF(0, "STEREOTYPE_TYPE_OF", "STEREOTYPE_TYPE_OF"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>STEREOTYPE KIND OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #STEREOTYPE_KIND_OF_VALUE
	 * @generated
	 * @ordered
	 */
	STEREOTYPE_KIND_OF(1, "STEREOTYPE_KIND_OF", "STEREOTYPE_KIND_OF"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>STEREOTYPE TYPE OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STEREOTYPE TYPE OF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #STEREOTYPE_TYPE_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STEREOTYPE_TYPE_OF_VALUE = 0;

	/**
	 * The '<em><b>STEREOTYPE KIND OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STEREOTYPE KIND OF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #STEREOTYPE_KIND_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STEREOTYPE_KIND_OF_VALUE = 1;

	/**
	 * An array of all the '<em><b>Stereotype Filter Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final StereotypeFilterBehavior[] VALUES_ARRAY = new StereotypeFilterBehavior[] {
			STEREOTYPE_TYPE_OF,
			STEREOTYPE_KIND_OF,
	};

	/**
	 * A public read-only list of all the '<em><b>Stereotype Filter Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<StereotypeFilterBehavior> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stereotype Filter Behavior</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param literal
	 *                    the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StereotypeFilterBehavior get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StereotypeFilterBehavior result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stereotype Filter Behavior</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param name
	 *                 the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StereotypeFilterBehavior getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StereotypeFilterBehavior result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stereotype Filter Behavior</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StereotypeFilterBehavior get(int value) {
		switch (value) {
		case STEREOTYPE_TYPE_OF_VALUE:
			return STEREOTYPE_TYPE_OF;
		case STEREOTYPE_KIND_OF_VALUE:
			return STEREOTYPE_KIND_OF;
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
	private StereotypeFilterBehavior(int value, String name, String literal) {
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

} // StereotypeFilterBehavior
