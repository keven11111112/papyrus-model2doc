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

package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.internal.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.gmfdiag.style.PapyrusDiagramStyle;
import org.eclipse.papyrus.infra.gmfdiag.style.StylePackage;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl;

/**
 * Custom Implementation for {@link PapyrusGMFDiagramView}
 */
public class CustomPapyrusGMFDiagramViewImpl extends PapyrusGMFDiagramViewImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.gmf.gmfdocumentstructuretemplate.impl.GMFDiagramViewImpl#getMatchingDiagrams(org.eclipse.emf.ecore.EObject)
	 *
	 * @param expectedDiagramContext
	 * @return
	 */
	@Override
	public EList<Diagram> getMatchingDiagrams(final EObject expectedDiagramContext) {
		final List<Diagram> filteredDiagram = new ArrayList<>();
		ECrossReferenceAdapter crossRef = ECrossReferenceAdapter.getCrossReferenceAdapter(expectedDiagramContext);
		final Collection<Setting> crossReference = crossRef.getNonNavigableInverseReferences(expectedDiagramContext, true);
		for (final Setting set : crossReference) {
			final EObject eobject = set.getEObject();
			switch (this.contextFilterRule) {
			case SEMANTIC_CONTEXT:
				if (false == isSemanticContext(eobject, expectedDiagramContext)) {
					continue;
				}
				break;

			case GRAPHICAL_CONTEXT:
				if (false == isGraphicalContext(eobject, expectedDiagramContext)) {
					continue;
				}
			case BOTH:
				if (false == (isSemanticContext(eobject, expectedDiagramContext) || isGraphicalContext(eobject, expectedDiagramContext))) {
					continue;
				}
				break;
			default:
				// nothing to do
			}

			final Diagram diagram;
			if (eobject instanceof Diagram) {
				diagram = (Diagram) eobject;
			} else if (eobject instanceof PapyrusDiagramStyle) {
				diagram = (Diagram) ((PapyrusDiagramStyle) eobject).eContainer();
			} else {
				// not possible
				continue;
			}
			// we take all diagrams when diagramType is not defined
			// when diagram type is defined, we check
			if (matchDiagramKind(diagram) && matchDiagramType(diagram)) {
				filteredDiagram.add(diagram);
			}
		}

		return ECollections.unmodifiableEList(filteredDiagram);

	}

	/**
	 *
	 * @param eobjec
	 *            an eobject, probably a diagram
	 * @param expectedDiagramContext
	 *            the eobject for which we are looking a diagram
	 * @return
	 *         <code>true</code> if the eobject is used as semantic context for the diagram
	 */
	private boolean isSemanticContext(final EObject eobejct, final EObject expectedSemanticContext) {
		if (eobejct instanceof Diagram) {
			return expectedSemanticContext == ((Diagram) eobejct).getElement();
		}
		return false;
	}

	/**
	 *
	 * @param eobject
	 *            an eobject, probably a {@link PapyrusDiagramStyle}
	 * @param expectedDiagramContext
	 *            the eobject for which we are looking a diagram
	 * @return
	 *         <code>true</code> if eobject is used as graphical owner for the diagram
	 */
	private boolean isGraphicalContext(final EObject eobject, final EObject expectedgraphicalContext) {
		if (eobject instanceof PapyrusDiagramStyle) {
			return expectedgraphicalContext == ((PapyrusDiagramStyle) eobject).getOwner();
		}
		return false;
	}

	/**
	 *
	 * @param diagram
	 *            a diagram
	 * @return
	 *         <code>true</code> when:
	 *         <ul>
	 *         <li>the field diagramType is not defined (<code>null</code> or empty)</li>
	 *         <li>the type of the diagram is equals to the expected one</li>
	 *         </ul>
	 */
	private boolean matchDiagramType(final Diagram diagram) {
		return this.diagramType == null || this.diagramType.isEmpty() || this.diagramType.equals(diagram.getType());
	}

	/**
	 *
	 * @param diagram
	 *            a diagram
	 * @return
	 *         <code>true</code> when the diagram has a {@link PapyrusDiagramStyle} and when:
	 *         <ul>
	 *         <li>the field diagramKindId is <code>null</code> or empty</li>
	 *         <li>the kind of the diagram is equals to the expected one</li>
	 *         </ul>
	 */
	private boolean matchDiagramKind(final Diagram diagram) {
		final PapyrusDiagramStyle style = (PapyrusDiagramStyle) diagram.getStyle(StylePackage.eINSTANCE.getPapyrusDiagramStyle());
		return style != null && (this.diagramType == null || this.diagramType.isEmpty() || this.diagramKindId.equals(style.getDiagramKindId()));
	}


	/**
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#buildTitle()
	 *
	 * @return
	 */
	@Override
	public String buildTitle(final EObject diagramContext) {
		if (hasDiagramKindId() && false == hasDiagramType()) {
			return NLS.bind("{0} diagrams", this.diagramKindId); //$NON-NLS-1$
		} else if (hasDiagramType() && false == hasDiagramKindId()) {
			return NLS.bind("{0} diagrams", this.diagramType); //$NON-NLS-1$
		} else if (hasDiagramKindId() && hasDiagramType()) {
			return NLS.bind("Diagrams of type {0} and kind {1}", this.diagramType, this.diagramKindId); //$NON-NLS-1$
		}
		return "All owned diagrams"; //$NON-NLS-1$
	}

	/**
	 *
	 * @return
	 *         <code>true</code> if a diagramKindId is defined
	 */
	private boolean hasDiagramKindId() {
		return null != this.diagramKindId && false == this.diagramKindId.isEmpty();
	}

	/**
	 *
	 * @return
	 *         <code>true</code> if a diagramType is defined
	 */
	private boolean hasDiagramType() {
		return null != this.diagramType && false == this.diagramType.isEmpty();
	}

}
