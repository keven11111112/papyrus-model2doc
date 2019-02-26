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
package org.eclipse.papyrus.model2doc.odt.ui.internal.propetytester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;

import org.eclipse.papyrus.model2doc.documentview.Document;

/**
 * Tester class for checking if selected document is a generic odt document.
 *
 */
public class GenericODTDocumentTester extends PropertyTester {

	private static final String IS_GENERIC_ODT_DOCUMENT = "isGenericODTDocument"; //$NON-NLS-1$

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (IS_GENERIC_ODT_DOCUMENT.equals(property)) {
			boolean answer = isGenericODTDocument(receiver);
			return new Boolean(answer).equals(expectedValue);
		}

		return false;
	}

	/**
	 * Verify if selected document is a generic odt document.
	 * 
	 * @param selection
	 *
	 */
	protected boolean isGenericODTDocument(Object selection) {
		if (selection instanceof IStructuredSelection) {
			Object selectedobject = ((IStructuredSelection) selection).getFirstElement();

			EObject selectedElement = EMFHelper.getEObject(selectedobject);
			if (selectedElement instanceof Document) {
				Document document = (Document) selectedElement;
				if (document.getDocumentKind().matches(getDocumentKind())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Get Document Kind.
	 * See documentKind in org.eclipse.papyrus.model2doc.odt.archietecture/resources/odt.architecture
	 * 
	 * @return
	 */
	private String getDocumentKind() {
		return "org.eclipse.papyrus.model2doc.documentation.odt.generic"; //$NON-NLS-1$ ;
	}

}
