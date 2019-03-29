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
package org.eclipse.papyrus.model2doc.integration.ieee.requirements.odt.ui.handler;

import java.io.File;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationFactory;
import org.eclipse.papyrus.model2doc.documentview.ui.menu.handler.CreateDocumentViewEditorHandler;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.odt.transcriber.IEEERequirementsTranscriber;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.odt.ui.Activator;
import org.eclipse.papyrus.model2doc.odt.transcription.ODTTranscriptionFactory;
import org.eclipse.uml2.uml.Package;

/**
 * Handler class for generating ODT file from UML model with IEEE Requirements Document Profile.
 */
public class GeneratorIEEERequirements2ODTHandler extends CreateDocumentViewEditorHandler {

	private String generatedDocumentFileURI;

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
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
		DefaultDocumentGeneratorConfiguration generatorConfig = GeneratorConfigurationFactory.eINSTANCE.createDefaultDocumentGeneratorConfiguration();
		generatorConfig.setDocumentFolder(projectFolder);
		generatorConfig.setDocumentName(name);
		final String templatePath = "platform:/plugin/" + org.eclipse.papyrus.model2doc.integration.ieee.requirements.odt.Activator.PLUGIN_ID + "/template/srs_template-ieee.ott";
		generatorConfig.setTemplateFile(templatePath);

		try {
			// Execute generator
			IEEERequirementsTranscriber ieeeRequirementsTranscriber = new IEEERequirementsTranscriber((Package) getSelection(),
					ODTTranscriptionFactory.INSTANCE.getDefaultODTTranscription(null, generatorConfig));
			ieeeRequirementsTranscriber.transcribe();

			StringBuilder uriBuilder = new StringBuilder();
			uriBuilder.append(projectFolder);
			uriBuilder.append(File.separator);
			uriBuilder.append(generatorConfig.getDocumentName());
			uriBuilder.append(".odt"); //$NON-NLS-1$

			Path path = new Path(uriBuilder.toString());
			generatedDocumentFileURI = path.toString();
			getWorkspaceResourceService().refreshWorkspace(generatorConfig.getDocumentFolder());
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
