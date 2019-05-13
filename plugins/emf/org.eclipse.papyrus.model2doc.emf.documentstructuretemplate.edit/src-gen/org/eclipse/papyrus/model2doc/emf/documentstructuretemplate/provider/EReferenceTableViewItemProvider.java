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
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
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
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EReferenceTableViewItemProvider
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
	public EReferenceTableViewItemProvider(AdapterFactory adapterFactory) {
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

			addGeneratePropertyDescriptor(object);
			addGenerateTitlePropertyDescriptor(object);
			addCustomTitlePropertyDescriptor(object);
			addGenerateRowHeaderPropertyDescriptor(object);
			addGenerateColumnHeaderPropertyDescriptor(object);
			addEReferencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Generate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addGeneratePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_IBodySectionPartTemplate_generate_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_IBodySectionPartTemplate_generate_feature", "_UI_IBodySectionPartTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.IBODY_SECTION_PART_TEMPLATE__GENERATE,
				true,
				false,
				false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Generate Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addGenerateTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_IBodySectionPartTemplate_generateTitle_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_IBodySectionPartTemplate_generateTitle_feature", "_UI_IBodySectionPartTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE,
				true,
				false,
				false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Custom Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addCustomTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_IBodySectionPartTemplate_customTitle_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_IBodySectionPartTemplate_customTitle_feature", "_UI_IBodySectionPartTemplate_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Generate Row Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addGenerateRowHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ITableView_generateRowHeader_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_ITableView_generateRowHeader_feature", "_UI_ITableView_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.ITABLE_VIEW__GENERATE_ROW_HEADER,
				true,
				false,
				false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Generate Column Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addGenerateColumnHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ITableView_generateColumnHeader_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_ITableView_generateColumnHeader_feature", "_UI_ITableView_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.ITABLE_VIEW__GENERATE_COLUMN_HEADER,
				true,
				false,
				false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the EReference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addEReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EReferenceTableView_eReference_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EReferenceTableView_eReference_feature", "_UI_EReferenceTableView_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructureTemplatePackage.Literals.EREFERENCE_TABLE_VIEW__EREFERENCE,
				true,
				false,
				true,
				null,
				null,
				null,
				URI.createURI("editor://documentstructuretemplate/EReferenceTableView/EReference/")));
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
			childrenFeatures.add(DocumentStructureTemplatePackage.Literals.ITABLE_VIEW__COLUMNS);
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
	 * This returns EReferenceTableView.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EReferenceTableView")); //$NON-NLS-1$
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
		EReferenceTableView eReferenceTableView = (EReferenceTableView) object;
		return getString("_UI_EReferenceTableView_type") + " " + eReferenceTableView.isGenerate(); //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EReferenceTableView.class)) {
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE:
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_TITLE:
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__CUSTOM_TITLE:
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
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

		newChildDescriptors.add(createChildParameter(DocumentStructureTemplatePackage.Literals.ITABLE_VIEW__COLUMNS,
				DocumentStructureTemplateFactory.eINSTANCE.createEStructuralFeatureColumn()));
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
		return ((IChildCreationExtender) adapterFactory).getResourceLocator();
	}

}
