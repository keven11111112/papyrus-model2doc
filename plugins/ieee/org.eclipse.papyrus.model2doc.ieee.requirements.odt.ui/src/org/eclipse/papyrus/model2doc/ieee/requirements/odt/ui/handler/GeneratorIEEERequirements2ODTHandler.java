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
package org.eclipse.papyrus.model2doc.ieee.requirements.odt.ui.handler;

import java.io.File;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Path;
import org.eclipse.uml2.uml.Package;

import org.eclipse.papyrus.model2doc.core.config.GeneratorConfig;
import org.eclipse.papyrus.model2doc.core.config.GeneratorConfigFactory;
import org.eclipse.papyrus.model2doc.core.service.TemplateResourceService;
import org.eclipse.papyrus.model2doc.documentview.ui.menu.handler.CreateDocumentViewEditorHandler;
import org.eclipse.papyrus.model2doc.ieee.requirements.odt.service.IEEERequirementsTemplateResourceService;
import org.eclipse.papyrus.model2doc.ieee.requirements.odt.transcriber.IEEERequirementsTranscriber;
import org.eclipse.papyrus.model2doc.ieee.requirements.odt.ui.Activator;
import org.eclipse.papyrus.model2doc.odt.transcription.ODTTranscriptionFactory;

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
		TemplateResourceService templateResourceService =  new IEEERequirementsTemplateResourceService();
		String projectFolder = getWorkspaceResourceService().calculateProjectFolder(getSelection());
		
		GeneratorConfig generatorConfig = GeneratorConfigFactory.INSTANCE.getDefaultGeneratorConfig();
		generatorConfig.setDocumentName(name);
		generatorConfig.setOutputFolder(projectFolder);
		generatorConfig.setProject(projectFolder);
		generatorConfig.setTemplateStyleFileURI(templateResourceService.getTemplateURLFromPlugIn());
		
		try {
			// Execute generator
			IEEERequirementsTranscriber ieeeRequirementsTranscriber =  new IEEERequirementsTranscriber((Package) getSelection(),
					ODTTranscriptionFactory.INSTANCE.getDefaultODTTranscription(null, generatorConfig));
			ieeeRequirementsTranscriber.transcribe();
			
			StringBuilder uriBuilder = new StringBuilder();
			uriBuilder.append(generatorConfig.getOutputFolder());
			uriBuilder.append(File.separator);
			uriBuilder.append(generatorConfig.getDocumentName());
			uriBuilder.append(".odt"); //$NON-NLS-1$
			
			Path path = new Path (uriBuilder.toString());
			generatedDocumentFileURI =  path.toString();
			getWorkspaceResourceService().refreshWorkspace(generatorConfig.getProject());
			return true;
		} catch (Exception e) {
			Activator.log.error(e);
			return false;
		}
	}

	/**
	 *  @since 2.0
	 */
	@Override
	public String getGeneratedDocumentFileURI() {
		return generatedDocumentFileURI;
	}

}