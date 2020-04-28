/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.generators;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.IStructure2DocumentGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.utils.GenerateDocumentStructureUtils;
import org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.utils.GenerateODTFileUtils;
import org.eclipse.swt.widgets.Display;

/**
 * This generator allows to create an ODT document from a {@link TextDocument}
 */
public class TextDocumentToODTGenerator implements IStructure2DocumentGenerator {

	public TextDocumentToODTGenerator() {
		// nothing to do
	}

	@Override
	public boolean handles(final Document docTemplate) {
		return docTemplate instanceof TextDocument;
	}

	@Override
	public String getGeneratorId() {
		return "org.eclipse.papyrus.model2doc.document.generator.odt"; //$NON-NLS-1$
	}

	@Override
	public Object generate(final Document docTemplate) {
		// TODO : the generation must return a list of generated file
		if (docTemplate instanceof TextDocument) {
			GenerateODTFileUtils.generateODTFile((TextDocument) docTemplate);

			// TODO : this dialog should be open at the end of the process by the calling handler
			// open a dialog add the end of the generation
			MessageDialog.openInformation(Display.getDefault().getActiveShell(), GenerateDocumentStructureUtils.DIALOG_TITLE, "The odt file has been generated."); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.structure2document.generator.IStructure2DocumentGenerator#getDescription()
	 *
	 * @return
	 */
	@Override
	public String getDescription() {
		return "Generate ODT file from TextDocument"; //$NON-NLS-1$
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.structure2document.generator.IStructure2DocumentGenerator#getEditorLabel()
	 *
	 * @return
	 */
	@Override
	public String getEditorLabel() {
		return "ODT - Default Generator"; //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.structure2document.generator.IStructure2DocumentGenerator#getGenerateMenuLabel()
	 *
	 * @return
	 */
	@Override
	public String getGenerateMenuLabel() {
		return "ODT"; //$NON-NLS-1$
	}

}
