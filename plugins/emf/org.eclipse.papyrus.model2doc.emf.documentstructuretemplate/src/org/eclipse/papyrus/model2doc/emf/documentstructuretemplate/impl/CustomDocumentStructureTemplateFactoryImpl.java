/**
 * Copyright (c) 2019 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;

public class CustomDocumentStructureTemplateFactoryImpl extends DocumentStructureTemplateFactoryImpl {

	public CustomDocumentStructureTemplateFactoryImpl() {
		// nothing to do
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplateFactoryImpl#createTextDocumentTemplate()
	 *
	 * @return
	 */
	@Override
	public TextDocumentTemplate createTextDocumentTemplate() {
		return new CustomTextDocumentTemplateImpl();
	}


	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplateFactoryImpl#createEClassDocumentPartTemplate()
	 *
	 * @return
	 */
	@Override
	public EClassPartTemplateImpl createEClassPartTemplate() {
		return new CustomEClassPartTemplateImpl();
	}

}
