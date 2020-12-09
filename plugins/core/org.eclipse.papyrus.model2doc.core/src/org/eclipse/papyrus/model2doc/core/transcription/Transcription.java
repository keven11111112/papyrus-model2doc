/*****************************************************************************
 * Copyright (c) 2019, 2020 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 * 	Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Bug 569249
 *
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.core.transcription;

import java.util.Collection;

import org.eclipse.papyrus.model2doc.core.author.IAuthor;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractList;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.IFileReference;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;


/**
 * Transcription Interface.
 * This interface defines the methods for writing and generating any file kind (e.g., html, odt, odp, ods).
 *
 */
public interface Transcription {

	/**
	 * Write Cover Page.
	 *
	 * @param coverPage
	 */
	public void writeCoverPage(CoverPage coverPage);

	/**
	 * Write Table of Contents.
	 *
	 * @param tocTitle
	 *            the title to use for the Table Of Contents
	 */
	public void writeTableOfContents(String tocTitle);

	/**
	 * Write the Table of Figure
	 *
	 * @param tofTitle
	 *            the title to use for the Table Of Figures
	 */
	public void writeTableOfFigures(String tofTitle);

	/**
	 * Refresh the contents of the table Of Contents, Table Of Index, ...
	 * Basically it must be called at the end of the transcription
	 */
	public void refreshTablesOfIndexes();

	/**
	 * Write document main title.
	 *
	 * @param documentTitle
	 */
	public void writeDocumentMainTitle(String documentTitle);


	/**
	 * this method allows to define the authors of the document
	 *
	 * @param authors
	 *            the authors of the document
	 */
	public void writeAuthors(final Collection<IAuthor> authors);

	/**
	 *
	 * @param version
	 *            the version of the document
	 */
	public void writeVersion(final String version);

	/**
	 * Write section title.
	 *
	 * @param sectionTitle
	 * @param sectionLevel
	 */
	public void writeSectionTitle(String sectionTitle, int sectionLevel);

	/**
	 * Write paragraph.
	 *
	 * @param paragraph
	 * @param processRichText
	 */
	public void writeParagraph(String paragraph, boolean processRichText);

	/**
	 * Write list.
	 *
	 * @param list
	 * @param processRichText
	 */
	public void writeList(AbstractList list, boolean processRichText);

	/**
	 * Add table.
	 *
	 * @param table
	 */
	public void writeTable(AbstractTable table);

	/**
	 * Insert the contents of a file in the document
	 *
	 * @param fileReference
	 *            a reference to a file
	 */
	public void insertFile(final IFileReference fileReference);

	/**
	 * Import image.
	 *
	 * @param image
	 *            the image to insert
	 * @param caption
	 *            the caption of the inserted image
	 */
	public void importImage(ImageDescription image, String caption);

	/**
	 *
	 * @param imagePath
	 *            the path of the image
	 * @param caption
	 *            the caption of the image
	 */
	public void writeImage(final String imagePath, final String caption);

	/**
	 * Import image.
	 *
	 * @param image
	 */
	public void writeImageSubtitle(ImageDescription image);

	/**
	 * Insert an empty empty line
	 */
	public void insertEmptyLine();

	/**
	 * Save transcription.
	 *
	 * @param label
	 *            the name of the new document
	 * @return
	 *         a string representing the path of the new document
	 *         TODO : clarify the format of the returned string
	 */
	public String save(String label);

	/**
	 * Get configuration of document generation.
	 *
	 * @return
	 */
	public IDocumentGeneratorConfiguration getGeneratorConfig();

	/**
	 * Verify if transcription can execute.
	 *
	 * @return
	 */
	public boolean canExecute();

}
