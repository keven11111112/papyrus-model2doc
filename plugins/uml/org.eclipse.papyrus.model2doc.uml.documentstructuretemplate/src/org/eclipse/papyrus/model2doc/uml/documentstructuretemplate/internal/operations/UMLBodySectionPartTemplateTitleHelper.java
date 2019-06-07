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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.operations;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations.BodySectionPartTemplateTitleOperations;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceTableView;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.providers.UMLDelegatingToEMFLabelProvider;

/**
 * Title builder helper for UML PartTemplate
 */
public class UMLBodySectionPartTemplateTitleHelper extends BodySectionPartTemplateTitleOperations {

	/**
	 * Stereotype marker <<
	 */
	private static final String ST_LEFT = String.valueOf("\u00AB");//$NON-NLS-1$

	/**
	 * Stereotype marker >>
	 */
	private static final String ST_RIGHT = String.valueOf("\u00BB"); //$NON-NLS-1$


	/**
	 * Shared instance of {@link UMLBodySectionPartTemplateTitleHelper}
	 */
	public static final UMLBodySectionPartTemplateTitleHelper UML_INSTANCE = new UMLBodySectionPartTemplateTitleHelper();

	/**
	 *
	 * Constructor.
	 *
	 */
	protected UMLBodySectionPartTemplateTitleHelper() {
		super();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations.BodySectionPartTemplate_BuildTitleHelper#internalBuildTitle(org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate,
	 *      org.eclipse.emf.ecore.EObject)
	 *
	 * @param partTemplate
	 * @param parameter
	 * @return
	 */
	@Override
	protected String internalBuildPartTemplateTitle(final IBodySectionPartTemplate partTemplate, final EObject parameter) {
		if (partTemplate instanceof StereotypePartTemplate) {
			return buildStereotypePartTemplateTitle((StereotypePartTemplate) partTemplate, parameter);
		}
		if (partTemplate instanceof StereotypePropertyReferencePartTemplate) {
			return buildStereotypePropertyReferencePartTemplateTitle((StereotypePropertyReferencePartTemplate) partTemplate);
		}
		if (partTemplate instanceof CommentAsParagraph) {
			return buildCommentAsParagraphTitle((CommentAsParagraph) partTemplate);
		}
		if (partTemplate instanceof StereotypePropertyReferenceTableView) {
			return buildStereotypePropertyReferenceTableViewTitle((StereotypePropertyReferenceTableView) partTemplate);
		}
		return super.internalBuildPartTemplateTitle(partTemplate, parameter);
	}

	/**
	 *
	 * @param StereotypePropertyReferenceTableView
	 *            a {@link StereotypePropertyReferenceTableView} element
	 * @param parameter
	 *            the eobject for which we want to build the title
	 * @return
	 *         the string to use for the tile of the element
	 */
	private String buildStereotypePropertyReferenceTableViewTitle(final StereotypePropertyReferenceTableView partTemplate) {
		if (null != partTemplate.getPropertyName() && false == partTemplate.getPropertyName().isEmpty()) {
			return partTemplate.getPropertyName();
		}
		return "No Property Name";//$NON-NLS-1$
	}

	/**
	 *
	 * @param stereotypePartTemplate
	 *            a stereotype part Template
	 * @param parameter
	 *            the eobject for which we want to build the title
	 * @return
	 *         the string to use for the tile of the element
	 */
	private String buildStereotypePartTemplateTitle(final StereotypePartTemplate stereotypePartTemplate, final EObject parameter) {
		return getLabel(parameter);
	}

	/**
	 *
	 * @param stereotypePartTemplate
	 *            a stereotype part Template
	 * @param parameter
	 *            the eobject for which we want to build the title
	 * @return
	 *         the string to use for the tile of the element
	 */
	private String buildStereotypePropertyReferencePartTemplateTitle(final StereotypePropertyReferencePartTemplate stereotypePropertyPartTemplate) {
		if (null != stereotypePropertyPartTemplate.getPropertyName() && false == stereotypePropertyPartTemplate.getPropertyName().isEmpty()) {
			return stereotypePropertyPartTemplate.getPropertyName();
		}
		return "No Property Name"; //$NON-NLS-1$
	}

	/**
	 *
	 * @param commentAsParagraph
	 *            a {@link CommentAsParagraph} object
	 * @return
	 *         the title to use for this element
	 */
	private String buildCommentAsParagraphTitle(final CommentAsParagraph commentAsParagraph) {
		switch (commentAsParagraph.getCommentChoice()) {
		case FIRST_OWNED_COMMENT:
			return "Comment"; //$NON-NLS-1$
		case ALL_OWNED_COMMENTS:
		default:
			return "Comments"; //$NON-NLS-1$
		}
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations.BodySectionPartTemplateTitleOperations#getLabel(org.eclipse.emf.ecore.EObject)
	 *
	 * @param eobject
	 * @return
	 */
	@Override
	protected String getLabel(EObject eobject) {
		return UMLDelegatingToEMFLabelProvider.UML_INSTANCE.getText(eobject);
	}
}
