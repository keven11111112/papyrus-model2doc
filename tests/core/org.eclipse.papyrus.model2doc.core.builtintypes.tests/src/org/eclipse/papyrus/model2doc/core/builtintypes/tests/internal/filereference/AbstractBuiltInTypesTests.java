/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.builtintypes.tests.internal.filereference;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesFactory;
import org.eclipse.papyrus.model2doc.core.builtintypes.DefaultFileReference;
import org.eclipse.papyrus.model2doc.core.builtintypes.tests.Activator;


/**
 * This abstract class provides useful method for JUnit tests of GeneratorConfiguration
 */
public abstract class AbstractBuiltInTypesTests {


	/**
	 *
	 * @param projectName
	 *            the name of a project
	 * @return
	 *         the created project or <code>null</code> in case of creation failure
	 */
	protected IProject createProject(final String projectName) {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!project.exists()) {
			try {
				project.create(new NullProgressMonitor());
				project.open(new NullProgressMonitor());
			} catch (CoreException e) {
				Activator.log.error(e);
			}
		}
		if (project.exists() && project.isOpen()) {
			return project;
		}
		return null;
	}

	/**
	 * @return
	 */
	protected DefaultFileReference createFileReference() {
		return BuiltInTypesFactory.eINSTANCE.createDefaultFileReference();
	}

	/**
	 *
	 * @param project
	 *            the project to destroy
	 */
	protected void destroyProject(final IProject project) {
		try {
			project.delete(true, true, new NullProgressMonitor());
		} catch (CoreException e) {
			Activator.log.error(e);
		}
	}
}
