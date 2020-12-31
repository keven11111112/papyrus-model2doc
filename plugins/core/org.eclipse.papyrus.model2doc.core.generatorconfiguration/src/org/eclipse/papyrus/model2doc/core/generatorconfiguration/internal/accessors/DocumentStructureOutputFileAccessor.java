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
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.accessors.IOutputFileAccessor;

/**
 * Accessor used to create the output document structure
 */
public class DocumentStructureOutputFileAccessor extends AbstractOutputFileAccessor<IDocumentStructureGeneratorConfiguration> implements IOutputFileAccessor {

	/**
	 * Constructor.
	 *
	 * @param eobject
	 */
	public DocumentStructureOutputFileAccessor(final IDocumentStructureGeneratorConfiguration configuration) {
		super(configuration);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.accessors.AbstractOutputFileAccessor#getDeclaredOutputFolderIn(org.eclipse.emf.ecore.EObject)
	 *
	 * @param EObject
	 * @return
	 */
	@Override
	protected String doGetDeclaredOutputFolderIn(final IDocumentStructureGeneratorConfiguration configuration) {
		return configuration.getStructureFolder();
	}

}
