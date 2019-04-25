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

package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.properties.internal;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.properties.EReferencePartTemplateEReferenceEditorFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.properties.EcoreLabelProvider;
import org.eclipse.swt.widgets.Composite;

/**
 * the property descriptor for {@link EReferencePartTemplate}
 */
public class EReferencePartTemplatePropertyDescriptor extends PropertyDescriptor {

	/**
	 * The factory used to create the CellEditor
	 */
	private final EReferencePartTemplateEReferenceEditorFactory factory = new EReferencePartTemplateEReferenceEditorFactory();

	/**
	 * the label provider used to display the feature in the Property View cell
	 */
	private final ILabelProvider provider = new EcoreLabelProvider();

	/**
	 * Constructor.
	 *
	 * @param object
	 * @param itemPropertyDescriptor
	 */
	public EReferencePartTemplatePropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}

	/**
	 * @see org.eclipse.emf.edit.ui.provider.PropertyDescriptor#createPropertyEditor(org.eclipse.swt.widgets.Composite)
	 *
	 * @param composite
	 * @return
	 */
	@Override
	public CellEditor createPropertyEditor(Composite composite) {
		return this.factory.createEditor(object, itemPropertyDescriptor, composite);
	}

	/**
	 * @see org.eclipse.emf.edit.ui.provider.PropertyDescriptor#getLabelProvider()
	 *
	 * @return
	 */
	@Override
	public ILabelProvider getLabelProvider() {
		return this.provider;
	}
}
