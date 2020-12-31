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
package org.eclipse.papyrus.model2doc.core.generatorconfiguration;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDocument Structure Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common Interface to define the Document Structure generator in the model.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getIDocumentStructureGeneratorConfiguration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDocumentStructureGeneratorConfiguration extends IGeneratorConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a IDocumentGeneratorConfiguration from the current configuration.
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IDocumentGeneratorConfiguration createDocumentGeneratorConfiguration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getStructureGeneratorId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getImageFolder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getStructureFolder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return an accessor for the output Document Structure file.
	 * <!-- end-model-doc -->
	 *
	 * @model dataType="org.eclipse.papyrus.model2doc.core.generatorconfiguration.IOutputFileAccessor" required="true" ordered="false"
	 * @generated
	 */
	IOutputFileAccessor createDocumentStructureOutputAccessor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return an accessor for the output image files
	 * <!-- end-model-doc -->
	 *
	 * @model dataType="org.eclipse.papyrus.model2doc.core.generatorconfiguration.IOutputFileAccessor" required="true" ordered="false"
	 * @generated
	 */
	IOutputFileAccessor createImageOutputAccessor();

} // IDocumentStructureGeneratorConfiguration
