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
 * A representation of the model object '<em><b>Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common abstract class for document generator configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentName <em>Document Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentFolder <em>Document Folder</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentGeneratorId <em>Document Generator Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getGeneratorConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the document, without its extension.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Document Name</em>' attribute.
	 * @see #setDocumentName(String)
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getGeneratorConfiguration_DocumentName()
	 * @model ordered="false"
	 * @generated
	 */
	String getDocumentName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentName <em>Document Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Document Name</em>' attribute.
	 * @see #getDocumentName()
	 * @generated
	 */
	void setDocumentName(String value);

	/**
	 * Returns the value of the '<em><b>Document Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output folder. It can be a full path (platform:/resource/projectName/...) or a path in the current plugin (generation/outputFolder, interpreted as platform:/resource/projectName/generation/outputFolder), or a system path (ex: c:\MyDocuments).
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Document Folder</em>' attribute.
	 * @see #setDocumentFolder(String)
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getGeneratorConfiguration_DocumentFolder()
	 * @model ordered="false"
	 * @generated
	 */
	String getDocumentFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentFolder <em>Document Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Document Folder</em>' attribute.
	 * @see #getDocumentFolder()
	 * @generated
	 */
	void setDocumentFolder(String value);

	/**
	 * Returns the value of the '<em><b>Document Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the document generator to use.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Document Generator Id</em>' attribute.
	 * @see #setDocumentGeneratorId(String)
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getGeneratorConfiguration_DocumentGeneratorId()
	 * @model ordered="false"
	 * @generated
	 */
	String getDocumentGeneratorId();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration#getDocumentGeneratorId <em>Document Generator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Document Generator Id</em>' attribute.
	 * @see #getDocumentGeneratorId()
	 * @generated
	 */
	void setDocumentGeneratorId(String value);

} // GeneratorConfiguration
