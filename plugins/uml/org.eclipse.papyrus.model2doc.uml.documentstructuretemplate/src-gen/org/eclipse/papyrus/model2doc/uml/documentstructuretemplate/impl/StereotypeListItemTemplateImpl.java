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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IRootListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubListItemTemplate;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeListItemTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype List Item Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeListItemTemplateImpl#isGenerateItem <em>Generate Item</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeListItemTemplateImpl#getCustomItemLabel <em>Custom Item Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypeListItemTemplateImpl#getListItemTemplates <em>List Item Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypeListItemTemplateImpl extends MandatoryStereotypeWithEClassTemplateImpl implements StereotypeListItemTemplate {
	/**
	 * The default value of the '{@link #isGenerateItem() <em>Generate Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isGenerateItem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_ITEM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateItem() <em>Generate Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isGenerateItem()
	 * @generated
	 * @ordered
	 */
	protected boolean generateItem = GENERATE_ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomItemLabel() <em>Custom Item Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCustomItemLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_ITEM_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomItemLabel() <em>Custom Item Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCustomItemLabel()
	 * @generated
	 * @ordered
	 */
	protected String customItemLabel = CUSTOM_ITEM_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListItemTemplates() <em>List Item Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getListItemTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<IRootListItemTemplate> listItemTemplates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StereotypeListItemTemplateImpl() {
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
		return UMLDocumentStructureTemplatePackage.Literals.STEREOTYPE_LIST_ITEM_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isGenerateItem() {
		return generateItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setGenerateItem(boolean newGenerateItem) {
		boolean oldGenerateItem = generateItem;
		generateItem = newGenerateItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__GENERATE_ITEM, oldGenerateItem, generateItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCustomItemLabel() {
		return customItemLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCustomItemLabel(String newCustomItemLabel) {
		String oldCustomItemLabel = customItemLabel;
		customItemLabel = newCustomItemLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL, oldCustomItemLabel, customItemLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<IRootListItemTemplate> getListItemTemplates() {
		if (listItemTemplates == null) {
			listItemTemplates = new EObjectContainmentEList<IRootListItemTemplate>(IRootListItemTemplate.class, this, UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE);
		}
		return listItemTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String buildItemLabel(final Object item) {
		return org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.operations.StereotypeListItemTemplateOperations.buildItemLabel(this, item);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Object> getItems(final EObject context) {
		return org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.operations.StereotypeListItemTemplateOperations.getItems(this, context);
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE:
			return ((InternalEList<?>) getListItemTemplates()).basicRemove(otherEnd, msgs);
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__GENERATE_ITEM:
			return isGenerateItem();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL:
			return getCustomItemLabel();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE:
			return getListItemTemplates();
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__GENERATE_ITEM:
			setGenerateItem((Boolean) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL:
			setCustomItemLabel((String) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE:
			getListItemTemplates().clear();
			getListItemTemplates().addAll((Collection<? extends IRootListItemTemplate>) newValue);
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__GENERATE_ITEM:
			setGenerateItem(GENERATE_ITEM_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL:
			setCustomItemLabel(CUSTOM_ITEM_LABEL_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE:
			getListItemTemplates().clear();
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__GENERATE_ITEM:
			return generateItem != GENERATE_ITEM_EDEFAULT;
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL:
			return CUSTOM_ITEM_LABEL_EDEFAULT == null ? customItemLabel != null : !CUSTOM_ITEM_LABEL_EDEFAULT.equals(customItemLabel);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE:
			return listItemTemplates != null && !listItemTemplates.isEmpty();
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
		if (baseClass == IListItemTemplate.class) {
			switch (derivedFeatureID) {
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__GENERATE_ITEM:
				return DocumentStructureTemplatePackage.ILIST_ITEM_TEMPLATE__GENERATE_ITEM;
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL:
				return DocumentStructureTemplatePackage.ILIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL;
			default:
				return -1;
			}
		}
		if (baseClass == ISubListItemTemplate.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == IComposedSubListItemTemplate.class) {
			switch (derivedFeatureID) {
			case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE:
				return DocumentStructureTemplatePackage.ICOMPOSED_SUB_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE;
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
		if (baseClass == IListItemTemplate.class) {
			switch (baseFeatureID) {
			case DocumentStructureTemplatePackage.ILIST_ITEM_TEMPLATE__GENERATE_ITEM:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__GENERATE_ITEM;
			case DocumentStructureTemplatePackage.ILIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__CUSTOM_ITEM_LABEL;
			default:
				return -1;
			}
		}
		if (baseClass == ISubListItemTemplate.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == IComposedSubListItemTemplate.class) {
			switch (baseFeatureID) {
			case DocumentStructureTemplatePackage.ICOMPOSED_SUB_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE__LIST_ITEM_TEMPLATE;
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
		if (baseClass == IListItemTemplate.class) {
			switch (baseOperationID) {
			case DocumentStructureTemplatePackage.ILIST_ITEM_TEMPLATE___BUILD_ITEM_LABEL__OBJECT:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE___BUILD_ITEM_LABEL__OBJECT;
			case DocumentStructureTemplatePackage.ILIST_ITEM_TEMPLATE___GET_ITEMS__EOBJECT:
				return UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE___GET_ITEMS__EOBJECT;
			default:
				return -1;
			}
		}
		if (baseClass == ISubListItemTemplate.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == IComposedSubListItemTemplate.class) {
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE___BUILD_ITEM_LABEL__OBJECT:
			return buildItemLabel(arguments.get(0));
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE___GET_ITEMS__EOBJECT:
			return getItems((EObject) arguments.get(0));
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (generateItem: "); //$NON-NLS-1$
		result.append(generateItem);
		result.append(", customItemLabel: "); //$NON-NLS-1$
		result.append(customItemLabel);
		result.append(')');
		return result.toString();
	}

} // StereotypeListItemTemplateImpl
