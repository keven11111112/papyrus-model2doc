/*****************************************************************************
 * Copyright (c) 2019, 2020 CEA LIST.
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.papyrus.model2doc.core.author.IAuthor;

/**
 * This class contains the operations for IAuthor
 */
public final class IAuthorsOperations {

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
	 * Constructor.
	 *
	 */
	private IAuthorsOperations() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param author
	 *            an author
	 * @return
	 *         the label to use for the author, can't be <code>null</code>
	 */
	public static final String buildAuthorLabel(final IAuthor author) {
		if (null == author) {
			return ""; //$NON-NLS-1$
		}
		final StringBuilder builder = new StringBuilder();
		final String firstName = author.getFirstName() != null ? author.getFirstName() : "";
		final String lastName = author.getLastName() != null ? author.getLastName() : "";
		builder.append(firstName);
		if (!firstName.isEmpty() && !lastName.isEmpty()) {
			builder.append(SPACE);
		}
		builder.append(lastName);
		return builder.toString();
	}

	/**
	 *
	 * @param authors
	 *            a collection of author
	 * @return
	 *         the label to use to represent this collection of authors, can't be <code>null</code>
	 */
	public static final String buildMultiAuthorLabel(final Collection<IAuthor> authors) {
		final Iterator<IAuthor> iter = authors.iterator();

		// 1. firstly we create a list of valid label (ignoring empty ones!)
		final List<String> labels = new ArrayList<>();
		while (iter.hasNext()) {
			final String label = buildAuthorLabel(iter.next());
			if (label.isEmpty()) {
				continue;
			}
			labels.add(label);
		}

		final StringBuilder builder = new StringBuilder();
		final Iterator<String> labelIter = labels.iterator();
		while (labelIter.hasNext()) {
			builder.append(labelIter.next());
			if (labelIter.hasNext()) {
				builder.append(AUTHOR_SEPARATOR);
			}
		}
		return builder.toString();
	}
}
