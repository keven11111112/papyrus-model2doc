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
package org.eclipse.papyrus.model2doc.core.styles.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.model2doc.core.styles.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.core.styles.StylesPackage
 * @generated
 */
public class StylesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static StylesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public StylesSwitch() {
		if (modelPackage == null) {
			modelPackage = StylesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param ePackage
	 *            the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case StylesPackage.NAMED_STYLE: {
			NamedStyle namedStyle = (NamedStyle) theEObject;
			T result = caseNamedStyle(namedStyle);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case StylesPackage.INT_NAMED_STYLE: {
			IntNamedStyle intNamedStyle = (IntNamedStyle) theEObject;
			T result = caseIntNamedStyle(intNamedStyle);
			if (result == null) {
				result = caseNamedStyle(intNamedStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case StylesPackage.STRING_NAMED_STYLE: {
			StringNamedStyle stringNamedStyle = (StringNamedStyle) theEObject;
			T result = caseStringNamedStyle(stringNamedStyle);
			if (result == null) {
				result = caseNamedStyle(stringNamedStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case StylesPackage.BOOLEAN_NAMED_STYLE: {
			BooleanNamedStyle booleanNamedStyle = (BooleanNamedStyle) theEObject;
			T result = caseBooleanNamedStyle(booleanNamedStyle);
			if (result == null) {
				result = caseNamedStyle(booleanNamedStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case StylesPackage.DOUBLE_NAMED_STYLE: {
			DoubleNamedStyle doubleNamedStyle = (DoubleNamedStyle) theEObject;
			T result = caseDoubleNamedStyle(doubleNamedStyle);
			if (result == null) {
				result = caseNamedStyle(doubleNamedStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case StylesPackage.INT_LIST_NAMED_STYLE: {
			IntListNamedStyle intListNamedStyle = (IntListNamedStyle) theEObject;
			T result = caseIntListNamedStyle(intListNamedStyle);
			if (result == null) {
				result = caseNamedStyle(intListNamedStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case StylesPackage.STRING_LIST_NAMED_STYLE: {
			StringListNamedStyle stringListNamedStyle = (StringListNamedStyle) theEObject;
			T result = caseStringListNamedStyle(stringListNamedStyle);
			if (result == null) {
				result = caseNamedStyle(stringListNamedStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case StylesPackage.BOOLEAN_LIST_NAMED_STYLE: {
			BooleanListNamedStyle booleanListNamedStyle = (BooleanListNamedStyle) theEObject;
			T result = caseBooleanListNamedStyle(booleanListNamedStyle);
			if (result == null) {
				result = caseNamedStyle(booleanListNamedStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case StylesPackage.DOUBLE_LIST_NAMED_STYLE: {
			DoubleListNamedStyle doubleListNamedStyle = (DoubleListNamedStyle) theEObject;
			T result = caseDoubleListNamedStyle(doubleListNamedStyle);
			if (result == null) {
				result = caseNamedStyle(doubleListNamedStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case StylesPackage.STYLED_ELEMENT: {
			StyledElement styledElement = (StyledElement) theEObject;
			T result = caseStyledElement(styledElement);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedStyle(NamedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntNamedStyle(IntNamedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringNamedStyle(StringNamedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanNamedStyle(BooleanNamedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleNamedStyle(DoubleNamedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int List Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int List Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntListNamedStyle(IntListNamedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String List Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String List Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringListNamedStyle(StringListNamedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean List Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean List Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanListNamedStyle(BooleanListNamedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double List Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double List Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleListNamedStyle(DoubleListNamedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Styled Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Styled Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyledElement(StyledElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // StylesSwitch
