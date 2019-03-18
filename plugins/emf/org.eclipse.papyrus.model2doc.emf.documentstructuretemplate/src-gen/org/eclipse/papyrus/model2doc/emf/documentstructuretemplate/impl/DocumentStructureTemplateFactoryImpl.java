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
		case DocumentStructureTemplatePackage.GENERATION_CONFIGURATION:
			return createGenerationConfiguration();
		case DocumentStructureTemplatePackage.COVER_PAGE:
			return createCoverPage();
		case DocumentStructureTemplatePackage.TEXT_DOCUMENT_TEMPLATE:
			return createTextDocumentTemplate();
		case DocumentStructureTemplatePackage.ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE:
			return createEStructuralFeatureDocumentPartTemplate();
		case DocumentStructureTemplatePackage.ECLASS_DOCUMENT_PART_TEMPLATE:
			return createEClassDocumentPartTemplate();
		case DocumentStructureTemplatePackage.EOBJECT_DOCUMENT_PART_TEMPLATE:
			return createEObjectDocumentPartTemplate();
		case DocumentStructureTemplatePackage.TABLE_OF_CONTENTS:
			return createTableOfContents();
		case DocumentStructureTemplatePackage.BODY:
			return createBody();
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
	public EStructuralFeatureDocumentPartTemplate createEStructuralFeatureDocumentPartTemplate() {
		EStructuralFeatureDocumentPartTemplateImpl eStructuralFeatureDocumentPartTemplate = new EStructuralFeatureDocumentPartTemplateImpl();
		return eStructuralFeatureDocumentPartTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClassDocumentPartTemplate createEClassDocumentPartTemplate() {
		EClassDocumentPartTemplateImpl eClassDocumentPartTemplate = new EClassDocumentPartTemplateImpl();
		return eClassDocumentPartTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObjectDocumentPartTemplate createEObjectDocumentPartTemplate() {
		EObjectDocumentPartTemplateImpl eObjectDocumentPartTemplate = new EObjectDocumentPartTemplateImpl();
		return eObjectDocumentPartTemplate;
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
	public GenerationConfiguration createGenerationConfiguration() {
		GenerationConfigurationImpl generationConfiguration = new GenerationConfigurationImpl();
		return generationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public CoverPage createCoverPage() {
		CoverPageImpl coverPage = new CoverPageImpl();
		return coverPage;
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
