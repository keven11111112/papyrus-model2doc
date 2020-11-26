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

package org.eclipse.papyrus.model2doc.core.status;

import org.eclipse.core.runtime.IStatus;

/**
 * common interface to get the status of a generation
 */
public interface IGenerationStatus extends IStatus {

	/**
	 *
	 * @return
	 *         the result of the generation
	 */
	public Object getResult();

	/**
	 * set the result of the generation
	 */
	public void setResult(final Object result);

	/**
	 * Returns an object which is an instance of the given class
	 * associated with this object. Returns <code>null</code> if
	 * no such object can be found.
	 *
	 *
	 * @param adapter
	 *            the adapter class to look up
	 * @param <T>
	 *            the class type
	 * @return a object of the given class,
	 *         or <code>null</code> if this object does not
	 *         have an adapter for the given class
	 */
	public <T> T getAdaptedResult(Class<T> adapter);

}
