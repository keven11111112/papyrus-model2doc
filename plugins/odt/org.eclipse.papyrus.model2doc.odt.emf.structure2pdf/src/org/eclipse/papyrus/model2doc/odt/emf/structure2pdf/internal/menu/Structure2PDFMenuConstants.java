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

package org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.internal.menu;

/**
 * The constants used in the menus
 */
public final class Structure2PDFMenuConstants {

	private Structure2PDFMenuConstants() {
		// to prevent instantiation
	}

	/**
	 * the command's id for document generation
	 */
	public static final String GENERATE_DOCUMENT_AND_PDF_COMMAND = "org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.generateDocument_PDF"; //$NON-NLS-1$

	/**
	 * the command's id for document generation
	 */
	public static final String GENERATE_DOCUMENT_AND_PDF_A1B_COMMAND = "org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.generateDocument_PDF_A1B"; //$NON-NLS-1$

	/**
	 * the command's id for document generation
	 */
	public static final String GENERATE_DOCUMENT_AND_PDF_A2B_COMMAND = "org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.generateDocument_PDF_A2B"; //$NON-NLS-1$

	/**
	 * the variable's name used to get the pdf version in the menu label
	 */
	public static final String VARIABLE_PDF_VERSION_MENU_LABEL = "pdfVersionMenuLabelId"; //$NON-NLS-1$

	/**
	 * The PDF string
	 */
	public static final String PDF = "PDF";//$NON-NLS-1$
}
