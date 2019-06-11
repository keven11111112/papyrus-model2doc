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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.author.internal.operations;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.papyrus.model2doc.core.author.IAuthor;

/**
 * This class contains the operations for IAuthor
 */
public class IAuthorsOperations {

	/**
	 * the space character
	 */
	private static final String SPACE = " "; //$NON-NLS-1$

	/**
	 * The string used to separate the author
	 */
	private static final String AUTHOR_SEPARATOR = "; "; //$NON-NLS-1$

	/**
	 *
	 * @param author
	 *            an author
	 * @return
	 *         the label to use for the author
	 */
	public static final String buildAuthorLabel(final IAuthor author) {
		if (null == author) {
			return ""; //$NON-NLS-1$
		}
		final StringBuilder builder = new StringBuilder();
		final String firstName = author.getFirstName();
		final String lastName = author.getLastName();
		builder.append(null != firstName ? firstName : ""); //$NON-NLS-1$
		builder.append(SPACE);
		builder.append(null != lastName ? lastName : ""); //$NON-NLS-1$
		return builder.toString();
	}

	/**
	 *
	 * @param authors
	 *            a collection of author
	 * @return
	 *         the label to use to represent this collection of authors
	 */
	public static final String buildMultiAuthorLabel(final Collection<IAuthor> authors) {
		final StringBuilder builder = new StringBuilder();
		final Iterator<IAuthor> iter = authors.iterator();
		while (iter.hasNext()) {
			builder.append(buildAuthorLabel(iter.next()));
			if (iter.hasNext()) {
				builder.append(AUTHOR_SEPARATOR);
			}
		}
		return builder.toString();
	}
}
