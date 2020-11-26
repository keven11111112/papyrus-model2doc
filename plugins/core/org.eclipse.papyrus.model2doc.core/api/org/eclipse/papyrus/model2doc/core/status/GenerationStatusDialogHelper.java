/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.status;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.model2doc.core.utils.DialogConstants;
import org.eclipse.swt.widgets.Display;

/**
 * Helper used to display message from IStatus
 */
public final class GenerationStatusDialogHelper {

	/**
	 * Singleton of ths helper
	 */
	public static final GenerationStatusDialogHelper INSTANCE = new GenerationStatusDialogHelper();

	/**
	 *
	 * Constructor.
	 *
	 */
	private GenerationStatusDialogHelper() {
		// nothing to do
	}

	/**
	 * This method opens a {@link MessageDialog} for the the given status
	 *
	 * @param status
	 *            the status to display
	 */
	public void openMessageDialog(final IGenerationStatus status) {
		if (status.isOK() || IStatus.INFO == status.getSeverity()) {
			MessageDialog.openInformation(Display.getCurrent().getActiveShell(), DialogConstants.DIALOG_TITLE, status.getMessage());
		} else if (IStatus.WARNING == status.getSeverity()) {
			MessageDialog.openWarning(Display.getCurrent().getActiveShell(), DialogConstants.DIALOG_TITLE, status.getMessage());
		} else if (IStatus.ERROR == status.getSeverity()) {
			MessageDialog.openError(Display.getCurrent().getActiveShell(), DialogConstants.DIALOG_TITLE, status.getMessage());
		}
	}
}
