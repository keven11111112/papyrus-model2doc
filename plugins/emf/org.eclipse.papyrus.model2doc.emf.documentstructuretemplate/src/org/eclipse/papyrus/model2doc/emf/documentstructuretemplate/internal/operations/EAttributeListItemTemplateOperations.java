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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EAttributeListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;

/**
 * This class provides the operations for {@link EAttributeListItemTemplate}
 */
public class EAttributeListItemTemplateOperations {

	/**
	 * @param eAttributeListItem
	 * @param item
	 * @return
	 */
	public static String buildLabelItem(final EAttributeListItemTemplate eAttributeListItem, final Object item) {
		final String customLabel = eAttributeListItem.getCustomItemLabel();
		if (null != customLabel && false == customLabel.isEmpty()) {
			return customLabel;
		}
		return DelegatingToEMFLabelProvider.INSTANCE.getText(item);
	}

	/**
	 * @param eAttributeListItem
	 * @param context
	 * @return
	 */
	public static EList<Object> getItems(final EAttributeListItemTemplate eAttributeListItem, final EObject context) {
		return eAttributeListItem.getEAttributeValues(context);
	}
}
