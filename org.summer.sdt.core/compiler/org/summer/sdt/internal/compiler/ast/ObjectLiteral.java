package org.summer.sdt.internal.compiler.ast;

import org.summer.sdt.internal.compiler.lookup.BlockScope;
import org.summer.sdt.internal.compiler.lookup.TypeBinding;

public class ObjectLiteral extends Literal {


	public ObjectLiteral(int s, int e) {
		super(s, e);
		// TODO Auto-generated constructor stub
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
