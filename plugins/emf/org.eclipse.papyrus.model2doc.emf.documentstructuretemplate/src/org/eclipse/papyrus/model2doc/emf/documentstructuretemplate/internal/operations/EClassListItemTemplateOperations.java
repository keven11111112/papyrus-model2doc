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

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;

/**
 * This class provides operations for the elements {@link EClassListItemTemplate}
 */
public class EClassListItemTemplateOperations {

	/**
	 * @param eClassListItemTemplate
	 * @param context
	 * @return
	 */
	public static EList<Object> getItems(final EClassListItemTemplate eClassListItemTemplate, final EObject context) {
		if (eClassListItemTemplate.isMatchingFilterRule(context)) {
			return ECollections.singletonEList(context);
		}
		return ECollections.emptyEList();
	}

	/**
	 * @param eClassListItemTemplate
	 * @param item
	 * @return
	 */
	public static String buildLabelItem(final EClassListItemTemplate eClassListItemTemplate, final Object item) {
		final String customLabel = eClassListItemTemplate.getCustomItemLabel();
		if (null != customLabel && false == customLabel.isEmpty()) {
			return customLabel;
		}
		return DelegatingToEMFLabelProvider.INSTANCE.getText(item);
	}

}
