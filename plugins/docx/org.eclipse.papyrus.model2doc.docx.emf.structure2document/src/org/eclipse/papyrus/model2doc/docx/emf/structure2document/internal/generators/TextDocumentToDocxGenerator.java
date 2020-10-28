/*****************************************************************************
 * Copyright (c) 2020 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	 Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.docx.emf.structure2document.internal.generators;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.model2doc.docx.emf.structure2document.internal.utils.GenerateDocxFileUtils;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.IStructure2DocumentGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.utils.GenerateDocumentStructureUtils;
import org.eclipse.swt.widgets.Display;

public class TextDocumentToDocxGenerator implements IStructure2DocumentGenerator {

	public TextDocumentToDocxGenerator() {
		// nothing to do
	}

	@Override
	public String getGeneratorId() {
		return "org.eclipse.papyrus.model2doc.document.generator.docx"; //$NON-NLS-1$
	}

	@Override
	public String getDescription() {
		return "Generate Docx file from TextDocument"; //$NON-NLS-1$
	}

	@Override
	public String getEditorLabel() {
		return "Docx - Default Generator"; //$NON-NLS-1$
	}

	@Override
	public String getGenerateMenuLabel() {
		return "Docx"; //$NON-NLS-1$
	}

	@Override
	public String getOutputFileExtension() {
		return "docx"; //$NON-NLS-1$
	}

	@Override
	public boolean handles(Document docTemplate) {
		return docTemplate instanceof TextDocument;
	}

	@Override
	public Object generate(final Document docTemplate) {
		// TODO : the generation must return a list of generated file
		if (docTemplate instanceof TextDocument) {
			GenerateDocxFileUtils.generateDocxFile((TextDocument) docTemplate);

			// TODO : this dialog should be open at the end of the process by the calling handler
			// open a dialog add the end of the generation
			MessageDialog.openInformation(Display.getDefault().getActiveShell(), GenerateDocumentStructureUtils.DIALOG_TITLE, "The docx file has been generated."); //$NON-NLS-1$
		}
		return null;
	}

}
