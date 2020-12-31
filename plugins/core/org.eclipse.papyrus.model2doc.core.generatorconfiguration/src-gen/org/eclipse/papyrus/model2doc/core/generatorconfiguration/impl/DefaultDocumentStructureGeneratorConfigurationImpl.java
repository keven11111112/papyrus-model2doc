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

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationFactory;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Document Structure Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DefaultDocumentStructureGeneratorConfigurationImpl extends AbstractDocumentStructureGeneratorConfigurationImpl implements DefaultDocumentStructureGeneratorConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DefaultDocumentStructureGeneratorConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorConfigurationPackage.Literals.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IDocumentGeneratorConfiguration createDocumentGeneratorConfiguration() {
		final DefaultDocumentGeneratorConfiguration newConf = GeneratorConfigurationFactory.eINSTANCE.createDefaultDocumentGeneratorConfiguration();
		final Iterator<EAttribute> iter = newConf.eClass().getEAllAttributes().iterator();
		while (iter.hasNext()) {
			final EStructuralFeature feature = iter.next();
			newConf.eSet(feature, eGet(feature));
		}
		return newConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IOutputFileAccessor createDocumentStructureOutputAccessor() {
		return new org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.accessors.DocumentStructureOutputFileAccessor(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IOutputFileAccessor createImageOutputAccessor() {
		return new org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.accessors.ImageOutputFileAccessor(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IDocumentStructureGeneratorConfiguration.class) {
			switch (baseOperationID) {
			case GeneratorConfigurationPackage.IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_GENERATOR_CONFIGURATION:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_GENERATOR_CONFIGURATION;
			case GeneratorConfigurationPackage.IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___GET_STRUCTURE_GENERATOR_ID:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___GET_STRUCTURE_GENERATOR_ID;
			case GeneratorConfigurationPackage.IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___GET_IMAGE_FOLDER:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___GET_IMAGE_FOLDER;
			case GeneratorConfigurationPackage.IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___GET_STRUCTURE_FOLDER:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___GET_STRUCTURE_FOLDER;
			case GeneratorConfigurationPackage.IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_STRUCTURE_OUTPUT_ACCESSOR:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_STRUCTURE_OUTPUT_ACCESSOR;
			case GeneratorConfigurationPackage.IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_IMAGE_OUTPUT_ACCESSOR:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_IMAGE_OUTPUT_ACCESSOR;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_GENERATOR_CONFIGURATION:
			return createDocumentGeneratorConfiguration();
		case GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_STRUCTURE_OUTPUT_ACCESSOR:
			return createDocumentStructureOutputAccessor();
		case GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_IMAGE_OUTPUT_ACCESSOR:
			return createImageOutputAccessor();
		}
		return super.eInvoke(operationID, arguments);
	}

} // DefaultDocumentStructureGeneratorConfigurationImpl
