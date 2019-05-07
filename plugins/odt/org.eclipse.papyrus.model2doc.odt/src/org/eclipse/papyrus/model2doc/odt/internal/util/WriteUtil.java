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
package org.eclipse.papyrus.model2doc.odt.internal.util;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.Cell;
import org.eclipse.papyrus.model2doc.core.builtintypes.TextCell;
import org.eclipse.papyrus.model2doc.core.service.FileIOService;
import org.eclipse.papyrus.model2doc.core.service.FileIOServiceImpl;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;
import org.eclipse.papyrus.model2doc.odt.Activator;
import org.eclipse.papyrus.model2doc.odt.internal.editor.ODTEditor;
import org.eclipse.papyrus.model2doc.odt.service.ODTFileIOService;
import org.eclipse.papyrus.model2doc.odt.service.ODTFileIOServiceImpl;

import com.sun.star.beans.Property;
import com.sun.star.beans.PropertyValue;
import com.sun.star.beans.XPropertySet;
import com.sun.star.beans.XPropertySetInfo;
import com.sun.star.container.XNameContainer;
import com.sun.star.document.XDocumentInsertable;
import com.sun.star.io.IOException;
import com.sun.star.lang.IllegalArgumentException;
import com.sun.star.lang.XMultiServiceFactory;
import com.sun.star.text.ControlCharacter;
import com.sun.star.text.SizeType;
import com.sun.star.text.TextContentAnchorType;
import com.sun.star.text.WrapTextMode;
import com.sun.star.text.XParagraphCursor;
import com.sun.star.text.XText;
import com.sun.star.text.XTextContent;
import com.sun.star.text.XTextCursor;
import com.sun.star.text.XTextFrame;
import com.sun.star.text.XTextTable;
import com.sun.star.uno.UnoRuntime;

/**
 * Utility class for writing odt documents.
 *
 */
public class WriteUtil {

	/**
	 * RegEx for selecting all HTML/RichText tags.
	 */
	private static final String HTML_TAG_REGEX = "<[^<>]+>"; //$NON-NLS-1$

	private static final String HTML_EXTENSION = "html"; //$NON-NLS-1$

	private static final FileIOService fileIOService = new FileIOServiceImpl();

	private static final ODTFileIOService odtFileIOService = new ODTFileIOServiceImpl();

	/**
	 * Constructor.
	 *
	 */
	private WriteUtil() {
		// to avoid instantiation
	}

	/**
	 * Add Paragraph.
	 *
	 * @param xTextCursor
	 * @param text
	 * @param processRichText
	 */
	public static void addParagraph(XTextCursor xTextCursor, String text, boolean processRichText) {
		if (processRichText) {
			addParagraphWithRichText(xTextCursor, text);
		} else {
			addText(xTextCursor, text);
			endParagraph(xTextCursor);
		}
	}

	/**
	 * Add control character to end of document.
	 *
	 * @param xTextCursor
	 * @param controlCharacter
	 */
	public static void addControlCharacter(XTextCursor xTextCursor, short controlCharacter) {
		XText xText = xTextCursor.getText();
		xText.insertControlCharacter(xTextCursor, controlCharacter, false);
		xTextCursor.gotoEnd(false);
	}

	/**
	 * Add Text.
	 *
	 * @param xTextCursor
	 * @param text
	 */
	public static void addText(XTextCursor xTextCursor, String text) {
		xTextCursor.setString(text);
		xTextCursor.gotoEnd(false);
	}

	/**
	 * Add TextContent.
	 *
	 * @param xTextCursor
	 * @param text
	 */
	public static void addTextContent(XTextCursor xTextCursor, XTextContent xTextContent) {
		XText xText = xTextCursor.getText();
		xText.insertTextContent(xTextCursor, xTextContent, false);
		xTextCursor.gotoEnd(false);
	}

