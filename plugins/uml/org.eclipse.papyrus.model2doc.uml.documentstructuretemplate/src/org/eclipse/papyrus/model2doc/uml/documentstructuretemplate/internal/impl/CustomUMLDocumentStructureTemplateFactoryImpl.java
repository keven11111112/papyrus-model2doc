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

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.UMLDocumentStructureTemplateFactoryImpl;

/**
 * Custom factory for the elements for UMl DocumentStructureTemplate
 */
public class CustomUMLDocumentStructureTemplateFactoryImpl extends UMLDocumentStructureTemplateFactoryImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplateFactoryImpl#createStereotypePartTemplate()
	 *
	 * @return
	 */
	@Override
	public StereotypePartTemplate createStereotypePartTemplate() {
		return new CustomStereotypePartTemplateImpl();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplateFactoryImpl#createCommentAsParagraph()
	 *
	 * @return
	 */
	@Override
	public CommentAsParagraph createCommentAsParagraph() {
		return new CustomCommentAsParagraphImpl();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.UMLDocumentStructureTemplateFactoryImpl#createStereotypePropertyReferencePartTemplate()
	 *
	 * @return
	 */
	@Override
	public StereotypePropertyReferencePartTemplate createStereotypePropertyReferencePartTemplate() {
		return new CustomStereotypePropertyReferencePartTemplateImpl();
	}
}
