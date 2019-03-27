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
 * A representation of the model object '<em><b>IDocument Structure Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common Interface to define the Document Structure generatorto in the model.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getIDocumentStructureGeneratorConfiguration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDocumentStructureGeneratorConfiguration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IDocumentGeneratorConfiguration createDocumentGeneratorConfiguration();

} // IDocumentStructureGeneratorConfiguration
