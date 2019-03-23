/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents;

/**
 *
 *
 */
public class TableOfContentsMapper extends AbstractEMFTemplateToStructureMapper<org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents, TableOfContents> {


	public TableOfContentsMapper() {
		super(TEMPLATE_EPACKAGE.getTableOfContents(), STRUCTURE_EPACKAGE.getTableOfContents());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 *
	 * @param documentStructureElement
	 * @param modelElement
	 * @return
	 */
	@Override
	protected Collection<TableOfContents> doMap(final org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents documentStructureElement, final EObject modelElement) {
		final TableOfContents toc = DocumentStructureFactory.eINSTANCE.createTableOfContents();
		toc.setTocTitle(documentStructureElement.getTocTitle());
		return Collections.singleton(toc);
	}

}
