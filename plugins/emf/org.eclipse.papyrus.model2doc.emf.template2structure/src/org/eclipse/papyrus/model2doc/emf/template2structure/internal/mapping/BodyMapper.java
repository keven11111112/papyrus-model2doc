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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * This class create the DocumentStructure Body for the DocumentStructureTempate Body
 *
 */
public class BodyMapper extends AbstractEMFTemplateToStructureMapper<Body> {

	/**
	 *
	 * Constructor.
	 *
	 */
	public BodyMapper() {
		super(TEMPLATE_EPACKAGE.getBody(), org.eclipse.papyrus.model2doc.emf.documentstructure.Body.class);
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
	protected <T> List<T> doMap(final IMappingService mappingService, final Body documentStructureElement, final EObject modelElement, Class<T> expectedReturnedClass) {
		final org.eclipse.papyrus.model2doc.emf.documentstructure.Body body = STRUCTURE_EFACTORY.createBody();
		final Iterator<IBodyPartTemplate> iter = documentStructureElement.getBodyPartTemplate().iterator();
		while (iter.hasNext()) {
			final IBodyPartTemplate currentBodyPartTemplate = iter.next();
			final Collection<BodyPart> result = mappingService.map(currentBodyPartTemplate, modelElement, BodyPart.class);
			body.getBodyPart().addAll(result);
		}
		return Collections.singletonList(expectedReturnedClass.cast(body));
	}

}
