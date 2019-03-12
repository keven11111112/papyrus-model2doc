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
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.core.config;

import org.eclipse.papyrus.model2doc.core.internal.config.DefaultGeneratorConfig;

/**
 * Generator Configuration Factory.
 *
 */
public class GeneratorConfigFactory {
	
	public static final GeneratorConfigFactory INSTANCE = new GeneratorConfigFactory();
	
	/**
	 * Constructor.
	 *
	 */
	private GeneratorConfigFactory() {
		// to avoid instantiation
	}
	
	
	/**
	 * Get default image description.
	 * 
	 * @return
	 */
	public GeneratorConfig getDefaultGeneratorConfig() {
		return new DefaultGeneratorConfig();
	}
}