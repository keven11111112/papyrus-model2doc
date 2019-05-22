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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.*;

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
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage
 * @generated
 */
public class DocumentStructureTemplateSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static DocumentStructureTemplatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DocumentStructureTemplateSwitch() {
		if (modelPackage == null) {
			modelPackage = DocumentStructureTemplatePackage.eINSTANCE;
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
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE: {
			DocumentTemplate documentTemplate = (DocumentTemplate) theEObject;
			T result = caseDocumentTemplate(documentTemplate);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE: {
			DocumentTemplatePrototype documentTemplatePrototype = (DocumentTemplatePrototype) theEObject;
			T result = caseDocumentTemplatePrototype(documentTemplatePrototype);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE: {
			TextDocumentTemplate textDocumentTemplate = (TextDocumentTemplate) theEObject;
			T result = caseTextDocumentTemplate(textDocumentTemplate);
			if (result == null) {
				result = caseDocumentTemplate(textDocumentTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.DOCUMENT_PART: {
			DocumentPart documentPart = (DocumentPart) theEObject;
			T result = caseDocumentPart(documentPart);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.TABLE_OF_CONTENTS: {
			TableOfContents tableOfContents = (TableOfContents) theEObject;
			T result = caseTableOfContents(tableOfContents);
			if (result == null) {
				result = caseDocumentPart(tableOfContents);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.BODY: {
			Body body = (Body) theEObject;
			T result = caseBody(body);
			if (result == null) {
				result = caseDocumentPart(body);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.IBODY_PART_TEMPLATE: {
			IBodyPartTemplate iBodyPartTemplate = (IBodyPartTemplate) theEObject;
			T result = caseIBodyPartTemplate(iBodyPartTemplate);
			if (result == null) {
				result = caseIBodySectionPartTemplate(iBodyPartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE: {
			IBodySectionPartTemplate iBodySectionPartTemplate = (IBodySectionPartTemplate) theEObject;
			T result = caseIBodySectionPartTemplate(iBodySectionPartTemplate);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ICOMPOSED_BODY_PART_TEMPLATE: {
			IComposedBodyPartTemplate iComposedBodyPartTemplate = (IComposedBodyPartTemplate) theEObject;
			T result = caseIComposedBodyPartTemplate(iComposedBodyPartTemplate);
			if (result == null) {
				result = caseIBodyPartTemplate(iComposedBodyPartTemplate);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(iComposedBodyPartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ISUB_BODY_PART_TEMPLATE: {
			ISubBodyPartTemplate iSubBodyPartTemplate = (ISubBodyPartTemplate) theEObject;
			T result = caseISubBodyPartTemplate(iSubBodyPartTemplate);
			if (result == null) {
				result = caseIBodySectionPartTemplate(iSubBodyPartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ILEAF_BODY_PART_TEMPLATE: {
			ILeafBodyPartTemplate iLeafBodyPartTemplate = (ILeafBodyPartTemplate) theEObject;
			T result = caseILeafBodyPartTemplate(iLeafBodyPartTemplate);
			if (result == null) {
				result = caseIBodyPartTemplate(iLeafBodyPartTemplate);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(iLeafBodyPartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ICOMPOSED_SUB_BODY_PART_TEMPLATE: {
			IComposedSubBodyPartTemplate iComposedSubBodyPartTemplate = (IComposedSubBodyPartTemplate) theEObject;
			T result = caseIComposedSubBodyPartTemplate(iComposedSubBodyPartTemplate);
			if (result == null) {
				result = caseISubBodyPartTemplate(iComposedSubBodyPartTemplate);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(iComposedSubBodyPartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ILEAF_SUB_BODY_PART_TEMPLATE: {
			ILeafSubBodyPartTemplate iLeafSubBodyPartTemplate = (ILeafSubBodyPartTemplate) theEObject;
			T result = caseILeafSubBodyPartTemplate(iLeafSubBodyPartTemplate);
			if (result == null) {
				result = caseISubBodyPartTemplate(iLeafSubBodyPartTemplate);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(iLeafSubBodyPartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE: {
			EClassPartTemplate eClassPartTemplate = (EClassPartTemplate) theEObject;
			T result = caseEClassPartTemplate(eClassPartTemplate);
			if (result == null) {
				result = caseEClassTemplate(eClassPartTemplate);
			}
			if (result == null) {
				result = caseIComposedSubBodyPartTemplate(eClassPartTemplate);
			}
			if (result == null) {
				result = caseISubBodyPartTemplate(eClassPartTemplate);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(eClassPartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ECLASS_TEMPLATE: {
			EClassTemplate eClassTemplate = (EClassTemplate) theEObject;
			T result = caseEClassTemplate(eClassTemplate);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.EREFERENCE_PART_TEMPLATE: {
			EReferencePartTemplate eReferencePartTemplate = (EReferencePartTemplate) theEObject;
			T result = caseEReferencePartTemplate(eReferencePartTemplate);
			if (result == null) {
				result = caseEReferenceTemplate(eReferencePartTemplate);
			}
			if (result == null) {
				result = caseIComposedBodyPartTemplate(eReferencePartTemplate);
			}
			if (result == null) {
				result = caseIBodyPartTemplate(eReferencePartTemplate);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(eReferencePartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.EREFERENCE_TEMPLATE: {
			EReferenceTemplate eReferenceTemplate = (EReferenceTemplate) theEObject;
			T result = caseEReferenceTemplate(eReferenceTemplate);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ITEMPLATE_PART_VIEW: {
			ITemplatePartView iTemplatePartView = (ITemplatePartView) theEObject;
			T result = caseITemplatePartView(iTemplatePartView);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.EREFERENCE_LIST_VIEW: {
			EReferenceListView eReferenceListView = (EReferenceListView) theEObject;
			T result = caseEReferenceListView(eReferenceListView);
			if (result == null) {
				result = caseITemplatePartView(eReferenceListView);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ITABLE_VIEW: {
			ITableView iTableView = (ITableView) theEObject;
			T result = caseITableView(iTableView);
			if (result == null) {
				result = caseILeafBodyPartTemplate(iTableView);
			}
			if (result == null) {
				result = caseITemplatePartView(iTableView);
			}
			if (result == null) {
				result = caseIBodyPartTemplate(iTableView);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(iTableView);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ICOLUMN: {
			IColumn iColumn = (IColumn) theEObject;
			T result = caseIColumn(iColumn);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW: {
			EReferenceTableView eReferenceTableView = (EReferenceTableView) theEObject;
			T result = caseEReferenceTableView(eReferenceTableView);
			if (result == null) {
				result = caseEReferenceTemplate(eReferenceTableView);
			}
			if (result == null) {
				result = caseITableView(eReferenceTableView);
			}
			if (result == null) {
				result = caseILeafBodyPartTemplate(eReferenceTableView);
			}
			if (result == null) {
				result = caseITemplatePartView(eReferenceTableView);
			}
			if (result == null) {
				result = caseIBodyPartTemplate(eReferenceTableView);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(eReferenceTableView);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN: {
			EStructuralFeatureColumn eStructuralFeatureColumn = (EStructuralFeatureColumn) theEObject;
			T result = caseEStructuralFeatureColumn(eStructuralFeatureColumn);
			if (result == null) {
				result = caseIColumn(eStructuralFeatureColumn);
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
	 * Returns the result of interpreting the object as an instance of '<em>Document Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentTemplate(DocumentTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Template Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Template Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentTemplatePrototype(DocumentTemplatePrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Document Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Document Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDocumentTemplate(TextDocumentTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentPart(DocumentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfContents(TableOfContents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBody(Body object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBody Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBody Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBodyPartTemplate(IBodyPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBody Section Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBody Section Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBodySectionPartTemplate(IBodySectionPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IComposed Body Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IComposed Body Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIComposedBodyPartTemplate(IComposedBodyPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISub Body Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISub Body Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISubBodyPartTemplate(ISubBodyPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILeaf Body Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILeaf Body Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILeafBodyPartTemplate(ILeafBodyPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IComposed Sub Body Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IComposed Sub Body Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIComposedSubBodyPartTemplate(IComposedSubBodyPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILeaf Sub Body Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILeaf Sub Body Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILeafSubBodyPartTemplate(ILeafSubBodyPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassPartTemplate(EClassPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassTemplate(EClassTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReference Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReference Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReferencePartTemplate(EReferencePartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReference Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReference Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReferenceTemplate(EReferenceTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITemplate Part View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITemplate Part View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITemplatePartView(ITemplatePartView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReference List View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReference List View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReferenceListView(EReferenceListView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITable View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITable View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITableView(ITableView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IColumn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IColumn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIColumn(IColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReference Table View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReference Table View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReferenceTableView(EReferenceTableView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeatureColumn(EStructuralFeatureColumn object) {
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

} // DocumentStructureTemplateSwitch
