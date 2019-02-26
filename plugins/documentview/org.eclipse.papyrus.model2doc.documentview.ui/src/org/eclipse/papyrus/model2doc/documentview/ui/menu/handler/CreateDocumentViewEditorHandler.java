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
package org.eclipse.papyrus.model2doc.documentview.ui.menu.handler;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.EditorNameInitializer;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;
import org.eclipse.papyrus.uml.internationalization.utils.utils.UMLLabelInternationalization;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.NamedElement;

import org.eclipse.papyrus.model2doc.core.ui.handler.UML2DocHandler;
import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.documentview.DocumentViewFactory;
import org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage;
import org.eclipse.papyrus.model2doc.documentview.representation.PapyrusDocument;
import org.eclipse.papyrus.model2doc.documentview.resource.notation.PapyrusDocumentNotationModel;
import org.eclipse.papyrus.model2doc.documentview.ui.Activator;
import org.eclipse.papyrus.model2doc.documentview.ui.internal.message.Messages;

/**
 * Handler class for creating Document View editor.
 *
 * @since 3.0
 */
public abstract class CreateDocumentViewEditorHandler extends UML2DocHandler {

	/**
	 * Constructor.
	 *
	 */
	public CreateDocumentViewEditorHandler() {
	}

	/**
	 * Create Document View editor.
	 * 
	 * @param prototype
	 * @param context
	 * @param name
	 * @return
	 */
	public boolean execute(final ViewPrototype prototype, final EObject context, String name) {
		name = name != null ? name : askName(context, prototype);
		if (name == null) {
			return false;
		}
		
		StringBuilder documentFileNameBuilder = new StringBuilder();
		String prefixName = getPrefixName(context);
		documentFileNameBuilder.append(prefixName);
		documentFileNameBuilder.append("_"); //$NON-NLS-1$
		documentFileNameBuilder.append(name);
		
		final String documentFileName = documentFileNameBuilder.toString();
		final String documentName = name;
		try {
			final ServicesRegistry serviceRegistry = ServiceUtilsForEObject.getInstance().getServiceRegistry(context);
			final TransactionalEditingDomain domain = ServiceUtils.getInstance().getTransactionalEditingDomain(serviceRegistry);
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					try {
						String documentKind = ((PapyrusDocument) prototype.getRepresentationKind()).getDocumentKind();
						String documentRepresentationKindId = prototype.getRepresentationKind().getId();
						createDocumentViewEditor(serviceRegistry, documentName, documentFileName, documentKind, documentRepresentationKindId, context, this.description);
					} catch (Exception e) {
						Activator.log.error(e);
					}
				}

			});
			return true;
		} catch (Exception e) {
			Activator.log.error(e);
			return false;
		}

	}

	/**
	 * Create DocumentView Editor.
	 * 
	 * @param serviceRegistry
	 * @param documentName
	 * @param documentFileName
	 * @param documentKind
	 * @param documentRepresentationKindId
	 * @param context
	 * @param description
	 * @throws ServiceException
	 * @throws NotFoundException
	 */
	protected void createDocumentViewEditor(ServicesRegistry serviceRegistry, String documentName, String documentFileName, String documentKind, String documentRepresentationKindId, EObject context, String description) throws ServiceException, NotFoundException {
		final Document document = DocumentViewFactory.eINSTANCE.createDocument();
		document.setName(documentName);
		document.setDescription(description);
		document.setContext(context);
		document.setOwner(context);
		document.setDocumentKind(documentKind);
		document.setDocumentRepresentationKindId(documentRepresentationKindId);
		if (this.generateDocument(documentFileName)) {
			document.setGeneratedDocumentFileURI(this.getGeneratedDocumentFileURI());
			// Save the model in the associated resource
			final ModelSet modelSet = ServiceUtils.getInstance().getModelSet(serviceRegistry);
			final PapyrusDocumentNotationModel documentNotationModel = (PapyrusDocumentNotationModel) modelSet.getModelChecked(PapyrusDocumentNotationModel.DOCUMENT_MODEL_ID);
			documentNotationModel.addDocument(document);
		}
	}

	/**
	 * Prompts the user the future document's name.
	 * 
	 * @param context
	 * @param prototype
	 *
	 * @return The name, or <code>null</code> if the user cancelled the creation
	 */
	public String askName(EObject context, ViewPrototype prototype) {
		// we create a new resourceSet to avoid to load unused config in the resourceSet in case of Cancel
		String defaultName = ((PapyrusDocument) prototype.getRepresentationKind()).getName();
		// default Value
		final String nameWithIncrement = EditorNameInitializer.getNameWithIncrement(DocumentViewPackage.eINSTANCE.getDocument(), DocumentViewPackage.eINSTANCE.getDocument_Name(), defaultName, context);
		final InputDialog dialog = new InputDialog(Display.getDefault().getActiveShell(), Messages.CreateDocumentViewEditorHandler_PapyrusDocumentCreation, Messages.CreateDocumentViewEditorHandler_EnterTheNameForTheNewDocument, nameWithIncrement, null);
		if (dialog.open() == Window.OK) {
			return dialog.getValue();
		}
		return null;
	}

	private String getPrefixName(EObject context) {
		UMLLabelInternationalization umlLabelInternationalization = UMLLabelInternationalization.getInstance();
		URI uri = context.eResource().getURI();
		final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
		String fileNameWithoutExtension = file.getName().substring(0, file.getName().lastIndexOf('.'));;
		
		StringBuilder prefixNameBuilder = new StringBuilder();
		prefixNameBuilder.append(fileNameWithoutExtension);
		prefixNameBuilder.append("_"); // //$NON-NLS-1$
		prefixNameBuilder.append(umlLabelInternationalization.getLabel(((NamedElement) context)));
		
		return prefixNameBuilder.toString();
	}

	public abstract String getGeneratedDocumentFileURI();
}

