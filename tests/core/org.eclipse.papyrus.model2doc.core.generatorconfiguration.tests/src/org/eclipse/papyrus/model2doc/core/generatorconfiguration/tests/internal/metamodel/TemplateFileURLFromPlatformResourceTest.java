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
 * Check the calculus of the URL of the referenced template when the Generator configuration is in a Plaform resource
 */
public class TemplateFileURLFromPlatformResourceTest extends AbstractTemplateFileURLTests {

	private static final String TEST_01_TEMPLATE_DECLARED_FILE_NAME = "platform:/plugin/org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests/resources/TemplateFileURL/PlatformResource/Test_01_TemplateInPlatformPluginURI.dotx"; //$NON-NLS-1$

	private static final String TEST_02_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_02_TEMPLATE_FILE_NAME = "Test_02_TemplateWithRelativeURI.dotx"; //$NON-NLS-1$
	private static final String TEST_02_DECLARED_TEMPLATE_FILE_NAME = TEST_02_FOLDER + "/" + TEST_02_TEMPLATE_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_03_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_03_TEMPLATE_FILE_NAME = "Test_03_TemplateWithRelativeURI.dotx"; //$NON-NLS-1$
	private static final String TEST_03_DECLARED_TEMPLATE_FILE_NAME = "/" + TEST_03_FOLDER + "/" + TEST_03_TEMPLATE_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$

	private static final String TEST_04_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_04_TEMPLATE_FILE_NAME = "Test_04_TemplateURI With Spaces.dotx"; //$NON-NLS-1$
	private static final String TEST_04_DECLARED_TEMPLATE_FILE_NAME = TEST_04_FOLDER + "/" + TEST_04_TEMPLATE_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_05_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_05_TEMPLATE_FILE_NAME = "Test_05_TemplateURIWithAccentuatedCharéàù.dotx"; //$NON-NLS-1$
	private static final String TEST_05_DECLARED_TEMPLATE_FILE_NAME = TEST_05_FOLDER + "/" + TEST_05_TEMPLATE_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_06_FOLDER = "AnotherFolder"; //$NON-NLS-1$
	private static final String TEST_06_TEMPLATE_FILE_NAME = "Test_06_TemplateInAnotherFolder.dotx"; //$NON-NLS-1$
	private static final String TEST_06_DECLARED_TEMPLATE_FILE_NAME = TEST_06_FOLDER + "/" + TEST_06_TEMPLATE_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_07_FOLDER = "AnotherFolder With Spaces"; //$NON-NLS-1$
	private static final String TEST_07_TEMPLATE_FILE_NAME = "Test_07_TemplateInAnotherFolder With Spaces.dotx"; //$NON-NLS-1$
	private static final String TEST_07_DECLARED_TEMPLATE_FILE_NAME = TEST_07_FOLDER + "/" + TEST_07_TEMPLATE_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_08_FOLDER = "AnotherFolderWithAccentuatedCharéàù"; //$NON-NLS-1$
	private static final String TEST_08_TEMPLATE_FILE_NAME = "Test_08_TemplateInAnotherFolderWithAccentuatedCharéàù.dotx"; //$NON-NLS-1$
	private static final String TEST_08_DECLARED_TEMPLATE_FILE_NAME = TEST_08_FOLDER + "/" + TEST_08_TEMPLATE_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_09_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_09_TEMPLATE_FILE_NAME = null;
	private static final String TEST_09_DECLARED_TEMPLATE_FILE_NAME = TEST_09_FOLDER + "/" + TEST_09_TEMPLATE_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_10_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_10_TEMPLATE_FILE_NAME = ""; //$NON-NLS-1$
	private static final String TEST_10_DECLARED_TEMPLATE_FILE_NAME = TEST_10_FOLDER + "/" + TEST_10_TEMPLATE_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_11_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_11_TEMPLATE_FILE_NAME = "fantom.dotx"; //$NON-NLS-1$
	private static final String TEST_11_DECLARED_TEMPLATE_FILE_NAME = TEST_11_FOLDER + "/" + TEST_11_TEMPLATE_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_12_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_12_TEMPLATE_FILE_NAME = "Test_12_TemplateInPlatformResourceURI"; //$NON-NLS-1$
	private static final String TEST_12_DECLARED_TEMPLATE_FILE_NAME = "platform:/resource/" + PROJECT_NAME + "/" + TEST_12_FOLDER + "/" + TEST_12_TEMPLATE_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$


