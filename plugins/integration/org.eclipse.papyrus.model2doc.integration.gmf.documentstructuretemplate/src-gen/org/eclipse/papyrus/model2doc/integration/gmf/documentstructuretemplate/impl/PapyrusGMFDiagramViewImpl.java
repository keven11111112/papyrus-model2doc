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
package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.IBooleanEObjectExpression;
import org.eclipse.papyrus.model2doc.core.builtintypes.ImageFormat;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.ContextFilterBehavior;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Papyrus GMF Diagram View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#isGenerate <em>Generate</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#isGenerateTitle <em>Generate Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#getCustomTitle <em>Custom Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#getGenerateBranchCondition <em>Generate Branch Condition</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#isGenerateIfEmpty <em>Generate If Empty</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#getDefaultTextIfEmpty <em>Default Text If Empty</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#getDiagramKindId <em>Diagram Kind Id</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#getDiagramType <em>Diagram Type</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#getContextFilterRule <em>Context Filter Rule</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#getDiagramImageMargin <em>Diagram Image Margin</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#getImageFormat <em>Image Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PapyrusGMFDiagramViewImpl extends MinimalEObjectImpl.Container implements PapyrusGMFDiagramView {
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
	 * The default value of the '{@link #getDiagramKindId() <em>Diagram Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDiagramKindId()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_KIND_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramKindId() <em>Diagram Kind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDiagramKindId()
	 * @generated
	 * @ordered
	 */
	protected String diagramKindId = DIAGRAM_KIND_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagramType() <em>Diagram Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDiagramType()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramType() <em>Diagram Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDiagramType()
	 * @generated
	 * @ordered
	 */
	protected String diagramType = DIAGRAM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextFilterRule() <em>Context Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getContextFilterRule()
	 * @generated
	 * @ordered
	 */
	protected static final ContextFilterBehavior CONTEXT_FILTER_RULE_EDEFAULT = ContextFilterBehavior.SEMANTIC_CONTEXT;

	/**
	 * The cached value of the '{@link #getContextFilterRule() <em>Context Filter Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getContextFilterRule()
	 * @generated
	 * @ordered
	 */
	protected ContextFilterBehavior contextFilterRule = CONTEXT_FILTER_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagramImageMargin() <em>Diagram Image Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDiagramImageMargin()
	 * @generated
	 * @ordered
	 */
	protected static final int DIAGRAM_IMAGE_MARGIN_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getDiagramImageMargin() <em>Diagram Image Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDiagramImageMargin()
	 * @generated
	 * @ordered
	 */
	protected int diagramImageMargin = DIAGRAM_IMAGE_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageFormat() <em>Image Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getImageFormat()
	 * @generated
	 * @ordered
	 */
	protected static final ImageFormat IMAGE_FORMAT_EDEFAULT = ImageFormat.SVG;

	/**
	 * The cached value of the '{@link #getImageFormat() <em>Image Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getImageFormat()
	 * @generated
	 * @ordered
	 */
	protected ImageFormat imageFormat = IMAGE_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected PapyrusGMFDiagramViewImpl() {
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
		return PapyrusGMFDocumentStructureTemplatePackage.Literals.PAPYRUS_GMF_DIAGRAM_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE, oldGenerate, generate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_TITLE, oldGenerateTitle, generateTitle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CUSTOM_TITLE, oldCustomTitle, customTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION, oldGenerateBranchCondition, newGenerateBranchCondition);
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
				msgs = ((InternalEObject) generateBranchCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION, null, msgs);
			}
			if (newGenerateBranchCondition != null) {
				msgs = ((InternalEObject) newGenerateBranchCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION, null, msgs);
			}
			msgs = basicSetGenerateBranchCondition(newGenerateBranchCondition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION, newGenerateBranchCondition, newGenerateBranchCondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_IF_EMPTY, oldGenerateIfEmpty, generateIfEmpty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DEFAULT_TEXT_IF_EMPTY, oldDefaultTextIfEmpty, defaultTextIfEmpty));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDiagramKindId() {
		return diagramKindId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDiagramKindId(String newDiagramKindId) {
		String oldDiagramKindId = diagramKindId;
		diagramKindId = newDiagramKindId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID, oldDiagramKindId, diagramKindId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDiagramType() {
		return diagramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDiagramType(String newDiagramType) {
		String oldDiagramType = diagramType;
		diagramType = newDiagramType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE, oldDiagramType, diagramType));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ContextFilterBehavior getContextFilterRule() {
		return contextFilterRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setContextFilterRule(ContextFilterBehavior newContextFilterRule) {
		ContextFilterBehavior oldContextFilterRule = contextFilterRule;
		contextFilterRule = newContextFilterRule == null ? CONTEXT_FILTER_RULE_EDEFAULT : newContextFilterRule;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CONTEXT_FILTER_RULE, oldContextFilterRule, contextFilterRule));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getDiagramImageMargin() {
		return diagramImageMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDiagramImageMargin(int newDiagramImageMargin) {
		int oldDiagramImageMargin = diagramImageMargin;
		diagramImageMargin = newDiagramImageMargin;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_IMAGE_MARGIN, oldDiagramImageMargin, diagramImageMargin));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ImageFormat getImageFormat() {
		return imageFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setImageFormat(ImageFormat newImageFormat) {
		ImageFormat oldImageFormat = imageFormat;
		imageFormat = newImageFormat == null ? IMAGE_FORMAT_EDEFAULT : newImageFormat;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__IMAGE_FORMAT, oldImageFormat, imageFormat));
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
		return org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.internal.operations.PapyrusGMFBodySectionPartTemplateTitleOperations.PAPYRUS_GMF_INSTANCE.buildPartTemplateTitle(this, context);
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
	public EList<Diagram> getMatchingDiagrams(EObject expectedDiagramContext) {
		// TODO: implement this method
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION:
			return basicSetGenerateBranchCondition(null, msgs);
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
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE:
			return isGenerate();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_TITLE:
			return isGenerateTitle();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CUSTOM_TITLE:
			return getCustomTitle();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION:
			return getGenerateBranchCondition();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_IF_EMPTY:
			return isGenerateIfEmpty();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DEFAULT_TEXT_IF_EMPTY:
			return getDefaultTextIfEmpty();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID:
			return getDiagramKindId();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE:
			return getDiagramType();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CONTEXT_FILTER_RULE:
			return getContextFilterRule();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_IMAGE_MARGIN:
			return getDiagramImageMargin();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__IMAGE_FORMAT:
			return getImageFormat();
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
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE:
			setGenerate((Boolean) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_TITLE:
			setGenerateTitle((Boolean) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CUSTOM_TITLE:
			setCustomTitle((String) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION:
			setGenerateBranchCondition((IBooleanEObjectExpression) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_IF_EMPTY:
			setGenerateIfEmpty((Boolean) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DEFAULT_TEXT_IF_EMPTY:
			setDefaultTextIfEmpty((String) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID:
			setDiagramKindId((String) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE:
			setDiagramType((String) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CONTEXT_FILTER_RULE:
			setContextFilterRule((ContextFilterBehavior) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_IMAGE_MARGIN:
			setDiagramImageMargin((Integer) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__IMAGE_FORMAT:
			setImageFormat((ImageFormat) newValue);
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
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE:
			setGenerate(GENERATE_EDEFAULT);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_TITLE:
			setGenerateTitle(GENERATE_TITLE_EDEFAULT);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CUSTOM_TITLE:
			setCustomTitle(CUSTOM_TITLE_EDEFAULT);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION:
			setGenerateBranchCondition((IBooleanEObjectExpression) null);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_IF_EMPTY:
			setGenerateIfEmpty(GENERATE_IF_EMPTY_EDEFAULT);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DEFAULT_TEXT_IF_EMPTY:
			setDefaultTextIfEmpty(DEFAULT_TEXT_IF_EMPTY_EDEFAULT);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID:
			setDiagramKindId(DIAGRAM_KIND_ID_EDEFAULT);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE:
			setDiagramType(DIAGRAM_TYPE_EDEFAULT);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CONTEXT_FILTER_RULE:
			setContextFilterRule(CONTEXT_FILTER_RULE_EDEFAULT);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_IMAGE_MARGIN:
			setDiagramImageMargin(DIAGRAM_IMAGE_MARGIN_EDEFAULT);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__IMAGE_FORMAT:
			setImageFormat(IMAGE_FORMAT_EDEFAULT);
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
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE:
			return generate != GENERATE_EDEFAULT;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_TITLE:
			return generateTitle != GENERATE_TITLE_EDEFAULT;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CUSTOM_TITLE:
			return CUSTOM_TITLE_EDEFAULT == null ? customTitle != null : !CUSTOM_TITLE_EDEFAULT.equals(customTitle);
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION:
			return generateBranchCondition != null;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_IF_EMPTY:
			return generateIfEmpty != GENERATE_IF_EMPTY_EDEFAULT;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DEFAULT_TEXT_IF_EMPTY:
			return DEFAULT_TEXT_IF_EMPTY_EDEFAULT == null ? defaultTextIfEmpty != null : !DEFAULT_TEXT_IF_EMPTY_EDEFAULT.equals(defaultTextIfEmpty);
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID:
			return DIAGRAM_KIND_ID_EDEFAULT == null ? diagramKindId != null : !DIAGRAM_KIND_ID_EDEFAULT.equals(diagramKindId);
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE:
			return DIAGRAM_TYPE_EDEFAULT == null ? diagramType != null : !DIAGRAM_TYPE_EDEFAULT.equals(diagramType);
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CONTEXT_FILTER_RULE:
			return contextFilterRule != CONTEXT_FILTER_RULE_EDEFAULT;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_IMAGE_MARGIN:
			return diagramImageMargin != DIAGRAM_IMAGE_MARGIN_EDEFAULT;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__IMAGE_FORMAT:
			return imageFormat != IMAGE_FORMAT_EDEFAULT;
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
			case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE;
			case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_TITLE:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE;
			case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CUSTOM_TITLE:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE;
			case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_BRANCH_CONDITION;
			case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_IF_EMPTY:
				return DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_IF_EMPTY;
			case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DEFAULT_TEXT_IF_EMPTY:
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
				return PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE:
				return PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_TITLE;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE:
				return PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CUSTOM_TITLE;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_BRANCH_CONDITION:
				return PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_BRANCH_CONDITION;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__GENERATE_IF_EMPTY:
				return PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_IF_EMPTY;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE__DEFAULT_TEXT_IF_EMPTY:
				return PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DEFAULT_TEXT_IF_EMPTY;
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
				return PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT;
			case DocumentStructureTemplatePackage.IBODY_SECTION_PART_TEMPLATE___GENERATE_BRANCH__EOBJECT:
				return PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW___GENERATE_BRANCH__EOBJECT;
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
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW___BUILD_PART_TEMPLATE_TITLE__EOBJECT:
			return buildPartTemplateTitle((EObject) arguments.get(0));
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW___GENERATE_BRANCH__EOBJECT:
			return generateBranch((EObject) arguments.get(0));
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW___GET_MATCHING_DIAGRAMS__EOBJECT:
			return getMatchingDiagrams((EObject) arguments.get(0));
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
		result.append(", diagramKindId: "); //$NON-NLS-1$
		result.append(diagramKindId);
		result.append(", diagramType: "); //$NON-NLS-1$
		result.append(diagramType);
		result.append(", contextFilterRule: "); //$NON-NLS-1$
		result.append(contextFilterRule);
		result.append(", diagramImageMargin: "); //$NON-NLS-1$
		result.append(diagramImageMargin);
		result.append(", imageFormat: "); //$NON-NLS-1$
		result.append(imageFormat);
		result.append(')');
		return result.toString();
	}

} // PapyrusGMFDiagramViewImpl
