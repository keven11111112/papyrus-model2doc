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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;

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
		return org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.operations.DefaultDocumentStructureGeneratorConfigurationOperations.createDocumentGeneratorConfiguration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public URI createDocumentStructureURI(final String fileExtension, final String version) {
		return org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.operations.DefaultDocumentStructureGeneratorConfigurationOperations.createDocumentStructureURI(this, fileExtension, version);
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
			case GeneratorConfigurationPackage.IDOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_STRUCTURE_URI__STRING_STRING:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_STRUCTURE_URI__STRING_STRING;
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
		case GeneratorConfigurationPackage.DEFAULT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_STRUCTURE_URI__STRING_STRING:
			return createDocumentStructureURI((String) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} // DefaultDocumentStructureGeneratorConfigurationImpl
