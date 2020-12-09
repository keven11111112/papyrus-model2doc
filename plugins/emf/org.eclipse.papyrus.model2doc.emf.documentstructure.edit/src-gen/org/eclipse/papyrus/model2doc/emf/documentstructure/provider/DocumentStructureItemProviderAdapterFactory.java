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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractList;
import org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage;
import org.eclipse.papyrus.model2doc.core.builtintypes.ListItem;
import org.eclipse.papyrus.model2doc.core.builtintypes.Row;

import org.eclipse.papyrus.model2doc.core.builtintypes.util.BuiltInTypesSwitch;

import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;

import org.eclipse.papyrus.model2doc.emf.documentstructure.util.DocumentStructureAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DocumentStructureItemProviderAdapterFactory extends DocumentStructureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(DocumentstructureEditPlugin.INSTANCE, DocumentStructurePackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DocumentStructureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TextDocumentItemProvider textDocumentItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createTextDocumentAdapter() {
		if (textDocumentItemProvider == null) {
			textDocumentItemProvider = new TextDocumentItemProvider(this);
		}

		return textDocumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.Body} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected BodyItemProvider bodyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.Body}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createBodyAdapter() {
		if (bodyItemProvider == null) {
			bodyItemProvider = new BodyItemProvider(this);
		}

		return bodyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ParagraphItemProvider paragraphItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createParagraphAdapter() {
		if (paragraphItemProvider == null) {
			paragraphItemProvider = new ParagraphItemProvider(this);
		}

		return paragraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.Title} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TitleItemProvider titleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.Title}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createTitleAdapter() {
		if (titleItemProvider == null) {
			titleItemProvider = new TitleItemProvider(this);
		}

		return titleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ImageItemProvider imageItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter() {
		if (imageItemProvider == null) {
			imageItemProvider = new ImageItemProvider(this);
		}

		return imageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.EMFDataSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EMFDataSourceItemProvider emfDataSourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.EMFDataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createEMFDataSourceAdapter() {
		if (emfDataSourceItemProvider == null) {
			emfDataSourceItemProvider = new EMFDataSourceItemProvider(this);
		}

		return emfDataSourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfFigures} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TableOfFiguresItemProvider tableOfFiguresItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfFigures}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createTableOfFiguresAdapter() {
		if (tableOfFiguresItemProvider == null) {
			tableOfFiguresItemProvider = new TableOfFiguresItemProvider(this);
		}

		return tableOfFiguresItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TableOfContentsItemProvider tableOfContentsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createTableOfContentsAdapter() {
		if (tableOfContentsItemProvider == null) {
			tableOfContentsItemProvider = new TableOfContentsItemProvider(this);
		}

		return tableOfContentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicTable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ExtendedBasicTableItemProvider extendedBasicTableItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createExtendedBasicTableAdapter() {
		if (extendedBasicTableItemProvider == null) {
			extendedBasicTableItemProvider = new ExtendedBasicTableItemProvider(this);
		}

		return extendedBasicTableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextCell} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ExtendedTextCellItemProvider extendedTextCellItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createExtendedTextCellAdapter() {
		if (extendedTextCellItemProvider == null) {
			extendedTextCellItemProvider = new ExtendedTextCellItemProvider(this);
		}

		return extendedTextCellItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ExtendedBasicListItemProvider extendedBasicListItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createExtendedBasicListAdapter() {
		if (extendedBasicListItemProvider == null) {
			extendedBasicListItemProvider = new ExtendedBasicListItemProvider(this);
		}

		return extendedBasicListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextListItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ExtendedTextListItemItemProvider extendedTextListItemItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createExtendedTextListItemAdapter() {
		if (extendedTextListItemItemProvider == null) {
			extendedTextListItemItemProvider = new ExtendedTextListItemItemProvider(this);
		}

		return extendedTextListItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.StringVersion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected StringVersionItemProvider stringVersionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.StringVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createStringVersionAdapter() {
		if (stringVersionItemProvider == null) {
			stringVersionItemProvider = new StringVersionItemProvider(this);
		}

		return stringVersionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected InsertedFileItemProvider insertedFileItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createInsertedFileAdapter() {
		if (insertedFileItemProvider == null) {
			insertedFileItemProvider = new InsertedFileItemProvider(this);
		}

		return insertedFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.model2doc.emf.documentstructure.EmptyLine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EmptyLineItemProvider emptyLineItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.model2doc.emf.documentstructure.EmptyLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createEmptyLineAdapter() {
		if (emptyLineItemProvider == null) {
			emptyLineItemProvider = new EmptyLineItemProvider(this);
		}

		return emptyLineItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void dispose() {
		if (textDocumentItemProvider != null) {
			textDocumentItemProvider.dispose();
		}
		if (bodyItemProvider != null) {
			bodyItemProvider.dispose();
		}
		if (paragraphItemProvider != null) {
			paragraphItemProvider.dispose();
		}
		if (titleItemProvider != null) {
			titleItemProvider.dispose();
		}
		if (imageItemProvider != null) {
			imageItemProvider.dispose();
		}
		if (emfDataSourceItemProvider != null) {
			emfDataSourceItemProvider.dispose();
		}
		if (tableOfFiguresItemProvider != null) {
			tableOfFiguresItemProvider.dispose();
		}
		if (tableOfContentsItemProvider != null) {
			tableOfContentsItemProvider.dispose();
		}
		if (extendedBasicTableItemProvider != null) {
			extendedBasicTableItemProvider.dispose();
		}
		if (extendedTextCellItemProvider != null) {
			extendedTextCellItemProvider.dispose();
		}
		if (extendedBasicListItemProvider != null) {
			extendedBasicListItemProvider.dispose();
		}
		if (extendedTextListItemItemProvider != null) {
			extendedTextListItemItemProvider.dispose();
		}
		if (stringVersionItemProvider != null) {
			stringVersionItemProvider.dispose();
		}
		if (insertedFileItemProvider != null) {
			insertedFileItemProvider.dispose();
		}
		if (emptyLineItemProvider != null) {
			emptyLineItemProvider.dispose();
		}
	}

	/**
	 * A child creation extender for the {@link BuiltInTypesPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static class BuiltInTypesChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		protected static class CreationSwitch extends BuiltInTypesSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 *
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 *
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 *
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 *
			 * @generated
			 */
			@Override
			public Object caseRow(Row object) {
				newChildDescriptors.add(createChildParameter(BuiltInTypesPackage.Literals.ROW__CELLS,
						DocumentStructureFactory.eINSTANCE.createExtendedTextCell()));

				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 *
			 * @generated
			 */
			@Override
			public Object caseAbstractList(AbstractList object) {
				newChildDescriptors.add(createChildParameter(BuiltInTypesPackage.Literals.ABSTRACT_LIST__ITEMS,
						DocumentStructureFactory.eINSTANCE.createExtendedTextListItem()));

				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 *
			 * @generated
			 */
			@Override
			public Object caseListItem(ListItem object) {
				newChildDescriptors.add(createChildParameter(BuiltInTypesPackage.Literals.LIST_ITEM__SUB_ITEMS,
						DocumentStructureFactory.eINSTANCE.createExtendedTextListItem()));

				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 *
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		@Override
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject) object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		@Override
		public ResourceLocator getResourceLocator() {
			return DocumentstructureEditPlugin.INSTANCE;
		}
	}

}
