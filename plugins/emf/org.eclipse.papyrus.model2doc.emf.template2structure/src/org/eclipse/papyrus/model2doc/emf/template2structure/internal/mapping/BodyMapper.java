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
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ObjectPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.TemplateToStructureMappingService;

/**
 *
 *
 */
public class BodyMapper extends AbstractEMFTemplateToStructureMapper<Body, org.eclipse.papyrus.model2doc.emf.documentstructure.Body> {


	public BodyMapper() {
		super(TEMPLATE_EPACKAGE.getBody(), STRUCTURE_EPACKAGE.getBody());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 *
	 * @param documentStructureElement
	 * @param modelElement
	 * @return
	 */
	@Override
	protected Collection<org.eclipse.papyrus.model2doc.emf.documentstructure.Body> doMap(final Body documentStructureElement, final EObject modelElement) {
		final org.eclipse.papyrus.model2doc.emf.documentstructure.Body body = STRUCTURE_EFACTORY.createBody();
		for (final ObjectPartTemplate current : documentStructureElement.getObjectPartTemplate()) {
			final Iterator<EObject> iter = modelElement.eContents().iterator();
			while (iter.hasNext()) {
				final EObject currentEObject = iter.next();
				if (current.isMatchingFilterRule(currentEObject)) {
					final Collection<EObject> result = TemplateToStructureMappingService.INSTANCE.map(current, currentEObject, STRUCTURE_EPACKAGE.getBodyPart());
					if (null != result) {
						body.getBodyPart().addAll((Collection<? extends BodyPart>) result);
					}
				}
			}
		}
		return Collections.singleton(body);
	}

}
