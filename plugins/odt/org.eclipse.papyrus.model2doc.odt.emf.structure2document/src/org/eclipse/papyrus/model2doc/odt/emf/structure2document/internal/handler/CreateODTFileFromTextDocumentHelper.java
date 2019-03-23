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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.handler;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.model2doc.core.internal.config.DefaultGeneratorConfig;
import org.eclipse.papyrus.model2doc.core.service.WorkspaceResourceService;
import org.eclipse.papyrus.model2doc.core.service.WorkspaceResourceServiceImpl;
import org.eclipse.papyrus.model2doc.core.transcriber.Transcriber;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.odt.emf.structure2document.Activator;
import org.eclipse.papyrus.model2doc.odt.emf.structure2document.transcriber.StructureToODTTranscriber;
import org.eclipse.papyrus.model2doc.odt.internal.editor.DefaultStyleEditor;
import org.eclipse.papyrus.model2doc.odt.internal.transcription.ODTTranscription;

/**
 *
 */
public class CreateODTFileFromTextDocumentHelper {

	private TextDocument textDocument;

	protected CreateODTFileFromTextDocumentHelper() {
		// nothing to do
	}

	public CreateODTFileFromTextDocumentHelper(final TextDocument textDocument) {
		setTextDocument(textDocument);
	}


	public void generate() {
		if (this.textDocument == null) {
			Activator.log.warn("The TextDocument is null");
			return;
		}

		DefaultGeneratorConfig config = new DefaultGeneratorConfig();
		String documentName = textDocument.getGenerationConfiguration().getOutputFile();
		config.setDocumentName(documentName.substring(0, documentName.indexOf(".odt") - 1));

		String project = getWorkspaceResourceService().calculateProjectFolder(textDocument);
		config.setProject(project);

		String outputFolder = textDocument.getGenerationConfiguration().getOutputFolder();
		config.setOutputFolder(outputFolder.replaceFirst(outputFolder, "")); // TODO : remove me too


		// TODO : remove the need to the project string

		String templateStyleFileURI;

		URI uri = URI.createURI(textDocument.getCoverPage().getPath(), true);
		int i = 0;
		i++;
		IPath res = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))).getLocation();
		// uri.toPlatformString(false)
		// uri.toFileString()
		if (uri.isPlatformPlugin()) {
			i++;
		} else if (uri.isPlatformResource()) {
			i++;
		}

		String templatePathInPlugin = "";
		String pluginID = "";
		String templateString = res.toPortableString();
		System.out.println("Template String=" + templateString);

		// bugged!
		config.setTemplateStyleFileURI(templateString);

		// odtGeneratorConfig;
		DefaultStyleEditor styleEditor = new DefaultStyleEditor();
		Transcription transcription = new ODTTranscription(styleEditor, config);

		Transcriber t = new StructureToODTTranscriber(textDocument, transcription);
		t.transcribe();


	}


	protected void setTextDocument(final TextDocument textDocument) {
		this.textDocument = textDocument;
	}


	// String projectFolder = getWorkspaceResourceService().calculateProjectFolder(getSelection());

	private WorkspaceResourceService workspaceResourceService = new WorkspaceResourceServiceImpl();


	private WorkspaceResourceService getWorkspaceResourceService() {
		return workspaceResourceService;
	}
}
