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
package org.eclipse.papyrus.model2doc.documentview.ui.internal.advice;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyDependentsRequest;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ide.undo.DeleteResourcesOperation;

import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.documentview.ui.internal.message.Messages;

/**
 * This edit helper advice class provides 'before' advice for dealing with generated document 
 * when document view element is deleted from notation model (it means, from model explorer).
 * 
 */
public class DeleteDocumentViewAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getBeforeDestroyDependentsCommand(DestroyDependentsRequest request) {
		if (request.getElementToDestroy() instanceof Document) {
			Document document = (Document) request.getElementToDestroy();
			ICommand cmd = new AbstractTransactionalCommand(request.getEditingDomain(), null, null) {

				DeleteResourcesOperation op = null;

				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					IPath path = new Path(document.getGeneratedDocumentFileURI());
					final IFile fileToDelete = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
					boolean canNotDeleteFile = false;
					
					// Verify if the file can be deleted
					File file = new File(fileToDelete.getLocation().toString());
					if (!file.renameTo(file) && file.exists()) {
						canNotDeleteFile = true;
					}
					
					// if the file can not be deleted then information dialog is opened
					if(canNotDeleteFile) {
						MessageDialog.openInformation(Display.getDefault().getActiveShell(), Messages.DeleteDocumentViewAdvice_DestroyDocumentFile,NLS.bind(Messages.DeleteDocumentViewAdvice_DocumentCanNotBeDeletedBecauseFileIsOpened, fileToDelete.getName()));
						//to rollaback automatically the delete Document command previously executed 
						return CommandResult.newCancelledCommandResult();
						
					}
					
					List<? extends IResource> resourcesToDelete = Collections.singletonList(fileToDelete);
					op = new DeleteResourcesOperation(resourcesToDelete.toArray(new IResource[resourcesToDelete.size()]),
							"Delete Resources", false); //$NON-NLS-1$

					op.execute(new NullProgressMonitor(), null);
					return CommandResult.newOKCommandResult();
				}

				
				@Override
				protected IStatus doRedo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					op.redo(new NullProgressMonitor(), null);
					return super.doRedo(monitor, info);
				}

				@Override
				protected IStatus doUndo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					op.undo(new NullProgressMonitor(), null);
					return super.doUndo(monitor, info);
				}

				@Override
				public boolean canUndo() {
					return null!=op && op.canUndo();
				}

				@Override
				public boolean canRedo() {
					return null!=op && op.canRedo();
				}
			};

			return cmd;
		}
		return super.getBeforeDestroyDependentsCommand(request);
	}
}
