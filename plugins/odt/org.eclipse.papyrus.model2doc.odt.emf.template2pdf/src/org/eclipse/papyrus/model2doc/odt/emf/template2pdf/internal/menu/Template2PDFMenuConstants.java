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

package org.eclipse.papyrus.model2doc.odt.emf.template2pdf.internal.menu;

/**
 * The constants used in the menus
 */
public final class Template2PDFMenuConstants {

	private Template2PDFMenuConstants() {
		// to prevent instantication
	}

	/**
	 * the command's id for document generation
	 */
	public static final String GENERATE_STRUCTURE_DOCUMENT_AND_PDF_COMMAND = "org.eclipse.papyrus.model2doc.odt.emf.template2pdf.generateStructure_Document_PDF"; //$NON-NLS-1$

	/**
	 * the command's id for document generation
	 */
	public static final String GENERATE_STRUCTURE_DOCUMENT_AND_PDF_A1B_COMMAND = "org.eclipse.papyrus.model2doc.odt.emf.template2pdf.generateStructure_Document_PDF_A1B"; //$NON-NLS-1$

	/**
	 * the command's id for document generation
	 */
	public static final String GENERATE_STRUCTURE_DOCUMENT_AND_PDF_A2B_COMMAND = "org.eclipse.papyrus.model2doc.odt.emf.template2pdf.generateStructure_Document_PDF_A2B"; //$NON-NLS-1$

	/**
	 * the variable's name used to get the pdf version in the menu label
	 */
	public static final String VARIABLE_PDF_VERSION_MENU_LABEL = "pdfVersionMenuLabelId"; //$NON-NLS-1$

	/**
	 * The PDF string
	 */
	public static final String PDF = "PDF";//$NON-NLS-1$
}
