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

package org.eclipse.papyrus.model2doc.emf.structure2document.generator;

import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;


/**
 * Interface to use to implements template to structure generator and contribute to the extension point
 * org.eclipse.papyrus.model2doc.emf.strucre2document.documentgenerator
 */
public interface IStructure2DocumentGenerator {

	/**
	 *
	 * @param docTemplate
	 *            a document template
	 * @return
	 *         <code>true</code> if the current generator manages this document template, <code>false</code> otherwise
	 *         This method must NOT use the declared generatorId to calculate its capability to manage it.
	 */
	public boolean handles(final Document docTemplate);

	/**
	 *
	 * @return
	 *         the identifier of the current generator
	 */
	public String getGeneratorId();

	/**
	 *
	 * @param docTemplate
	 *            a document template
	 * @return
	 *         the generated Document structure from the document template
	 */
	// TODO : return type should be file/Ifile or better a list ?
	public Object generate(final Document docTemplate);

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


	/**
	 *
	 * @return
	 *         the extension of the output file
	 */
	public String getOutputFileExtension();

}
