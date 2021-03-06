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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.model2doc.core.builtintypes.*;
import org.eclipse.papyrus.model2doc.core.builtintypes.accessors.IInputFileAccessor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BuiltInTypesFactoryImpl extends EFactoryImpl implements BuiltInTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static BuiltInTypesFactory init() {
		try {
			BuiltInTypesFactory theBuiltInTypesFactory = (BuiltInTypesFactory) EPackage.Registry.INSTANCE.getEFactory(BuiltInTypesPackage.eNS_URI);
			if (theBuiltInTypesFactory != null) {
				return theBuiltInTypesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BuiltInTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public BuiltInTypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BuiltInTypesPackage.BASIC_TABLE:
			return createBasicTable();
		case BuiltInTypesPackage.BASIC_ROW:
			return createBasicRow();
		case BuiltInTypesPackage.TEXT_CELL:
			return createTextCell();
		case BuiltInTypesPackage.TEXT_LIST_ITEM:
			return createTextListItem();
		case BuiltInTypesPackage.BASIC_LIST:
			return createBasicList();
		case BuiltInTypesPackage.DEFAULT_FILE_REFERENCE:
			return createDefaultFileReference();
		case BuiltInTypesPackage.FILE_REFERENCE_CELL:
			return createFileReferenceCell();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BuiltInTypesPackage.CELL_LOCATION:
			return createCellLocationFromString(eDataType, initialValue);
		case BuiltInTypesPackage.IMAGE_FORMAT:
			return createImageFormatFromString(eDataType, initialValue);
		case BuiltInTypesPackage.IINPUT_FILE_ACCESSOR:
			return createIInputFileAccessorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BuiltInTypesPackage.CELL_LOCATION:
			return convertCellLocationToString(eDataType, instanceValue);
		case BuiltInTypesPackage.IMAGE_FORMAT:
			return convertImageFormatToString(eDataType, instanceValue);
		case BuiltInTypesPackage.IINPUT_FILE_ACCESSOR:
			return convertIInputFileAccessorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BasicTable createBasicTable() {
		BasicTableImpl basicTable = new BasicTableImpl();
		return basicTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BasicRow createBasicRow() {
		BasicRowImpl basicRow = new BasicRowImpl();
		return basicRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TextCell createTextCell() {
		TextCellImpl textCell = new TextCellImpl();
		return textCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TextListItem createTextListItem() {
		TextListItemImpl textListItem = new TextListItemImpl();
		return textListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BasicList createBasicList() {
		BasicListImpl basicList = new BasicListImpl();
		return basicList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DefaultFileReference createDefaultFileReference() {
		DefaultFileReferenceImpl defaultFileReference = new DefaultFileReferenceImpl();
		return defaultFileReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public FileReferenceCell createFileReferenceCell() {
		FileReferenceCellImpl fileReferenceCell = new FileReferenceCellImpl();
		return fileReferenceCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CellLocation createCellLocationFromString(EDataType eDataType, String initialValue) {
		CellLocation result = CellLocation.get(initialValue);
		if (result == null)
		 {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertCellLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ImageFormat createImageFormatFromString(EDataType eDataType, String initialValue) {
		ImageFormat result = ImageFormat.get(initialValue);
		if (result == null)
		 {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertImageFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public IInputFileAccessor createIInputFileAccessorFromString(EDataType eDataType, String initialValue) {
		return (IInputFileAccessor) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertIInputFileAccessorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BuiltInTypesPackage getBuiltInTypesPackage() {
		return (BuiltInTypesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BuiltInTypesPackage getPackage() {
		return BuiltInTypesPackage.eINSTANCE;
	}

} // BuiltInTypesFactoryImpl
