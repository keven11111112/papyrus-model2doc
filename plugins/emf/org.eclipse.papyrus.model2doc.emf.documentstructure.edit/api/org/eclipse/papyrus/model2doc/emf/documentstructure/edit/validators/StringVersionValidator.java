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

package org.eclipse.papyrus.model2doc.emf.documentstructure.edit.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.papyrus.model2doc.emf.documentstructure.edit.internal.messages.Messages;

/**
 * This validator checks the input version is compliant with a file name
 */
public class StringVersionValidator implements ICellEditorValidator, IInputValidator {

	/**
	 * The regex used to check the string version
	 */
	private final Pattern REGEX_PATTERN = Pattern.compile("[\\w-._]*"); //$NON-NLS-1$

	/**
	 * @see org.eclipse.jface.dialogs.IInputValidator#isValid(java.lang.String)
	 *
	 * @param newText
	 * @return
	 */
	@Override
	public String isValid(final String newText) {
		if (newText.isEmpty()) {
			return null;
		}
		final Matcher matcher = REGEX_PATTERN.matcher(newText);

		if (!matcher.matches()) {
			return Messages.StringVersionValidator_InvalidMessage;
		}
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.ICellEditorValidator#isValid(java.lang.Object)
	 *
	 * @param value
	 * @return
	 */
	@Override
	public String isValid(Object value) {
		// we assume value is a String!
		return isValid((String) value);
	}

}
