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
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.internal.resource.DocumentStructureResource;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.GenerationConfiguration;
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
		super(domain, "Generate Document Structure Command", "Create the Document Structure Object and store it in a new file");
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

		final GenerationConfiguration configuration = documentTemplate.getGenerationConfiguration();


		// TODO : use a mapping for that or not ?
		final org.eclipse.papyrus.model2doc.emf.documentstructure.GenerationConfiguration configuration2 = DocumentStructureFactory.eINSTANCE.createGenerationConfiguration();
		configuration2.setOutputFile(configuration.getOuputFile());
		configuration2.setOutputFolder(configuration.getOuputFolder());


		final org.eclipse.papyrus.model2doc.emf.documentstructure.CoverPage coverPage = DocumentStructureFactory.eINSTANCE.createCoverPage();
		coverPage.setPath(this.documentTemplate.getCoverPage().getPath());

		document.setCoverPage(coverPage);
		document.setGenerationConfiguration(configuration2);

		if (null == document) {
			Activator.log.info("The Document creations failed");
			return;
		}

		// We create the new resource for this document
		final Resource templateResource = this.documentTemplate.eResource();
		ResourceSet resourceSet = templateResource.getResourceSet();
		final URI templateURI = templateResource.getURI();

		// TODO : change resource path each time?
		final URI documentStructureURI = templateURI.trimFileExtension().appendFileExtension(DocumentStructureResource.FILE_EXTENSION);// TODO : result the output given in PathConfig ?

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
