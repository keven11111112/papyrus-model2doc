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

package org.eclipse.papyrus.model2doc.integration.uml.architecture.tests;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.tools.util.ClassLoaderHelper;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils.DocumentStructureTemplateConstants;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.command.ICreateDocumentTemplateEditorCommand;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.viewpoint.PapyrusDocumentTemplateViewPrototype;
import org.junit.Assert;
import org.junit.Rule;

/**
 * Abstract test class for DocumentTemplate
 */
@SuppressWarnings("nls")
public abstract class AbstractDocumentTemplateCreationTest extends AbstractPapyrusTest {

	/**
	 * The editor fixture
	 */
	@Rule
	public final PapyrusEditorFixture fixture = new PapyrusEditorFixture();


	/**
	 *
	 * @return
	 *         the *.pdst resource associated to the current model
	 */
	protected final Resource getPDSTResourceForCurrentModel() {
		for (final Resource current : this.fixture.getResourceSet().getResources()) {
			if (DocumentStructureTemplateConstants.DOCUMENT_STRUCTURE_TEMPLATE_FILE_EXTENSION.equals(current.getURI().fileExtension())) {
				if (this.fixture.getModelResourceURI().trimFileExtension().equals(current.getURI().trimFileExtension())) {
					return current;
				}
			}
		}
		return null;
	}


	/**
	 *
	 * @param context
	 *            a semantic element
	 * @return
	 *         the {@link PapyrusDocumentPrototype} found for this context
	 */
	protected Collection<PapyrusDocumentPrototype> getCreatablePapyrusDocumentPrototype(final EObject context) {
		Collection<PapyrusDocumentPrototype> data = new ArrayList<>();

		for (final ViewPrototype proto : PolicyChecker.getFor(context).getPrototypesFor(context)) {
			if (!(proto.getRepresentationKind() instanceof PapyrusDocumentPrototype)) {
				continue;
			}
			data.add((PapyrusDocumentPrototype) proto.getRepresentationKind());
		}
		return data;
	}


	/**
	 *
	 * @param context
	 *            a semantic element
	 * @return
	 *         the {@link PapyrusDocumentPrototype} found for this context
	 */
	protected Collection<PapyrusDocumentTemplateViewPrototype> getCreatablePapyrusDocumentTemplateViewPrototype(final EObject context) {
		final Collection<PapyrusDocumentTemplateViewPrototype> viewPrototype = new ArrayList<>();
		for (final ViewPrototype proto : PolicyChecker.getFor(context).getPrototypesFor(context)) {
			if (proto instanceof PapyrusDocumentTemplateViewPrototype) {
				viewPrototype.add((PapyrusDocumentTemplateViewPrototype) proto);
			}
		}
		return viewPrototype;
	}


	/**
	 *
	 * @param context
	 *            a semantic element
	 * @return
	 *         the collection of {@link DocumentTemplatePrototype} found for this context
	 */
	protected Collection<DocumentTemplatePrototype> getCreatableDocumentTemplatePrototype(final EObject context) {
		Collection<DocumentTemplatePrototype> data = new ArrayList<>();
		for (final PapyrusDocumentPrototype proto : getCreatablePapyrusDocumentPrototype(context)) {
			data.add(proto.getDocumentTemplatePrototype());
		}
		return data;
	}


	/**
	 *
	 * @param context
	 *            a semantic element
	 * @param type
	 *            the type of the wanted {@link PapyrusDocumentTemplateViewPrototype}
	 * @return
	 *         the {@link PapyrusDocumentTemplateViewPrototype} or <code>null</code> if not found
	 */
	protected final PapyrusDocumentTemplateViewPrototype getPapyrusDocumentTemplateViewPrototype(final EObject context, final String type) {
		for (final PapyrusDocumentTemplateViewPrototype current : getCreatablePapyrusDocumentTemplateViewPrototype(context)) {
			if (current.getRepresentationKind() instanceof PapyrusDocumentPrototype) {
				final PapyrusDocumentPrototype pdp = (PapyrusDocumentPrototype) current.getRepresentationKind();
				if (type.equals(pdp.getDocumentTemplatePrototype().getType())) {
					return current;
				}

			}
		}
		return null;
	}

