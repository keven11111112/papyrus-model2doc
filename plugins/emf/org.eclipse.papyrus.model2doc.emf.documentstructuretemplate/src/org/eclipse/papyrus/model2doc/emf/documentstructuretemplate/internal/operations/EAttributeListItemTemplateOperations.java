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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EAttributeListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;

/**
 * This class provides the operations for {@link EAttributeListItemTemplate}
 */
public class EAttributeListItemTemplateOperations {

	/**
	 *
	 * This method generates the label for an {@link EAttributeListItemTemplate}. So this method manage 2 cases:
	 * <ul>
	 * <li>the label of the parameter stereotypePropertyAttributeListItem</li>
	 * <li>the label of the parameter item</li>
	 * </ul>
	 * It is due to the fact than {@link EAttributeListItemTemplate} can't have children, so in the intermediate model (DocumentStructure), the object {@link EAttributeListItemTemplate} is translated in 2 objects: an item representing the name of the
	 * EAttribute and an item representing the value of the EAttribute.
	 *
	 * @param eAttributeListItem
	 * @param item
	 * @return
	 */
	public static String buildLabelItem(final EAttributeListItemTemplate eAttributeListItem, final Object item) {
		if (null == item || item == eAttributeListItem) {
			final String customLabel = eAttributeListItem.getCustomItemLabel();
			if (null != customLabel && false == customLabel.isEmpty()) {
				return customLabel;
			}
			final EAttribute eAttribute = eAttributeListItem.getEAttribute();
			if (null != eAttribute) {
				return eAttribute.getName();
			}
			return "No EAttribute"; //$NON-NLS-1$
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
