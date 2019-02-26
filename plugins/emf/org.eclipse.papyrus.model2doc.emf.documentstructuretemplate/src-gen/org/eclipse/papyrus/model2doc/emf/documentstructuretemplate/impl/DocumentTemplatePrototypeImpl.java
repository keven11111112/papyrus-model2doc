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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Template Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentTemplatePrototypeImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentTemplatePrototypeImpl#getDescription <em>Description</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentTemplatePrototypeImpl#getDocumentTemplate <em>Document Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentTemplatePrototypeImpl extends MinimalEObjectImpl.Container implements DocumentTemplatePrototype {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentTemplate() <em>Document Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentTemplate()
	 * @generated
	 * @ordered
	 */
	protected DocumentTemplate documentTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DocumentTemplatePrototypeImpl() {
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
		return DocumentStructureTemplatePackage.Literals.DOCUMENT_TEMPLATE_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__TYPE, oldType, type));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DESCRIPTION, oldDescription, description));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DocumentTemplate getDocumentTemplate() {
		return documentTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetDocumentTemplate(DocumentTemplate newDocumentTemplate, NotificationChain msgs) {
		DocumentTemplate oldDocumentTemplate = documentTemplate;
		documentTemplate = newDocumentTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE, oldDocumentTemplate, newDocumentTemplate);
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
	public void setDocumentTemplate(DocumentTemplate newDocumentTemplate) {
		if (newDocumentTemplate != documentTemplate) {
			NotificationChain msgs = null;
			if (documentTemplate != null) {
				msgs = ((InternalEObject) documentTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE, null, msgs);
			}
			if (newDocumentTemplate != null) {
				msgs = ((InternalEObject) newDocumentTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE, null, msgs);
			}
			msgs = basicSetDocumentTemplate(newDocumentTemplate, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE, newDocumentTemplate, newDocumentTemplate));
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
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE:
			return basicSetDocumentTemplate(null, msgs);
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
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__TYPE:
			return getType();
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DESCRIPTION:
			return getDescription();
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE:
			return getDocumentTemplate();
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
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__TYPE:
			setType((String) newValue);
			return;
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE:
			setDocumentTemplate((DocumentTemplate) newValue);
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
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE:
			setDocumentTemplate((DocumentTemplate) null);
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
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE:
			return documentTemplate != null;
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
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // DocumentTemplatePrototypeImpl
