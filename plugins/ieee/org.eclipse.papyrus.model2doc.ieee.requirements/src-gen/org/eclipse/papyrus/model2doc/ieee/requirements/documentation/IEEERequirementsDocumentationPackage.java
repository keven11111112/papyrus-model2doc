/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.ieee.requirements.documentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementsDocumentationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IEEERequirementsDocumentation'"
 * @generated
 */
public interface IEEERequirementsDocumentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "documentation"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/docgenconfig/IEEERequirementsDocumentation"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IEEERequirementsDocumentation"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IEEERequirementsDocumentationPackage eINSTANCE = org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.AbstractRequirementsImpl <em>Abstract Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.AbstractRequirementsImpl
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl#getAbstractRequirements()
	 * @generated
	 */
	int ABSTRACT_REQUIREMENTS = 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENTS__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Req Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENTS__REQ_CATEGORY = 1;

	/**
	 * The number of structural features of the '<em>Abstract Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsImpl <em>IEEE Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsImpl
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl#getIEEERequirements()
	 * @generated
	 */
	int IEEE_REQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_REQUIREMENTS__BASE_PACKAGE = ABSTRACT_REQUIREMENTS__BASE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Req Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_REQUIREMENTS__REQ_CATEGORY = ABSTRACT_REQUIREMENTS__REQ_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_REQUIREMENTS__CATEGORY = ABSTRACT_REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEEE Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_REQUIREMENTS_FEATURE_COUNT = ABSTRACT_REQUIREMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEEE Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_REQUIREMENTS_OPERATION_COUNT = ABSTRACT_REQUIREMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEEFunctionalRequirementsImpl <em>IEEE Functional Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEEFunctionalRequirementsImpl
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl#getIEEEFunctionalRequirements()
	 * @generated
	 */
	int IEEE_FUNCTIONAL_REQUIREMENTS = 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_FUNCTIONAL_REQUIREMENTS__BASE_PACKAGE = IEEE_REQUIREMENTS__BASE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Req Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_FUNCTIONAL_REQUIREMENTS__REQ_CATEGORY = IEEE_REQUIREMENTS__REQ_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_FUNCTIONAL_REQUIREMENTS__CATEGORY = IEEE_REQUIREMENTS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_FUNCTIONAL_REQUIREMENTS__MODE = IEEE_REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEEE Functional Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_FUNCTIONAL_REQUIREMENTS_FEATURE_COUNT = IEEE_REQUIREMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEEE Functional Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEEE_FUNCTIONAL_REQUIREMENTS_OPERATION_COUNT = IEEE_REQUIREMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementCategory <em>IEEE Requirement Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementCategory
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl#getIEEERequirementCategory()
	 * @generated
	 */
	int IEEE_REQUIREMENT_CATEGORY = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirementCategory <em>Abstract Requirement Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirementCategory
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl#getAbstractRequirementCategory()
	 * @generated
	 */
	int ABSTRACT_REQUIREMENT_CATEGORY = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirements <em>IEEE Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEEE Requirements</em>'.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirements
	 * @generated
	 */
	EClass getIEEERequirements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirements#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirements#getCategory()
	 * @see #getIEEERequirements()
	 * @generated
	 */
	EAttribute getIEEERequirements_Category();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirements <em>Abstract Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Requirements</em>'.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirements
	 * @generated
	 */
	EClass getAbstractRequirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirements#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirements#getBase_Package()
	 * @see #getAbstractRequirements()
	 * @generated
	 */
	EReference getAbstractRequirements_Base_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirements#getReqCategory <em>Req Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Category</em>'.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirements#getReqCategory()
	 * @see #getAbstractRequirements()
	 * @generated
	 */
	EAttribute getAbstractRequirements_ReqCategory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEEFunctionalRequirements <em>IEEE Functional Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEEE Functional Requirements</em>'.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEEFunctionalRequirements
	 * @generated
	 */
	EClass getIEEEFunctionalRequirements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEEFunctionalRequirements#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEEFunctionalRequirements#getMode()
	 * @see #getIEEEFunctionalRequirements()
	 * @generated
	 */
	EAttribute getIEEEFunctionalRequirements_Mode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementCategory <em>IEEE Requirement Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IEEE Requirement Category</em>'.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementCategory
	 * @generated
	 */
	EEnum getIEEERequirementCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirementCategory <em>Abstract Requirement Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Abstract Requirement Category</em>'.
	 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirementCategory
	 * @generated
	 */
	EEnum getAbstractRequirementCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IEEERequirementsDocumentationFactory getIEEERequirementsDocumentationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsImpl <em>IEEE Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsImpl
		 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl#getIEEERequirements()
		 * @generated
		 */
		EClass IEEE_REQUIREMENTS = eINSTANCE.getIEEERequirements();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEEE_REQUIREMENTS__CATEGORY = eINSTANCE.getIEEERequirements_Category();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.AbstractRequirementsImpl <em>Abstract Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.AbstractRequirementsImpl
		 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl#getAbstractRequirements()
		 * @generated
		 */
		EClass ABSTRACT_REQUIREMENTS = eINSTANCE.getAbstractRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENTS__BASE_PACKAGE = eINSTANCE.getAbstractRequirements_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Req Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENTS__REQ_CATEGORY = eINSTANCE.getAbstractRequirements_ReqCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEEFunctionalRequirementsImpl <em>IEEE Functional Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEEFunctionalRequirementsImpl
		 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl#getIEEEFunctionalRequirements()
		 * @generated
		 */
		EClass IEEE_FUNCTIONAL_REQUIREMENTS = eINSTANCE.getIEEEFunctionalRequirements();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEEE_FUNCTIONAL_REQUIREMENTS__MODE = eINSTANCE.getIEEEFunctionalRequirements_Mode();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementCategory <em>IEEE Requirement Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.IEEERequirementCategory
		 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl#getIEEERequirementCategory()
		 * @generated
		 */
		EEnum IEEE_REQUIREMENT_CATEGORY = eINSTANCE.getIEEERequirementCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirementCategory <em>Abstract Requirement Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.AbstractRequirementCategory
		 * @see org.eclipse.papyrus.model2doc.ieee.requirements.documentation.impl.IEEERequirementsDocumentationPackageImpl#getAbstractRequirementCategory()
		 * @generated
		 */
		EEnum ABSTRACT_REQUIREMENT_CATEGORY = eINSTANCE.getAbstractRequirementCategory();

	}

} //IEEERequirementsDocumentationPackage