	public static void addImageLink(String imageFilePath, String caption, XTextCursor xTextCursor, ODTEditor odtEditor) {
		if (false == imageFilePath.startsWith(odtFileIOService.getODTFilePrefix())) {
			imageFilePath = odtFileIOService.getODTFilePrefix() + imageFilePath;
		}
		try {
			XMultiServiceFactory xMultiServiceFactory = odtEditor.getXMultiServiceFactory();

			Object tmp = xMultiServiceFactory.createInstance("com.sun.star.text.TextFrame"); //$NON-NLS-1$
			XTextFrame textFrame = UnoRuntime.queryInterface(XTextFrame.class, tmp);
			XPropertySet framePropertySet = createXPropertySet(textFrame);
			framePropertySet.setPropertyValue("SizeType", SizeType.VARIABLE); //$NON-NLS-1$
			framePropertySet.setPropertyValue("AnchorType", TextContentAnchorType.AS_CHARACTER); //$NON-NLS-1$
			framePropertySet.setPropertyValue("ZOrder", 1);// not really sure //$NON-NLS-1$
			framePropertySet.setPropertyValue("TextWrap", WrapTextMode.THROUGH); //$NON-NLS-1$

			// Creating the service GraphicObject
			Object graphicObject = xMultiServiceFactory.createInstance("com.sun.star.text.TextGraphicObject"); //$NON-NLS-1$

			// Creating TextContent for GraphicObject
			XTextContent graphicContent = UnoRuntime.queryInterface(XTextContent.class, graphicObject);

			// Creating bitmap container service
			XNameContainer bitmapContainer = UnoRuntime.queryInterface(XNameContainer.class, xMultiServiceFactory.createInstance("com.sun.star.drawing.BitmapTable")); //$NON-NLS-1$

			// Inserting image to the container
			bitmapContainer.insertByName(imageFilePath, imageFilePath);

			PropertySetUtil.setProperty(graphicContent, "AnchorType", TextContentAnchorType.AT_CHARACTER); //$NON-NLS-1$
			PropertySetUtil.setProperty(graphicContent, "GraphicURL", bitmapContainer.getByName(imageFilePath)); //$NON-NLS-1$

			graphicContent = ImageUtil.resizeImage(graphicContent, imageFilePath, odtEditor.getXTextDocument(), odtEditor.getXMultiComponentFactory(), odtEditor.getXComponentContext());

			XPropertySet graphicPropSet = createXPropertySet(graphicContent);
			Object heightValue = graphicPropSet.getPropertyValue("Height"); //$NON-NLS-1$
			Object widthValue = graphicPropSet.getPropertyValue("Width"); //$NON-NLS-1$
			XPropertySet textFrameSet = createXPropertySet(textFrame);
			textFrameSet.setPropertyValue("Height", heightValue);// TODO don't work, and should be on the next level... //$NON-NLS-1$
			textFrameSet.setPropertyValue("Width", widthValue); //$NON-NLS-1$

			xTextCursor.getText().insertTextContent(xTextCursor, textFrame, false);
			XTextCursor localCursor = textFrame.getText().createTextCursor();

			XParagraphCursor paragraphCursor = UnoRuntime.queryInterface(XParagraphCursor.class, localCursor);
			XPropertySet paraSet = createXPropertySet(paragraphCursor);
			paraSet.setPropertyValue("ParaStyleName", "Illustration");// it works!!! in fact we can't push style which have not been declared and which don't exist by default //$NON-NLS-1$ //$NON-NLS-2$



			localCursor.getText().insertTextContent(localCursor, graphicContent, false);
			localCursor.gotoEnd(true);
			localCursor.getText().insertString(localCursor, "Illustration", false); //$NON-NLS-1$


			// code to add the number of the illustration: doesn't work yet
			// it is probably not a GetReference I should use...
			// Object getReferenceObject = xMultiServiceFactory.createInstance("com.sun.star.text.textfield.GetReference");
			//
			//
			// XTextContent xRef = UnoRuntime.queryInterface(XTextContent.class, getReferenceObject);
			// XPropertySet xRefPropertySet = UnoRuntime.queryInterface(XPropertySet.class, getReferenceObject);
			//
			//
			// xRefPropertySet.setPropertyValue("SourceName", "Illustration");// I get <text:sequence-ref
			// xRefPropertySet.setPropertyValue("ReferenceFieldPart", ReferenceFieldPart.UP_DOWN);
			// xRefPropertySet.setPropertyValue("ReferenceFieldSource", ReferenceFieldSource.SEQUENCE_FIELD);
			// xRefPropertySet.setPropertyValue("SequenceNumber", (short) 2);

			// localCursor.getText().insertControlCharacter(localCursor, ControlCharacter.LINE_BREAK, false);// add style around it

			// localCursor.getText().insertTextContent(localCursor, xRef, false);


			if (null != caption && false == caption.isEmpty()) {
				StringBuilder builder = new StringBuilder();
				builder.append(": "); //$NON-NLS-1$
				builder.append(caption);
				localCursor.getText().insertString(localCursor, builder.toString(), false);
			}


			endParagraph(xTextCursor);
			// fileIOService.removeFile(new File(image.getPath()));

		} catch (Exception e) {
			Activator.log.error(e);
		}
	}

