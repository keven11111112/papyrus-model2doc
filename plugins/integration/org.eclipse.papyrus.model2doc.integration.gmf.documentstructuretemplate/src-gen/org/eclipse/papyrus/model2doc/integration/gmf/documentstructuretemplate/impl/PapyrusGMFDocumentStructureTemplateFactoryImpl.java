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
package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class PapyrusGMFDocumentStructureTemplateFactoryImpl extends EFactoryImpl implements PapyrusGMFDocumentStructureTemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static PapyrusGMFDocumentStructureTemplateFactory init() {
		try {
			PapyrusGMFDocumentStructureTemplateFactory thePapyrusGMFDocumentStructureTemplateFactory = (PapyrusGMFDocumentStructureTemplateFactory) EPackage.Registry.INSTANCE.getEFactory(PapyrusGMFDocumentStructureTemplatePackage.eNS_URI);
			if (thePapyrusGMFDocumentStructureTemplateFactory != null) {
				return thePapyrusGMFDocumentStructureTemplateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PapyrusGMFDocumentStructureTemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PapyrusGMFDocumentStructureTemplateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW:
			return createPapyrusGMFDiagramView();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PapyrusGMFDocumentStructureTemplatePackage.CONTEXT_FILTER_BEHAVIOR:
			return createContextFilterBehaviorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PapyrusGMFDocumentStructureTemplatePackage.CONTEXT_FILTER_BEHAVIOR:
			return convertContextFilterBehaviorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PapyrusGMFDiagramView createPapyrusGMFDiagramView() {
		PapyrusGMFDiagramViewImpl papyrusGMFDiagramView = new PapyrusGMFDiagramViewImpl();
		return papyrusGMFDiagramView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContextFilterBehavior createContextFilterBehaviorFromString(EDataType eDataType, String initialValue) {
		ContextFilterBehavior result = ContextFilterBehavior.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertContextFilterBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PapyrusGMFDocumentStructureTemplatePackage getPapyrusGMFDocumentStructureTemplatePackage() {
		return (PapyrusGMFDocumentStructureTemplatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PapyrusGMFDocumentStructureTemplatePackage getPackage() {
		return PapyrusGMFDocumentStructureTemplatePackage.eINSTANCE;
	}

} // PapyrusGMFDocumentStructureTemplateFactoryImpl
