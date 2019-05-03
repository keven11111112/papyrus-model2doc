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

package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal;

import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.properties.sections.AbstractEObjectAdvancedPropertySection;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * This class provides the section for the elements coming from PapyrusNattableDocumentStructureTemplate metamodel
 */
public class PapyrusNattableDocumentStructureTemplatePropertySection extends AbstractEObjectAdvancedPropertySection {

	/**
	 *
	 * Constructor.
	 *
	 */
	public PapyrusNattableDocumentStructureTemplatePropertySection() {
		super();
	}


	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.properties.sections.AbstractEObjectAdvancedPropertySection#createPropertySource(java.lang.Object, org.eclipse.emf.edit.provider.IItemPropertySource)
	 *
	 * @param object
	 * @param itemPropertySource
	 * @return
	 */
	@Override
	public IPropertySource createPropertySource(final Object object, final IItemPropertySource itemPropertySource) {
		return new PapyrusNattableDocumentTemplateStructurePropertySource(object, itemPropertySource);
	}
}
