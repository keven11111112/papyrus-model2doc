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
 * A representation of the model object '<em><b>Default Document Structure Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Default implementation to define the Document Structure generator.
 * These is no inheritance between DefaultDocumentGeneratorConfiguration and DefaultDocumentStructureGeneratorConfiguration, in order to constraint by type the kind of generator to use the the DocumentStructureTemplate and DocumentStructure models.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage#getDefaultDocumentStructureGeneratorConfiguration()
 * @model
 * @generated
 */
public interface DefaultDocumentStructureGeneratorConfiguration extends AbstractDocumentStructureGeneratorConfiguration, IDocumentStructureGeneratorConfiguration {
} // DefaultDocumentStructureGeneratorConfiguration
