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

package org.eclipse.papyrus.model2doc.core.builtintypes.internal.accessors;

import org.eclipse.papyrus.model2doc.core.builtintypes.IFileReference;

/**
 * Accessor used to access to file referenced by {@link IFileReference}
 */
public class FileReferenceAccessor extends AbstractInputFileAccessor<IFileReference> {

	/**
	 *
	 * Constructor.
	 *
	 * @param fileReference
	 *            an instance of {@link IFileReference}
	 */
	public FileReferenceAccessor(final IFileReference fileReference) {
		super(fileReference);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.helpers.AbstractInputFileAccessor#getFilePath()
	 *
	 * @return
	 */
	@Override
	protected String getFilePathIn(final IFileReference fileReference) {
		return fileReference.getFilePath();
	}

}
