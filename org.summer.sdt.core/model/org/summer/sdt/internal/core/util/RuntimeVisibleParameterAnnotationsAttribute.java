/*******************************************************************************
 * Copyright (c) 2004, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.summer.sdt.internal.core.util;

import org.summer.sdt.core.util.ClassFormatException;
import org.summer.sdt.core.util.IConstantPool;
import org.summer.sdt.core.util.IParameterAnnotation;
import org.summer.sdt.core.util.IRuntimeVisibleParameterAnnotationsAttribute;

/**
 * Default implementation of IRuntimeVisibleAnnotations
 */
public class RuntimeVisibleParameterAnnotationsAttribute
	extends ClassFileAttribute
	implements IRuntimeVisibleParameterAnnotationsAttribute {

	private static final IParameterAnnotation[] NO_ENTRIES = new IParameterAnnotation[0];
	private int parametersNumber;
	private IParameterAnnotation[] parameterAnnotations;

	/**
	 * Constructor for RuntimeVisibleParameterAnnotations.
	 * @param classFileBytes
	 * @param constantPool
	 * @param offset
	 * @throws ClassFormatException
	 */
	public RuntimeVisibleParameterAnnotationsAttribute(
		byte[] classFileBytes,
		IConstantPool constantPool,
		int offset)
		throws ClassFormatException {
		super(classFileBytes, constantPool, offset);
		final int length = u1At(classFileBytes, 6, offset);
		this.parametersNumber = length;
		if (length != 0) {
			int readOffset = 7;
			this.parameterAnnotations = new IParameterAnnotation[length];
			for (int i = 0; i < length; i++) {
				ParameterAnnotation parameterAnnotation = new ParameterAnnotation(classFileBytes, constantPool, offset + readOffset);
				this.parameterAnnotations[i] = parameterAnnotation;
				readOffset += parameterAnnotation.sizeInBytes();
			}
		} else {
			this.parameterAnnotations = NO_ENTRIES;
		}
	}
	/* (non-Javadoc)
	 * @see org.summer.sdt.core.util.IRuntimeVisibleParameterAnnotations#getAnnotations()
	 */
	public IParameterAnnotation[] getParameterAnnotations() {
		return this.parameterAnnotations;
	}
	/* (non-Javadoc)
	 * @see org.summer.sdt.core.util.IRuntimeVisibleParameterAnnotations#getParametersNumber()
	 */
	public int getParametersNumber() {
		return this.parametersNumber;
	}
}
