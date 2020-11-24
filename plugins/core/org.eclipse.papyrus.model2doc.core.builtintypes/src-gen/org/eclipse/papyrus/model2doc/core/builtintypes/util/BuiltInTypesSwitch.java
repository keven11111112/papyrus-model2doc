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
package org.eclipse.papyrus.model2doc.core.builtintypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.model2doc.core.builtintypes.*;
import org.eclipse.papyrus.model2doc.core.styles.StyledElement;

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
 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage
 * @generated
 */
public class BuiltInTypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static BuiltInTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public BuiltInTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = BuiltInTypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param ePackage
	 *                     the package in question.
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
		case BuiltInTypesPackage.ABSTRACT_TABLE: {
			AbstractTable abstractTable = (AbstractTable) theEObject;
			T result = caseAbstractTable(abstractTable);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.ROW: {
			Row row = (Row) theEObject;
			T result = caseRow(row);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.CELL: {
			Cell cell = (Cell) theEObject;
			T result = caseCell(cell);
			if (result == null) {
				result = caseStyledElement(cell);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.BASIC_TABLE: {
			BasicTable basicTable = (BasicTable) theEObject;
			T result = caseBasicTable(basicTable);
			if (result == null) {
				result = caseAbstractTable(basicTable);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.BASIC_ROW: {
			BasicRow basicRow = (BasicRow) theEObject;
			T result = caseBasicRow(basicRow);
			if (result == null) {
				result = caseRow(basicRow);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.TEXT_CELL: {
			TextCell textCell = (TextCell) theEObject;
			T result = caseTextCell(textCell);
			if (result == null) {
				result = caseCell(textCell);
			}
			if (result == null) {
				result = caseStyledElement(textCell);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.ABSTRACT_LIST: {
			AbstractList abstractList = (AbstractList) theEObject;
			T result = caseAbstractList(abstractList);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.LIST_ITEM: {
			ListItem listItem = (ListItem) theEObject;
			T result = caseListItem(listItem);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.TEXT_LIST_ITEM: {
			TextListItem textListItem = (TextListItem) theEObject;
			T result = caseTextListItem(textListItem);
			if (result == null) {
				result = caseListItem(textListItem);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.BASIC_LIST: {
			BasicList basicList = (BasicList) theEObject;
			T result = caseBasicList(basicList);
			if (result == null) {
				result = caseAbstractList(basicList);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.IFILE_REFERENCE: {
			IFileReference iFileReference = (IFileReference) theEObject;
			T result = caseIFileReference(iFileReference);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BuiltInTypesPackage.DEFAULT_FILE_REFERENCE: {
			DefaultFileReference defaultFileReference = (DefaultFileReference) theEObject;
			T result = caseDefaultFileReference(defaultFileReference);
			if (result == null) {
				result = caseIFileReference(defaultFileReference);
			}
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTable(AbstractTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicTable(BasicTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicRow(BasicRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextCell(TextCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractList(AbstractList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItem(ListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextListItem(TextListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicList(BasicList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFile Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFile Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFileReference(IFileReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default File Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultFileReference(DefaultFileReference object) {
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
	 *                   the target of the switch.
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
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // BuiltInTypesSwitch
