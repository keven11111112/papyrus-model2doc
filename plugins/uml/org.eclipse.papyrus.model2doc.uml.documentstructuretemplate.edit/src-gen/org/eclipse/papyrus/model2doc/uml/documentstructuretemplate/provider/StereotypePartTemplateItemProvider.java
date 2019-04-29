/**
 * Copyright (c) 2019 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.provider.EClassPartTemplateItemProvider;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StereotypePartTemplateItemProvider extends EClassPartTemplateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public StereotypePartTemplateItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStereotypeQualifiedNamePropertyDescriptor(object);
			addStereotypeFilterRulePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Stereotype Qualified Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addStereotypeQualifiedNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_StereotypePartTemplate_stereotypeQualifiedName_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_StereotypePartTemplate_stereotypeQualifiedName_feature", "_UI_StereotypePartTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLDocumentStructureTemplatePackage.Literals.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null,
				URI.createURI("editor://umldocumentstructuretemplate/StereotypePartTemplate/stereotypeQualifiedName/"))); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Stereotype Filter Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addStereotypeFilterRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_StereotypePartTemplate_stereotypeFilterRule_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_StereotypePartTemplate_stereotypeFilterRule_feature", "_UI_StereotypePartTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLDocumentStructureTemplatePackage.Literals.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, false);
	}

	/**
	 * This returns StereotypePartTemplate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StereotypePartTemplate")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StereotypePartTemplate) object).getStereotypeQualifiedName();
		return label == null || label.length() == 0 ? getString("_UI_StereotypePartTemplate_type") : //$NON-NLS-1$
				getString("_UI_StereotypePartTemplate_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StereotypePartTemplate.class)) {
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_QUALIFIED_NAME:
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE__STEREOTYPE_FILTER_RULE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(DocumentStructureTemplatePackage.Literals.ICOMPOSED_SUB_BODY_PART_TEMPLATE__BODY_PART_TEMPLATE,
				UMLDocumentStructureTemplateFactory.eINSTANCE.createStereotypePropertyReferencePartTemplate()));

		newChildDescriptors.add(createChildParameter(DocumentStructureTemplatePackage.Literals.ICOMPOSED_SUB_BODY_PART_TEMPLATE__BODY_PART_TEMPLATE,
				UMLDocumentStructureTemplateFactory.eINSTANCE.createCommentAsParagraph()));
	}

}
