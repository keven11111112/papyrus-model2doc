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

package org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.internal.menu;

import java.util.Collections;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.structure2document.internal.menu.MenuConstants;
import org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.Activator;
import org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.internal.menu.internal.messages.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

public class Structure2PDFMenuContributionItem extends ContributionItem {

	/**
	 *
	 * Constructor.
	 *
	 */
	public Structure2PDFMenuContributionItem() {
		// nothing to do
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param id
	 */
	public Structure2PDFMenuContributionItem(final String id) {
		super(id);
		// nothing to do
	}

	/**
	 *
	 * @see org.eclipse.jface.action.ContributionItem#fill(org.eclipse.swt.widgets.Menu,
	 *      int)
	 *
	 * @param menu
	 * @param index
	 */
	@Override
	public void fill(Menu menu, int index) {
		createMenuItem(Structure2PDFMenuConstants.GENERATE_DOCUMENT_AND_PDF_COMMAND, menu, 0);
		createMenuItem(Structure2PDFMenuConstants.GENERATE_DOCUMENT_AND_PDF_A1B_COMMAND, menu, 1);
		createMenuItem(Structure2PDFMenuConstants.GENERATE_DOCUMENT_AND_PDF_A2B_COMMAND, menu, 2);
	}

	/**
	 *
	 * @param commandId
	 *            the id of the command for which we create a menu item
	 * @param menu
	 *            the menu owning the created item
	 * @param index
	 *            the index of the item to create
	 */
	protected void createMenuItem(final String commandId, final Menu menu, final int index) {
		// 1. look for the IEclipseContext
		final IEclipseContext ctx = getEclipseContext();

		// 2. find the command service
		final ICommandService serv = getCommandService();

		// 3. find the command
		final Command command = serv.getCommand(commandId);

		// 4. get the eclipse handler for this command
		final IHandler handler = command.getHandler();

		// 5. reset the menu label parameter (to be sure to detect its erasure)
		// the call command.isEnabled() will edit this parameter
		ctx.set(MenuConstants.VARIABLE_GENERATOR_MENU_LABEL,
				MenuConstants.NO_GENERATOR_ID);

		if (command.isEnabled()) {// required to call setEnable and defining the label of the menu to propose
			final String res = (String) ctx.get(MenuConstants.VARIABLE_GENERATOR_MENU_LABEL);
			String pdfVersion = (String) ctx.get(Structure2PDFMenuConstants.VARIABLE_PDF_VERSION_MENU_LABEL);
			if (pdfVersion == null || pdfVersion.isEmpty()) {
				pdfVersion = Structure2PDFMenuConstants.PDF;
			}

			final MenuItem item = new MenuItem(menu, SWT.PUSH, index);

			final String menuName;
			if (res != null && !res.isEmpty() && !res.equals(MenuConstants.NO_GENERATOR_ID)) {
				menuName = NLS.bind(Messages.Structure2PDFMenuContributionItem_GenerateAllWith2Parameters, pdfVersion,
						res);
			} else {
				menuName = NLS.bind(Messages.Structure2PDFMenuContributionItem_GenerateAllWith1Parameter, pdfVersion);
			}

			item.setText(menuName);
			item.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent arg0) {
					try {
						handler.execute(new ExecutionEvent(command, Collections.emptyMap(), null, null));
					} catch (ExecutionException e) {
						Activator.log.error(e);
					}
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent arg0) {
					// nothing to do
				}
			});
		}
	}

	/**
	 *
	 * @return the EclipseContext or <code>null</code> if not found
	 */
	private IEclipseContext getEclipseContext() {
		final IWorkbench workbench = getWorkbench();
		if (workbench != null) {
			return workbench.getService(IEclipseContext.class);
		}
		return null;
	}

	/**
	 *
	 * @return the current {@link IWorkbench} or <code>null</code> if not found
	 */
	private IWorkbench getWorkbench() {
		return PlatformUI.getWorkbench();
	}

	/**
	 *
	 * @return the current {@link ICommandService} or <code>null</code> if not found
	 */
	private ICommandService getCommandService() {
		final IWorkbench workbench = getWorkbench();
		if (workbench != null) {
			return workbench.getService(ICommandService.class);
		}
		return null;
	}
}