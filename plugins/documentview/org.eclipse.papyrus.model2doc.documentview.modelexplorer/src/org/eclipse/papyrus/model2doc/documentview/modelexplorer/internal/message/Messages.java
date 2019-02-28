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
package org.eclipse.papyrus.model2doc.documentview.modelexplorer.internal.message;

import org.eclipse.osgi.util.NLS;

/**
 * This class provides messages.
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.model2doc.documentview.modelexplorer.internal.message.messages"; //$NON-NLS-1$

	public static String RenameDocumentHandler_NewName;

	public static String RenameDocumentHandler_RenameAnExistingDocument;
	
	public static String RenameDocumentHandler_Label_DialogTitle;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	/**
	 * Constructor.
	 *
	 */
	private Messages() {
		// to avoid instantiation
	}

}
