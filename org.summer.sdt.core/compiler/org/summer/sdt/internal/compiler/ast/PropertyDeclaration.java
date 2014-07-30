package org.summer.sdt.internal.compiler.ast;

public class PropertyDeclaration extends ASTNode {
	public Block getter;
	public Block setter;
	public char[] name;
	public TypeReference type;
	public int modifiers;
	public Annotation[] annotations;
	public PropertyDeclaration(TypeReference type, char[] name, Block getter, Block setter, int s, int e){
		this.name = name;
		this.type = type;
		this.getter = getter;
		this.setter = setter;
		this.sourceStart = s;
		this.sourceEnd = e;
	}
	@Override
	public StringBuffer print(int indent, StringBuffer output) {
		// TODO Auto-generated method stub
		return null;
	}
}
