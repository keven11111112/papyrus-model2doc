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
package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.IBooleanEObjectExpression;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;

import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ContextFilterBehavior;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.ImportMethod;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Papyrus Table View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl#isGenerate <em>Generate</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl#isGenerateTitle <em>Generate Title</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl#getCustomTitle <em>Custom Title</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl#getGenerateBranchCondition <em>Generate Branch Condition</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl#getTableKindId <em>Table Kind Id</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl#getTableType <em>Table Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl#getContextFilterRule <em>Context Filter Rule</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl#getImportMethod <em>Import Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PapyrusTableViewImpl extends MinimalEObjectImpl.Container implements PapyrusTableView {
	/**
	 * The default value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected boolean generate = GENERATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateTitle() <em>Generate Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TITLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateTitle() <em>Generate Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTitle = GENERATE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomTitle() <em>Custom Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomTitle() <em>Custom Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTitle()
	 * @generated
	 * @ordered
	 */
	protected String customTitle = CUSTOM_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenerateBranchCondition() <em>Generate Branch Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateBranchCondition()
	 * @generated
	 * @ordered
	 */
	protected IBooleanEObjectExpression generateBranchCondition;

	/**
	 * The default value of the '{@link #getTableKindId() <em>Table Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableKindId()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_KIND_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableKindId() <em>Table Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableKindId()
	 * @generated
	 * @ordered
	 */
	protected String tableKindId = TABLE_KIND_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableType() <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableType()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableType() <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableType()
	 * @generated
	 * @ordered
	 */
	protected String tableType = TABLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextFilterRule() <em>Context Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextFilterRule()
	 * @generated
	 * @ordered
	 */
	protected static final ContextFilterBehavior CONTEXT_FILTER_RULE_EDEFAULT = ContextFilterBehavior.SEMANTIC_CONTEXT;

	/**
	 * The cached value of the '{@link #getContextFilterRule() <em>Context Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextFilterRule()
	 * @generated
	 * @ordered
	 */
	protected ContextFilterBehavior contextFilterRule = CONTEXT_FILTER_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportMethod() <em>Import Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportMethod()
	 * @generated
	 * @ordered
	 */
	protected static final ImportMethod IMPORT_METHOD_EDEFAULT = ImportMethod.TABLE;

	/**
	 * The cached value of the '{@link #getImportMethod() <em>Import Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportMethod()
	 * @generated
	 * @ordered
	 */
	protected ImportMethod importMethod = IMPORT_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PapyrusTableViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PapyrusNattableDocumentStructureTemplatePackage.Literals.PAPYRUS_TABLE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate() {
		return generate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate(boolean newGenerate) {
		boolean oldGenerate = generate;
		generate = newGenerate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE, oldGenerate, generate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerateTitle() {
		return generateTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateTitle(boolean newGenerateTitle) {
		boolean oldGenerateTitle = generateTitle;
		generateTitle = newGenerateTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_TITLE, oldGenerateTitle, generateTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomTitle() {
		return customTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTitle(String newCustomTitle) {
		String oldCustomTitle = customTitle;
		customTitle = newCustomTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__CUSTOM_TITLE, oldCustomTitle, customTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBooleanEObjectExpression getGenerateBranchCondition() {
		return generateBranchCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerateBranchCondition(IBooleanEObjectExpression newGenerateBranchCondition, NotificationChain msgs) {
		IBooleanEObjectExpression oldGenerateBranchCondition = generateBranchCondition;
		generateBranchCondition = newGenerateBranchCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_BRANCH_CONDITION, oldGenerateBranchCondition, newGenerateBranchCondition);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateBranchCondition(IBooleanEObjectExpression newGenerateBranchCondition) {
		if (newGenerateBranchCondition != generateBranchCondition) {
			NotificationChain msgs = null;
			if (generateBranchCondition != null) {
				msgs = ((InternalEObject) generateBranchCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_BRANCH_CONDITION, null, msgs);
			}
			if (newGenerateBranchCondition != null) {
				msgs = ((InternalEObject) newGenerateBranchCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_BRANCH_CONDITION, null, msgs);
			}
			msgs = basicSetGenerateBranchCondition(newGenerateBranchCondition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_BRANCH_CONDITION, newGenerateBranchCondition, newGenerateBranchCondition));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableKindId() {
		return tableKindId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableKindId(String newTableKindId) {
		String oldTableKindId = tableKindId;
		tableKindId = newTableKindId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__TABLE_KIND_ID, oldTableKindId, tableKindId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableType() {
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableType(String newTableType) {
		String oldTableType = tableType;
		tableType = newTableType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__TABLE_TYPE, oldTableType, tableType));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextFilterBehavior getContextFilterRule() {
		return contextFilterRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextFilterRule(ContextFilterBehavior newContextFilterRule) {
		ContextFilterBehavior oldContextFilterRule = contextFilterRule;
		contextFilterRule = newContextFilterRule == null ? CONTEXT_FILTER_RULE_EDEFAULT : newContextFilterRule;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__CONTEXT_FILTER_RULE, oldContextFilterRule, contextFilterRule));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportMethod getImportMethod() {
		return importMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportMethod(ImportMethod newImportMethod) {
		ImportMethod oldImportMethod = importMethod;
		importMethod = newImportMethod == null ? IMPORT_METHOD_EDEFAULT : newImportMethod;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__IMPORT_METHOD, oldImportMethod, importMethod));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String buildPartTemplateTitle(final EObject tableContext) {
		return org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.internal.operations.PapyrusNattableBodySectionPartTemplateTitleOperations.PAPYRUS_NATTABLE_INSTANCE.buildPartTemplateTitle(this, tableContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean generateBranch(final EObject context) {
		if (null == context) {
			return false;
		}
		if (null == generateBranchCondition) {
			return true;
		}

		return generateBranchCondition.evaluate(context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getMatchingTables(EObject expectedTableContext) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
			return basicSetGenerateBranchCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE:
			return isGenerate();
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_TITLE:
			return isGenerateTitle();
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__CUSTOM_TITLE:
			return getCustomTitle();
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
			return getGenerateBranchCondition();
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__TABLE_KIND_ID:
			return getTableKindId();
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__TABLE_TYPE:
			return getTableType();
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__CONTEXT_FILTER_RULE:
			return getContextFilterRule();
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__IMPORT_METHOD:
			return getImportMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE:
			setGenerate((Boolean) newValue);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_TITLE:
			setGenerateTitle((Boolean) newValue);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__CUSTOM_TITLE:
			setCustomTitle((String) newValue);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
			setGenerateBranchCondition((IBooleanEObjectExpression) newValue);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__TABLE_KIND_ID:
			setTableKindId((String) newValue);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__TABLE_TYPE:
			setTableType((String) newValue);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__CONTEXT_FILTER_RULE:
			setContextFilterRule((ContextFilterBehavior) newValue);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__IMPORT_METHOD:
			setImportMethod((ImportMethod) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE:
			setGenerate(GENERATE_EDEFAULT);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_TITLE:
			setGenerateTitle(GENERATE_TITLE_EDEFAULT);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__CUSTOM_TITLE:
			setCustomTitle(CUSTOM_TITLE_EDEFAULT);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
			setGenerateBranchCondition((IBooleanEObjectExpression) null);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__TABLE_KIND_ID:
			setTableKindId(TABLE_KIND_ID_EDEFAULT);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__TABLE_TYPE:
			setTableType(TABLE_TYPE_EDEFAULT);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__CONTEXT_FILTER_RULE:
			setContextFilterRule(CONTEXT_FILTER_RULE_EDEFAULT);
			return;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__IMPORT_METHOD:
			setImportMethod(IMPORT_METHOD_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE:
			return generate != GENERATE_EDEFAULT;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_TITLE:
			return generateTitle != GENERATE_TITLE_EDEFAULT;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__CUSTOM_TITLE:
			return CUSTOM_TITLE_EDEFAULT == null ? customTitle != null : !CUSTOM_TITLE_EDEFAULT.equals(customTitle);
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
			return generateBranchCondition != null;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__TABLE_KIND_ID:
			return TABLE_KIND_ID_EDEFAULT == null ? tableKindId != null : !TABLE_KIND_ID_EDEFAULT.equals(tableKindId);
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__TABLE_TYPE:
			return TABLE_TYPE_EDEFAULT == null ? tableType != null : !TABLE_TYPE_EDEFAULT.equals(tableType);
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__CONTEXT_FILTER_RULE:
			return contextFilterRule != CONTEXT_FILTER_RULE_EDEFAULT;
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW__IMPORT_METHOD:
			return importMethod != IMPORT_METHOD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT_1:
			return buildPartTemplateTitle((EObject) arguments.get(0));
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW___GENERATE_BRANCH__EOBJECT:
			return generateBranch((EObject) arguments.get(0));
		case PapyrusNattableDocumentStructureTemplatePackage.PAPYRUS_TABLE_VIEW___GET_MATCHING_TABLES__EOBJECT:
			return getMatchingTables((EObject) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (generate: "); //$NON-NLS-1$
		result.append(generate);
		result.append(", generateTitle: "); //$NON-NLS-1$
		result.append(generateTitle);
		result.append(", customTitle: "); //$NON-NLS-1$
		result.append(customTitle);
		result.append(", tableKindId: "); //$NON-NLS-1$
		result.append(tableKindId);
		result.append(", tableType: "); //$NON-NLS-1$
		result.append(tableType);
		result.append(", contextFilterRule: "); //$NON-NLS-1$
		result.append(contextFilterRule);
		result.append(", importMethod: "); //$NON-NLS-1$
		result.append(importMethod);
		result.append(')');
		return result.toString();
	}

} //PapyrusTableViewImpl
