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
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.documentview.modelexplorer.internal.directeditor.parser;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.papyrus.infra.internationalization.utils.utils.LabelInternationalizationUtils;

import org.eclipse.papyrus.model2doc.documentview.Document;

/**
 * Specific Parser for the Document Direct Editor.
 */
public class DocumentDirectEditorParser implements IParser {

	/**
	 * Name of the current document.
	 */
	private String textToEdit;

	/**
	 * Determinate if this is a label modification.
	 */
	private boolean isLabelModification;

	/**
	 * Constructor.
	 *
	 * @param textToEdit
	 *            The text to edit.
	 * @param isLabelModification
	 *            Determinate if this is a label modification.
	 */
	public DocumentDirectEditorParser(final String textToEdit, final boolean isLabelModification) {
		this.textToEdit = textToEdit;
		this.isLabelModification = isLabelModification;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getEditString(IAdaptable element, int flags) {
		return textToEdit;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
		CompositeCommand result = new CompositeCommand("Rename"); //$NON-NLS-1$
		EObject eObjectElement = element.getAdapter(EObject.class);
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(eObjectElement);

		AbstractTransactionalCommand cmd = new AbstractTransactionalCommand(editingDomain, "RenameCommand", null) { //$NON-NLS-1$

			/**
			 * {@inheritDoc}
			 */
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				if ((eObjectElement instanceof Document) && (null != newString && !newString.isEmpty())) {
					if (isLabelModification) {
						LabelInternationalizationUtils.setLabel(((Document) eObjectElement), newString, null);
					} else {
						((Document) eObjectElement).setName(newString);
					}
					return CommandResult.newOKCommandResult();
				}

				return CommandResult.newCancelledCommandResult();
			}
		};

		result.add(cmd);
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getPrintString(IAdaptable element, int flags) {
		return textToEdit;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		// Not used
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		// Not used
		return null;
	}

}
