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
package org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GeneratorConfigurationFactoryImpl extends EFactoryImpl implements GeneratorConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static GeneratorConfigurationFactory init() {
		try {
			GeneratorConfigurationFactory theGeneratorConfigurationFactory = (GeneratorConfigurationFactory) EPackage.Registry.INSTANCE.getEFactory(GeneratorConfigurationPackage.eNS_URI);
			if (theGeneratorConfigurationFactory != null) {
				return theGeneratorConfigurationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratorConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public GeneratorConfigurationFactoryImpl() {
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
		case GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION:
			return createDefaultDocumentStructureGeneratorConfiguration();
		case GeneratorConfigurationPackage.DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION:
			return createDefaultDocumentGeneratorConfiguration();
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
	public DefaultDocumentStructureGeneratorConfiguration createDefaultDocumentStructureGeneratorConfiguration() {
		DefaultDocumentStructureGeneratorConfigurationImpl defaultDocumentStructureGeneratorConfiguration = new DefaultDocumentStructureGeneratorConfigurationImpl();
		return defaultDocumentStructureGeneratorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DefaultDocumentGeneratorConfiguration createDefaultDocumentGeneratorConfiguration() {
		DefaultDocumentGeneratorConfigurationImpl defaultDocumentGeneratorConfiguration = new DefaultDocumentGeneratorConfigurationImpl();
		return defaultDocumentGeneratorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public GeneratorConfigurationPackage getGeneratorConfigurationPackage() {
		return (GeneratorConfigurationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneratorConfigurationPackage getPackage() {
		return GeneratorConfigurationPackage.eINSTANCE;
	}

} // GeneratorConfigurationFactoryImpl
