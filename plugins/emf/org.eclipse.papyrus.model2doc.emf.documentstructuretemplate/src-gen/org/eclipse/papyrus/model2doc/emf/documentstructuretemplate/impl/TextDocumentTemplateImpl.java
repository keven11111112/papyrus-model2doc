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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.model2doc.core.author.IAuthor;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;

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
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getGraphicalContext <em>Graphical Context</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getDocumentTemplatePrototype <em>Document Template Prototype</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getDescription <em>Description</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getKindId <em>Kind Id</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getDocumentStructureGeneratorConfiguration <em>Document Structure Generator Configuration</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getAuthors <em>Author</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getMainTitle <em>Main Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.TextDocumentTemplateImpl#getDocumentParts <em>Document Part</em>}</li>
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
	 * The cached value of the '{@link #getGraphicalContext() <em>Graphical Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getGraphicalContext()
	 * @generated
	 * @ordered
	 */
	protected EObject graphicalContext;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getKindId() <em>Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getKindId()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKindId() <em>Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getKindId()
	 * @generated
	 * @ordered
	 */
	protected String kindId = KIND_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentStructureGeneratorConfiguration() <em>Document Structure Generator Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentStructureGeneratorConfiguration()
	 * @generated
	 * @ordered
	 */
	protected IDocumentStructureGeneratorConfiguration documentStructureGeneratorConfiguration;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<IAuthor> authors;

	/**
	 * The default value of the '{@link #getMainTitle() <em>Main Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMainTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainTitle() <em>Main Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMainTitle()
	 * @generated
	 * @ordered
	 */
	protected String mainTitle = MAIN_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentParts() <em>Document Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDocumentParts()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentPart> documentParts;

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
	public EObject getGraphicalContext() {
		if (graphicalContext != null && graphicalContext.eIsProxy()) {
			InternalEObject oldGraphicalContext = (InternalEObject) graphicalContext;
			graphicalContext = eResolveProxy(oldGraphicalContext);
			if (graphicalContext != oldGraphicalContext) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT, oldGraphicalContext, graphicalContext));
				}
			}
		}
		return graphicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EObject basicGetGraphicalContext() {
		return graphicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGraphicalContext(EObject newGraphicalContext) {
		EObject oldGraphicalContext = graphicalContext;
		graphicalContext = newGraphicalContext;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT, oldGraphicalContext, graphicalContext));
		}
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DESCRIPTION, oldDescription, description));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getKindId() {
		return kindId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setKindId(String newKindId) {
		String oldKindId = kindId;
		kindId = newKindId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__KIND_ID, oldKindId, kindId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IDocumentStructureGeneratorConfiguration getDocumentStructureGeneratorConfiguration() {
		return documentStructureGeneratorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetDocumentStructureGeneratorConfiguration(IDocumentStructureGeneratorConfiguration newDocumentStructureGeneratorConfiguration, NotificationChain msgs) {
		IDocumentStructureGeneratorConfiguration oldDocumentStructureGeneratorConfiguration = documentStructureGeneratorConfiguration;
		documentStructureGeneratorConfiguration = newDocumentStructureGeneratorConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION, oldDocumentStructureGeneratorConfiguration,
					newDocumentStructureGeneratorConfiguration);
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
	public void setDocumentStructureGeneratorConfiguration(IDocumentStructureGeneratorConfiguration newDocumentStructureGeneratorConfiguration) {
		if (newDocumentStructureGeneratorConfiguration != documentStructureGeneratorConfiguration) {
			NotificationChain msgs = null;
			if (documentStructureGeneratorConfiguration != null) {
				msgs = ((InternalEObject) documentStructureGeneratorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION, null, msgs);
			}
			if (newDocumentStructureGeneratorConfiguration != null) {
				msgs = ((InternalEObject) newDocumentStructureGeneratorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION, null, msgs);
			}
			msgs = basicSetDocumentStructureGeneratorConfiguration(newDocumentStructureGeneratorConfiguration, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION, newDocumentStructureGeneratorConfiguration, newDocumentStructureGeneratorConfiguration));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<IAuthor> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<>(IAuthor.class, this, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getMainTitle() {
		return mainTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMainTitle(String newMainTitle) {
		String oldMainTitle = mainTitle;
		mainTitle = newMainTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__MAIN_TITLE, oldMainTitle, mainTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<DocumentPart> getDocumentParts() {
		if (documentParts == null) {
			documentParts = new EObjectContainmentEList<>(DocumentPart.class, this, DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART);
		}
		return documentParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getType() {
		if (null != getDocumentTemplatePrototype()) {
			return getDocumentTemplatePrototype().getType();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getIconPath() {
		if (null != getDocumentTemplatePrototype()) {
			return getDocumentTemplatePrototype().getIconPath();
		}
		return null;
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION:
			return basicSetDocumentStructureGeneratorConfiguration(null, msgs);
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__AUTHOR:
			return ((InternalEList<?>) getAuthors()).basicRemove(otherEnd, msgs);
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			return ((InternalEList<?>) getDocumentParts()).basicRemove(otherEnd, msgs);
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT:
			if (resolve) {
				return getGraphicalContext();
			}
			return basicGetGraphicalContext();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE:
			if (resolve) {
				return getDocumentTemplatePrototype();
			}
			return basicGetDocumentTemplatePrototype();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__NAME:
			return getName();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DESCRIPTION:
			return getDescription();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__KIND_ID:
			return getKindId();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION:
			return getDocumentStructureGeneratorConfiguration();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__AUTHOR:
			return getAuthors();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__MAIN_TITLE:
			return getMainTitle();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			return getDocumentParts();
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT:
			setGraphicalContext((EObject) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE:
			setDocumentTemplatePrototype((DocumentTemplatePrototype) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__NAME:
			setName((String) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__KIND_ID:
			setKindId((String) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION:
			setDocumentStructureGeneratorConfiguration((IDocumentStructureGeneratorConfiguration) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__AUTHOR:
			getAuthors().clear();
			getAuthors().addAll((Collection<? extends IAuthor>) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__MAIN_TITLE:
			setMainTitle((String) newValue);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			getDocumentParts().clear();
			getDocumentParts().addAll((Collection<? extends DocumentPart>) newValue);
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT:
			setGraphicalContext((EObject) null);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE:
			setDocumentTemplatePrototype((DocumentTemplatePrototype) null);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__KIND_ID:
			setKindId(KIND_ID_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION:
			setDocumentStructureGeneratorConfiguration((IDocumentStructureGeneratorConfiguration) null);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__AUTHOR:
			getAuthors().clear();
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__MAIN_TITLE:
			setMainTitle(MAIN_TITLE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			getDocumentParts().clear();
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT:
			return graphicalContext != null;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE:
			return documentTemplatePrototype != null;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__KIND_ID:
			return KIND_ID_EDEFAULT == null ? kindId != null : !KIND_ID_EDEFAULT.equals(kindId);
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION:
			return documentStructureGeneratorConfiguration != null;
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__AUTHOR:
			return authors != null && !authors.isEmpty();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__MAIN_TITLE:
			return MAIN_TITLE_EDEFAULT == null ? mainTitle != null : !MAIN_TITLE_EDEFAULT.equals(mainTitle);
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART:
			return documentParts != null && !documentParts.isEmpty();
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
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE___GET_TYPE:
			return getType();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE___GET_ICON_PATH:
			return getIconPath();
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", kindId: "); //$NON-NLS-1$
		result.append(kindId);
		result.append(", mainTitle: "); //$NON-NLS-1$
		result.append(mainTitle);
		result.append(')');
		return result.toString();
	}

} // TextDocumentTemplateImpl
