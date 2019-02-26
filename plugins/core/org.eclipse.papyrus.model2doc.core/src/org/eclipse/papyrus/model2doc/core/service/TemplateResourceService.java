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
package org.eclipse.papyrus.model2doc.core.service;

/**
 * Service interface for management of template resource.
 *
 */
public interface TemplateResourceService {
	
	/**
	 * Get template URL from bundle.
	 * 
	 * @return
	 */
	public String getTemplateURLFromPlugIn();
	
	/**
	 * Get plug-in ID who contains the template.
	 * 
	 * @return
	 */
	public String getTemplatePlugInID();
	
	/**
	 * Get template path in plug-in. 
	 * 
	 * @return
	 */
	public String getTemplatePathInPlugIn();

	/**
	 * Get template file extensions.
	 * @return
	 */
	public String[] getTemplateFileExtensions();
	

}
