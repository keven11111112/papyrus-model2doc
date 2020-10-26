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
 *  Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.dev.tools.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.dev.tools.Activator;

/**
 *
 * This class has been created to extract easily the file document.xml from an docx file
 *
 */
public class ExtractDocxContentsXmlFileHandler extends AbstractZipFileHandler {

	/**
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (final URI uri : getSelectedFileURI()) {

			// convert the current file platform/resource path into an xml path according to the OS (id for windows : C:\... or D:\...)
			final String contentXMLLocation = getOSPathFromURI(uri.trimFileExtension().appendFileExtension(XML_EXTENSION));

			// same thing for the selected docx file
			final String docxFileLocation = getOSPathFromURI(uri);

			final File docxFile = new File(docxFileLocation);
			try {
				final ZipFile docxZipFile = new ZipFile(docxFile);
				final Enumeration<? extends ZipEntry> entries = docxZipFile.entries();
				final FileOutputStream outputStream = new FileOutputStream(contentXMLLocation);
				while (entries.hasMoreElements()) {
					final ZipEntry current = entries.nextElement();
					if (IDocxConstant.DOCX_CONTENT_FILE.equals(current.getName())) {
						final InputStream in = docxZipFile.getInputStream(current);
						while (0 < in.available()) {
							final int read = in.read();
							outputStream.write(read);
						}

						in.close();
						break;// we can go out, we manage the wanted file
					}
				}

				docxZipFile.close();
				outputStream.close();
				Activator.log.info(NLS.bind("XML file extracted from {0}", uri.toString())); //$NON-NLS-1$
			} catch (FileNotFoundException e) {
				Activator.log.error(NLS.bind("XML file not found in {0}", uri.toString()), e); //$NON-NLS-1$
			} catch (IOException e) {
				Activator.log.error(NLS.bind("IOException extracting XML file from {0}", uri.toString()), e); //$NON-NLS-1$
			}


			// we refresh the workspace
			refreshWorkspace();

			formatXMLFile(contentXMLLocation);

		}

		return null;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.dev.tools.handlers.AbstractZipFileHandler#getTemplateExtension()
	 *
	 * @return
	 */
	@Override
	protected String getTemplateExtension() {
		return IDocxConstant.DOTX_EXTENSION;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.dev.tools.handlers.AbstractZipFileHandler#getFileExtension()
	 *
	 * @return
	 */
	@Override
	protected String getFileExtension() {
		return IDocxConstant.DOCX_EXTENSION;
	}

}
