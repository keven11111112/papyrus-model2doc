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

package org.eclipse.papyrus.model2doc.emf.documentstructure.tests.internal.images;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.builtintypes.DefaultFileReference;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Image;
import org.eclipse.papyrus.model2doc.emf.documentstructure.tests.Activator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Check the calculus of the URL of the referenced file when {@link DefaultFileReference} is in a Plaform resource
 */
public class ImageURLFromPlatformResourceTest extends AbstractImageURLTests {

	private static final String TEST_01_DECLARED_REFERENCED_FILE_NAME = "platform:/plugin/org.eclipse.papyrus.model2doc.emf.documentstructure.tests/resources/ImageURL/PlatformResource/Test_01_ImageInPlatformPluginURI.png"; //$NON-NLS-1$

	private static final String TEST_02_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_02_REFERENCED_FILE_NAME = "Test_02_ImageWithRelativeURI.png"; //$NON-NLS-1$
	private static final String TEST_02_DECLARED_REFERENCED_FILE_NAME = TEST_02_FOLDER + "/" + TEST_02_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_03_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_03_REFERENCED_FILE_NAME = "Test_03_ImageWithRelativeURI.png"; //$NON-NLS-1$
	private static final String TEST_03_DECLARED_REFERENCED_FILE_NAME = "/" + TEST_03_FOLDER + "/" + TEST_03_REFERENCED_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$

	private static final String TEST_04_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_04_REFERENCED_FILE_NAME = "Test_04_ImageURI With Spaces.png"; //$NON-NLS-1$
	private static final String TEST_04_DECLARED_REFERENCED_FILE_NAME = TEST_04_FOLDER + "/" + TEST_04_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_05_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_05_REFERENCED_FILE_NAME = "Test_05_ImageURIWithAccentuatedCharéàù.png"; //$NON-NLS-1$
	private static final String TEST_05_DECLARED_REFERENCED_FILE_NAME = TEST_05_FOLDER + "/" + TEST_05_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_06_FOLDER = "AnotherFolder"; //$NON-NLS-1$
	private static final String TEST_06_REFERENCED_FILE_NAME = "Test_06_ImageInAnotherFolder.png"; //$NON-NLS-1$
	private static final String TEST_06_DECLARED_REFERENCED_FILE_NAME = TEST_06_FOLDER + "/" + TEST_06_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_07_FOLDER = "AnotherFolder With Spaces"; //$NON-NLS-1$
	private static final String TEST_07_REFERENCED_FILE_NAME = "Test_07_ImageInAnotherFolder With Spaces.png"; //$NON-NLS-1$
	private static final String TEST_07_DECLARED_REFERENCED_FILE_NAME = TEST_07_FOLDER + "/" + TEST_07_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_08_FOLDER = "AnotherFolderWithAccentuatedCharéàù"; //$NON-NLS-1$
	private static final String TEST_08_REFERENCED_FILE_NAME = "Test_08_ImageInAnotherFolderWithAccentuatedCharéàù.png"; //$NON-NLS-1$
	private static final String TEST_08_DECLARED_REFERENCED_FILE_NAME = TEST_08_FOLDER + "/" + TEST_08_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_09_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_09_REFERENCED_FILE_NAME = null;
	private static final String TEST_09_DECLARED_REFERENCED_FILE_NAME = TEST_09_FOLDER + "/" + TEST_09_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_10_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_10_REFERENCED_FILE_NAME = ""; //$NON-NLS-1$
	private static final String TEST_10_DECLARED_REFERENCED_FILE_NAME = TEST_10_FOLDER + "/" + TEST_10_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_11_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_11_REFERENCED_FILE_NAME = "fantom.png"; //$NON-NLS-1$
	private static final String TEST_11_DECLARED_REFERENCED_FILE_NAME = TEST_11_FOLDER + "/" + TEST_11_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_12_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_12_REFERENCED_FILE_NAME = "Test_12_ImageInPlatformResourceURI.png"; //$NON-NLS-1$
	private static final String TEST_12_DECLARED_REFERENCED_FILE_NAME = "platform:/resource/" + PROJECT_NAME + "/" + TEST_12_FOLDER + "/" + TEST_12_REFERENCED_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$


	private static final String TEST_13_REFERENCED_FILE_NAME = "Test_13_ImageInPlatformResourceURI.png"; //$NON-NLS-1$
	private static final String TEST_13_DECLARED_REFERENCED_FILE_NAME = "C:/Somewhereplatform" + "/" + TEST_13_REFERENCED_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$


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
	public void test_01_ImageInPlatformPluginURI() {
		final Image imageReference = createImageFileReference(TEST_01_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_02_ImageWithRelativeURI() {
		createFileInProject(TEST_02_FOLDER, TEST_02_REFERENCED_FILE_NAME);
		final Image imageReference = createImageFileReference(TEST_02_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_03_ImageWithRelativeURI() {
		createFileInProject(TEST_03_FOLDER, TEST_03_REFERENCED_FILE_NAME);
		final Image imageReference = createImageFileReference(TEST_03_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_04_ImageURIWithSpaces() {
		createFileInProject(TEST_04_FOLDER, TEST_04_REFERENCED_FILE_NAME);
		final Image imageReference = createImageFileReference(TEST_04_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_05_ImageURIWithAccentuatedChar() {
		createFileInProject(TEST_05_FOLDER, TEST_05_REFERENCED_FILE_NAME);
		final Image imageReference = createImageFileReference(TEST_05_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_06_ImageInAnotherFolder() {
		createFileInProject(TEST_06_FOLDER, TEST_06_REFERENCED_FILE_NAME);
		final Image imageReference = createImageFileReference(TEST_06_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_07_ImageInAnotherFolderWithSpaces() {
		createFileInProject(TEST_07_FOLDER, TEST_07_REFERENCED_FILE_NAME);
		final Image imageReference = createImageFileReference(TEST_07_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_08_ImageInAnotherFolderWithAccentuatedChar() {
		createFileInProject(TEST_08_FOLDER, TEST_08_REFERENCED_FILE_NAME);
		final Image imageReference = createImageFileReference(TEST_08_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_09_NullFileReferenceURI() {
		final Image imageReference = createImageFileReference(TEST_09_DECLARED_REFERENCED_FILE_NAME);
		Assert.assertNull(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_10_EmptyFileReferenceURI() {
		final Image imageReference = createImageFileReference(TEST_10_DECLARED_REFERENCED_FILE_NAME);
		Assert.assertNull(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_11_ImageNotFound() {
		createFolderInContainer(this.projectForTest, TEST_11_FOLDER); // we don't create the file in it the goal of the test
		final Image imageReference = createImageFileReference(TEST_11_DECLARED_REFERENCED_FILE_NAME);
		Assert.assertNull(imageReference.getFileAccessor().createFileURL());
	}

	/**
	 * this case must not be possible excepted if the developer made a mistake
	 */
	@Test
	public void test_12_ImageInPlatformResource() {
		createFileInProject(TEST_12_FOLDER, TEST_12_REFERENCED_FILE_NAME);
		final Image imageReference = createImageFileReference(TEST_12_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(imageReference.getFileAccessor().createFileURL());
	}

	@Test
	public void test_13_ImageURIOSPath() {
		final Image imageReference = createImageFileReference(TEST_13_DECLARED_REFERENCED_FILE_NAME);
		Assert.assertNull(imageReference.getFileAccessor().createFileURL());
	}

}
