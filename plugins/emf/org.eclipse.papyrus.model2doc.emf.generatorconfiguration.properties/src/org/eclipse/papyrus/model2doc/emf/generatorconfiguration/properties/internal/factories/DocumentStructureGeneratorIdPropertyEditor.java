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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.emf.generatorconfiguration.properties.internal.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.EMFEditUIPropertyEditorFactory;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.Template2StructureRegistry;
import org.eclipse.swt.widgets.Composite;

/**
 * The property editor used to edit {@link AbstractDocumentStructureGeneratorConfiguration#getStructureGeneratorId()}
 * The provided editor allows to get a combo box with the registered generator.
 * The edited field is the id of the generator, but this id is not shown by the editor.
 * We display a nice label instead of the real field value.
 */
public class DocumentStructureGeneratorIdPropertyEditor extends EMFEditUIPropertyEditorFactory {

	/**
	 * the uri of the editor (declared in the UML model)
	 */
	private static final URI SELF_URI = URI.createURI("editor://generatorconfiguration/AbstractDocumentStructureGeneratorConfiguration/structureGeneratorId/"); //$NON-NLS-1$

	/**
	 *
	 * Constructor.
	 *
	 */
	public DocumentStructureGeneratorIdPropertyEditor() {
		super(SELF_URI);
	}

	/**
	 * @see org.eclipse.emf.edit.ui.provider.EMFEditUIPropertyEditorFactory#createEditor(java.lang.Object, org.eclipse.emf.edit.provider.IItemPropertyDescriptor, org.eclipse.swt.widgets.Composite)
	 *
	 * @param object
	 * @param propertyDescriptor
	 * @param composite
	 * @return
	 */
	@Override
	public CellEditor createEditor(final Object object, final IItemPropertyDescriptor propertyDescriptor, final Composite composite) {
		DocumentTemplate documentTemplate = null;
		if (object instanceof DefaultDocumentStructureGeneratorConfiguration) {
			EObject parent = ((DefaultDocumentStructureGeneratorConfiguration) object).eContainer();
			if (parent instanceof DocumentTemplate) {
				documentTemplate = (DocumentTemplate) parent;
			}
		}
		// must always be true
		Assert.isNotNull(documentTemplate);

		final List<Object> generators = new ArrayList<>(Template2StructureRegistry.INSTANCE.getAvailableGenerators(documentTemplate));
		return new DocumentStructureGeneratorExtendedComboBoxCellEditor(composite, generators, new DocumentStructureGeneratorIdLabelProvider());
	}

	/**
	 * The cell editor to use to edit the document generator id
	 */
	private class DocumentStructureGeneratorExtendedComboBoxCellEditor extends ExtendedComboBoxCellEditor {

		/**
		 * Constructor.
		 *
		 * @param composite
		 * @param list
		 * @param labelProvider
		 */
		public DocumentStructureGeneratorExtendedComboBoxCellEditor(Composite composite, List<?> list, ILabelProvider labelProvider) {
			super(composite, list, labelProvider);
		}

		/**
		 * @see org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor#doSetValue(java.lang.Object)
		 *
		 * @param value
		 */
		@Override
		public void doSetValue(Object value) {
			if (value instanceof String) {
				final ITemplate2StructureGenerator generator = Template2StructureRegistry.INSTANCE.getGenerator((String) value);
				if (generator != null) {
					super.doSetValue(generator.getEditorLabel());
				}

			}
			if (value == null) {
				super.doSetValue(""); //$NON-NLS-1$
				return;
			}
			super.doSetValue(value);
		}

		/**
		 * @see org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor#doGetValue()
		 *
		 * @return
		 */
		@Override
		public Object doGetValue() {
			Object getValue = super.doGetValue();
			if (getValue instanceof ITemplate2StructureGenerator) {
				getValue = ((ITemplate2StructureGenerator) getValue).getGeneratorId();
			}
			return getValue;
		}
	}

	/**
	 * @see org.eclipse.emf.edit.provider.PropertyEditorFactory#createLabelProvider(java.lang.Object, org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 *
	 * @param object
	 * @param propertyDescriptor
	 * @return
	 */
	@Override
	public IItemLabelProvider createLabelProvider(final Object object, final IItemPropertyDescriptor propertyDescriptor) {
		return new DocumentStructureGeneratorLabelProvider();
	}

	/**
	 * The label provider allowing to mask the real value of the edited field and allowing to display a nice label instead
	 */
	private static class DocumentStructureGeneratorLabelProvider implements IItemLabelProvider {

		/**
		 * @see org.eclipse.emf.edit.provider.IItemLabelProvider#getText(java.lang.Object)
		 *
		 * @param object
		 * @return
		 */
		@Override
		public String getText(Object object) {
			if (object instanceof String) {
				final ITemplate2StructureGenerator generator = Template2StructureRegistry.INSTANCE.getGenerator((String) object);
				if (generator != null) {
					return generator.getEditorLabel();
				}
				return (String) object;
			}
			// probably not possible
			return ""; //$NON-NLS-1$
		}

		/**
		 * @see org.eclipse.emf.edit.provider.IItemLabelProvider#getImage(java.lang.Object)
		 *
		 * @param object
		 * @return
		 */
		@Override
		public Object getImage(Object object) {
			return null;
		}
	}

	/**
	 * Label provider for {@link ITemplate2StructureGenerator}
	 */
	private class DocumentStructureGeneratorIdLabelProvider extends LabelProvider {

		/**
		 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
		 *
		 * @param element
		 * @return
		 */
		@Override
		public String getText(Object element) {
			if (element == null) {
				return ""; //$NON-NLS-1$
			}
			if (element instanceof ITemplate2StructureGenerator) {
				return ((ITemplate2StructureGenerator) element).getEditorLabel();
			}
			// probably not possible
			return super.getText(element);
		}
	}
}
