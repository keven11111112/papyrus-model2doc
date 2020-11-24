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
package org.eclipse.papyrus.model2doc.core.styles.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.model2doc.core.styles.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.core.styles.StylesPackage
 * @generated
 */
public class StylesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static StylesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public StylesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StylesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected StylesSwitch<Adapter> modelSwitch = new StylesSwitch<>() {
		@Override
		public Adapter caseNamedStyle(NamedStyle object) {
			return createNamedStyleAdapter();
		}

		@Override
		public Adapter caseIntNamedStyle(IntNamedStyle object) {
			return createIntNamedStyleAdapter();
		}

		@Override
		public Adapter caseStringNamedStyle(StringNamedStyle object) {
			return createStringNamedStyleAdapter();
		}

		@Override
		public Adapter caseBooleanNamedStyle(BooleanNamedStyle object) {
			return createBooleanNamedStyleAdapter();
		}

		@Override
		public Adapter caseDoubleNamedStyle(DoubleNamedStyle object) {
			return createDoubleNamedStyleAdapter();
		}

		@Override
		public Adapter caseIntListNamedStyle(IntListNamedStyle object) {
			return createIntListNamedStyleAdapter();
		}

		@Override
		public Adapter caseStringListNamedStyle(StringListNamedStyle object) {
			return createStringListNamedStyleAdapter();
		}

		@Override
		public Adapter caseBooleanListNamedStyle(BooleanListNamedStyle object) {
			return createBooleanListNamedStyleAdapter();
		}

		@Override
		public Adapter caseDoubleListNamedStyle(DoubleListNamedStyle object) {
			return createDoubleListNamedStyleAdapter();
		}

		@Override
		public Adapter caseStyledElement(StyledElement object) {
			return createStyledElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.styles.NamedStyle <em>Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.styles.NamedStyle
	 * @generated
	 */
	public Adapter createNamedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.styles.IntNamedStyle <em>Int Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.styles.IntNamedStyle
	 * @generated
	 */
	public Adapter createIntNamedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.styles.StringNamedStyle <em>String Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StringNamedStyle
	 * @generated
	 */
	public Adapter createStringNamedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.styles.BooleanNamedStyle <em>Boolean Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.styles.BooleanNamedStyle
	 * @generated
	 */
	public Adapter createBooleanNamedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.styles.DoubleNamedStyle <em>Double Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.styles.DoubleNamedStyle
	 * @generated
	 */
	public Adapter createDoubleNamedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.styles.IntListNamedStyle <em>Int List Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.styles.IntListNamedStyle
	 * @generated
	 */
	public Adapter createIntListNamedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.styles.StringListNamedStyle <em>String List Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StringListNamedStyle
	 * @generated
	 */
	public Adapter createStringListNamedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.styles.BooleanListNamedStyle <em>Boolean List Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.styles.BooleanListNamedStyle
	 * @generated
	 */
	public Adapter createBooleanListNamedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.styles.DoubleListNamedStyle <em>Double List Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.styles.DoubleListNamedStyle
	 * @generated
	 */
	public Adapter createDoubleListNamedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.styles.StyledElement <em>Styled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.styles.StyledElement
	 * @generated
	 */
	public Adapter createStyledElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // StylesAdapterFactory
