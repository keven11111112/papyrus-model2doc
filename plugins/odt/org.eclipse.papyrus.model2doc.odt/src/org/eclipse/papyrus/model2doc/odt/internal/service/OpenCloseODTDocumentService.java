/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.odt.internal.service;

import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.DiSashModelManager;
import org.eclipse.papyrus.infra.core.services.IService;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;

import org.eclipse.papyrus.model2doc.odt.internal.listener.OpenCloseODTDocumentListener;

/**
 * This service allows to open and close LibreOffice when the user does Open in the Papyrus ModelExplorer.
 * 
 * @since 3.0
 */
public class OpenCloseODTDocumentService implements IService {

	private OpenCloseODTDocumentListener sashListener;

	private ServicesRegistry registry;

	private DiSashModelManager pageMngr;

	/**
	 * 
	 * @see org.eclipse.papyrus.infra.core.services.IService#init(org.eclipse.papyrus.infra.core.services.ServicesRegistry)
	 *
	 * @param servicesRegistry
	 * @throws ServiceException
	 */
	@Override
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {
		this.registry = servicesRegistry;
	}

	@Override
	public void startService() throws ServiceException {
		this.pageMngr = ServiceUtils.getInstance().getService(DiSashModelManager.class, this.registry);
		this.sashListener = new OpenCloseODTDocumentListener();
		this.pageMngr.getSashModelContentChangedProvider().addListener(this.sashListener);
	}

	@Override
	public void disposeService() throws ServiceException {
		if (null != this.pageMngr.getSashModelContentChangedProvider()) {
			this.pageMngr.getSashModelContentChangedProvider().removeListener(sashListener);
		}
		this.registry = null;
		this.pageMngr = null;
		this.sashListener = null;

	}

}
