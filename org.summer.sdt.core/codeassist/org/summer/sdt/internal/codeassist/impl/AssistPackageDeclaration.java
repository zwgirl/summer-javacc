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
import org.summer.sdt.core.IAnnotation;
import org.summer.sdt.core.JavaModelException;
import org.summer.sdt.internal.core.CompilationUnit;
import org.summer.sdt.internal.core.PackageDeclaration;

@SuppressWarnings("rawtypes")
public class AssistPackageDeclaration extends PackageDeclaration {
	private Map infoCache;
	public AssistPackageDeclaration(CompilationUnit parent, String name, Map infoCache) {
		super(parent, name);
		this.infoCache = infoCache;
	}

	public Object getElementInfo(IProgressMonitor monitor) throws JavaModelException {
		return this.infoCache.get(this);
	}

	public IAnnotation getAnnotation(String name) {
		return new AssistAnnotation(this, name, this.infoCache);
	}
}