	public static void addImageLink(ImageDescription image, String caption, XTextCursor xTextCursor, ODTEditor odtEditor) {
		String imageFilePath = odtFileIOService.getODTFilePrefix() + image.getPath();

		try {
			XMultiServiceFactory xMultiServiceFactory = odtEditor.getXMultiServiceFactory();

			Object tmp = xMultiServiceFactory.createInstance("com.sun.star.text.TextFrame"); //$NON-NLS-1$
			XTextFrame textFrame = UnoRuntime.queryInterface(XTextFrame.class, tmp);
			XPropertySet framePropertySet = createXPropertySet(textFrame);
			framePropertySet.setPropertyValue("SizeType", SizeType.VARIABLE); //$NON-NLS-1$
			framePropertySet.setPropertyValue("AnchorType", TextContentAnchorType.AS_CHARACTER); //$NON-NLS-1$
			framePropertySet.setPropertyValue("ZOrder", 1);// not really sure //$NON-NLS-1$
			framePropertySet.setPropertyValue("TextWrap", WrapTextMode.THROUGH); //$NON-NLS-1$

			// Creating the service GraphicObject
			Object graphicObject = xMultiServiceFactory.createInstance("com.sun.star.text.TextGraphicObject"); //$NON-NLS-1$

			// Creating TextContent for GraphicObject
			XTextContent graphicContent = UnoRuntime.queryInterface(XTextContent.class, graphicObject);

			// Creating bitmap container service
			XNameContainer bitmapContainer = UnoRuntime.queryInterface(XNameContainer.class, xMultiServiceFactory.createInstance("com.sun.star.drawing.BitmapTable")); //$NON-NLS-1$

			// Inserting image to the container
			bitmapContainer.insertByName(imageFilePath, imageFilePath);

			PropertySetUtil.setProperty(graphicContent, "AnchorType", TextContentAnchorType.AT_CHARACTER); //$NON-NLS-1$
			PropertySetUtil.setProperty(graphicContent, "GraphicURL", bitmapContainer.getByName(imageFilePath)); //$NON-NLS-1$

			graphicContent = ImageUtil.resizeImage(graphicContent, imageFilePath, odtEditor.getXTextDocument(), odtEditor.getXMultiComponentFactory(), odtEditor.getXComponentContext());

			XPropertySet graphicPropSet = createXPropertySet(graphicContent);
			Object heightValue = graphicPropSet.getPropertyValue("Height"); //$NON-NLS-1$
			Object widthValue = graphicPropSet.getPropertyValue("Width"); //$NON-NLS-1$
			XPropertySet textFrameSet = createXPropertySet(textFrame);
			textFrameSet.setPropertyValue("Height", heightValue);// TODO don't work, and should be on the next level... //$NON-NLS-1$
			textFrameSet.setPropertyValue("Width", widthValue); //$NON-NLS-1$

			xTextCursor.getText().insertTextContent(xTextCursor, textFrame, false);
			XTextCursor localCursor = textFrame.getText().createTextCursor();

			XParagraphCursor paragraphCursor = UnoRuntime.queryInterface(XParagraphCursor.class, localCursor);
			XPropertySet paraSet = createXPropertySet(paragraphCursor);
			paraSet.setPropertyValue("ParaStyleName", "Illustration");// it works!!! in fact we can't push style which have not been declared and which don't exist by default //$NON-NLS-1$ //$NON-NLS-2$



			localCursor.getText().insertTextContent(localCursor, graphicContent, false);
			localCursor.gotoEnd(true);
			localCursor.getText().insertString(localCursor, "Illustration", false); //$NON-NLS-1$


			// code to add the number of the illustration: doesn't work yet
			// it is probably not a GetReference I should use...
			// Object getReferenceObject = xMultiServiceFactory.createInstance("com.sun.star.text.textfield.GetReference");
			//
			//
			// XTextContent xRef = UnoRuntime.queryInterface(XTextContent.class, getReferenceObject);
			// XPropertySet xRefPropertySet = UnoRuntime.queryInterface(XPropertySet.class, getReferenceObject);
			//
			//
			// xRefPropertySet.setPropertyValue("SourceName", "Illustration");// I get <text:sequence-ref
			// xRefPropertySet.setPropertyValue("ReferenceFieldPart", ReferenceFieldPart.UP_DOWN);
			// xRefPropertySet.setPropertyValue("ReferenceFieldSource", ReferenceFieldSource.SEQUENCE_FIELD);
			// xRefPropertySet.setPropertyValue("SequenceNumber", (short) 2);

			// localCursor.getText().insertControlCharacter(localCursor, ControlCharacter.LINE_BREAK, false);// add style around it

			// localCursor.getText().insertTextContent(localCursor, xRef, false);


			if (null != caption && false == caption.isEmpty()) {
				StringBuilder builder = new StringBuilder();
				builder.append(": "); //$NON-NLS-1$
				builder.append(caption);
				localCursor.getText().insertString(localCursor, builder.toString(), false);
			}


			endParagraph(xTextCursor);
			fileIOService.removeFile(new File(image.getPath()));

		} catch (Exception e) {
			Activator.log.error(e);
		}
	}

