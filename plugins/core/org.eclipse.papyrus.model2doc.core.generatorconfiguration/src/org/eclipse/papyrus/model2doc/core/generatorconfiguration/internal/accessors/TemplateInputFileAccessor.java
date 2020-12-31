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

import org.eclipse.papyrus.model2doc.core.builtintypes.internal.accessors.AbstractInputFileAccessor;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;

/**
 * Accessor used to create the path of the input template
 */
public class TemplateInputFileAccessor extends AbstractInputFileAccessor<IDocumentGeneratorConfiguration> {

	/**
	 * Constructor.
	 *
	 * @param eobject
	 */
	public TemplateInputFileAccessor(IDocumentGeneratorConfiguration eobject) {
		super(eobject);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.internal.accessors.AbstractInputFileAccessor#getFilePathIn(org.eclipse.emf.ecore.EObject)
	 *
	 * @param eobject
	 * @return
	 */
	@Override
	protected String getFilePathIn(IDocumentGeneratorConfiguration eobject) {
		return eobject.getTemplateFile();
	}

}
