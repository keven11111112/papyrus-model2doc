/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	 Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;

/**
 * Constants used by the EMF DocumentStructureTemplate framework
 */
public class DocumentStructureTemplateConstants {

	/**
	 *
	 * Constructor.
	 *
	 */
	private DocumentStructureTemplateConstants() {
		// to prevent instanciation
	}

	/**
	 * The extension for the file owning {@link DocumentTemplate}
	 */
	public static final String DOCUMENT_STRUCTURE_TEMPLATE_FILE_EXTENSION = "pdst"; //$NON-NLS-1$ //pdst for Papyrus Document Structure Template

}
