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

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceBodySectionPartTemplate;

/**
 * This class provides operations for the elements {@link AbstractEReferencePartTemplate}
 */
public class EReferenceBodySectionPartTemplateOperations {


	/**
	 *
	 * @param partTemplate
	 *            an {@link AbstractEReferencePartTemplate}
	 * @param context
	 *            the context used to evaluate the value of the {@link EReference}
	 * @return
	 *         a list owning the EObject referenced by this EReference
	 */
	public static final EList<EObject> getEReferenceValues(final EReferenceBodySectionPartTemplate partTemplate, final EObject context) {
		final List<EObject> elements = new ArrayList<>();
		final EReference eReference = partTemplate.getEReference();
		if (null != eReference) {
			if (context.eClass().getEAllReferences().contains(eReference)) {
				if (eReference.isMany()) {
					elements.addAll(((Collection<?>) context).stream().filter(EObject.class::isInstance).map(EObject.class::cast).collect(Collectors.toList()));
				} else {
					elements.add((EObject) context.eGet(eReference));
				}
			}
		}
		return ECollections.unmodifiableEList(elements);
	}
}
