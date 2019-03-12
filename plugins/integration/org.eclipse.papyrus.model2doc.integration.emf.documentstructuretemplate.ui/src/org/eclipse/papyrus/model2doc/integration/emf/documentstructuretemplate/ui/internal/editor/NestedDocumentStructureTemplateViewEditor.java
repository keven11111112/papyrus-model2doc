/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.editor;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProvider;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceSetItemProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.provider.DocumentStructureTemplateItemProviderAdapterFactory;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.Activator;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;

/**
 * DocumenView Editor.
 *
 * This editor is contributed throw the extension point org.eclipse.papyrus.infra.ui.papyrusDiagram.
 *
 * In order to get the new child menu, we register the action bar contribution using this same extension point and we use if for this editor.
 */
public class NestedDocumentStructureTemplateViewEditor extends CustomDocumentStructureTemplateEditor {

	/** the service registry */
	protected ServicesRegistry servicesRegistry;

	/**
	 * The edited document template
	 */
	private DocumentTemplate document;

	/**
	 *
	 * Constructor.
	 *
	 * @param servicesRegistry
	 *            the Papyrus service registry, it can't be <code>null</code>
	 * @param rawModel
	 *            the edited element, it can't be <code>null</code>
	 */
	public NestedDocumentStructureTemplateViewEditor(ServicesRegistry servicesRegistry, DocumentTemplate rawModel) {
		super();
		this.document = rawModel;
		this.servicesRegistry = servicesRegistry;
		Assert.isNotNull(this.document, "The edited DocumentTemplate is null. The DocumentStructureTemplate Editor creation failed"); //$NON-NLS-1$
		Assert.isNotNull(this.servicesRegistry, "The papyrus ServicesRegistry is null. The DocumentStructureTemplate Editor creation failed."); //$NON-NLS-1$
		initializeEditingDomain();
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.editor.CustomDocumentStructureTemplateEditor#initializeEditingDomain()
	 *
	 */
	@Override
	public void initializeEditingDomain() {
		if (this.servicesRegistry == null) {
			return;
		}
		super.initializeEditingDomain();
	}


	/**
	 *
	 * @see org.eclipse.emf.facet.widgets.nattable.workbench.editor.NatTableEditor#getEditingDomain()
	 *
	 * @return
	 */
	@Override
	public TransactionalEditingDomain getEditingDomain() {
		try {
			return ServiceUtils.getInstance().getTransactionalEditingDomain(this.servicesRegistry);
		} catch (final ServiceException e) {
			Activator.log.error(e);
		}
		return null;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.DocumentStructureTemplateEditor#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 *
	 * @param monitor
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		// manage by the Papyrus main editor
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.DocumentStructureTemplateEditor#doSaveAs()
	 *
	 */
	@Override
	public void doSaveAs() {
	}

	@SuppressWarnings("restriction")
	@Override
	public void init(IEditorSite site, IEditorInput input) {// throws PartInitException {
		final DocumentStructureTemplateEditorInput documentViewEditorInput = new DocumentStructureTemplateEditorInput(this.document);
		super.init(site, documentViewEditorInput);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.DocumentStructureTemplateEditor#isDirty()
	 *
	 * @return
	 */
	@Override
	public boolean isDirty() {
		// manage by the Papyrus main editor
		return false;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.DocumentStructureTemplateEditor#isSaveAsAllowed()
	 *
	 * @return
	 */
	@Override
	public boolean isSaveAsAllowed() {
		// manage by the Papyrus main editor
		return false;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.editor.CustomDocumentStructureTemplateEditor#createAndInitCommandStack()
	 *
	 * @return
	 */
	@Override
	protected BasicCommandStack createAndInitCommandStack() {
		final TransactionalEditingDomain domain = getEditingDomain();
		final CommandStack stack = domain.getCommandStack();
		Assert.isTrue(stack instanceof BasicCommandStack);
		final BasicCommandStack bStack = (BasicCommandStack) stack;
		addCommandStackListener(bStack);
		return bStack;
	}

	/**
	 *
	 * @param commandStack
	 */
	@Override
	protected void initEditingDomain(BasicCommandStack commandStack) {
		final TransactionalEditingDomain domain = getEditingDomain();
		Assert.isTrue(domain instanceof AdapterFactoryEditingDomain);
		this.editingDomain = (AdapterFactoryEditingDomain) domain;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.editor.CustomDocumentStructureTemplateEditor#initAdapterFactory()
	 *
	 */
	@Override
	protected void initAdapterFactory() {
		adapterFactory = createComposedAdapterFactory();
		adapterFactory.addAdapterFactory(new CustomResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new DocumentStructureTemplateItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}


	/**
	 *
	 * Custom ResourceItemProviderAdapterFactory to be able to show only the structure of the DocumentTemplate
	 * and not other elements contained in the file
	 *
	 */
	private class CustomResourceItemProviderAdapterFactory extends ResourceItemProviderAdapterFactory {

		/**
		 * @see org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory#createResourceSetAdapter()
		 *
		 * @return
		 */
		@Override
		public Adapter createResourceSetAdapter() {
			return new CustomResourceSetItemProvider(this);
		}

		/**
		 * @see org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory#createResourceAdapter()
		 *
		 * @return
		 */
		@Override
		public Adapter createResourceAdapter() {
			return new CustomResourceItemProvider(this);
		}
	}


	/**
	 *
	 * Custom ResourceSetItemProvider used to display only the edited documentemplate and not other file contents
	 *
	 */
	private class CustomResourceSetItemProvider extends ResourceSetItemProvider {

		/**
		 * Constructor.
		 *
		 * @param adapterFactory
		 */
		public CustomResourceSetItemProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}


		/**
		 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getElements(java.lang.Object)
		 *
		 * @param object
		 * @return
		 */
		@Override
		public Collection<?> getElements(Object object) {
			return Collections.singleton(document.eResource());
		}
	}

	/**
	 *
	 * Custom ResourceItemProvider to get only the {@link DocumentTemplate} displayed in the EcoreEditor
	 *
	 */
	private class CustomResourceItemProvider extends ResourceItemProvider {

		/**
		 * Constructor.
		 *
		 * @param adapterFactory
		 */
		public CustomResourceItemProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		/**
		 *
		 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getElements(java.lang.Object)
		 *
		 * @param object
		 * @return
		 */
		@Override
		public Collection<?> getElements(Object object) {
			return super.getElements(object);
		}

		/**
		 *
		 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#hasChildren(java.lang.Object)
		 *
		 * @param object
		 * @return
		 */
		@Override
		public boolean hasChildren(Object object) {
			if (object instanceof Resource) {
				return true;
			}
			return super.hasChildren(object);
		}

		/**
		 *
		 * @see org.eclipse.emf.edit.provider.resource.ResourceItemProvider#getParent(java.lang.Object)
		 *
		 * @param object
		 * @return
		 */
		@Override
		public Object getParent(Object object) {
			return super.getParent(object);
		}

		/**
		 *
		 * @see org.eclipse.emf.edit.provider.resource.ResourceItemProvider#getChildren(java.lang.Object)
		 *
		 * @param object
		 * @return
		 */
		@Override
		public Collection<?> getChildren(Object object) {
			if (object instanceof Resource) {
				return Collections.singletonList(document);
			}
			return super.getChildren(object);
		}

	}


}
