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
import org.eclipse.papyrus.model2doc.core.builtintypes.IFileReference;
import org.eclipse.papyrus.model2doc.core.builtintypes.tests.Activator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Check the calculus of the URL of the referenced file when {@link DefaultFileReference} is in a Plaform resource
 */
public class FileReferenceURLFromPlatformResourceTest extends AbstractFileReferenceURLTests {

	private static final String TEST_01_DECLARED_REFERENCED_FILE_NAME = "platform:/plugin/org.eclipse.papyrus.model2doc.core.builtintypes.tests/resources/FileReferenceURL/PlatformResource/Test_01_FileReferenceInPlatformPluginURI.txt"; //$NON-NLS-1$

	private static final String TEST_02_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_02_REFERENCED_FILE_NAME = "Test_02_FileReferenceWithRelativeURI.txt"; //$NON-NLS-1$
	private static final String TEST_02_DECLARED_REFERENCED_FILE_NAME = TEST_02_FOLDER + "/" + TEST_02_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_03_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_03_REFERENCED_FILE_NAME = "Test_03_FileReferenceWithRelativeURI.txt"; //$NON-NLS-1$
	private static final String TEST_03_DECLARED_REFERENCED_FILE_NAME = "/" + TEST_03_FOLDER + "/" + TEST_03_REFERENCED_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$

	private static final String TEST_04_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_04_REFERENCED_FILE_NAME = "Test_04_FileReferenceURI With Spaces.txt"; //$NON-NLS-1$
	private static final String TEST_04_DECLARED_REFERENCED_FILE_NAME = TEST_04_FOLDER + "/" + TEST_04_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_05_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_05_REFERENCED_FILE_NAME = "Test_05_FileReferenceURIWithAccentuatedCharéàù.txt"; //$NON-NLS-1$
	private static final String TEST_05_DECLARED_REFERENCED_FILE_NAME = TEST_05_FOLDER + "/" + TEST_05_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_06_FOLDER = "AnotherFolder"; //$NON-NLS-1$
	private static final String TEST_06_REFERENCED_FILE_NAME = "Test_06_FileReferenceInAnotherFolder.txt"; //$NON-NLS-1$
	private static final String TEST_06_DECLARED_REFERENCED_FILE_NAME = TEST_06_FOLDER + "/" + TEST_06_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_07_FOLDER = "AnotherFolder With Spaces"; //$NON-NLS-1$
	private static final String TEST_07_REFERENCED_FILE_NAME = "Test_07_FileReferenceInAnotherFolder With Spaces.txt"; //$NON-NLS-1$
	private static final String TEST_07_DECLARED_REFERENCED_FILE_NAME = TEST_07_FOLDER + "/" + TEST_07_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_08_FOLDER = "AnotherFolderWithAccentuatedCharéàù"; //$NON-NLS-1$
	private static final String TEST_08_REFERENCED_FILE_NAME = "Test_08_FileReferenceInAnotherFolderWithAccentuatedCharéàù.txt"; //$NON-NLS-1$
	private static final String TEST_08_DECLARED_REFERENCED_FILE_NAME = TEST_08_FOLDER + "/" + TEST_08_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_09_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_09_REFERENCED_FILE_NAME = null;
	private static final String TEST_09_DECLARED_REFERENCED_FILE_NAME = TEST_09_FOLDER + "/" + TEST_09_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_10_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_10_REFERENCED_FILE_NAME = ""; //$NON-NLS-1$
	private static final String TEST_10_DECLARED_REFERENCED_FILE_NAME = TEST_10_FOLDER + "/" + TEST_10_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_11_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_11_REFERENCED_FILE_NAME = "fantom.txt"; //$NON-NLS-1$
	private static final String TEST_11_DECLARED_REFERENCED_FILE_NAME = TEST_11_FOLDER + "/" + TEST_11_REFERENCED_FILE_NAME; //$NON-NLS-1$

	private static final String TEST_12_FOLDER = "resources"; //$NON-NLS-1$
	private static final String TEST_12_REFERENCED_FILE_NAME = "Test_12_FileReferenceInPlatformResourceURI.txt"; //$NON-NLS-1$
	private static final String TEST_12_DECLARED_REFERENCED_FILE_NAME = "platform:/resource/" + PROJECT_NAME + "/" + TEST_12_FOLDER + "/" + TEST_12_REFERENCED_FILE_NAME; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$