	private static final String TEST_13_TEMPLATE_FILE_NAME = "Test_13_TemplateInPlatformResourceURI"; //$NON-NLS-1$
	private static final String TEST_13_DECLARED_TEMPLATE_FILE_NAME = "C:/Somewhereplatform" + "/" + TEST_13_TEMPLATE_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$


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
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_01_TEMPLATE_DECLARED_FILE_NAME);
		final String expectedResult = "org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests/resources/TemplateFileURL/PlatformPlugin/Test_01_TemplateInPlatformPluginURI.dotx"; //$NON-NLS-1$
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	@Test
	public void test_02_TemplateWithRelativeURI() {
		createFileInProject(TEST_02_FOLDER, TEST_02_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_02_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = buildExpectedTemplateURIAsString(TEST_02_FOLDER, TEST_02_TEMPLATE_FILE_NAME);
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	@Test
	public void test_03_TemplateWithRelativeURI() {
		createFileInProject(TEST_03_FOLDER, TEST_03_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_03_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = buildExpectedTemplateURIAsString(TEST_03_FOLDER, TEST_03_TEMPLATE_FILE_NAME);
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	@Test
	public void test_04_TemplateURIWithSpaces() {
		createFileInProject(TEST_04_FOLDER, TEST_04_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_04_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = buildExpectedTemplateURIAsString(TEST_04_FOLDER, TEST_04_TEMPLATE_FILE_NAME);
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	@Test
	public void test_05_TemplateURIWithAccentuatedChar() {
		createFileInProject(TEST_05_FOLDER, TEST_05_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_05_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = buildExpectedTemplateURIAsString(TEST_05_FOLDER, TEST_05_TEMPLATE_FILE_NAME);
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}


	@Test
	public void test_06_TemplateInAnotherFolder() {
		createFileInProject(TEST_06_FOLDER, TEST_06_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_06_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = buildExpectedTemplateURIAsString(TEST_06_FOLDER, TEST_06_TEMPLATE_FILE_NAME);
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	@Test
	public void test_07_TemplateInAnotherFolderWithSpaces() {
		createFileInProject(TEST_07_FOLDER, TEST_07_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_07_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = buildExpectedTemplateURIAsString(TEST_07_FOLDER, TEST_07_TEMPLATE_FILE_NAME);
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	@Test
	public void test_08_TemplateInAnotherFolderWithAccentuatedChar() {
		createFileInProject(TEST_08_FOLDER, TEST_08_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_08_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = buildExpectedTemplateURIAsString(TEST_08_FOLDER, TEST_08_TEMPLATE_FILE_NAME);
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);

	}

	@Test
	public void test_09_NullTemplateURI() {
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_09_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = null;
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	@Test
	public void test_10_EmptyTemplateURI() {
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_10_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = null;
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	@Test
	public void test_11_TemplateNotFound() {
		createFolderInContainer(this.projectForTest, TEST_11_FOLDER); // we don't create the file in it the goal of the test
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_11_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = null;
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}

	/**
	 * this case must not be possible excepted if the developer made a mistake
	 */
	@Test
	public void test_12_TemplateInPlatformResource() {
		createFileInProject(TEST_12_FOLDER, TEST_12_TEMPLATE_FILE_NAME);
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_12_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = buildExpectedTemplateURIAsString(TEST_12_FOLDER, TEST_12_TEMPLATE_FILE_NAME);
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}


	@Test
	public void test_13_TemplateURIOSPath() {
		final DefaultDocumentGeneratorConfiguration conf = createDefaultDocumentGeneratorConfiguration(TEST_13_DECLARED_TEMPLATE_FILE_NAME);
		final String expectedResult = null;
		checkCreatedURL(conf.createTemplateFileURL(), expectedResult);
	}


}
