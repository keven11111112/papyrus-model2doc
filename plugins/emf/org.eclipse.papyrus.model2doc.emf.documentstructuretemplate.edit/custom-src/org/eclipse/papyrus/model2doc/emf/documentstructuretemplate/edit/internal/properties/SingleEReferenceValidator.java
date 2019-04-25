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

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.messages.Messages;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

/**
 * Validator for a single selection of EReference
 */
public class SingleEReferenceValidator implements ISelectionStatusValidator {

	private static final String PLUGIN_NAME = " org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit"; //$NON-NLS-1$

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
			errorMessage = Messages.SingleEReferenceValidator_NoSelection;
		} else if (selection.length > 1) {
			errorMessage = Messages.SingleEReferenceValidator_SelectionMultiplicityNotValid;
		} else if (selection.length == 1) {
			final Object selectedObject = selection[0];
			if (false == selectedObject instanceof EReference) {
				errorMessage = Messages.SingleEReferenceValidator_TheSelectionIsNotAReference;
			}
		}

		return new Status(errorMessage.isEmpty() ? IStatus.OK : IStatus.ERROR, PLUGIN_NAME, errorMessage);
	}

}
