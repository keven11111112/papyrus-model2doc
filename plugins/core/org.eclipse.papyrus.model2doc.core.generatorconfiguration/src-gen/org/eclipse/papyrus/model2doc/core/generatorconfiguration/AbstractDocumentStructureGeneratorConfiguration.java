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
 * A representation of the model object '<em><b>Abstract Document Structure Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getStructureGeneratorId <em>Structure Generator Id</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getImageFolder <em>Image Folder</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getStructureFolder <em>Structure Folder</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentStructureGeneratorConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDocumentStructureGeneratorConfiguration extends AbstractDocumentGeneratorConfiguration {
	/**
	 * Returns the value of the '<em><b>Structure Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Generator Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Structure Generator Id</em>' attribute.
	 * @see #setStructureGeneratorId(String)
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentStructureGeneratorConfiguration_StructureGeneratorId()
	 * @model ordered="false"
	 * @generated
	 */
	String getStructureGeneratorId();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getStructureGeneratorId <em>Structure Generator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Structure Generator Id</em>' attribute.
	 * @see #getStructureGeneratorId()
	 * @generated
	 */
	void setStructureGeneratorId(String value);

	/**
	 * Returns the value of the '<em><b>Image Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output image folder. It can be a full path (platform:/resource/projectName/...) or a path in the current plugin (generation/outputImageFolder, interpreted as platform:/resource/projectName/generation/outputImageFolder) or a system path (ex:
	 * c:\MyDocuments).
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Image Folder</em>' attribute.
	 * @see #setImageFolder(String)
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentStructureGeneratorConfiguration_ImageFolder()
	 * @model ordered="false"
	 * @generated
	 */
	String getImageFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getImageFolder <em>Image Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Image Folder</em>' attribute.
	 * @see #getImageFolder()
	 * @generated
	 */
	void setImageFolder(String value);

	/**
	 * Returns the value of the '<em><b>Structure Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output image folder. It can be a full path (platform:/resource/projectName/...) or a path in the current plugin (generation/outputImageFolder, interpreted as platform:/resource/projectName/generation/outputImageFolder).
	 * It can't be a system path (c:\myDocuments is not alloxed for example).
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Structure Folder</em>' attribute.
	 * @see #setStructureFolder(String)
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentStructureGeneratorConfiguration_StructureFolder()
	 * @model ordered="false"
	 * @generated
	 */
	String getStructureFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration#getStructureFolder <em>Structure Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Structure Folder</em>' attribute.
	 * @see #getStructureFolder()
	 * @generated
	 */
	void setStructureFolder(String value);

} // AbstractDocumentStructureGeneratorConfiguration
