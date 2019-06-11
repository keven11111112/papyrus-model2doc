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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.odt.internal.transcription;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.author.IAuthor;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractList;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.BasicList;
import org.eclipse.papyrus.model2doc.core.builtintypes.ListItem;
import org.eclipse.papyrus.model2doc.core.builtintypes.TextListItem;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.transcription.CoverPage;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.odt.Activator;
import org.eclipse.papyrus.model2doc.odt.editor.StyleEditor;
import org.eclipse.papyrus.model2doc.odt.editor.StyleEditorFactory;
import org.eclipse.papyrus.model2doc.odt.internal.constants.ParagraphPropertiesConstants;
import org.eclipse.papyrus.model2doc.odt.internal.constants.ParagraphPropertiesValues;
import org.eclipse.papyrus.model2doc.odt.internal.editor.ODTEditor;
import org.eclipse.papyrus.model2doc.odt.internal.util.WriteUtil;
import org.eclipse.papyrus.model2doc.odt.service.StyleService;
import org.eclipse.papyrus.model2doc.odt.service.StyleServiceImpl;
import org.eclipse.papyrus.model2doc.odt.service.WriteService;
import org.eclipse.papyrus.model2doc.odt.service.WriteServiceImpl;

import com.sun.star.beans.IllegalTypeException;
import com.sun.star.beans.NotRemoveableException;
import com.sun.star.beans.PropertyExistException;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertyContainer;
import com.sun.star.beans.XPropertySet;
import com.sun.star.document.XDocumentProperties;
import com.sun.star.document.XDocumentPropertiesSupplier;
import com.sun.star.lang.XMultiServiceFactory;
import com.sun.star.style.BreakType;
import com.sun.star.text.ControlCharacter;
import com.sun.star.text.XDocumentIndex;
import com.sun.star.text.XPageCursor;
import com.sun.star.text.XParagraphCursor;
import com.sun.star.text.XText;
import com.sun.star.text.XTextContent;
import com.sun.star.text.XTextCursor;
import com.sun.star.text.XTextDocument;
import com.sun.star.text.XTextViewCursor;
import com.sun.star.uno.Exception;
import com.sun.star.uno.UnoRuntime;

/**
 * ODT Transcription.
 *
 */
public class ODTTranscription implements Transcription {

	/** The text interface contains all methods and properties to manipulate the content from a text document. */
	private XText text = null;

	/** The cursor for walking through the model of the text document. */
	private XTextCursor cursor = null;

	private StyleEditor styleEditor = null;

	private ODTEditor odtEditor = null;

	private IDocumentGeneratorConfiguration odtGeneratorConfig = null;

	private WriteService writeService = null;

	private StyleService styleService = null;

	private XDocumentIndex tableOfContents = null;

	/**
	 * Constructor.
	 *
	 * @param styleEditor
	 * @param generatorConfig
	 */
	public ODTTranscription(StyleEditor styleEditor, IDocumentGeneratorConfiguration odtGeneratorConfig) {
		odtEditor = new ODTEditor(odtGeneratorConfig);
		if (odtEditor.getXTextDocument() != null) {
			text = odtEditor.getXTextDocument().getText();
			cursor = text.createTextCursor();

			if (styleEditor == null) {
				this.styleEditor = StyleEditorFactory.INSTANCE.getDefaultStyleEditor();
			} else {
				this.styleEditor = styleEditor;
			}

			this.odtGeneratorConfig = odtGeneratorConfig;

			this.writeService = new WriteServiceImpl();

			this.styleService = new StyleServiceImpl();
		}
	}

	@Override
	public void writeDocumentMainTitle(String documentTitle) {
		writeService.addText(cursor, documentTitle);
		styleEditor.applyMainTitleStyle(text);
		writeService.endParagraph(cursor);
	}

	@Override
	public void writeSectionTitle(String sectionTitle, int sectionLevel) {
		writeService.addParagraph(cursor, sectionTitle, false);
		styleEditor.applySectionTitleStyle(cursor, sectionLevel);
	}

	@Override
	public void writeParagraph(String paragraph, boolean processRichText) {
		writeService.addParagraph(cursor, paragraph, true);
	}

	@Override
	public void writeList(AbstractList abstractList, boolean processRichText) {
		if (false == abstractList instanceof BasicList) {
			Activator.log.warn(NLS.bind("The list of type {0} is not supported by {1}.", abstractList.eClass().getName(), getClass().getName())); //$NON-NLS-1$
			return;
		}
		final BasicList basicList = (BasicList) abstractList;
		final Iterator<ListItem> iter = basicList.getItems().iterator();
		while (iter.hasNext()) {
			writeListItem(iter.next());
		}
	}

