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
package org.eclipse.papyrus.model2doc.documentview.ui.internal.viewpoint.prototype;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;

import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.documentview.representation.PapyrusDocument;
import org.eclipse.papyrus.model2doc.documentview.ui.menu.handler.CreateDocumentViewEditorHandler;

/**
 * Represents a prototype of Document View for the viewpoints infrastructure.
 *
 */
public class PapyrusDocumentViewPrototype extends ViewPrototype {
	
	private final CreateDocumentViewEditorHandler command;
	
	/**
	 * Constructor.
	 *
	 * @param prototype
	 * 			The PapyrusDocument representation
	 */
	public PapyrusDocumentViewPrototype(PapyrusDocument prototype, CreateDocumentViewEditorHandler command) {
		super(prototype);
		this.command = command;
	}

	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype#isOwnerReassignable()
	 *
	 * @return
	 */
	@Override
	public boolean isOwnerReassignable() {
		// Users can always move documents that are part of their viewpoint
		return true;
	}

	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype#instantiateOn(org.eclipse.emf.ecore.EObject)
	 *
	 * @param owner
	 * @return
	 */
	@Override
	public boolean instantiateOn(EObject owner) {
		
		return instantiateOn(owner, null);
	}
	
	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype#instantiateOn(org.eclipse.emf.ecore.EObject, java.lang.String)
	 *
	 * @param owner
	 * @param name
	 * @return
	 */
	@Override
	public boolean instantiateOn(EObject owner, String name) {
		return command.execute(this, owner, name);
	}

	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype#getCommandChangeOwner(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 *
	 * @param view
	 * @param target
	 * @return
	 */
	@Override
	public Command getCommandChangeOwner(EObject view, EObject target) {
		final Document document = (Document) view;
		final EObject previous = document.getContext();
		return new AbstractCommand("Change document onwer element") {
			@Override
			public void execute() {
				document.setOwner(target);
			}

			@Override
			public void undo() {
				document.setOwner(previous);
			}

			@Override
			public void redo() {
				document.setOwner(target);
			}

			@Override
			protected boolean prepare() {
				return true;
			}
		};
	}

	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype#getCommandChangeRoot(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 *
	 * @param view
	 * @param target
	 * @return
	 */
	@Override
	public Command getCommandChangeRoot(EObject view, EObject target) {
		final Document document = (Document) view;
		final EObject previous = document.getContext();
		return new AbstractCommand("Change document root element") {
			@Override
			public void execute() {
				document.setContext(target);
			}

			@Override
			public void undo() {
				document.setContext(previous);
			}

			@Override
			public void redo() {
				document.setContext(target);
			}

			@Override
			protected boolean prepare() {
				return true;
			}
		};
	}

	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype#getOwnerOf(org.eclipse.emf.ecore.EObject)
	 *
	 * @param view
	 * @return
	 */
	@Override
	public EObject getOwnerOf(EObject view) {
		return ((Document)view).getOwner();
	}

	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype#getRootOf(org.eclipse.emf.ecore.EObject)
	 *
	 * @param view
	 * @return
	 */
	@Override
	public EObject getRootOf(EObject view) {
		return ((Document)view).getContext();
	}

}
