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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.IBooleanEObjectExpression;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReference;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceTableView;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype Property Reference Table View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl#isGenerate <em>Generate</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl#isGenerateTitle <em>Generate Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl#getCustomTitle <em>Custom Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl#getGenerateBranchCondition <em>Generate Branch Condition</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl#isGenerateIfEmpty <em>Generate If Empty</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl#getDefaultTextIfEmpty <em>Default Text If Empty</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl#getColumns <em>Columns</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl#isGenerateRowHeader <em>Generate Row Header</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferenceTableViewImpl#isGenerateColumnHeader <em>Generate Column Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypePropertyReferenceTableViewImpl extends StereotypePropertyTemplateImpl implements StereotypePropertyReferenceTableView {
	/**
	 * The default value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected boolean generate = GENERATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateTitle() <em>Generate Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TITLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateTitle() <em>Generate Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTitle = GENERATE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomTitle() <em>Custom Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCustomTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomTitle() <em>Custom Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCustomTitle()
	 * @generated
	 * @ordered
	 */
	protected String customTitle = CUSTOM_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenerateBranchCondition() <em>Generate Branch Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getGenerateBranchCondition()
	 * @generated
	 * @ordered
	 */
	protected IBooleanEObjectExpression generateBranchCondition;

	/**
	 * The default value of the '{@link #isGenerateIfEmpty() <em>Generate If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateIfEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_IF_EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateIfEmpty() <em>Generate If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateIfEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean generateIfEmpty = GENERATE_IF_EMPTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTextIfEmpty() <em>Default Text If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDefaultTextIfEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TEXT_IF_EMPTY_EDEFAULT = "N/A"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDefaultTextIfEmpty() <em>Default Text If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDefaultTextIfEmpty()
	 * @generated
	 * @ordered
	 */
	protected String defaultTextIfEmpty = DEFAULT_TEXT_IF_EMPTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<IColumn> columns;

	/**
	 * The default value of the '{@link #isGenerateRowHeader() <em>Generate Row Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateRowHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_ROW_HEADER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateRowHeader() <em>Generate Row Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateRowHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean generateRowHeader = GENERATE_ROW_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateColumnHeader() <em>Generate Column Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateColumnHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_COLUMN_HEADER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateColumnHeader() <em>Generate Column Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateColumnHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean generateColumnHeader = GENERATE_COLUMN_HEADER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected StereotypePropertyReferenceTableViewImpl() {
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
		return UMLDocumentStructureTemplatePackage.Literals.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerate() {
		return generate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerate(boolean newGenerate) {
		boolean oldGenerate = generate;
		generate = newGenerate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE, oldGenerate, generate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerateTitle() {
		return generateTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerateTitle(boolean newGenerateTitle) {
		boolean oldGenerateTitle = generateTitle;
		generateTitle = newGenerateTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_TITLE, oldGenerateTitle, generateTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getCustomTitle() {
		return customTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCustomTitle(String newCustomTitle) {
		String oldCustomTitle = customTitle;
		customTitle = newCustomTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__CUSTOM_TITLE, oldCustomTitle, customTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IBooleanEObjectExpression getGenerateBranchCondition() {
		return generateBranchCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetGenerateBranchCondition(IBooleanEObjectExpression newGenerateBranchCondition, NotificationChain msgs) {
		IBooleanEObjectExpression oldGenerateBranchCondition = generateBranchCondition;
		generateBranchCondition = newGenerateBranchCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION, oldGenerateBranchCondition, newGenerateBranchCondition);
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
	 *
	 * @generated
	 */
	@Override
	public void setGenerateBranchCondition(IBooleanEObjectExpression newGenerateBranchCondition) {
		if (newGenerateBranchCondition != generateBranchCondition) {
			NotificationChain msgs = null;
			if (generateBranchCondition != null) {
				msgs = ((InternalEObject) generateBranchCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION, null, msgs);
			}
			if (newGenerateBranchCondition != null) {
				msgs = ((InternalEObject) newGenerateBranchCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION, null, msgs);
			}
			msgs = basicSetGenerateBranchCondition(newGenerateBranchCondition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION, newGenerateBranchCondition, newGenerateBranchCondition));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerateIfEmpty() {
		return generateIfEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerateIfEmpty(boolean newGenerateIfEmpty) {
		boolean oldGenerateIfEmpty = generateIfEmpty;
		generateIfEmpty = newGenerateIfEmpty;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_IF_EMPTY, oldGenerateIfEmpty, generateIfEmpty));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDefaultTextIfEmpty() {
		return defaultTextIfEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDefaultTextIfEmpty(String newDefaultTextIfEmpty) {
		String oldDefaultTextIfEmpty = defaultTextIfEmpty;
		defaultTextIfEmpty = newDefaultTextIfEmpty;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__DEFAULT_TEXT_IF_EMPTY, oldDefaultTextIfEmpty, defaultTextIfEmpty));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<IColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<>(IColumn.class, this, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerateRowHeader() {
		return generateRowHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerateRowHeader(boolean newGenerateRowHeader) {
		boolean oldGenerateRowHeader = generateRowHeader;
		generateRowHeader = newGenerateRowHeader;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER, oldGenerateRowHeader, generateRowHeader));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerateColumnHeader() {
		return generateColumnHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerateColumnHeader(boolean newGenerateColumnHeader) {
		boolean oldGenerateColumnHeader = generateColumnHeader;
		generateColumnHeader = newGenerateColumnHeader;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER, oldGenerateColumnHeader, generateColumnHeader));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String buildPartTemplateTitle(final EObject context) {
		return org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.operations.UMLBodySectionPartTemplateTitleHelper.UML_INSTANCE.buildPartTemplateTitle(this, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
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
	 *
	 * @generated
	 */
	@Override
	public EList<EObject> getRows(final EObject context) {
		final java.util.List<Object> values = getStereotypePropertyValues(context);
		final java.util.List<org.eclipse.emf.ecore.EObject> eobjects = values.stream()
				.filter(org.eclipse.emf.ecore.EObject.class::isInstance)
				.map(org.eclipse.emf.ecore.EObject.class::cast)
				.collect(java.util.stream.Collectors.toList());
		return org.eclipse.emf.common.util.ECollections.toEList(eobjects);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String buildRowHeaderLabel(final EObject rowElement) {
		return org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.operations.StereotypePropertyReferenceTableViewOperations.buildRowHeaderLabel(this, rowElement);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
			return basicSetGenerateBranchCondition(null, msgs);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__COLUMNS:
			return ((InternalEList<?>) getColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE:
			return isGenerate();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_TITLE:
			return isGenerateTitle();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__CUSTOM_TITLE:
			return getCustomTitle();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
			return getGenerateBranchCondition();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_IF_EMPTY:
			return isGenerateIfEmpty();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__DEFAULT_TEXT_IF_EMPTY:
			return getDefaultTextIfEmpty();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__COLUMNS:
			return getColumns();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			return isGenerateRowHeader();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
			return isGenerateColumnHeader();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE:
			setGenerate((Boolean) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_TITLE:
			setGenerateTitle((Boolean) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__CUSTOM_TITLE:
			setCustomTitle((String) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
			setGenerateBranchCondition((IBooleanEObjectExpression) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_IF_EMPTY:
			setGenerateIfEmpty((Boolean) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__DEFAULT_TEXT_IF_EMPTY:
			setDefaultTextIfEmpty((String) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends IColumn>) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			setGenerateRowHeader((Boolean) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
			setGenerateColumnHeader((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE:
			setGenerate(GENERATE_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_TITLE:
			setGenerateTitle(GENERATE_TITLE_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__CUSTOM_TITLE:
			setCustomTitle(CUSTOM_TITLE_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
			setGenerateBranchCondition((IBooleanEObjectExpression) null);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_IF_EMPTY:
			setGenerateIfEmpty(GENERATE_IF_EMPTY_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__DEFAULT_TEXT_IF_EMPTY:
			setDefaultTextIfEmpty(DEFAULT_TEXT_IF_EMPTY_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__COLUMNS:
			getColumns().clear();
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			setGenerateRowHeader(GENERATE_ROW_HEADER_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
			setGenerateColumnHeader(GENERATE_COLUMN_HEADER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE:
			return generate != GENERATE_EDEFAULT;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_TITLE:
			return generateTitle != GENERATE_TITLE_EDEFAULT;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__CUSTOM_TITLE:
			return CUSTOM_TITLE_EDEFAULT == null ? customTitle != null : !CUSTOM_TITLE_EDEFAULT.equals(customTitle);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
			return generateBranchCondition != null;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_IF_EMPTY:
			return generateIfEmpty != GENERATE_IF_EMPTY_EDEFAULT;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__DEFAULT_TEXT_IF_EMPTY:
			return DEFAULT_TEXT_IF_EMPTY_EDEFAULT == null ? defaultTextIfEmpty != null : !DEFAULT_TEXT_IF_EMPTY_EDEFAULT.equals(defaultTextIfEmpty);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__COLUMNS:
			return columns != null && !columns.isEmpty();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			return generateRowHeader != GENERATE_ROW_HEADER_EDEFAULT;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
			return generateColumnHeader != GENERATE_COLUMN_HEADER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IBodySectionPartTemplate.class) {
			switch (derivedFeatureID) {
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE;
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_TITLE:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE;
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__CUSTOM_TITLE:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE;
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_BRANCH_CONDITION;
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_IF_EMPTY:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_IF_EMPTY;
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__DEFAULT_TEXT_IF_EMPTY:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__DEFAULT_TEXT_IF_EMPTY;
			default:
				return -1;
			}
		}
		if (baseClass == IBodyPartTemplate.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ILeafBodyPartTemplate.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ITemplatePartView.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ITableView.class) {
			switch (derivedFeatureID) {
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__COLUMNS:
				return DocumentStructureTemplatePackage.ITABLE_VIEW__COLUMNS;
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
				return DocumentStructureTemplatePackage.ITABLE_VIEW__GENERATE_ROW_HEADER;
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
				return DocumentStructureTemplatePackage.ITABLE_VIEW__GENERATE_COLUMN_HEADER;
			default:
				return -1;
			}
		}
		if (baseClass == IUMLBodyPartTemplateTitle.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == StereotypePropertyReference.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IBodySectionPartTemplate.class) {
			switch (baseFeatureID) {
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_TITLE;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__CUSTOM_TITLE;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_BRANCH_CONDITION:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_BRANCH_CONDITION;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_IF_EMPTY:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_IF_EMPTY;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__DEFAULT_TEXT_IF_EMPTY:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__DEFAULT_TEXT_IF_EMPTY;
			default:
				return -1;
			}
		}
		if (baseClass == IBodyPartTemplate.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ILeafBodyPartTemplate.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ITemplatePartView.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ITableView.class) {
			switch (baseFeatureID) {
			case DocumentStructureTemplatePackage.ITABLE_VIEW__COLUMNS:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__COLUMNS;
			case DocumentStructureTemplatePackage.ITABLE_VIEW__GENERATE_ROW_HEADER:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER;
			case DocumentStructureTemplatePackage.ITABLE_VIEW__GENERATE_COLUMN_HEADER:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER;
			default:
				return -1;
			}
		}
		if (baseClass == IUMLBodyPartTemplateTitle.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == StereotypePropertyReference.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IBodySectionPartTemplate.class) {
			switch (baseOperationID) {
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE___GENERATE_BRANCH__EOBJECT:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GENERATE_BRANCH__EOBJECT;
			default:
				return -1;
			}
		}
		if (baseClass == IBodyPartTemplate.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == ILeafBodyPartTemplate.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == ITemplatePartView.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == ITableView.class) {
			switch (baseOperationID) {
			case DocumentStructureTemplatePackage.ITABLE_VIEW___GET_ROWS__EOBJECT:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GET_ROWS__EOBJECT;
			case DocumentStructureTemplatePackage.ITABLE_VIEW___BUILD_ROW_HEADER_LABEL__EOBJECT:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___BUILD_ROW_HEADER_LABEL__EOBJECT;
			default:
				return -1;
			}
		}
		if (baseClass == IUMLBodyPartTemplateTitle.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == StereotypePropertyReference.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT:
			return buildPartTemplateTitle((EObject) arguments.get(0));
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GENERATE_BRANCH__EOBJECT:
			return generateBranch((EObject) arguments.get(0));
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___GET_ROWS__EOBJECT:
			return getRows((EObject) arguments.get(0));
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW___BUILD_ROW_HEADER_LABEL__EOBJECT:
			return buildRowHeaderLabel((EObject) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
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
		result.append(", generateIfEmpty: "); //$NON-NLS-1$
		result.append(generateIfEmpty);
		result.append(", defaultTextIfEmpty: "); //$NON-NLS-1$
		result.append(defaultTextIfEmpty);
		result.append(", generateRowHeader: "); //$NON-NLS-1$
		result.append(generateRowHeader);
		result.append(", generateColumnHeader: "); //$NON-NLS-1$
		result.append(generateColumnHeader);
		result.append(')');
		return result.toString();
	}

} // StereotypePropertyReferenceTableViewImpl
