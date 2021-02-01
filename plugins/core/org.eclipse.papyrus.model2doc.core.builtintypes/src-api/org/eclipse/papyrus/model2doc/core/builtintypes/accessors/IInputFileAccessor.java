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

package org.eclipse.papyrus.model2doc.core.builtintypes.accessors;

import java.net.URL;

import org.eclipse.emf.common.util.URI;

/**
 * Common interfaces to access to files referenced in models
 */
public interface IInputFileAccessor {

	/**
	 *
	 * @return
	 *         the url of the file
	 */
	public URL createInputFileURL();

	/**
	 *
	 * @return
	 *         the platform URI for the file
	 */
	public URI createInputFilePlatformURI();

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
}
