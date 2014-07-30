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
package org.summer.sdt.internal.core;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.summer.sdt.core.IClasspathContainer;
import org.summer.sdt.core.IClasspathEntry;
import org.summer.sdt.core.JavaCore;
import org.summer.sdt.internal.core.util.Util;

/**
 *
 */
public class UserLibraryClasspathContainer implements IClasspathContainer {

	private String name;

	public UserLibraryClasspathContainer(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.core.IClasspathContainer#getClasspathEntries()
	 */
	public IClasspathEntry[] getClasspathEntries() {
		UserLibrary library= getUserLibrary();
		if (library != null) {
			return library.getEntries();
		}
		return new IClasspathEntry[0];
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.core.IClasspathContainer#getDescription()
	 */
	public String getDescription() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.core.IClasspathContainer#getKind()
	 */
	public int getKind() {
		UserLibrary library= getUserLibrary();
		if (library != null && library.isSystemLibrary()) {
			return K_SYSTEM;
		}
		return K_APPLICATION;
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.core.IClasspathContainer#getPath()
	 */
	public IPath getPath() {
		return new Path(JavaCore.USER_LIBRARY_CONTAINER_ID).append(this.name);
	}

	private UserLibrary getUserLibrary() {
		UserLibrary userLibrary = JavaModelManager.getUserLibraryManager().getUserLibrary(this.name);
		if (userLibrary == null && (JavaModelManager.CP_RESOLVE_VERBOSE || JavaModelManager.CP_RESOLVE_VERBOSE_FAILURE)) {
			verbose_no_user_library_found(this.name);
		}
		return userLibrary;
	}

	private void verbose_no_user_library_found(String userLibraryName) {
		Util.verbose(
			"UserLibrary INIT - FAILED (no user library found)\n" + //$NON-NLS-1$
			"	userLibraryName: " + userLibraryName); //$NON-NLS-1$
	}
}
