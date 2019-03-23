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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ObjectPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.TemplateToStructureMappingService;

/**
 * @author VL222926
 *
 */
public class EStructuralFeatureMapper extends AbstractEMFTemplateToStructureMapper<EStructuralFeatureDocumentPartTemplate, BodyPart> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputEClass
	 */
	public EStructuralFeatureMapper() {
		super(TEMPLATE_EPACKAGE.getEStructuralFeatureDocumentPartTemplate(), STRUCTURE_EPACKAGE.getBodyPart());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 *
	 * @param documentTemplateElement
	 * @param semanticModelElement
	 * @return
	 */
	@Override
	protected Collection<BodyPart> doMap(final EStructuralFeatureDocumentPartTemplate documentTemplateElement, final EObject semanticModelElement) {
		Collection<BodyPart> returnedElements = new ArrayList<>();

		final Collection<EObject> matchingElements = getMatchingElement(documentTemplateElement, semanticModelElement);
		if (matchingElements.isEmpty()) {
			return null;
		}
		if (documentTemplateElement.isGenerate()) {
			final Iterator<EObject> iter = matchingElements.iterator();
			while (iter.hasNext()) {
				final EObject current = iter.next();
				final boolean generateTitle = documentTemplateElement.isGenerateTitle();
				Title title = null;
				if (generateTitle) {
					title = STRUCTURE_EFACTORY.createTitle();
					// TODO search emf label provider for that

					// here, the title is the feature name
					title.setTitle(documentTemplateElement.getFeature().getName());
					returnedElements.add(title);
				}

				final Iterator<ObjectPartTemplate> objectPartTemplateIter = documentTemplateElement.getObjectPartTemplates().iterator();
				while (objectPartTemplateIter.hasNext()) {
					final ObjectPartTemplate currentObjectPartTemplate = objectPartTemplateIter.next();
					final Collection<EObject> result = TemplateToStructureMappingService.INSTANCE.map(currentObjectPartTemplate, current, STRUCTURE_EPACKAGE.getBodyPart());
					if (result == null) {
						continue;
					}
					if (title != null) {
						title.getSubBodyPart().addAll((Collection<? extends BodyPart>) result);
					} else {
						returnedElements.addAll((Collection<? extends BodyPart>) result);
					}
				}
			}
		}
		return returnedElements;
	}




	protected Collection<EObject> getMatchingElement(final EStructuralFeatureDocumentPartTemplate documentTemplateElement, final EObject semanticModelElement) {
		final List<EObject> elements = new ArrayList<>();
		final EStructuralFeature feature = documentTemplateElement.getFeature();
		if (feature.getEType() instanceof EObject) {
			if (feature.isMany()) {
				elements.addAll((Collection<EObject>) semanticModelElement.eGet(documentTemplateElement.getFeature()));
			} else {
				elements.add((EObject) semanticModelElement.eGet(documentTemplateElement.getFeature()));
			}
		}
		final ListIterator<EObject> iter = elements.listIterator();

		while (iter.hasNext()) {
			Iterator<ObjectPartTemplate> objectPartIter = documentTemplateElement.getObjectPartTemplates().iterator();
			boolean matching = false;
			while (objectPartIter.hasNext() && matching == false) {
				final EObject current = iter.next();
				matching = objectPartIter.next().isMatchingFilterRule(current);
			}
			if (false == matching) {
				iter.remove();
			}
		}
		return elements;
	}

}
