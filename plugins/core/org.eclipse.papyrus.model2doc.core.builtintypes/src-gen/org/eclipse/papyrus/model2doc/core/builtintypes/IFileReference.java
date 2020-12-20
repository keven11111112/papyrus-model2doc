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
package org.eclipse.papyrus.model2doc.core.builtintypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.core.builtintypes.accessors.IInputFileAccessor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFile Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage#getIFileReference()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IFileReference extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the path of the referenced file. The path can be a platform:/resource, a platform:/plugin, a path in the current project or a system path (ex: c:\MyDocuments).
	 * <!-- end-model-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getFilePath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" dataType="org.eclipse.papyrus.model2doc.core.builtintypes.IInputFileAccessor" required="true" ordered="false"
	 * @generated
	 */
	IInputFileAccessor getFileAccessor();

} // IFileReference
