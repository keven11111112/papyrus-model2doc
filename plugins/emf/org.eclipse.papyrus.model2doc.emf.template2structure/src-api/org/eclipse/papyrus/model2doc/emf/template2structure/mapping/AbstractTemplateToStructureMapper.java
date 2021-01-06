/*****************************************************************************
 * Copyright (c) 2019, 2021 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 * 	Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Bug 570133
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.mapping;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;

/**
 * Abstract class for all mappers. The extension of this class must have a constructor without parameters and be registered with the extension point structuregenerator.generator
 *
 */
public abstract class AbstractTemplateToStructureMapper<INPUT extends EObject> {

	protected static final DocumentStructureFactory STRUCTURE_EFACTORY = DocumentStructureFactory.eINSTANCE;

	protected static final DocumentStructurePackage STRUCTURE_EPACKAGE = DocumentStructurePackage.eINSTANCE;

	/**
	 * the handled input eClass
	 */
	private final EClass inputEClass;

	/**
	 * the handled input Class
	 */
	private final Class<?> outputClass;

	/**
	 *
	 * Constructor.
	 *
	 * @param <T>
	 *
	 * @param inputEClass
	 *            the eClass we know convert in a DocumentStructure element. This EClass can't be abstract.
	 * @param outputClass
	 *            the eClass representing the output type of the mapping. This EClass can be abstract
	 */
	public <T> AbstractTemplateToStructureMapper(final EClass inputEClass, final Class<T> outputClass) {
		Assert.isNotNull(inputEClass);
		Assert.isTrue(false == inputEClass.isAbstract(), NLS.bind("The EClass {0} is abstract and it should not.", inputEClass)); //$NON-NLS-1$
		Assert.isNotNull(outputClass);
		this.inputEClass = inputEClass;
		this.outputClass = outputClass;
	}

	/**
	 *
	 * @return
	 *         the EClass supported as input by the current mapper
	 */
	public final EClass getInputEClass() {
		return inputEClass;
	}

	/**
	 *
	 * @param eobject
	 *            an EObejct
	 * @return
	 *         <code>true</code> if the EObject is handler by this mapper
	 */
	private final boolean handlesInput(final EObject eobject) {
		return handlesInput(eobject.eClass());
	}

	/**
	 *
	 * @param eClass
	 * @return
	 *         <code>true</code> if the EClass matches the supported EClass
	 */
	public final boolean handlesInput(final EClass eClass) {
		return this.inputEClass == eClass;
	}

	/**
	 *
	 * @param clazz
	 * @return
	 *         <code>true</code> if the Class is a super type of the output EClass supported by the mapper
	 */
	public final boolean handlesExpectedOutput(final Class<?> clazz) {
		return clazz.isAssignableFrom(this.outputClass);
	}

	/**
	 *
	 * @param <T>
	 * @param mappingService
	 *            the mapping service to use to map sub element of the documentTemplateElement
	 * @param documentTemplateElement
	 *            a document template element
	 * @param semanticModelElement
	 *            an element of the user model
	 * @param expectedReturnedClass
	 *            the returned elements must be instance of this EClass
	 * @return
	 *         a collection of T containing the created elements to answer to this mapping request
	 */
	@SuppressWarnings("unchecked")
	public final <T> List<T> map(final IMappingService mappingService, final EObject documentTemplateElement, final EObject semanticModelElement, final Class<T> expectedReturnedClass) {
		// 1. check types
		Assert.isTrue(handlesInput(documentTemplateElement));
		Assert.isTrue(handlesExpectedOutput(expectedReturnedClass));

		// 2. do mapping
		final List<T> result = doMap(mappingService, (INPUT) documentTemplateElement, semanticModelElement, expectedReturnedClass);

		return result;
	}

	/**
	 *
	 * @param mappingService
	 *            the mapping service to use to map sub element of the documentTemplateElement
	 * @param documentTemplateElement
	 *            a document template element
	 * @param semanticModelElement
	 *            an element of the user model
	 * @param expectedReturnedClass
	 *            the wanted return type
	 * @return
	 *         the created document structure element or <code>null</code>
	 */
	protected abstract <T> List<T> doMap(final IMappingService mappingService, final INPUT documentTemplateElement, final EObject semanticModelElement, final Class<T> expectedReturnedClass);
}