	/**
	 * This method add a list item and its sub items if they exist
	 *
	 * @param listItem
	 *            a list item
	 */
	private void writeListItem(final ListItem listItem) {
		final int itemLevel = listItem.getLevel();
		if (false == listItem instanceof TextListItem) {
			Activator.log.warn(NLS.bind("The list item  of type {0} is not supported by {1}.", listItem.eClass().getName(), getClass().getName())); //$NON-NLS-1$
			return;
		}
		final TextListItem textItem = (TextListItem) listItem;
		writeService.addParagraph(cursor, textItem.getText(), true);
		styleService.applyStylePreviousParagraph(cursor, ParagraphPropertiesConstants.NUMBERING_STYLE, ParagraphPropertiesValues.NUMBERING_STYLE_DASH);
		styleService.applyStylePreviousParagraph(cursor, ParagraphPropertiesConstants.NUMBERING_LEVEL, (short) itemLevel);
		final Iterator<ListItem> subItemIterator = listItem.getSubItems().iterator();
		while (subItemIterator.hasNext()) {
			writeListItem(subItemIterator.next());
		}
	}

	@Override
	public void writeCoverPage(CoverPage coverPage) {
		// TODO

		// Once finished to write cover page, move the cursor to last page
		XPageCursor pageCursor = odtEditor.getPageCursor();
		pageCursor.jumpToLastPage();
		cursor = text.createTextCursorByRange(UnoRuntime.queryInterface(XTextViewCursor.class, pageCursor));
	}


	/**
	 * Refresh the table of contents
	 */
	@Override
	public void refreshTableOfContents() {
		if (null != this.tableOfContents) {
			this.tableOfContents.update();
		}
	}

