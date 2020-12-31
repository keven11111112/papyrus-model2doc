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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.accessors;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.core.builtintypes.internal.accessors.AbstractFileAccessor;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor;

/**
 * Abstract accessor used to create path of output files
 */
public abstract class AbstractOutputFileAccessor<T extends EObject> extends AbstractFileAccessor<T> implements IOutputFileAccessor {

	/**
	 * path segment separator
	 */
	protected static final String SLASH = "/"; //$NON-NLS-1$

	/**
	 * underscore (used to separate the version of the file name
	 */
	protected static final String UNDERSCORE = "_"; //$NON-NLS-1$

	/**
	 * the dot char
	 */
	protected static final String DOT = "."; //$NON-NLS-1$

	/**
	 *
	 * Constructor.
	 *
	 * @param eobject
	 *            an eobject which can be used to build the file path
	 */
	protected AbstractOutputFileAccessor(T eobject) {
		super(eobject);
	}

	/**
	 *
	 * @return
	 *         the declared output folder (can be empty)
	 */
	private final String getDeclaredOutputFolderIn() {
		String folderName = doGetDeclaredOutputFolderIn(getEObject());
		folderName = folderName != null ? folderName : ""; //$NON-NLS-1$
		while (folderName.startsWith(SLASH) || folderName.endsWith(SLASH)) {
			if (folderName.startsWith(SLASH)) {
				folderName = folderName.substring(1);
			}
			if (folderName.endsWith(SLASH)) {
				folderName = folderName.substring(0, folderName.length() - 1);
			}
		}
		return folderName;
	}

	/**
	 *
	 * @param eobject
	 *            the eobject used to create the output path
	 * @return
	 *         the output path declared in the eobject
	 */
	protected abstract String doGetDeclaredOutputFolderIn(final T eobject);

	/**
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor#createOutputFileURL(java.lang.String, java.lang.String)
	 *
	 * @param fileName
	 * @param fileExtension
	 * @return
	 *         the created output URL
	 */
	@Override
	public URL createOutputFileURL(String fileName, String fileExtension) {
		return createOutputFileURL(fileName, fileExtension, null);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor#convertToURL(org.eclipse.emf.common.util.URI)
	 *
	 * @param uri
	 *            a platform resource URI
	 * @return
	 *         the corresponding URL
	 */
	@Override
	public URL convertToURL(final URI uri) {
		if (uri != null && uri.isPlatformResource()) {
			// convert the URI to a URL
			return getFileURLFromPlatformURI(uri);
		}
		return null;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor#createOutputFileURI(java.lang.String, java.lang.String)
	 *
	 * @param fileName
	 * @param fileExtension
	 * @return
	 */
	@Override
	public URI createOutputFileURI(String fileName, String fileExtension) {
		return createOutputFileURI(fileName, fileExtension, null);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor#createOutputFileURL(java.lang.String, java.lang.String, java.lang.String)
	 *
	 * @param fileName
	 * @param fileExtension
	 * @param fileVersion
	 * @return
	 */
	@Override
	public URL createOutputFileURL(String fileName, String fileExtension, String fileVersion) {
		// 1.create a platform resource URI
		final URI uri = createOutputFileURI(fileName, fileExtension, fileVersion);
		// 2. convert this URI to a URL
		return convertToURL(uri);
	}



	/**
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor#createOutputFileURI(java.lang.String, java.lang.String, java.lang.String)
	 *
	 * @param fileName
	 * @param fileExtension
	 * @param fileVersion
	 * @return
	 */
	@Override
	public URI createOutputFileURI(final String fileName, final String fileExtension, final String fileVersion) {
		if (fileName == null || fileName.isEmpty()) {
			return null;
		}
		// 1. create a platform URI
		URI newFileURI = createPlatformURIFromPath(getEObject(), getDeclaredOutputFolderIn());
		// 2. create the file name
		final String newFileName = buildFileName(fileName, fileExtension, fileVersion);
		// 3. create the new file URI
		if (newFileURI != null && newFileName != null && !newFileName.isEmpty()) {
			newFileURI = newFileURI.appendSegment(newFileName);
			if (newFileURI.isPlatformResource()) {
				// to avoid to get %20 instead of space
				return URI.createPlatformResourceURI(newFileURI.toPlatformString(true), false);
			}
		}

		return null;
	}

	private final String buildFileName(final String fileName, final String fileExtension, final String fileVersion) {
		final StringBuilder fileNameBuilder = new StringBuilder();
		fileNameBuilder.append(fileName);
		if (fileVersion != null && !fileVersion.isEmpty()) {
			fileNameBuilder.append(UNDERSCORE);
			fileNameBuilder.append(fileVersion);
		}
		if (fileExtension != null && !fileExtension.isEmpty()) {
			fileNameBuilder.append(DOT);
			fileNameBuilder.append(fileExtension);
		}
		return fileNameBuilder.toString();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor#getProjectName()
	 *
	 * @return
	 */
	@Override
	public String getProjectName() {
		// 1. create a dummy URI
		final URI uri = createOutputFileURI("dummy", "txt"); //$NON-NLS-1$ //$NON-NLS-2$
		if (uri != null && uri.isPlatformResource()) {
			final String projectName = uri.segment(1);
			if (projectName != null && !projectName.isEmpty()) {
				return projectName;
			}
		}
		return null;
	}

}
