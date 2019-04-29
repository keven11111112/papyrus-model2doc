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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.validators;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.validators.AbstractSelectionStatusValidator;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.messages.Messages;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;

/**
 * Validator for Single Selection of Stereotype
 */
public class SinglePropertyReferenceValidator extends AbstractSelectionStatusValidator {


	/**
	 * @see org.eclipse.ui.dialogs.ISelectionStatusValidator#validate(java.lang.Object[])
	 *
	 * @param selection
	 * @return
	 */
	@Override
	public IStatus validate(Object[] selection) {
		String errorMessage = ""; //$NON-NLS-1$
		if (selection.length == 0) {
			errorMessage = NO_SELECTION;
		} else {
			final Object firstSelection = selection[0];
			if (selection.length != 1 || false == firstSelection instanceof Property || (firstSelection instanceof Property && ((Property) firstSelection).getType() instanceof PrimitiveType)) {
				errorMessage = Messages.SinglePropertyReferenceValidator_YouMustSelectAProperty;
			}
		}
		return buildIStatus(errorMessage);
	}

}
