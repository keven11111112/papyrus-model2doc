/*****************************************************************************
 * Copyright (c) 2020, 2021 CEA LIST and others.
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

package org.eclipse.papyrus.model2doc.uml.template2structure.internal.mappers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractBodyPartTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttributeAsParagraph;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;
import org.eclipse.uml2.uml.Element;

/**
 * This mapper converts the StereotypePropertyAttributeAsParagraph into {@link Paragraph}
 */
public class StereotypePropertyAttributeAsParagraphMapper extends AbstractBodyPartTemplateToStructureMapper<StereotypePropertyAttributeAsParagraph> {

	private static final String EMPTY_STRING = ""; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputClass
	 */
	public StereotypePropertyAttributeAsParagraphMapper() {
		super(UMLDocumentStructureTemplatePackage.eINSTANCE.getStereotypePropertyAttributeAsParagraph(), BodyPart.class);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper#doMap(org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject,
	 *      java.lang.Class)
	 *
	 * @param <T>
	 * @param mappingService
	 * @param documentTemplateElement
	 * @param semanticModelElement
	 * @param expectedReturnedClass
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(IMappingService mappingService, StereotypePropertyAttributeAsParagraph documentTemplateElement, EObject semanticModelElement, Class<T> expectedReturnedClass) {
		if (false == documentTemplateElement.generateBranch(semanticModelElement)) {
			return Collections.emptyList();
		}
		if (false == documentTemplateElement.isGenerate() || false == semanticModelElement instanceof Element) {
			// This element can't have children, so if isGenerate() returns false, we go out!
			return Collections.emptyList();
		}
		final List<T> returnedValue = new ArrayList<>();

		final Iterator<Object> commentIter = documentTemplateElement.getStereotypePropertyValues(semanticModelElement).iterator();
		while (commentIter.hasNext()) {
			final Paragraph paragraph = STRUCTURE_EFACTORY.createParagraph();
			Object value = commentIter.next();
			if (value == null) {
				value = EMPTY_STRING;
			}
			paragraph.setText(value.toString());
			returnedValue.add(expectedReturnedClass.cast(paragraph));
		}
		return buildMapperResult(documentTemplateElement, semanticModelElement, expectedReturnedClass, returnedValue);
	}

}
