/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IEEERequirementsDocumentationFactoryImpl extends EFactoryImpl implements IEEERequirementsDocumentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IEEERequirementsDocumentationFactory init() {
		try {
			IEEERequirementsDocumentationFactory theIEEERequirementsDocumentationFactory = (IEEERequirementsDocumentationFactory) EPackage.Registry.INSTANCE.getEFactory(IEEERequirementsDocumentationPackage.eNS_URI);
			if (theIEEERequirementsDocumentationFactory != null) {
				return theIEEERequirementsDocumentationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IEEERequirementsDocumentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEEERequirementsDocumentationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case IEEERequirementsDocumentationPackage.IEEE_REQUIREMENTS:
			return createIEEERequirements();
		case IEEERequirementsDocumentationPackage.IEEE_FUNCTIONAL_REQUIREMENTS:
			return createIEEEFunctionalRequirements();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case IEEERequirementsDocumentationPackage.IEEE_REQUIREMENT_CATEGORY:
			return createIEEERequirementCategoryFromString(eDataType, initialValue);
		case IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENT_CATEGORY:
			return createAbstractRequirementCategoryFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case IEEERequirementsDocumentationPackage.IEEE_REQUIREMENT_CATEGORY:
			return convertIEEERequirementCategoryToString(eDataType, instanceValue);
		case IEEERequirementsDocumentationPackage.ABSTRACT_REQUIREMENT_CATEGORY:
			return convertAbstractRequirementCategoryToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IEEERequirements createIEEERequirements() {
		IEEERequirementsImpl ieeeRequirements = new IEEERequirementsImpl();
		return ieeeRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IEEEFunctionalRequirements createIEEEFunctionalRequirements() {
		IEEEFunctionalRequirementsImpl ieeeFunctionalRequirements = new IEEEFunctionalRequirementsImpl();
		return ieeeFunctionalRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEEERequirementCategory createIEEERequirementCategoryFromString(EDataType eDataType, String initialValue) {
		IEEERequirementCategory result = IEEERequirementCategory.get(initialValue);
		if (result == null)
		 {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIEEERequirementCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRequirementCategory createAbstractRequirementCategoryFromString(EDataType eDataType, String initialValue) {
		AbstractRequirementCategory result = AbstractRequirementCategory.get(initialValue);
		if (result == null)
		 {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractRequirementCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IEEERequirementsDocumentationPackage getIEEERequirementsDocumentationPackage() {
		return (IEEERequirementsDocumentationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IEEERequirementsDocumentationPackage getPackage() {
		return IEEERequirementsDocumentationPackage.eINSTANCE;
	}

} //IEEERequirementsDocumentationFactoryImpl
