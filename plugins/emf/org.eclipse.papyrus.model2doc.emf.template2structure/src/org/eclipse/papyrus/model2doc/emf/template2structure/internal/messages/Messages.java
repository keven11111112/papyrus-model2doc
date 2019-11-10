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

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.messages;

import org.eclipse.osgi.util.NLS;

/**
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.model2doc.emf.template2structure.internal.messages.messages"; //$NON-NLS-1$
	public static String GenerateDocumentStructureHandler_EnterTheDocumentVersion;
	public static String GenerateDocumentStructureHandler_EnterTheDocumentVersionWithLastVersion;
	public static String GenerateDocumentStructureHandler_TheGenerationOfDocumentStructureIsFinished;
	public static String GenerateStructureAndDocumentHandler_GenerateAllActions;
	public static String GenerateStructureAndDocumentHandler_GenerationNotSupportedErrorMessage;
	public static String GenerateStructureAndDocumentHandler_PlusSymbole;
	public static String GenerateStructureAndDocumentHandler_TheDocumentStructureHasNotBeenGeneratedError;
	public static String GenerateStructureAndDocumentMenuContributionItem_GenerateAllMenuLabel;
	public static String GenerateStructureAndDocumentMenuContributionItem_GenerateAllWithParameterMenuLabel;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
