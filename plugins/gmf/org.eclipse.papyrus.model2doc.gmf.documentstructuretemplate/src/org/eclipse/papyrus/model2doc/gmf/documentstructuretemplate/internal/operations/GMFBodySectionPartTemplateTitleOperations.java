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

package org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.internal.operations;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations.BodySectionPartTemplateTitleOperations;
import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView;


/**
 * This class provides the operation for title calculus of elements for the GMFDiagramDocumentStructureTemplate metamodel
 */
public class GMFBodySectionPartTemplateTitleOperations extends BodySectionPartTemplateTitleOperations {

	/**
	 * Singleton of this class
	 */
	public static final GMFBodySectionPartTemplateTitleOperations GMF_INSTANCE = new GMFBodySectionPartTemplateTitleOperations();

	/**
	 *
	 * Constructor.
	 * protected to allow to extend this class if required
	 */
	protected GMFBodySectionPartTemplateTitleOperations() {
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
	public final String buildPartTemplateTitle(final GMFDiagramView diagramView, final EObject context) {
		final String customTitle = diagramView.getCustomTitle();
		if (null != customTitle && false == customTitle.isEmpty()) {
			return customTitle;
		}
		final String diagramType = diagramView.getDiagramType();
		if (diagramType == null || diagramType.isEmpty()) {
			return "All Diagrams"; //$NON-NLS-1$
		} else {
			return NLS.bind("All owned {0} diagrams", diagramType); //$NON-NLS-1$
		}
	}
}
