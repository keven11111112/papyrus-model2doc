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
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests.Activator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Check the calculus of the URL of the referenced template when the Generator configuration is in a Plaform plugin
 */
public class TemplateFileURLFromPlatformPluginTest extends AbstractGeneratorConfigurationTests {


	private static final String TEST_01 = "Test_01_TemplateInPlatformPluginURI.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_02 = "Test_02_TemplateWithRelativeURI.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_03 = "Test_03_TemplateWithRelativeURI.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_04 = "Test_04_TemplateURI With Spaces.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_05 = "Test_05_TemplateURIWithAccentuatedCharéàù.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_06 = "Test_06_TemplateInAnotherFolder.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_07 = "Test_07_TemplateInAnotherFolder With Spaces.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_08 = "Test_08_TemplateInAnotherFolderWithAccentuatedCharéàù.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_09 = "Test_09_NullTemplateURI.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_10 = "Test_10_EmptyTemplateURI.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_11 = "Test_11_TemplateNotFound.generatorConfiguration"; //$NON-NLS-1$
	private static final String TEST_12 = "Test_12_TemplateInPlatformResource.generatorConfiguration"; //$NON-NLS-1$


	private final URI createURI(final String fileName) {
		URI uri = URI.createPlatformPluginURI("org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests/resources/TemplateFileURL/PlatformPlugin", true); //$NON-NLS-1$
		uri = uri.appendSegment(fileName);
		return uri;
	}

	private URL getTemplateURL(final URI modelURi) {
		final ResourceSet set = new ResourceSetImpl();
		final Resource res = set.getResource(modelURi, true);
		Assert.assertTrue(res.getContents().size() > 0);
		final EObject root = res.getContents().get(0);
		Assert.assertTrue(root instanceof DefaultDocumentGeneratorConfiguration);
		DefaultDocumentGeneratorConfiguration conf = (DefaultDocumentGeneratorConfiguration) root;
		return conf.createTemplateFileURL();
	}

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
		final URL templateURL = getTemplateURL(createURI(TEST_01));
		checkCreatedURL(templateURL);
	}

	@Test
	public void test_02_TemplateWithRelativeURI() {
		final URL templateURL = getTemplateURL(createURI(TEST_02));
		Assert.assertNull(templateURL);
	}

	@Test
	public void test_03_TemplateWithRelativeURI() {
		final URL templateURL = getTemplateURL(createURI(TEST_03));
		Assert.assertNull(templateURL);
	}

	@Test
	public void test_04_TemplateURIWithSpaces() {
		final URL templateURL = getTemplateURL(createURI(TEST_04));
		checkCreatedURL(templateURL);
	}

	@Test
	public void test_05_TemplateURIWithAccentuatedChar() {
		final URL templateURL = getTemplateURL(createURI(TEST_05));
		checkCreatedURL(templateURL);
	}

	@Test
	public void test_06_TemplateInAnotherFolder() {
		final URL templateURL = getTemplateURL(createURI(TEST_06));
		checkCreatedURL(templateURL);
	}

	@Test
	public void test_07_TemplateInAnotherFolderWithSpaces() {
		final URL templateURL = getTemplateURL(createURI(TEST_07));
		checkCreatedURL(templateURL);
	}

	@Test
	public void test_08_TemplateInAnotherFolderWithAccentuatedChar() {
		final URL templateURL = getTemplateURL(createURI(TEST_08));
		checkCreatedURL(templateURL);
	}

	@Test
	public void test_09_NullTemplateURI() {
		final URL templateURL = getTemplateURL(createURI(TEST_09));
		Assert.assertNull(templateURL);
	}

	@Test
	public void test_10_EmptyTemplateURI() {
		final URL templateURL = getTemplateURL(createURI(TEST_10));
		Assert.assertNull(templateURL);
	}

	@Test
	public void test_11_TemplateNotFound() {
		final URL templateURL = getTemplateURL(createURI(TEST_11));
		Assert.assertNull(templateURL);
	}

	/**
	 * this case must not be able excepted if the developer made a mistake
	 */
	@Test
	public void test_12_TemplateInPlatformResource() {
		// we create a real project, with an real file, the goal is to check we don't found it
		final URI uri = createURI(TEST_12);
		ResourceSet rSet = new ResourceSetImpl();
		final Resource res = rSet.getResource(uri, true);
		final DefaultDocumentGeneratorConfiguration conf = (DefaultDocumentGeneratorConfiguration) res.getContents().get(0);
		final String filePath = conf.getTemplateFile();
		// create an empty resource to be sure it is available for the tests
		// the goal of this test is to NOT find it. (we refuse the reference of a platform:/resource from a platform:/plugin
		final URI txtFileURI = URI.createURI(filePath);
		final String projectName = txtFileURI.segment(1);
		final IProject project = createProject(projectName);
		final Resource txtFile = rSet.createResource(txtFileURI);
		try {
			txtFile.save(null);
		} catch (IOException e) {
			Activator.log.error(e);
		}
		Assert.assertNotNull(txtFile);

		final URL templateURL = getTemplateURL(uri);
		Assert.assertNull(templateURL);
		destroyProject(project);
	}

}
