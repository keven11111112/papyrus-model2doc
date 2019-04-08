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

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.generator;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping.TemplateToStructureMappingService;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.registry.Template2StructureRegistry;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * The default {@link TextDocument} generator for a {@link TextDocumentTemplate}
 */
public class DefaultTextDocumentStructureGenerator implements ITemplate2StructureGenerator {

	/**
	 * The generator ID
	 */
	private static final String GENERATOR_ID = "TextDocumentStructureGenerator.default"; //$NON-NLS-1$

	public DefaultTextDocumentStructureGenerator() {
		// nothing to do
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator#handles(org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate)
	 *
	 * @param docTemplate
	 * @return
	 */
	@Override
	public boolean handles(final DocumentTemplate docTemplate) {
		final IDocumentStructureGeneratorConfiguration confTmp = docTemplate.getDocumentStructureGenerator();
		Assert.isTrue(confTmp instanceof DefaultDocumentStructureGeneratorConfiguration);
		final DefaultDocumentStructureGeneratorConfiguration conf = (DefaultDocumentStructureGeneratorConfiguration) confTmp;
		if (false == GENERATOR_ID.equals(conf.getStructureGeneratorId())) {
			return false;
		}
		if (false == docTemplate instanceof TextDocumentTemplate) {
			return false;
		}
		return true;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator#getGeneratorId()
	 *
	 * @return
	 */
	@Override
	public String getGeneratorId() {
		return GENERATOR_ID;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator#generator(org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate)
	 *
	 * @param docTemplate
	 * @return
	 */
	@Override
	public Document generate(final DocumentTemplate docTemplate) {
		// 1. we check we manage this kind of DocumentTemplate
		if (false == handles(docTemplate)) {
			Activator.log.warn(NLS.bind("The generator {0} is not able to create the document structure for {1}.", getClass().getSimpleName(), docTemplate.toString())); //$NON-NLS-1$
			return null;
		}
		// 2. Do the generation
		final List<AbstractTemplateToStructureMapper<?, ?>> mappers = Template2StructureRegistry.INSTANCE.getMappers(docTemplate);
		if (mappers.isEmpty()) {
			return null;
		}
		final IMappingService service = new TemplateToStructureMappingService(mappers);
		final Collection<EObject> result = service.map(docTemplate, null, DocumentStructurePackage.eINSTANCE.getDocument());
		if (result.isEmpty()) {
			return null;
		}
		Assert.isTrue(result.size() >= 1, "The generation contains more than one object as result"); //$NON-NLS-1$
		final EObject res = result.iterator().next();
		Assert.isTrue(res instanceof Document, "The result of the transformation is not Document."); //$NON-NLS-1$
		return (Document) res;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator#getDescription()
	 *
	 * @return
	 */
	@Override
	public String getDescription() {
		return NLS.bind("This generator converts a {0} into a {1} from the current user model", TextDocumentTemplate.class.getName(), TextDocument.class.getName()); //$NON-NLS-1$
	}

}
