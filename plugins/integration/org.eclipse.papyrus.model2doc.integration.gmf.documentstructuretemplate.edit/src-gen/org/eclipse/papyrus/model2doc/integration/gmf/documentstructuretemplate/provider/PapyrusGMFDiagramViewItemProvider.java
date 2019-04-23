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
package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;

import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class PapyrusGMFDiagramViewItemProvider
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
	public PapyrusGMFDiagramViewItemProvider(AdapterFactory adapterFactory) {
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
			addDiagramKindIdPropertyDescriptor(object);
			addDiagramTypePropertyDescriptor(object);
			addContextFilterRulePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Diagram Kind Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDiagramKindIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PapyrusGMFDiagramView_diagramKindId_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_PapyrusGMFDiagramView_diagramKindId_feature", "_UI_PapyrusGMFDiagramView_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				PapyrusGMFDocumentStructureTemplatePackage.Literals.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Diagram Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDiagramTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PapyrusGMFDiagramView_diagramType_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_PapyrusGMFDiagramView_diagramType_feature", "_UI_PapyrusGMFDiagramView_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				PapyrusGMFDocumentStructureTemplatePackage.Literals.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Context Filter Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addContextFilterRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PapyrusGMFDiagramView_contextFilterRule_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_PapyrusGMFDiagramView_contextFilterRule_feature", "_UI_PapyrusGMFDiagramView_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				PapyrusGMFDocumentStructureTemplatePackage.Literals.PAPYRUS_GMF_DIAGRAM_VIEW__CONTEXT_FILTER_RULE,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This returns PapyrusGMFDiagramView.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PapyrusGMFDiagramView")); //$NON-NLS-1$
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
		PapyrusGMFDiagramView papyrusGMFDiagramView = (PapyrusGMFDiagramView) object;
		return getString("_UI_PapyrusGMFDiagramView_type") + " " + papyrusGMFDiagramView.isGenerate(); //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(PapyrusGMFDiagramView.class)) {
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE:
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_TITLE:
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CUSTOM_TITLE:
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID:
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE:
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CONTEXT_FILTER_RULE:
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
