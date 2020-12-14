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

import org.eclipse.emf.common.util.URI;


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
	 * The platform:/resource URI of the document structure to create or <code>null</code> if we failed to create a valid URI
	 *
	 * @param fileExtension
	 *            a string representing the extension of the document structure file to use.
	 *            This parameter can't be null.
	 * @param version
	 *            Optional parameter. A string indicating the version of the document. This string will be a part of the file name.
	 *            <!-- end-model-doc -->
	 * @model type="org.eclipse.papyrus.model2doc.core.generatorconfiguration.URI" required="true" ordered="false" fileExtensionRequired="true" fileExtensionOrdered="false" versionOrdered="false"
	 * @generated
	 */
	URI createDocumentStructureURI(String fileExtension, String version);

} // IDocumentStructureGeneratorConfiguration
