package org.summer.sdt.internal.compiler.ast;

import org.summer.sdt.internal.compiler.lookup.BlockScope;
import org.summer.sdt.internal.compiler.lookup.TypeBinding;

public class ArrayLiteral extends Literal {

	public ArrayLiteral(int s, int e) {
		super(s, e);
	}

	@Override
	public void computeConstant() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TypeBinding literalType(BlockScope scope) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] source() {
		// TODO Auto-generated method stub
		return null;
	}

}
