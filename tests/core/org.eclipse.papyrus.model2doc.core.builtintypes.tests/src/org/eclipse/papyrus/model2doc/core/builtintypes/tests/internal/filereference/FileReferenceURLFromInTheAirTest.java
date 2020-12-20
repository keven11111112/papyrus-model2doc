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
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.builtintypes.DefaultFileReference;
import org.eclipse.papyrus.model2doc.core.builtintypes.tests.Activator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Check the calculus of the URL of the referenced file path when the {@link DefaultFileReference}
 */
public class FileReferenceURLFromInTheAirTest extends AbstractFileReferenceURLTests {

	private static final String TEST_01_FILE_REFERENCE_DECLARED_FILE_NAME = "platform:/plugin/org.eclipse.papyrus.model2doc.core.builtintypes.tests/resources/FileReferenceURL/InTheAir/Test_01_FileReferenceInPlatformPluginURI.txt"; //$NON-NLS-1$

	private static final String TEST_02_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_02_FILE_REFERENCE_FILE_NAME = "Test_02_FileReferenceWithPlatformResourceURI.txt"; //$NON-NLS-1$
	private static final String TEST_02_DECLARED_FILE_REFERENCE_FILE_NAME = "platform:/resource/" + PROJECT_NAME + "/" + TEST_02_FOLDER + "/" + TEST_02_FILE_REFERENCE_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

	private static final String TEST_03_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_03_FILE_REFERENCE_FILE_NAME = "Test_03_FileReferenceWithPlatformResourceURI.txt"; //$NON-NLS-1$
	private static final String TEST_03_DECLARED_FILE_REFERENCE_FILE_NAME = TEST_03_FOLDER + "/" + TEST_03_FILE_REFERENCE_FILE_NAME; //$NON-NLS-1$


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
		final DefaultFileReference conf = createFileReference();
		conf.setFilePath(TEST_01_FILE_REFERENCE_DECLARED_FILE_NAME);
		Assert.assertNull(conf.eResource());
		checkCreatedURL(conf.getFileAccessor().createFileURL());
	}

	@Test
	public void test_02_FileReferenceInPlatformResourceURI() {
		createFileInProject(TEST_02_FOLDER, TEST_02_FILE_REFERENCE_FILE_NAME);
		final DefaultFileReference conf = createFileReference();
		conf.setFilePath(TEST_02_DECLARED_FILE_REFERENCE_FILE_NAME);
		Assert.assertNull(conf.eResource());
		checkCreatedURL(conf.getFileAccessor().createFileURL());
	}

	@Test
	public void test_03_FileReferenceWithRelativeURI() {
		createFileInProject(TEST_03_FOLDER, TEST_03_FILE_REFERENCE_FILE_NAME);
		final DefaultFileReference conf = createFileReference();
		conf.setFilePath(TEST_03_DECLARED_FILE_REFERENCE_FILE_NAME);
		Assert.assertNull(conf.eResource());
		Assert.assertNull(conf.getFileAccessor().createFileURL());
	}

}
