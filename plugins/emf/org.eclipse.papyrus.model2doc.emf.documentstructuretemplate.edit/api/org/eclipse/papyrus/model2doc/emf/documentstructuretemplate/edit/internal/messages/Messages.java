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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.messages;

import org.eclipse.osgi.util.NLS;

/**
 * Messages of the API source package
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.messages.messages"; //$NON-NLS-1$
	public static String AbstractEObjectReferenceDialogEditorFactory_DialogMessageMultiSelection;
	public static String AbstractEObjectReferenceDialogEditorFactory_DialogMessageSingleSelection;
	public static String AbstractEObjectReferenceDialogEditorFactory_DialogTitle;
	public static String AbstractSelectionStatusValidator_NoSelection;
	public static String EcoreLabelProvider_FeatureOrigin;
	public static String SingleEClassValidator_YouMustSelectOneEClass;
	public static String SingleEReferenceValidator_YouMustSelectOneREference;
	public static String SingleEStructuralFeatureValidator_YouMustSelectOneEStructuralFeature;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
