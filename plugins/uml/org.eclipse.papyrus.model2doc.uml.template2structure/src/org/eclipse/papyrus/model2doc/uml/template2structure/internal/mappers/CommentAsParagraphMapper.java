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

package org.eclipse.papyrus.model2doc.uml.template2structure.internal.mappers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

/**
 * This class does the mapping between {@link CommentAsParagraph} and {@link Paragraph}
 */
public class CommentAsParagraphMapper extends AbstractUMLTemplateToStructureMapper<CommentAsParagraph> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputEClass
	 */
	public CommentAsParagraphMapper() {
		super(TEMPLATE_EPACKAGE.getCommentAsParagraph(), BodyPart.class);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.uml.template2structure.internal.mappers.CommentAsParagraphMapper#doMap(org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService,
	 *      org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentAsParagraph, org.eclipse.emf.ecore.EObject, java.lang.Class)
	 *
	 * @param mappingService
	 * @param commentAsParagraph
	 * @param semanticModelElement
	 * @param returnedClassType
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final CommentAsParagraph commentAsParagraph, final EObject semanticModelElement, final Class<T> returnedClassType) {
		if (false == commentAsParagraph.isGenerate() || false == semanticModelElement instanceof Element) {
			// This element can't have children, so if isGenerate() returns false, we go out!
			return Collections.emptyList();
		}
		final List<T> returnedValue = new ArrayList<>();

		final Iterator<Comment> commentIter = commentAsParagraph.getMatchingComments(semanticModelElement).iterator();
		Title title = null;
		if (commentIter.hasNext() && commentAsParagraph.isGenerateTitle()) {
			title = STRUCTURE_EFACTORY.createTitle();
			title.setTitle(commentAsParagraph.buildTitle());
			returnedValue.add(returnedClassType.cast(title));
		}
		while (commentIter.hasNext()) {
			final Paragraph paragraph = STRUCTURE_EFACTORY.createParagraph();
			paragraph.setText(commentIter.next().getBody());
			if (null == title) {
				returnedValue.add(returnedClassType.cast(paragraph));
			} else {
				title.getSubBodyPart().add(paragraph);
			}
		}
		return returnedValue;
	}

}
