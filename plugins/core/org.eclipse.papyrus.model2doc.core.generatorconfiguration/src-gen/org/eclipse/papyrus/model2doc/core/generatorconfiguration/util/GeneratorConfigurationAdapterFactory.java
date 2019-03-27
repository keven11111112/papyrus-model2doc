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
package org.eclipse.papyrus.model2doc.core.generatorconfiguration.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage
 * @generated
 */
public class GeneratorConfigurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static GeneratorConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public GeneratorConfigurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeneratorConfigurationPackage.eINSTANCE;
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
	protected GeneratorConfigurationSwitch<Adapter> modelSwitch = new GeneratorConfigurationSwitch<Adapter>() {
		@Override
		public Adapter caseDefaultDocumentStructureGeneratorConfiguration(DefaultDocumentStructureGeneratorConfiguration object) {
			return createDefaultDocumentStructureGeneratorConfigurationAdapter();
		}

		@Override
		public Adapter caseAbstractDocumentStructureGeneratorConfiguration(AbstractDocumentStructureGeneratorConfiguration object) {
			return createAbstractDocumentStructureGeneratorConfigurationAdapter();
		}

		@Override
		public Adapter caseAbstractDocumentGeneratorConfiguration(AbstractDocumentGeneratorConfiguration object) {
			return createAbstractDocumentGeneratorConfigurationAdapter();
		}

		@Override
		public Adapter caseGeneratorConfiguration(GeneratorConfiguration object) {
			return createGeneratorConfigurationAdapter();
		}

		@Override
		public Adapter caseIDocumentStructureGeneratorConfiguration(IDocumentStructureGeneratorConfiguration object) {
			return createIDocumentStructureGeneratorConfigurationAdapter();
		}

		@Override
		public Adapter caseIDocumentGeneratorConfiguration(IDocumentGeneratorConfiguration object) {
			return createIDocumentGeneratorConfigurationAdapter();
		}

		@Override
		public Adapter caseDefaultDocumentGeneratorConfiguration(DefaultDocumentGeneratorConfiguration object) {
			return createDefaultDocumentGeneratorConfigurationAdapter();
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
	 *                   the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration <em>Default Document Structure Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration
	 * @generated
	 */
	public Adapter createDefaultDocumentStructureGeneratorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration <em>Abstract Document Structure Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration
	 * @generated
	 */
	public Adapter createAbstractDocumentStructureGeneratorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration <em>Abstract Document Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration
	 * @generated
	 */
	public Adapter createAbstractDocumentGeneratorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration <em>Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfiguration
	 * @generated
	 */
	public Adapter createGeneratorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration <em>IDocument Structure Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration
	 * @generated
	 */
	public Adapter createIDocumentStructureGeneratorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration <em>IDocument Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration
	 * @generated
	 */
	public Adapter createIDocumentGeneratorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration <em>Default Document Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration
	 * @generated
	 */
	public Adapter createDefaultDocumentGeneratorConfigurationAdapter() {
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

} // GeneratorConfigurationAdapterFactory
