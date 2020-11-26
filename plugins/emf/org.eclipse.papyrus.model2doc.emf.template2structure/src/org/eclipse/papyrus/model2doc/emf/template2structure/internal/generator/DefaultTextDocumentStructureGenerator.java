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

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.StringVersion;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Version;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.Template2StructureRegistry;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping.TemplateToStructureMappingService;
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
		// we must not check the genrator id in this method.
		// We just need to check the type of TextDocumentTemplate
		return docTemplate instanceof TextDocumentTemplate;
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
	 * @param documentVersion
	 * @return
	 */
	@Override
	public Document generate(final DocumentTemplate docTemplate, final Object documentVersion) {
		// 1. we check we manage this kind of DocumentTemplate
		if (false == handles(docTemplate)) {
			Activator.log.warn(NLS.bind("The generator {0} is not able to create the document structure for {1}.", getClass().getSimpleName(), docTemplate.toString())); //$NON-NLS-1$
			return null;
		}
		// 2. Do the generation
		final List<AbstractTemplateToStructureMapper<?>> mappers = Template2StructureRegistry.INSTANCE.getMappers(docTemplate);
		if (mappers.isEmpty()) {
			return null;
		}
		final IMappingService service = new TemplateToStructureMappingService(mappers);
		final List<Document> result = service.map(docTemplate, null, Document.class);
		if (result.isEmpty()) {
			return null;
		}
		Assert.isTrue(result.size() >= 1, "The generation contains more than one object as result"); //$NON-NLS-1$
		final EObject res = result.iterator().next();
		Assert.isTrue(res instanceof Document, "The result of the transformation is not Document."); //$NON-NLS-1$
		final Document generatedDocument = (Document) res;

		// define the version of the Document
		if (null != documentVersion) {
			if (documentVersion instanceof String) {
				generatedDocument.setVersion(createVersionFromString((String) documentVersion));
			} else if (documentVersion instanceof Version) {
				generatedDocument.setVersion((Version) documentVersion);
			}
			// suffix the future file name with the version
			updateGeneratedDocumentName(generatedDocument);
		}

		return generatedDocument;
	}



	/**
	 *
	 * @param version
	 *            the version as string
	 * @return
	 *         the version to set to the DocumentStructure
	 */
	private Version createVersionFromString(final String version) {
		if (null == version || version.isEmpty()) {
			return null;
		}
		final StringVersion stringVersion = DocumentStructureFactory.eINSTANCE.createStringVersion();
		stringVersion.setVersion(version);
		return stringVersion;
	}

	/**
	 * This method suffix the final document name to generate with the version number
	 *
	 * @param document
	 *            the generated document
	 */
	private void updateGeneratedDocumentName(final Document document) {
		final Version version = document.getVersion();
		if (null != version) {
			final String stringVersion = version.getVersion();
			if (null != stringVersion && false == stringVersion.isEmpty()) {
				final IDocumentGeneratorConfiguration conf = document.getDocumentGeneratorConfiguration();
				final StringBuilder documentNameBuilder = new StringBuilder(conf.getDocumentName());
				documentNameBuilder.append("_"); //$NON-NLS-1$
				documentNameBuilder.append(stringVersion);
				conf.setDocumentName(documentNameBuilder.toString());
			}
		}
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator#getDescription()
	 *
	 * @return
	 */
	@Override
	public String getDescription() {
		return NLS.bind("This generator converts a {0} into a {1} from the current user model.", TextDocumentTemplate.class.getName(), TextDocument.class.getName()); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator#getLabel()
	 *
	 * @return
	 */
	@Override
	public String getEditorLabel() {
		return "Text Structure - Default Generator"; //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator#getGenerateMenuLabel()
	 *
	 * @return
	 */
	@Override
	public String getGenerateMenuLabel() {
		return "Structure"; //$NON-NLS-1$
	}

}
