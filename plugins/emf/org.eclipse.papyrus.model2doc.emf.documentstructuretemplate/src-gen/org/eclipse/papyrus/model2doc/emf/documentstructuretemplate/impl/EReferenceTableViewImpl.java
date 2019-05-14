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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl;

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

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReference Table View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#getColumns <em>Columns</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#isGenerateRowHeader <em>Generate Row Header</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#isGenerateColumnHeader <em>Generate Column Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EReferenceTableViewImpl extends EReferenceBodySectionPartTemplateImpl implements EReferenceTableView {
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
	protected EReferenceTableViewImpl() {
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
		return DocumentStructureTemplatePackage.Literals.EREFERENCE_TABLE_VIEW;
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
			columns = new EObjectContainmentEList<>(IColumn.class, this, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER, oldGenerateRowHeader, generateRowHeader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER, oldGenerateColumnHeader, generateColumnHeader));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EObject> getRows(final EObject context) {
		return getEReferenceValues(context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String buildRowHeaderLabel(final EObject rowElement) {
		return buildEReferenceValueLabel(rowElement);
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
			return getColumns();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			return isGenerateRowHeader();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends IColumn>) newValue);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			setGenerateRowHeader((Boolean) newValue);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
			getColumns().clear();
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			setGenerateRowHeader(GENERATE_ROW_HEADER_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
			return columns != null && !columns.isEmpty();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			return generateRowHeader != GENERATE_ROW_HEADER_EDEFAULT;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
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
			case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
				return DocumentStructureTemplatePackage.ITABLE_VIEW__COLUMNS;
			case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
				return DocumentStructureTemplatePackage.ITABLE_VIEW__GENERATE_ROW_HEADER;
			case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
				return DocumentStructureTemplatePackage.ITABLE_VIEW__GENERATE_COLUMN_HEADER;
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
				return DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS;
			case DocumentStructureTemplatePackage.ITABLE_VIEW__GENERATE_ROW_HEADER:
				return DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER;
			case DocumentStructureTemplatePackage.ITABLE_VIEW__GENERATE_COLUMN_HEADER:
				return DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER;
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
				return DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW___GET_ROWS__EOBJECT;
			case DocumentStructureTemplatePackage.ITABLE_VIEW___BUILD_ROW_HEADER_LABEL__EOBJECT:
				return DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW___BUILD_ROW_HEADER_LABEL__EOBJECT;
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW___GET_ROWS__EOBJECT:
			return getRows((EObject) arguments.get(0));
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW___BUILD_ROW_HEADER_LABEL__EOBJECT:
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
		result.append(" (generateRowHeader: "); //$NON-NLS-1$
		result.append(generateRowHeader);
		result.append(", generateColumnHeader: "); //$NON-NLS-1$
		result.append(generateColumnHeader);
		result.append(')');
		return result.toString();
	}

} // EReferenceTableViewImpl
