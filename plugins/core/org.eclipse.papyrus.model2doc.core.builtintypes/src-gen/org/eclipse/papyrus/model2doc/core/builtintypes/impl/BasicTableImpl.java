/**
 * Copyright (c) 2019 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.core.builtintypes.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.model2doc.core.builtintypes.BasicTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BasicTableImpl extends AbstractTableImpl implements BasicTable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected BasicTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuiltInTypesPackage.Literals.BASIC_TABLE;
	}

} // BasicTableImpl
