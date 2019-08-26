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

package org.eclipse.papyrus.model2doc.dev.tools.dialog;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.papyrus.model2doc.dev.tools.messages.Messages;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * This dialog allows to the user to enter the value for the new DocumentPrototype and new DocumentTemplate
 */
public class NewDocumentPrototypeDialog extends Dialog {

	/**
	 * The text fields used by this dialog
	 */
	private Text fileName;

	private Text documentPrototypeDescription;

	private Text documentPrototypeType;

	private Text documentPrototypeIconPath;

	private Text documentTemplateDescription;

	private Text documentTemplateKindId;

	/**
	 * the edited document prototype
	 */
	private DocumentTemplatePrototype editedPrototype;

	/**
	 * the file name defined by the user
	 */
	private String definedFileName = "newDocumentPrototypeFile"; //$NON-NLS-1$


	/**
	 * Constructor.
	 *
	 * @param parent
	 * @param editedPrototype,
	 *            can't be <code>null</code>
	 *            it must contain a DocumentTemplate too;
	 */
	public NewDocumentPrototypeDialog(final Shell parent, final DocumentTemplatePrototype editedPrototype) {
		super(parent);
		Assert.isNotNull(editedPrototype);
		Assert.isNotNull(editedPrototype.getDocumentTemplate());
		this.editedPrototype = editedPrototype;
	}

	/**
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 *
	 * @param parent
	 * @return
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		Label message = new Label(container, SWT.None);
		message.setText(Messages.NewDocumentPrototypeDialog_TheseFileAreMandatory);

		createFileGroup(container);
		createDocumentPrototypeGroup(container);
		createDocumentTemplateGroup(container);

		return container;
	}

	/**
	 * This method creates the component to edit the create file fields
	 *
	 * @param parent
	 *            the composite parent
	 */
	private void createFileGroup(final Composite parent) {
		final Group fileGrp = new Group(parent, SWT.NONE);
		fileGrp.setText(Messages.NewDocumentPrototypeDialog_File);

		GridData data = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		fileGrp.setLayoutData(data);
		fileGrp.setLayout(new GridLayout(2, false));

		// information about file name
		final Label fileNameLabel = new Label(fileGrp, SWT.None);
		fileNameLabel.setText(Messages.NewDocumentPrototypeDialog_FileName);
		this.fileName = new Text(fileGrp, SWT.BORDER);
		this.fileName.setText(this.definedFileName);

		data = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		this.fileName.setLayoutData(data);
	}

	/**
	 * This method creates the group to edit the DocumentPrototype fields
	 *
	 * @param parent
	 *            the parent composite
	 */
	private void createDocumentPrototypeGroup(final Composite parent) {
		// informations about DocumentPrototype
		final Group grp = new Group(parent, SWT.None);
		grp.setText("DocumentPrototype"); //$NON-NLS-1$
		GridData data = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		grp.setLayoutData(data);
		grp.setLayout(new GridLayout(2, false));

		// prototype type
		final Label typeLabel = new Label(grp, SWT.None);
		typeLabel.setText(Messages.NewDocumentPrototypeDialog_Type);
		typeLabel.setToolTipText(Messages.NewDocumentPrototypeDialog_TypeExampleMessage);

		documentPrototypeType = new Text(grp, SWT.BORDER);
		data = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		documentPrototypeType.setLayoutData(data);

		// prototype iconPath
		final Label iconLabel = new Label(grp, SWT.None);
		iconLabel.setText(Messages.NewDocumentPrototypeDialog_IconPath);

		documentPrototypeIconPath = new Text(grp, SWT.BORDER);
		data = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		documentPrototypeIconPath.setLayoutData(data);
		documentPrototypeIconPath.setText(this.editedPrototype.getIconPath());

		// prototype description
		final Label descriptionLabel = new Label(grp, SWT.None);
		descriptionLabel.setText(Messages.NewDocumentPrototypeDialog_DocumentPrototypeDescription);
		// descriptionLabel.setLayoutData(data);
		this.documentPrototypeDescription = new Text(grp, SWT.BORDER);
		data = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		documentPrototypeDescription.setLayoutData(data);

	}

	/**
	 * This method creates the group to edit the DocumentTemplate fields
	 *
	 * @param parent
	 *            the parent composite
	 */
	private void createDocumentTemplateGroup(final Composite parent) {
		// informations about DocumentPrototype
		final Group grp = new Group(parent, SWT.None);
		grp.setText("DocumentTemplate"); //$NON-NLS-1$
		GridData data = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		grp.setLayoutData(data);
		grp.setLayout(new GridLayout(2, false));

		// prototype type
		final Label typeLabel = new Label(grp, SWT.None);
		typeLabel.setText("Kind Id*"); //$NON-NLS-1$
		typeLabel.setToolTipText(Messages.NewDocumentPrototypeDialog_KindIdExample);
		documentTemplateKindId = new Text(grp, SWT.BORDER);
		data = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		documentTemplateKindId.setLayoutData(data);

		// prototype description
		final Label descriptionLabel = new Label(grp, SWT.None);
		descriptionLabel.setText(Messages.NewDocumentPrototypeDialog_DocumentTemplateDescription);
		// descriptionLabel.setLayoutData(data);
		this.documentTemplateDescription = new Text(grp, SWT.BORDER);
		data = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		documentTemplateDescription.setLayoutData(data);
		if (this.editedPrototype.getDocumentTemplate().getDescription() != null) {
			documentTemplateDescription.setText(this.editedPrototype.getDocumentTemplate().getDescription());
		}
	}


	/**
	 *
	 * @return
	 *         the name of the created file. Can't be <code>null</code>
	 */
	public String getFileName() {
		return this.definedFileName;
	}

	/**
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 *
	 */
	@Override
	protected void okPressed() {
		if (this.fileName.getText() != null && !this.fileName.getText().isEmpty()) {
			this.definedFileName = this.fileName.getText();
		}
		this.editedPrototype.setDescription(this.documentPrototypeDescription.getText());
		this.editedPrototype.setIconPath(this.documentPrototypeIconPath.getText());
		this.editedPrototype.setType(this.documentPrototypeType.getText());
		this.editedPrototype.getDocumentTemplate().setDescription(this.documentTemplateDescription.getText());
		this.editedPrototype.getDocumentTemplate().setKindId(this.documentTemplateKindId.getText());
		super.okPressed();
	}

	/**
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 *
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(Messages.NewDocumentPrototypeDialog_DialogName);
	}

	/**
	 * @see org.eclipse.jface.dialogs.Dialog#getInitialSize()
	 *
	 * @return
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(600, 400);
	}

}
