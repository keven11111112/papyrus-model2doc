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
package org.eclipse.papyrus.model2doc.core.config;

/**
 * Generator Configuration Interface. 
 *
 */
public interface GeneratorConfig {
	
	/**
	 * Get Document Name.
	 * 
	 * @return
	 */
	public String getDocumentName();
	
	/**
	 * Set Document Name.
	 * 
	 * @param documentName
	 */
	public void setDocumentName(String documentName);
	
	/**
	 * Get Eclipse Project Name.
	 * 
	 * @return
	 */
	public String getProject();
	
	/**
	 * Set Eclipse Project Name.
	 * 
	 * @param project
	 */
	public void setProject(String project);
	
	/**
	 * Get Output Folder.
	 * 
	 * @return
	 */
	public String getOutputFolder();
	
	/**
	 * Set Output Folder.
	 * 
	 * @param outputFolder
	 */
	public void setOutputFolder(String outputFolder);
	
	/**
	 * Get Template Style File URI.
	 * 
	 * @return
	 */
	public String getTemplateStyleFileURI();
	
	/**
	 * Set Template Style File URI.
	 * 
	 * @param templateStyleFileURI
	 */
	public void setTemplateStyleFileURI(String templateStyleFileURI);

}
