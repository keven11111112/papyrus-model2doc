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
package org.eclipse.papyrus.model2doc.generatorconfiguration.internal.imp;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationFactory;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.impl.DefaultDocumentStructureGeneratorConfigurationImpl;

public class CustomDefaultDocumentStructureGeneratorConfigurationImpl extends DefaultDocumentStructureGeneratorConfigurationImpl {


	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.generatorconfiguration.impl.DocumentStructureGeneratorConfigurationImpl#createDocumentGeneratorConfiguration()
	 *
	 * @return
	 */
	@Override
	public IDocumentGeneratorConfiguration createDocumentGeneratorConfiguration() {
		final DefaultDocumentGeneratorConfiguration configuration = GeneratorConfigurationFactory.eINSTANCE.createDefaultDocumentGeneratorConfiguration();
		final Iterator<EAttribute> iter = configuration.eClass().getEAllAttributes().iterator();
		while (iter.hasNext()) {
			final EStructuralFeature feature = iter.next();
			configuration.eSet(feature, this.eGet(feature));
		}
		return configuration;
	}

}
