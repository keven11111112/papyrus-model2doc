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
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getAbstractDocumentGeneratorConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDocumentGeneratorConfiguration extends GeneratorConfiguration {
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

} // AbstractDocumentGeneratorConfiguration
