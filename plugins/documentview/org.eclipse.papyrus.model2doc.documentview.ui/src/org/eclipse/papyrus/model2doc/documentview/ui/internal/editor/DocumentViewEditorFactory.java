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
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.documentview.ui.internal.editor;

import java.lang.reflect.Constructor;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.papyrus.infra.core.editor.BackboneException;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.AbstractPageModel;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IEditorModel;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageModel;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.ui.extension.diagrameditor.AbstractEditorFactory;
import org.eclipse.papyrus.infra.ui.multidiagram.actionbarcontributor.ActionBarContributorRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorActionBarContributor;

import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.documentview.ui.Activator;

/**
 * Factory for the DocumentViewEditor
 *
 */
public class DocumentViewEditorFactory extends AbstractEditorFactory {

	/**
	 *
	 * Constructor.
	 *
	 * @param editorClass
	 *            the editor class
	 * @param editorType
	 *            the type of editor
	 */
	public DocumentViewEditorFactory() {
		 // we don't use the type for the DocumentView models
		super(DocumentViewEditor.class, "");
	}

	/**
	 * Create the IPageModel that is used by the SashWindows to manage the editor.
	 *
	 * @see org.eclipse.papyrus.infra.ui.editorsfactory.IEditorFactory#createIPageModel(java.lang.Object)
	 *
	 * @param pageIdentifier
	 *            The model pushed in the sashmodel by the creation command
	 * @return A model implementing the IPageModel
	 */
	@Override
	public IPageModel createIPageModel(Object pageIdentifier) {
		ServicesRegistry services = getServiceRegistry();

		return new DocumentViewEditorModel(pageIdentifier, services, new ILabelProvider() {
			
			@Override
			public void removeListener(ILabelProviderListener listener) {
				
			}
			
			@Override
			public boolean isLabelProperty(Object element, String property) {
				return false;
			}
			
			@Override
			public void dispose() {
			}
			
			@Override
			public void addListener(ILabelProviderListener listener) {
			}
			
			@Override
			public String getText(Object element) {
				if(element instanceof Document) {
					return ((Document) element).getName();
				}
				return null;
			}
			
			@Override
			public Image getImage(Object element) {
				return null;
			}
		});
	}

	/**
	 * @see org.eclipse.papyrus.infra.ui.editorsfactory.IEditorFactory#isPageModelFactoryFor(java.lang.Object)
	 *
	 * @param pageIdentifier
	 * @return
	 */
	@Override
	public boolean isPageModelFactoryFor(Object pageIdentifier) {
		return pageIdentifier instanceof Document;
	}

	/**
	 * IEditorModel used internally by the SashContainer. This model know how to handle IEditor creation.
	 *
	 */
	class DocumentViewEditorModel extends AbstractPageModel implements IEditorModel {


		/**
		 * The servicesRegistry provided at creation.
		 */
		private ServicesRegistry servicesRegistry;

		/**
		 * The created editor.
		 */
		private IEditorPart editor;

		/**
		 * The raw model stored in the SashProvider.
		 */
		private Document rawModel;

		/**
		 *
		 * Constructor.
		 */
		public DocumentViewEditorModel(Object pageIdentifier, ServicesRegistry servicesRegistry, ILabelProvider labels) {
			super(labels);

			this.rawModel = (Document) pageIdentifier;
			this.servicesRegistry = servicesRegistry;
		}

		/**
		 * Create the IEditor for the diagram.
		 *
		 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IEditorModel#createIEditorPart()
		 * @return
		 * @throws PartInitException
		 *
		 */
		@Override
		public IEditorPart createIEditorPart() throws PartInitException {
			try {

				Constructor<?> c = getDiagramClass().getConstructor(ServicesRegistry.class, Document.class);
				IEditorPart newEditor = (IEditorPart) c.newInstance(this.servicesRegistry, this.rawModel);
				this.editor = newEditor;
				return this.editor;

			} catch (Exception e) {
				// Lets propagate. This is an implementation problem that should be solved by
				// programmer.
				throw new PartInitException("Can't create DocumentView", e); //$NON-NLS-1$
			}

		}

		/**
		 * Get the action bar requested by the Editor.
		 *
		 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IEditorModel#getActionBarContributor()
		 * @return
		 *
		 */
		@Override
		public EditorActionBarContributor getActionBarContributor() {

			String actionBarId = DocumentViewEditorFactory.this.editorDescriptor.getActionBarContributorId();

			// Do nothing if no EditorActionBarContributor is specify.
			if (actionBarId == null || actionBarId.length() == 0) {
				return null;
			}

			// Get ServiceRegistry
			ActionBarContributorRegistry registry;
			try {
				registry = this.servicesRegistry.getService(ActionBarContributorRegistry.class);
			} catch (ServiceException e) {
				// Service not found
				Activator.log.error(e);
				return null;
			}

			try {
				return registry.getActionBarContributor(actionBarId);
			} catch (BackboneException e) {
				Activator.log.error(e);
				return null;
			}
		}

		/**
		 * Get the underlying RawModel. Return the Document.
		 *
		 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageModel#getRawModel()
		 * @return
		 *
		 */
		@Override
		public Object getRawModel() {
			return this.rawModel;
		}
	}
}
