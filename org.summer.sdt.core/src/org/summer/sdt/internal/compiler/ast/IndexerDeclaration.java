package org.summer.sdt.internal.compiler.ast;

public class IndexerDeclaration extends ASTNode {
	public TypeReference type;
	public Argument[] arguments;
	public Block getter;
	public Block setter;
	public int modifiers;
	public Annotation[] annotations;
	
	public IndexerDeclaration(TypeReference type, Argument[] arguments, Block getter, Block setter, int s, int e){
		this.type = type;
		this.arguments = arguments;
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
