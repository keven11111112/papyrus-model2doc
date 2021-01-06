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
package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.model2doc.core.builtintypes.ImageFormat;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Papyrus GMF Diagram View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element allows to represent Papyrus Diagram. These diagrams are an extension of GMF Notation Diagram, but they have a kind in addition of the type field provided by GMF.
 * This View doesn't extend the GMFDiagramView provided by the model gmfdocumentstructuretemplate in order to allow to install the Papyrus GMF Diagram version without depending of the code managing the GMFDiagramView
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getDiagramKindId <em>Diagram Kind Id</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getDiagramType <em>Diagram Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getContextFilterRule <em>Context Filter Rule</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getDiagramImageMargin <em>Diagram Image Margin</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getImageFormat <em>Image Format</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage#getPapyrusGMFDiagramView()
 * @model annotation="duplicates"
 * @generated
 */
public interface PapyrusGMFDiagramView extends ITemplatePartView, ILeafBodyPartTemplate {
	/**
	 * Returns the value of the '<em><b>Diagram Kind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of the diagram. This field can be empty. In this case, all diagrams will be integrated into the final document.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Diagram Kind Id</em>' attribute.
	 * @see #setDiagramKindId(String)
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage#getPapyrusGMFDiagramView_DiagramKindId()
	 * @model ordered="false"
	 * @generated
	 */
	String getDiagramKindId();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getDiagramKindId <em>Diagram Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Diagram Kind Id</em>' attribute.
	 * @see #getDiagramKindId()
	 * @generated
	 */
	void setDiagramKindId(String value);

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
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage#getPapyrusGMFDiagramView_DiagramType()
	 * @model ordered="false"
	 * @generated
	 */
	String getDiagramType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getDiagramType <em>Diagram Type</em>}' attribute.
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
	 * Returns the value of the '<em><b>Context Filter Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property allows to define how to use the parameter of the method getMatchingDiagram.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Context Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior
	 * @see #setContextFilterRule(ContextFilterBehavior)
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage#getPapyrusGMFDiagramView_ContextFilterRule()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ContextFilterBehavior getContextFilterRule();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getContextFilterRule <em>Context Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Context Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior
	 * @see #getContextFilterRule()
	 * @generated
	 */
	void setContextFilterRule(ContextFilterBehavior value);

	/**
	 * Returns the value of the '<em><b>Diagram Image Margin</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field allows to define the size of the margin around the diagram snapshot. The value is interpreted as Pixel. The default value is 10.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Diagram Image Margin</em>' attribute.
	 * @see #setDiagramImageMargin(int)
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage#getPapyrusGMFDiagramView_DiagramImageMargin()
	 * @model default="10" required="true" ordered="false"
	 * @generated
	 */
	int getDiagramImageMargin();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getDiagramImageMargin <em>Diagram Image Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Diagram Image Margin</em>' attribute.
	 * @see #getDiagramImageMargin()
	 * @generated
	 */
	void setDiagramImageMargin(int value);

	/**
	 * Returns the value of the '<em><b>Image Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.core.builtintypes.ImageFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Image Format</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.ImageFormat
	 * @see #setImageFormat(ImageFormat)
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage#getPapyrusGMFDiagramView_ImageFormat()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ImageFormat getImageFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView#getImageFormat <em>Image Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Image Format</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.ImageFormat
	 * @see #getImageFormat()
	 * @generated
	 */
	void setImageFormat(ImageFormat value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the diagram owned by the parameter expectedDiagramContext, according to the type and the kind of the diagram.
	 * If type and kind are not defined, the method will returns all diagrams owned by the argument.
	 * If the diagram doesn't have a PapryusDiagramStyle, this method returns false.
	 * <!-- end-model-doc -->
	 *
	 * @model type="org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.Diagram" ordered="false" expectedDiagramContextRequired="true" expectedDiagramContextOrdered="false"
	 * @generated
	 */
	EList<Diagram> getMatchingDiagrams(EObject expectedDiagramContext);

} // PapyrusGMFDiagramView
