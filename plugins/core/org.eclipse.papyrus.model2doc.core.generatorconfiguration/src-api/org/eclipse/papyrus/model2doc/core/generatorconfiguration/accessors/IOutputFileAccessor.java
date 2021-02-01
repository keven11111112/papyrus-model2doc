/*****************************************************************************
 * Copyright (c) 2020, 2021 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - bug 570803
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors;

import java.net.URL;

import org.eclipse.emf.common.util.URI;

/**
 * Interface used to manage output file
 */
public interface IOutputFileAccessor {

	/**
	 *
	 * @param fileName
	 *            the name of the file to create (can't be empty or <code>null</code>)
	 * @param fileExtension
	 *            the extension of the file (can be empty or null)
	 * @param fileVersion
	 *            the version of the file (can be empty or null)
	 * @return
	 *         the URL to use to manipulate this file
	 */
	public URL createOutputFileURL(final String fileName, final String fileExtension, final String fileVersion);

	/**
	 *
	 * @param fileName
	 *            the name of the file to create (can't be empty or <code>null</code>)
	 * @param fileExtension
	 *            the extension of the file (can be empty or null)
	 * @return
	 *         the URL to use to manipulate this file
	 */
	public URL createOutputFileURL(final String fileName, final String fileExtension);

	/**
	 *
	 * @param fileName
	 *            the name of the file to create (can't be empty or <code>null</code>)
	 * @param fileExtension
	 *            the extension of the file (can be empty or null)
	 * @param fileVersion
	 *            the version of the file (can be empty or null)
	 * @return
	 *         the URI to use to manipulate this file
	 */
	public URI createOutputFileURI(final String fileName, final String fileExtension, final String fileVersion);

	/**
	 *
	 * @param fileName
	 *            the name of the file to create (can't be empty or <code>null</code>)
	 * @param fileExtension
	 *            the extension of the file (can be empty or null)
	 * @return
	 *         the URI to use to manipulate this file
	 */
	public URI createOutputFileURI(final String fileName, final String fileExtension);

	/**
	 *
	 * @param uri
	 *            a platform URI
	 * @return
	 *         the URL corresponding to this URI
	 */
	public URL convertToURL(final URI uri);

	/**
	 * This method converts the URL into string, removing the prefix "file:" and decoding the path if required
	 *
	 * @param url
	 *            the url
	 * @param decode
	 *            if <code>true</code>, we replace the %20 by the space char
	 * @return
	 *         the path string corresponding to the URL
	 */
	public String urlToPathString(final URL url, final boolean decode);

	/**
	 *
	 * @return
	 *         the name of the project impacted by the generation
	 */
	public String getProjectName();

}
