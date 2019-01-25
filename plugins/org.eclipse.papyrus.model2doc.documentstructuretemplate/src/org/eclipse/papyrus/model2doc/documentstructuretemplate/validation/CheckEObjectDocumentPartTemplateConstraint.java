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

package org.eclipse.papyrus.model2doc.documentstructuretemplate.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.EObjectDocumentPartTemplate;

public class CheckEObjectDocumentPartTemplateConstraint extends AbstractModelConstraint {

	/**
	 * 
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 *
	 * @param arg0
	 * @return
	 */
	@Override
	public IStatus validate(IValidationContext arg0) {
		// cast is done by the caller
		final EObjectDocumentPartTemplate template = (EObjectDocumentPartTemplate) arg0.getTarget();
		final EObject owner = template.eContainer();
		if (owner instanceof DocumentTemplate) {
			return arg0.createSuccessStatus();
		}
		return arg0.createFailureStatus();
	}

}
