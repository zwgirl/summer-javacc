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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.summer.sdt.core.ClasspathContainerInitializer;
import org.summer.sdt.core.IClasspathContainer;
import org.summer.sdt.core.IJavaProject;
import org.summer.sdt.core.JavaCore;
import org.summer.sdt.internal.core.util.Util;

/**
 *
 */
public class UserLibraryClasspathContainerInitializer extends ClasspathContainerInitializer {

	/* (non-Javadoc)
	 * @see org.summer.sdt.core.ClasspathContainerInitializer#canUpdateClasspathContainer(org.eclipse.core.runtime.IPath, org.summer.sdt.core.IJavaProject)
	 */
	public boolean canUpdateClasspathContainer(IPath containerPath, IJavaProject project) {
		return isUserLibraryContainer(containerPath);
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.core.ClasspathContainerInitializer#getComparisonID(org.eclipse.core.runtime.IPath, org.summer.sdt.core.IJavaProject)
	 */
	public Object getComparisonID(IPath containerPath, IJavaProject project) {
		return containerPath;
	}

	/**
	 * @see org.summer.sdt.core.ClasspathContainerInitializer#getDescription(org.eclipse.core.runtime.IPath, org.summer.sdt.core.IJavaProject)
	 */
	public String getDescription(IPath containerPath, IJavaProject project) {
		if (isUserLibraryContainer(containerPath)) {
			return containerPath.segment(1);
		}
		return super.getDescription(containerPath, project);
	}

	public void initialize(IPath containerPath, IJavaProject project) throws CoreException {
		if (isUserLibraryContainer(containerPath)) {
			String userLibName = containerPath.segment(1);
			UserLibrary userLibrary = JavaModelManager.getUserLibraryManager().getUserLibrary(userLibName);
			if (userLibrary != null) {
				UserLibraryClasspathContainer container = new UserLibraryClasspathContainer(userLibName);
				JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project }, new IClasspathContainer[] { container }, null);
			} else if (JavaModelManager.CP_RESOLVE_VERBOSE || JavaModelManager.CP_RESOLVE_VERBOSE_FAILURE) {
				verbose_no_user_library_found(project, userLibName);
			}
		} else if (JavaModelManager.CP_RESOLVE_VERBOSE || JavaModelManager.CP_RESOLVE_VERBOSE_FAILURE) {
			verbose_not_a_user_library(project, containerPath);
		}
	}

	private boolean isUserLibraryContainer(IPath path) {
		return path != null && path.segmentCount() == 2 && JavaCore.USER_LIBRARY_CONTAINER_ID.equals(path.segment(0));
	}

	/**
	 * @see org.summer.sdt.core.ClasspathContainerInitializer#requestClasspathContainerUpdate(org.eclipse.core.runtime.IPath, org.summer.sdt.core.IJavaProject, org.summer.sdt.core.IClasspathContainer)
	 */
	public void requestClasspathContainerUpdate(IPath containerPath, IJavaProject project, IClasspathContainer containerSuggestion) throws CoreException {
		if (isUserLibraryContainer(containerPath)) {
			String name = containerPath.segment(1);
			if (containerSuggestion != null) {
				JavaModelManager.getUserLibraryManager().setUserLibrary(name, containerSuggestion.getClasspathEntries(), containerSuggestion.getKind() == IClasspathContainer.K_SYSTEM);
			} else {
				JavaModelManager.getUserLibraryManager().removeUserLibrary(name);
			}
			// update of affected projects was done as a consequence of setUserLibrary() or removeUserLibrary()
		}
	}

	private void verbose_no_user_library_found(IJavaProject project, String userLibraryName) {
		Util.verbose(
			"UserLibrary INIT - FAILED (no user library found)\n" + //$NON-NLS-1$
			"	project: " + project.getElementName() + '\n' + //$NON-NLS-1$
			"	userLibraryName: " + userLibraryName); //$NON-NLS-1$
	}

	private void verbose_not_a_user_library(IJavaProject project, IPath containerPath) {
		Util.verbose(
			"UserLibrary INIT - FAILED (not a user library)\n" + //$NON-NLS-1$
			"	project: " + project.getElementName() + '\n' + //$NON-NLS-1$
			"	container path: " + containerPath); //$NON-NLS-1$
	}
}
