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
package org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UMLDocumentStructureTemplateFactoryImpl extends EFactoryImpl implements UMLDocumentStructureTemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static UMLDocumentStructureTemplateFactory init() {
		try {
			UMLDocumentStructureTemplateFactory theUMLDocumentStructureTemplateFactory = (UMLDocumentStructureTemplateFactory) EPackage.Registry.INSTANCE.getEFactory(UMLDocumentStructureTemplatePackage.eNS_URI);
			if (theUMLDocumentStructureTemplateFactory != null) {
				return theUMLDocumentStructureTemplateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLDocumentStructureTemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UMLDocumentStructureTemplateFactoryImpl() {
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE:
			return createStereotypePartTemplate();
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE:
			return createStereotypePropertyReferencePartTemplate();
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH:
			return createCommentAsParagraph();
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_FILTER_BEHAVIOR:
			return createStereotypeFilterBehaviorFromString(eDataType, initialValue);
		case UMLDocumentStructureTemplatePackage.COMMENT_CHOICE:
			return createCommentChoiceFromString(eDataType, initialValue);
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
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_FILTER_BEHAVIOR:
			return convertStereotypeFilterBehaviorToString(eDataType, instanceValue);
		case UMLDocumentStructureTemplatePackage.COMMENT_CHOICE:
			return convertCommentChoiceToString(eDataType, instanceValue);
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
	public StereotypePartTemplate createStereotypePartTemplate() {
		StereotypePartTemplateImpl stereotypePartTemplate = new StereotypePartTemplateImpl();
		return stereotypePartTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StereotypePropertyReferencePartTemplate createStereotypePropertyReferencePartTemplate() {
		StereotypePropertyReferencePartTemplateImpl stereotypePropertyReferencePartTemplate = new StereotypePropertyReferencePartTemplateImpl();
		return stereotypePropertyReferencePartTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public CommentAsParagraph createCommentAsParagraph() {
		CommentAsParagraphImpl commentAsParagraph = new CommentAsParagraphImpl();
		return commentAsParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public StereotypeFilterBehavior createStereotypeFilterBehaviorFromString(EDataType eDataType, String initialValue) {
		StereotypeFilterBehavior result = StereotypeFilterBehavior.get(initialValue);
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
	public String convertStereotypeFilterBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CommentChoice createCommentChoiceFromString(EDataType eDataType, String initialValue) {
		CommentChoice result = CommentChoice.get(initialValue);
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
	public String convertCommentChoiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UMLDocumentStructureTemplatePackage getUMLDocumentStructureTemplatePackage() {
		return (UMLDocumentStructureTemplatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLDocumentStructureTemplatePackage getPackage() {
		return UMLDocumentStructureTemplatePackage.eINSTANCE;
	}

} // UMLDocumentStructureTemplateFactoryImpl
