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

package org.eclipse.papyrus.model2doc.emf.template2document.internal.menu;

/**
 * The constants used in the menus
 */
public final class MenuConstants {

	private MenuConstants() {
		// to prevent instantication
	}

	/**
	 * the command's id for document generation
	 */
	public static final String GENERATE_STRUCTURE_AND_DOCUMENT_COMMAND = "org.eclipse.papyrus.model2doc.emf.template2document.generatestructureAndDocument"; //$NON-NLS-1$

	/**
	 * the variable's name used to get the menu label
	 */
	public static final String VARIABLE_GENERATOR_MENU_LABEL = "generatorMenuLabel"; //$NON-NLS-1$

	/**
	 * The value of the previous variable when there is no generator
	 */
	public static final String NO_GENERATOR_ID = "noGenerator"; //$NON-NLS-1$
}
