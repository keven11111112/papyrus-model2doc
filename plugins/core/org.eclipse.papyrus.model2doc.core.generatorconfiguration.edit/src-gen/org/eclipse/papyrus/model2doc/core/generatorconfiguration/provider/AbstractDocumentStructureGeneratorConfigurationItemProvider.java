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
package org.eclipse.papyrus.model2doc.core.generatorconfiguration.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AbstractDocumentStructureGeneratorConfigurationItemProvider extends AbstractDocumentGeneratorConfigurationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public AbstractDocumentStructureGeneratorConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addStructureGeneratorIdPropertyDescriptor(object);
			addImageFolderPropertyDescriptor(object);
			addStructureFolderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Structure Generator Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addStructureGeneratorIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AbstractDocumentStructureGeneratorConfiguration_structureGeneratorId_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_AbstractDocumentStructureGeneratorConfiguration_structureGeneratorId_feature", "_UI_AbstractDocumentStructureGeneratorConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				GeneratorConfigurationPackage.Literals.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Image Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addImageFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AbstractDocumentStructureGeneratorConfiguration_imageFolder_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_AbstractDocumentStructureGeneratorConfiguration_imageFolder_feature", "_UI_AbstractDocumentStructureGeneratorConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				GeneratorConfigurationPackage.Literals.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Structure Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addStructureFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AbstractDocumentStructureGeneratorConfiguration_structureFolder_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_AbstractDocumentStructureGeneratorConfiguration_structureFolder_feature", "_UI_AbstractDocumentStructureGeneratorConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				GeneratorConfigurationPackage.Literals.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER,
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
		String label = ((AbstractDocumentStructureGeneratorConfiguration) object).getDocumentName();
		return label == null || label.length() == 0 ? getString("_UI_AbstractDocumentStructureGeneratorConfiguration_type") : //$NON-NLS-1$
				getString("_UI_AbstractDocumentStructureGeneratorConfiguration_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(AbstractDocumentStructureGeneratorConfiguration.class)) {
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_GENERATOR_ID:
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__IMAGE_FOLDER:
		case GeneratorConfigurationPackage.ABSTRACT_DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION__STRUCTURE_FOLDER:
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
	}

}
