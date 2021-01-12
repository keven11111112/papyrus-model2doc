/*****************************************************************************
 * Copyright (c) 2020, 2021 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *   Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Bug 570290
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.docx.internal.poi;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.compress.utils.IOUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.docx.Activator;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;

/**
 * This custom implementation allow to add some missing methods in the apache api
 */
public class CustomXWPFDocument extends XWPFDocument {

	private static int fileIndex = 0;

	/**
	 * With the insertFile method we can insert files, we don't know exactly the list of file we can insert.
	 * We know that following files can be inserted. In other case often the document even can not be open.
	 */
	private static final List<String> TESTED_FILE_INSERTION = new ArrayList<>(Arrays.asList(
			"html", //$NON-NLS-1$
			"docx", //$NON-NLS-1$
			"txt")); //$NON-NLS-1$

	/**
	 * just here to be sure we have the dependency on org.apache.commons.compress which is implicitly required by {@link CustomXWPFDocument}
	 * see bug 569530
	 */
	@SuppressWarnings("unused")
	private IOUtils utils;

	/**
	 * Constructor.
	 *
	 */
	public CustomXWPFDocument() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param template
	 * @throws IOException
	 */
	public CustomXWPFDocument(InputStream template) throws IOException {
		super(template);
	}

	/**
	 *
	 * @see org.apache.poi.xwpf.usermodel.XWPFDocument#createTOC()
	 *
	 */
	@Override
	public void createTOC() {
		XWPFParagraph paragraph = createParagraph();
		CTP ctP = paragraph.getCTP();

		CTSimpleField toc = ctP.addNewFldSimple();
		toc.setInstr("TOC \\o"); //$NON-NLS-1$
		toc.setDirty(STOnOff.TRUE); // FIXME a pop up appear when we open the document
	}

	/**
	 * Create a Table of Figure
	 */
	public void createTOF() {
		XWPFParagraph paragraph = createParagraph();
		CTSimpleField toc = paragraph.getCTP().addNewFldSimple();
		toc.setInstr("TOC \\c \"figure\" \\* MERGEFORMAT"); //$NON-NLS-1$
		toc.setDirty(STOnOff.TRUE); // FIXME a pop up appear when we open the document
	}

	/**
	 * Create an empty table with one row and one column as default.
	 *
	 * @return a new table
	 */
	@Override
	public XWPFTable createTable() {
		XWPFTable table = new CustomXWPFTable(getDocument().getBody().addNewTbl(), this);
		bodyElements.add(table);
		tables.add(table);
		return table;
	}

	/**
	 * Create an empty table with a number of rows and cols specified
	 *
	 * @param rows
	 * @param cols
	 * @return table
	 */
	@Override
	public XWPFTable createTable(int rows, int cols) {
		XWPFTable table = new CustomXWPFTable(getDocument().getBody().addNewTbl(), this, rows, cols);
		bodyElements.add(table);
		tables.add(table);
		return table;
	}

	/**
	 * Appends a new {@link CustomXWPFParagraph} to this document
	 *
	 * @return the new customXWPFParagraph
	 */
	@Override
	public XWPFParagraph createParagraph() {
		XWPFParagraph p = new CustomXWPFParagraph(getDocument().getBody().addNewP(), this);
		bodyElements.add(p);
		paragraphs.add(p);
		return p;
	}

	/**
	 * Copy the file in the archive and add relation to be able to insert it by AltChunk in the document
	 *
	 * @param filePath
	 *            the file path of the original file
	 * @return the id of the importedFile
	 * @throws IOException
	 * @throws InvalidFormatException
	 */
	public String importFile(String filePath) throws IOException, InvalidFormatException {
		String fileExtension = getFileExtension(filePath);

		// Build a unique id
		String id = "file" + fileIndex; //$NON-NLS-1$
		fileIndex++;

		// Build the path of the new file into the archive
		StringBuilder partPathBuilder = new StringBuilder("/word/media/"); //$NON-NLS-1$
		partPathBuilder.append(id);
		partPathBuilder.append("."); //$NON-NLS-1$
		partPathBuilder.append(fileExtension);

		// Create the new file by coping the file in the archive
		OPCPackage opcPackage = getPackage();
		PackagePartName partName;
		partName = PackagingURIHelper.createPartName(partPathBuilder.toString());

		String contentType = Files.probeContentType(Paths.get(filePath.replaceFirst("/", ""))); //$NON-NLS-1$ //$NON-NLS-2$
		if (contentType == null) {
			contentType = "text/plain"; //$NON-NLS-1$
		}
		PackagePart packagePart = opcPackage.createPart(partName, contentType);
		CustomXWPFPart part = new CustomXWPFPart(packagePart, id, filePath);

		// Add the relation between the new file in the archive and the altChunk id
		addRelation(part.getId(), new CustomXWPFGenericRelation(contentType), part);
		return id;
	}

	/**
	 * This method import and insert a file in the document by using the altChunk element
	 *
	 * @param filePath
	 *            the path of the file to insert
	 * @return the newly created CustomXWPFPart
	 * @throws Exception
	 */
	public void insertFile(String filePath) {
		String fileExtension = getFileExtension(filePath);

		// Check if the extension is supported
		if (false == isTestedFileExtension(fileExtension)) {
			Activator.log.warn(NLS.bind("We only the insertion of {0} files are supported", TESTED_FILE_INSERTION)); //$NON-NLS-1$

			XWPFParagraph paragraph = createParagraph();
			XWPFRun run = paragraph.createRun();
			run.setText(NLS.bind("[The file {0} cannot be inserted]", filePath)); //$NON-NLS-1$
			run.setColor("FF0000"); // red //$NON-NLS-1$
			run.setItalic(true);
			return;
		}

		try {
			String id = importFile(filePath);

			// Add the altChunk into the document
			getDocument().getBody().addNewAltChunk().setId(id);
		} catch (InvalidFormatException | IOException e) {
			Activator.log.error(e);
		}

	}

	/**
	 * This method just write a message in the console if we are not sure that the extension of the file is supported
	 */
	private boolean isTestedFileExtension(String extension) {
		return TESTED_FILE_INSERTION.stream().anyMatch(s -> s.equalsIgnoreCase(extension));
	}

	/**
	 * Get the file extension
	 *
	 * @param filePath
	 * @return the file extension
	 */
	private String getFileExtension(String filePath) {
		String[] split = filePath.split("\\."); //$NON-NLS-1$
		return split[split.length - 1];
	}

}
