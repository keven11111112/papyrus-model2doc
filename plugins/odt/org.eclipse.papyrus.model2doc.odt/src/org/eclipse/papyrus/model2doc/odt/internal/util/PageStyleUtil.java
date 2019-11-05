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
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.internal.util;

import org.eclipse.papyrus.model2doc.odt.Activator;

import com.sun.star.awt.Size;
import com.sun.star.beans.XPropertySet;
import com.sun.star.container.ElementExistException;
import com.sun.star.container.NoSuchElementException;
import com.sun.star.container.XNameContainer;
import com.sun.star.lang.IllegalArgumentException;
import com.sun.star.lang.WrappedTargetException;
import com.sun.star.lang.XMultiServiceFactory;
import com.sun.star.text.XTextDocument;
import com.sun.star.uno.Exception;
import com.sun.star.uno.UnoRuntime;

/**
 * the constants used by PageStyle
 */
public class PageStyleUtil {

	private PageStyleUtil() {
		// to prevent instanciation
	}

	/**
	 * @param xTextDocument
	 *            the edited document
	 * @param xDocMSF
	 *            the multi service factory
	 * @param pageStyleName
	 *            the name of the page style we are looking for
	 * @return
	 *         <ul>
	 *         <li><code>true</code> if the existing page style already exists</li>
	 *         <li><code>false</code> if not found or in case of exception</li>
	 *         <ul>
	 */
	public static boolean isPageStyleAlreadyDefined(final XTextDocument xTextDocument, final XMultiServiceFactory xDocMSF, final String pageStyleName) {
		final com.sun.star.container.XNameContainer xPageStyleCollection = getPageStyleCollectionContainer(xTextDocument, xDocMSF);
		if (xPageStyleCollection != null) {
			return xPageStyleCollection.hasByName(pageStyleName);
		}
		return false;
	}


	/**
	 * @param xTextDocument
	 *            the edited document
	 * @param xDocMSF
	 *            the multi service factory
	 * @return the container of the existing PageStyle or <code>null</code> if not found (in case of exception...)
	 */
	public static XNameContainer getPageStyleCollectionContainer(final XTextDocument xTextDocument, final XMultiServiceFactory xDocMSF) {

		// create a supplier to get the Style family collection
		final com.sun.star.style.XStyleFamiliesSupplier xSupplier = UnoRuntime.queryInterface(
				com.sun.star.style.XStyleFamiliesSupplier.class, xTextDocument);

		// get the NameAccess interface from the Style family collection
		final com.sun.star.container.XNameAccess xNameAccess = xSupplier.getStyleFamilies();

		// select the Page styles, you get the Page style collection
		com.sun.star.container.XNameContainer xPageStyleCollection;
		try {
			xPageStyleCollection = UnoRuntime.queryInterface(
					com.sun.star.container.XNameContainer.class,
					xNameAccess.getByName(PageStyleConstants.PAGESTYLE_FAMILY_NAME));
			return xPageStyleCollection;
		} catch (NoSuchElementException e) {
			Activator.log.error(e);
		} catch (WrappedTargetException e) {
			Activator.log.error(e);
		}

		return null;
	}

	/**
	 *
	 * @param xTextDocument
	 *            the edited text document
	 * @param xDocMSF
	 *            the multi service factory
	 * @param originalPageStyleName
	 *            the initial page style name used to create a new one
	 * @param newPageStyleName
	 *            the name of the new page style
	 * @return
	 *         the new page style or <code>null</code>
	 */
	public static final XPropertySet createNewPageStyle(final XTextDocument xTextDocument, final XMultiServiceFactory xDocMSF, final String originalPageStyleName, final String newPageStyleName) {
		if (isPageStyleAlreadyDefined(xTextDocument, xDocMSF, newPageStyleName)) {
			return null;
		}
		final XNameContainer pageStyleCollection = getPageStyleCollectionContainer(xTextDocument, xDocMSF);
		final XPropertySet basePropertySet = getExistingPageStyle(xTextDocument, xDocMSF, originalPageStyleName);
		if (basePropertySet != null) {
			// create a new page style
			com.sun.star.uno.XInterface xInterface;
			try {
				xInterface = (com.sun.star.uno.XInterface) xDocMSF.createInstance(PageStyleConstants.PAGESTYLE_INSTANCE_NAME);
			} catch (Exception e1) {
				Activator.log.error(e1);
				return null;
			}
			// get its property set to edit it
			com.sun.star.beans.XPropertySet xPropertySet = UnoRuntime.queryInterface(com.sun.star.beans.XPropertySet.class, xInterface);
			PropertySetUtil.copyPropertySet(basePropertySet, xPropertySet);
			// register the new property set
			try {
				pageStyleCollection.insertByName(newPageStyleName, xPropertySet);
				return xPropertySet;
			} catch (IllegalArgumentException | ElementExistException | WrappedTargetException e) {
				Activator.log.error(e);
			}

		}
		return null;
	}

	/**
	 *
	 * @param xTextDocument
	 *            the edited text document
	 * @param xDocMSF
	 *            the multi service factory
	 * @param wantedPageStyleName
	 *            the page style name we are looking for
	 * @return
	 *         the page style or <code>null</code> if not found
	 */
	public static final XPropertySet getExistingPageStyle(final XTextDocument xTextDocument, final XMultiServiceFactory xDocMSF, final String wantedPageStyleName) {
		final com.sun.star.container.XNameContainer xPageStyleCollection = getPageStyleCollectionContainer(xTextDocument, xDocMSF);
		if (xPageStyleCollection != null) {
			Object wantedPageStyle;
			try {
				wantedPageStyle = xPageStyleCollection.getByName(wantedPageStyleName);

				final com.sun.star.beans.XPropertySet xPropertySet = UnoRuntime.queryInterface(
						com.sun.star.beans.XPropertySet.class, wantedPageStyle);
				return xPropertySet;
			} catch (NoSuchElementException e) {
				Activator.log.error(e);

			} catch (WrappedTargetException e) {
				Activator.log.error(e);
			}
		}
		return null;
	}

	/**
	 * This method creates a Landscape page style called Custom Landscape
	 *
	 * @param xTextDocument
	 *            the edited text document
	 * @param xDocMSF
	 *            the multi service factory
	 */
	public static final void createCustomLandscapePageStyle(final XTextDocument xTextDocument, final XMultiServiceFactory xDocMSF) {
		final XPropertySet landscapePropertySet = createNewPageStyle(xTextDocument, xDocMSF, PageStyleConstants.PAGESTYLE_NAME_STANDARD, PageStyleConstants.PAGESTYLE_NAME_CUSTOMLANDSCAPE);
		final Integer previousHeight = (Integer) PropertySetUtil.getPropertyValue(landscapePropertySet, PageStyleConstants.HEIGHT);
		final Integer previousWidth = (Integer) PropertySetUtil.getPropertyValue(landscapePropertySet, PageStyleConstants.WIDTH);
		PropertySetUtil.setProperty(landscapePropertySet, PageStyleConstants.WIDTH, previousHeight);
		PropertySetUtil.setProperty(landscapePropertySet, PageStyleConstants.HEIGHT, previousWidth);

		final Size s = new Size(previousHeight.intValue(), previousWidth.intValue());
		PropertySetUtil.setProperty(landscapePropertySet, PageStyleConstants.SIZE, s);

		PropertySetUtil.setProperty(landscapePropertySet, PageStyleConstants.IS_LANDSCAPE, true);
	}
}
