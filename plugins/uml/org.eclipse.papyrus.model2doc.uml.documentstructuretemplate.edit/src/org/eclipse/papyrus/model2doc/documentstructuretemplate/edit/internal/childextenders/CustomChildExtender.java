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

package org.eclipse.papyrus.model2doc.documentstructuretemplate.edit.internal.childextenders;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.provider.UMLDocumentStructureTemplateEditPlugin;

/**
 * This class has been created to fix the bug 547254
 */
public class CustomChildExtender implements IChildCreationExtender {

	/**
	 * a dummy {@link EClassPartTemplate} used to get all possibles children descriptorsF
	 */
	private static final EClassPartTemplate DUMMY_ECLASS_PART_TEMPLATE = DocumentStructureTemplateFactory.eINSTANCE.createEClassPartTemplate();

	/**
	 *
	 * Constructor.
	 *
	 */
	public CustomChildExtender() {
		// nothing to do
	}

	/**
	 *
	 * @see org.eclipse.emf.edit.provider.IChildCreationExtender#getNewChildDescriptors(java.lang.Object, org.eclipse.emf.edit.domain.EditingDomain)
	 *
	 * @param object
	 * @param editingDomain
	 * @return
	 */
	@Override
	public Collection<?> getNewChildDescriptors(final Object object, EditingDomain editingDomain) {
		if (object instanceof StereotypePartTemplate) {

			Collection<?> result = editingDomain.getNewChildDescriptors(DUMMY_ECLASS_PART_TEMPLATE, null);
			final Collection<CommandParameter> childDescriptors = new ArrayList<>();
			for (final Object current : result) {
				if (current instanceof CommandParameter) {
					final CommandParameter cmd = (CommandParameter) current;
					final EObject value = cmd.getEValue();
					if (null != value) {
						final EPackage ePackage = value.eClass().getEPackage();

						// by default, the children descriptor providing from the "root" metamodel (DocumentStructureTemplate)
						// and from the UMLDocumentStructureTemplate are found, so we remove these contributions
						if (ePackage != DocumentStructureTemplatePackage.eINSTANCE
								&& ePackage != UMLDocumentStructureTemplatePackage.eINSTANCE) {
							childDescriptors.add(cmd);
						}

					}
				}

			}
			return childDescriptors;
		}
		return Collections.emptyList();
	}

	/**
	 *
	 * @see org.eclipse.emf.edit.provider.IChildCreationExtender#getResourceLocator()
	 *
	 * @return
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UMLDocumentStructureTemplateEditPlugin.INSTANCE;
	}

}
