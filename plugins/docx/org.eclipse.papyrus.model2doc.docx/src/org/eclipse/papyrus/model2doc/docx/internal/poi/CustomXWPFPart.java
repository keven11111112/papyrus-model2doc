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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ooxml.POIXMLDocumentPart;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.docx.Activator;

/**
 * This custom implementation is a new POIXMLDocumentPart to be able to add text files into the document
 * https://docs.microsoft.com/en-us/dotnet/api/documentformat.openxml.wordprocessing.altchunk?view=openxml-2.8.1
 */
public class CustomXWPFPart extends POIXMLDocumentPart {

	private String filePath;

	private String id;


	public CustomXWPFPart(PackagePart part, String id, String filePath) {
		super(part);
		this.filePath = filePath;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath
	 *            the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * Copy the content of the original file into a new file created into the packagePart
	 *
	 * @see org.apache.poi.ooxml.POIXMLDocumentPart#commit()
	 *
	 * @throws IOException
	 */
	@Override
	protected void commit() throws IOException {
		try {
			FileInputStream originalFile = new FileInputStream(filePath);
			PackagePart part = getPackagePart();
			if (part != null) {
				OutputStream partOutputStream = part.getOutputStream();

				// copy the originalFile in the packagePart
				byte[] array = new byte[originalFile.available()];
				originalFile.read(array);
				partOutputStream.write(array);

				partOutputStream.close();
			}
			originalFile.close();
		} catch (FileNotFoundException e) {
			// Do nothing
			Activator.log.warn(NLS.bind("The {0} file has not been found", filePath)); //$NON-NLS-1$
		}
	}

}
