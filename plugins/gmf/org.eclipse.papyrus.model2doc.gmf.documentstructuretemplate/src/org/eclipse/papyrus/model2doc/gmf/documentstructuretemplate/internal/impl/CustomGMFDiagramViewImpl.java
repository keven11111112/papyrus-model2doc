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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.internal.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView;
import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDiagramViewImpl;

/**
 * Custom implementation for {@link GMFDiagramView}
 */
public class CustomGMFDiagramViewImpl extends GMFDiagramViewImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.gmf.gmfdocumentstructuretemplate.impl.GMFDiagramViewImpl#getMatchingDiagrams(org.eclipse.emf.ecore.EObject)
	 *
	 * @param expectedDiagramContext
	 * @return
	 */
	@Override
	public EList<Diagram> getMatchingDiagrams(final EObject expectedDiagramContext) {
		final List<Diagram> diagrams = new ArrayList<>();
		ECrossReferenceAdapter crossRef = ECrossReferenceAdapter.getCrossReferenceAdapter(expectedDiagramContext);
		final Collection<Setting> crossReference = crossRef.getNonNavigableInverseReferences(expectedDiagramContext, true);
		for (final Setting set : crossReference) {
			final EObject eobject = set.getEObject();
			if (eobject instanceof Diagram) {
				final Diagram currentDiagram = (Diagram) eobject;
				if (currentDiagram.getElement() != expectedDiagramContext) {
					continue;
				}
				// we take all diagrams when diagramType is not defined
				// when diagram type is defined, we check
				if (this.diagramType == null || this.diagramType.isEmpty() || this.diagramType.equals(currentDiagram.getType())) {
					diagrams.add(currentDiagram);
				}
			}
		}
		return ECollections.unmodifiableEList(diagrams);
	}

}
