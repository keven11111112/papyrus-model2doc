/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.modelexplorer.internal.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.ui.menu.NameNormalizationCommand;
import org.eclipse.papyrus.infra.ui.menu.NamePropertyTester;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.modelexplorer.internal.actions.DocumentQuickFormatAction;

/**
 * The handler for the {@link DocumentQuickFormatAction}.
 *
 */
public class DocumentTemplateQuickFormatHandler extends AbstractDocumentTemplateCommandHandler {

	/**
	 * Constructor.
	 *
	 */
	public DocumentTemplateQuickFormatHandler() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getCommand(ExecutionEvent event) {
		String parameter = event.getParameter(NamePropertyTester.PARAMETER_ID);

		DocumentQuickFormatAction action = new DocumentQuickFormatAction(parameter, new ArrayList<EObject>(getSelectedDocumentTemplates()));
		setBaseEnabled(action.isEnabled());
		if (action.isEnabled()) {
			return action.getCommand();
		}
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		super.setEnabled(evaluationContext);
		DocumentQuickFormatAction action = new DocumentQuickFormatAction(NameNormalizationCommand.DEFAULT_ACTION, getSelectedElements());
		setBaseEnabled(action.isEnabled());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getCommand(IEvaluationContext context) {
		// not used
		return null;
	}



	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean computeEnabled(IEvaluationContext context) {
		return !getSelectedDocumentTemplates().isEmpty();
	}

}
