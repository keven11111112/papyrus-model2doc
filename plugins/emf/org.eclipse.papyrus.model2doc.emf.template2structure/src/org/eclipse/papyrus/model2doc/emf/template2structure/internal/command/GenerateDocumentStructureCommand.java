/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
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
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Version;
import org.eclipse.papyrus.model2doc.emf.documentstructure.internal.resource.DocumentStructureResource;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.registry.Template2StructureRegistry;

/**
 * The command is used to create the {@link Document} from a {@link DocumentTemplate}.
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
	 */
	public GenerateDocumentStructureCommand(final TransactionalEditingDomain domain, final DocumentTemplate docTemplate) {
		super(domain, "Generate Document Structure Command", "Create the Document Structure Object and store it in a new file"); //$NON-NLS-1$ //$NON-NLS-2$
		this.documentTemplate = docTemplate;
	}

	/**
	 *
	 *
	 * @param version
	 *            the version of the generated document, the parameter can be <code>null</code>
	 */
	public void setVersion(final String version) {
		documentVersion = version;
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
		final Resource templateResource = this.documentTemplate.eResource();
		ResourceSet resourceSet = templateResource.getResourceSet();

		URI documentStructureURI = null;
		final IDocumentStructureGeneratorConfiguration configuration = this.documentTemplate.getDocumentStructureGeneratorConfiguration();
		if (null != configuration) {
			final Version version = document.getVersion();
			documentStructureURI = GeneratorConfigurationOperations.getDocumentStructureFileEcoreURI(configuration, DocumentStructureResource.FILE_EXTENSION, version != null ? version.getVersion() : null);
		} else {
			Activator.log.warn("The document structure can't be generated, the configuration is not defined in your model."); //$NON-NLS-1$
			return;
		}

		// 2. we create a new resource
		ResourceSet rSet = new ResourceSetImpl();
		// TODO : integrate me in the Papyrus resourceset ?
		resourceSet = rSet;
		final Resource structureResource = resourceSet.createResource(documentStructureURI);

		structureResource.getContents().add(document);
		try {
			structureResource.save(null);// TODO : option for save ?
		} catch (IOException e) {
			Activator.log.error(e);
		}
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
}
