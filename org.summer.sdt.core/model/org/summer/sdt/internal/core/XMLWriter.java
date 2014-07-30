/*******************************************************************************
 * Copyright (c) 2000, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.summer.sdt.internal.core;
import java.io.Writer;

import org.summer.sdt.core.IJavaProject;
import org.summer.sdt.internal.compiler.util.GenericXMLWriter;
import org.summer.sdt.internal.core.util.Util;
/**
 * @since 3.0
 */
class XMLWriter extends GenericXMLWriter {

	public XMLWriter(Writer writer, IJavaProject project, boolean printXmlVersion) {
		super(writer, Util.getLineSeparator((String) null, project), printXmlVersion);
	}
}
