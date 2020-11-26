/*****************************************************************************
 * Copyright (c) 2019, 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Bug 569252
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Version;
import org.eclipse.papyrus.model2doc.emf.documentstructure.internal.resource.DocumentStructureResource;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.Template2StructureRegistry;

/**
 * The command is used to create the {@link Document} from a {@link DocumentTemplate}.+
 * At the end of the execution, the command refresh the workspace
 */
public class GenerateDocumentStructureCommand extends RecordingCommand {

	/**
	 * the result of the command execution
	 */
	private final Collection<Document> result = new ArrayList<>();

	/**
	 * the initial document template
	 */
	private DocumentTemplate documentTemplate;

	/**
	 * the generator
	 */
	private ITemplate2StructureGenerator generator;

	/**
	 * the version of the generated document
	 */
	private String documentVersion;

	/**
	 *
	 * Constructor.
	 *
	 * @param domain
	 *            the editing domain to use for this command
	 * @param docTemplate
	 *            the document template to map on a {@link Document}
	 * @param documentVersion
	 *            the version of the document to generate
	 */
	public GenerateDocumentStructureCommand(final TransactionalEditingDomain domain, final DocumentTemplate docTemplate, final String version) {
		super(domain, "Generate Document Structure Command", "Create the Document Structure Object and store it in a new file"); //$NON-NLS-1$ //$NON-NLS-2$
		this.documentTemplate = docTemplate;
		this.documentVersion = version;
	}

	/**
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 *
	 */
	@Override
	protected void doExecute() {
		final Document document = this.generator.generate(this.documentTemplate, this.documentVersion);
		if (document == null) {
			return;
		}
		this.result.add(document);

		// We create the new resource for this document
		URI documentStructureURI = null;
		final IDocumentStructureGeneratorConfiguration configuration = this.documentTemplate.getDocumentStructureGeneratorConfiguration();
		if (null != configuration) {
			final Version version = document.getVersion();
			documentStructureURI = GeneratorConfigurationOperations.getDocumentStructureFileEcoreURI(configuration, DocumentStructureResource.FILE_EXTENSION, version != null ? version.getVersion() : null);
		} else {
			Activator.log.warn("The document structure can't be generated, the configuration is not defined in your model."); //$NON-NLS-1$
			return;
		}

		// 2. we create a new ResourceSet
		final ResourceSet structureResourceSet = new ResourceSetImpl();
		final Resource structureResource = structureResourceSet.createResource(documentStructureURI);

		structureResource.getContents().add(document);
		try {
			structureResource.save(null);// TODO : option for save ?
		} catch (IOException e) {
			Activator.log.error(e);
		}

		refreshWorkspace();
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
	 *
	 * @return
	 */
	@Override
	public boolean canExecute() {
		return super.canExecute();
	}

	/**
	 * @see org.eclipse.emf.transaction.RecordingCommand#prepare()
	 *
	 * @return
	 */
	@Override
	protected boolean prepare() {
		boolean res = super.prepare();
		if (res) {
			this.generator = Template2StructureRegistry.INSTANCE.getGenerator(this.documentTemplate);
			res = null != this.generator;
		}
		return res;
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#getResult()
	 *
	 * @return
	 */
	@Override
	public Collection<?> getResult() {
		return result;
	}

	/**
	 * Refresh the workspace
	 */
	protected void refreshWorkspace() {
		refreshProjects(this.documentTemplate);
	}


	/**
	 * This method refresh the project concerned by the DocumentStructure generation.
	 */
	private static void refreshProjects(final DocumentTemplate documentTemplate) {
		final Collection<String> projectsToRefresh = GeneratorConfigurationOperations.getWorkspaceProjectToRefresh(documentTemplate.getDocumentStructureGeneratorConfiguration());
		for (final String current : projectsToRefresh) {
			final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(current);
			if (null != project) {
				try {
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					Activator.log.error(NLS.bind("An exception occurred refresh the project {0}", current), e); //$NON-NLS-1$
				}
			}
		}
	}


}
