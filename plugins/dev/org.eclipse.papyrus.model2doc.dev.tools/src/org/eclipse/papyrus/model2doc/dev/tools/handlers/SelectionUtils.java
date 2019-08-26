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

package org.eclipse.papyrus.model2doc.dev.tools.handlers;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Utils method for selection
 */
public class SelectionUtils {

	// TODO : these methods are duplicated from org.eclipse.papyrus.infra.ui.util.SelectionHelper

	/**
	 *
	 * @return
	 *         the selection service or <code>null</code> if not found
	 *
	 */
	public static final ISelectionService getSelectionService() {
		IWorkbench wb = PlatformUI.getWorkbench();
		if (wb != null) {
			IWorkbenchWindow ww = wb.getActiveWorkbenchWindow();
			if (ww != null) {
				return ww.getService(ISelectionService.class);
			}
		}
		return null;
	}

	/**
	 *
	 * @return
	 *         the current selection or an empty selection. can't be <code>null</code>
	 */
	public static final ISelection getCurrentSelection() {
		final ISelectionService selectionService = getSelectionService();
		if (selectionService != null) {
			ISelection currentSelection = selectionService.getSelection();
			if (currentSelection != null) {
				return currentSelection;
			}
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 *
	 * @return
	 *         a structured selection.
	 *         the returned value can't be <code>null</code>
	 */
	public static final IStructuredSelection getCurrentStructuredSelection() {
		ISelection selection = getCurrentSelection();
		if (selection instanceof IStructuredSelection) {
			return (IStructuredSelection) selection;
		}
		return StructuredSelection.EMPTY;
	}
}
