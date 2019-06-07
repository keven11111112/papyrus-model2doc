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

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;

/**
 * This class provides the operations for {@link EStructuralFeatureTemplate}
 */
public class EStructuralFeatureTemplateOperations {

	/**
	 *
	 * @param featureTemplate
	 *            a feature template
	 * @param value
	 *            a value obtained for this feature template
	 * @return
	 *         the label to use for this value
	 */
	public static final String buildEStructuralFeatureValueLabel(final EStructuralFeatureTemplate featureTemplate, final Object value) {
		return DelegatingToEMFLabelProvider.INSTANCE.getText(value);
	}

	/**
	 *
	 * @param featureTemplate
	 *            a feature template
	 * @param context
	 *            an element of the user model
	 * @return
	 *         the value of the {@link EStructuralFeature} for the context element
	 */
	public static final EList<Object> getEStructuralFeatureValues(final EStructuralFeatureTemplate featureTemplate, final EObject context) {
		final List<Object> elements = new ArrayList<>();
		final EStructuralFeature eReference = featureTemplate.getFeature();
		if (null != eReference) {
			if (context.eClass().getEAllStructuralFeatures().contains(eReference)) {
				if (eReference.isMany()) {
					elements.addAll(((Collection<?>) context.eGet(eReference)));
				} else {
					elements.add(context.eGet(eReference));
				}
			}
		}
		return ECollections.unmodifiableEList(elements);
	}

}
