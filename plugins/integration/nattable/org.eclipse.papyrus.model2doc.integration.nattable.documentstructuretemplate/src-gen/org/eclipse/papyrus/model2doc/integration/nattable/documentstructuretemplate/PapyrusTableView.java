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
package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.infra.nattable.model.nattable.Table;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Papyrus Table View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element allows to represent Papyrus Tables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getTableKindId <em>Table Kind Id</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getTableType <em>Table Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getContextFilterRule <em>Context Filter Rule</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getImportMethod <em>Import Method</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage#getPapyrusTableView()
 * @model
 * @generated
 */
public interface PapyrusTableView extends ILeafBodyPartTemplate, ITemplatePartView {
	/**
	 * Returns the value of the '<em><b>Table Kind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of the table. This field can be empty. In this case, all tables will be integrated into the final document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Kind Id</em>' attribute.
	 * @see #setTableKindId(String)
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage#getPapyrusTableView_TableKindId()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyEditorFactory='editor://papyrusnattabledocumentstructuretemplate/PapyrusTableView/tableKindId/'"
	 * @generated
	 */
	String getTableKindId();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getTableKindId <em>Table Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Kind Id</em>' attribute.
	 * @see #getTableKindId()
	 * @generated
	 */
	void setTableKindId(String value);

	/**
	 * Returns the value of the '<em><b>Table Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of table to manage. If no type is defined, we will take all tables
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Type</em>' attribute.
	 * @see #setTableType(String)
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage#getPapyrusTableView_TableType()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyEditorFactory='editor://papyrusnattabledocumentstructuretemplate/PapyrusTableView/tableType/'"
	 * @generated
	 */
	String getTableType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getTableType <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Type</em>' attribute.
	 * @see #getTableType()
	 * @generated
	 */
	void setTableType(String value);

	/**
	 * Returns the value of the '<em><b>Context Filter Rule</b></em>' attribute.
	 * The default value is <code>"SEMANTIC_CONTEXT"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property allows to define how to use the parameter of the method getMatchingTables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior
	 * @see #setContextFilterRule(ContextFilterBehavior)
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage#getPapyrusTableView_ContextFilterRule()
	 * @model default="SEMANTIC_CONTEXT" required="true" ordered="false"
	 * @generated
	 */
	ContextFilterBehavior getContextFilterRule();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getContextFilterRule <em>Context Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Filter Rule</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior
	 * @see #getContextFilterRule()
	 * @generated
	 */
	void setContextFilterRule(ContextFilterBehavior value);

	/**
	 * Returns the value of the '<em><b>Import Method</b></em>' attribute.
	 * The default value is <code>"TABLE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property allows to define how to import the Tables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Method</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod
	 * @see #setImportMethod(ImportMethod)
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage#getPapyrusTableView_ImportMethod()
	 * @model default="TABLE" required="true" ordered="false"
	 * @generated
	 */
	ImportMethod getImportMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView#getImportMethod <em>Import Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Method</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod
	 * @see #getImportMethod()
	 * @generated
	 */
	void setImportMethod(ImportMethod value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the tables owned by the parameter expectedTableContext, according to the type and the kind of the table
	 * If type and kind are not defined, the method will returns all table owned by the argument.
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.Table" ordered="false" expectedTableContextRequired="true" expectedTableContextOrdered="false"
	 * @generated
	 */
	EList<Table> getMatchingTables(EObject expectedTableContext);

} // PapyrusTableView
