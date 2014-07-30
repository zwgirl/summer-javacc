package org.summer.sdt.internal.compiler.ast;

public class ParenthesizedExpression extends Expression {
	/**
	 * The expression within the parentheses.
	 */
	public Expression expression;
	public ParenthesizedExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public StringBuffer printExpression(int indent, StringBuffer output) {
		// TODO Auto-generated method stub
		return null;
	}
}
