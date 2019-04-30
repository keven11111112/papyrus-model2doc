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

package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.providers;

import org.eclipse.papyrus.infra.gmfdiag.representation.PapyrusDiagram;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.providers.DelegatingToEMFLabelProvider;

/**
 *
 */
public class PapyrusDiagramTypeLabelProvider extends DelegatingToEMFLabelProvider {

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.providers.DelegatingToEMFLabelProvider#getText(java.lang.Object)
	 *
	 * @param element
	 * @return
	 */
	@Override
	public String getText(final Object element) {
		if (element instanceof PapyrusDiagram) {
			final StringBuilder builder = new StringBuilder();
			final String diagramType = ((PapyrusDiagram) element).getImplementationID();
			builder.append(diagramType);
			builder.append(FIELD_LABEL_SEPARATOR);
			builder.append("(kind Id= "); //$NON-NLS-1$
			builder.append(((PapyrusDiagram) element).getId());
			builder.append(")"); //$NON-NLS-1$
			return builder.toString();
		}
		return super.getText(element);
	}
}
