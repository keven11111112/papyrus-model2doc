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
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.odt.ui.handler;

import java.io.File;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationFactory;
import org.eclipse.papyrus.model2doc.core.transcriber.Transcriber;
import org.eclipse.papyrus.model2doc.core.transcriber.TranscriberFactory;
import org.eclipse.papyrus.model2doc.documentview.ui.menu.handler.CreateDocumentViewEditorHandler;
import org.eclipse.papyrus.model2doc.odt.transcription.ODTTranscriptionFactory;
import org.eclipse.papyrus.model2doc.odt.ui.Activator;
import org.eclipse.uml2.uml.Package;

/**
 * Handler class for generating ODT file from UML model.
 */
public class GeneratorUML2ODTHandler extends CreateDocumentViewEditorHandler {

	private String generatedDocumentFileURI;

	/**
	 * @see org.eclipse.papyrus.model2doc.core.ui.handler.UML2DocHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// never used
		return null;
	}

	@Override
	public boolean generateDocument(String name) {
		final EObject selectedElement = getSelection();
		if (null == selectedElement || null == selectedElement.eResource()) {
			return false;
		}
		URI uri = selectedElement.eResource().getURI();
		uri = uri.trimFileExtension();
		uri = uri.trimSegments(uri.segmentsList().size() - 2);

		final String projectFolder = uri.toString();
		DefaultDocumentGeneratorConfiguration configuration = GeneratorConfigurationFactory.eINSTANCE.createDefaultDocumentGeneratorConfiguration();
		configuration.setDocumentName(name);
		configuration.setDocumentFolder(projectFolder);
		final String templateFileURI = "platform:/plugin/" + "org.eclipse.papyrus.model2doc.odt" + "/template/PapyrusTemplate.ott";
		configuration.setTemplateFile(templateFileURI);
		try {
			// Execute generator
			Transcriber umlTranscriber = TranscriberFactory.INSTANCE.createUMLTranscriber((Package) getSelection(),
					ODTTranscriptionFactory.INSTANCE.getDefaultODTTranscription(null, configuration));
			umlTranscriber.transcribe();

			StringBuilder uriBuilder = new StringBuilder();
			uriBuilder.append(projectFolder);
			uriBuilder.append(File.separator);
			uriBuilder.append(name);
			uriBuilder.append(".odt"); //$NON-NLS-1$

			Path path = new Path(uriBuilder.toString());
			generatedDocumentFileURI = path.toString();
			getWorkspaceResourceService().refreshWorkspace(projectFolder);
			return true;
		} catch (Exception e) {
			Activator.log.error(e);
			return false;
		}
	}

	/**
	 * @since 2.0
	 */
	@Override
	public String getGeneratedDocumentFileURI() {
		return generatedDocumentFileURI;
	}
}
