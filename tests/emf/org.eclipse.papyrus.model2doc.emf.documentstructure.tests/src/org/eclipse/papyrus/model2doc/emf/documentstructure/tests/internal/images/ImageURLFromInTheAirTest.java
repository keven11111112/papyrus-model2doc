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
import org.eclipse.papyrus.model2doc.emf.documentstructure.Image;
import org.eclipse.papyrus.model2doc.emf.documentstructure.tests.Activator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Check the calculus of the URL of the referenced image when the Generator configuration is not in a Resource
 */
public class ImageURLFromInTheAirTest extends AbstractImageURLTests {

	private static final String TEST_01_IMAGE_DECLARED_FILE_NAME = "platform:/plugin/org.eclipse.papyrus.model2doc.emf.documentstructure.tests/resources/ImageURL/InTheAir/Test_01_ImageInPlatformPluginURI.png"; //$NON-NLS-1$

	private static final String TEST_02_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_02_IMAGE_NAME = "Test_02_ImageWithPlatformResourceURI.dotx"; //$NON-NLS-1$
	private static final String TEST_02_DECLARED_IMAGE_NAME = "platform:/resource/" + PROJECT_NAME + "/" + TEST_02_FOLDER + "/" + TEST_02_IMAGE_NAME; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

	private static final String TEST_03_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_03_IMAGE_NAME = "Test_03_ImageWithPlatformResourceURI.dotx"; //$NON-NLS-1$
	private static final String TEST_03_DECLARED_IMAGE_NAME = TEST_03_FOLDER + "/" + TEST_03_IMAGE_NAME; //$NON-NLS-1$


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
		final Image image = createImage();
		image.setFilePath(TEST_01_IMAGE_DECLARED_FILE_NAME);
		Assert.assertNull(image.eResource());
		checkCreatedURL(image.getFileAccessor().createFileURL());
	}

	@Test
	public void test_02_ImageInPlatformResourceURI() {
		createFileInProject(TEST_02_FOLDER, TEST_02_IMAGE_NAME);
		final Image image = createImage();
		image.setFilePath(TEST_02_DECLARED_IMAGE_NAME);
		Assert.assertNull(image.eResource());
		checkCreatedURL(image.getFileAccessor().createFileURL());
	}

	@Test
	public void test_03_ImageWithRelativeURI() {
		createFileInProject(TEST_03_FOLDER, TEST_03_IMAGE_NAME);
		final Image image = createImage();
		image.setFilePath(TEST_03_DECLARED_IMAGE_NAME);
		Assert.assertNull(image.eResource());
		Assert.assertNull(image.getFileAccessor().createFileURL());
	}

}
