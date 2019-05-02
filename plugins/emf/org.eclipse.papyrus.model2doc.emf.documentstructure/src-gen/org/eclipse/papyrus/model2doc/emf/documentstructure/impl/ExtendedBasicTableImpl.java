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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.model2doc.core.builtintypes.impl.BasicTableImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicTable;
import org.eclipse.papyrus.model2doc.emf.documentstructure.LeafBodyPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Basic Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedBasicTableImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedBasicTableImpl extends BasicTableImpl implements ExtendedBasicTable {
	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ExtendedBasicTableImpl() {
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
		return DocumentStructurePackage.Literals.EXTENDED_BASIC_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetDataSource(DataSource newDataSource, NotificationChain msgs) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE, oldDataSource, newDataSource);
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
	public void setDataSource(DataSource newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null) {
				msgs = ((InternalEObject) dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE, null, msgs);
			}
			if (newDataSource != null) {
				msgs = ((InternalEObject) newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE, null, msgs);
			}
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE, newDataSource, newDataSource));
		}
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
		case DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE:
			return basicSetDataSource(null, msgs);
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
		case DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE:
			return getDataSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE:
			setDataSource((DataSource) newValue);
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
		case DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE:
			setDataSource((DataSource) null);
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
		case DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE:
			return dataSource != null;
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
		if (baseClass == BodyPart.class) {
			switch (derivedFeatureID) {
			case DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE:
				return DocumentStructurePackage.BODY_PART__DATA_SOURCE;
			default:
				return -1;
			}
		}
		if (baseClass == LeafBodyPart.class) {
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
		if (baseClass == BodyPart.class) {
			switch (baseFeatureID) {
			case DocumentStructurePackage.BODY_PART__DATA_SOURCE:
				return DocumentStructurePackage.EXTENDED_BASIC_TABLE__DATA_SOURCE;
			default:
				return -1;
			}
		}
		if (baseClass == LeafBodyPart.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // ExtendedBasicTableImpl
