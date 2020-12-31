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
}
