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
package org.eclipse.papyrus.model2doc.documentstructuretemplate.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.*;

import org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor;
import org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor;
import org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor;

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
 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage
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
		case DocumentStructureTemplatePackage.START_EOBJECT_VISITOR_TEMPLATE: {
			StartEObjectVisitorTemplate startEObjectVisitorTemplate = (StartEObjectVisitorTemplate) theEObject;
			T result = caseStartEObjectVisitorTemplate(startEObjectVisitorTemplate);
			if (result == null) {
				result = caseStartModelVisitor(startEObjectVisitorTemplate);
			}
			if (result == null) {
				result = caseEObjectDocumentPartTemplate(startEObjectVisitorTemplate);
			}
			if (result == null) {
				result = caseObjectVisitor(startEObjectVisitorTemplate);
			}
			if (result == null) {
				result = caseDocumentPartTemplate(startEObjectVisitorTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.START_ECLASS_VISITOR_TEMPLATE: {
			StartEClassVisitorTemplate startEClassVisitorTemplate = (StartEClassVisitorTemplate) theEObject;
			T result = caseStartEClassVisitorTemplate(startEClassVisitorTemplate);
			if (result == null) {
				result = caseEClassVisitorTemplate(startEClassVisitorTemplate);
			}
			if (result == null) {
				result = caseStartModelVisitor(startEClassVisitorTemplate);
			}
			if (result == null) {
				result = caseObjectVisitor(startEClassVisitorTemplate);
			}
			if (result == null) {
				result = caseEClassDocumentPartTemplate(startEClassVisitorTemplate);
			}
			if (result == null) {
				result = caseDocumentPartTemplate(startEClassVisitorTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ECLASS_VISITOR_TEMPLATE: {
			EClassVisitorTemplate eClassVisitorTemplate = (EClassVisitorTemplate) theEObject;
			T result = caseEClassVisitorTemplate(eClassVisitorTemplate);
			if (result == null) {
				result = caseObjectVisitor(eClassVisitorTemplate);
			}
			if (result == null) {
				result = caseEClassDocumentPartTemplate(eClassVisitorTemplate);
			}
			if (result == null) {
				result = caseDocumentPartTemplate(eClassVisitorTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE: {
			EStructuralFeatureVisitorTemplate eStructuralFeatureVisitorTemplate = (EStructuralFeatureVisitorTemplate) theEObject;
			T result = caseEStructuralFeatureVisitorTemplate(eStructuralFeatureVisitorTemplate);
			if (result == null) {
				result = caseFeatureVisitor(eStructuralFeatureVisitorTemplate);
			}
			if (result == null) {
				result = caseEStructuralFeatureDocumentPartTemplate(eStructuralFeatureVisitorTemplate);
			}
			if (result == null) {
				result = caseDocumentPartTemplate(eStructuralFeatureVisitorTemplate);
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
	 * Returns the result of interpreting the object as an instance of '<em>Start EObject Visitor Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start EObject Visitor Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEObjectVisitorTemplate(StartEObjectVisitorTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start EClass Visitor Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start EClass Visitor Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEClassVisitorTemplate(StartEClassVisitorTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Visitor Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Visitor Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassVisitorTemplate(EClassVisitorTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature Visitor Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature Visitor Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeatureVisitorTemplate(EStructuralFeatureVisitorTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectVisitor(ObjectVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Model Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Model Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartModelVisitor(StartModelVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentPartTemplate(DocumentPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Document Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Document Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectDocumentPartTemplate(EObjectDocumentPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Document Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Document Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassDocumentPartTemplate(EClassDocumentPartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureVisitor(FeatureVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature Document Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature Document Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeatureDocumentPartTemplate(EStructuralFeatureDocumentPartTemplate object) {
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
