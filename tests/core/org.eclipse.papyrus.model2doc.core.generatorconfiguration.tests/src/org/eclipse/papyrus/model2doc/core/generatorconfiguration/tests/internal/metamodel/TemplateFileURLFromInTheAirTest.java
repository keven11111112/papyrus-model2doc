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

import java.net.URL;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.junit.Assert;
import org.junit.Test;

/**
 * Check the calculus of the URL of the referenced template when the Generator configuration is not in a Resource
 */
public class TemplateFileURLFromInTheAirTest extends AbstractTemplateFileURLTests {

	private static final String TEST_01_TEMPLATE_DECLARED_FILE_NAME = "platform:/plugin/org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests/resources/TemplateFileURL/PlatformResource/Test_01_TemplateInPlatformPluginURI.dotx"; //$NON-NLS-1$

	private static final String TEST_02_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_02_TEMPLATE_FILE_NAME = "Test_02_TemplateWithPlatformResourceURI.dotx"; //$NON-NLS-1$
	private static final String TEST_02_DECLARED_TEMPLATE_FILE_NAME = "platform:/resource/" + PROJECT_NAME + "/" + TEST_02_FOLDER + "/" + TEST_02_TEMPLATE_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

	private static final String TEST_03_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_03_TEMPLATE_FILE_NAME = "Test_03_TemplateWithPlatformResourceURI.dotx"; //$NON-NLS-1$
	private static final String TEST_03_DECLARED_TEMPLATE_FILE_NAME = TEST_03_FOLDER + "/" + TEST_03_TEMPLATE_FILE_NAME; //$NON-NLS-1$


	protected void checkCreatedURL(final URL url, final String expectedEndResult) {
		if (expectedEndResult == null) {
			Assert.assertNull(url);
		} else {
			url.toString().endsWith(expectedEndResult);
		}
	}

	protected String buildExpectedTemplateURIAsString(final String folderName, final String templateName) {
		return this.projectForTest.getName() + "/" + folderName + "/" + templateName; //$NON-NLS-1$ //$NON-NLS-2$
	}


	@Test
	public void test_01_TemplateInPlatformPluginURI() {
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration();
		conf.setTemplateFile(TEST_01_TEMPLATE_DECLARED_FILE_NAME);
		Assert.assertNull(conf.eResource());

		final String expectedResult = "/resources/TemplateFileURL/PlatformResource/Test_01_TemplateInPlatformPluginURI.dotx/"; //$NON-NLS-1$
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	@Test
	public void test_02_TemplateInPlatformResourceURI() {
		createFileInProject(TEST_02_FOLDER, TEST_02_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration();
		conf.setTemplateFile(TEST_02_DECLARED_TEMPLATE_FILE_NAME);
		Assert.assertNull(conf.eResource());
		final String expectedResult = buildExpectedTemplateURIAsString(TEST_02_FOLDER, TEST_02_TEMPLATE_FILE_NAME);
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	@Test
	public void test_03_TemplateWithRelativeURI() {
		createFileInProject(TEST_03_FOLDER, TEST_03_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration();
		conf.setTemplateFile(TEST_03_DECLARED_TEMPLATE_FILE_NAME);
		Assert.assertNull(conf.eResource());
		final String expectedResult = null;
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);

	}

}
