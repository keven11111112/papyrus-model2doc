/*****************************************************************************
 * Copyright (c) 2019, 2021 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 * 	Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Bug 570133
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * This class ensures the transformation of the {@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents} into a {@link BodyPart} ({@link TableOfContents})
 */
public class TableOfContentsMapper extends AbstractTemplateToStructureMapper<org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents> {

	/**
	 *
	 * Constructor.
	 *
	 */
	public TableOfContentsMapper() {
		super(DocumentStructureTemplatePackage.eINSTANCE.getTableOfContents(), TableOfContents.class);
	}

	/**
	 * @param mappingService
	 * @param documentStructureElement
	 * @param modelElement
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, Class<T>)
	 *
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents documentStructureElement, final EObject modelElement, Class<T> expectedReturnedClass) {
		final TableOfContents toc = DocumentStructureFactory.eINSTANCE.createTableOfContents();
		toc.setTocTitle(documentStructureElement.getTocTitle());
		return Collections.singletonList(expectedReturnedClass.cast(toc));
	}

}
