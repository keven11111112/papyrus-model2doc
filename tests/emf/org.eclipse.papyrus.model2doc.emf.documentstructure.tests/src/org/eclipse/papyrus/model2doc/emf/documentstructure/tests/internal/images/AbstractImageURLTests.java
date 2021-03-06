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

import java.io.IOException;
import java.io.InputStream;

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
import org.eclipse.papyrus.model2doc.emf.documentstructure.Image;
import org.eclipse.papyrus.model2doc.emf.documentstructure.internal.resource.DocumentStructureResource;
import org.eclipse.papyrus.model2doc.emf.documentstructure.tests.Activator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

/**
 * Abstract class for tests on the calculus of Image URL
 */
public abstract class AbstractImageURLTests extends AbstractDocumentStructureTests {

	/**
	 * the name of the project created in the workspace
	 */
	protected static final String PROJECT_NAME = "org.eclipse.papyrus.model2doc.emf.documentstructure.image.tests"; //$NON-NLS-1$

	/**
	 * the name of the project in the workspace the GeneratorConfiguration file
	 */
	private static final String RESOURCES = "resources"; //$NON-NLS-1$

	/**
	 * the name of the GeneratorConfiguration file
	 */
	private static final String IMAGE_FILE_NAME = "image"; //$NON-NLS-1$

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
	protected Image createImageFileReference(final String filePath) {
		final Image conf = createImage();
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
		uri = uri.appendSegment(IMAGE_FILE_NAME);
		uri = uri.appendFileExtension(DocumentStructureResource.FILE_EXTENSION);

		final Resource res = this.resourceSet.createResource(uri);
		res.getContents().add(conf);
		try {
			res.save(null);
			return true;
		} catch (IOException e) {
			Activator.log.error(e);
		}
		return false;
	}
}
