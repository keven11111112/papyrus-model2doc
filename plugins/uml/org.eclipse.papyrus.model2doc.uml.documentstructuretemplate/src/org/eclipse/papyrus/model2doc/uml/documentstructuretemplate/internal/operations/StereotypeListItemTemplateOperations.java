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

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeListItemTemplate;

/**
 * This class provides the operations for {@link StereotypeListItemTemplate}
 */
public class StereotypeListItemTemplateOperations {

	/**
	 *
	 * @param stereotypeListItemTemplate
	 * @param item
	 * @return
	 */
	public static final String buildItemLabel(final StereotypeListItemTemplate stereotypeListItemTemplate, final Object item) {
		final String customLabel = stereotypeListItemTemplate.getCustomItemLabel();
		if (null != customLabel && false == customLabel.isEmpty()) {
			return customLabel;
		}
		return DelegatingToEMFLabelProvider.INSTANCE.getText(item);
	}

	/**
	 *
	 * @param stereotypeListItemTemplate
	 * @param context
	 * @return
	 */
	public static final EList<Object> getItems(final StereotypeListItemTemplate stereotypeListItemTemplate, final EObject context) {
		if (stereotypeListItemTemplate.isMatchingFilterRule(context)) {
			return ECollections.singletonEList(context);
		}
		return ECollections.emptyEList();
	}
}
