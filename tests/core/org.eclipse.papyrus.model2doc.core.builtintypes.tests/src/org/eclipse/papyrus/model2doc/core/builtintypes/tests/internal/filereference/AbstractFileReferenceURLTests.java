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

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.papyrus.model2doc.core.builtintypes.DefaultFileReference;
import org.eclipse.papyrus.model2doc.core.builtintypes.tests.Activator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

/**
 * Abstract class for tests on the calculus of Template File URL
 */
public abstract class AbstractFileReferenceURLTests extends AbstractBuiltInTypesTests {

	private static final Map<Object, Object> SAVE_OPTIONS = new HashMap<>();

	static {
		SAVE_OPTIONS.put(XMIResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
	}

	/**
	 * the name of the project created in the workspace
	 */
	protected static final String PROJECT_NAME = "org.eclipse.papyrus.model2doc.core.builtintypes.filereference.tests"; //$NON-NLS-1$

	/**
	 * the name of the project in the workspace the GeneratorConfiguration file
	 */
	private static final String RESOURCES = "resources"; //$NON-NLS-1$

	/**
	 * the name of the GeneratorConfiguration file
	 */
	private static final String FILE_REFERENCE_FILE_NAME = "fileReference"; //$NON-NLS-1$

	/**
	 * the file extension of the GeneratorFile
	 */
	private static final String BUILD_IN_TYPES_FILE_EXTENSION = "builtInTypes"; //$NON-NLS-1$

	/**
	 * the created project used to run the tests
	 */
	protected IProject projectForTest;

	/**
	 * the resource set used by the tests
	 */
	protected ResourceSet resourceSet;

	/**
	 * init the test
	 */
	@Before
	public void setUp() {
		this.projectForTest = createProject(PROJECT_NAME);
		Assert.assertNotNull(this.projectForTest);
		resourceSet = new ResourceSetImpl();
	}

	/**
	 * clean the test environment
	 */
	@After
	public void tearDown() {
		destroyProject(this.projectForTest);
		resourceSet = null;
	}


	/**
	 *
	 * @param parentResource
	 *            the parent resource
	 * @param folderName
	 *            the name of the folder to create in the parent resource
	 * @return
	 *         the created folder
	 */
	protected IFolder createFolderInContainer(final IContainer parentResource, final String folderName) {
		IFolder folder = parentResource.getFolder(new Path(folderName));
		try {
			folder.create(true, true, new NullProgressMonitor());
		} catch (CoreException e) {
			Activator.log.error(e);
		}
		return folder;
	}

	/**
	 *
	 * @param parentResource
	 *            the parent resource
	 * @param fileName
	 *            the name of the file to create
	 * @return
	 *         the created file
	 */
	protected IFile createFileInContainer(final IContainer parentResource, final String fileName) {
		final IFile file = parentResource.getFile(new Path(fileName));
		Assert.assertTrue(!file.exists());
		try {
			file.create(new InputStream() {

				@Override
				public int read() throws IOException {
					return -1;
				}
			}, true, new NullProgressMonitor());
		} catch (CoreException e) {
			Activator.log.error(e);
		}
		return file;
	}

	/**
	 * @param folderName
	 *            a folder to create in the project
	 * @param fileName
	 *            the name of a file to create inside the folder
	 */
	protected void createFileInProject(final String folderName, final String fileName) {
		final IFolder folder = createFolderInContainer(this.projectForTest, folderName);
		Assert.assertNotNull(folder);
		final IFile file = createFileInContainer(folder, fileName);
		Assert.assertNotNull(file);
	}

	/**
	 *
	 * @param filePath
	 *            the path of the file to import in the generated document
	 * @return
	 */
	protected DefaultFileReference createFileReference(final String filePath) {
		DefaultFileReference conf = createFileReference();
		conf.setFilePath(filePath);
		saveConfiguration(conf);
		return conf;
	}

	/**
	 * @param conf
	 *            the configuration to save in the resource set
	 * @return
	 *         <code>true</code> if the save action succeeds
	 */
	private boolean saveConfiguration(final EObject conf) {
		URI uri = URI.createPlatformResourceURI(PROJECT_NAME, true);
		uri = uri.appendSegment(RESOURCES);
		uri = uri.appendSegment(FILE_REFERENCE_FILE_NAME);
		uri = uri.appendFileExtension(BUILD_IN_TYPES_FILE_EXTENSION);

		final Resource res = this.resourceSet.createResource(uri);
		res.getContents().add(conf);
		try {
			res.save(SAVE_OPTIONS);
			return true;
		} catch (IOException e) {
			Activator.log.error(e);
		}
		return false;
	}
}
