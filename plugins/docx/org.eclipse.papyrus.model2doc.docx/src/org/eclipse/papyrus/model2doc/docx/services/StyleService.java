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
package org.eclipse.papyrus.model2doc.docx.services;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;

public interface StyleService {

	/**
	 * Apply the document main title style
	 *
	 * @param paragraph
	 *            the paragraph on which the main title style will be applied
	 * @return true if the style has been find, false otherwise
	 */
	boolean applyDocumentMainTitleStyle(XWPFParagraph paragraph);

	/**
	 * Apply the section title style
	 *
	 * @param paragraph
	 *            the paragraph on which the section title style will be
	 *            applied
	 * @param sectionLevel
	 *            the level of the section
	 * @return true if the style has been find, false otherwise
	 */
	boolean applySectionTitleStyle(XWPFParagraph paragraph, int sectionLevel);

	/**
	 * Apply the style to the table
	 *
	 * @param table
	 *            the table on which the style will be applied
	 * @param document
	 *            the document owning the table
	 */
	boolean applyTableStyle(XWPFTable table, XWPFDocument document);

	/**
	 * Apply the caption style to the paragraph
	 *
	 * @param paragraph
	 *            the paragraph on which the style will be applied
	 * @param document
	 *            the document owning the table
	 */
	boolean applyCaptionStyle(XWPFParagraph paragraph, XWPFDocument document);

	/**
	 * Apply the style given as parameter styleName
	 *
	 * @param paragraph
	 *            the paragraph on which the style will be applied
	 * @param styleName
	 *            the name of the style to apply
	 * @return true if the style has been find, false otherwise
	 */
	boolean applyStyle(XWPFParagraph paragraph, String styleName);

	/**
	 * Get the document main title style name
	 *
	 * @return the document main title style name
	 */
	String getDocumentMainTitleStyle();

	/**
	 * Get the document section title style name
	 *
	 * @param sectionLevel
	 *            the level of the section
	 * @return the document section title style name
	 */
	String getSectionTitleStyle(int sectionLevel);


	/**
	 * Get heading style name
	 *
	 * @return the heading style name
	 */
	String getSectionStylePrefix();

	/**
	 * Get the caption style name
	 *
	 * @return the caption style name
	 */
	String getCaptionStyleValue();

}