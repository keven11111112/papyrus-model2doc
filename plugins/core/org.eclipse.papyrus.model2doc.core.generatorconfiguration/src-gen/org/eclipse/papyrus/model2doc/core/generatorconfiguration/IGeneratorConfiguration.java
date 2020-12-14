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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IGenerator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common interface for document generator configuration.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getIGeneratorConfiguration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IGeneratorConfiguration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getDocumentName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getDocumentFolder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getDocumentGeneratorId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model documentNameRequired="true" documentNameOrdered="false"
	 * @generated
	 */
	void setDocumentName(String documentName);

} // IGeneratorConfiguration
