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
package org.eclipse.papyrus.model2doc.documentparttemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplateFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DocumentPartTemplate'"
 * @generated
 */
public interface DocumentPartTemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "documentparttemplate"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/1.0.0/documentstructuretemplate/documentparttemplate"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "documentparttemplate"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	DocumentPartTemplatePackage eINSTANCE = org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate <em>Document Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl#getDocumentPartTemplate()
	 * @generated
	 */
	int DOCUMENT_PART_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE__GENERATE = 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE__GENERATE_TITLE = 1;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE = 2;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE = 3;

	/**
	 * The number of structural features of the '<em>Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PART_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate <em>EClass Document Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl#getEClassDocumentPartTemplate()
	 * @generated
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE = DOCUMENT_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE = DOCUMENT_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE = DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE = DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The number of structural features of the '<em>EClass Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE_FEATURE_COUNT = DOCUMENT_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EClass Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_DOCUMENT_PART_TEMPLATE_OPERATION_COUNT = DOCUMENT_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate <em>EStructural Feature Document Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl#getEStructuralFeatureDocumentPartTemplate()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__GENERATE = DOCUMENT_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE = DOCUMENT_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE = DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE = DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The number of structural features of the '<em>EStructural Feature Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE_FEATURE_COUNT = DOCUMENT_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EStructural Feature Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE_OPERATION_COUNT = DOCUMENT_PART_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate <em>EObject Document Part Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl#getEObjectDocumentPartTemplate()
	 * @generated
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE__GENERATE = DOCUMENT_PART_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE__GENERATE_TITLE = DOCUMENT_PART_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE = DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE = DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The number of structural features of the '<em>EObject Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE_FEATURE_COUNT = DOCUMENT_PART_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EObject Document Part Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_DOCUMENT_PART_TEMPLATE_OPERATION_COUNT = DOCUMENT_PART_TEMPLATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate <em>Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Document Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate
	 * @generated
	 */
	EClass getDocumentPartTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#isGenerate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Generate</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#isGenerate()
	 * @see #getDocumentPartTemplate()
	 * @generated
	 */
	EAttribute getDocumentPartTemplate_Generate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#isGenerateTitle <em>Generate Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Generate Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#isGenerateTitle()
	 * @see #getDocumentPartTemplate()
	 * @generated
	 */
	EAttribute getDocumentPartTemplate_GenerateTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#getDefaultTitle <em>Default Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Default Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#getDefaultTitle()
	 * @see #getDocumentPartTemplate()
	 * @generated
	 */
	EAttribute getDocumentPartTemplate_DefaultTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#getCustomTitle <em>Custom Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Custom Title</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate#getCustomTitle()
	 * @see #getDocumentPartTemplate()
	 * @generated
	 */
	EAttribute getDocumentPartTemplate_CustomTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate <em>EClass Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EClass Document Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate
	 * @generated
	 */
	EClass getEClassDocumentPartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate <em>EStructural Feature Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EStructural Feature Document Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate
	 * @generated
	 */
	EClass getEStructuralFeatureDocumentPartTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate <em>EObject Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EObject Document Part Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate
	 * @generated
	 */
	EClass getEObjectDocumentPartTemplate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocumentPartTemplateFactory getDocumentPartTemplateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate <em>Document Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate
		 * @see org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl#getDocumentPartTemplate()
		 * @generated
		 */
		EClass DOCUMENT_PART_TEMPLATE = eINSTANCE.getDocumentPartTemplate();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_PART_TEMPLATE__GENERATE = eINSTANCE.getDocumentPartTemplate_Generate();

		/**
		 * The meta object literal for the '<em><b>Generate Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_PART_TEMPLATE__GENERATE_TITLE = eINSTANCE.getDocumentPartTemplate_GenerateTitle();

		/**
		 * The meta object literal for the '<em><b>Default Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_PART_TEMPLATE__DEFAULT_TITLE = eINSTANCE.getDocumentPartTemplate_DefaultTitle();

		/**
		 * The meta object literal for the '<em><b>Custom Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_PART_TEMPLATE__CUSTOM_TITLE = eINSTANCE.getDocumentPartTemplate_CustomTitle();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate <em>EClass Document Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate
		 * @see org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl#getEClassDocumentPartTemplate()
		 * @generated
		 */
		EClass ECLASS_DOCUMENT_PART_TEMPLATE = eINSTANCE.getEClassDocumentPartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate <em>EStructural Feature Document Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate
		 * @see org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl#getEStructuralFeatureDocumentPartTemplate()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE_DOCUMENT_PART_TEMPLATE = eINSTANCE.getEStructuralFeatureDocumentPartTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate <em>EObject Document Part Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate
		 * @see org.eclipse.papyrus.model2doc.documentparttemplate.impl.DocumentPartTemplatePackageImpl#getEObjectDocumentPartTemplate()
		 * @generated
		 */
		EClass EOBJECT_DOCUMENT_PART_TEMPLATE = eINSTANCE.getEObjectDocumentPartTemplate();

	}

} // DocumentPartTemplatePackage