	/**
	 * Create the table of contents
	 */
	@Override
	public void writeTableOfContents(final String tocTitle) {

		// TODO improve me
		// we should be able to start of not the table of contents on a new page
		// we should be able to go to the next page at the end of the table of content
		try {

			XTextCursor mxDocCursor = cursor;
			XText mxDocText = cursor.getText();
			XMultiServiceFactory mxDocFactory = odtEditor.getXMultiServiceFactory();

			// Go to the end of the document
			mxDocCursor.gotoEnd(false);
			// Insert a new paragraph and position the cursor in it
			mxDocText.insertControlCharacter(mxDocCursor, ControlCharacter.PARAGRAPH_BREAK, false);
			XParagraphCursor xParaCursor = UnoRuntime.queryInterface(XParagraphCursor.class, mxDocCursor);
			xParaCursor.gotoPreviousParagraph(false);// TODO : it was false before

			// Create a new ContentIndexMark and get its XPropertySet interface
			// XPropertySet xEntry;

			// xEntry = UnoRuntime.queryInterface(XPropertySet.class, mxDocFactory.createInstance("com.sun.star.text.ContentIndexMark"));

			//
			// // Set the text to be displayed in the index
			// xEntry.setPropertyValue("AlternativeText", "Big dogs! Falling on my head!");

			// The Level property _must_ be set
			// xEntry.setPropertyValue("Level", Short.valueOf((short) 1));
			// xEntry.setPropertyValue("Outline", true);

			// Create a ContentIndex and access its XPropertySet interface
			XPropertySet xIndex = UnoRuntime.queryInterface(XPropertySet.class, mxDocFactory.createInstance("com.sun.star.text.ContentIndex")); //$NON-NLS-1$

			// Again, the Level property _must_ be set
			// xIndex.setPropertyValue("Level", Short.valueOf((short) 10));

			// to fill the table of contents according to the existing title
			xIndex.setPropertyValue("CreateFromOutline", true); //$NON-NLS-1$
			// XPropertySetInfo set = xIndex.getPropertySetInfo();
			// for (Property tmp : set.getProperties()) {
			// System.out.println("prop Name " + tmp.Name);
			// System.out.println("prop attr " + tmp.Attributes);
			// System.out.println("prop type " + tmp.Type);
			// }

			xIndex.setPropertyValue("Title", tocTitle); //$NON-NLS-1$

			// Access the XTextContent interfaces of both the Index and the
			// IndexMark
			XTextContent xIndexContent = UnoRuntime.queryInterface(XTextContent.class, xIndex);
			// XTextContent xEntryContent = UnoRuntime.queryInterface(XTextContent.class, xEntry);

			// Insert both in the document
			// mxDocText.insertTextContent(mxDocCursor, xEntryContent, false);
			mxDocText.insertTextContent(mxDocCursor, xIndexContent, false);

			// Get the XDocumentIndex interface of the Index
			XDocumentIndex xDocIndex = UnoRuntime.queryInterface(XDocumentIndex.class, xIndex);

			// And call its update method
			xDocIndex.update();

			tableOfContents = xDocIndex;


			// xParaCursor.gotoNextParagraph(true);


			// XText xText = mxDocCursor.getText();
			// xText.insertControlCharacter(mxDocCursor, (short)BreakType.PAGE_AFTER_value, false);
			// mxDocCursor.gotoEnd(false);
			// WriteUtil.addControlCharacter(xTextCursor, controlCharacter);addControlCharacter

			writeService.endParagraph(xParaCursor);


			XPropertySet cursorProperty = UnoRuntime.queryInterface(XPropertySet.class, xParaCursor);
			try {
				// TODO
				cursorProperty.setPropertyValue("BreakType", BreakType.PAGE_BEFORE); //$NON-NLS-1$ //NONE AND BOTH gave me the same result... -> it is not good
				// BEFORE Allow that the next content (an image) will be on the next page... it seems me stupid...
			} catch (Exception excp) {
				System.err.println("Failed to create page break. Exception: " + excp); //$NON-NLS-1$
				excp.printStackTrace(System.err);
			}
			//
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void importImage(ImageDescription image, String caption) {
		writeService.addImageLink(image, caption, cursor, odtEditor);
		styleEditor.applyImageStyle(cursor);
		// cursor.gotoEnd(false);
	}


	@Override
	public void writeImage(final String imagePath, final String caption) {
		writeService.addImageLink(imagePath, caption, cursor, odtEditor);
		styleEditor.applyImageStyle(cursor);
	}

	@Override
	public void save(String label) {

		String documentName = odtGeneratorConfig.getDocumentName();
		if ((documentName != null) && (!documentName.isEmpty())) {
			odtEditor.save(documentName);
		} else {
			odtEditor.save(label);
		}
	}

	@Override
	public IDocumentGeneratorConfiguration getGeneratorConfig() {
		return odtGeneratorConfig;
	}

	@Override
	public void writeImageSubtitle(ImageDescription image) {
		writeService.addParagraph(cursor, image.getSubtitle(), false);
		styleEditor.applyImageSubtitleStyle(cursor);
	}

	@Override
	public void writeTable(final AbstractTable table) {
		WriteUtil.writeTable(cursor, table, odtEditor);
	}

	@Override
	public boolean canExecute() {
		return (odtEditor.getXTextDocument() != null);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.transcription.Transcription#writeAuthors(java.util.Collection)
	 *
	 * @param authors
	 */
	@Override
	public void writeAuthors(final Collection<IAuthor> authors) {
		if (authors.size() > 0) {
			final XTextDocument document = odtEditor.getXTextDocument();
			final XDocumentPropertiesSupplier xsDocProp = UnoRuntime.queryInterface(XDocumentPropertiesSupplier.class, document);
			XDocumentProperties props = xsDocProp.getDocumentProperties();
			final Iterator<IAuthor> iterator = authors.iterator();
			String allAuthorsLabel = ""; //$NON-NLS-1$
			if (iterator.hasNext()) {
				final IAuthor firstAuthor = iterator.next();
				allAuthorsLabel = firstAuthor.buildMultiAuthorLabel(ECollections.toEList(authors));
				props.setAuthor(firstAuthor.buildAuthorLabel());
			}

			XPropertyContainer userDefined = props.getUserDefinedProperties();

			// we need to remove the property if it already exist, in order to be change its value
			try {
				userDefined.removeProperty(CustomFields.AUTHORS);
			} catch (UnknownPropertyException e) {
				// nothing to do. If the property doesn't exist, we probably get an exception for nothing!
			} catch (NotRemoveableException e) {
				Activator.log.error(e);
			}

			try {
				userDefined.addProperty(CustomFields.AUTHORS, com.sun.star.beans.PropertyAttribute.REMOVABLE, allAuthorsLabel);
			} catch (IllegalArgumentException | PropertyExistException | IllegalTypeException e) {
				Activator.log.error(e);
			}
		}
	}
}
