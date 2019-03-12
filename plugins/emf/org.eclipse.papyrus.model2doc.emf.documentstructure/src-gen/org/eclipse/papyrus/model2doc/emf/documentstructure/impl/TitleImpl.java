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

import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Text;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TitleImpl#getDataSource <em>Data Source</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TitleImpl#getSubBodyPart <em>Sub Body Part</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TitleImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitleImpl extends MinimalEObjectImpl.Container implements Title {
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
	 * The cached value of the '{@link #getSubBodyPart() <em>Sub Body Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSubBodyPart()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyPart> subBodyPart;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Text text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TitleImpl() {
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
		return DocumentStructurePackage.Literals.TITLE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TITLE__DATA_SOURCE, oldDataSource, newDataSource);
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
				msgs = ((InternalEObject) dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TITLE__DATA_SOURCE, null, msgs);
			}
			if (newDataSource != null) {
				msgs = ((InternalEObject) newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TITLE__DATA_SOURCE, null, msgs);
			}
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TITLE__DATA_SOURCE, newDataSource, newDataSource));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<BodyPart> getSubBodyPart() {
		if (subBodyPart == null) {
			subBodyPart = new EObjectContainmentEList<>(BodyPart.class, this, DocumentStructurePackage.TITLE__SUB_BODY_PART);
		}
		return subBodyPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Text getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetText(Text newText, NotificationChain msgs) {
		Text oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TITLE__TEXT, oldText, newText);
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
	public void setText(Text newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null) {
				msgs = ((InternalEObject) text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TITLE__TEXT, null, msgs);
			}
			if (newText != null) {
				msgs = ((InternalEObject) newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructurePackage.TITLE__TEXT, null, msgs);
			}
			msgs = basicSetText(newText, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructurePackage.TITLE__TEXT, newText, newText));
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
		case DocumentStructurePackage.TITLE__DATA_SOURCE:
			return basicSetDataSource(null, msgs);
		case DocumentStructurePackage.TITLE__SUB_BODY_PART:
			return ((InternalEList<?>) getSubBodyPart()).basicRemove(otherEnd, msgs);
		case DocumentStructurePackage.TITLE__TEXT:
			return basicSetText(null, msgs);
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
		case DocumentStructurePackage.TITLE__DATA_SOURCE:
			return getDataSource();
		case DocumentStructurePackage.TITLE__SUB_BODY_PART:
			return getSubBodyPart();
		case DocumentStructurePackage.TITLE__TEXT:
			return getText();
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
		case DocumentStructurePackage.TITLE__DATA_SOURCE:
			setDataSource((DataSource) newValue);
			return;
		case DocumentStructurePackage.TITLE__SUB_BODY_PART:
			getSubBodyPart().clear();
			getSubBodyPart().addAll((Collection<? extends BodyPart>) newValue);
			return;
		case DocumentStructurePackage.TITLE__TEXT:
			setText((Text) newValue);
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
		case DocumentStructurePackage.TITLE__DATA_SOURCE:
			setDataSource((DataSource) null);
			return;
		case DocumentStructurePackage.TITLE__SUB_BODY_PART:
			getSubBodyPart().clear();
			return;
		case DocumentStructurePackage.TITLE__TEXT:
			setText((Text) null);
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
		case DocumentStructurePackage.TITLE__DATA_SOURCE:
			return dataSource != null;
		case DocumentStructurePackage.TITLE__SUB_BODY_PART:
			return subBodyPart != null && !subBodyPart.isEmpty();
		case DocumentStructurePackage.TITLE__TEXT:
			return text != null;
		}
		return super.eIsSet(featureID);
	}

} // TitleImpl
