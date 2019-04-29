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

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.editors.factories;

import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

/**
 * Factory used to edit {@link StereotypePropertyReferencePartTemplate#setStereotypeQualifiedName(String)}
 */
public class StereotypePropertyReferencePartTemplateStereotypeQualifiedNameEditorFactory extends StereotypePartTemplateStereotypeQualifiedNameEditorFactory {

	/**
	 * This editor is registered with this URI with the extension point org.eclipse.emf.edit.propertyEditorFactories.
	 * This editor is also registered with this URI in an EAnnotation in the ecore model
	 */
	private static final URI SELF_URI = URI.createURI("editor://umldocumentstructuretemplate/StereotypePropertyReferencePartTemplate/stereotypeQualifiedName/"); //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 * @param propertyEditorFactoryURI
	 */
	public StereotypePropertyReferencePartTemplateStereotypeQualifiedNameEditorFactory() {
		super(SELF_URI, UMLDocumentStructureTemplatePackage.eINSTANCE.getStereotypePropertyReferencePartTemplate_StereotypeQualifiedName());
	}

}
