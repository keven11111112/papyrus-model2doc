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
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.FeaturePartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.TemplateToStructureMappingService;

/**
 * @author VL222926
 *
 */
public class EClassMapper extends AbstractEMFTemplateToStructureMapper<EClassDocumentPartTemplate, BodyPart> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputEClass
	 */
	public EClassMapper() {
		super(TEMPLATE_EPACKAGE.getEClassDocumentPartTemplate(), STRUCTURE_EPACKAGE.getBodyPart());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 *
	 * @param documentTemplateElement
	 * @param semanticModelElement
	 * @return
	 */
	@Override
	protected Collection<BodyPart> doMap(final EClassDocumentPartTemplate documentTemplateElement, final EObject semanticModelElement) {
		if (false == documentTemplateElement.isMatchingFilterRule(semanticModelElement)) {
			return Collections.emptyList();
		}

		// TODO add the possibility to define a main title for the section created with this EClassDocumentPartTemplate ?
		Collection<BodyPart> returnedElements = new ArrayList<>();
		if (documentTemplateElement.isGenerate()) {
			boolean generateTitle = documentTemplateElement.isGenerateTitle();
			Title title = null;
			if (generateTitle) {
				title = STRUCTURE_EFACTORY.createTitle();
				// TODO search emf label provider for that
				final EStructuralFeature feature = semanticModelElement.eClass().getEStructuralFeature("name");
				if (null != feature) {
					title.setTitle((String) semanticModelElement.eGet(feature));
				} else {
					title.setTitle("no name");
				}
				returnedElements.add(title);
			}

			final Iterator<FeaturePartTemplate> featureIterator = documentTemplateElement.getFeaturePartTemplates().iterator();
			while (featureIterator.hasNext()) {
				final FeaturePartTemplate currentFeature = featureIterator.next();
				final Collection<EObject> result = TemplateToStructureMappingService.INSTANCE.map(currentFeature, semanticModelElement, STRUCTURE_EPACKAGE.getBodyPart());
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
		return returnedElements;
	}
}
