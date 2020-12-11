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
 *   Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.docx.internal.poi;

import org.apache.poi.ooxml.POIXMLRelation;

/**
 * This class allows to create a generic relation between document and inserted files
 */
public class CustomXWPFGenericRelation extends POIXMLRelation {

	/**
	 *
	 * Constructor.
	 *
	 * @param type
	 *            the contentType of the inserted file
	 */
	public CustomXWPFGenericRelation(String type) {
		super(
				type,
				"http://schemas.openxmlformats.org/officeDocument/2006/relationships/aFChunk", //$NON-NLS-1$
				null);
	}
}
