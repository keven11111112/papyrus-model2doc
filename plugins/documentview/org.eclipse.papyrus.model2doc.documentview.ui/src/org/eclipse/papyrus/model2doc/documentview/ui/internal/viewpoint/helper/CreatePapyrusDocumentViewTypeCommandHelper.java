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
package org.eclipse.papyrus.model2doc.documentview.ui.internal.viewpoint.helper;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainManager;
import org.eclipse.papyrus.infra.architecture.representation.PapyrusRepresentationKind;
import org.eclipse.papyrus.infra.viewpoints.policy.IViewTypeHelper;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;

import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.documentview.representation.PapyrusDocument;
import org.eclipse.papyrus.model2doc.documentview.representation.RepresentationPackage;
import org.eclipse.papyrus.model2doc.documentview.ui.Activator;
import org.eclipse.papyrus.model2doc.documentview.ui.internal.viewpoint.prototype.PapyrusDocumentViewPrototype;
import org.eclipse.papyrus.model2doc.documentview.ui.menu.handler.CreateDocumentViewEditorHandler;

/**
 * Represents a helper for the handling of Papyrus Document View Type creation commands.
 *
 */
public class CreatePapyrusDocumentViewTypeCommandHelper implements IViewTypeHelper {
	
	/**
	 * The cache of prototypes
	 */
	private Map<PapyrusRepresentationKind, PapyrusDocumentViewPrototype> cache;

	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.IViewTypeHelper#isSupported(org.eclipse.emf.ecore.EClass)
	 *
	 * @param type
	 * @return
	 */
	@Override
	public boolean isSupported(EClass type) {
		return EcoreUtil.equals(type, RepresentationPackage.eINSTANCE.getPapyrusDocument());
	}

	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.IViewTypeHelper#isSupported(org.eclipse.emf.ecore.EObject)
	 *
	 * @param view
	 * @return
	 */
	@Override
	public boolean isSupported(EObject view) {
		return (view instanceof Document);
	}

	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.IViewTypeHelper#getPrototypeFor(org.eclipse.papyrus.infra.architecture.representation.PapyrusRepresentationKind)
	 *
	 * @param kind
	 * @return
	 */
	@Override
	public ViewPrototype getPrototypeFor(PapyrusRepresentationKind kind) {
		if (!(kind instanceof PapyrusDocument)) {
			return null;
		}
		
		PapyrusDocument papyrusDocument = (PapyrusDocument) kind;
		if (cache == null) {
			cache = new HashMap<PapyrusRepresentationKind, PapyrusDocumentViewPrototype>();
		}
		if (cache.containsKey(papyrusDocument)) {
			return cache.get(papyrusDocument);
		}
		CreateDocumentViewEditorHandler command;
		Class<?> creationCommandClass = papyrusDocument.getCreationCommandClass();
		try {
			command = (CreateDocumentViewEditorHandler) creationCommandClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			Activator.log.error(e);
			return null;
		}
		PapyrusDocumentViewPrototype proto = new PapyrusDocumentViewPrototype(papyrusDocument, command);
		cache.put(papyrusDocument, proto);
		return proto;
	}

	/**
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.IViewTypeHelper#getPrototypeOf(org.eclipse.emf.ecore.EObject)
	 *
	 * @param view
	 * @return
	 */
	@Override
	public ViewPrototype getPrototypeOf(EObject view) {
		if (!isSupported(view)) {
			return null;
		}
		PolicyChecker checker = PolicyChecker.getFor(view);
		ArchitectureDomainManager manager = ArchitectureDomainManager.getInstance();
		PapyrusDocument repKind = (PapyrusDocument) manager.getRepresentationKindById(((Document) view).getDocumentRepresentationKindId());
		if (null != repKind && checker.isInViewpoint(repKind)) {
			return getPrototypeFor(repKind);
		}
		return ViewPrototype.UNAVAILABLE_VIEW;
	}

}
