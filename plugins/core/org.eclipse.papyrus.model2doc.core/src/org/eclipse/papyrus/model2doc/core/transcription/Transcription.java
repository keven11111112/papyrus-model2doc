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
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.core.transcription;

import java.util.List;

import org.eclipse.papyrus.model2doc.core.config.GeneratorConfig;

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
	 * @param tocTitle TODO
	 */
	public void writeTableOfContents(String tocTitle);

	/**
	 * Refresh the contents of the table Of Contents. Basically it must be called at the end of the transcription
	 */
	public void refreshTableOfContents();

	/**
	 * Write document main title.
	 *
	 * @param documentTitle
	 */
	public void writeDocumentMainTitle(String documentTitle);

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
	 * @param items
	 * @param processRichText
	 */
	public void writeList(List<String> items, boolean processRichText);

	/**
	 * Add table.
	 * 
	 * @param table
	 * @param style
	 *                  define background color (HEX format, e.x. 0xE06666).
	 */
	public void addTable(Table table, Object style);

	/**
	 * Import image.
	 * 
	 * @param image
	 * @param caption TODO
	 */
	public void importImage(ImageDescription image, String caption);

	/**
	 * Import image.
	 * 
	 * @param image
	 */
	public void writeImageSubtitle(ImageDescription image);


	/**
	 * Save transcription.
	 * 
	 * @param label
	 */
	public void save(String label);

	/**
	 * Get configuration of document generation.
	 * 
	 * @return
	 */
	public GeneratorConfig getGeneratorConfig();

	/**
	 * Verify if transcription can execute.
	 * 
	 * @return
	 */
	public boolean canExecute();

}