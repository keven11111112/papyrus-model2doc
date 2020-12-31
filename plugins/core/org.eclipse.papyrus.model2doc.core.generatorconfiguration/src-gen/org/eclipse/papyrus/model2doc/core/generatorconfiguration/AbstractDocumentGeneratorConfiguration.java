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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Document Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#isSaveDocumentStructure <em>Save Document Structure</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#isSaveImages <em>Save Images</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#getTemplateFile <em>Template File</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#getDocumentName <em>Document Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#getDocumentFolder <em>Document Folder</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#getDocumentGeneratorId <em>Document Generator Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentGeneratorConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDocumentGeneratorConfiguration extends IGeneratorConfiguration {
	/**
	 * Returns the value of the '<em><b>Save Document Structure</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the document structure model will be kept after the generation. If false, it will be destroyed.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Save Document Structure</em>' attribute.
	 * @see #setSaveDocumentStructure(boolean)
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentGeneratorConfiguration_SaveDocumentStructure()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isSaveDocumentStructure();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#isSaveDocumentStructure <em>Save Document Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Save Document Structure</em>' attribute.
	 * @see #isSaveDocumentStructure()
	 * @generated
	 */
	void setSaveDocumentStructure(boolean value);

	/**
	 * Returns the value of the '<em><b>Save Images</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the generated images will be kept after the generation. If false, we will erase them.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Save Images</em>' attribute.
	 * @see #setSaveImages(boolean)
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentGeneratorConfiguration_SaveImages()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isSaveImages();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#isSaveImages <em>Save Images</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Save Images</em>' attribute.
	 * @see #isSaveImages()
	 * @generated
	 */
	void setSaveImages(boolean value);

	/**
	 * Returns the value of the '<em><b>Template File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path to the file to use as template. This file contains de style description and maybe the cover page too.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Template File</em>' attribute.
	 * @see #setTemplateFile(String)
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentGeneratorConfiguration_TemplateFile()
	 * @model ordered="false"
	 * @generated
	 */
	String getTemplateFile();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#getTemplateFile <em>Template File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Template File</em>' attribute.
	 * @see #getTemplateFile()
	 * @generated
	 */
	void setTemplateFile(String value);

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
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentGeneratorConfiguration_DocumentName()
	 * @model ordered="false"
	 * @generated
	 */
	@Override
	String getDocumentName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#getDocumentName <em>Document Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Document Name</em>' attribute.
	 * @see #getDocumentName()
	 * @generated
	 */
	@Override
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
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentGeneratorConfiguration_DocumentFolder()
	 * @model ordered="false"
	 * @generated
	 */
	@Override
	String getDocumentFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#getDocumentFolder <em>Document Folder</em>}' attribute.
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
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentGeneratorConfiguration_DocumentGeneratorId()
	 * @model ordered="false"
	 * @generated
	 */
	@Override
	String getDocumentGeneratorId();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration#getDocumentGeneratorId <em>Document Generator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Document Generator Id</em>' attribute.
	 * @see #getDocumentGeneratorId()
	 * @generated
	 */
	void setDocumentGeneratorId(String value);

} // AbstractDocumentGeneratorConfiguration
