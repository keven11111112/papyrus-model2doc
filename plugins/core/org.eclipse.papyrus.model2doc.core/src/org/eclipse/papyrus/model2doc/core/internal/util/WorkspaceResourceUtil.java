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
package org.eclipse.papyrus.model2doc.core.internal.util;

import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.model2doc.core.Activator;

/**
 * Utility class for management of workspace resources.
 *
 */
public class WorkspaceResourceUtil {
	
	/** Default folder for storing Model2Doc configurations. */
	public static final String MODEL2DOC_CONFIGS_FOLDER = ".model2doc_configs"; //$NON-NLS-1$
	
	/**
	 * Constructor.
	 *
	 */
	private WorkspaceResourceUtil() {
		// to avoid instantiation
	}

	/**
	 * Calculate project folder from selected UML element in the model.
	 * 
	 * @param element
	 * 			UML element
	 * @return the project (default) folder to use to save the generated file. it is
	 *         a path relative to the current workspace
	 */
	public static String calculateProjectFolder(EObject element) {
		String output = element.eResource().getURI().toPlatformString(true);
		final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(output));
		final IContainer parent = file.getParent();
		output = parent.getFullPath().toString();
		return output;
	}
	
	/**
	 * Refresh the workspace in order to make appears the created file.
	 * 
	 * @param outputFolder
	 */
	public static void refreshWorkspace(String outputFolder) {
		IContainer container;

		int nbToken = new StringTokenizer(outputFolder, "/").countTokens(); //$NON-NLS-1$
		if (nbToken == 1) {// it is a project
			container = ResourcesPlugin.getWorkspace().getRoot().getProject(outputFolder); // only one /
		} else {// it is a folder in a project
			container = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(outputFolder));
		}

		try {
			container.refreshLocal(2, new NullProgressMonitor());
		} catch (CoreException e) {
			Activator.log.error(e);
		}
	}

}
