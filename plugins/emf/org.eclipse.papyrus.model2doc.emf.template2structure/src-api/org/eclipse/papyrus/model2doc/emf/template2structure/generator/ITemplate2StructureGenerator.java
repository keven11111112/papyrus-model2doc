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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.generator;

import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Version;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;

/**
 * Interface to use to implements template to structure generator and contribute to the extension point
 * org.eclipse.papyrus.model2doc.emf.template2structure/generator
 */
public interface ITemplate2StructureGenerator {

	/**
	 *
	 * @param docTemplate
	 *            a document template
	 * @return
	 *         <code>true</code> if the current generator manages this document template, <code>false</code> otherwise
	 *         This method must NOT check the id of the declared generator
	 */
	public boolean handles(final DocumentTemplate docTemplate);

	/**
	 *
	 * @return
	 *         the generator's identifier
	 */
	public String getGeneratorId();

	/**
	 *
	 * @param docTemplate
	 *            a document template
	 * @param documentVersion
	 *            an object representing the version of the generated document.
	 *            this object must be a String or a {@link Version}. Others elements will be ignored.
	 *            <code>null</code> is allowed too
	 * @return
	 *         the generated Document structure from the document template
	 */
	public Document generate(final DocumentTemplate docTemplate, final Object documentVersion);

	/**
	 *
	 * @return
	 *         a description for the current generator
	 */
	public String getDescription();

	/**
	 *
	 * @return
	 *         the label used in the editor to identify this generator
	 */
	public String getEditorLabel();

	/**
	 *
	 * @return
	 *         the label to use in the Generate menu
	 */
	public String getGenerateMenuLabel();

}
