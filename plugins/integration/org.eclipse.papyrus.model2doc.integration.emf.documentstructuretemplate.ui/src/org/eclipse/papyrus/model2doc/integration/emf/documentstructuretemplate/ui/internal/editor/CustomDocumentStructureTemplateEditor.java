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

import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.DocumentStructureTemplateEditor;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.provider.DocumentStructureTemplateItemProviderAdapterFactory;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.views.properties.PropertySheetPage;

/**
 *
 * This class does the same work than its superclass {@link DocumentStructureTemplateEditor}
 * but here, we split or or override some methods to reuse them with a different implementation in a Papyrus Context
 *
 */
public class CustomDocumentStructureTemplateEditor extends DocumentStructureTemplateEditor {

	/**
	 * the command stack listener
	 */
	private CommandStackListener commandStackListener;

	/**
	 *
	 * Constructor.
	 *
	 */
	public CustomDocumentStructureTemplateEditor() {
		super();
	}

	/**
	 *
	 * This method is split in 3 new methods, but same behavior than in the super class
	 *
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.DocumentStructureTemplateEditor#initializeEditingDomain()
	 */
	@Override
	protected void initializeEditingDomain() {
		initAdapterFactory();
		final BasicCommandStack commandStack = createAndInitCommandStack();
		initEditingDomain(commandStack);
	}

	/**
	 * Init the adapter factory
	 */
	protected void initAdapterFactory() {
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new DocumentStructureTemplateItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 *
	 * @return
	 * 		the created ComposedAdapterFactory
	 */
	protected ComposedAdapterFactory createComposedAdapterFactory() {
		return new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	}

	/**
	 *
	 * @return
	 * 		the command stack
	 */
	protected BasicCommandStack createAndInitCommandStack() {
		final BasicCommandStack commandStack = new BasicCommandStack();
		addCommandStackListener(commandStack);
		return commandStack;
	}

	/**
	 * Init the editing domain of the editor
	 *
	 * @param commandStack
	 *            the command stack
	 */
	protected void initEditingDomain(final BasicCommandStack commandStack) {
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());

	}

	/**
	 * Add a listener on the command stack
	 *
	 * @param commandStack
	 *            the command stack
	 */
	protected void addCommandStackListener(final BasicCommandStack commandStack) {
		commandStack.addCommandStackListener(this.commandStackListener = new CustomCommandStackListener());
	}


	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.DocumentStructureTemplateEditor#dispose()
	 *
	 */
	@Override
	public void dispose() {
		this.editingDomain.getCommandStack().removeCommandStackListener(this.commandStackListener);
		super.dispose();
	}

	/**
	 *
	 * The command stack listener (implementation duplicated from the super class)
	 *
	 */
	private class CustomCommandStackListener implements CommandStackListener {

		/**
		 *
		 * @see org.eclipse.emf.common.command.CommandStackListener#commandStackChanged(java.util.EventObject)
		 *
		 * @param event
		 */
		@Override
		public void commandStackChanged(final EventObject event) {
			getContainer().getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					firePropertyChange(IEditorPart.PROP_DIRTY);

					// Try to select the affected objects.
					//
					Command mostRecentCommand = ((CommandStack) event.getSource()).getMostRecentCommand();
					if (mostRecentCommand != null) {
						setSelectionToViewer(mostRecentCommand.getAffectedObjects());
					}
					for (Iterator<PropertySheetPage> i = propertySheetPages.iterator(); i.hasNext();) {
						PropertySheetPage propertySheetPage = i.next();
						if (propertySheetPage.getControl().isDisposed()) {
							i.remove();
						} else {
							propertySheetPage.refresh();
						}
					}
				}
			});
		}
	}
}