	private static final XPropertySet createXPropertySet(final Object object) {
		return UnoRuntime.queryInterface(XPropertySet.class, object);
	}

	private static final void displayPropertySet(final XPropertySet propertySet, final String relativeObjectName) {
		Assert.isNotNull(propertySet);
		Assert.isNotNull(relativeObjectName);
		System.out.println(NLS.bind("-----------------------properties of {0}--------------------", relativeObjectName)); //$NON-NLS-1$
		XPropertySetInfo set12 = propertySet.getPropertySetInfo();
		for (Property tmp : set12.getProperties()) {
			System.out.println("prop Name " + tmp.Name); //$NON-NLS-1$
			System.out.println("prop attr " + tmp.Attributes); //$NON-NLS-1$
			System.out.println("prop type " + tmp.Type); //$NON-NLS-1$
			System.out.println("\n"); //$NON-NLS-1$
		}
	}




	// }

	/**
	 * End line.
	 *
	 * @param xTextCursor
	 */
	public static void endLine(XTextCursor xTextCursor) {
		addControlCharacter(xTextCursor, ControlCharacter.LINE_BREAK);

	}

	/**
	 * End paragraph.
	 *
	 * @param xTextCursor
	 */
	public static void endParagraph(XTextCursor xTextCursor) {
		addControlCharacter(xTextCursor, ControlCharacter.PARAGRAPH_BREAK);
	}

	/**
	 * Insert content from text file.
	 *
	 * @param xTextCursor
	 * @param fileURL
	 */
	public static void insertTextFile(XTextCursor xTextCursor, String fileURL) {
		xTextCursor.gotoEnd(false);

		XDocumentInsertable inserter = UnoRuntime.queryInterface(XDocumentInsertable.class, xTextCursor);
		if (inserter != null) {
			try {
				inserter.insertDocumentFromURL(fileURL, new PropertyValue[0]);
			} catch (IllegalArgumentException | IOException e) {
				Activator.log.error(e);
			}
		}
	}

	/**
	 * Remove HTML/RichText tags from string.
	 *
	 * @param text
	 * @return
	 */
	public static String removeHTMLTags(String text) {
		return text.replaceAll(HTML_TAG_REGEX, ""); //$NON-NLS-1$
	}

