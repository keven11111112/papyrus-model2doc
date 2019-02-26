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

import org.eclipse.emf.ecore.EObject;

/**
 * Service interface for management of workspace resources.
 *
 */
public interface WorkspaceResourceService {

	/**
	 * Calculate project folder from selected UML element in the model.
	 * 
	 * @since 2.0
	 * 
	 * @param eObject
	 * 			the EObject
	 * @return the project (default) folder to use to save the generated file. it is
	 *         a path relative to the current workspace
	 */
	public String calculateProjectFolder(EObject eObject);
	
	/**
	 * Refresh the workspace in order to make appears the created file.
	 * 
	 * @param outputFolder
	 */
	public void refreshWorkspace(String outputFolder);
	
	/**
	 * Get default folder for storing Model2Doc configurations.
	 * 
	 * @return
	 */
	public String getModel2ConfigForder();
}
