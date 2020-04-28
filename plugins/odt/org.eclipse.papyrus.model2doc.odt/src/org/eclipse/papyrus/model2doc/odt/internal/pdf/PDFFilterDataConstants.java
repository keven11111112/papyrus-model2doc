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
 * Constants for FilterData
 * many more constants exist, more details on https://forum.openoffice.org/en/forum/viewtopic.php?f=44&t=1804&start=0
 */
public final class PDFFilterDataConstants {

	private PDFFilterDataConstants() {
		// to prevent instantiation
	}

	/**
	 * value is an Integer (provided by {@link PDFVersion}
	 */
	public static final String SELECT_PDF_VERSION = "SelectPdfVersion"; //$NON-NLS-1$

}
