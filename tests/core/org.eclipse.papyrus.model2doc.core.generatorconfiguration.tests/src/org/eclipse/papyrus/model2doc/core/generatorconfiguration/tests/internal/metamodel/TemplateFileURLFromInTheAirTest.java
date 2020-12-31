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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests.internal.metamodel;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests.Activator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Check the calculus of the URL of the referenced template when the Generator configuration is not in a Resource
 */
public class TemplateFileURLFromInTheAirTest extends AbstractTemplateFileURLTests {

	private static final String TEST_01_TEMPLATE_DECLARED_FILE_NAME = "platform:/plugin/org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests/resources/TemplateFileURL/InTheAir/Test_01_TemplateInPlatformPluginURI.dotx"; //$NON-NLS-1$

	private static final String TEST_02_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_02_TEMPLATE_FILE_NAME = "Test_02_TemplateWithPlatformResourceURI.dotx"; //$NON-NLS-1$
	private static final String TEST_02_DECLARED_TEMPLATE_FILE_NAME = "platform:/resource/" + PROJECT_NAME + "/" + TEST_02_FOLDER + "/" + TEST_02_TEMPLATE_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

	private static final String TEST_03_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_03_TEMPLATE_FILE_NAME = "Test_03_TemplateWithPlatformResourceURI.dotx"; //$NON-NLS-1$
	private static final String TEST_03_DECLARED_TEMPLATE_FILE_NAME = TEST_03_FOLDER + "/" + TEST_03_TEMPLATE_FILE_NAME; //$NON-NLS-1$


	private void checkCreatedURL(final URL url) {
		Assert.assertNotNull("The URL must not be null", url); //$NON-NLS-1$
		File f = null;
		try {
			f = new File(url.toURI());
		} catch (URISyntaxException e1) {
			Activator.log.error(e1);
		}
		Assert.assertNotNull(NLS.bind("The file can't be created from url {0}", url), f); //$NON-NLS-1$
		Assert.assertTrue(NLS.bind("The file with the url {0} doesn't exist", url), f.exists()); //$NON-NLS-1$
	}

	@Test
	public void test_01_TemplateInPlatformPluginURI() {
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration();
		conf.setTemplateFile(TEST_01_TEMPLATE_DECLARED_FILE_NAME);
		Assert.assertNull(conf.eResource());
		checkCreatedURL(conf.createTemplateFileInputAccessor().createInputFileURL());
	}

	@Test
	public void test_02_TemplateInPlatformResourceURI() {
		createFileInProject(TEST_02_FOLDER, TEST_02_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration();
		conf.setTemplateFile(TEST_02_DECLARED_TEMPLATE_FILE_NAME);
		Assert.assertNull(conf.eResource());
		checkCreatedURL(conf.createTemplateFileInputAccessor().createInputFileURL());
	}

	@Test
	public void test_03_TemplateWithRelativeURI() {
		createFileInProject(TEST_03_FOLDER, TEST_03_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration();
		conf.setTemplateFile(TEST_03_DECLARED_TEMPLATE_FILE_NAME);
		Assert.assertNull(conf.eResource());
		Assert.assertNull(conf.createTemplateFileInputAccessor().createInputFileURL());
	}

}
