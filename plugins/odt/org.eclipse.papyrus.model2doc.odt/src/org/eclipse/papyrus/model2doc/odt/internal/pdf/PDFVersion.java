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
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.internal.pdf;

/**
 * This enumeration describes the PDF version available with the code to use in the PropertyValue
 * for the PDF creation (associated to the key {@link PDFFilterDataConstants#SELECT_PDF_VERSION}
 */
public enum PDFVersion {

	/**
	 * default case for LibreOffice, not idea about what is change really
	 */
	PDF_DEFAULT("PDF", 0), //$NON-NLS-1$

	/**
	 * PDF version A-1B
	 */
	PDF_A_1B("PDF/A-1B", 1), //$NON-NLS-1$


	/**
	 * PDF version A-2B
	 */
	PDF_A_2B("PDF/A-2B", 2); //$NON-NLS-1$

	/**
	 * the name of the PDF version
	 */
	private String name;

	/**
	 * the code to use to get the expected PDF format during the export
	 */
	private Integer code;

	/**
	 *
	 * Constructor.
	 *
	 * @param name
	 *            the name of the PDF version
	 * @param code
	 *            the code to use to get the expected PDF format during the export
	 */
	private PDFVersion(final String name, final int code) {
		this.name = name;
		this.code = Integer.valueOf(code);
	}

	/**
	 *
	 * @return
	 *         the code to use to get the expected PDF format during the export
	 */
	public Integer getCode() {
		return this.code;
	}

	/**
	 *
	 * @return
	 *         the name of the PDF version
	 */
	public String getName() {
		return this.name;
	}

	public static final PDFVersion getPDFVersionByString(final String str) {
		switch (str) {
		case "A-1B": //$NON-NLS-1$
			return PDFVersion.PDF_A_1B;
		case "A-2B": //$NON-NLS-1$
			return PDFVersion.PDF_A_2B;
		case "default": //$NON-NLS-1$
			return PDF_DEFAULT;
		default:
			return null;
		}
	}

}
