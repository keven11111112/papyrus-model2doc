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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.uml.template2structure.internal.mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;
import org.eclipse.papyrus.model2doc.uml.template2structure.Activator;
import org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.uml2.uml.Element;

/**
 * This mapper converts the {@link StereotypePartTemplate} into {@link BodyPart}
 */
public class StereotypePartTemplateMapper extends AbstractUMLTemplateToStructureMapper<StereotypePartTemplate> {

	/**
	 *
	 * Constructor.
	 *
	 */
	public StereotypePartTemplateMapper() {
		super(TEMPLATE_EPACKAGE.getStereotypePartTemplate(), BodyPart.class);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper#doMap(org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject,
	 *      java.lang.Class)
	 *
	 * @param mappingService
	 * @param stereotypePartTemplate
	 * @param semanticModelElement
	 * @param expectedReturnedClass
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final StereotypePartTemplate stereotypePartTemplate, final EObject semanticModelElement, final Class<T> expectedReturnedClass) {
		if (false == semanticModelElement instanceof Element || false == stereotypePartTemplate.isMatchingFilterRule(semanticModelElement)) {
			return Collections.emptyList();
		}
		Title title = null;
		List<T> returnedElements = new ArrayList<>();
		if (stereotypePartTemplate.isGenerate()) {
			if (stereotypePartTemplate.isGenerateTitle()) {
				title = STRUCTURE_EFACTORY.createTitle();
				title.setTitle(getSectionTitle(stereotypePartTemplate, semanticModelElement));
				returnedElements.add(expectedReturnedClass.cast(title));
			}
		}

		final EObject stereotypeApplication = stereotypePartTemplate.getFirstMatchingStereotypeApplication(semanticModelElement);

		final Iterator<IBodyPartTemplate> bodyPart = stereotypePartTemplate.getBodyPartTemplate().iterator();
		while (bodyPart.hasNext()) {
			final IBodyPartTemplate currentFeature = bodyPart.next();
			final Collection<BodyPart> result;
			if (currentFeature instanceof StereotypePropertyReferencePartTemplate) {
				if (null == stereotypeApplication) {
					result = Collections.emptyList();
				} else {
					result = mappingService.map(currentFeature, stereotypeApplication, BodyPart.class);
				}
			} else {
				result = mappingService.map(currentFeature, semanticModelElement, BodyPart.class);
			}
			if (result == null) {
				continue;
			}
			if (title != null) {
				title.getSubBodyPart().addAll(result);
			} else {
				// ensure the cast
				result.stream().forEach(a -> returnedElements.add(expectedReturnedClass.cast(a)));
			}

		}
		return returnedElements;
	}




	protected String getSectionTitle(final StereotypePartTemplate partTemplate, EObject context) {// TODO in an upper class
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
		final EStructuralFeature feature = eclass.getEStructuralFeature("name"); //$NON-NLS-1$
		if (feature instanceof EAttribute) {
			final Object result = eobject.eGet(feature);
			if (result instanceof String) {
				return (String) result;
			}
		}
		Activator.log.warn(NLS.bind("No label found for {0}", eobject)); //$NON-NLS-1$
		return "No Label"; //$NON-NLS-1$
	}

}
