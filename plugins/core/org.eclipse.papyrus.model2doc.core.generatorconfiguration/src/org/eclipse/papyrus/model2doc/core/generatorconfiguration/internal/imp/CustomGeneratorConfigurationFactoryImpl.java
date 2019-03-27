/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.imp;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationFactoryImpl;
import org.eclipse.papyrus.model2doc.generatorconfiguration.internal.imp.CustomDefaultDocumentStructureGeneratorConfigurationImpl;

/**
 * Custom Factory for GeneratorConfiguration metamodel
 */
public class CustomGeneratorConfigurationFactoryImpl extends GeneratorConfigurationFactoryImpl {


	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.GeneratorConfigurationFactoryImpl#createDefaultDocumentStructureGeneratorConfiguration()
	 *
	 * @return
	 */
	@Override
	public DefaultDocumentStructureGeneratorConfiguration createDefaultDocumentStructureGeneratorConfiguration() {
		return new CustomDefaultDocumentStructureGeneratorConfigurationImpl();
	}
}
