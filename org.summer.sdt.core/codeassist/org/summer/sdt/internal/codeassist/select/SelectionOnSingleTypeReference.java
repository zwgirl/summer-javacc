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
package org.summer.sdt.internal.codeassist.select;

/*
 * Selection node build by the parser in any case it was intending to
 * reduce a type reference containing the selection identifier as a single
 * name reference.
 * e.g.
 *
 *	class X extends [start]Object[end]
 *
 *	---> class X extends <SelectOnType:Object>
 *
 */
import org.summer.sdt.internal.compiler.ast.SingleTypeReference;
import org.summer.sdt.internal.compiler.lookup.Binding;
import org.summer.sdt.internal.compiler.lookup.BlockScope;
import org.summer.sdt.internal.compiler.lookup.PackageBinding;
import org.summer.sdt.internal.compiler.lookup.ProblemReasons;
import org.summer.sdt.internal.compiler.lookup.ProblemReferenceBinding;
import org.summer.sdt.internal.compiler.lookup.ReferenceBinding;
import org.summer.sdt.internal.compiler.lookup.Scope;
import org.summer.sdt.internal.compiler.lookup.TypeBinding;

public class SelectionOnSingleTypeReference extends SingleTypeReference {
public SelectionOnSingleTypeReference(char[] source, long pos) {
	super(source, pos);
}
public void aboutToResolve(Scope scope) {
	getTypeBinding(scope.parent); // step up from the ClassScope
}
protected TypeBinding getTypeBinding(Scope scope) {
	// it can be a package, type or member type
	Binding binding = scope.getTypeOrPackage(new char[][] {this.token});
	if (!binding.isValidBinding()) {
		if (binding instanceof TypeBinding) {
			scope.problemReporter().invalidType(this, (TypeBinding) binding);
		} else if (binding instanceof PackageBinding) {
			ProblemReferenceBinding problemBinding = new ProblemReferenceBinding(((PackageBinding)binding).compoundName, null, binding.problemId());
			scope.problemReporter().invalidType(this, problemBinding);
		}
		throw new SelectionNodeFound();
	}
	throw new SelectionNodeFound(binding);
}
public StringBuffer printExpression(int indent, StringBuffer output) {

	return output.append("<SelectOnType:").append(this.token).append('>');//$NON-NLS-1$
}
public TypeBinding resolveTypeEnclosing(BlockScope scope, ReferenceBinding enclosingType) {
	super.resolveTypeEnclosing(scope, enclosingType);

		// tolerate some error cases
		if (this.resolvedType == null ||
				!(this.resolvedType.isValidBinding() ||
					this.resolvedType.problemId() == ProblemReasons.NotVisible))
		throw new SelectionNodeFound();
	else
		throw new SelectionNodeFound(this.resolvedType);
}
}
