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
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipInputStream;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.model2doc.dev.tools.Activator;
import org.eclipse.papyrus.model2doc.dev.tools.utils.ZipUtils;

/**
 *
 * This class has been created to extract easily all files owned by an odt file and format the xml files.
 *
 */
public class UnzipOdtFileHandler extends AbstractODTFileHandler {

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

			// same thing for the selected odt file
			final String odtFileLocation = getOSPathFromURI(uri);

			try {
				ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(odtFileLocation));
				final String outputFolder = getOSPathFromURI(uri.trimFileExtension());
				File f = new File(outputFolder);

				ZipUtils.extract(zipInputStream, f);
				// we refresh the workspace
				refreshWorkspace();


				// format XML files
				formatAllXMLFiles(f);
			} catch (IOException e) {
				Activator.log.error(e);
			}
		}


		// we refresh the workspace
		try {
			Activator.log.info("Refresh workspace"); //$NON-NLS-1$
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			Activator.log.error("Exception during workspace refresh", e); //$NON-NLS-1$
		}

		return null;
	}

	/**
	 * This method format all xml files owned by the folder (recursively)
	 *
	 * @param folder
	 *            a folder
	 */
	private static final void formatAllXMLFiles(final File folder) {
		final Iterator<File> iter = getAllOwnedFiles(folder).iterator();
		while (iter.hasNext()) {
			final File current = iter.next();
			final String path = current.getAbsolutePath();
			formatXMLFile(path);
		}
	}

	/**
	 *
	 * @param folder
	 *            a folder
	 * @return
	 *         all the owned files recursively
	 */
	private static final List<File> getAllOwnedFiles(final File folder) {
		final List<File> files = new ArrayList<>();
		final List<File> tmp = Arrays.asList(folder.listFiles());
		files.addAll(tmp);
		for (File current : tmp) {
			if (current.isDirectory()) {
				files.addAll(getAllOwnedFiles(current));
			}
		}

		return files;
	}
}
