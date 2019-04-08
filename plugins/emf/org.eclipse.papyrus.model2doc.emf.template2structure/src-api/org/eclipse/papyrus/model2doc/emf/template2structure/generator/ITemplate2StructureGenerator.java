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
	 * 		<code>true</code> if the current generator manages this document template, <code>false</code> oterhwise
	 */
	public boolean handles(final DocumentTemplate docTemplate);

	/**
	 *
	 * @return
	 * 		the identified of the current generator
	 */
	public String getGeneratorId();

	/**
	 *
	 * @param docTemplate
	 *            a document template
	 * @return
	 * 		the generated Document structure from the document template
	 */
	public Document generate(final DocumentTemplate docTemplate);

	/**
	 *
	 * @return
	 * 		a description for the current generator
	 */
	public String getDescription();
}