	/**
	 *
	 * @param documentType
	 *            the type of the document to create
	 * @throws Exception
	 */
	protected void checkDocumentCreation(final String documentType) throws Exception {

		// 1. we look for the view prototype required to create the document
		final PapyrusDocumentTemplateViewPrototype docProto = getPapyrusDocumentTemplateViewPrototype(this.fixture.getRoot(), documentType);
		Assert.assertNotNull("The PapyrusDocumentTemplateViewPrototype to create a document of type " + documentType + " is not found.", docProto);


		// 2. check if the pdst resource exists in the ModelSet
		final Resource pdstResource = getPDSTResourceForCurrentModel();
		Assert.assertNotNull("The pdst resource is not in the ModelSet.", pdstResource);

		// 3. check pdst resource is empty
		Assert.assertEquals("The pdst resource is not empty", 0, pdstResource.getContents().size());

		// 4. check the pdst file is not created
		boolean pdstFileExists = pdstResource.getResourceSet().getURIConverter().exists(pdstResource.getURI(), null);
		Assert.assertFalse("The pdst file exists, but it should not, because it is empty and nothing has already been stored inside it.", pdstFileExists);

		// 5. get the creation command
		final String cmdClassName = ((PapyrusDocumentPrototype) docProto.getRepresentationKind()).getCreationCommandClass();
		Assert.assertNotNull("The creation command to create the document of type " + documentType + " is not registered", cmdClassName);
		Class<?> cmdClass = ClassLoaderHelper.loadClass(cmdClassName);
		Object newClass = null;
		try {
			newClass = cmdClass.getDeclaredConstructor(new Class<?>[0]).newInstance(new Object[0]);
		} catch (InstantiationException | IllegalAccessException e) {
			throw e; // we propagate the exception
		}

		Assert.assertTrue(newClass instanceof ICreateDocumentTemplateEditorCommand);
		final ICreateDocumentTemplateEditorCommand createEditorCommand = (ICreateDocumentTemplateEditorCommand) newClass;

		// 6. create a new document template
		DocumentTemplate result = createEditorCommand.execute(docProto, "niceDocumentTemplate", this.fixture.getRoot(), true);
		Assert.assertNotNull("The creation of document of type " + documentType + " failed", result);

		Assert.assertEquals("The pdst file doesn't contains the expected number of element.", 1, pdstResource.getContents().size());
		final EObject pdstContents = pdstResource.getContents().get(0);
		Assert.assertTrue(pdstContents instanceof TextDocumentTemplate);

		this.fixture.save();
		// 7. check the pdst file is now created
		pdstFileExists = pdstResource.getResourceSet().getURIConverter().exists(pdstResource.getURI(), null);
		Assert.assertTrue("The pdst file doesn't exists, but it should exist, because it contains a DocumentTemplate", pdstFileExists);

		// 8. check Undo/Redo
		final CommandStack stack = this.fixture.getEditingDomain().getCommandStack();
		stack.undo();
		this.fixture.save();

		// 8.1 the pdst file must continue to exists but it must be empty
		pdstFileExists = pdstResource.getResourceSet().getURIConverter().exists(pdstResource.getURI(), null);
		Assert.assertTrue("The pdst file doesn't exists, but it must exist even after a undoing the creation", pdstFileExists);
		Assert.assertEquals("The pdst file doesn't contains the expected number of element after undoing the creation.", 0, pdstResource.getContents().size());

		stack.redo();
		this.fixture.save();

		// 8.2 the pdst file must continue to exists but it must not be empty
		pdstFileExists = pdstResource.getResourceSet().getURIConverter().exists(pdstResource.getURI(), null);
		Assert.assertTrue("The pdst file doesn't exists, but it must exist after redoing the creation", pdstFileExists);
		Assert.assertEquals("The pdst file must contains the expected number of element after redoing the creation.", 1, pdstResource.getContents().size());
	}
}
