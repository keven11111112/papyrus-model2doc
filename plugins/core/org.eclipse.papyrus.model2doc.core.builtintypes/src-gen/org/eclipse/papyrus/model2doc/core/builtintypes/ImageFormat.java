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
 * A representation of the literals of the enumeration '<em><b>Image Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This enumeration provide the list of format for images
 * <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getImageFormat()
 * @model
 * @generated
 */
public enum ImageFormat implements Enumerator {
	/**
	 * The '<em><b>SVG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #SVG_VALUE
	 * @generated
	 * @ordered
	 */
	SVG(0, "SVG", "svg"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>PNG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #PNG_VALUE
	 * @generated
	 * @ordered
	 */
	PNG(1, "PNG", "png"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SVG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #SVG
	 * @model literal="svg"
	 * @generated
	 * @ordered
	 */
	public static final int SVG_VALUE = 0;

	/**
	 * The '<em><b>PNG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #PNG
	 * @model literal="png"
	 * @generated
	 * @ordered
	 */
	public static final int PNG_VALUE = 1;

	/**
	 * An array of all the '<em><b>Image Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final ImageFormat[] VALUES_ARRAY = new ImageFormat[] {
			SVG,
			PNG,
	};

	/**
	 * A public read-only list of all the '<em><b>Image Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<ImageFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Image Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param literal
	 *                    the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param name
	 *                 the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageFormat get(int value) {
		switch (value) {
		case SVG_VALUE:
			return SVG;
		case PNG_VALUE:
			return PNG;
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
	private ImageFormat(int value, String name, String literal) {
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

} // ImageFormat
