/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.summer.sdt.internal.codeassist.complete;

import org.summer.sdt.internal.compiler.ast.SingleNameReference;
import org.summer.sdt.internal.compiler.lookup.BlockScope;
import org.summer.sdt.internal.compiler.lookup.TypeBinding;

public class CompletionOnKeyword3 extends SingleNameReference implements CompletionOnKeyword{
	private char[][] possibleKeywords;
	public CompletionOnKeyword3(char[] token, long pos, char[] possibleKeyword) {
		this(token, pos, new char[][]{possibleKeyword});
	}
	public CompletionOnKeyword3(char[] token, long pos, char[][] possibleKeywords) {
		super(token, pos);
		this.token = token;
		this.possibleKeywords = possibleKeywords;
	}
	public char[] getToken() {
		return this.token;
	}
	public char[][] getPossibleKeywords() {
		return this.possibleKeywords;
	}
	public StringBuffer printExpression(int indent, StringBuffer output) {

		return output.append("<CompleteOnKeyword:").append(this.token).append('>'); //$NON-NLS-1$
	}
	public TypeBinding resolveType(BlockScope scope) {
		throw new CompletionNodeFound(this, scope);
	}
}
