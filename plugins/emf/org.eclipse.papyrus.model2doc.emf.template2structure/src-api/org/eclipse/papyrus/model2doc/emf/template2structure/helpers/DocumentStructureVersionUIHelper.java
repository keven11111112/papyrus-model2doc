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

package org.eclipse.papyrus.model2doc.emf.template2structure.helpers;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructure.edit.validators.StringVersionValidator;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.messages.Messages;
import org.eclipse.swt.widgets.Display;

/**
 * This Version helper opens a dialog to ask the version number to the user
 */
public class DocumentStructureVersionUIHelper extends DocumentStructureVersionHelper {

	/**
	 * The title of the Dialog.
	 */
	private static final String DIALOG_TITLE = "Papyrus-Model2Doc"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 * @param docTemplate
	 */
	public DocumentStructureVersionUIHelper(final DocumentTemplate docTemplate) {
		super(docTemplate);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.helpers.DocumentStructureVersionHelper#getDocumentVersion()
	 *
	 * @return
	 *         the version to use for the created document
	 *         a <code>null</code> must cancel the document structure generation
	 */
	@Override
	public String getDocumentVersion() {
		final String previousVersion = getPreviousGeneratedVersion();
		final String dialogMessage;
		if (previousVersion == null || previousVersion.isEmpty()) {
			dialogMessage = Messages.DocumentStructureVersionUIHelper_EnterTheDocumentVersion;
		} else {
			dialogMessage = NLS.bind(Messages.DocumentStructureVersionUIHelper_EnterTheDocumentVersionWithLastVersion, previousVersion);
		}

		final InputDialog defineVersion = new InputDialog(Display.getDefault().getActiveShell(), DIALOG_TITLE, dialogMessage, "", new StringVersionValidator()); //$NON-NLS-1$
		if (IDialogConstants.OK_ID != defineVersion.open()) {
			return null;
		}
		return defineVersion.getValue();
	}

}
