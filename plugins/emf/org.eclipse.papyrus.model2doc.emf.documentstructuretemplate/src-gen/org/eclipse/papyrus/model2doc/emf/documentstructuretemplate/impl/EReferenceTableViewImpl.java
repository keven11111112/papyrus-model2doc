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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReference Table View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#isGenerate <em>Generate</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#isGenerateTitle <em>Generate Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#getCustomTitle <em>Custom Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#getColumns <em>Columns</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#isGenerateRowHeader <em>Generate Row Header</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#isGenerateColumnHeader <em>Generate Column Header</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#getEReference <em>EReference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EReferenceTableViewImpl extends MinimalEObjectImpl.Container implements EReferenceTableView {
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
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<IColumn> columns;

	/**
	 * The default value of the '{@link #isGenerateRowHeader() <em>Generate Row Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateRowHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_ROW_HEADER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateRowHeader() <em>Generate Row Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateRowHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean generateRowHeader = GENERATE_ROW_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateColumnHeader() <em>Generate Column Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateColumnHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_COLUMN_HEADER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateColumnHeader() <em>Generate Column Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateColumnHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean generateColumnHeader = GENERATE_COLUMN_HEADER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEReference() <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEReference()
	 * @generated
	 * @ordered
	 */
	protected EReference eReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EReferenceTableViewImpl() {
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
		return DocumentStructureTemplatePackage.Literals.EREFERENCE_TABLE_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE, oldGenerate, generate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_TITLE, oldGenerateTitle, generateTitle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__CUSTOM_TITLE, oldCustomTitle, customTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<IColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<>(IColumn.class, this, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerateRowHeader() {
		return generateRowHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerateRowHeader(boolean newGenerateRowHeader) {
		boolean oldGenerateRowHeader = generateRowHeader;
		generateRowHeader = newGenerateRowHeader;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER, oldGenerateRowHeader, generateRowHeader));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerateColumnHeader() {
		return generateColumnHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerateColumnHeader(boolean newGenerateColumnHeader) {
		boolean oldGenerateColumnHeader = generateColumnHeader;
		generateColumnHeader = newGenerateColumnHeader;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER, oldGenerateColumnHeader, generateColumnHeader));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEReference() {
		if (eReference != null && eReference.eIsProxy()) {
			InternalEObject oldEReference = (InternalEObject) eReference;
			eReference = (EReference) eResolveProxy(oldEReference);
			if (eReference != oldEReference) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__EREFERENCE, oldEReference, eReference));
				}
			}
		}
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference basicGetEReference() {
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEReference(EReference newEReference) {
		EReference oldEReference = eReference;
		eReference = newEReference;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__EREFERENCE, oldEReference, eReference));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String buildTitle() {
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
	public EList<EObject> getRows(EObject context) {
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
	public String buildRowHeaderLabel(EObject rowElement) {
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
			return ((InternalEList<?>) getColumns()).basicRemove(otherEnd, msgs);
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE:
			return isGenerate();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_TITLE:
			return isGenerateTitle();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__CUSTOM_TITLE:
			return getCustomTitle();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
			return getColumns();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			return isGenerateRowHeader();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
			return isGenerateColumnHeader();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__EREFERENCE:
			if (resolve) {
				return getEReference();
			}
			return basicGetEReference();
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE:
			setGenerate((Boolean) newValue);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_TITLE:
			setGenerateTitle((Boolean) newValue);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__CUSTOM_TITLE:
			setCustomTitle((String) newValue);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends IColumn>) newValue);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			setGenerateRowHeader((Boolean) newValue);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
			setGenerateColumnHeader((Boolean) newValue);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__EREFERENCE:
			setEReference((EReference) newValue);
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE:
			setGenerate(GENERATE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_TITLE:
			setGenerateTitle(GENERATE_TITLE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__CUSTOM_TITLE:
			setCustomTitle(CUSTOM_TITLE_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
			getColumns().clear();
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			setGenerateRowHeader(GENERATE_ROW_HEADER_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
			setGenerateColumnHeader(GENERATE_COLUMN_HEADER_EDEFAULT);
			return;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__EREFERENCE:
			setEReference((EReference) null);
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE:
			return generate != GENERATE_EDEFAULT;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_TITLE:
			return generateTitle != GENERATE_TITLE_EDEFAULT;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__CUSTOM_TITLE:
			return CUSTOM_TITLE_EDEFAULT == null ? customTitle != null : !CUSTOM_TITLE_EDEFAULT.equals(customTitle);
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__COLUMNS:
			return columns != null && !columns.isEmpty();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_ROW_HEADER:
			return generateRowHeader != GENERATE_ROW_HEADER_EDEFAULT;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__GENERATE_COLUMN_HEADER:
			return generateColumnHeader != GENERATE_COLUMN_HEADER_EDEFAULT;
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW__EREFERENCE:
			return eReference != null;
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
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW___BUILD_TITLE:
			return buildTitle();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW___GET_ROWS__EOBJECT:
			return getRows((EObject) arguments.get(0));
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW___BUILD_ROW_HEADER_LABEL__EOBJECT:
			return buildRowHeaderLabel((EObject) arguments.get(0));
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
		result.append(", generateRowHeader: "); //$NON-NLS-1$
		result.append(generateRowHeader);
		result.append(", generateColumnHeader: "); //$NON-NLS-1$
		result.append(generateColumnHeader);
		result.append(')');
		return result.toString();
	}

} // EReferenceTableViewImpl
