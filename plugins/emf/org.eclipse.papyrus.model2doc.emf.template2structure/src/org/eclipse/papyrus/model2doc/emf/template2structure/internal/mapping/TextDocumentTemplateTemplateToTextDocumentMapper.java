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

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.TemplateToStructureMappingService;

//TODO : change name
public class TextDocumentTemplateTemplateToTextDocumentMapper extends AbstractEMFTemplateToStructureMapper<TextDocumentTemplate, TextDocument> {

	public TextDocumentTemplateTemplateToTextDocumentMapper() {
		super(TEMPLATE_EPACKAGE.getTextDocumentTemplate(), STRUCTURE_EPACKAGE.getDocument());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#map(org.eclipse.emf.ecore.EObject)
	 *
	 * @param input
	 * @return
	 */
	@Override
	protected Collection<TextDocument> doMap(final TextDocumentTemplate input, final EObject modelElement) {
		// modelElement();

		final TextDocument txtDocument = DocumentStructureFactory.eINSTANCE.createTextDocument();
		txtDocument.setMainTitle(input.getMainTitle());
		// TODO:setName, setouput, setCoverPage
		final EObject semanticContext = input.getSemanticContext();
		List<DocumentPart> parts = input.getDocumentPart(); // TODO : pluralize getter
		final Iterator<DocumentPart> iter = parts.iterator();
		while (iter.hasNext()) {
			final DocumentPart current = iter.next();
			final Collection<EObject> result = TemplateToStructureMappingService.INSTANCE.map(current, semanticContext, STRUCTURE_EPACKAGE.getTextDocumentPart()); // TODO expected return type should be mapped too or we should set the created

			if (null != result) { // parent as parameter
				txtDocument.getTextDocumentPart().addAll((Collection<? extends TextDocumentPart>) result);
			}
		}
		return Collections.singleton(txtDocument);
	}

}
