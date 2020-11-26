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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2document.internal.generators;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2document.generators.Template2DocumentGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.helpers.DocumentStructureVersionHelper;
import org.eclipse.papyrus.model2doc.emf.template2structure.helpers.DocumentStructureVersionUIHelper;

/**
 * This generator opens a dialog to ask the user the version number to use during the generation
 * <ul>
 * <li>a dialog to ask to the user the version of the generated document</li>
 * <li>a dialog at the end of the process</li>
 * </ul>
 */
public final class Template2DocumentGeneratorUI extends Template2DocumentGenerator {

	/**
	 * Constructor.
	 *
	 * @param documentTemplate
	 */
	public Template2DocumentGeneratorUI(DocumentTemplate documentTemplate) {
		super(documentTemplate);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.template2document.generators.Template2DocumentGenerator#createDocumentStructureVersionHelper(org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate)
	 *
	 * @param template
	 * @return
	 */
	@Override
	protected DocumentStructureVersionHelper createDocumentStructureVersionHelper(final DocumentTemplate template) {
		return new DocumentStructureVersionUIHelper(template);
	}

	/**
	 *
	 * @return
	 *         the menu label declared by the template to structure generator
	 */
	public final String getTemplate2StructureGeneratorMenuLabel() {
		if (this.t2sGenerator != null) {
			return this.t2sGenerator.getGenerateMenuLabel();
		}
		return null;
	}

	/**
	 *
	 * @return
	 *         the menu label declared by the structure to document generator
	 */
	public final String getStructure2DocumentGeneratorMenuLabel() {
		if (this.s2docGenerator != null) {
			return this.s2docGenerator.getGenerateMenuLabel();
		}
		return null;
	}
}
