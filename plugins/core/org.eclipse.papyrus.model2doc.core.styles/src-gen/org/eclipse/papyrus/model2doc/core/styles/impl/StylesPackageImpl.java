/**
 * Copyright (c) 2020 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.core.styles.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.model2doc.core.styles.BooleanListNamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.BooleanNamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.DoubleListNamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.DoubleNamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.IntListNamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.IntNamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.NamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.StringListNamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.StringNamedStyle;
import org.eclipse.papyrus.model2doc.core.styles.StyledElement;
import org.eclipse.papyrus.model2doc.core.styles.StylesFactory;
import org.eclipse.papyrus.model2doc.core.styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StylesPackageImpl extends EPackageImpl implements StylesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass namedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass intNamedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stringNamedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass booleanNamedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass doubleNamedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass intListNamedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stringListNamedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass booleanListNamedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass doubleListNamedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass styledElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.model2doc.core.styles.StylesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StylesPackageImpl() {
		super(eNS_URI, StylesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link StylesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StylesPackage init() {
		if (isInited) {
			return (StylesPackage) EPackage.Registry.INSTANCE.getEPackage(StylesPackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredStylesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StylesPackageImpl theStylesPackage = registeredStylesPackage instanceof StylesPackageImpl ? (StylesPackageImpl) registeredStylesPackage : new StylesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStylesPackage.createPackageContents();

		// Initialize created meta-data
		theStylesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStylesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StylesPackage.eNS_URI, theStylesPackage);
		return theStylesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getNamedStyle() {
		return namedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getNamedStyle_Name() {
		return (EAttribute) namedStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIntNamedStyle() {
		return intNamedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIntNamedStyle_Value() {
		return (EAttribute) intNamedStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStringNamedStyle() {
		return stringNamedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStringNamedStyle_Value() {
		return (EAttribute) stringNamedStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBooleanNamedStyle() {
		return booleanNamedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getBooleanNamedStyle_Value() {
		return (EAttribute) booleanNamedStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDoubleNamedStyle() {
		return doubleNamedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDoubleNamedStyle_Value() {
		return (EAttribute) doubleNamedStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIntListNamedStyle() {
		return intListNamedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIntListNamedStyle_Values() {
		return (EAttribute) intListNamedStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStringListNamedStyle() {
		return stringListNamedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStringListNamedStyle_Values() {
		return (EAttribute) stringListNamedStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBooleanListNamedStyle() {
		return booleanListNamedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getBooleanListNamedStyle_Values() {
		return (EAttribute) booleanListNamedStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDoubleListNamedStyle() {
		return doubleListNamedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDoubleListNamedStyle_Values() {
		return (EAttribute) doubleListNamedStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStyledElement() {
		return styledElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getStyledElement_NamedStyles() {
		return (EReference) styledElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getStyledElement__GetNamedStyle__String() {
		return styledElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StylesFactory getStylesFactory() {
		return (StylesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		namedStyleEClass = createEClass(NAMED_STYLE);
		createEAttribute(namedStyleEClass, NAMED_STYLE__NAME);

		intNamedStyleEClass = createEClass(INT_NAMED_STYLE);
		createEAttribute(intNamedStyleEClass, INT_NAMED_STYLE__VALUE);

		stringNamedStyleEClass = createEClass(STRING_NAMED_STYLE);
		createEAttribute(stringNamedStyleEClass, STRING_NAMED_STYLE__VALUE);

		booleanNamedStyleEClass = createEClass(BOOLEAN_NAMED_STYLE);
		createEAttribute(booleanNamedStyleEClass, BOOLEAN_NAMED_STYLE__VALUE);

		doubleNamedStyleEClass = createEClass(DOUBLE_NAMED_STYLE);
		createEAttribute(doubleNamedStyleEClass, DOUBLE_NAMED_STYLE__VALUE);

		intListNamedStyleEClass = createEClass(INT_LIST_NAMED_STYLE);
		createEAttribute(intListNamedStyleEClass, INT_LIST_NAMED_STYLE__VALUES);

		stringListNamedStyleEClass = createEClass(STRING_LIST_NAMED_STYLE);
		createEAttribute(stringListNamedStyleEClass, STRING_LIST_NAMED_STYLE__VALUES);

		booleanListNamedStyleEClass = createEClass(BOOLEAN_LIST_NAMED_STYLE);
		createEAttribute(booleanListNamedStyleEClass, BOOLEAN_LIST_NAMED_STYLE__VALUES);

		doubleListNamedStyleEClass = createEClass(DOUBLE_LIST_NAMED_STYLE);
		createEAttribute(doubleListNamedStyleEClass, DOUBLE_LIST_NAMED_STYLE__VALUES);

		styledElementEClass = createEClass(STYLED_ELEMENT);
		createEReference(styledElementEClass, STYLED_ELEMENT__NAMED_STYLES);
		createEOperation(styledElementEClass, STYLED_ELEMENT___GET_NAMED_STYLE__STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		intNamedStyleEClass.getESuperTypes().add(this.getNamedStyle());
		stringNamedStyleEClass.getESuperTypes().add(this.getNamedStyle());
		booleanNamedStyleEClass.getESuperTypes().add(this.getNamedStyle());
		doubleNamedStyleEClass.getESuperTypes().add(this.getNamedStyle());
		intListNamedStyleEClass.getESuperTypes().add(this.getNamedStyle());
		stringListNamedStyleEClass.getESuperTypes().add(this.getNamedStyle());
		booleanListNamedStyleEClass.getESuperTypes().add(this.getNamedStyle());
		doubleListNamedStyleEClass.getESuperTypes().add(this.getNamedStyle());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedStyleEClass, NamedStyle.class, "NamedStyle", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getNamedStyle_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(intNamedStyleEClass, IntNamedStyle.class, "IntNamedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIntNamedStyle_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntNamedStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(stringNamedStyleEClass, StringNamedStyle.class, "StringNamedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStringNamedStyle_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringNamedStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(booleanNamedStyleEClass, BooleanNamedStyle.class, "BooleanNamedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBooleanNamedStyle_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanNamedStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(doubleNamedStyleEClass, DoubleNamedStyle.class, "DoubleNamedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDoubleNamedStyle_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoubleNamedStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(intListNamedStyleEClass, IntListNamedStyle.class, "IntListNamedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIntListNamedStyle_Values(), ecorePackage.getEInt(), "values", null, 0, -1, IntListNamedStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(stringListNamedStyleEClass, StringListNamedStyle.class, "StringListNamedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStringListNamedStyle_Values(), ecorePackage.getEString(), "values", null, 0, -1, StringListNamedStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(booleanListNamedStyleEClass, BooleanListNamedStyle.class, "BooleanListNamedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBooleanListNamedStyle_Values(), ecorePackage.getEBoolean(), "values", null, 0, -1, BooleanListNamedStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(doubleListNamedStyleEClass, DoubleListNamedStyle.class, "DoubleListNamedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDoubleListNamedStyle_Values(), ecorePackage.getEDouble(), "values", null, 0, -1, DoubleListNamedStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(styledElementEClass, StyledElement.class, "StyledElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStyledElement_NamedStyles(), this.getNamedStyle(), null, "namedStyles", null, 0, -1, StyledElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		EOperation op = initEOperation(getStyledElement__GetNamedStyle__String(), this.getNamedStyle(), "getNamedStyle", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$
		addAnnotation(this,
				source,
				new String[] {
						"originalName", "Styles" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // StylesPackageImpl
