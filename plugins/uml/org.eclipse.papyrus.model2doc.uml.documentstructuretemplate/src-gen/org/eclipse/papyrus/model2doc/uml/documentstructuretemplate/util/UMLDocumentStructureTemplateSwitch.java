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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IRootListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.*;

import org.eclipse.uml2.uml.Comment;

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
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage
 * @generated
 */
public class UMLDocumentStructureTemplateSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static UMLDocumentStructureTemplatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UMLDocumentStructureTemplateSwitch() {
		if (modelPackage == null) {
			modelPackage = UMLDocumentStructureTemplatePackage.eINSTANCE;
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE: {
			StereotypePartTemplate stereotypePartTemplate = (StereotypePartTemplate) theEObject;
			T result = caseStereotypePartTemplate(stereotypePartTemplate);
			if (result == null) {
				result = caseMandatoryStereotypeWithEClassTemplate(stereotypePartTemplate);
			}
			if (result == null) {
				result = caseIUMLBodyPartTemplateTitle(stereotypePartTemplate);
			}
			if (result == null) {
				result = caseIComposedSubBodyPartTemplate(stereotypePartTemplate);
			}
			if (result == null) {
				result = caseEClassTemplate(stereotypePartTemplate);
			}
			if (result == null) {
				result = caseMandatoryStereotypeTemplate(stereotypePartTemplate);
			}
			if (result == null) {
				result = caseISubBodyPartTemplate(stereotypePartTemplate);
			}
			if (result == null) {
				result = caseStereotypeTemplate(stereotypePartTemplate);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(stereotypePartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE: {
			MandatoryStereotypeWithEClassTemplate mandatoryStereotypeWithEClassTemplate = (MandatoryStereotypeWithEClassTemplate) theEObject;
			T result = caseMandatoryStereotypeWithEClassTemplate(mandatoryStereotypeWithEClassTemplate);
			if (result == null) {
				result = caseEClassTemplate(mandatoryStereotypeWithEClassTemplate);
			}
			if (result == null) {
				result = caseMandatoryStereotypeTemplate(mandatoryStereotypeWithEClassTemplate);
			}
			if (result == null) {
				result = caseStereotypeTemplate(mandatoryStereotypeWithEClassTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.MANDATORY_STEREOTYPE_TEMPLATE: {
			MandatoryStereotypeTemplate mandatoryStereotypeTemplate = (MandatoryStereotypeTemplate) theEObject;
			T result = caseMandatoryStereotypeTemplate(mandatoryStereotypeTemplate);
			if (result == null) {
				result = caseStereotypeTemplate(mandatoryStereotypeTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_TEMPLATE: {
			StereotypeTemplate stereotypeTemplate = (StereotypeTemplate) theEObject;
			T result = caseStereotypeTemplate(stereotypeTemplate);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.IUML_BODY_PART_TEMPLATE_TITLE: {
			IUMLBodyPartTemplateTitle iumlBodyPartTemplateTitle = (IUMLBodyPartTemplateTitle) theEObject;
			T result = caseIUMLBodyPartTemplateTitle(iumlBodyPartTemplateTitle);
			if (result == null) {
				result = caseIBodySectionPartTemplate(iumlBodyPartTemplateTitle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE: {
			StereotypePropertyReferencePartTemplate stereotypePropertyReferencePartTemplate = (StereotypePropertyReferencePartTemplate) theEObject;
			T result = caseStereotypePropertyReferencePartTemplate(stereotypePropertyReferencePartTemplate);
			if (result == null) {
				result = caseStereotypePropertyTemplate(stereotypePropertyReferencePartTemplate);
			}
			if (result == null) {
				result = caseIComposedBodyPartTemplate(stereotypePropertyReferencePartTemplate);
			}
			if (result == null) {
				result = caseIUMLBodyPartTemplateTitle(stereotypePropertyReferencePartTemplate);
			}
			if (result == null) {
				result = caseStereotypePropertyReference(stereotypePropertyReferencePartTemplate);
			}
			if (result == null) {
				result = caseStereotypeTemplate(stereotypePropertyReferencePartTemplate);
			}
			if (result == null) {
				result = caseIBodyPartTemplate(stereotypePropertyReferencePartTemplate);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(stereotypePropertyReferencePartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_TEMPLATE: {
			StereotypePropertyTemplate stereotypePropertyTemplate = (StereotypePropertyTemplate) theEObject;
			T result = caseStereotypePropertyTemplate(stereotypePropertyTemplate);
			if (result == null) {
				result = caseStereotypeTemplate(stereotypePropertyTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE: {
			StereotypePropertyReference stereotypePropertyReference = (StereotypePropertyReference) theEObject;
			T result = caseStereotypePropertyReference(stereotypePropertyReference);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH: {
			CommentAsParagraph commentAsParagraph = (CommentAsParagraph) theEObject;
			T result = caseCommentAsParagraph(commentAsParagraph);
			if (result == null) {
				result = caseILeafBodyPartTemplate(commentAsParagraph);
			}
			if (result == null) {
				result = caseITemplatePartView(commentAsParagraph);
			}
			if (result == null) {
				result = caseIUMLBodyPartTemplateTitle(commentAsParagraph);
			}
			if (result == null) {
				result = caseIBodyPartTemplate(commentAsParagraph);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(commentAsParagraph);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.COMMENT: {
			Comment comment = (Comment) theEObject;
			T result = caseComment(comment);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN: {
			StereotypePropertyColumn stereotypePropertyColumn = (StereotypePropertyColumn) theEObject;
			T result = caseStereotypePropertyColumn(stereotypePropertyColumn);
			if (result == null) {
				result = caseMandatoryStereotypePropertyTemplate(stereotypePropertyColumn);
			}
			if (result == null) {
				result = caseIColumn(stereotypePropertyColumn);
			}
			if (result == null) {
				result = caseStereotypePropertyTemplate(stereotypePropertyColumn);
			}
			if (result == null) {
				result = caseStereotypeTemplate(stereotypePropertyColumn);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE: {
			MandatoryStereotypePropertyTemplate mandatoryStereotypePropertyTemplate = (MandatoryStereotypePropertyTemplate) theEObject;
			T result = caseMandatoryStereotypePropertyTemplate(mandatoryStereotypePropertyTemplate);
			if (result == null) {
				result = caseStereotypePropertyTemplate(mandatoryStereotypePropertyTemplate);
			}
			if (result == null) {
				result = caseStereotypeTemplate(mandatoryStereotypePropertyTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW: {
			StereotypePropertyReferenceTableView stereotypePropertyReferenceTableView = (StereotypePropertyReferenceTableView) theEObject;
			T result = caseStereotypePropertyReferenceTableView(stereotypePropertyReferenceTableView);
			if (result == null) {
				result = caseStereotypePropertyTemplate(stereotypePropertyReferenceTableView);
			}
			if (result == null) {
				result = caseITableView(stereotypePropertyReferenceTableView);
			}
			if (result == null) {
				result = caseIUMLBodyPartTemplateTitle(stereotypePropertyReferenceTableView);
			}
			if (result == null) {
				result = caseStereotypePropertyReference(stereotypePropertyReferenceTableView);
			}
			if (result == null) {
				result = caseStereotypeTemplate(stereotypePropertyReferenceTableView);
			}
			if (result == null) {
				result = caseILeafBodyPartTemplate(stereotypePropertyReferenceTableView);
			}
			if (result == null) {
				result = caseITemplatePartView(stereotypePropertyReferenceTableView);
			}
			if (result == null) {
				result = caseIBodyPartTemplate(stereotypePropertyReferenceTableView);
			}
			if (result == null) {
				result = caseIBodySectionPartTemplate(stereotypePropertyReferenceTableView);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE: {
			StereotypeListItemTemplate stereotypeListItemTemplate = (StereotypeListItemTemplate) theEObject;
			T result = caseStereotypeListItemTemplate(stereotypeListItemTemplate);
			if (result == null) {
				result = caseMandatoryStereotypeWithEClassTemplate(stereotypeListItemTemplate);
			}
			if (result == null) {
				result = caseIComposedSubListItemTemplate(stereotypeListItemTemplate);
			}
			if (result == null) {
				result = caseEClassTemplate(stereotypeListItemTemplate);
			}
			if (result == null) {
				result = caseMandatoryStereotypeTemplate(stereotypeListItemTemplate);
			}
			if (result == null) {
				result = caseISubListItemTemplate(stereotypeListItemTemplate);
			}
			if (result == null) {
				result = caseStereotypeTemplate(stereotypeListItemTemplate);
			}
			if (result == null) {
				result = caseIListItemTemplate(stereotypeListItemTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM_TEMPLATE: {
			StereotypePropertyReferenceListItemTemplate stereotypePropertyReferenceListItemTemplate = (StereotypePropertyReferenceListItemTemplate) theEObject;
			T result = caseStereotypePropertyReferenceListItemTemplate(stereotypePropertyReferenceListItemTemplate);
			if (result == null) {
				result = caseStereotypePropertyListItemTemplate(stereotypePropertyReferenceListItemTemplate);
			}
			if (result == null) {
				result = caseIComposedListItemTemplate(stereotypePropertyReferenceListItemTemplate);
			}
			if (result == null) {
				result = caseStereotypePropertyReference(stereotypePropertyReferenceListItemTemplate);
			}
			if (result == null) {
				result = caseMandatoryStereotypePropertyTemplate(stereotypePropertyReferenceListItemTemplate);
			}
			if (result == null) {
				result = caseIRootListItemTemplate(stereotypePropertyReferenceListItemTemplate);
			}
			if (result == null) {
				result = caseStereotypePropertyTemplate(stereotypePropertyReferenceListItemTemplate);
			}
			if (result == null) {
				result = caseIListItemTemplate(stereotypePropertyReferenceListItemTemplate);
			}
			if (result == null) {
				result = caseStereotypeTemplate(stereotypePropertyReferenceListItemTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE: {
			StereotypePropertyListItemTemplate stereotypePropertyListItemTemplate = (StereotypePropertyListItemTemplate) theEObject;
			T result = caseStereotypePropertyListItemTemplate(stereotypePropertyListItemTemplate);
			if (result == null) {
				result = caseMandatoryStereotypePropertyTemplate(stereotypePropertyListItemTemplate);
			}
			if (result == null) {
				result = caseIListItemTemplate(stereotypePropertyListItemTemplate);
			}
			if (result == null) {
				result = caseStereotypePropertyTemplate(stereotypePropertyListItemTemplate);
			}
			if (result == null) {
				result = caseStereotypeTemplate(stereotypePropertyListItemTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM_TEMPLATE: {
			StereotypePropertyAttributeListItemTemplate stereotypePropertyAttributeListItemTemplate = (StereotypePropertyAttributeListItemTemplate) theEObject;
			T result = caseStereotypePropertyAttributeListItemTemplate(stereotypePropertyAttributeListItemTemplate);
			if (result == null) {
				result = caseStereotypePropertyListItemTemplate(stereotypePropertyAttributeListItemTemplate);
			}
			if (result == null) {
				result = caseILeafListItemTemplate(stereotypePropertyAttributeListItemTemplate);
			}
			if (result == null) {
				result = caseStereotypePropertyAttribute(stereotypePropertyAttributeListItemTemplate);
			}
			if (result == null) {
				result = caseMandatoryStereotypePropertyTemplate(stereotypePropertyAttributeListItemTemplate);
			}
			if (result == null) {
				result = caseIRootListItemTemplate(stereotypePropertyAttributeListItemTemplate);
			}
			if (result == null) {
				result = caseStereotypePropertyTemplate(stereotypePropertyAttributeListItemTemplate);
			}
			if (result == null) {
				result = caseIListItemTemplate(stereotypePropertyAttributeListItemTemplate);
			}
			if (result == null) {
				result = caseStereotypeTemplate(stereotypePropertyAttributeListItemTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_ATTRIBUTE: {
			StereotypePropertyAttribute stereotypePropertyAttribute = (StereotypePropertyAttribute) theEObject;
			T result = caseStereotypePropertyAttribute(stereotypePropertyAttribute);
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
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypePartTemplate(StereotypePartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Stereotype With EClass Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Stereotype With EClass Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryStereotypeWithEClassTemplate(MandatoryStereotypeWithEClassTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Stereotype Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Stereotype Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryStereotypeTemplate(MandatoryStereotypeTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypeTemplate(StereotypeTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IUML Body Part Template Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IUML Body Part Template Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIUMLBodyPartTemplateTitle(IUMLBodyPartTemplateTitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Property Reference Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Property Reference Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypePropertyReferencePartTemplate(StereotypePropertyReferencePartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Property Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Property Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypePropertyTemplate(StereotypePropertyTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment As Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment As Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentAsParagraph(CommentAsParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Property Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Property Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypePropertyColumn(StereotypePropertyColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Stereotype Property Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Stereotype Property Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryStereotypePropertyTemplate(MandatoryStereotypePropertyTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Property Reference Table View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Property Reference Table View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypePropertyReferenceTableView(StereotypePropertyReferenceTableView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Property Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypePropertyReference(StereotypePropertyReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype List Item Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypeListItemTemplate(StereotypeListItemTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Property Reference List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Property Reference List Item Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypePropertyReferenceListItemTemplate(StereotypePropertyReferenceListItemTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Property List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Property List Item Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypePropertyListItemTemplate(StereotypePropertyListItemTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Property Attribute List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Property Attribute List Item Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypePropertyAttributeListItemTemplate(StereotypePropertyAttributeListItemTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Property Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Property Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypePropertyAttribute(StereotypePropertyAttribute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IList Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IList Item Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIListItemTemplate(IListItemTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISub List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISub List Item Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISubListItemTemplate(ISubListItemTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IComposed Sub List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IComposed Sub List Item Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIComposedSubListItemTemplate(IComposedSubListItemTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoot List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoot List Item Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRootListItemTemplate(IRootListItemTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IComposed List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IComposed List Item Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIComposedListItemTemplate(IComposedListItemTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILeaf List Item Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILeaf List Item Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILeafListItemTemplate(ILeafListItemTemplate object) {
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

} // UMLDocumentStructureTemplateSwitch
