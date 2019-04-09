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

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

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
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 *
 * This class ensures the transformation of the {@link EClassPartTemplate} into a {@link BodyPart} ({@link Title}) and delegate the mapping of the {@link EClassPartTemplate} subelements.
 */
public class EClassPartTemplateMapper extends AbstractEMFTemplateToStructureMapper<EClassPartTemplate> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputEClass
	 */
	public EClassPartTemplateMapper() {
		super(TEMPLATE_EPACKAGE.getEClassPartTemplate(), BodyPart.class);
	}

	/**
	 * @param semanticModelElement
	 * @param eClassPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, Class<T>)
	 *
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final EClassPartTemplate eClassPartTemplate, final EObject semanticModelElement, Class<T> expectedReturnedClass) {
		if (false == eClassPartTemplate.isMatchingFilterRule(semanticModelElement)) {
			return Collections.emptyList();
		}
		Title title = null;
		List<T> returnedElements = new ArrayList<>();
		if (eClassPartTemplate.isGenerate()) {
			if (eClassPartTemplate.isGenerateTitle()) {
				title = STRUCTURE_EFACTORY.createTitle();
				title.setTitle(getSectionTitle(eClassPartTemplate, semanticModelElement));
				returnedElements.add(expectedReturnedClass.cast(title));
			}
		}
		final Iterator<IBodyPartTemplate> bodyPart = eClassPartTemplate.getBodyPartTemplate().iterator();
		while (bodyPart.hasNext()) {
			final IBodyPartTemplate currentFeature = bodyPart.next();
			final Collection<BodyPart> result = mappingService.map(currentFeature, semanticModelElement, BodyPart.class);
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
