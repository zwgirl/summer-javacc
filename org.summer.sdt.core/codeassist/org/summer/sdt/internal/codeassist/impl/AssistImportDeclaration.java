/*******************************************************************************
 * Copyright (c) 2008, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.summer.sdt.internal.codeassist.impl;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.summer.sdt.core.JavaModelException;
import org.summer.sdt.internal.core.ImportContainer;
import org.summer.sdt.internal.core.ImportDeclaration;

@SuppressWarnings("rawtypes")
public class AssistImportDeclaration extends ImportDeclaration {
	private Map infoCache;
	public AssistImportDeclaration(ImportContainer parent, String name, boolean isOnDemand, Map infoCache) {
		super(parent, name, isOnDemand);
		this.infoCache = infoCache;
	}

	public Object getElementInfo(IProgressMonitor monitor) throws JavaModelException {
		return this.infoCache.get(this);
	}
}
