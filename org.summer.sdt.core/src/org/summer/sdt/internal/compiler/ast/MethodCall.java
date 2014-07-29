package org.summer.sdt.internal.compiler.ast;

import static org.summer.sdt.internal.compiler.ast.ExpressionContext.VANILLA_CONTEXT;

import org.summer.sdt.internal.compiler.lookup.MethodBinding;
import org.summer.sdt.internal.compiler.lookup.TypeBinding;

public class MethodCall extends Expression{
	public Expression caller;
	public Expression[] arguments;
	public MethodBinding binding;							// exact binding resulting from lookup
	public MethodBinding syntheticAccessor;						// synthetic accessor for inner-emulation
	public TypeBinding expectedType;					// for generic method invocation (return type inference)

	public long nameSourcePosition ; //(start<<32)+end

	public TypeBinding actualReceiverType;
	public TypeBinding valueCast; // extra reference type cast to perform on method returned value
	public TypeReference[] typeArguments;
	public TypeBinding[] genericTypeArguments;
	private ExpressionContext expressionContext = VANILLA_CONTEXT;
	
	public MethodCall(Expression caller, Expression[] arguments){
		
	}
	
	@Override
	public StringBuffer printExpression(int indent, StringBuffer output) {
		// TODO Auto-generated method stub
		return null;
	}

}
