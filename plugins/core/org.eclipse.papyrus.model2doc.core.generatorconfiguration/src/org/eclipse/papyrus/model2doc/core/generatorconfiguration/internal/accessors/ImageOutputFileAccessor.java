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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.accessors;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;

/**
 * Accessor used to create the output images
 */
public class ImageOutputFileAccessor extends AbstractOutputFileAccessor<IDocumentStructureGeneratorConfiguration> {

	/**
	 *
	 * Constructor.
	 *
	 * @param configuration
	 *            the generator configuration to use to create the path of the output images
	 */
	public ImageOutputFileAccessor(final IDocumentStructureGeneratorConfiguration configuration) {
		super(configuration);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.accessors.AbstractOutputFileAccessor#getDeclaredOutputFolderIn(org.eclipse.emf.ecore.EObject)
	 *
	 * @param EObject
	 * @return
	 */
	@Override
	protected String doGetDeclaredOutputFolderIn(final IDocumentStructureGeneratorConfiguration eobject) {
		return eobject.getImageFolder();
	}

}
