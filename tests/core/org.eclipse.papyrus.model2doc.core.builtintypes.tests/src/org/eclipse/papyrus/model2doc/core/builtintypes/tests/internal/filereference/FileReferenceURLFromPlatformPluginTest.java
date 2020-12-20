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

package org.eclipse.papyrus.model2doc.core.builtintypes.tests.internal.filereference;

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
import org.eclipse.papyrus.model2doc.core.builtintypes.DefaultFileReference;
import org.eclipse.papyrus.model2doc.core.builtintypes.IFileReference;
import org.eclipse.papyrus.model2doc.core.builtintypes.tests.Activator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Check the calculus of the URL of the referenced file when {@link DefaultFileReference} is in a Plaform plugin
 */
public class FileReferenceURLFromPlatformPluginTest extends AbstractBuiltInTypesTests {


	private static final String TEST_01 = "Test_01_FileReferenceInPlatformPluginURI.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_02 = "Test_02_FileReferenceWithRelativeURI.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_03 = "Test_03_FileReferenceWithRelativeURI.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_04 = "Test_04_FileReferenceURI With Spaces.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_05 = "Test_05_FileReferenceURIWithAccentuatedCharéàù.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_06 = "Test_06_FileReferenceInAnotherFolder.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_07 = "Test_07_FileReferenceInAnotherFolder With Spaces.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_08 = "Test_08_FileReferenceInAnotherFolderWithAccentuatedCharéàù.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_09 = "Test_09_NullFileReferenceURI.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_10 = "Test_10_EmptyFileReferenceURI.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_11 = "Test_11_FileReferenceNotFound.builtInTypes"; //$NON-NLS-1$
	private static final String TEST_12 = "Test_12_FileReferenceInPlatformResource.builtInTypes"; //$NON-NLS-1$


	private final URI createURI(final String fileName) {
		URI uri = URI.createPlatformPluginURI("org.eclipse.papyrus.model2doc.core.builtintypes.tests/resources/FileReferenceURL/PlatformPlugin", true); //$NON-NLS-1$
		uri = uri.appendSegment(fileName);
		return uri;
	}

	private URL getFileReferenceURL(final URI modelURi) {
		final ResourceSet set = new ResourceSetImpl();
		final Resource res = set.getResource(modelURi, true);
		Assert.assertTrue(res.getContents().size() > 0);
		final EObject root = res.getContents().get(0);
		Assert.assertTrue(root instanceof DefaultFileReference);
		IFileReference fileReference = (DefaultFileReference) root;
		return fileReference.getFileAccessor().createFileURL();
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
	public void test_01_FileReferenceInPlatformPluginURI() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_01));
		checkCreatedURL(fileReference);
	}

	@Test
	public void test_02_FileReferenceWithRelativeURI() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_02));
		Assert.assertNull(fileReference);
	}

	@Test
	public void test_03_FileReferenceWithRelativeURI() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_03));
		Assert.assertNull(fileReference);
	}

	@Test
	public void test_04_FileReferenceURIWithSpaces() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_04));
		checkCreatedURL(fileReference);
	}

	@Test
	public void test_05_FileReferenceURIWithAccentuatedChar() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_05));
		checkCreatedURL(fileReference);
	}

	@Test
	public void test_06_FileReferenceInAnotherFolder() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_06));
		checkCreatedURL(fileReference);
	}

	@Test
	public void test_07_FileReferenceInAnotherFolderWithSpaces() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_07));
		checkCreatedURL(fileReference);
	}

	@Test
	public void test_08_FileReferenceInAnotherFolderWithAccentuatedChar() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_08));
		checkCreatedURL(fileReference);
	}

	@Test
	public void test_09_NullFileReferenceURI() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_09));
		Assert.assertNull(fileReference);
	}

	@Test
	public void test_10_EmptyFileReferenceURI() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_10));
		Assert.assertNull(fileReference);
	}

	@Test
	public void test_11_FileReferenceNotFound() {
		final URL fileReference = getFileReferenceURL(createURI(TEST_11));
		Assert.assertNull(fileReference);
	}

	/**
	 * this case must not be able excepted if the developer made a mistake
	 */
	@Test
	public void test_12_FileReferenceInPlatformResource() {
		// we create a real project, with an real file, the goal is to check we don't found it
		final URI uri = createURI(TEST_12);
		ResourceSet rSet = new ResourceSetImpl();
		final Resource res = rSet.getResource(uri, true);
		IFileReference fileRef = (IFileReference) res.getContents().get(0);
		final String filePath = fileRef.getFilePath();
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

		final URL fileReference = getFileReferenceURL(uri);
		Assert.assertNull(fileReference);

		destroyProject(project);
	}

}
