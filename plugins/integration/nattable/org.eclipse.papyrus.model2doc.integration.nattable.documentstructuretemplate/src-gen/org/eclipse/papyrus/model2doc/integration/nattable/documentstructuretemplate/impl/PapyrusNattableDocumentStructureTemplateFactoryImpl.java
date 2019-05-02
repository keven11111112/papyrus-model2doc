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
package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PapyrusNattableDocumentStructureTemplateFactoryImpl extends EFactoryImpl implements PapyrusNattableDocumentStructureTemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PapyrusNattableDocumentStructureTemplateFactory init() {
		try {
			PapyrusNattableDocumentStructureTemplateFactory thePapyrusNattableDocumentStructureTemplateFactory = (PapyrusNattableDocumentStructureTemplateFactory) EPackage.Registry.INSTANCE.getEFactory(PapyrusNattableDocumentStructureTemplatePackage.eNS_URI);
			if (thePapyrusNattableDocumentStructureTemplateFactory != null) {
				return thePapyrusNattableDocumentStructureTemplateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PapyrusNattableDocumentStructureTemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PapyrusNattableDocumentStructureTemplateFactoryImpl() {
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
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW:
			return createPapyrusTableView();
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
		case PapyrusNattableDocumentStructureTemplatePackage.CONTEXT_FILTER_BEHAVIOR:
			return createContextFilterBehaviorFromString(eDataType, initialValue);
		case PapyrusNattableDocumentStructureTemplatePackage.IMPORT_METHOD:
			return createImportMethodFromString(eDataType, initialValue);
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
		case PapyrusNattableDocumentStructureTemplatePackage.CONTEXT_FILTER_BEHAVIOR:
			return convertContextFilterBehaviorToString(eDataType, instanceValue);
		case PapyrusNattableDocumentStructureTemplatePackage.IMPORT_METHOD:
			return convertImportMethodToString(eDataType, instanceValue);
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
	public PapyrusTableView createPapyrusTableView() {
		PapyrusTableViewImpl papyrusTableView = new PapyrusTableViewImpl();
		return papyrusTableView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextFilterBehavior createContextFilterBehaviorFromString(EDataType eDataType, String initialValue) {
		ContextFilterBehavior result = ContextFilterBehavior.get(initialValue);
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
	public String convertContextFilterBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportMethod createImportMethodFromString(EDataType eDataType, String initialValue) {
		ImportMethod result = ImportMethod.get(initialValue);
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
	public String convertImportMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PapyrusNattableDocumentStructureTemplatePackage getPapyrusNattableDocumentStructureTemplatePackage() {
		return (PapyrusNattableDocumentStructureTemplatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PapyrusNattableDocumentStructureTemplatePackage getPackage() {
		return PapyrusNattableDocumentStructureTemplatePackage.eINSTANCE;
	}

} //PapyrusNattableDocumentStructureTemplateFactoryImpl
