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

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.service.FileIOService;
import org.eclipse.papyrus.model2doc.core.service.FileIOServiceImpl;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;
import org.eclipse.papyrus.model2doc.core.transcription.Table;
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
import com.sun.star.table.XTableRows;
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

	public static void addImageLink(ImageDescription image, String caption, XTextCursor xTextCursor, ODTEditor odtEditor) {
		String imageFilePath = odtFileIOService.getODTFilePrefix() + image.getPath();

		try {
			XMultiServiceFactory xMultiServiceFactory = odtEditor.getXMultiServiceFactory();

			Object tmp = xMultiServiceFactory.createInstance("com.sun.star.text.TextFrame");
			XTextFrame textFrame = UnoRuntime.queryInterface(XTextFrame.class, tmp);
			XPropertySet framePropertySet = createXPropertySet(textFrame);
			framePropertySet.setPropertyValue("SizeType", SizeType.VARIABLE);
			framePropertySet.setPropertyValue("AnchorType", TextContentAnchorType.AS_CHARACTER);
			framePropertySet.setPropertyValue("ZOrder", 1);// not really sure
			framePropertySet.setPropertyValue("TextWrap", WrapTextMode.THROUGH);

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
			Object heightValue = graphicPropSet.getPropertyValue("Height");
			Object widthValue = graphicPropSet.getPropertyValue("Width");
			XPropertySet textFrameSet = createXPropertySet(textFrame);
			textFrameSet.setPropertyValue("Height", heightValue);// TODO don't work, and should be on the next level...
			textFrameSet.setPropertyValue("Width", widthValue);

			xTextCursor.getText().insertTextContent(xTextCursor, textFrame, false);
			XTextCursor localCursor = textFrame.getText().createTextCursor();

			XParagraphCursor paragraphCursor = UnoRuntime.queryInterface(XParagraphCursor.class, localCursor);
			XPropertySet paraSet = createXPropertySet(paragraphCursor);
			paraSet.setPropertyValue("ParaStyleName", "Illustration");// it works!!! in fact we can't push style which have not been declared and which don't exist by default



			localCursor.getText().insertTextContent(localCursor, graphicContent, false);
			localCursor.gotoEnd(true);
			localCursor.getText().insertString(localCursor, "Illustration", false);


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
				builder.append(": ");
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
		System.out.println(NLS.bind("-----------------------properties of {0}--------------------", relativeObjectName));
		XPropertySetInfo set12 = propertySet.getPropertySetInfo();
		for (Property tmp : set12.getProperties()) {
			System.out.println("prop Name " + tmp.Name);
			System.out.println("prop attr " + tmp.Attributes);
			System.out.println("prop type " + tmp.Type);
			System.out.println("\n");
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
		richText = richText.replaceAll("&nbsp;", " ");
		// Create file with the part of text with rich text
		String location = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		StringBuilder pathName = new StringBuilder();
		pathName.append(location);
		pathName.append(File.separator);
		pathName.append("tmp_ParagraphWithRichText_"); // $NON-NLS-1$
		pathName.append(new Date().getTime());
		pathName.append("."); // $NON-NLS-1$
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
	 * @param style
	 */
	public static void addTable(XTextCursor xTextCursor, Table table, ODTEditor odtEditor, Object style) {
		// Set number of rows and columns
		int numRows = table.getAllRows().size();
		if (numRows <= 0) {
			return;
		}
		int numCols = table.getAllRows().get(0).size();
		try {
			XMultiServiceFactory xMultiServiceFactory = odtEditor.getXMultiServiceFactory();
			// create a text table
			Object obj = xMultiServiceFactory.createInstance("com.sun.star.text.TextTable"); // $NON-NLS-1$
			XTextTable textTable = UnoRuntime.queryInterface(XTextTable.class, obj);

			// Default background color
			Object backColor = 0x6AA84F;
			// // If defined style then update backColor
			if (style != null) {
				backColor = style;
			}




			if (numCols > 0) {

				// Verify if there are row titles
				if (table.getRowTitles() != null && !table.getRowTitles().isEmpty()) {
					// update column counters
					numCols++;
				}

				// Verify if there are column titles
				if (table.getColumnTitles() != null && !table.getColumnTitles().isEmpty()) {
					// update row counter
					numRows++;
				}

				// Initialize and add table
				textTable.initialize(numRows, numCols);
				addTextContent(xTextCursor, textTable);
				endParagraph(xTextCursor);

				// Set Style if there are column titles
				if (table.getColumnTitles() != null && !table.getColumnTitles().isEmpty()) {
					// Set color of first row to be light blue
					XTableRows rows = textTable.getRows();
					PropertySetUtil.setProperty(rows.getByIndex(0), "BackColor", backColor); // $NON-NLS-1$
				}



				// Set cell's contents
				String[] cellNames = textTable.getCellNames();
				int indexRow = 0;
				int indexCol = 0;
				for (int i = 0; i < cellNames.length; i++) {
					XText cellText = UnoRuntime.queryInterface(XText.class, textTable.getCellByName(cellNames[i]));

					// Verify if first row and there are column titles
					if ((i < numCols) && (table.getColumnTitles() != null && !table.getColumnTitles().isEmpty())) {
						// There are row titles
						if (table.getRowTitles() != null && !table.getRowTitles().isEmpty()) {
							// If cell is the first cell then this cell must be empty
							if (i == 0) {
								indexCol++;
								continue;
							} else {
								// Set cell with column title
								cellText.setString(table.getColumnTitles().get(indexCol - 1));
							}
						} else {
							// Set cell with column title
							cellText.setString(table.getColumnTitles().get(indexCol));
						}
						indexCol++;
						// If index column over the last column (cell) of a row
						if (indexCol == numCols) {
							indexCol = 0;
						}
					} else {
						// Verify if there are row titles
						if (table.getRowTitles() != null && !table.getRowTitles().isEmpty()) {
							// If first column the set cell with row title
							if (indexCol == 0) {
								// Set style
								PropertySetUtil.setProperty(cellText, "BackColor", backColor); // $NON-NLS-1$
								// Set content
								cellText.setString(table.getRowTitles().get(indexRow));
							} else {
								// If not first column the set cell
								cellText.setString(table.getAllRows().get(indexRow).get(indexCol - 1));
							}
						} else {
							// Set cell
							cellText.setString(table.getAllRows().get(indexRow).get(indexCol));
						}

						indexCol++;
						// If index column over the last column of a row
						if (indexCol == numCols) {
							indexCol = 0;
							indexRow++;
						}
					}
				}
			}

		} catch (com.sun.star.uno.Exception e) {
			Activator.log.error(e);
		}

	}
}
