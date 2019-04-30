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
 * 	 Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;

/**
 * Utility class for elements of the metamodel DocumentStructureTemplate
 */
public class DocumentStructureTemplateUtils {

	/**
	 *
	 * @param subElementOfDocumentTemplate
	 *            a sub elements stored somewhere in the hierarchy of a {@link DocumentTemplate} of a {@link DocumentTemplatePrototype}
	 * @return
	 *         the {@link DocumentTemplate} of <code>null</code> if not found
	 */
	public static final DocumentTemplate getDocumentTemplate(final EObject subElementOfDocumentTemplate) {
		EObject parent = subElementOfDocumentTemplate;
		// we are looking for the document template
		while (parent != null) {
			if (parent instanceof DocumentTemplate) {
				return (DocumentTemplate) parent;
			}
			parent = parent.eContainer();
		}
		return null;
	}

	/**
	 *
	 * @param subElementOfDocumentTemplate
	 *            a sub elements stored somewhere in the hierarchy of a {@link DocumentTemplate} of a {@link DocumentTemplatePrototype}
	 * @return
	 *         the EObject used as semanticContext of <code>null</code> if not found
	 */
	public static final EObject getSemanticContext(final EObject subElementOfDocumentTemplate) {
		final DocumentTemplate docTemplate = getDocumentTemplate(subElementOfDocumentTemplate);
		return null == docTemplate ? null : docTemplate.getSemanticContext();
	}
}
