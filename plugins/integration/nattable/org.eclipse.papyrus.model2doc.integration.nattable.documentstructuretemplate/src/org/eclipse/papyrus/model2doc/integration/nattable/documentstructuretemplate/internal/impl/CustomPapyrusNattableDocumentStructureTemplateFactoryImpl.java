/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.internal.impl;

import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplateFactoryImpl;

/**
 * Custom factory for metamodel PapyrusNattableDocumentStructureTemplateFactory
 */
public class CustomPapyrusNattableDocumentStructureTemplateFactoryImpl extends PapyrusNattableDocumentStructureTemplateFactoryImpl {


	/**
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusNattableDocumentStructureTemplateFactoryImpl#createPapyrusTableView()
	 *
	 * @return
	 */
	@Override
	public PapyrusTableView createPapyrusTableView() {
		return new CustomPapyrusTableViewImpl();
	}
}
