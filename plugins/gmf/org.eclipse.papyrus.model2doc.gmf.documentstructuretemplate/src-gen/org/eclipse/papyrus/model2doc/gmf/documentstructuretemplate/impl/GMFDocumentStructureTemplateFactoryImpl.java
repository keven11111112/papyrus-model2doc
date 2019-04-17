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
package org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GMFDocumentStructureTemplateFactoryImpl extends EFactoryImpl implements GMFDocumentStructureTemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static GMFDocumentStructureTemplateFactory init() {
		try {
			GMFDocumentStructureTemplateFactory theGMFDocumentStructureTemplateFactory = (GMFDocumentStructureTemplateFactory) EPackage.Registry.INSTANCE.getEFactory(GMFDocumentStructureTemplatePackage.eNS_URI);
			if (theGMFDocumentStructureTemplateFactory != null) {
				return theGMFDocumentStructureTemplateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GMFDocumentStructureTemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public GMFDocumentStructureTemplateFactoryImpl() {
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
		case GMFDocumentStructureTemplatePackage.GMF_DIAGRAM_VIEW:
			return createGMFDiagramView();
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
	public GMFDiagramView createGMFDiagramView() {
		GMFDiagramViewImpl gmfDiagramView = new GMFDiagramViewImpl();
		return gmfDiagramView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public GMFDocumentStructureTemplatePackage getGMFDocumentStructureTemplatePackage() {
		return (GMFDocumentStructureTemplatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GMFDocumentStructureTemplatePackage getPackage() {
		return GMFDocumentStructureTemplatePackage.eINSTANCE;
	}

} // GMFDocumentStructureTemplateFactoryImpl
