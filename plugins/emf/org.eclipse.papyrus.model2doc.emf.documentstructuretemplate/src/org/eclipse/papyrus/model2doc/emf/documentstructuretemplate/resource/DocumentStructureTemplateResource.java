/**
 * Copyright (c) 2019 CEA LIST.
 * 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.emf.resources.AbstractEMFResourceWithUUID;

/**
 * 
 * We create our own resource to manage the save options with (I hope) no doubt.
 * The goal is to avoid formatting trouble between editors, to use ID, and to save default values, as provided by the super class
 *
 */
public class DocumentStructureTemplateResource extends AbstractEMFResourceWithUUID {

	/**
	 * The extension for the file owning Expressions
	 */
	public static final String FILE_EXTENSION = "documentstructuretemplate"; //$NON-NLS-1$

	
	/**
	 * 
	 * Constructor.
	 *
	 * @param uri
	 */
	public DocumentStructureTemplateResource(URI uri) {
		super(uri);
	}

}
