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
package org.eclipse.papyrus.model2doc.core.internal.config;

import org.eclipse.papyrus.model2doc.core.config.GeneratorConfig;

/**
 * ODT Generator Configuration.
 * 
 */
public class DefaultGeneratorConfig implements GeneratorConfig {
	
	private String documentName;
	
	private String project;
	
	private String outputFolder;
	
	private String templateStyleFileURI;
	
	@Override
	public String getDocumentName() {
		return documentName;
	}

	@Override
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	
	@Override
	public String getProject() {
		return project;
	}

	@Override
	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String getOutputFolder() {
		return outputFolder;
	}

	@Override
	public void setOutputFolder(String outputFolder) {
		this.outputFolder = outputFolder;		
	}

	@Override
	public String getTemplateStyleFileURI() {
		return templateStyleFileURI;
	}

	@Override
	public void setTemplateStyleFileURI(String templateStyleFileURI) {
		this.templateStyleFileURI = templateStyleFileURI;		
	}

}
