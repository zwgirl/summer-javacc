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
package org.summer.sdt.internal.eval;

import org.summer.sdt.core.compiler.CategorizedProblem;
import org.summer.sdt.internal.compiler.ClassFile;

/**
 * A callback interface for receiving code snippet evaluation results.
 */
public interface IRequestor {
/**
 * @see org.summer.sdt.core.eval.ICodeSnippetRequestor
 */
boolean acceptClassFiles(ClassFile[] classFiles, char[] codeSnippetClassName);
/**
 * @see org.summer.sdt.core.eval.ICodeSnippetRequestor
 */
void acceptProblem(CategorizedProblem problem, char[] fragmentSource, int fragmentKind);
}
