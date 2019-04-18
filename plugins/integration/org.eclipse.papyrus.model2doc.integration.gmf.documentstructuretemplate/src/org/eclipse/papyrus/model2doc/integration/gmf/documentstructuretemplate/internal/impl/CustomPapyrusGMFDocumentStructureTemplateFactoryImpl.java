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

package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.internal.impl;

import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDocumentStructureTemplateFactoryImpl;

/**
 * Custom factory for the metamodel PapyrusGMFDocumentStructureTemplate
 */
public class CustomPapyrusGMFDocumentStructureTemplateFactoryImpl extends PapyrusGMFDocumentStructureTemplateFactoryImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDocumentStructureTemplateFactoryImpl#createPapyrusGMFDiagramView()
	 *
	 * @return
	 */
	@Override
	public PapyrusGMFDiagramView createPapyrusGMFDiagramView() {
		return new CustomPapyrusGMFDiagramViewImpl();
	}
}
