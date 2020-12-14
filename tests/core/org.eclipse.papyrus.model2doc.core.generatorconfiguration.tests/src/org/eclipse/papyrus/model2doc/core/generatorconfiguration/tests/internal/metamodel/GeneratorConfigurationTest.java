/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests.internal.metamodel;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class checks the methods provided by the elements of the metamodel
 */
public class GeneratorConfigurationTest extends AbstractGeneratorConfigurationTests {

	/**
	 * This method checks the method {@link DefaultDocumentStructureGeneratorConfiguration#createDocumentGeneratorConfiguration()}
	 * with save images and save document structure set to <code>true</code>
	 */
	@Test
	public void createDocumentGeneratorConfiguration_Test1() {
		final DefaultDocumentStructureGeneratorConfiguration defaultConf = createDocumentGeneratorConfiguration();

		final IDocumentGeneratorConfiguration conf = defaultConf.createDocumentGeneratorConfiguration();
		Assert.assertNotNull("The creation of DocumentGeneratorConfiguration failed", conf); //$NON-NLS-1$
		compare(defaultConf, conf);
	}

	/**
	 * This method checks the method {@link DefaultDocumentStructureGeneratorConfiguration#createDocumentGeneratorConfiguration()}
	 * with save images and save document structure set to <code>false</code>
	 */
	@Test
	public void createDocumentGeneratorConfiguration_Test2() {
		final DefaultDocumentStructureGeneratorConfiguration defaultConf = createDocumentGeneratorConfiguration();

		// we test with the other boolean value
		defaultConf.setSaveDocumentStructure(!defaultConf.isSaveDocumentStructure());
		defaultConf.setSaveImages(!defaultConf.isSaveImages());


		final IDocumentGeneratorConfiguration conf = defaultConf.createDocumentGeneratorConfiguration();
		Assert.assertNotNull("The creation of DocumentGeneratorConfiguration failed", conf); //$NON-NLS-1$
		compare(defaultConf, conf);
	}

	/**
	 *
	 * @param ddsgc
	 *            the initial {@link DefaultDocumentStructureGeneratorConfiguration}
	 * @param documentGeneratorConfiguration
	 *            the {@link IDocumentGeneratorConfiguration} created from the previous object
	 *            This method checks that the values of the {@link DefaultDocumentStructureGeneratorConfiguration} are equals to the values of {@link IDocumentGeneratorConfiguration} for their common fields
	 */
	private void compare(final DefaultDocumentStructureGeneratorConfiguration ddsgc, final IDocumentGeneratorConfiguration documentGeneratorConfiguration) {
		Assert.assertEquals(ddsgc.getDocumentFolder(), documentGeneratorConfiguration.getDocumentFolder());
		Assert.assertEquals(ddsgc.getDocumentGeneratorId(), documentGeneratorConfiguration.getDocumentGeneratorId());
		Assert.assertEquals(ddsgc.getDocumentName(), documentGeneratorConfiguration.getDocumentName());
		Assert.assertEquals(ddsgc.getTemplateFile(), documentGeneratorConfiguration.getTemplateFile());
		Assert.assertEquals(ddsgc.isSaveDocumentStructure(), documentGeneratorConfiguration.isSaveDocumentStructure());
		Assert.assertEquals(ddsgc.isSaveImages(), documentGeneratorConfiguration.isSaveImages());
	}

}
