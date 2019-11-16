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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.author.IAuthor;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractList;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.BasicList;
import org.eclipse.papyrus.model2doc.core.builtintypes.IFileReference;
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
import org.eclipse.papyrus.model2doc.odt.internal.util.PropertySetUtil;
import org.eclipse.papyrus.model2doc.odt.internal.util.WriteUtil;
import org.eclipse.papyrus.model2doc.odt.service.StyleService;
import org.eclipse.papyrus.model2doc.odt.service.StyleServiceImpl;
import org.eclipse.papyrus.model2doc.odt.service.WriteService;
import org.eclipse.papyrus.model2doc.odt.service.WriteServiceImpl;

import com.sun.star.beans.IllegalTypeException;
import com.sun.star.beans.NotRemoveableException;
import com.sun.star.beans.PropertyAttribute;
import com.sun.star.beans.PropertyExistException;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertyContainer;
import com.sun.star.beans.XPropertySet;
import com.sun.star.document.XDocumentProperties;
import com.sun.star.document.XDocumentPropertiesSupplier;
import com.sun.star.lang.XMultiServiceFactory;
import com.sun.star.style.BreakType;
import com.sun.star.text.ChapterFormat;
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


	private static final String TABLE_OF_FIGURE_TYPE = "com.sun.star.text.IllustrationsIndex"; //$NON-NLS-1$

	private static final String TABLE_OF_CONTENTS_TYPE = "com.sun.star.text.ContentIndex"; //$NON-NLS-1$

	/** The text interface contains all methods and properties to manipulate the content from a text document. */
	protected XText text = null;

	/** The cursor for walking through the model of the text document. */
	protected XTextCursor cursor = null;

	protected StyleEditor styleEditor = null;

	protected ODTEditor odtEditor = null;

	protected IDocumentGeneratorConfiguration odtGeneratorConfig = null;

	protected WriteService writeService = null;

	protected StyleService styleService = null;

	protected List<XDocumentIndex> tablesOfIndexes = new ArrayList<>();

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
	public void refreshTablesOfIndexes() {
		for (final XDocumentIndex current : this.tablesOfIndexes) {
			current.update();
		}
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.transcription.Transcription#writeTableOfFigures(java.lang.String)
	 *
	 * @param tofTitle
	 */
	@Override
	public void writeTableOfFigures(String tofTitle) {
		writePageOfContents(tofTitle, TABLE_OF_FIGURE_TYPE);
	}

	/**
	 * Create the table of contents
	 */
	@Override
	public void writeTableOfContents(final String tocTitle) {
		writePageOfContents(tocTitle, TABLE_OF_CONTENTS_TYPE);
	}

	/**
	 * Common method used to create a Table Of Contents or a Table of Figure
	 *
	 * @param pageTitle
	 *            the title of the page
	 * @param libreOfficePagetype
	 *            the type of the page to create
	 */
	protected void writePageOfContents(final String pageTitle, final String libreOfficePagetype) {
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

			// Create a ContentIndex and access its XPropertySet interface
			XPropertySet xIndex = UnoRuntime.queryInterface(XPropertySet.class, mxDocFactory.createInstance(libreOfficePagetype)); // $NON-NLS-1$

			// to fill the table of contents according to the existing title
			if (TABLE_OF_CONTENTS_TYPE.equals(libreOfficePagetype)) {
				xIndex.setPropertyValue("CreateFromOutline", true); //$NON-NLS-1$
			} else if (TABLE_OF_FIGURE_TYPE.equals(libreOfficePagetype)) {
				xIndex.setPropertyValue("CreateFromLabels", true); //$NON-NLS-1$
				xIndex.setPropertyValue("LabelCategory", "Figure"); //$NON-NLS-1$ //$NON-NLS-2$
				xIndex.setPropertyValue("LabelDisplayType", ChapterFormat.NAME_NUMBER); //$NON-NLS-1$
			}
			xIndex.setPropertyValue("Title", pageTitle); //$NON-NLS-1$

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
			tablesOfIndexes.add(xDocIndex);
			writeService.endParagraph(xParaCursor);


			XPropertySet cursorProperty = UnoRuntime.queryInterface(XPropertySet.class, xParaCursor);
			try {
				// TODO
				cursorProperty.setPropertyValue("BreakType", BreakType.PAGE_BEFORE); //$NON-NLS-1$ //NONE AND BOTH gave me the same result... -> it is not good
				// BEFORE Allow that the next content (an image) will be on the next page... it seems me stupid...
			} catch (Exception e) {
				Activator.log.error("Failed to create page break. Exception: ", e); //$NON-NLS-1$
			}
		} catch (Exception e) {
			Activator.log.error(e);
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

			// we need to remove the property if it already exist, in order to be able to change its value
			try {
				userDefined.removeProperty(CustomFields.AUTHORS);
			} catch (UnknownPropertyException e) {
				// nothing to do. If the property doesn't exist, we probably get an exception for nothing!
			} catch (NotRemoveableException e) {
				Activator.log.error(e);
			}

			try {
				userDefined.addProperty(CustomFields.AUTHORS, PropertyAttribute.REMOVABLE, allAuthorsLabel);
			} catch (IllegalArgumentException | PropertyExistException | IllegalTypeException e) {
				Activator.log.error(e);
			}
		}
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.transcription.Transcription#writeVersion(java.lang.String)
	 *
	 * @param version
	 */
	@Override
	public void writeVersion(final String version) {
		if (null == version || version.isEmpty()) {
			return;
		}

		final XTextDocument document = odtEditor.getXTextDocument();
		final XDocumentPropertiesSupplier xsDocProp = UnoRuntime.queryInterface(XDocumentPropertiesSupplier.class, document);
		final XDocumentProperties props = xsDocProp.getDocumentProperties();

		XPropertyContainer userDefined = props.getUserDefinedProperties();

		// we need to remove the property if it already exist, in order to be change its value
		try {
			userDefined.removeProperty(CustomFields.VERSION);
		} catch (UnknownPropertyException | NotRemoveableException e) {
			// nothing to do
		}

		try {
			userDefined.addProperty(CustomFields.VERSION, PropertyAttribute.REMOVABLE, version);
		} catch (IllegalArgumentException | PropertyExistException | IllegalTypeException e) {
			Activator.log.error(e);
		}
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.transcription.Transcription#insertFile(org.eclipse.papyrus.model2doc.core.builtintypes.IFileReference)
	 *
	 * @param fileReference
	 */
	@Override
	public void insertFile(final IFileReference fileReference) {
		final String path = fileReference.getFilePath();
		this.writeService.insertTextFile(cursor, path);
	}



	/**
	 * This method should works but has never been tested... here as reminder
	 *
	 * @param pageBreak
	 */
	private void addPageBreak(final PageBreak pageBreak) {
		int breakValue = -1;
		switch (pageBreak) {
		case BEFORE:
			breakValue = com.sun.star.style.BreakType.PAGE_BEFORE.getValue();
			break;
		case AFTER:
			breakValue = com.sun.star.style.BreakType.PAGE_AFTER.getValue();
			break;
		case BOTH:
			breakValue = com.sun.star.style.BreakType.PAGE_BOTH.getValue();
			break;
		default:
			breakValue = com.sun.star.style.BreakType.PAGE_BOTH.getValue();
		}
		WriteUtil.addControlCharacter(cursor, (short) breakValue);
	}

	/**
	 * This method should works but has never been tested... here as reminder
	 */
	private void addPageBreak() {
		WriteUtil.addControlCharacter(cursor, (short) com.sun.star.style.BreakType.PAGE_AFTER.getValue());
		PropertySetUtil.setProperty(cursor, "BreakType", 4); //$NON-NLS-1$
		cursor.gotoEnd(false);
		WriteUtil.addControlCharacter(cursor, (short) com.sun.star.style.BreakType.PAGE_AFTER.getValue());
	}

	/**
	 * Kind of PageBreak according to the LibreOffice API
	 */
	private enum PageBreak {
		BEFORE, AFTER, BOTH
	}


}
