/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
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
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EAttributeAsParagraph;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * This mapper is in charge to create {@link Paragraph} from EAttribute values
 */
public class EAttributeAsParagraphMapper extends AbstractEMFTemplateToStructureMapper<EAttributeAsParagraph> {

	private static final String EMPTY_STRING = ""; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputClass
	 */
	public EAttributeAsParagraphMapper() {
		super(TEMPLATE_EPACKAGE.getEAttributeAsParagraph(), BodyPart.class);
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
	protected <T> List<T> doMap(final IMappingService mappingService, final EAttributeAsParagraph documentTemplateElement, final EObject semanticModelElement, Class<T> expectedReturnedClass) {
		if (false == documentTemplateElement.generateBranch(semanticModelElement)) {
			return Collections.emptyList();
		}
		if (false == documentTemplateElement.isGenerate() || false == semanticModelElement instanceof EObject) {
			// This element can't have children, so if isGenerate() returns false, we go out!
			return Collections.emptyList();
		}

		final Iterator<Object> eAttributeValuesIter = documentTemplateElement.getEAttributeValues(semanticModelElement).iterator();
		Title title = null;
		List<T> returnedElements = new ArrayList<>();
		if (eAttributeValuesIter.hasNext() && documentTemplateElement.isGenerateTitle()) {
			title = STRUCTURE_EFACTORY.createTitle();
			title.setTitle(documentTemplateElement.buildPartTemplateTitle(semanticModelElement));
			returnedElements.add(expectedReturnedClass.cast(title));
		}

		while (eAttributeValuesIter.hasNext()) {
			final Paragraph paragraph = STRUCTURE_EFACTORY.createParagraph();
			Object value = eAttributeValuesIter.next();
			if (value == null) {
				value = EMPTY_STRING;
			}
			paragraph.setText(value.toString());
			if (null == title) {
				returnedElements.add(expectedReturnedClass.cast(paragraph));
			} else {
				title.getSubBodyParts().add(paragraph);
			}
		}

		return returnedElements;
	}

}
