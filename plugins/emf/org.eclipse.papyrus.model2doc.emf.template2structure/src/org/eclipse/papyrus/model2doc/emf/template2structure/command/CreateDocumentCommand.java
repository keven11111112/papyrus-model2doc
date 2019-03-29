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
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.internal.resource.DocumentStructureResource;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.TemplateToStructureMappingService;

/**
 * The command used to create the {@link Document} from a {@link DocumentTemplate}
 */
public class CreateDocumentCommand extends RecordingCommand {

	/**
	 * the result of the command execution
	 */
	private final Collection<Document> result = new ArrayList<>();

	/**
	 * the initial document template
	 */
	private DocumentTemplate documentTemplate;

	/**
	 *
	 * Constructor.
	 *
	 * @param docTemplate
	 *            the document template to map on a {@link Document}
	 * @param domain
	 *            the editing domain to use for this command
	 */
	public CreateDocumentCommand(final DocumentTemplate docTemplate, final TransactionalEditingDomain domain) {
		super(domain, "Generate Document Structure Command", "Create the Document Structure Object and store it in a new file"); //$NON-NLS-1$ //$NON-NLS-2$
		this.documentTemplate = docTemplate;
	}

	/**
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 *
	 */
	@Override
	protected void doExecute() {
		final Collection<EObject> result = TemplateToStructureMappingService.INSTANCE.map(this.documentTemplate, null, DocumentStructurePackage.eINSTANCE.getDocument());
		Assert.isTrue(result.size() == 1 && result.iterator().next() instanceof Document);
		final Document document = (Document) result.iterator().next();

		final IDocumentStructureGeneratorConfiguration structureGeneratorConfig = this.documentTemplate.getDocumentStructureGenerator();
		final IDocumentGeneratorConfiguration docGeneratorConfig = structureGeneratorConfig.createDocumentGeneratorConfiguration();

		document.setDocumentGeneratorConfiguration(docGeneratorConfig);


		// We create the new resource for this document
		final Resource templateResource = this.documentTemplate.eResource();
		ResourceSet resourceSet = templateResource.getResourceSet();

		URI documentStructureURI = null;
		final IDocumentStructureGeneratorConfiguration configuration = this.documentTemplate.getDocumentStructureGenerator();// TODO : rename me into configuration
		if (configuration instanceof DefaultDocumentStructureGeneratorConfiguration) {
			final String ecoreURI = GeneratorConfigurationOperations.getDocumentStructureFileEcoreURI((DefaultDocumentStructureGeneratorConfiguration) configuration, DocumentStructureResource.FILE_EXTENSION);
			documentStructureURI = URI.createURI(ecoreURI);
		} else {
			// TODO : not supported
		}

		// 2. we create a new resource
		ResourceSet rSet = new ResourceSetImpl();
		// TODO : integrate me in the Papyrus resourceset ?
		resourceSet = rSet;
		final Resource structureResource = resourceSet.createResource(documentStructureURI);

		this.result.add(document);
		structureResource.getContents().add(document);
		try {
			structureResource.save(null);
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
		return this.documentTemplate != null;
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
