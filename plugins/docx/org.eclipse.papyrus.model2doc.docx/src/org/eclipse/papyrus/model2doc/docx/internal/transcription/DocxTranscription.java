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
package org.eclipse.papyrus.model2doc.docx.internal.transcription;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.eclipse.papyrus.model2doc.core.author.IAuthor;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.IFileReference;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.core.transcription.CoverPage;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.docx.Activator;
import org.eclipse.papyrus.model2doc.docx.services.StyleService;
import org.eclipse.papyrus.model2doc.docx.services.StyleServiceImpl;

public class DocxTranscription implements Transcription {

	private IDocumentGeneratorConfiguration docxGeneratorConfig;

	private XWPFDocument document;

	private StyleService styleService;

	private static final String DOCX_FILE_EXTENTION = "docx";//$NON-NLS-1$

	private static final String ECORE_FILE_PREFIX = "file:"; //$NON-NLS-1$

	private static final String EMPTY_STRING = ""; //$NON-NLS-1$

	public DocxTranscription(IDocumentGeneratorConfiguration dgc) {
		this.docxGeneratorConfig = dgc;
		this.styleService = new StyleServiceImpl();

		try {
			InputStream template = getTemplateInputStream();
			if (template != null) {
				this.document = new XWPFDocument(template);
			} else {
				this.document = new XWPFDocument();
			}
		} catch (IOException e) {
			Activator.log.warn("Cannot apply the template file");
			this.document = new XWPFDocument();
		}
	}

	private InputStream getTemplateInputStream() throws IOException {
		String stringUri = GeneratorConfigurationOperations.getTemplateFilePathInLocalPath(docxGeneratorConfig);
		stringUri = stringUri.replaceFirst(ECORE_FILE_PREFIX, EMPTY_STRING);
		InputStream stream = new FileInputStream(stringUri);
		return stream;
	}

	@Override
	public void writeCoverPage(CoverPage coverPage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeTableOfContents(String tocTitle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeTableOfFigures(String tofTitle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void refreshTablesOfIndexes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeDocumentMainTitle(String documentTitle) {
		XWPFParagraph p = document.createParagraph();
		styleService.applyDocumentMainTitleStyle(p);

		XWPFRun run = p.createRun();
		run.setText(documentTitle);
	}

	@Override
	public void writeAuthors(Collection<IAuthor> authors) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeVersion(String version) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeSectionTitle(String sectionTitle, int sectionLevel) {
		XWPFParagraph paragraph = document.createParagraph();
		styleService.applySectionTitleStyle(paragraph, sectionLevel);

		XWPFRun run = paragraph.createRun();
		run.setText(sectionTitle);
	}

	@Override
	public void writeParagraph(String paragraph, boolean processRichText) {
		XWPFParagraph p = document.createParagraph();
		XWPFRun run = p.createRun();
		run.setText(paragraph);
	}

	@Override
	public void writeList(org.eclipse.papyrus.model2doc.core.builtintypes.AbstractList list, boolean processRichText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeTable(AbstractTable table) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertFile(IFileReference fileReference) {
		// TODO Auto-generated method stub

	}

	@Override
	public void importImage(ImageDescription image, String caption) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeImage(String imagePath, String caption) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeImageSubtitle(ImageDescription image) {
		// TODO Auto-generated method stub

	}

	@Override
	public String save(String label) {
		String stringUri = GeneratorConfigurationOperations.getDocumentFileLocalPath(docxGeneratorConfig, DOCX_FILE_EXTENTION);
		stringUri = stringUri.replaceFirst(ECORE_FILE_PREFIX, EMPTY_STRING);
		try {
			OutputStream outputStream = new FileOutputStream(stringUri);
			document.write(outputStream);
			outputStream.close();
		} catch (IOException e) {
			Activator.log.error(e);
		}

		return null;
	}

	@Override
	public IDocumentGeneratorConfiguration getGeneratorConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canExecute() {
		// TODO Auto-generated method stub
		return false;
	}

}
