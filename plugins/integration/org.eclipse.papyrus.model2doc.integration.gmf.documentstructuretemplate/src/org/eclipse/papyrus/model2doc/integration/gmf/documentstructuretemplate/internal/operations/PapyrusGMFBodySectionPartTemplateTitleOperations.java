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

package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.internal.operations;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations.BodySectionPartTemplateTitleOperations;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView;


/**
 * This class provides the operation for title calculus of elements for the PapyrusGMFDiagramDocumentStructureTemplate metamodel
 */
public class PapyrusGMFBodySectionPartTemplateTitleOperations extends BodySectionPartTemplateTitleOperations {

	/**
	 * Singleton of this class
	 */
	public static final PapyrusGMFBodySectionPartTemplateTitleOperations PAPYRUS_GMF_INSTANCE = new PapyrusGMFBodySectionPartTemplateTitleOperations();

	/**
	 *
	 * Constructor.
	 * protected to allow to extend this class if required
	 */
	protected PapyrusGMFBodySectionPartTemplateTitleOperations() {
		// nothing to do
	}


	/**
	 *
	 * @param diagramView
	 *            the diagram view
	 * @param context
	 *            the context to use to create the title for the diagram
	 * @return
	 *         the title to use
	 */
	public final String buildPartTemplateTitle(final PapyrusGMFDiagramView diagramView, final EObject context) {
		final String customTitle = diagramView.getCustomTitle();
		if (null != customTitle && false == customTitle.isEmpty()) {
			return customTitle;
		}
		final String diagramType = diagramView.getDiagramType();
		final String diagramKindId = diagramView.getDiagramKindId();
		if (hasDiagramKindId(diagramView) && false == hasDiagramType(diagramView)) {
			return NLS.bind("{0} diagrams", diagramKindId); //$NON-NLS-1$
		} else if (hasDiagramType(diagramView) && false == hasDiagramKindId(diagramView)) {
			return NLS.bind("{0} diagrams", diagramType); //$NON-NLS-1$
		} else if (hasDiagramKindId(diagramView) && hasDiagramType(diagramView)) {
			return NLS.bind("Diagrams of type {0} and kind {1}", diagramType, diagramKindId); //$NON-NLS-1$
		}
		return "All owned diagrams"; //$NON-NLS-1$
	}

	/**
	 * @param diagramView
	 *            a diagram view
	 * @return
	 *         <code>true</code> if a diagramKindId is defined
	 */
	private static final boolean hasDiagramKindId(final PapyrusGMFDiagramView diagramView) {
		final String diagramKindId = diagramView.getDiagramKindId();
		return null != diagramKindId && false == diagramKindId.isEmpty();
	}

	/**
	 * @param diagramView
	 *            a diagram view
	 *
	 * @return
	 *         <code>true</code> if a diagramType is defined
	 */
	private static final boolean hasDiagramType(final PapyrusGMFDiagramView diagramView) {
		final String diagramType = diagramView.getDiagramKindId();
		return null != diagramType && false == diagramType.isEmpty();
	}
}
