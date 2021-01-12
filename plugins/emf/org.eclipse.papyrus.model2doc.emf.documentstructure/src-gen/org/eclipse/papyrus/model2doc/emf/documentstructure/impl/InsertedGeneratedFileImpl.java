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
package org.eclipse.papyrus.model2doc.emf.documentstructure.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedGeneratedFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inserted Generated File</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InsertedGeneratedFileImpl extends InsertedFileImpl implements InsertedGeneratedFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected InsertedGeneratedFileImpl() {
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
		return DocumentStructurePackage.Literals.INSERTED_GENERATED_FILE;
	}

} // InsertedGeneratedFileImpl
