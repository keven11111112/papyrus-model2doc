/*****************************************************************************
 * Copyright (c) 2021 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.mapping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;

/**
 * Abstract class for all mappers whose parameter extends IBodySectionPartTemplate.
 */
public abstract class AbstractBodyPartTemplateToStructureMapper<INPUT extends IBodySectionPartTemplate> extends AbstractTemplateToStructureMapper<INPUT> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputClass
	 */
	public <T> AbstractBodyPartTemplateToStructureMapper(EClass inputEClass, Class<T> outputClass) {
		super(inputEClass, outputClass);
	}

	/**
	 * This method build a tree using the title if necessary, manage the generation if the generatedElements list is empty
	 *
	 * @param <T>
	 * @param documentTemplateElement
	 *            the documentTemplateElement
	 * @param semanticModelElement
	 *            the semantic element
	 * @param expectedReturnedClass
	 *            the expected returned class
	 * @param generatedElements
	 *            the list of generated element to add to the tree
	 * @return the list of expectedReturnedClass elements
	 */
	protected <T> List<T> buildMapperResult(final INPUT documentTemplateElement, final EObject semanticModelElement, final Class<T> expectedReturnedClass, final List<T> generatedElements) {
		List<T> returnedElements = new ArrayList<>();

		// we generate something for this step itself
		if (documentTemplateElement.isGenerate()) {
			final Title title;

			// we generate title if required
			if (documentTemplateElement.isGenerateTitle()) {
				title = STRUCTURE_EFACTORY.createTitle();
				title.setTitle(documentTemplateElement.buildPartTemplateTitle(semanticModelElement));
				returnedElements.add(expectedReturnedClass.cast(title));
			} else {
				title = null;
			}

			// we generate an empty paragraph if the contents is empty and if it is required
			if (generatedElements.isEmpty() && documentTemplateElement.isGenerateIfEmpty()) {
				final Paragraph paragraph = STRUCTURE_EFACTORY.createParagraph();
				paragraph.setText(documentTemplateElement.getDefaultTextIfEmpty());
				if (title != null) {
					title.getSubBodyParts().add(paragraph);
				} else {
					returnedElements.add(expectedReturnedClass.cast(paragraph));
				}
			} else {
				// the contents was not empty
				if (title != null) {
					generatedElements.forEach(ge -> title.getSubBodyParts().add((BodyPart) ge));
				} else {
					returnedElements.addAll(generatedElements);
				}
			}
		} else {
			// we generate nothing for the current step it self
			returnedElements.addAll(generatedElements);
		}
		return returnedElements;
	}
}
