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

package org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping.BodyMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping.EClassMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping.EStructuralFeatureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping.TableOfContentsMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping.TextDocumentTemplateTemplateToTextDocumentMapper;

/**
 * This class is in charge of the creation of the document structure following the description of the document structure template model
 */
public class TemplateToStructureMappingService {

	private LinkedList<AbtractTemplateToStructureMapper<?, ?>> allContributors = new LinkedList<>();

	/**
	 * the static instance of this mapping service
	 */
	public static final TemplateToStructureMappingService INSTANCE = new TemplateToStructureMappingService();

	/**
	 *
	 * Constructor.
	 *
	 */
	private TemplateToStructureMappingService() {
		allContributors.add(new TextDocumentTemplateTemplateToTextDocumentMapper());
		allContributors.add(new BodyMapper());
		allContributors.add(new TableOfContentsMapper());
		allContributors.add(new EClassMapper());
		allContributors.add(new EStructuralFeatureMapper());
	}

	/**
	 *
	 * @param documentTemplateElement
	 *            the input element
	 * @param expectedReturnedEClass
	 *            the expected EClass for the result of the mapping
	 * @return
	 * 		the contributor answering to this mapping, or <code>null</code> when not found
	 */
	private AbtractTemplateToStructureMapper<?, ?> getContributorFor(final EObject documentTemplateElement, final EClass expectedReturnedEClass) {
		return getContributorFor(documentTemplateElement.eClass(), expectedReturnedEClass);
	}

	/**
	 *
	 * @param eClassTemplateElement
	 *            the input EClass t
	 * @param expectedReturnedEClass
	 *            the expected EClass for the result of the mapping
	 * @return
	 * 		the contributor answering to this mapping, or <code>null</code> when not found
	 */
	private AbtractTemplateToStructureMapper<?, ?> getContributorFor(final EClass eClassTemplateElement, final EClass expectedReturnedEClass) {
		AbtractTemplateToStructureMapper<?, ?> contributor = null;
		final ListIterator<AbtractTemplateToStructureMapper<?, ?>> iter = this.allContributors.listIterator();
		while (iter.hasNext() && contributor == null) {
			final AbtractTemplateToStructureMapper<?, ?> current = iter.next();
			if (current.handlesInput(eClassTemplateElement) && current.handlesExpectedOuput(expectedReturnedEClass)) {
				contributor = current;
			}
		}
		if (null == contributor) {
			Activator.log.info(NLS.bind("No Mapper found for input {0} and output {1}.", eClassTemplateElement, expectedReturnedEClass)); //$NON-NLS-1$
		}
		return contributor;
	}

	/**
	 *
	 * @param documentTemplateElement
	 *            the input element
	 *
	 * @param semanticModelElement
	 *            an element of the user model
	 * @param expectedReturnedEClass
	 *            the expected EClass for the result of the mapping
	 *
	 * @return
	 * 		the collection of created object answering to the mapping request
	 */
	public Collection<EObject> map(final EObject documentTemplateElement, final EObject semanticModelElement, final EClass expectedReturnedEClass) {
		AbtractTemplateToStructureMapper<?, ?> contributor = getContributorFor(documentTemplateElement, expectedReturnedEClass);
		Collection<EObject> result = null;
		if (null != contributor) {
			result = contributor.map(documentTemplateElement, semanticModelElement, expectedReturnedEClass);
		}
		if (null == result) {
			Activator.log.info(NLS.bind("Mapping failed for input {0} and output {1}.", documentTemplateElement, expectedReturnedEClass)); //$NON-NLS-1$

		}
		return result;

	}
}