	/**
	 * Add Paragraph with Rich Text format.
	 *
	 * @param xTextCursor
	 * @param text
	 */
	public static void addParagraphWithRichText(XTextCursor xTextCursor, String text) {
		// Split the text for retrieving the first part without rich text
		String[] noRichText = text.split(HTML_TAG_REGEX, 2);
		String richText = text;
		// Verify if there is the first part of text without rich text
		if (noRichText.length != 0) {
			// Add the first part of text without rich text
			addText(xTextCursor, noRichText[0]);

			// Retrieve the part of text with rich text
			richText = text.replaceFirst(noRichText[0], ""); //$NON-NLS-1$
		}
		richText = richText.replaceAll("&nbsp;", " "); //$NON-NLS-1$ //$NON-NLS-2$
		// Create file with the part of text with rich text
		String location = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		StringBuilder pathName = new StringBuilder();
		pathName.append(location);
		pathName.append(File.separator);
		pathName.append("tmp_ParagraphWithRichText_"); //$NON-NLS-1$
		pathName.append(new Date().getTime());
		pathName.append("."); //$NON-NLS-1$
		pathName.append(HTML_EXTENSION);
		File file = fileIOService.createFile(pathName.toString(), richText);
		String fileURL = odtFileIOService.getFileURL(file);

		// Insert rich text content from the file
		insertTextFile(xTextCursor, fileURL);

		// Remove file with the part of text with rich text
		fileIOService.removeFile(file);

		endParagraph(xTextCursor);
	}

	/**
	 * Add Table.
	 *
	 * @param xTextCursor
	 * @param table
	 *            the table contents
	 * @param odtEditor
	 *
	 */
	public static void writeTable(XTextCursor xTextCursor, AbstractTable table, ODTEditor odtEditor) {
		// Set number of rows and columns
		int numRows = table.getRowsNumber();
		int numCols = table.getColumnsNumber();

		if (numRows <= 0 || numCols <= 0) {
			return;
		}

		final List<Cell> allCells = table.getAllCells();
		if (numRows * numCols != allCells.size()) {
			Activator.log.warn(NLS.bind("The number of cells in the table is not as excepted. We won't manage the table {0}.", table.getCaption())); //$NON-NLS-1$
			return;
		}

		try {
			XMultiServiceFactory xMultiServiceFactory = odtEditor.getXMultiServiceFactory();
			// create a text table
			Object obj = xMultiServiceFactory.createInstance("com.sun.star.text.TextTable"); //$NON-NLS-1$
			XTextTable textTable = UnoRuntime.queryInterface(XTextTable.class, obj);

			// Initialize and add table
			textTable.initialize(numRows, numCols);
			addTextContent(xTextCursor, textTable);
			endParagraph(xTextCursor);


			// Set cell's contents
			String[] cellNames = textTable.getCellNames();

			// TODO : we should add something like a TableStyleProvider in the metamodel builtInTypes.
			// A such element will be referenced by the DocumentGeneratorConfiguration or something else
			// and each table element would have a method to be able to read it and returns the style to apply for it when we write the final document
			Object headerBackGroundColor = 0xD4D4D4; // grey


			for (int i = 0; i < cellNames.length; i++) {
				XText cellText = UnoRuntime.queryInterface(XText.class, textTable.getCellByName(cellNames[i]));
				final Cell cell = allCells.get(i);
				if (cell instanceof TextCell) {
					cellText.setString(((TextCell) cell).getText());
				} else {
					Activator.log.warn(NLS.bind("The cell class {0} is not managed by the transcription", cell.eClass().getName())); //$NON-NLS-1$
				}

				switch (cell.getLocation()) {
				case CORNER:
				case COLUMN_HEADER:
				case ROW_HEADER:
					PropertySetUtil.setProperty(cellText, "BackColor", headerBackGroundColor); //$NON-NLS-1$
					break;
				case BODY:
				default:
					// do nothing
				}
			}

		} catch (com.sun.star.uno.Exception e) {
			Activator.log.error(e);
		}
	}
}
