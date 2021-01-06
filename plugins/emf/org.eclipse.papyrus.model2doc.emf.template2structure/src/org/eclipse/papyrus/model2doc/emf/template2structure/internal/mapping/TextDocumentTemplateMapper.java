/*****************************************************************************
 * Copyright (c) 2019, 2021 CEA LIST and others.
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
 * 	Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Bug 570133
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.model2doc.core.author.IAuthor;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * This class ensures the transformation of the {@link TextDocumentTemplate} into a {@link TextDocument} and delegate the mapping of the {@link TextDocumentTemplate} subelements.
 */
public class TextDocumentTemplateMapper extends AbstractTemplateToStructureMapper<TextDocumentTemplate> {

	/**
	 *
	 * Constructor.
	 *
	 */
	public TextDocumentTemplateMapper() {
		super(DocumentStructureTemplatePackage.eINSTANCE.getTextDocumentTemplate(), Document.class);
	}

	/**
	 * @param mappingService
	 * @param modelElement
	 * @param input
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#map(org.eclipse.emf.ecore.EObject)
	 *
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final TextDocumentTemplate input, final EObject modelElement, Class<T> expectedReturnedClass) {
		final TextDocument txtDocument = DocumentStructureFactory.eINSTANCE.createTextDocument();
		txtDocument.setMainTitle(input.getMainTitle());
		final IDocumentStructureGeneratorConfiguration structureGeneratorConfig = input.getDocumentStructureGeneratorConfiguration();
		final IDocumentGeneratorConfiguration docGeneratorConfig = structureGeneratorConfig.createDocumentGeneratorConfiguration();
		txtDocument.setDocumentGeneratorConfiguration(docGeneratorConfig);

		final Iterator<IAuthor> authors = input.getAuthors().iterator();
		while (authors.hasNext()) {
			final IAuthor copiedAuthor = EcoreUtil.copy(authors.next());
			txtDocument.getAuthors().add(copiedAuthor);
		}

		final EObject semanticContext = input.getSemanticContext();
		List<DocumentPart> parts = input.getDocumentParts();
		final Iterator<DocumentPart> iter = parts.iterator();
		while (iter.hasNext()) {
			final DocumentPart current = iter.next();
			final Collection<TextDocumentPart> result = mappingService.map(current, semanticContext, TextDocumentPart.class);

			if (null != result) {
				txtDocument.getTextDocumentParts().addAll(result);
			}
		}
		return Collections.singletonList(expectedReturnedClass.cast(txtDocument));
	}

}
