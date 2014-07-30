/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.summer.sdt.internal.core.search.matching;

import org.summer.sdt.core.IJavaElement;
import org.summer.sdt.core.search.IJavaSearchConstants;
import org.summer.sdt.internal.compiler.util.SimpleSet;

public class DeclarationOfAccessedFieldsPattern extends FieldPattern {

protected IJavaElement enclosingElement;
protected SimpleSet knownFields;

public DeclarationOfAccessedFieldsPattern(IJavaElement enclosingElement) {
	super(null, null, null, null, null, IJavaSearchConstants.REFERENCES, R_PATTERN_MATCH);

	this.enclosingElement = enclosingElement;
	this.knownFields = new SimpleSet();
	this.mustResolve = true;
}
}
