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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gmf.runtime.notation.Diagram;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;

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
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#getDiagramKindId <em>Diagram Kind Id</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#getDiagramType <em>Diagram Type</em>}</li>
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
	public String buildTitle(EObject diagramContext) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE:
			return isGenerate();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__GENERATE_TITLE:
			return isGenerateTitle();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__CUSTOM_TITLE:
			return getCustomTitle();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID:
			return getDiagramKindId();
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE:
			return getDiagramType();
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
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID:
			setDiagramKindId((String) newValue);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE:
			setDiagramType((String) newValue);
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
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID:
			setDiagramKindId(DIAGRAM_KIND_ID_EDEFAULT);
			return;
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE:
			setDiagramType(DIAGRAM_TYPE_EDEFAULT);
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
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_KIND_ID:
			return DIAGRAM_KIND_ID_EDEFAULT == null ? diagramKindId != null : !DIAGRAM_KIND_ID_EDEFAULT.equals(diagramKindId);
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW__DIAGRAM_TYPE:
			return DIAGRAM_TYPE_EDEFAULT == null ? diagramType != null : !DIAGRAM_TYPE_EDEFAULT.equals(diagramType);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW___GET_MATCHING_DIAGRAMS__EOBJECT:
			return getMatchingDiagrams((EObject) arguments.get(0));
		case PapyrusGMFDocumentStructureTemplatePackage.PAPYRUS_GMF_DIAGRAM_VIEW___BUILD_TITLE__EOBJECT:
			return buildTitle((EObject) arguments.get(0));
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
		result.append(", diagramKindId: "); //$NON-NLS-1$
		result.append(diagramKindId);
		result.append(", diagramType: "); //$NON-NLS-1$
		result.append(diagramType);
		result.append(')');
		return result.toString();
	}

} // PapyrusGMFDiagramViewImpl
