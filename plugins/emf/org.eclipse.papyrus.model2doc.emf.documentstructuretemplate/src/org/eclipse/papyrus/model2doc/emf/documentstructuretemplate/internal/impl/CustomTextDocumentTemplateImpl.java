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

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.impl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl;

public class CustomTextDocumentTemplateImpl extends TextDocumentTemplateImpl {

	/**
	 * 
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getType()
	 *
	 * @return
	 */
	@Override
	public String getType() {
		if (null != getDocumentTemplatePrototype()) {
			return getDocumentTemplatePrototype().getType();
		}
		return null;
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getIconPath()
	 *
	 * @return
	 */
	@Override
	public String getIconPath() {
		if (null != getDocumentTemplatePrototype()) {
			return getDocumentTemplatePrototype().getIconPath();
		}
		return null;
	}
}