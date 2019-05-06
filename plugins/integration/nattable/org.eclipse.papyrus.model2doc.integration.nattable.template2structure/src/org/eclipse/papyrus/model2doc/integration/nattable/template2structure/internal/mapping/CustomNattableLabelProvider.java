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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.nattable.template2structure.internal.mapping;

import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.layer.LabelStack;
import org.eclipse.papyrus.infra.nattable.provider.NattableTopLabelProvider;
import org.eclipse.papyrus.infra.nattable.utils.ILabelProviderCellContextElementWrapper;
import org.eclipse.swt.graphics.Rectangle;

/**
 * Label provider used to get the label of elements located in the row header and in the column header
 *
 * Package visibility class to be sure we won't use it in other location
 * This class is not API
 */
/* public */ class CustomNattableLabelProvider extends NattableTopLabelProvider {

	/**
	 * element wrapper used to get the label of an element
	 */
	private final StubILabelProviderCellContextElementWrapper wrapper;

	/**
	 * the config registry of a NatTable instance
	 */
	private IConfigRegistry configRegistry;

	/**
	 *
	 * Constructor.
	 *
	 * @param registry
	 *            the config registry of a NatTable instance
	 */
	public CustomNattableLabelProvider(final IConfigRegistry registry) {
		this.wrapper = new StubILabelProviderCellContextElementWrapper(registry);
		this.configRegistry = registry;
	}

	/**
	 *
	 * @param element
	 *            an element
	 * @return
	 *         the label for this element used as row header
	 */
	public String getRowHeaderLabel(final Object element) {
		this.wrapper.setColumn(false);
		this.wrapper.setObject(element);
		final String res = getRowHeaderLabel(this.wrapper, this.configRegistry);
		return null != res ? res : ""; //$NON-NLS-1$

	}

	/**
	 *
	 * @param element
	 *            an element
	 * @return
	 *         the label for this element used as column header
	 */
	public String getColumnHeaderLabel(final Object element) {
		this.wrapper.setColumn(true);
		this.wrapper.setObject(element);
		final String res = getColumnHeaderLabel(this.wrapper, this.configRegistry);

		return null != res ? res : ""; //$NON-NLS-1$
	}


	/**
	 * This class looks like the {@link ILabelProviderCellContextElementWrapper} used in Papyrus NatTable to calculate the label displayed in the cells
	 */
	private class StubILabelProviderCellContextElementWrapper implements ILabelProviderCellContextElementWrapper {

		/**
		 * The object for which we want the label
		 */
		private Object object;

		/**
		 * the configRegistry of a NatTable instance
		 */
		private final IConfigRegistry configRegistry;

		/**
		 * a boolean indicating if we want the label of a row header or a column header
		 */
		private boolean isColumn;

		/**
		 *
		 * Constructor.
		 *
		 * @param configRegistry
		 *            the configRegistry of a NatTable instance
		 */
		StubILabelProviderCellContextElementWrapper(final IConfigRegistry configRegistry) {
			this.configRegistry = configRegistry;
		}

		/**
		 * @param object
		 *            the object to set
		 */
		public void setObject(Object object) {
			this.object = object;
		}


		/**
		 * @param isColumn
		 *            the isColumn to set
		 */
		public void setColumn(boolean isColumn) {
			this.isColumn = isColumn;
		}

		/**
		 * @see org.eclipse.papyrus.infra.nattable.utils.ILabelProviderContextElementWrapper#getConfigRegistry()
		 *
		 * @return
		 */
		@Override
		public IConfigRegistry getConfigRegistry() {
			return this.configRegistry;
		}

		/**
		 * @see org.eclipse.papyrus.infra.nattable.utils.ILabelProviderContextElementWrapper#getObject()
		 *
		 * @return
		 */
		@Override
		public Object getObject() {
			return object;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getOriginColumnPosition()
		 *
		 * @return
		 */
		@Override
		public int getOriginColumnPosition() {
			return 0;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getOriginRowPosition()
		 *
		 * @return
		 */
		@Override
		public int getOriginRowPosition() {
			return 0;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getLayer()
		 *
		 * @return
		 */
		@Override
		public ILayer getLayer() {
			return null;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getColumnPosition()
		 *
		 * @return
		 */
		@Override
		public int getColumnPosition() {
			return 0;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getRowPosition()
		 *
		 * @return
		 */
		@Override
		public int getRowPosition() {
			return 0;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getColumnIndex()
		 *
		 * @return
		 */
		@Override
		public int getColumnIndex() {
			return 0;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getRowIndex()
		 *
		 * @return
		 */
		@Override
		public int getRowIndex() {
			return 0;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getColumnSpan()
		 *
		 * @return
		 */
		@Override
		public int getColumnSpan() {
			return 0;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getRowSpan()
		 *
		 * @return
		 */
		@Override
		public int getRowSpan() {
			return 0;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#isSpannedCell()
		 *
		 * @return
		 */
		@Override
		public boolean isSpannedCell() {
			return false;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getDisplayMode()
		 *
		 * @return
		 */
		@Override
		public String getDisplayMode() {
			return null;
		}

		/**
		 * private fields used by the method getConfigLabel. These field will avoid us to recreate them regularly
		 */
		private final LabelStack COLUMN_HEADER_STACK = new LabelStack(GridRegion.COLUMN_HEADER);

		private final LabelStack ROW_HEADER_STACK = new LabelStack(GridRegion.ROW_HEADER);


		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getConfigLabels()
		 *
		 * @return
		 */
		@Override
		public LabelStack getConfigLabels() {
			if (this.isColumn) {
				return COLUMN_HEADER_STACK;
			}
			return ROW_HEADER_STACK;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getDataValue()
		 *
		 * @return
		 */
		@Override
		public Object getDataValue() {
			return this.object;
		}

		/**
		 * @see org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell#getBounds()
		 *
		 * @return
		 */
		@Override
		public Rectangle getBounds() {
			return null;
		}

	}
}
