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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
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
 * This class has been created to extract easily the file content.xml from an odt file
 *
 */
public class ExtractContentsXmlFileHandler extends AbstractODTFileHandler {


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
		for (final URI uri : getSelectedOdtFileURI()) {

			// convert the current odt file platform/resource path into an xml path according to the OS (id for windows : C:\... or D:\...)
			final String contentXMLLocation = getOSPathFromURI(uri.trimFileExtension().appendFileExtension(XML_EXTENSION));

			// same thing for the selected odt file
			final String odtFileLocation = getOSPathFromURI(uri);

			final File odtFile = new File(odtFileLocation);
			try {
				final ZipFile odtZipFile = new ZipFile(odtFile);
				final Enumeration<? extends ZipEntry> entries = odtZipFile.entries();
				final FileOutputStream outputStream = new FileOutputStream(contentXMLLocation);
				while (entries.hasMoreElements()) {
					final ZipEntry current = entries.nextElement();
					if (CONTENT_XML_FILE.equals(current.getName())) {
						final InputStream in = odtZipFile.getInputStream(current);
						while (0 < in.available()) {
							final int read = in.read();
							outputStream.write(read);
						}

						in.close();
						break;// we can go out, we manage the wanted file
					}
				}

				odtZipFile.close();
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

}
