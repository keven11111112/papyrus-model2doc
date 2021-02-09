/*****************************************************************************
 * Copyright (c) 2020, 2021 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Bug 570927
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.internal.custom;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDescriptionLanguage;
import org.eclipse.papyrus.infra.tools.util.ClassLoaderHelper;
import org.eclipse.papyrus.infra.types.ElementTypeSetConfiguration;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.RepresentationPackage;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.command.ICreateDocumentTemplateEditorCommand;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.PapyrusDocumentPrototypeImpl;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.util.RepresentationValidator;

/**
 * Custom implementation for {@link PapyrusDocumentPrototypeImpl}
 */
public class CustomPapyrusDocumentPrototypeImpl extends PapyrusDocumentPrototypeImpl {

	// the 2 next field could be in org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.types, but we want to avoid a dependency between these plugins
	// TODO : try to solve this point
	/**
	 * the name of the required element type
	 */
	private static final String REQUIRED_ELEMENT_TYPE_NAME = "DocumentTemplateContext"; //$NON-NLS-1$

	/**
	 * the ID of the required element type
	 */
	private static final String REQUIRED_ELEMENT_TYPE_IDENTIFIER = "org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.types.elementTypeSet"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.PapyrusDocumentPrototypeImpl#isValidClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 *
	 * @param chain
	 * @param context
	 * @return
	 */
	@Override
	public boolean isValidClass(DiagnosticChain chain, Map<Object, Object> context) {
		final String creationClassName = getCreationCommandClass();

		Class<?> creationClass = ClassLoaderHelper.loadClass(creationClassName);
		Object newInstance = null;
		if (creationClass != null) {
			try {
				Constructor<?> constructor = creationClass.getDeclaredConstructor(new Class<?>[0]);
				newInstance = constructor.newInstance(new Object[0]);
			} catch (NoSuchMethodException | SecurityException e) {
				// nothing to do
			} catch (InstantiationException e) {
				// nothing to do
			} catch (IllegalAccessException e) {
				// nothing to do
			} catch (IllegalArgumentException e) {
				// nothing to do
			} catch (InvocationTargetException e) {
				// nothing to do
			}
		}
		if (newInstance == null) {
			if (chain != null) {
				chain.add(createDiagnostic(NLS.bind("The referenced creationClassCommand {0} can't be instanciated", creationClass.getCanonicalName()))); //$NON-NLS-1$
			}
		} else {
			if (!ICreateDocumentTemplateEditorCommand.class.isInstance(newInstance)) {
				chain.add(createDiagnostic(NLS.bind("The class {0} is not an instance of {1}.", newInstance.getClass().getCanonicalName(), ICreateDocumentTemplateEditorCommand.class.getCanonicalName()))); //$NON-NLS-1$
			}
		}

		final ArchitectureDescriptionLanguage language = getLanguage();

		// this test allows to check that the element type used to delete the DocumentStructure is registered
		boolean contains = false;
		final Iterator<ElementTypeSetConfiguration> iter = language.getElementTypes().iterator();
		while (iter.hasNext() && !contains) {
			final ElementTypeSetConfiguration type = iter.next();
			contains = REQUIRED_ELEMENT_TYPE_IDENTIFIER.equals(type.getIdentifier())
					&& REQUIRED_ELEMENT_TYPE_NAME.equals(type.getName());

		}
		if (!contains) {
			chain.add(createDiagnostic(NLS.bind("The element type {0} is not registered in your architecture file.", REQUIRED_ELEMENT_TYPE_IDENTIFIER))); //$NON-NLS-1$
		}

		return super.isValidClass(chain, context);
	}

	/**
	 *
	 * @param message
	 * @return
	 */
	private Diagnostic createDiagnostic(final String message) {
		return new BasicDiagnostic(Diagnostic.ERROR,
				RepresentationValidator.DIAGNOSTIC_SOURCE,
				RepresentationValidator.PAPYRUS_DOCUMENT_PROTOTYPE__IS_VALID_CLASS,
				message,
				new Object[] { this, RepresentationPackage.eINSTANCE.getPapyrusDocumentPrototype_CreationCommandClass() });
	}
}
