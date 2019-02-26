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
package org.eclipse.papyrus.model2doc.documentview.modelexplorer.internal.directeditor.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.documentview.modelexplorer.Activator;

/**
 * This preference initializer initializes the preferences for the direct editor of Document.
 *
 */
public class DocumentDirectEditorPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * Prefix 'papyrus.editors' to store preferences.
	 */
	private static final String PREFIX_PAPYRUS_EDITOR = "papyrus.directeditor."; //$NON-NLS-1$

	/**
	 * The Value for the objects 'Document'.
	 */
	private static final String VALUE_TABLE = "Document Direct Editor"; //$NON-NLS-1$

	/**
	 * Constructor.
	 */
	public DocumentDirectEditorPreferenceInitializer() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PREFIX_PAPYRUS_EDITOR + Document.class.getName(), VALUE_TABLE);
	}

}
