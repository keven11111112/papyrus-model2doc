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
 * 	 Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.docx.emf.structure2document.internal.utils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.docx.emf.structure2document.Activator;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.helpers.CreateFileFromTextDocumentHelper;

/**
 * This class provides Utilities method for Docx file generations
 * TODO : check if it it really necessary to get a such class
 */
public class GenerateDocxFileUtils {

	public static String generateDocxFile(final TextDocument docTemplate) {
		final CreateFileFromTextDocumentHelper helper = new CreateFileFromTextDocumentHelper(docTemplate, new DocxTranscriptionFactory());
		final String generatedFilePath = helper.generate();

		// refresh workspace
		// TODO make common method with odt generation
		final String projectToRefresh = docTemplate.getDocumentGeneratorConfiguration().createDocumentOutputAccessor().getProjectName();
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
