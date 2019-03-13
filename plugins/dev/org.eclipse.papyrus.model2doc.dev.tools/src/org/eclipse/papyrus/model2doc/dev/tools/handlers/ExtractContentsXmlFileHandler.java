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
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.dev.tools.Activator;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.xml.core.internal.formatter.XMLFormatterFormatProcessor;

/**
 *
 * This class has been created to extract easily the file content.xml from an odt file
 *
 */
public class ExtractContentsXmlFileHandler extends AbstractHandler {

	private static final String XML_EXTENSION = "xml"; //$NON-NLS-1$

	private static final String ODT_EXTENSION = "odt"; //$NON-NLS-1$

	private static final String OTT_EXTENSION = "ott"; //$NON-NLS-1$

	private static final String CONTENT_XML_FILE = "content.xml"; //$NON-NLS-1$

	/**
	 * the format processor used to format XML files
	 */
	private XMLFormatterFormatProcessor processor = new XMLFormatterFormatProcessor();


	// TODO move me in a util class
	private static final String getOSPathFromURI(final URI uri) {
		String workspaceLocation = null;
		if (uri.isPlatformResource()) {
			workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))).getRawLocation().toOSString();
		}
		return workspaceLocation;
	}

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



			// formatting file now
			final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(contentXMLLocation));
			if (null != file) {
				try {
					processor.formatFile(file);
					Activator.log.info(NLS.bind("XML file {0} is now formatted", contentXMLLocation)); //$NON-NLS-1$
				} catch (IOException ex) {
					Activator.log.error(NLS.bind("IOException formating the XML file from {0}", contentXMLLocation), ex); //$NON-NLS-1$
				} catch (CoreException ex) {
					Activator.log.error(NLS.bind("Exception during the formatting of {0}", contentXMLLocation), ex); //$NON-NLS-1$
				}
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
	 *
	 * @return
	 * 		the URI of the uml selected files
	 */
	private final List<URI> getSelectedOdtFileURI() {
		final Iterator<?> iter = getCurrentStructuredSelection().iterator();
		final List<URI> uris = new ArrayList<>();
		// 1. we iterate on the selection
		while (iter.hasNext()) {
			// 2. we get the file uml file URI
			final Object current = iter.next();
			String pathName = null;
			if (current instanceof IAdaptable) {
				final IFile f = ((IAdaptable) current).getAdapter(IFile.class);
				pathName = f.getFullPath().toPortableString();
			}
			final URI uri = URI.createPlatformResourceURI(pathName, true);
			if (ODT_EXTENSION.equals(uri.fileExtension()) || OTT_EXTENSION.equals(uri.fileExtension())) {
				uris.add(uri);
			}
		}
		return uris;
	}


	/**
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		super.setBaseEnabled(getSelectedOdtFileURI().size() > 0);
	}


	// TODO : these methods are duplicated from org.eclipse.papyrus.infra.ui.util.SelectionHelper

	/**
	 *
	 * @return
	 * 		the selection service or <code>null</code> if not found
	 *
	 */
	public static final ISelectionService getSelectionService() {
		IWorkbench wb = PlatformUI.getWorkbench();
		if (wb != null) {
			IWorkbenchWindow ww = wb.getActiveWorkbenchWindow();
			if (ww != null) {
				return ww.getService(ISelectionService.class);
			}
		}
		return null;
	}

	/**
	 *
	 * @return
	 * 		the current selection or an empty selection. can't be <code>null</code>
	 */
	public static final ISelection getCurrentSelection() {
		final ISelectionService selectionService = getSelectionService();
		if (selectionService != null) {
			ISelection currentSelection = selectionService.getSelection();
			if (currentSelection != null) {
				return currentSelection;
			}
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 *
	 * @return
	 * 		a structured selection.
	 *         the returned value can't be <code>null</code>
	 */
	public static final IStructuredSelection getCurrentStructuredSelection() {
		ISelection selection = getCurrentSelection();
		if (selection instanceof IStructuredSelection) {
			return (IStructuredSelection) selection;
		}
		return StructuredSelection.EMPTY;
	}


}
