/*****************************************************************************
 * Copyright (c) 2021 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.core.styledstring;

import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

/**
 * The goal of this class is to convert a {@link StyledString} into formated html
 */
public class StyledStringToHtmlConvertor {

	private StyledString styledString;

	/**
	 * Constructor.
	 *
	 */
	public StyledStringToHtmlConvertor(StyledString styledString) {
		this.styledString = styledString;
	}

	public String convert() {
		int lastIndex = 0;
		StringBuilder builder = new StringBuilder();
		Iterator<StyleRange> iterator = Arrays.asList(styledString.getStyleRanges()).iterator();
		while (iterator.hasNext()) {
			StyleRange range = iterator.next();

			if (range.start != lastIndex) {
				// there is text without styles between the the previous range and this one
				builder.append(styledString.subSequence(lastIndex, range.start));
			}

			// Styled text
			StringBuilder closeBuilder = new StringBuilder();
			appendMarkers(styledString.subSequence(range.start, range.start + range.length), range, builder, closeBuilder);

			builder.append(closeBuilder);

			lastIndex = range.start + range.length;
		}

		if (lastIndex != styledString.length()) {
			// add the last part without style
			builder.append(styledString.subSequence(lastIndex, styledString.length()));
		}

		return builder.toString();
	}

	private void appendMarkers(CharSequence charSequence, StyleRange range, StringBuilder builder, StringBuilder closeBuilder) {
		// 1. Open span
		builder.append("<span"); //$NON-NLS-1$
		closeBuilder.insert(0, "</span>"); //$NON-NLS-1$
		// 1.1 add styles
		setStyle(range, builder, closeBuilder);
		// 1.2 Close paragraph marker
		builder.append("\">"); //$NON-NLS-1$

		if (range.font != null) {
			Font font = range.font;
			if (font.getFontData().length != 0) {
				int fontStyle = font.getFontData()[0].getStyle();
				if ((fontStyle & SWT.BOLD) != 0) {
					builder.append("<b>"); //$NON-NLS-1$
					closeBuilder.insert(0, "</b>"); //$NON-NLS-1$
				}
				if ((fontStyle & SWT.ITALIC) != 0) {
					builder.append("<i>"); //$NON-NLS-1$
					closeBuilder.insert(0, "</i>"); //$NON-NLS-1$
				}
			}
			if (range.strikeout) {
				builder.append("<del>"); //$NON-NLS-1$
				closeBuilder.insert(0, "</del>"); //$NON-NLS-1$
			}
		}

		// 2. Add text
		builder.append(charSequence);
	}

	/**
	 * @param range
	 * @param builder
	 * @param closeBuilder
	 */
	protected void setStyle(StyleRange range, StringBuilder builder, StringBuilder closeBuilder) {
		builder.append(" style=\""); //$NON-NLS-1$
		setStyleAttribut(range, builder, closeBuilder);
	}

	/**
	 * @param range
	 * @param builder
	 * @param closeBuilder
	 */
	protected void setStyleAttribut(StyleRange range, StringBuilder builder, StringBuilder closeBuilder) {
		// font
		if (range.foreground != null) {
			appendColorStyleAsHTML(range.foreground, "color", builder); //$NON-NLS-1$
		}
		if (range.background != null) {
			appendColorStyleAsHTML(range.foreground, "background-color", builder); //$NON-NLS-1$
		}
		if (range.font != null && range.font.getFontData().length != 0) {
			appendStringStyleAsHTML(range.font.getFontData()[0].getName(), "font-family", builder); //$NON-NLS-1$
			appendStringStyleAsHTML(Integer.toString(range.font.getFontData()[0].getHeight()), "font-size", builder); //$NON-NLS-1$
		}

		// border
		if ((range.borderStyle & SWT.BORDER_SOLID) != 0) {
			appendStringStyleAsHTML("solid", "border", builder); //$NON-NLS-1$ //$NON-NLS-2$
		} else if ((range.borderStyle & SWT.BORDER_DASH) != 0) {
			appendStringStyleAsHTML("dashed", "border", builder); //$NON-NLS-1$ //$NON-NLS-2$
		} else if ((range.borderStyle & SWT.BORDER_DOT) != 0) {
			appendStringStyleAsHTML("dotted", "border", builder); //$NON-NLS-1$ //$NON-NLS-2$
		}
		if (range.borderColor != null) {
			appendColorStyleAsHTML(range.borderColor, "border-color", builder); //$NON-NLS-1$
		}
	}

	protected void appendStringStyleAsHTML(String value, String styleName, StringBuilder builder) {
		builder.append(styleName);
		builder.append(": "); //$NON-NLS-1$
		builder.append(value);
		builder.append(");"); //$NON-NLS-1$
	}

	protected void appendColorStyleAsHTML(Color color, String styleName, StringBuilder builder) {
		builder.append(styleName);
		builder.append(": "); //$NON-NLS-1$
		builder.append("rgb("); //$NON-NLS-1$
		builder.append(color.getRGB().red);
		builder.append(","); //$NON-NLS-1$
		builder.append(color.getRGB().green);
		builder.append(","); //$NON-NLS-1$
		builder.append(color.getRGB().blue);
		builder.append(");"); //$NON-NLS-1$
	}

}
