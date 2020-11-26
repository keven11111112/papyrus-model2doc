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

import org.eclipse.core.runtime.Status;

/**
 * specific IStatus used for generation result
 */
public class GenerationStatus extends Status implements IGenerationStatus {

	/**
	 * the stored result
	 */
	private Object result;

	/**
	 * Constructor.
	 *
	 * @param severity
	 * @param caller
	 * @param code
	 * @param message
	 * @param exception
	 */
	public GenerationStatus(int severity, Class<?> caller, int code, String message, Throwable exception) {
		super(severity, caller, code, message, exception);
	}

	/**
	 * Constructor.
	 *
	 * @param severity
	 * @param caller
	 * @param message
	 * @param exception
	 */
	public GenerationStatus(int severity, Class<?> caller, String message, Throwable exception) {
		super(severity, caller, message, exception);
	}

	/**
	 * Constructor.
	 *
	 * @param severity
	 * @param caller
	 * @param message
	 */
	public GenerationStatus(int severity, Class<?> caller, String message) {
		super(severity, caller, message);
	}

	/**
	 * Constructor.
	 *
	 * @param severity
	 * @param pluginId
	 * @param code
	 * @param message
	 * @param exception
	 */
	public GenerationStatus(int severity, String pluginId, int code, String message, Throwable exception) {
		super(severity, pluginId, code, message, exception);
	}

	/**
	 * Constructor.
	 *
	 * @param severity
	 * @param pluginId
	 * @param message
	 * @param exception
	 */
	public GenerationStatus(int severity, String pluginId, String message, Throwable exception) {
		super(severity, pluginId, message, exception);
	}

	/**
	 * Constructor.
	 *
	 * @param severity
	 * @param pluginId
	 * @param message
	 */
	public GenerationStatus(int severity, String pluginId, String message) {
		super(severity, pluginId, message);
	}

	/**
	 *
	 * @return
	 */
	@Override
	public Object getResult() {
		return result;
	}

	/**
	 * Set the result
	 */
	@Override
	public void setResult(final Object result) {
		this.result = result;
	}

	/**
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 *
	 * @param <T>
	 * @param adapter
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdaptedResult(Class<T> adapter) {
		if (this.result != null) {
			if (adapter.isInstance(this.result)) {
				return (T) this.result;
			}
		}
		return null;
	}

}
