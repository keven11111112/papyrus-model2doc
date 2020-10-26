/*****************************************************************************
 * Copyright (c) 2019, 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Bug 568483
 *  Pauline DEVILLE - Bug 568255 [Model2Doc][Docx] Add developer tools to extract files from Docx
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.dev.tools.handlers;

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
import org.eclipse.papyrus.model2doc.dev.tools.Activator;

/**
 * Abstract handler used to manipulate zip file
 */
public abstract class AbstractZipFileHandler extends AbstractHandler {

	protected static final String XML_EXTENSION = "xml"; //$NON-NLS-1$

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
	protected final List<URI> getSelectedFileURI() {
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
			if (getFileExtension().equals(uri.fileExtension()) || getTemplateExtension().equals(uri.fileExtension())) {
				uris.add(uri);
			}
		}
		return uris;
	}

	/**
	 * @return
	 */
	protected abstract String getTemplateExtension();

	/**
	 * @return
	 */
	protected abstract String getFileExtension();

	/**
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		super.setBaseEnabled(getSelectedFileURI().size() > 0);
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
		org.eclipse.papyrus.model2doc.dev.tools.utils.XMLFormatter.format(file);
	}
}
