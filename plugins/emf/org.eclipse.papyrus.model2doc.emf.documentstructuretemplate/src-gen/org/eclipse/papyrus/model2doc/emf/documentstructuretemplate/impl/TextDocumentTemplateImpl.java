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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Document Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getSemanticContext <em>Semantic Context</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getGraphicalContent <em>Graphical Content</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getDocumentTemplatePrototype <em>Document Template Prototype</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getDocumentPart <em>Document Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextDocumentTemplateImpl extends MinimalEObjectImpl.Container implements TextDocumentTemplate {
	/**
	 * The cached value of the '{@link #getSemanticContext() <em>Semantic Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSemanticContext()
	 * @generated
	 * @ordered
	 */
	protected EObject semanticContext;

	/**
	 * The cached value of the '{@link #getGraphicalContent() <em>Graphical Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getGraphicalContent()
	 * @generated
	 * @ordered
	 */
	protected EObject graphicalContent;

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
	 * The cached value of the '{@link #getDocumentTemplatePrototype() <em>Document Template Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentTemplatePrototype()
	 * @generated
	 * @ordered
	 */
	protected DocumentTemplatePrototype documentTemplatePrototype;
	/**
	 * The cached value of the '{@link #getDocumentPart() <em>Document Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentPart()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentPart> documentPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TextDocumentTemplateImpl() {
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
		return DocumentStructureTemplatePackage.Literals.TEXT_DOCUMENT_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject getSemanticContext() {
		if (semanticContext != null && semanticContext.eIsProxy()) {
			InternalEObject oldSemanticContext = (InternalEObject) semanticContext;
			semanticContext = eResolveProxy(oldSemanticContext);
			if (semanticContext != oldSemanticContext) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT, oldSemanticContext, semanticContext));
				}
			}
		}
		return semanticContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EObject basicGetSemanticContext() {
		return semanticContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSemanticContext(EObject newSemanticContext) {
		EObject oldSemanticContext = semanticContext;
		semanticContext = newSemanticContext;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT, oldSemanticContext, semanticContext));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject getGraphicalContent() {
		if (graphicalContent != null && graphicalContent.eIsProxy()) {
			InternalEObject oldGraphicalContent = (InternalEObject) graphicalContent;
			graphicalContent = eResolveProxy(oldGraphicalContent);
			if (graphicalContent != oldGraphicalContent) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTENT, oldGraphicalContent, graphicalContent));
				}
			}
		}
		return graphicalContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EObject basicGetGraphicalContent() {
		return graphicalContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGraphicalContent(EObject newGraphicalContent) {
		EObject oldGraphicalContent = graphicalContent;
		graphicalContent = newGraphicalContent;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTENT, oldGraphicalContent, graphicalContent));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getType() {
		// TODO: implement this method to return the 'Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DocumentTemplatePrototype getDocumentTemplatePrototype() {
		if (documentTemplatePrototype != null && documentTemplatePrototype.eIsProxy()) {
			InternalEObject oldDocumentTemplatePrototype = (InternalEObject) documentTemplatePrototype;
			documentTemplatePrototype = (DocumentTemplatePrototype) eResolveProxy(oldDocumentTemplatePrototype);
			if (documentTemplatePrototype != oldDocumentTemplatePrototype) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE, oldDocumentTemplatePrototype, documentTemplatePrototype));
				}
			}
		}
		return documentTemplatePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DocumentTemplatePrototype basicGetDocumentTemplatePrototype() {
		return documentTemplatePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDocumentTemplatePrototype(DocumentTemplatePrototype newDocumentTemplatePrototype) {
		DocumentTemplatePrototype oldDocumentTemplatePrototype = documentTemplatePrototype;
		documentTemplatePrototype = newDocumentTemplatePrototype;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE, oldDocumentTemplatePrototype, documentTemplatePrototype));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<DocumentPart> getDocumentPart() {
		if (documentPart == null) {
			documentPart = new EObjectContainmentEList<>(DocumentPart.class, this, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART);
		}
		return documentPart;
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			return ((InternalEList<?>) getDocumentPart()).basicRemove(otherEnd, msgs);
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT:
			if (resolve) {
				return getSemanticContext();
			}
			return basicGetSemanticContext();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTENT:
			if (resolve) {
				return getGraphicalContent();
			}
			return basicGetGraphicalContent();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__TYPE:
			return getType();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE:
			if (resolve) {
				return getDocumentTemplatePrototype();
			}
			return basicGetDocumentTemplatePrototype();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			return getDocumentPart();
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT:
			setSemanticContext((EObject) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTENT:
			setGraphicalContent((EObject) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE:
			setDocumentTemplatePrototype((DocumentTemplatePrototype) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			getDocumentPart().clear();
			getDocumentPart().addAll((Collection<? extends DocumentPart>) newValue);
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT:
			setSemanticContext((EObject) null);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTENT:
			setGraphicalContent((EObject) null);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE:
			setDocumentTemplatePrototype((DocumentTemplatePrototype) null);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			getDocumentPart().clear();
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT:
			return semanticContext != null;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTENT:
			return graphicalContent != null;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__TYPE:
			return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE:
			return documentTemplatePrototype != null;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			return documentPart != null && !documentPart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TextDocumentTemplateImpl