	private static final String TEST_13_REFERENCED_FILE_NAME = "Test_13_FileReferenceInPlatformResourceURI.txt"; //$NON-NLS-1$
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
	public void test_01_FileReferenceInPlatformPluginURI() {
		final IFileReference iFileReference = createFileReference(TEST_01_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(iFileReference.getFileAccessor().createInputFileURL());
	}

	// TODO : check me
	@Test
	public void test_02_FileReferenceWithRelativeURI() {
		createFileInProject(TEST_02_FOLDER, TEST_02_REFERENCED_FILE_NAME);
		final IFileReference iFileReference = createFileReference(TEST_02_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(iFileReference.getFileAccessor().createInputFileURL());
	}

	@Test
	public void test_03_FileReferenceWithRelativeURI() {
		createFileInProject(TEST_03_FOLDER, TEST_03_REFERENCED_FILE_NAME);
		final IFileReference iFileReference = createFileReference(TEST_03_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(iFileReference.getFileAccessor().createInputFileURL());
	}

	@Test
	public void test_04_FileReferenceURIWithSpaces() {
		createFileInProject(TEST_04_FOLDER, TEST_04_REFERENCED_FILE_NAME);
		final IFileReference iFileReference = createFileReference(TEST_04_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(iFileReference.getFileAccessor().createInputFileURL());
	}

	@Test
	public void test_05_FileReferenceURIWithAccentuatedChar() {
		createFileInProject(TEST_05_FOLDER, TEST_05_REFERENCED_FILE_NAME);
		final IFileReference iFileReference = createFileReference(TEST_05_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(iFileReference.getFileAccessor().createInputFileURL());
	}

	@Test
	public void test_06_FileReferenceInAnotherFolder() {
		createFileInProject(TEST_06_FOLDER, TEST_06_REFERENCED_FILE_NAME);
		final IFileReference iFileReference = createFileReference(TEST_06_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(iFileReference.getFileAccessor().createInputFileURL());
	}

	@Test
	public void test_07_FileReferenceInAnotherFolderWithSpaces() {
		createFileInProject(TEST_07_FOLDER, TEST_07_REFERENCED_FILE_NAME);
		final IFileReference iFileReference = createFileReference(TEST_07_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(iFileReference.getFileAccessor().createInputFileURL());
	}

	@Test
	public void test_08_FileReferenceInAnotherFolderWithAccentuatedChar() {
		createFileInProject(TEST_08_FOLDER, TEST_08_REFERENCED_FILE_NAME);
		final IFileReference iFileReference = createFileReference(TEST_08_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(iFileReference.getFileAccessor().createInputFileURL());
	}

	@Test
	public void test_09_NullFileReferenceURI() {
		final IFileReference iFileReference = createFileReference(TEST_09_DECLARED_REFERENCED_FILE_NAME);
		Assert.assertNull(iFileReference.getFileAccessor().createInputFileURL());
	}

	@Test
	public void test_10_EmptyFileReferenceURI() {
		final IFileReference iFileReference = createFileReference(TEST_10_DECLARED_REFERENCED_FILE_NAME);
		Assert.assertNull(iFileReference.getFileAccessor().createInputFileURL());
	}

	@Test
	public void test_11_FileReferenceNotFound() {
		createFolderInContainer(this.projectForTest, TEST_11_FOLDER); // we don't create the file in it the goal of the test
		final IFileReference iFileReference = createFileReference(TEST_11_DECLARED_REFERENCED_FILE_NAME);
		Assert.assertNull(iFileReference.getFileAccessor().createInputFileURL());
	}

	/**
	 * this case must not be possible excepted if the developer made a mistake
	 */
	@Test
	public void test_12_FileReferenceInPlatformResource() {
		createFileInProject(TEST_12_FOLDER, TEST_12_REFERENCED_FILE_NAME);
		final IFileReference iFileReference = createFileReference(TEST_12_DECLARED_REFERENCED_FILE_NAME);
		checkCreatedURL(iFileReference.getFileAccessor().createInputFileURL());
	}


	@Test
	public void test_13_FileReferenceURIOSPath() {
		final IFileReference iFileReference = createFileReference(TEST_13_DECLARED_REFERENCED_FILE_NAME);
		Assert.assertNull(iFileReference.getFileAccessor().createInputFileURL());
	}

}
