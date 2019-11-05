/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
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

package org.eclipse.papyrus.model2doc.dev.tools.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.dev.tools.Activator;
import org.eclipse.wst.xml.core.internal.formatter.XMLFormatterFormatProcessor;

/**
 * TODO move me into an odt dev plugin
 *
 * Abstract handler used to manipulate ODT file
 */
public abstract class AbstractODTFileHandler extends AbstractHandler {

	protected static final String XML_EXTENSION = "xml"; //$NON-NLS-1$

	protected static final String ODT_EXTENSION = "odt"; //$NON-NLS-1$

	protected static final String OTT_EXTENSION = "ott"; //$NON-NLS-1$

	protected static final String CONTENT_XML_FILE = "content.xml"; //$NON-NLS-1$

	/**
	 * the format processor used to format XML files
	 */
	protected static final XMLFormatterFormatProcessor processor = new XMLFormatterFormatProcessor();


	// TODO move me in a util class
	protected static final String getOSPathFromURI(final URI uri) {
		String workspaceLocation = null;
		if (uri.isPlatformResource()) {
			workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))).getRawLocation().toOSString();
		}
		return workspaceLocation;
	}

	/**
	 *
	 * @return
	 *         the URI of the uml selected files
	 */
	protected final List<URI> getSelectedOdtFileURI() {
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

	/**
	 *
	 * @return
	 *         a structured selection.
	 *         the returned value can't be <code>null</code>
	 */
	public static final IStructuredSelection getCurrentStructuredSelection() {
		return SelectionUtils.getCurrentStructuredSelection();
	}

	/**
	 * This method allows to refresh the full workspace
	 */
	protected static final void refreshWorkspace() {
		try {
			Activator.log.info("Refresh workspace"); //$NON-NLS-1$
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			Activator.log.error("Exception during workspace refresh", e); //$NON-NLS-1$
		}
	}

	/**
	 *
	 * @param filePath
	 *            the path of the file to format
	 */
	protected static final void formatXMLFile(final String filePath) {
		// formatting file now
		final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(filePath));
		// file.exists()
		if (null != file) {
			try {
				processor.formatFile(file);
				Activator.log.info(NLS.bind("XML file {0} is now formatted", filePath)); //$NON-NLS-1$
			} catch (IOException ex) {
				Activator.log.error(NLS.bind("IOException formating the XML file from {0}", filePath), ex); //$NON-NLS-1$
			} catch (CoreException ex) {
				Activator.log.error(NLS.bind("Exception during the formatting of {0}", filePath), ex); //$NON-NLS-1$
			}
		}
	}
}
