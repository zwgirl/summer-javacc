/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.summer.sdt.internal.core;

import org.summer.sdt.core.IBuffer;
import org.summer.sdt.core.ICompilationUnit;
import org.summer.sdt.core.WorkingCopyOwner;

/**
 * Wraps an IBufferFactory.
 * TODO remove when removing IBufferFactory
 * @deprecated
 */
public class BufferFactoryWrapper extends WorkingCopyOwner {

	public org.summer.sdt.core.IBufferFactory factory;

	private BufferFactoryWrapper(org.summer.sdt.core.IBufferFactory factory) {
		this.factory = factory;
	}

	public static WorkingCopyOwner create(org.summer.sdt.core.IBufferFactory factory) {
		return new BufferFactoryWrapper(factory);
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.core.WorkingCopyOwner#createBuffer(org.summer.sdt.core.ICompilationUnit)
	 */
	public IBuffer createBuffer(ICompilationUnit workingCopy) {
		if (this.factory == null) return super.createBuffer(workingCopy);
		return this.factory.createBuffer(workingCopy);
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof BufferFactoryWrapper)) return false;
		BufferFactoryWrapper other = (BufferFactoryWrapper)obj;
		if (this.factory == null) return other.factory == null;
		return this.factory.equals(other.factory);
	}
	public int hashCode() {
		if (this.factory == null) return 0;
		return this.factory.hashCode();
	}
	public String toString() {
		return "FactoryWrapper for " + this.factory; //$NON-NLS-1$
	}
}
