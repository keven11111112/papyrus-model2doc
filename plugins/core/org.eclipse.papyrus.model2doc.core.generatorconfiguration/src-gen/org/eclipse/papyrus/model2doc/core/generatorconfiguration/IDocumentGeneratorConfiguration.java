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

import java.net.URL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDocument Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common Interface to use to define the Document Generator Configuration.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getIDocumentGeneratorConfiguration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDocumentGeneratorConfiguration extends IGeneratorConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isSaveDocumentStructure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isSaveImages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getTemplateFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a java.net.URL to access to the template or null if it don't exist.
	 * <!-- end-model-doc -->
	 *
	 * @model dataType="org.eclipse.papyrus.model2doc.core.generatorconfiguration.URL" required="true" ordered="false"
	 * @generated
	 */
	URL createTemplateFileURL();

} // IDocumentGeneratorConfiguration
