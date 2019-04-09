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

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * This class is in charge of the creation of the document structure following the description of the document structure template model
 * We must create a new service instance for each new mapping process, in order to be able to detect infinite loop
 *
 * TODO : implements infinite loop detection
 */
public final class TemplateToStructureMappingService implements IMappingService {

	/**
	 * The registered mappers
	 */
	private final List<AbstractTemplateToStructureMapper<?>> mappers;

	/**
	 *
	 * Constructor.
	 *
	 * @param mappers
	 *            the mappers to use for this service instance
	 */
	public TemplateToStructureMappingService(final List<AbstractTemplateToStructureMapper<?>> mappers) {
		this.mappers = mappers;
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
	private AbstractTemplateToStructureMapper<?> getContributorFor(final EObject documentTemplateElement, final Class<?> expectedReturnedEClass) {
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
	private AbstractTemplateToStructureMapper<?> getContributorFor(final EClass eClassTemplateElement, final Class<?> expectedReturnedEClass) {
		AbstractTemplateToStructureMapper<?> contributor = null;
		final ListIterator<AbstractTemplateToStructureMapper<?>> iter = this.mappers.listIterator();
		while (iter.hasNext() && contributor == null) {
			final AbstractTemplateToStructureMapper<?> current = iter.next();
			if (current.handlesInput(eClassTemplateElement) && current.handlesExpectedOutput(expectedReturnedEClass)) {
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
	 * @param semanticModelElement
	 *            an element of the user model
	 * @param expectedReturnedClass
	 *            the expected EClass for the result of the mapping
	 * @return
	 * 		the collection of created object answering to the mapping request
	 */
	@Override
	public <T> List<T> map(final EObject documentTemplateElement, final EObject semanticModelElement, final Class<T> expectedReturnedClass) {
		AbstractTemplateToStructureMapper<?> contributor = getContributorFor(documentTemplateElement, expectedReturnedClass);
		List<T> result = null;
		if (null != contributor) {
			result = contributor.map(this, documentTemplateElement, semanticModelElement, expectedReturnedClass);
		}
		if (null == result) {
			Activator.log.info(NLS.bind("Mapping failed for input {0} and output {1}.", documentTemplateElement, expectedReturnedClass)); //$NON-NLS-1$
			result = Collections.emptyList();
		}
		return result;

	}
}
