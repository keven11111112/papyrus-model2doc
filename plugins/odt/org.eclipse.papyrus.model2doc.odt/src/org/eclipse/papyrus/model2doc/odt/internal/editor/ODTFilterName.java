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

package org.eclipse.papyrus.model2doc.odt.internal.editor;

/**
 * Enumeration values for the {@link StorePropertiesConstants#FILTER_NAME}
 *
 * it exists many more possibilities than these provided here
 */
public enum ODTFilterName {

	WRITER8("writer8"),

	WRITER_PDF_EXPORT("writer_pdf_Export");


	/**
	 * the name of the file
	 */
	private String filterName;

	/**
	 *
	 * Constructor.
	 *
	 * @param name
	 *            the name of the PDF version
	 * @param code
	 *            the code to use to get the expected PDF format during the export
	 */
	private ODTFilterName(final String name) {
		this.filterName = name;
	}


	/**
	 *
	 * @return
	 *         the name of the PDF version
	 */
	public String getFilterName() {
		return this.filterName;
	}

}
