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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlToken;
import org.eclipse.core.runtime.Assert;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.author.IAuthor;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.Cell;
import org.eclipse.papyrus.model2doc.core.builtintypes.IFileReference;
import org.eclipse.papyrus.model2doc.core.builtintypes.Row;
import org.eclipse.papyrus.model2doc.core.builtintypes.TextCell;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.core.transcription.CoverPage;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.docx.Activator;
import org.eclipse.papyrus.model2doc.docx.internal.util.ImageUtils;
import org.eclipse.papyrus.model2doc.docx.services.StyleService;
import org.eclipse.papyrus.model2doc.docx.services.StyleServiceImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline;

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
		// do some check
		int rowsNumber = table.getRowsNumber();
		int colNumbers = table.getColumnsNumber();

		if (rowsNumber <= 0 || colNumbers <= 0) {
			return;
		}

		final List<Cell> allCells = table.getAllCells();

		final int totalCells = allCells.size();
		if (rowsNumber * colNumbers != totalCells) {
			Activator.log.warn(NLS.bind("The number of cells in the table is not as excepted. We won't manage the table {0}.", table.getCaption())); //$NON-NLS-1$
			return;
		}

		Activator.log.info(NLS.bind("Start the creation of the table {0}", table.getCaption())); //$NON-NLS-1$
		Activator.log.info(NLS.bind("--This table have {0} columns and {1} rows", colNumbers, rowsNumber)); //$NON-NLS-1$

		// create and fill the table
		XWPFTable xwpfTable = document.createTable(rowsNumber, colNumbers);
		styleService.applyTableStyle(xwpfTable, document);
		Iterator<Row> rowIter = table.getRows().iterator();
		int rowNumber = 0;
		while (rowIter.hasNext()) {
			Row row = rowIter.next();
			Iterator<Cell> cellIter = row.getCells().iterator();
			int cellNumber = 0;
			while (cellIter.hasNext()) {
				Cell cell = cellIter.next();
				if (cell instanceof TextCell) {
					TextCell textCell = (TextCell) cell;
					xwpfTable.getRow(rowNumber).getCell(cellNumber).setText(textCell.getText());
				}
				cellNumber++;
			}
			rowNumber++;
		}
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
		Assert.isTrue(false == imagePath.endsWith("svg"));

		// XWPFParagraph paragraph = document.createParagraph();
		// XWPFRun run = paragraph.createRun();
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(imagePath);
			String imageId = document.addPictureData(inputStream, Document.PICTURE_TYPE_PNG); // TODO move to import image

			// XWPFPicture picture = run.addPicture(inputStream, Document.PICTURE_TYPE_PNG, imageId, Units.toEMU(100), Units.toEMU(100));
			// CTBlipFillProperties blipFill = picture.getCTPicture().addNewBlipFill();
			// CTBlip blip = blipFill.addNewBlip();
			// blip.setEmbed(imageId);
			int[] size = ImageUtils.getImageSize(imagePath, document);
			createPicture(imageId, document.getNextPicNameNumber(Document.PICTURE_TYPE_PNG), size[0], size[1]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createPicture(String blipId, int id, int width, int height) {
		final int EMU = 9525;
		// width *= EMU;
		// height *= EMU;
		// String blipId = getAllPictures().get(id).getPackageRelationship().getId();


		CTInline inline = document.createParagraph().createRun().getCTR().addNewDrawing().addNewInline();

		String picXml = "" +
				"<a:graphic xmlns:a=\"http://schemas.openxmlformats.org/drawingml/2006/main\">" +
				"   <a:graphicData uri=\"http://schemas.openxmlformats.org/drawingml/2006/picture\">" +
				"      <pic:pic xmlns:pic=\"http://schemas.openxmlformats.org/drawingml/2006/picture\">" +
				"         <pic:nvPicPr>" +
				"            <pic:cNvPr id=\"" + id + "\" name=\"GrapheEtats1$Implementation$diagramme__9HrYoDaVEeqBYNTyU5E5qA.png\"/>" + // Changed
				"            <pic:cNvPicPr/>" +
				"         </pic:nvPicPr>" +
				"         <pic:blipFill>" +
				"            <a:blip r:embed=\"" + blipId + "\" xmlns:r=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\"/>" +
				"            <a:stretch>" +
				"               <a:fillRect/>" +
				"            </a:stretch>" +
				"         </pic:blipFill>" +
				"         <pic:spPr>" +
				"            <a:xfrm>" +
				"               <a:off x=\"0\" y=\"0\"/>" +
				"               <a:ext cx=\"" + width + "\" cy=\"" + height + "\"/>" +
				"            </a:xfrm>" +
				"            <a:prstGeom prst=\"rect\">" +
				"               <a:avLst/>" +
				"            </a:prstGeom>" +
				"         </pic:spPr>" +
				"      </pic:pic>" +
				"   </a:graphicData>" +
				"</a:graphic>";

		// CTGraphicalObjectData graphicData = inline.addNewGraphic().addNewGraphicData();
		XmlToken xmlToken = null;
		try {
			xmlToken = XmlToken.Factory.parse(picXml);
		} catch (XmlException xe) {
			xe.printStackTrace();
		}
		inline.set(xmlToken);
		// graphicData.set(xmlToken);

		inline.setDistT(0);
		inline.setDistB(0);
		inline.setDistL(0);
		inline.setDistR(0);

		CTPositiveSize2D extent = inline.addNewExtent();
		extent.setCx(width);// Changed
		extent.setCy(height);// Changed

		CTNonVisualDrawingProps docPr = inline.addNewDocPr();
		docPr.setId(id);
		docPr.setName("Drawing " + id);// Changed
		docPr.setDescr("Generated");
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
