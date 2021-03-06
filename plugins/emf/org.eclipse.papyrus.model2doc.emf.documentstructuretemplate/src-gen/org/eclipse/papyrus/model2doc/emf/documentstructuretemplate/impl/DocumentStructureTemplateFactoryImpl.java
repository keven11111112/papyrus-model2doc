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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DocumentStructureTemplateFactoryImpl extends EFactoryImpl implements DocumentStructureTemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DocumentStructureTemplateFactory init() {
		try {
			DocumentStructureTemplateFactory theDocumentStructureTemplateFactory = (DocumentStructureTemplateFactory) EPackage.Registry.INSTANCE.getEFactory(DocumentStructureTemplatePackage.eNS_URI);
			if (theDocumentStructureTemplateFactory != null) {
				return theDocumentStructureTemplateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocumentStructureTemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DocumentStructureTemplateFactoryImpl() {
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
		case DocumentStructureTemplatePackage.DOCUMENT_TEMPLATE_PROTOTYPE:
			return createDocumentTemplatePrototype();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE:
			return createTextDocumentTemplate();
		case DocumentStructureTemplatePackage.TABLE_OF_CONTENTS:
			return createTableOfContents();
		case DocumentStructureTemplatePackage.BODY:
			return createBody();
		case DocumentStructureTemplatePackage.ECLASS_PART_TEMPLATE:
			return createEClassPartTemplate();
		case DocumentStructureTemplatePackage.EREFERENCE_PART_TEMPLATE:
			return createEReferencePartTemplate();
		case DocumentStructureTemplatePackage.EREFERENCE_TABLE_VIEW:
			return createEReferenceTableView();
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_COLUMN:
			return createEStructuralFeatureColumn();
		case DocumentStructureTemplatePackage.EREFERENCE_LIST_ITEM_TEMPLATE:
			return createEReferenceListItemTemplate();
		case DocumentStructureTemplatePackage.EATTRIBUTE_LIST_ITEM_TEMPLATE:
			return createEAttributeListItemTemplate();
		case DocumentStructureTemplatePackage.ECLASS_LIST_ITEM_TEMPLATE:
			return createEClassListItemTemplate();
		case DocumentStructureTemplatePackage.TREE_LIST_VIEW:
			return createTreeListView();
		case DocumentStructureTemplatePackage.INSERT_FILE_TEMPLATE:
			return createInsertFileTemplate();
		case DocumentStructureTemplatePackage.TABLE_OF_FIGURES:
			return createTableOfFigures();
		case DocumentStructureTemplatePackage.EATTRIBUTE_AS_PARAGRAPH:
			return createEAttributeAsParagraph();
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
		case DocumentStructureTemplatePackage.ECLASS_FILTER_BEHAVIOR:
			return createEClassFilterBehaviorFromString(eDataType, initialValue);
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
		case DocumentStructureTemplatePackage.ECLASS_FILTER_BEHAVIOR:
			return convertEClassFilterBehaviorToString(eDataType, instanceValue);
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
	public DocumentTemplatePrototype createDocumentTemplatePrototype() {
		DocumentTemplatePrototypeImpl documentTemplatePrototype = new DocumentTemplatePrototypeImpl();
		return documentTemplatePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TextDocumentTemplate createTextDocumentTemplate() {
		TextDocumentTemplateImpl textDocumentTemplate = new TextDocumentTemplateImpl();
		return textDocumentTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TableOfContents createTableOfContents() {
		TableOfContentsImpl tableOfContents = new TableOfContentsImpl();
		return tableOfContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClassPartTemplate createEClassPartTemplate() {
		EClassPartTemplateImpl eClassPartTemplate = new EClassPartTemplateImpl();
		return eClassPartTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReferencePartTemplate createEReferencePartTemplate() {
		EReferencePartTemplateImpl eReferencePartTemplate = new EReferencePartTemplateImpl();
		return eReferencePartTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReferenceTableView createEReferenceTableView() {
		EReferenceTableViewImpl eReferenceTableView = new EReferenceTableViewImpl();
		return eReferenceTableView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EStructuralFeatureColumn createEStructuralFeatureColumn() {
		EStructuralFeatureColumnImpl eStructuralFeatureColumn = new EStructuralFeatureColumnImpl();
		return eStructuralFeatureColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReferenceListItemTemplate createEReferenceListItemTemplate() {
		EReferenceListItemTemplateImpl eReferenceListItemTemplate = new EReferenceListItemTemplateImpl();
		return eReferenceListItemTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttributeListItemTemplate createEAttributeListItemTemplate() {
		EAttributeListItemTemplateImpl eAttributeListItemTemplate = new EAttributeListItemTemplateImpl();
		return eAttributeListItemTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClassListItemTemplate createEClassListItemTemplate() {
		EClassListItemTemplateImpl eClassListItemTemplate = new EClassListItemTemplateImpl();
		return eClassListItemTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TreeListView createTreeListView() {
		TreeListViewImpl treeListView = new TreeListViewImpl();
		return treeListView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public InsertFileTemplate createInsertFileTemplate() {
		InsertFileTemplateImpl insertFileTemplate = new InsertFileTemplateImpl();
		return insertFileTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TableOfFigures createTableOfFigures() {
		TableOfFiguresImpl tableOfFigures = new TableOfFiguresImpl();
		return tableOfFigures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttributeAsParagraph createEAttributeAsParagraph() {
		EAttributeAsParagraphImpl eAttributeAsParagraph = new EAttributeAsParagraphImpl();
		return eAttributeAsParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClassFilterBehavior createEClassFilterBehaviorFromString(EDataType eDataType, String initialValue) {
		EClassFilterBehavior result = EClassFilterBehavior.get(initialValue);
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
	public String convertEClassFilterBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DocumentStructureTemplatePackage getDocumentStructureTemplatePackage() {
		return (DocumentStructureTemplatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocumentStructureTemplatePackage getPackage() {
		return DocumentStructureTemplatePackage.eINSTANCE;
	}

} // DocumentStructureTemplateFactoryImpl
