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

package org.eclipse.papyrus.model2doc.dev.tools.messages;

import org.eclipse.osgi.util.NLS;

/**
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.model2doc.dev.tools.messages.messages"; //$NON-NLS-1$
	public static String NewDocumentPrototypeDialog_DialogName;
	public static String NewDocumentPrototypeDialog_DocumentPrototypeDescription;
	public static String NewDocumentPrototypeDialog_DocumentTemplateDescription;
	public static String NewDocumentPrototypeDialog_File;
	public static String NewDocumentPrototypeDialog_FileName;
	public static String NewDocumentPrototypeDialog_IconPath;
	public static String NewDocumentPrototypeDialog_KindIdExample;
	public static String NewDocumentPrototypeDialog_TheseFileAreMandatory;
	public static String NewDocumentPrototypeDialog_Type;
	public static String NewDocumentPrototypeDialog_TypeExampleMessage;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
