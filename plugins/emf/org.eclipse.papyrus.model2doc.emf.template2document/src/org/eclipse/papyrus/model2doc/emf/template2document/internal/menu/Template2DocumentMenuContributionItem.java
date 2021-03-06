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
package org.eclipse.papyrus.model2doc.emf.template2document.internal.menu;

import java.util.Collections;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.template2document.Activator;
import org.eclipse.papyrus.model2doc.emf.template2document.internal.messages.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

/**
 * This menu allows to provide Generations menus with custom label for the provided generator
 */
public class Template2DocumentMenuContributionItem extends ContributionItem {

	/**
	 *
	 * Constructor.
	 *
	 */
	public Template2DocumentMenuContributionItem() {
		super();
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param id
	 */
	public Template2DocumentMenuContributionItem(final String id) {
		super(id);
	}

	/**
	 * @see org.eclipse.jface.action.ContributionItem#fill(org.eclipse.swt.widgets.Menu, int)
	 *
	 * @param menu
	 * @param index
	 */
	@Override
	public void fill(Menu menu, int index) {
		// 1. look for the IEclipseContext
		final IEclipseContext ctx = getEclipseContext();

		// 2. find the command service
		final ICommandService serv = getCommandService();

		// 3. find the command
		final Command command = serv.getCommand(Template2DocumentMenuConstants.GENERATE_STRUCTURE_AND_DOCUMENT_COMMAND);

		// 4. get the eclipse handler for this command
		final IHandler handler = command.getHandler();

		// 5. reset the menu label parameter (to be sure to detect its erasure)
		// the call command.isEnabled() will edit this parameter
		ctx.set(Template2DocumentMenuConstants.VARIABLE_GENERATOR_MENU_LABEL, Template2DocumentMenuConstants.NO_GENERATOR_ID);

		if (command.isEnabled()) {
			// required to call setEnable
			// the handler#setEnable set a constant in the ctx to get the label of the generator
			// we use this label in the created menu to get a better experience for the final user
			final String res = (String) ctx.get(Template2DocumentMenuConstants.VARIABLE_GENERATOR_MENU_LABEL);

			final MenuItem item = new MenuItem(menu, SWT.PUSH, index);

			final String menuName;
			if (res != null && !res.isEmpty() && !res.equals(Template2DocumentMenuConstants.NO_GENERATOR_ID)) {
				menuName = NLS.bind(Messages.Template2DocumentMenuContributionItem_GenerateAllWithParameterMenuLabel, res);
			} else {
				menuName = Messages.Template2DocumentMenuContributionItem_GenerateAllMenuLabel;
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
	 * @return
	 *         the EclipseContext or <code>null</code> if not found
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
	 * @return
	 *         the current {@link IWorkbench} or <code>null</code> if not found
	 */
	private IWorkbench getWorkbench() {
		return PlatformUI.getWorkbench();
	}

	/**
	 *
	 * @return
	 *         the current {@link ICommandService} or <code>null</code> if not found
	 */
	private ICommandService getCommandService() {
		final IWorkbench workbench = getWorkbench();
		if (workbench != null) {
			return workbench.getService(ICommandService.class);
		}
		return null;
	}
}
