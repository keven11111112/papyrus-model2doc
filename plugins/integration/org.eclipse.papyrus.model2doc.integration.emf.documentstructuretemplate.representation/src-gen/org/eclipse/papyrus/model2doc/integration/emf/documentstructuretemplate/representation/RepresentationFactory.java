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
package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.RepresentationPackage
 * @generated
 */
public interface RepresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	RepresentationFactory eINSTANCE = org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.RepresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Papyrus Document Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Papyrus Document Prototype</em>'.
	 * @generated
	 */
	PapyrusDocumentPrototype createPapyrusDocumentPrototype();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	RepresentationPackage getRepresentationPackage();

} // RepresentationFactory
