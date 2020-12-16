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

package org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests.internal.metamodel;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationFactory;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests.Activator;

/**
 * This abstract class provides useful method for JUnit tests of GeneratorConfiguration
 */
public abstract class AbstractGeneratorConfigurationTests {

	protected static final String DOCUMENT_FOLDER = "DocumentFolder"; //$NON-NLS-1$

	protected static final String GENERATOR_DOCUMENT_ID = "GeneratorDocumentId"; //$NON-NLS-1$

	protected static final String DOCUMENT_NAME = "DocumentName"; //$NON-NLS-1$

	protected static final String IMAGE_FOLDER = "Image Folder"; //$NON-NLS-1$

	protected static final boolean SAVE_DOCUMENT_STRUCTURE_TRUE = true;

	protected static final boolean SAVE_IMAGE_TRUE = true;

	protected static final String STRUCTURE_FOLDER = "StructureFolder"; //$NON-NLS-1$

	protected static final String STRUCTURE_GENERATOR_ID = "Structure.generator.id"; //$NON-NLS-1$

	protected static final String TEMPLATE_FILE = "templateFile"; //$NON-NLS-1$


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
	 * this method creates a {@link DefaultDocumentStructureGeneratorConfiguration} with default field values
	 *
	 * @return
	 *         a new {@link DefaultDocumentStructureGeneratorConfiguration}
	 */
	protected DefaultDocumentStructureGeneratorConfiguration createDocumentStructureGeneratorConfiguration() {
		final DefaultDocumentStructureGeneratorConfiguration defaultConf = GeneratorConfigurationFactory.eINSTANCE.createDefaultDocumentStructureGeneratorConfiguration();
		defaultConf.setDocumentFolder(DOCUMENT_FOLDER);
		defaultConf.setDocumentGeneratorId(GENERATOR_DOCUMENT_ID);
		defaultConf.setDocumentName(DOCUMENT_NAME);
		defaultConf.setImageFolder(IMAGE_FOLDER);
		defaultConf.setStructureFolder(STRUCTURE_FOLDER);
		defaultConf.setStructureGeneratorId(STRUCTURE_GENERATOR_ID);
		defaultConf.setTemplateFile(TEMPLATE_FILE);

		defaultConf.setSaveDocumentStructure(SAVE_DOCUMENT_STRUCTURE_TRUE);
		defaultConf.setSaveImages(SAVE_IMAGE_TRUE);

		return defaultConf;
	}


	/**
	 * this method creates a {@link DefaultDocumentGeneratorConfiguration} with default field values
	 *
	 * @return
	 *         a new {@link DefaultDocumentGeneratorConfiguration}
	 */
	protected DefaultDocumentGeneratorConfiguration createDefaultDocumentGeneratorConfiguration() {
		final DefaultDocumentGeneratorConfiguration defaultConf = GeneratorConfigurationFactory.eINSTANCE.createDefaultDocumentGeneratorConfiguration();
		defaultConf.setDocumentFolder(DOCUMENT_FOLDER);
		defaultConf.setDocumentGeneratorId(GENERATOR_DOCUMENT_ID);
		defaultConf.setDocumentName(DOCUMENT_NAME);
		defaultConf.setTemplateFile(TEMPLATE_FILE);

		defaultConf.setSaveDocumentStructure(SAVE_DOCUMENT_STRUCTURE_TRUE);
		defaultConf.setSaveImages(SAVE_IMAGE_TRUE);
		return defaultConf;
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
