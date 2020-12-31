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

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;

/**
 * Accessor used to create the output document
 */
public class DocumentOutputFileAccessor extends AbstractOutputFileAccessor<IDocumentGeneratorConfiguration> {

	/**
	 * Constructor.
	 *
	 * @param eobject
	 */
	public DocumentOutputFileAccessor(final IDocumentGeneratorConfiguration configuration) {
		super(configuration);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.accessors.AbstractOutputFileAccessor#doGetDeclaredOutputFolderIn(org.eclipse.emf.ecore.EObject)
	 *
	 * @param eobject
	 * @return
	 */
	@Override
	protected String doGetDeclaredOutputFolderIn(final IDocumentGeneratorConfiguration configuration) {
		return configuration.getDocumentFolder();
	}


}
