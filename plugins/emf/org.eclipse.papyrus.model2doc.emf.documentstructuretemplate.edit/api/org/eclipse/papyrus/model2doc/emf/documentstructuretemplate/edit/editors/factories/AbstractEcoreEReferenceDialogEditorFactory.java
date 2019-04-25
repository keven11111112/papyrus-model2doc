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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;

/**
 * An abstract class used to select EObject from Ecore model
 * This abstract class looks for the DocumentTemplate to calculate the dialogInput
 */
public abstract class AbstractEcoreEReferenceDialogEditorFactory extends AbstractEStructuralFeatureDialogEditorFactory {

	/**
	 * Constructor.
	 *
	 * @param propertyEditorFactoryURI
	 * @param editedFeature
	 */
	public AbstractEcoreEReferenceDialogEditorFactory(final URI propertyEditorFactoryURI, final EStructuralFeature editedFeature) {
		super(propertyEditorFactoryURI, editedFeature);
	}


	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory#getDialogInput()
	 *
	 * @return
	 */
	@Override
	protected Collection<?> getDialogInput(final EObject editedObject) {
		final Collection<EPackage> input = new HashSet<>();

		EObject parent = editedObject;
		DocumentTemplate template = null;
		// we are looking for the document template
		while (parent != null && template == null) {
			if (parent instanceof DocumentTemplate) {
				template = (DocumentTemplate) parent;
			} else {
				parent = parent.eContainer();
			}
		}

		// we check if the document template has a context
		// (there is no context editing a DocumentTemplatePrototype)
		if (null != template && null != template.getSemanticContext()) {
			EObject documentContext = template.getSemanticContext();
			input.add(documentContext.eClass().getEPackage());
		} else {
			// in this case we cross the loaded resource to find EPackage in others resource
			final ResourceSet set = editedObject.eResource().getResourceSet();
			Iterator<Resource> iter = set.getResources().iterator();
			while (iter.hasNext()) {
				final Resource res = iter.next();
				for (EObject eobject : res.getContents()) {
					if (eobject instanceof EPackage) {
						input.add((EPackage) eobject);
					} else {
						final EClass eClass = eobject.eClass();
						if (null != eClass && null != eClass.getEPackage()) {
							input.add(eClass.getEPackage());
						}
					}
				}
			}
		}
		return input;
	}
}
