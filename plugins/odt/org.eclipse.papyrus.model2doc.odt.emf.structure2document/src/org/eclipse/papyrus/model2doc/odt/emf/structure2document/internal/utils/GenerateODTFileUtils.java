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
 *   Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *   Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - bug 568430
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.utils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.helpers.CreateFileFromTextDocumentHelper;
import org.eclipse.papyrus.model2doc.odt.emf.structure2document.Activator;

/**
 * This allows to create utility methods and functions for the generation of ODT files.
 */
public class GenerateODTFileUtils {

	/**
	 * This allows to generate the ODT file from a text document.
	 *
	 * @param textDocument
	 *            The initial text from which one generate the ODT file.
	 *
	 * @return
	 *         the path of the generated file
	 */
	public static String generateODTFile(final TextDocument textDocument) {
		final CreateFileFromTextDocumentHelper helper = new CreateFileFromTextDocumentHelper(textDocument, new ODTTranscriptionFactory());
		final String generatedFilePath = helper.generate();

		// refresh workspace
		final String projectToRefresh = textDocument.getDocumentGeneratorConfiguration().createDocumentOutputAccessor().getProjectName();
		if (projectToRefresh != null && !projectToRefresh.isEmpty()) {
			final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectToRefresh);
			if (null != project) {
				try {
					// refresh project
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					Activator.log.error(NLS.bind("An exception occured during the refresh of the project {0}", projectToRefresh), e); //$NON-NLS-1$
				}
			}
		}

		return generatedFilePath;
	}

}
