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

import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView;
import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.impl.GMFDocumentStructureTemplateFactoryImpl;

/**
 * Custom factory for GMF DocumentStructureTemplate elements
 */
public class CustomGMFDocumentStructureTemplateFactoryImpl extends GMFDocumentStructureTemplateFactoryImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.gmf.gmfdocumentstructuretemplate.impl.GmfDocumentStructureTemplateFactoryImpl#createGMFDiagramView()
	 *
	 * @return
	 */
	@Override
	public GMFDiagramView createGMFDiagramView() {
		return new CustomGMFDiagramViewImpl();
	}
}
