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
package org.eclipse.papyrus.model2doc.emf.documentstructure.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.Title} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TitleItemProvider
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
	public TitleItemProvider(AdapterFactory adapterFactory) {
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

			addSubBodyPartPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sub Body Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addSubBodyPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ComposedBodyPart_subBodyPart_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_ComposedBodyPart_subBodyPart_feature", "_UI_ComposedBodyPart_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructurePackage.Literals.COMPOSED_BODY_PART__SUB_BODY_PART,
				true,
				false,
				true,
				null,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Title_title_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Title_title_feature", "_UI_Title_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DocumentStructurePackage.Literals.TITLE__TITLE,
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
			childrenFeatures.add(DocumentStructurePackage.Literals.BODY_PART__DATA_SOURCE);
			childrenFeatures.add(DocumentStructurePackage.Literals.COMPOSED_BODY_PART__SUB_BODY_PART);
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
	 * This returns Title.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Title")); //$NON-NLS-1$
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
		String label = ((Title) object).getTitle();
		return label == null || label.length() == 0 ? getString("_UI_Title_type") : //$NON-NLS-1$
				getString("_UI_Title_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Title.class)) {
		case DocumentStructurePackage.TITLE__TITLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DocumentStructurePackage.TITLE__DATA_SOURCE:
		case DocumentStructurePackage.TITLE__SUB_BODY_PART:
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

		newChildDescriptors.add(createChildParameter(DocumentStructurePackage.Literals.BODY_PART__DATA_SOURCE,
				DocumentStructureFactory.eINSTANCE.createEMFDataSource()));

		newChildDescriptors.add(createChildParameter(DocumentStructurePackage.Literals.COMPOSED_BODY_PART__SUB_BODY_PART,
				DocumentStructureFactory.eINSTANCE.createParagraph()));

		newChildDescriptors.add(createChildParameter(DocumentStructurePackage.Literals.COMPOSED_BODY_PART__SUB_BODY_PART,
				DocumentStructureFactory.eINSTANCE.createTitle()));

		newChildDescriptors.add(createChildParameter(DocumentStructurePackage.Literals.COMPOSED_BODY_PART__SUB_BODY_PART,
				DocumentStructureFactory.eINSTANCE.createImage()));

		newChildDescriptors.add(createChildParameter(DocumentStructurePackage.Literals.COMPOSED_BODY_PART__SUB_BODY_PART,
				DocumentStructureFactory.eINSTANCE.createExtendedBasicTable()));

		newChildDescriptors.add(createChildParameter(DocumentStructurePackage.Literals.COMPOSED_BODY_PART__SUB_BODY_PART,
				DocumentStructureFactory.eINSTANCE.createExtendedBasicList()));

		newChildDescriptors.add(createChildParameter(DocumentStructurePackage.Literals.COMPOSED_BODY_PART__SUB_BODY_PART,
				DocumentStructureFactory.eINSTANCE.createInsertedFile()));

		newChildDescriptors.add(createChildParameter(DocumentStructurePackage.Literals.COMPOSED_BODY_PART__SUB_BODY_PART,
				DocumentStructureFactory.eINSTANCE.createEmptyLine()));

		newChildDescriptors.add(createChildParameter(DocumentStructurePackage.Literals.COMPOSED_BODY_PART__SUB_BODY_PART,
				DocumentStructureFactory.eINSTANCE.createInsertedGeneratedFile()));
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
