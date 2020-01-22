/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.editor.tests;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.TransactionalDocumentStructureTemplateEditor;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils.DocumentStructureTemplateConstants;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.junit.Assert;
import org.junit.Test;

/**
 * This tests checks the editor used to load a DocumentStructureTemplate model
 */
@SuppressWarnings("nls")
public class CheckEditorTest {


	/**
	 * We check the opened editor is the good one
	 */
	@Test
	public void checkEditor() {
		final URI model2LoadURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID, true).appendSegment("models").appendSegment("empty").appendFileExtension(DocumentStructureTemplateConstants.DOCUMENT_STRUCTURE_TEMPLATE_FILE_EXTENSION);
		final ResourceSet set = new ResourceSetImpl();
		final Resource res = set.getResource(model2LoadURI, true);
		final IFile f = getIFile(res);
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		try {
			IEditorPart part = IDE.openEditor(page, f);
			Assert.assertTrue("The loaded editor is not the transactional one.", part instanceof TransactionalDocumentStructureTemplateEditor);

		} catch (PartInitException e) {
			Assert.assertTrue("An exception occured, the test was not valid", false);
		}
	}

	/**
	 * Getting an IFile from an EMF Resource
	 *
	 * @param eObject
	 * @return
	 */
	private static final IFile getIFile(Resource res) {
		URI uri = res.getURI();
		String filePath = uri.toPlatformString(true);
		IFile ifile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filePath));
		return ifile;
	}

}
