/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.documentview.internal.impl;

import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.documentview.DocumentViewPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl#getDocumentKind <em>Document Kind</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl#getDocumentRepresentationKindId <em>Document Representation Kind Id</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl#getDOI <em>DOI</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl#getTemplateStyleFileURI <em>Template Style File URI</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.papyrus.model2doc.documentview.internal.impl.DocumentImpl#getGeneratedDocumentFileURI <em>Generated Document File URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentKind() <em>Document Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentKind()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentKind() <em>Document Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentKind()
	 * @generated
	 * @ordered
	 */
	protected String documentKind = DOCUMENT_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentRepresentationKindId() <em>Document Representation Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRepresentationKindId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_REPRESENTATION_KIND_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentRepresentationKindId() <em>Document Representation Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRepresentationKindId()
	 * @generated
	 * @ordered
	 */
	protected String documentRepresentationKindId = DOCUMENT_REPRESENTATION_KIND_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDOI() <em>DOI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDOI()
	 * @generated
	 * @ordered
	 */
	protected static final String DOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDOI() <em>DOI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDOI()
	 * @generated
	 * @ordered
	 */
	protected String doi = DOI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateStyleFileURI() <em>Template Style File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateStyleFileURI()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_STYLE_FILE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateStyleFileURI() <em>Template Style File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateStyleFileURI()
	 * @generated
	 * @ordered
	 */
	protected String templateStyleFileURI = TEMPLATE_STYLE_FILE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected EObject owner;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EObject context;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedDocumentFileURI() <em>Generated Document File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedDocumentFileURI()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_DOCUMENT_FILE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratedDocumentFileURI() <em>Generated Document File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedDocumentFileURI()
	 * @generated
	 * @ordered
	 */
	protected String generatedDocumentFileURI = GENERATED_DOCUMENT_FILE_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentViewPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentViewPackage.DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentKind() {
		return documentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentKind(String newDocumentKind) {
		String oldDocumentKind = documentKind;
		documentKind = newDocumentKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentViewPackage.DOCUMENT__DOCUMENT_KIND, oldDocumentKind, documentKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentRepresentationKindId() {
		return documentRepresentationKindId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentRepresentationKindId(String newDocumentRepresentationKindId) {
		String oldDocumentRepresentationKindId = documentRepresentationKindId;
		documentRepresentationKindId = newDocumentRepresentationKindId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentViewPackage.DOCUMENT__DOCUMENT_REPRESENTATION_KIND_ID, oldDocumentRepresentationKindId, documentRepresentationKindId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDOI() {
		return doi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDOI(String newDOI) {
		String oldDOI = doi;
		doi = newDOI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentViewPackage.DOCUMENT__DOI, oldDOI, doi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateStyleFileURI() {
		return templateStyleFileURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateStyleFileURI(String newTemplateStyleFileURI) {
		String oldTemplateStyleFileURI = templateStyleFileURI;
		templateStyleFileURI = newTemplateStyleFileURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentViewPackage.DOCUMENT__TEMPLATE_STYLE_FILE_URI, oldTemplateStyleFileURI, templateStyleFileURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentViewPackage.DOCUMENT__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(EObject newOwner) {
		EObject oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentViewPackage.DOCUMENT__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentViewPackage.DOCUMENT__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(EObject newContext) {
		EObject oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentViewPackage.DOCUMENT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentViewPackage.DOCUMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratedDocumentFileURI() {
		return generatedDocumentFileURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedDocumentFileURI(String newGeneratedDocumentFileURI) {
		String oldGeneratedDocumentFileURI = generatedDocumentFileURI;
		generatedDocumentFileURI = newGeneratedDocumentFileURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentViewPackage.DOCUMENT__GENERATED_DOCUMENT_FILE_URI, oldGeneratedDocumentFileURI, generatedDocumentFileURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocumentViewPackage.DOCUMENT__NAME:
				return getName();
			case DocumentViewPackage.DOCUMENT__DOCUMENT_KIND:
				return getDocumentKind();
			case DocumentViewPackage.DOCUMENT__DOCUMENT_REPRESENTATION_KIND_ID:
				return getDocumentRepresentationKindId();
			case DocumentViewPackage.DOCUMENT__DOI:
				return getDOI();
			case DocumentViewPackage.DOCUMENT__TEMPLATE_STYLE_FILE_URI:
				return getTemplateStyleFileURI();
			case DocumentViewPackage.DOCUMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case DocumentViewPackage.DOCUMENT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case DocumentViewPackage.DOCUMENT__DESCRIPTION:
				return getDescription();
			case DocumentViewPackage.DOCUMENT__GENERATED_DOCUMENT_FILE_URI:
				return getGeneratedDocumentFileURI();
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
			case DocumentViewPackage.DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case DocumentViewPackage.DOCUMENT__DOCUMENT_KIND:
				setDocumentKind((String)newValue);
				return;
			case DocumentViewPackage.DOCUMENT__DOCUMENT_REPRESENTATION_KIND_ID:
				setDocumentRepresentationKindId((String)newValue);
				return;
			case DocumentViewPackage.DOCUMENT__DOI:
				setDOI((String)newValue);
				return;
			case DocumentViewPackage.DOCUMENT__TEMPLATE_STYLE_FILE_URI:
				setTemplateStyleFileURI((String)newValue);
				return;
			case DocumentViewPackage.DOCUMENT__OWNER:
				setOwner((EObject)newValue);
				return;
			case DocumentViewPackage.DOCUMENT__CONTEXT:
				setContext((EObject)newValue);
				return;
			case DocumentViewPackage.DOCUMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DocumentViewPackage.DOCUMENT__GENERATED_DOCUMENT_FILE_URI:
				setGeneratedDocumentFileURI((String)newValue);
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
			case DocumentViewPackage.DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DocumentViewPackage.DOCUMENT__DOCUMENT_KIND:
				setDocumentKind(DOCUMENT_KIND_EDEFAULT);
				return;
			case DocumentViewPackage.DOCUMENT__DOCUMENT_REPRESENTATION_KIND_ID:
				setDocumentRepresentationKindId(DOCUMENT_REPRESENTATION_KIND_ID_EDEFAULT);
				return;
			case DocumentViewPackage.DOCUMENT__DOI:
				setDOI(DOI_EDEFAULT);
				return;
			case DocumentViewPackage.DOCUMENT__TEMPLATE_STYLE_FILE_URI:
				setTemplateStyleFileURI(TEMPLATE_STYLE_FILE_URI_EDEFAULT);
				return;
			case DocumentViewPackage.DOCUMENT__OWNER:
				setOwner((EObject)null);
				return;
			case DocumentViewPackage.DOCUMENT__CONTEXT:
				setContext((EObject)null);
				return;
			case DocumentViewPackage.DOCUMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DocumentViewPackage.DOCUMENT__GENERATED_DOCUMENT_FILE_URI:
				setGeneratedDocumentFileURI(GENERATED_DOCUMENT_FILE_URI_EDEFAULT);
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
			case DocumentViewPackage.DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DocumentViewPackage.DOCUMENT__DOCUMENT_KIND:
				return DOCUMENT_KIND_EDEFAULT == null ? documentKind != null : !DOCUMENT_KIND_EDEFAULT.equals(documentKind);
			case DocumentViewPackage.DOCUMENT__DOCUMENT_REPRESENTATION_KIND_ID:
				return DOCUMENT_REPRESENTATION_KIND_ID_EDEFAULT == null ? documentRepresentationKindId != null : !DOCUMENT_REPRESENTATION_KIND_ID_EDEFAULT.equals(documentRepresentationKindId);
			case DocumentViewPackage.DOCUMENT__DOI:
				return DOI_EDEFAULT == null ? doi != null : !DOI_EDEFAULT.equals(doi);
			case DocumentViewPackage.DOCUMENT__TEMPLATE_STYLE_FILE_URI:
				return TEMPLATE_STYLE_FILE_URI_EDEFAULT == null ? templateStyleFileURI != null : !TEMPLATE_STYLE_FILE_URI_EDEFAULT.equals(templateStyleFileURI);
			case DocumentViewPackage.DOCUMENT__OWNER:
				return owner != null;
			case DocumentViewPackage.DOCUMENT__CONTEXT:
				return context != null;
			case DocumentViewPackage.DOCUMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DocumentViewPackage.DOCUMENT__GENERATED_DOCUMENT_FILE_URI:
				return GENERATED_DOCUMENT_FILE_URI_EDEFAULT == null ? generatedDocumentFileURI != null : !GENERATED_DOCUMENT_FILE_URI_EDEFAULT.equals(generatedDocumentFileURI);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", documentKind: "); //$NON-NLS-1$
		result.append(documentKind);
		result.append(", documentRepresentationKindId: "); //$NON-NLS-1$
		result.append(documentRepresentationKindId);
		result.append(", DOI: "); //$NON-NLS-1$
		result.append(doi);
		result.append(", templateStyleFileURI: "); //$NON-NLS-1$
		result.append(templateStyleFileURI);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", generatedDocumentFileURI: "); //$NON-NLS-1$
		result.append(generatedDocumentFileURI);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
