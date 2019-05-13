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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.operations.UMLBodySectionPartTemplateTitleHelper;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

/**
 * Custom implementation for {@link CommentAsParagraph}
 */
public class CustomCommentAsParagraphImpl extends CommentAsParagraphImpl {

	/**
	 * unique title helper for all instance of {@link CommentAsParagraph}
	 */
	private static final UMLBodySectionPartTemplateTitleHelper UML_TITLE_HELPER = new UMLBodySectionPartTemplateTitleHelper();

	/**
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.CommentAsParagraphImpl#getMatchingComments()
	 *
	 * @return
	 */
	@Override
	public EList<Comment> getMatchingComments(final EObject element) {
		if (false == element instanceof Element) {
			return ECollections.emptyEList();
		}
		final List<Comment> comments = ((Element) element).getOwnedComments().stream().filter(cmt -> cmt.getAnnotatedElements().contains(element)).collect(Collectors.toList());
		if (comments.isEmpty()) {
			return ECollections.emptyEList();
		}
		switch (this.commentChoice) {
		case ALL_OWNED_COMMENTS:
			return ECollections.unmodifiableEList(comments);
		case FIRST_OWNED_COMMENT:
			if (comments.size() > 0) {
				return ECollections.singletonEList(comments.get(0));
			}
		default:
			// not possible
			return ECollections.emptyEList();
		}
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl#buildPartTemplateTitle(org.eclipse.emf.ecore.EObject)
	 *
	 * @param context
	 * @return
	 */
	@Override
	public String buildPartTemplateTitle(final EObject context) {
		return UML_TITLE_HELPER.buildPartTemplateTitle(this, context);
	}
}
