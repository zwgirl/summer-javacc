/*******************************************************************************
 * Copyright (c) 2000, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Stephan Herrmann - Contribution for Bug 337935 - Test failures when run as an IDE (org.eclipse.sdk.ide)
 *******************************************************************************/
package org.summer.sdt.internal.core;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.summer.sdt.core.IBuffer;
import org.summer.sdt.core.IJavaElement;
import org.summer.sdt.core.IJavaModelStatusConstants;
import org.summer.sdt.core.JavaModelException;
import org.summer.sdt.core.ToolFactory;
import org.summer.sdt.core.WorkingCopyOwner;
import org.summer.sdt.core.compiler.CharOperation;
import org.summer.sdt.core.util.ClassFileBytesDisassembler;
import org.summer.sdt.core.util.IClassFileReader;
import org.summer.sdt.internal.core.util.Disassembler;
import org.summer.sdt.internal.core.util.Util;

/**
 * A working copy on an <code>IClassFile</code>.
 */
public class ClassFileWorkingCopy extends CompilationUnit {

	public ClassFile classFile;

public ClassFileWorkingCopy(ClassFile classFile, WorkingCopyOwner owner) {
	super((PackageFragment) classFile.getParent(), ((BinaryType) classFile.getType()).getSourceFileName(null/*no info available*/), owner);
	this.classFile = classFile;
}

public void commitWorkingCopy(boolean force, IProgressMonitor monitor) throws JavaModelException {
	throw new JavaModelException(new JavaModelStatus(IJavaModelStatusConstants.INVALID_ELEMENT_TYPES, this));
}

public IBuffer getBuffer() throws JavaModelException {
	if (isWorkingCopy())
		return super.getBuffer();
	else
		return this.classFile.getBuffer();
}

public char[] getContents() {
	try {
		IBuffer buffer = getBuffer();
		if (buffer == null) return CharOperation.NO_CHAR;
		char[] characters = buffer.getCharacters();
		if (characters == null) return CharOperation.NO_CHAR;
		return characters;
	} catch (JavaModelException e) {
		return CharOperation.NO_CHAR;
	}
}

public IPath getPath() {
	return this.classFile.getPath();
}

public IJavaElement getPrimaryElement(boolean checkOwner) {
	if (checkOwner && isPrimary()) return this;
	return new ClassFileWorkingCopy(this.classFile, DefaultWorkingCopyOwner.PRIMARY);
}

public IResource resource(PackageFragmentRoot root) {
	if (root.isArchive())
		return root.resource(root);
	return this.classFile.resource(root);
}

/**
 * @see Openable#openBuffer(IProgressMonitor, Object)
 */
protected IBuffer openBuffer(IProgressMonitor pm, Object info) throws JavaModelException {

	// create buffer
	IBuffer buffer = BufferManager.createBuffer(this);

	// set the buffer source
	IBuffer classFileBuffer = this.classFile.getBuffer();
	if (classFileBuffer != null) {
		buffer.setContents(classFileBuffer.getCharacters());
	} else {
		// Disassemble
		IClassFileReader reader = ToolFactory.createDefaultClassFileReader(this.classFile, IClassFileReader.ALL);
		Disassembler disassembler = new Disassembler();
		String contents = disassembler.disassemble(reader, Util.getLineSeparator("", getJavaProject()), ClassFileBytesDisassembler.WORKING_COPY); //$NON-NLS-1$
		buffer.setContents(contents);
	}

	// add buffer to buffer cache
	BufferManager bufManager = getBufferManager();
	bufManager.addBuffer(buffer);

	// listen to buffer changes
	buffer.addBufferChangedListener(this);

	return buffer;
}

protected void toStringName(StringBuffer buffer) {
	buffer.append(this.classFile.getElementName());
}

}
