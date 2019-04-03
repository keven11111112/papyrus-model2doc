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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.TemplateToStructureMappingService;

/**
 *
 */
public class EClassMapper extends AbstractEMFTemplateToStructureMapper<EClassPartTemplate, BodyPart> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputEClass
	 */
	public EClassMapper() {
		super(TEMPLATE_EPACKAGE.getEClassPartTemplate(), STRUCTURE_EPACKAGE.getBodyPart());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 *
	 * @param eClassPartTemplate
	 * @param semanticModelElement
	 * @return
	 */
	@Override
	protected Collection<BodyPart> doMap(final EClassPartTemplate eClassPartTemplate, final EObject semanticModelElement) {
		if (false == eClassPartTemplate.isMatchingFilterRule(semanticModelElement)) {
			return Collections.emptyList();
		}
		Title title = null;
		Collection<BodyPart> returnedElements = new ArrayList<>();
		if (eClassPartTemplate.isGenerate()) {
			if (eClassPartTemplate.isGenerateTitle()) {
				title = STRUCTURE_EFACTORY.createTitle();
				title.setTitle(getSectionTitle(eClassPartTemplate, semanticModelElement));
				if (title.getTitle().equals("owner")) {
					int i = 0;
					i++;
				}
				returnedElements.add(title);
			}
		}
		final Iterator<IBodyPartTemplate> bodyPart = eClassPartTemplate.getBodyPartTemplate().iterator();
		while (bodyPart.hasNext()) {
			final IBodyPartTemplate currentFeature = bodyPart.next();
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
		return returnedElements;
	}

	protected String getSectionTitle(final EClassPartTemplate partTemplate, EObject context) {// TODO in an upper class
		if (partTemplate.isGenerateTitle()) {
			final String customTitle = partTemplate.getCustomTitle();
			return (null == customTitle || customTitle.isEmpty()) ? getLabel(context) : customTitle;

		}

		return null;
	}

	// TODO : the label provider must be foudn using EMF Adapter
	// TODO : the label provider must be a parameter of the mapping method, to allow Papyrus internationalization
	protected String getLabel(final EObject eobject) { // TODO : factorize me
		final EClass eclass = eobject.eClass();
		final EStructuralFeature feature = eclass.getEStructuralFeature("name");
		if (feature instanceof EAttribute) {
			final Object result = eobject.eGet(feature);
			if (result instanceof String) {
				return (String) result;
			}
		}
		Activator.log.warn(NLS.bind("No label found for {0}", eobject));
		return "No Label";

	}
}
