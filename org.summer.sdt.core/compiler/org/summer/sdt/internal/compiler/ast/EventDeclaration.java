package org.summer.sdt.internal.compiler.ast;

public class EventDeclaration extends ASTNode {
	public TypeReference type;
	public char[] name;
	public Block add;
	public Block remove;
	public int modifiers;
	public Annotation[] annotations;
	public EventDeclaration(TypeReference type, char[] name, Block add, Block remove,int s, int e){
		this.type = type;
		this.name = name;
		this.sourceStart = s;
		this.sourceEnd = e;
		this.add = add;
		this.remove = remove;
	}
	@Override
	public StringBuffer print(int indent, StringBuffer output) {
		// TODO Auto-generated method stub
		return null;
	}
}
