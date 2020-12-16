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
package org.eclipse.papyrus.model2doc.core.generatorconfiguration.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.*;

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
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage
 * @generated
 */
public class GeneratorConfigurationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static GeneratorConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public GeneratorConfigurationSwitch() {
		if (modelPackage == null) {
			modelPackage = GeneratorConfigurationPackage.eINSTANCE;
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
		case GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION: {
			DefaultDocumentStructureGeneratorConfiguration defaultDocumentStructureGeneratorConfiguration = (DefaultDocumentStructureGeneratorConfiguration) theEObject;
			T result = caseDefaultDocumentStructureGeneratorConfiguration(defaultDocumentStructureGeneratorConfiguration);
			if (result == null) {
				result = caseAbstractDocumentStructureGeneratorConfiguration(defaultDocumentStructureGeneratorConfiguration);
			}
			if (result == null) {
				result = caseIDocumentStructureGeneratorConfiguration(defaultDocumentStructureGeneratorConfiguration);
			}
			if (result == null) {
				result = caseAbstractDocumentGeneratorConfiguration(defaultDocumentStructureGeneratorConfiguration);
			}
			if (result == null) {
				result = caseIGeneratorConfiguration(defaultDocumentStructureGeneratorConfiguration);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION: {
			AbstractDocumentStructureGeneratorConfiguration abstractDocumentStructureGeneratorConfiguration = (AbstractDocumentStructureGeneratorConfiguration) theEObject;
			T result = caseAbstractDocumentStructureGeneratorConfiguration(abstractDocumentStructureGeneratorConfiguration);
			if (result == null) {
				result = caseAbstractDocumentGeneratorConfiguration(abstractDocumentStructureGeneratorConfiguration);
			}
			if (result == null) {
				result = caseIGeneratorConfiguration(abstractDocumentStructureGeneratorConfiguration);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_GENERATOR_CONFIGURATION: {
			AbstractDocumentGeneratorConfiguration abstractDocumentGeneratorConfiguration = (AbstractDocumentGeneratorConfiguration) theEObject;
			T result = caseAbstractDocumentGeneratorConfiguration(abstractDocumentGeneratorConfiguration);
			if (result == null) {
				result = caseIGeneratorConfiguration(abstractDocumentGeneratorConfiguration);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case GeneratorConfigurationPackage.IGENERATOR_CONFIGURATION: {
			IGeneratorConfiguration iGeneratorConfiguration = (IGeneratorConfiguration) theEObject;
			T result = caseIGeneratorConfiguration(iGeneratorConfiguration);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case GeneratorConfigurationPackage.IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION: {
			IDocumentStructureGeneratorConfiguration iDocumentStructureGeneratorConfiguration = (IDocumentStructureGeneratorConfiguration) theEObject;
			T result = caseIDocumentStructureGeneratorConfiguration(iDocumentStructureGeneratorConfiguration);
			if (result == null) {
				result = caseIGeneratorConfiguration(iDocumentStructureGeneratorConfiguration);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case GeneratorConfigurationPackage.IDOCUMENT_GENERATOR_CONFIGURATION: {
			IDocumentGeneratorConfiguration iDocumentGeneratorConfiguration = (IDocumentGeneratorConfiguration) theEObject;
			T result = caseIDocumentGeneratorConfiguration(iDocumentGeneratorConfiguration);
			if (result == null) {
				result = caseIGeneratorConfiguration(iDocumentGeneratorConfiguration);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case GeneratorConfigurationPackage.DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION: {
			DefaultDocumentGeneratorConfiguration defaultDocumentGeneratorConfiguration = (DefaultDocumentGeneratorConfiguration) theEObject;
			T result = caseDefaultDocumentGeneratorConfiguration(defaultDocumentGeneratorConfiguration);
			if (result == null) {
				result = caseAbstractDocumentGeneratorConfiguration(defaultDocumentGeneratorConfiguration);
			}
			if (result == null) {
				result = caseIDocumentGeneratorConfiguration(defaultDocumentGeneratorConfiguration);
			}
			if (result == null) {
				result = caseIGeneratorConfiguration(defaultDocumentGeneratorConfiguration);
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
	 * Returns the result of interpreting the object as an instance of '<em>Default Document Structure Generator Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Document Structure Generator Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultDocumentStructureGeneratorConfiguration(DefaultDocumentStructureGeneratorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Document Structure Generator Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Document Structure Generator Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDocumentStructureGeneratorConfiguration(AbstractDocumentStructureGeneratorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Document Generator Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Document Generator Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDocumentGeneratorConfiguration(AbstractDocumentGeneratorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGenerator Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGenerator Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGeneratorConfiguration(IGeneratorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDocument Structure Generator Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDocument Structure Generator Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDocumentStructureGeneratorConfiguration(IDocumentStructureGeneratorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDocument Generator Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDocument Generator Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDocumentGeneratorConfiguration(IDocumentGeneratorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Document Generator Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Document Generator Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultDocumentGeneratorConfiguration(DefaultDocumentGeneratorConfiguration object) {
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

} // GeneratorConfigurationSwitch
