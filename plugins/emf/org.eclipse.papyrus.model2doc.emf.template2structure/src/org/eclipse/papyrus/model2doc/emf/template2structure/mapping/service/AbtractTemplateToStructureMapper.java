/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service;

import java.util.Collection;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;

/**
 * Abstract class for all mappers
 *
 */
public abstract class AbtractTemplateToStructureMapper<INPUT extends EObject, OUTPUT extends EObject> {

	/**
	 * the handled input eClass
	 */
	private final EClass inputEClass;

	/**
	 * the handled input eClass
	 */
	private final EClass outputEClass;

	/**
	 *
	 * Constructor.
	 *
	 * @param inputEClass
	 *            the eClass we know convert in a DocumentStructure element. This EClass can't be abstract.
	 * @param outputEClass
	 *            the eClass representing the output type of the mapping. This EClass can be abstract
	 */
	public AbtractTemplateToStructureMapper(final EClass inputEClass, final EClass outputEClass) {
		Assert.isNotNull(inputEClass);
		Assert.isTrue(false == inputEClass.isAbstract(), NLS.bind("The EClass {0} is abstract and it should not.", inputEClass)); //$NON-NLS-1$
		Assert.isNotNull(outputEClass);
		this.inputEClass = inputEClass;
		this.outputEClass = outputEClass;
	}

	/**
	 *
	 * @return
	 * 		the EClass supported as input by the current mapper
	 */
	public final EClass getInputEClass() {
		return inputEClass;
	}

	/**
	 *
	 * @return
	 * 		the EClass supported as output by the current mapper
	 */
	public final EClass getOutputEClass() {
		return outputEClass;
	}

	/**
	 *
	 * @param eobject
	 *            an EObejct
	 * @return
	 * 		<code>true</code> if the EObject is handler by this mapper
	 */
	private final boolean handlesInput(final EObject eobject) {
		return handlesInput(eobject.eClass());
	}

	/**
	 *
	 *
	 * @param eobject
	 *            an eobject or <code>null</code>F
	 * @return
	 * 		<code>true</code> for <code>null</code> and when the EClass of the EObject matches the expected return type of the mapper
	 */
	private final boolean handlesRealOuput(final EObject eobject) {
		return eobject == null || handlesRealOuput(eobject.eClass());
	}

	/**
	 *
	 * @param eClass
	 * @return
	 * 		<code>true</code> if the EClass matches the supported EClass
	 */
	public final boolean handlesInput(final EClass eClass) {
		return this.inputEClass == eClass;
	}

	/**
	 *
	 * @param eClass
	 * @return
	 * 		<code>true</code> if the EClass is a super type of the output EClass supported by the mapper
	 */
	public final boolean handlesExpectedOuput(final EClass eClass) {
		return eClass.isSuperTypeOf(this.outputEClass);
	}

	/**
	 *
	 * @param eClass
	 * @return
	 * 		return <code>true</code> if the tested EClass is a subtype of the supported output EClass
	 */
	public final boolean handlesRealOuput(final EClass eClass) {
		return this.outputEClass.isSuperTypeOf(eClass);
	}

	/**
	 *
	 * @param documentTemplateElement
	 *            a document template element
	 * @param semanticModelElement
	 *            an element of the user model
	 * @param expectedReturnedEClass
	 *            the returned elements must be instance of this EClass
	 * @return
	 * 		a collection of the created elements to answer to this mapping request
	 */
	@SuppressWarnings("unchecked")
	public final Collection<EObject> map(final EObject documentTemplateElement, final EObject semanticModelElement, final EClass expectedReturnedEClass) {
		// 1. check types
		Assert.isTrue(handlesInput(documentTemplateElement));
		Assert.isTrue(handlesExpectedOuput(expectedReturnedEClass));

		// 2. do mapping
		final Collection<OUTPUT> result = doMap((INPUT) documentTemplateElement, semanticModelElement);

		// 3. check type result
		// TODO adapt this test
		// Assert.isTrue(handlesRealOuput(result), NLS.bind("The created element {0} doesn't match the expected EClass {1}.", result.getClass().getName(), expectedReturnedEClass));
		return (Collection<EObject>) result;
	}

	/**
	 *
	 * @param documentTemplateElement
	 *            a document template element
	 * @param semanticModelElement
	 *            an element of the user model
	 * @return
	 * 		the created document structure element or <code>null</code>
	 */
	protected abstract Collection<OUTPUT> doMap(INPUT documentTemplateElement, final EObject semanticModelElement);
}
