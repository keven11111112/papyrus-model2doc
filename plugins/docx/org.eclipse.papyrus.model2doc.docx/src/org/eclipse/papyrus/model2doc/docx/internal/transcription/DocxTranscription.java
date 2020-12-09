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
 *   Vincent LORENZO (CEA LIST) vincent.lorenzo@cea.fr - bug 569059
 * 	 Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Bug 569249
 *
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.docx.internal.transcription;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.TableWidthType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.xmlbeans.XmlException;
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
import org.eclipse.papyrus.model2doc.core.styles.BooleanNamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.NamedStyleConstants;
import org.eclipse.papyrus.model2doc.core.transcription.CoverPage;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.docx.Activator;
import org.eclipse.papyrus.model2doc.docx.Messages;
import org.eclipse.papyrus.model2doc.docx.internal.poi.CustomXWPFDocument;
import org.eclipse.papyrus.model2doc.docx.internal.poi.CustomXWPFTable;
import org.eclipse.papyrus.model2doc.docx.internal.services.StyleServiceImpl;
import org.eclipse.papyrus.model2doc.docx.internal.util.ImageUtils;
import org.eclipse.papyrus.model2doc.docx.services.StyleService;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;

public class DocxTranscription implements Transcription {

	private IDocumentGeneratorConfiguration docxGeneratorConfig;

	private CustomXWPFDocument document;

	protected StyleService styleService;

	private int imageIndex = 1;

	private static final String ECORE_URI_FILE_SEPARATOR = "/";//$NON-NLS-1$

	private static final String DOCX_FILE_EXTENTION = "docx";//$NON-NLS-1$

	private static final String ECORE_FILE_PREFIX = "file:"; //$NON-NLS-1$

	private static final String EMPTY_STRING = ""; //$NON-NLS-1$

	private static final String WHITE_SPACE = " "; //$NON-NLS-1$

