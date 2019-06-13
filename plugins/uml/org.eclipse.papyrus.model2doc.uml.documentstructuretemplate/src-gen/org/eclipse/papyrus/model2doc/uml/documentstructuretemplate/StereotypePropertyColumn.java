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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Property Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element allows to represent a stereotype's property in a table's column.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage#getStereotypePropertyColumn()
 * @model annotation="duplicates"
 * @generated
 */
public interface StereotypePropertyColumn extends MandatoryStereotypePropertyTemplate, IColumn {
	/**
	 * <p>
	 * This operation redefines the following operations:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn#buildCellLabel(java.lang.Object) <em>Build Cell Label</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates the label from the cell value given as parameter.
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false" cellElementRequired="true" cellElementOrdered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	@Override
	String buildCellLabel(Object cellElement);

} // StereotypePropertyColumn
