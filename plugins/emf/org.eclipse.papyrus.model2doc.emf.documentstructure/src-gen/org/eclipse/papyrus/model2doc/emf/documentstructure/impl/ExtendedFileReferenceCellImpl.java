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

import org.eclipse.papyrus.model2doc.core.builtintypes.impl.FileReferenceCellImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedFileReferenceCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended File Reference Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.ExtendedFileReferenceCellImpl#getDatasource <em>Datasource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedFileReferenceCellImpl extends FileReferenceCellImpl implements ExtendedFileReferenceCell {
	/**
	 * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDatasource()
	 * @generated
	 * @ordered
	 */
	protected DataSource datasource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ExtendedFileReferenceCellImpl() {
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
		return DocumentStructurePackage.Literals.EXTENDED_FILE_REFERENCE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DataSource getDatasource() {
		return datasource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetDatasource(DataSource newDatasource, NotificationChain msgs) {
		DataSource oldDatasource = datasource;
		datasource = newDatasource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.EXTENDED_FILE_REFERENCE_CELL__DATASOURCE, oldDatasource, newDatasource);
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
	public void setDatasource(DataSource newDatasource) {
		if (newDatasource != datasource) {
			NotificationChain msgs = null;
			if (datasource != null) {
				msgs = ((InternalEObject) datasource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.EXTENDED_FILE_REFERENCE_CELL__DATASOURCE, null, msgs);
			}
			if (newDatasource != null) {
				msgs = ((InternalEObject) newDatasource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.EXTENDED_FILE_REFERENCE_CELL__DATASOURCE, null, msgs);
			}
			msgs = basicSetDatasource(newDatasource, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.EXTENDED_FILE_REFERENCE_CELL__DATASOURCE, newDatasource, newDatasource));
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
		case DocumentStructurePackage.EXTENDED_FILE_REFERENCE_CELL__DATASOURCE:
			return basicSetDatasource(null, msgs);
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
		case DocumentStructurePackage.EXTENDED_FILE_REFERENCE_CELL__DATASOURCE:
			return getDatasource();
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
		case DocumentStructurePackage.EXTENDED_FILE_REFERENCE_CELL__DATASOURCE:
			setDatasource((DataSource) newValue);
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
		case DocumentStructurePackage.EXTENDED_FILE_REFERENCE_CELL__DATASOURCE:
			setDatasource((DataSource) null);
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
		case DocumentStructurePackage.EXTENDED_FILE_REFERENCE_CELL__DATASOURCE:
			return datasource != null;
		}
		return super.eIsSet(featureID);
	}

} // ExtendedFileReferenceCellImpl