	public DocxTranscription(IDocumentGeneratorConfiguration dgc) {
		this.docxGeneratorConfig = dgc;
		this.styleService = new StyleServiceImpl();
		this.document = new CustomXWPFDocument();
		try {
			InputStream template = getTemplateInputStream();
			if (template != null) {
				// bug 569059 - see https://stackoverrun.com/fr/q/4419808 for solution
				XWPFDocument templateDocument = new XWPFDocument(template);
				final XWPFStyles newStyles = this.document.createStyles();
				newStyles.setStyles(templateDocument.getStyle());
				templateDocument.close();
			}
		} catch (IOException e) {
			Activator.log.warn("Cannot apply the template file"); //$NON-NLS-1$
		} catch (XmlException e) {
			Activator.log.warn("Cannot apply the template file"); //$NON-NLS-1$
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
		XWPFParagraph p = document.createParagraph();
		XWPFRun run = p.createRun();
		run.setText(tocTitle);

		document.createTOC();
	}

	@Override
	public void writeTableOfFigures(String tofTitle) {
		XWPFParagraph p = document.createParagraph();
		XWPFRun run = p.createRun();
		run.setText(tofTitle);

		document.createTOF();
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
		Iterator<Row> rowIter = table.getRows().iterator();
		int rowIndex = 0;
		while (rowIter.hasNext()) {
			Row row = rowIter.next();
			Iterator<Cell> cellIter = row.getCells().iterator();
			int cellIndex = 0;
			while (cellIter.hasNext()) {
				Cell cell = cellIter.next();
				if (cell instanceof TextCell) {
					TextCell textCell = (TextCell) cell;
					xwpfTable.getRow(rowIndex).getCell(cellIndex).setText(textCell.getText());
				}
				cellIndex++;
			}
			rowIndex++;
		}

		// apply styles
		rowIter = table.getRows().iterator();
		List<Cell> verticalMergedCells = new ArrayList<>();
		while (rowIter.hasNext()) {
			Row row = rowIter.next();
			Iterator<Cell> cellIter = row.getCells().iterator();
			while (cellIter.hasNext()) {
				Cell cell = cellIter.next();

				// Horizontal cell merge
				BooleanNamedStyle style = (BooleanNamedStyle) cell.getNamedStyle(NamedStyleConstants.MERGED_WITH_RIGHT_CELL);
				if (null != style && style.isValue()) {
					Cell lastMergedCell = findLastHorizontalMergedCell(cellIter);

					if (lastMergedCell != null && xwpfTable instanceof CustomXWPFTable) {
						((CustomXWPFTable) xwpfTable).horizontalCellMerge(
								table.getRows().indexOf(row),
								row.getCells().indexOf(cell),
								row.getCells().indexOf(lastMergedCell));
					}
				}

				// Vertical cell merge
				style = (BooleanNamedStyle) cell.getNamedStyle(NamedStyleConstants.MERGED_WITH_BOTTOM_CELL);
				if (null != style && style.isValue()) {
					if (false == verticalMergedCells.contains(cell)) { // otherwise it is already managed
						Row lastMergedRow = findVerticalMergedCells(table, row, cell, verticalMergedCells);
						if (lastMergedRow != null && xwpfTable instanceof CustomXWPFTable) {
							((CustomXWPFTable) xwpfTable).verticalCellMerge(
									row.getCells().indexOf(cell),
									table.getRows().indexOf(row),
									table.getRows().indexOf(lastMergedRow));
						}
					}
				}
			}
		}

		xwpfTable.setWidthType(TableWidthType.PCT); // resize table to use the page width
		styleService.applyTableStyle(xwpfTable, document, table);
	}

	/**
	 * Find the first cell following the iterator which does not have the {@link NamedStyleConstants.MERGED_WITH_RIGHT_CELL} style
	 *
	 * @param cellIter
	 *            the start of the research
	 * @return the last cell concerning by the merge
	 */
	private Cell findLastHorizontalMergedCell(Iterator<Cell> cellIter) {
		while (cellIter.hasNext()) {
			Cell cell = cellIter.next();
			BooleanNamedStyle style = (BooleanNamedStyle) cell.getNamedStyle(NamedStyleConstants.MERGED_WITH_RIGHT_CELL);
			if (null != style && style.isValue()) {
				continue;
			} else {
				return cell;
			}
		}
		return null;
	}

	/**
	 * This method add every cells that must be merged with the firstCell (according to the {@link NamedStyleConstants.MERGED_WITH_BOTTOM_CELL} style)
	 * to the mergedCells collection then it return the row of the laster merged cell
	 *
	 * @param table
	 *            the table
	 * @param row
	 *            the row of the first cell of the merge
	 * @param firstCell
	 *            the first cell of the merge
	 * @param mergedCells
	 *            the list of merged cells
	 * @return the row of the last merged cell
	 */
	private Row findVerticalMergedCells(final AbstractTable table, final Row row, final Cell firstCell, List<Cell> mergedCells) {
		int columnIndex = row.getCells().indexOf(firstCell);
		int rowIndex = table.getRows().indexOf(row) + 1;

		while (rowIndex < table.getRowsNumber()) {
			Cell cell = table.getRows().get(rowIndex).getCells().get(columnIndex);

			BooleanNamedStyle style = (BooleanNamedStyle) cell.getNamedStyle(NamedStyleConstants.MERGED_WITH_BOTTOM_CELL);
			if (null != style && style.isValue()) {
				mergedCells.add(cell);
			} else {
				mergedCells.add(cell);
				return table.getRows().get(rowIndex);
			}
			rowIndex++;
		}

		return null;
	}

	@Override
	public void insertFile(IFileReference fileReference) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeImage(String imagePath, String caption) {
		Assert.isTrue(false == imagePath.endsWith("svg"));//$NON-NLS-1$

		// insert the picture
		XWPFParagraph imageParagraph = document.createParagraph();
		XWPFRun imageRun = imageParagraph.createRun();
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(imagePath);
			String[] path = imagePath.split(ECORE_URI_FILE_SEPARATOR);

			int[] size = ImageUtils.getImageSize(imagePath, document);
			imageRun.addPicture(inputStream, Document.PICTURE_TYPE_PNG, path[path.length - 1], size[0], size[1]);
		} catch (IOException | InvalidFormatException e) {
			Activator.log.error(e);
		}

		// Write caption
		XWPFParagraph captionParagraph = document.createParagraph();
		styleService.applyCaptionStyle(captionParagraph, document);

		XWPFRun captionRun = captionParagraph.createRun();
		captionRun.setText(Messages.DocxTranscription_imageCaptionLabel + WHITE_SPACE);
		CTSimpleField seq = captionParagraph.getCTP().addNewFldSimple();
		seq.setInstr(" SEQ Figure \\* ARABIC "); //$NON-NLS-1$
		CTR ctr = seq.addNewR();
		CTRPr ctrpr = ctr.addNewRPr();
		ctrpr.addNewNoProof();
		CTText ctText = ctr.addNewT();
		ctText.setStringValue(String.valueOf(imageIndex));
		XWPFRun captionTextRun = captionParagraph.createRun();
		captionTextRun.setText(": " + caption); //$NON-NLS-1$

		imageIndex++;
	}

	// TODO : define clearly the kind of the returned String between docx and odt generator
	@Override
	public String save(String label) {
		final String ecoreURi = GeneratorConfigurationOperations.getDocumentFileLocalPath(docxGeneratorConfig, DOCX_FILE_EXTENTION);
		String docxURI = ecoreURi.replaceFirst(ECORE_FILE_PREFIX, EMPTY_STRING);
		try {
			OutputStream outputStream = new FileOutputStream(docxURI);
			document.write(outputStream);
			outputStream.close();
			document.close();
		} catch (IOException e) {
			Activator.log.error(e);
		}

		return ecoreURi;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.transcription.Transcription#insertEmptyLine()
	 *
	 */
	@Override
	public void insertEmptyLine() {
		document.createParagraph();
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

	@Override
	public void importImage(ImageDescription image, String caption) {
		// FIXME This method should be removed
	}

	@Override
	public void writeImageSubtitle(ImageDescription image) {
		// FIXME This method should be removed
	}

}
