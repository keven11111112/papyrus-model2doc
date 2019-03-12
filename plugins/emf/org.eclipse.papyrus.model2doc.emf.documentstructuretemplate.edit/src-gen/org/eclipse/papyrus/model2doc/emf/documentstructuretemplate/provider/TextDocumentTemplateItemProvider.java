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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TextDocumentTemplateItemProvider
		extends ItemProviderAdapter
		implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TextDocumentTemplateItemProvider(AdapterFactory adapterFactory) {
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

			addSemanticContextPropertyDescriptor(object);
			addGraphicalContextPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addIconPathPropertyDescriptor(object);
			addDocumentTemplatePrototypePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addKindIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Semantic Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addSemanticContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DocumentTemplate_semanticContext_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_DocumentTemplate_semanticContext_feature", "_UI_DocumentTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT,
				true,
				false,
				true,
				null,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Graphical Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addGraphicalContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DocumentTemplate_graphicalContext_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_DocumentTemplate_graphicalContext_feature", "_UI_DocumentTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT,
				true,
				false,
				true,
				null,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DocumentTemplate_type_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_DocumentTemplate_type_feature", "_UI_DocumentTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.DOCUMENT_TEMPLATE__TYPE,
				false,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Icon Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addIconPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DocumentTemplate_iconPath_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_DocumentTemplate_iconPath_feature", "_UI_DocumentTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.DOCUMENT_TEMPLATE__ICON_PATH,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Document Template Prototype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addDocumentTemplatePrototypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DocumentTemplate_documentTemplatePrototype_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_DocumentTemplate_documentTemplatePrototype_feature", "_UI_DocumentTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE,
				true,
				false,
				true,
				null,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DocumentTemplate_name_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_DocumentTemplate_name_feature", "_UI_DocumentTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.DOCUMENT_TEMPLATE__NAME,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DocumentTemplate_description_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_DocumentTemplate_description_feature", "_UI_DocumentTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.DOCUMENT_TEMPLATE__DESCRIPTION,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Kind Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addKindIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DocumentTemplate_kindId_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_DocumentTemplate_kindId_feature", "_UI_DocumentTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.DOCUMENT_TEMPLATE__KIND_ID,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DocumentStructureTemplatePackage.Literals.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, true);
	}

	/**
	 * This returns TextDocumentTemplate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextDocumentTemplate")); //$NON-NLS-1$
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
		String label = ((TextDocumentTemplate) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TextDocumentTemplate_type") : //$NON-NLS-1$
				getString("_UI_TextDocumentTemplate_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(TextDocumentTemplate.class)) {
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__TYPE:
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__ICON_PATH:
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__NAME:
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DESCRIPTION:
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__KIND_ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(DocumentStructureTemplatePackage.Literals.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART,
				DocumentStructureTemplateFactory.eINSTANCE.createTableOfContents()));

		newChildDescriptors.add(createChildParameter(DocumentStructureTemplatePackage.Literals.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART,
				DocumentStructureTemplateFactory.eINSTANCE.createBody()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DocumentstructuretemplateEditPlugin.INSTANCE;
	}

}