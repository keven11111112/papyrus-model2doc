/**
 * Copyright (c) 2019 CEA LIST.
 * 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceDocumentPartTemplate;

public class EReferenceDocumentPartTemplate_FeatureConstraint extends AbstractModelConstraint {



	/**
	 * 
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 *
	 * @param arg0
	 * @return
	 */
	@Override
	public IStatus validate(IValidationContext arg0) {
		final EReferenceDocumentPartTemplate template = (EReferenceDocumentPartTemplate) arg0.getTarget();
		final EObject parent = template.eContainer();
		final EStructuralFeature feature = template.getEReference();
		if (null != feature && parent instanceof EClassDocumentPartTemplate && null != ((EClassDocumentPartTemplate) parent).getEClass()) {
			final EClass eclass = ((EClassDocumentPartTemplate) parent).getEClass();
			if (false == eclass.getEAllReferences().contains(feature)) {
				return arg0.createFailureStatus(eclass.getName(), feature.getName());// message is defined in the plugin.xml
			}
		}

		return arg0.createSuccessStatus();
	}
}



