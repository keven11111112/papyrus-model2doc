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
 * A representation of the literals of the enumeration '<em><b>Comment Choice</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getCommentChoice()
 * @model
 * @generated
 */
public enum CommentChoice implements Enumerator {
	/**
	 * The '<em><b>FIRST OWNED COMMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #FIRST_OWNED_COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_OWNED_COMMENT(0, "FIRST_OWNED_COMMENT", "FIRST_OWNED_COMMENT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>ALL OWNED COMMENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ALL_OWNED_COMMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_OWNED_COMMENTS(1, "ALL_OWNED_COMMENTS", "ALL_OWNED_COMMENTS"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FIRST OWNED COMMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #FIRST_OWNED_COMMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_OWNED_COMMENT_VALUE = 0;

	/**
	 * The '<em><b>ALL OWNED COMMENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ALL_OWNED_COMMENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_OWNED_COMMENTS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Comment Choice</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final CommentChoice[] VALUES_ARRAY = new CommentChoice[] {
			FIRST_OWNED_COMMENT,
			ALL_OWNED_COMMENTS,
	};

	/**
	 * A public read-only list of all the '<em><b>Comment Choice</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<CommentChoice> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comment Choice</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param literal
	 *                    the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommentChoice get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommentChoice result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comment Choice</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param name
	 *                 the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommentChoice getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommentChoice result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comment Choice</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *                  the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommentChoice get(int value) {
		switch (value) {
		case FIRST_OWNED_COMMENT_VALUE:
			return FIRST_OWNED_COMMENT;
		case ALL_OWNED_COMMENTS_VALUE:
			return ALL_OWNED_COMMENTS;
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
	private CommentChoice(int value, String name, String literal) {
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

} // CommentChoice
