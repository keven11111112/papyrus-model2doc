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

import org.eclipse.papyrus.model2doc.documentstructuretemplate.*;

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
		case DocumentStructureTemplatePackage.DOCUMENT_PART_TEMPLATE: {
			DocumentPartTemplate documentPartTemplate = (DocumentPartTemplate) theEObject;
			T result = caseDocumentPartTemplate(documentPartTemplate);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE: {
			EStructuralFeatureDocumentPartTemplate eStructuralFeatureDocumentPartTemplate = (EStructuralFeatureDocumentPartTemplate) theEObject;
			T result = caseEStructuralFeatureDocumentPartTemplate(eStructuralFeatureDocumentPartTemplate);
			if (result == null) {
				result = caseFeaturePartTemplate(eStructuralFeatureDocumentPartTemplate);
			}
			if (result == null) {
				result = caseDocumentPartTemplate(eStructuralFeatureDocumentPartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.FEATURE_PART_TEMPLATE: {
			FeaturePartTemplate featurePartTemplate = (FeaturePartTemplate) theEObject;
			T result = caseFeaturePartTemplate(featurePartTemplate);
			if (result == null) {
				result = caseDocumentPartTemplate(featurePartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.OBJECT_PART_TEMPLATE: {
			ObjectPartTemplate objectPartTemplate = (ObjectPartTemplate) theEObject;
			T result = caseObjectPartTemplate(objectPartTemplate);
			if (result == null) {
				result = caseDocumentPartTemplate(objectPartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE: {
			EClassDocumentPartTemplate eClassDocumentPartTemplate = (EClassDocumentPartTemplate) theEObject;
			T result = caseEClassDocumentPartTemplate(eClassDocumentPartTemplate);
			if (result == null) {
				result = caseObjectPartTemplate(eClassDocumentPartTemplate);
			}
			if (result == null) {
				result = caseDocumentPartTemplate(eClassDocumentPartTemplate);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructureTemplatePackage.EOBJECT_DOCUMENT_PART_TEMPLATE: {
			EObjectDocumentPartTemplate eObjectDocumentPartTemplate = (EObjectDocumentPartTemplate) theEObject;
			T result = caseEObjectDocumentPartTemplate(eObjectDocumentPartTemplate);
			if (result == null) {
				result = caseObjectPartTemplate(eObjectDocumentPartTemplate);
			}
			if (result == null) {
				result = caseDocumentPartTemplate(eObjectDocumentPartTemplate);
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
	 * Returns the result of interpreting the object as an instance of '<em>Feature Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePartTemplate(FeaturePartTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Part Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Part Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPartTemplate(ObjectPartTemplate object) {
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
