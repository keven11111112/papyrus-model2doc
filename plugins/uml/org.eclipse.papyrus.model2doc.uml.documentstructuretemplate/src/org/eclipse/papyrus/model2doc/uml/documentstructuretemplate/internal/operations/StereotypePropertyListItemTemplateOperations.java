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
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeListItemTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttributeListItemTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceListItemTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyListItemTemplateImpl;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.providers.UMLDelegatingToEMFLabelProvider;

/**
 * This class provides the operations for {@link StereotypeListItemTemplate}
 */
public class StereotypePropertyListItemTemplateOperations {

	/**
	 * @param stereotypePropertyListItemTemplateImpl
	 * @param item
	 * @return
	 */
	public static String buildItemLabel(final StereotypePropertyListItemTemplateImpl stereotypePropertyListItemTemplateImpl, final Object item) {
		if (stereotypePropertyListItemTemplateImpl instanceof StereotypePropertyAttributeListItemTemplate) {
			return buildAttributeItemLabel((StereotypePropertyAttributeListItemTemplate) stereotypePropertyListItemTemplateImpl, item);
		}
		if (stereotypePropertyListItemTemplateImpl instanceof StereotypePropertyReferenceListItemTemplate) {
			return buildReferenceItemLabel((StereotypePropertyReferenceListItemTemplate) stereotypePropertyListItemTemplateImpl, item);
		}
		throw new UnsupportedOperationException(NLS.bind("The method StereotypePropertyListItemTemplateOperations#buildItemLabel doesn't support the argument {0}.", stereotypePropertyListItemTemplateImpl.eClass())); //$NON-NLS-1$
	}

	/**
	 * @param stereotypePropertyListItemTemplateImpl
	 * @param context
	 * @return
	 */
	public static EList<Object> getItems(final StereotypePropertyListItemTemplateImpl stereotypePropertyListItemTemplateImpl, final EObject context) {
		return ECollections.unmodifiableEList(stereotypePropertyListItemTemplateImpl.getStereotypePropertyValues(context));
	}

	/**
	 * This method generates the label for an {@link StereotypePropertyAttributeListItem}. So this method manage 2 cases:
	 * <ul>
	 * <li>the label of the parameter stereotypePropertyAttributeListItem</li>
	 * <li>the label of the parameter item</li>
	 * </ul>
	 * It is due to the fact than {@link StereotypePropertyAttributeListItem} can't have children, so in the intermediate model (DocumentStructure), the object {@link StereotypePropertyAttributeListItem} is translated in 2 objects: an item representing the
	 * name of the
	 * property and an item representing the value of the property.
	 *
	 *
	 * @param stereotypePropertyAttributeListItemTemplate
	 * @param item
	 * @return
	 */
	private static final String buildAttributeItemLabel(final StereotypePropertyAttributeListItemTemplate stereotypePropertyAttributeListItemTemplate, final Object item) {
		if (null == item || item == stereotypePropertyAttributeListItemTemplate) {
			final String customLabel = stereotypePropertyAttributeListItemTemplate.getCustomItemLabel();
			if (null != customLabel && false == customLabel.isEmpty()) {
				return customLabel;
			}
			final String propertyName = stereotypePropertyAttributeListItemTemplate.getPropertyName();
			if (null != propertyName && false == propertyName.isEmpty()) {
				return propertyName;
			}
			return "No Property"; //$NON-NLS-1$
		}
		return UMLDelegatingToEMFLabelProvider.UML_INSTANCE.getText(item);
	}

	/**
	 * This method generates the label of the {@link StereotypePropertyReferenceListItem}
	 *
	 * @param stereotypePropertyReferenceListItemTemplate
	 * @param item
	 * @return
	 */
	private static final String buildReferenceItemLabel(final StereotypePropertyReferenceListItemTemplate stereotypePropertyReferenceListItemTemplate, final Object item) {
		final String customLabel = stereotypePropertyReferenceListItemTemplate.getCustomItemLabel();
		if (null != customLabel && false == customLabel.isEmpty()) {
			return customLabel;
		}
		final String propertyName = stereotypePropertyReferenceListItemTemplate.getPropertyName();
		if (null != propertyName && false == propertyName.isEmpty()) {
			return propertyName;
		}
		return "No Property"; //$NON-NLS-1$
	}

}
