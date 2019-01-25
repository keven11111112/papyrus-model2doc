/**
 * Copyright (c) 2019 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.documentstructuretemplate.validation;

import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate;

public class ValidationClientSelector implements IClientSelector {

	@Override
	public boolean selects(Object object) {
		return object instanceof DocumentPartTemplate || object instanceof DocumentTemplate;
	}

}
