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
package org.eclipse.papyrus.model2doc.core.builtintypes.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage;
import org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation;
import org.eclipse.papyrus.model2doc.core.builtintypes.FileReferenceCell;
import org.eclipse.papyrus.model2doc.core.builtintypes.IFileReference;

import org.eclipse.papyrus.model2doc.core.styles.NamedStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Reference Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.FileReferenceCellImpl#getNamedStyles <em>Named Styles</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.FileReferenceCellImpl#getLocation <em>Location</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.core.builtintypes.impl.FileReferenceCellImpl#getFileReference <em>File Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileReferenceCellImpl extends MinimalEObjectImpl.Container implements FileReferenceCell {
	/**
	 * The cached value of the '{@link #getNamedStyles() <em>Named Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getNamedStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedStyle> namedStyles;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final CellLocation LOCATION_EDEFAULT = CellLocation.BODY;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected CellLocation location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFileReference() <em>File Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFileReference()
	 * @generated
	 * @ordered
	 */
	protected IFileReference fileReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FileReferenceCellImpl() {
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
		return BuiltInTypesPackage.Literals.FILE_REFERENCE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<NamedStyle> getNamedStyles() {
		if (namedStyles == null) {
			namedStyles = new EObjectContainmentEList<>(NamedStyle.class, this, BuiltInTypesPackage.FILE_REFERENCE_CELL__NAMED_STYLES);
		}
		return namedStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public CellLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLocation(CellLocation newLocation) {
		CellLocation oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BuiltInTypesPackage.FILE_REFERENCE_CELL__LOCATION, oldLocation, location));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IFileReference getFileReference() {
		return fileReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetFileReference(IFileReference newFileReference, NotificationChain msgs) {
		IFileReference oldFileReference = fileReference;
		fileReference = newFileReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuiltInTypesPackage.FILE_REFERENCE_CELL__FILE_REFERENCE, oldFileReference, newFileReference);
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
	public void setFileReference(IFileReference newFileReference) {
		if (newFileReference != fileReference) {
			NotificationChain msgs = null;
			if (fileReference != null) {
				msgs = ((InternalEObject) fileReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuiltInTypesPackage.FILE_REFERENCE_CELL__FILE_REFERENCE, null, msgs);
			}
			if (newFileReference != null) {
				msgs = ((InternalEObject) newFileReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuiltInTypesPackage.FILE_REFERENCE_CELL__FILE_REFERENCE, null, msgs);
			}
			msgs = basicSetFileReference(newFileReference, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, BuiltInTypesPackage.FILE_REFERENCE_CELL__FILE_REFERENCE, newFileReference, newFileReference));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NamedStyle getNamedStyle(final String name) {
		return org.eclipse.papyrus.model2doc.core.styles.internal.operations.NamedStyleOperations.INSTANCE.getNamedStyle(getNamedStyles(), name);
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
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__NAMED_STYLES:
			return ((InternalEList<?>) getNamedStyles()).basicRemove(otherEnd, msgs);
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__FILE_REFERENCE:
			return basicSetFileReference(null, msgs);
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
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__NAMED_STYLES:
			return getNamedStyles();
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__LOCATION:
			return getLocation();
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__FILE_REFERENCE:
			return getFileReference();
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
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__NAMED_STYLES:
			getNamedStyles().clear();
			getNamedStyles().addAll((Collection<? extends NamedStyle>) newValue);
			return;
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__LOCATION:
			setLocation((CellLocation) newValue);
			return;
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__FILE_REFERENCE:
			setFileReference((IFileReference) newValue);
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
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__NAMED_STYLES:
			getNamedStyles().clear();
			return;
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__FILE_REFERENCE:
			setFileReference((IFileReference) null);
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
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__NAMED_STYLES:
			return namedStyles != null && !namedStyles.isEmpty();
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__LOCATION:
			return location != LOCATION_EDEFAULT;
		case BuiltInTypesPackage.FILE_REFERENCE_CELL__FILE_REFERENCE:
			return fileReference != null;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case BuiltInTypesPackage.FILE_REFERENCE_CELL___GET_NAMED_STYLE__STRING:
			return getNamedStyle((String) arguments.get(0));
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
		result.append(" (location: "); //$NON-NLS-1$
		result.append(location);
		result.append(')');
		return result.toString();
	}

} // FileReferenceCellImpl
