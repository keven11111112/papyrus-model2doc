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

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferencePartTemplateImpl;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations.BodySectionPartTemplateTitleHelper;

/**
 * Custom implementation for {@link EReferencePartTemplate}
 */
public class CustomEReferencePartTemplateImpl extends EReferencePartTemplateImpl {

	/**
	 * unique title helper for all instance of {@link EReferencePartTemplate}
	 */
	private static final BodySectionPartTemplateTitleHelper TITLE_HELPER = new BodySectionPartTemplateTitleHelper();

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferencePartTemplateImpl#buildPartTitle()
	 *
	 * @return
	 */
	@Override
	public String buildTitle() {
		return TITLE_HELPER.buildTitle(this);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferencePartTemplateImpl#getMatchingReferencedEObjects(org.eclipse.emf.ecore.EObject)
	 *
	 * @param context
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getMatchingReferencedEObjects(final EObject semanticModelElement) {
		final List<EObject> elements = new ArrayList<>();
		if (this.eReference instanceof EObject) {
			if (semanticModelElement.eClass().getEAllReferences().contains(this.eReference)) {
				if (this.eReference.isMany()) {
					elements.addAll((Collection<EObject>) semanticModelElement.eGet(this.eReference));
				} else {
					elements.add((EObject) semanticModelElement.eGet(this.eReference));
				}
			}
		}
		return ECollections.unmodifiableEList(elements);
	}
}
