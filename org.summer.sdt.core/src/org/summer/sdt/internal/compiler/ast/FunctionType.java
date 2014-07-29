package org.summer.sdt.internal.compiler.ast;

import org.summer.sdt.internal.compiler.ASTVisitor;
import org.summer.sdt.internal.compiler.lookup.BlockScope;
import org.summer.sdt.internal.compiler.lookup.ClassScope;
import org.summer.sdt.internal.compiler.lookup.Scope;
import org.summer.sdt.internal.compiler.lookup.TypeBinding;

public class FunctionType extends TypeReference {
	public TypeReference returnType;
	public Argument[] arguments;
	
	public FunctionType(Argument[] arguments, TypeReference returnType, int sourceStart, int sourceEnd){
		this.returnType = returnType;
		this.arguments = arguments;
		this.sourceStart = sourceStart;
		this.sourceEnd = sourceEnd;
	}
	@Override
	public TypeReference augmentTypeWithAdditionalDimensions(
			int additionalDimensions, Annotation[][] additionalAnnotations,
			boolean isVarargs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getLastToken() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected TypeBinding getTypeBinding(Scope scope) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[][] getTypeName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void traverse(ASTVisitor visitor, BlockScope scope) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverse(ASTVisitor visitor, ClassScope scope) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StringBuffer printExpression(int indent, StringBuffer output) {
		// TODO Auto-generated method stub
		return null;
	}

}
