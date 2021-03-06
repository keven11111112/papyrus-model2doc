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
import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.model2doc.core.builtintypes.accessors.IInputFileAccessor;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Document Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DefaultDocumentGeneratorConfigurationImpl extends AbstractDocumentGeneratorConfigurationImpl implements DefaultDocumentGeneratorConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DefaultDocumentGeneratorConfigurationImpl() {
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
		return GeneratorConfigurationPackage.Literals.DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IInputFileAccessor createTemplateFileInputAccessor() {
		return new org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.accessors.TemplateInputFileAccessor(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IOutputFileAccessor createDocumentOutputAccessor() {
		return new org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.accessors.DocumentOutputFileAccessor(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IDocumentGeneratorConfiguration.class) {
			switch (baseOperationID) {
			case GeneratorConfigurationPackage.IDOCUMENT_GENERATOR_CONFIGURATION___IS_SAVE_DOCUMENT_STRUCTURE:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION___IS_SAVE_DOCUMENT_STRUCTURE;
			case GeneratorConfigurationPackage.IDOCUMENT_GENERATOR_CONFIGURATION___IS_SAVE_IMAGES:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION___IS_SAVE_IMAGES;
			case GeneratorConfigurationPackage.IDOCUMENT_GENERATOR_CONFIGURATION___GET_TEMPLATE_FILE:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION___GET_TEMPLATE_FILE;
			case GeneratorConfigurationPackage.IDOCUMENT_GENERATOR_CONFIGURATION___CREATE_TEMPLATE_FILE_INPUT_ACCESSOR:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION___CREATE_TEMPLATE_FILE_INPUT_ACCESSOR;
			case GeneratorConfigurationPackage.IDOCUMENT_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_OUTPUT_ACCESSOR:
				return GeneratorConfigurationPackage.DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_OUTPUT_ACCESSOR;
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
		case GeneratorConfigurationPackage.DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION___CREATE_TEMPLATE_FILE_INPUT_ACCESSOR:
			return createTemplateFileInputAccessor();
		case GeneratorConfigurationPackage.DEFAULT_DOCUMENT_GENERATOR_CONFIGURATION___CREATE_DOCUMENT_OUTPUT_ACCESSOR:
			return createDocumentOutputAccessor();
		}
		return super.eInvoke(operationID, arguments);
	}

} // DefaultDocumentGeneratorConfigurationImpl
