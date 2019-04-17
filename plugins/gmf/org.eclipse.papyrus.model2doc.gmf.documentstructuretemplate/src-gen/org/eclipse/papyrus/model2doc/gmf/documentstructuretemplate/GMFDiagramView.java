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
package org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GMF Diagram View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element allows to describe diagram in a documentstructuretemplate model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView#getDiagramType <em>Diagram Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDocumentStructureTemplatePackage#getGMFDiagramView()
 * @model
 * @generated
 */
public interface GMFDiagramView extends ITemplatePartView, ILeafBodyPartTemplate {
	/**
	 * Returns the value of the '<em><b>Diagram Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of diagram to manage. If no type is defined, we will take all diagrams.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Diagram Type</em>' attribute.
	 * @see #setDiagramType(String)
	 * @see org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDocumentStructureTemplatePackage#getGMFDiagramView_DiagramType()
	 * @model ordered="false"
	 * @generated
	 */
	String getDiagramType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView#getDiagramType <em>Diagram Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Diagram Type</em>' attribute.
	 * @see #getDiagramType()
	 * @generated
	 */
	void setDiagramType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the diagram owned by the parameter expectedDiagramContext, according to the type of the diagram.
	 * It type is not defined, the method will returns all diagrams.
	 * <!-- end-model-doc -->
	 *
	 * @model type="org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.Diagram" ordered="false" expectedDiagramContextRequired="true" expectedDiagramContextOrdered="false"
	 * @generated
	 */
	EList<Diagram> getMatchingDiagrams(EObject expectedDiagramContext);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *
	 * @param diagramContext
	 *                           The context of the diagram. This parameter can be null.
	 *                           <!-- end-model-doc -->
	 * @model required="true" ordered="false" diagramContextRequired="true" diagramContextOrdered="false"
	 * @generated
	 */
	String buildTitle(EObject diagramContext);

} // GMFDiagramView
