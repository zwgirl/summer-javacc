// Generated from C:\summer\org.summer.sdt.core\grammar\Java8.g4 by ANTLR 4.1
package org.summer.sdt.internal.compiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, TemplateLiteral=11, ABSTRACT=12, ASSERT=13, BOOLEAN=14, BREAK=15, 
		BYTE=16, CASE=17, CATCH=18, CHAR=19, CLASS=20, CONST=21, CONTINUE=22, 
		DEFAULT=23, DO=24, DOUBLE=25, ELSE=26, ENUM=27, EXTENDS=28, FINAL=29, 
		FINALLY=30, FLOAT=31, FOR=32, IF=33, GOTO=34, IMPLEMENTS=35, IMPORT=36, 
		INSTANCEOF=37, INT=38, INTERFACE=39, LONG=40, NATIVE=41, NEW=42, PACKAGE=43, 
		PRIVATE=44, PROTECTED=45, PUBLIC=46, RETURN=47, SHORT=48, STATIC=49, STRICTFP=50, 
		SUPER=51, SWITCH=52, SYNCHRONIZED=53, THIS=54, THROW=55, THROWS=56, TRANSIENT=57, 
		TRY=58, VOID=59, VOLATILE=60, WHILE=61, FUNCTION=62, IntegerLiteral=63, 
		FloatingPointLiteral=64, BooleanLiteral=65, CharacterLiteral=66, StringLiteral=67, 
		NullLiteral=68, LPAREN=69, RPAREN=70, LBRACE=71, RBRACE=72, LBRACK=73, 
		RBRACK=74, SEMI=75, COMMA=76, DOT=77, ASSIGN=78, GT=79, LT=80, BANG=81, 
		TILDE=82, QUESTION=83, COLON=84, EQUAL=85, LE=86, GE=87, NOTEQUAL=88, 
		AND=89, OR=90, INC=91, DEC=92, ADD=93, SUB=94, MUL=95, DIV=96, BITAND=97, 
		BITOR=98, CARET=99, MOD=100, ADD_ASSIGN=101, SUB_ASSIGN=102, MUL_ASSIGN=103, 
		DIV_ASSIGN=104, AND_ASSIGN=105, OR_ASSIGN=106, XOR_ASSIGN=107, MOD_ASSIGN=108, 
		LSHIFT_ASSIGN=109, RSHIFT_ASSIGN=110, URSHIFT_ASSIGN=111, Identifier=112, 
		AT=113, ELLIPSIS=114, WS=115, COMMENT=116, LINE_COMMENT=117;
	public static final String[] tokenNames = {
		"<INVALID>", "'</'", "'->'", "'module'", "'/>'", "'add'", "'export'", 
		"'set'", "'event'", "'get'", "'remove'", "TemplateLiteral", "'abstract'", 
		"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'enum'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", 
		"'goto'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'short'", "'static'", "'strictfp'", "'super'", 
		"'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", 
		"'try'", "'void'", "'volatile'", "'while'", "'function'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_moduleBlock = 1, RULE_element = 2, RULE_objectElement = 3, 
		RULE_attributeElement = 4, RULE_abstractAttribute = 5, RULE_attachAttribute = 6, 
		RULE_generalAttribute = 7, RULE_markupExtenson = 8, RULE_propertyExpression = 9, 
		RULE_packageDeclaration = 10, RULE_importDeclaration = 11, RULE_typeDeclaration = 12, 
		RULE_modifier = 13, RULE_classOrInterfaceModifier = 14, RULE_variableModifier = 15, 
		RULE_classDeclaration = 16, RULE_typeParameters = 17, RULE_typeParameter = 18, 
		RULE_typeBound = 19, RULE_enumDeclaration = 20, RULE_enumConstants = 21, 
		RULE_enumConstant = 22, RULE_enumBodyDeclarations = 23, RULE_interfaceDeclaration = 24, 
		RULE_typeList = 25, RULE_classBody = 26, RULE_interfaceBody = 27, RULE_classBodyDeclaration = 28, 
		RULE_memberDeclaration = 29, RULE_indexSignature = 30, RULE_methodDeclaration = 31, 
		RULE_genericMethodDeclaration = 32, RULE_constructorDeclaration = 33, 
		RULE_genericConstructorDeclaration = 34, RULE_fieldDeclaration = 35, RULE_propertyDeclaration = 36, 
		RULE_eventDeclaration = 37, RULE_interfaceBodyDeclaration = 38, RULE_interfaceMemberDeclaration = 39, 
		RULE_constDeclaration = 40, RULE_constantDeclarator = 41, RULE_interfaceMethodDeclaration = 42, 
		RULE_genericInterfaceMethodDeclaration = 43, RULE_variableDeclarators = 44, 
		RULE_variableDeclarator = 45, RULE_variableDeclaratorId = 46, RULE_variableInitializer = 47, 
		RULE_arrayLiteral = 48, RULE_objectLiteral = 49, RULE_propertyNameAndValueList = 50, 
		RULE_propertyAssignment = 51, RULE_propertyName = 52, RULE_propertySetParameterList = 53, 
		RULE_enumConstantName = 54, RULE_type = 55, RULE_classOrInterfaceType = 56, 
		RULE_primitiveType = 57, RULE_typeArguments = 58, RULE_typeArgument = 59, 
		RULE_qualifiedNameList = 60, RULE_formalParameters = 61, RULE_formalParameterList = 62, 
		RULE_formalParameter = 63, RULE_lastFormalParameter = 64, RULE_methodBody = 65, 
		RULE_constructorBody = 66, RULE_qualifiedName = 67, RULE_literal = 68, 
		RULE_annotation = 69, RULE_annotationName = 70, RULE_elementValuePairs = 71, 
		RULE_elementValuePair = 72, RULE_elementValue = 73, RULE_elementValueArrayInitializer = 74, 
		RULE_annotationTypeDeclaration = 75, RULE_annotationTypeBody = 76, RULE_annotationTypeElementDeclaration = 77, 
		RULE_annotationTypeElementRest = 78, RULE_annotationMethodOrConstantRest = 79, 
		RULE_annotationMethodRest = 80, RULE_annotationConstantRest = 81, RULE_defaultValue = 82, 
		RULE_block = 83, RULE_blockStatement = 84, RULE_localVariableDeclarationStatement = 85, 
		RULE_localVariableDeclaration = 86, RULE_statement = 87, RULE_catchClause = 88, 
		RULE_catchType = 89, RULE_finallyBlock = 90, RULE_resourceSpecification = 91, 
		RULE_resources = 92, RULE_resource = 93, RULE_switchBlockStatementGroup = 94, 
		RULE_switchLabel = 95, RULE_forControl = 96, RULE_forInit = 97, RULE_enhancedForControl = 98, 
		RULE_forUpdate = 99, RULE_parExpression = 100, RULE_expressionList = 101, 
		RULE_statementExpression = 102, RULE_constantExpression = 103, RULE_expression = 104, 
		RULE_primary = 105, RULE_creator = 106, RULE_createdName = 107, RULE_innerCreator = 108, 
		RULE_arrayCreatorRest = 109, RULE_classCreatorRest = 110, RULE_explicitGenericInvocation = 111, 
		RULE_nonWildcardTypeArguments = 112, RULE_typeArgumentsOrDiamond = 113, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 114, RULE_superSuffix = 115, 
		RULE_explicitGenericInvocationSuffix = 116, RULE_arguments = 117;
	public static final String[] ruleNames = {
		"compilationUnit", "moduleBlock", "element", "objectElement", "attributeElement", 
		"abstractAttribute", "attachAttribute", "generalAttribute", "markupExtenson", 
		"propertyExpression", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"indexSignature", "methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "propertyDeclaration", 
		"eventDeclaration", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
		"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
		"genericInterfaceMethodDeclaration", "variableDeclarators", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "arrayLiteral", "objectLiteral", 
		"propertyNameAndValueList", "propertyAssignment", "propertyName", "propertySetParameterList", 
		"enumConstantName", "type", "classOrInterfaceType", "primitiveType", "typeArguments", 
		"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
		"formalParameter", "lastFormalParameter", "methodBody", "constructorBody", 
		"qualifiedName", "literal", "annotation", "annotationName", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
		"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
		"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
		"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
		"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"parExpression", "expressionList", "statementExpression", "constantExpression", 
		"expression", "primary", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
		"classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArguments", 
		"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix", 
		"explicitGenericInvocationSuffix", "arguments"
	};

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public ModuleBlockContext moduleBlock(int i) {
			return getRuleContext(ModuleBlockContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }
		public ObjectElementContext objectElement() {
			return getRuleContext(ObjectElementContext.class,0);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<ModuleBlockContext> moduleBlock() {
			return getRuleContexts(ModuleBlockContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if (_la==PACKAGE || _la==AT) {
				{
				setState(236); packageDeclaration();
				}
			}

			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(239); importDeclaration();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245); match(3);
			setState(246); match(Identifier);
			setState(247); match(LBRACE);
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(248); objectElement();
				}
				break;
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(251); moduleBlock();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257); match(RBRACE);
			setState(258); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBlockContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ModuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterModuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitModuleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitModuleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleBlockContext moduleBlock() throws RecognitionException {
		ModuleBlockContext _localctx = new ModuleBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleBlock);
		int _la;
		try {
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262); typeDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(263); match(6);
					}
				}

				setState(266); methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public AttributeElementContext attributeElement() {
			return getRuleContext(AttributeElementContext.class,0);
		}
		public ObjectElementContext objectElement() {
			return getRuleContext(ObjectElementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		try {
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269); objectElement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270); attributeElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public AbstractAttributeContext abstractAttribute(int i) {
			return getRuleContext(AbstractAttributeContext.class,i);
		}
		public List<AbstractAttributeContext> abstractAttribute() {
			return getRuleContexts(AbstractAttributeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public ObjectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterObjectElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitObjectElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitObjectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectElementContext objectElement() throws RecognitionException {
		ObjectElementContext _localctx = new ObjectElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_objectElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(LT);
			setState(274); type();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN || _la==Identifier) {
				{
				{
				setState(275); abstractAttribute();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			switch (_input.LA(1)) {
			case GT:
				{
				{
				setState(281); match(GT);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LT) {
					{
					{
					setState(282); element();
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288); match(1);
				setState(289); type();
				setState(290); match(GT);
				}
				}
				break;
			case 4:
				{
				setState(292); match(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeElementContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public AttributeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAttributeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAttributeElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAttributeElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeElementContext attributeElement() throws RecognitionException {
		AttributeElementContext _localctx = new AttributeElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attributeElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(LT);
			setState(296); match(LPAREN);
			setState(297); type();
			setState(298); match(RPAREN);
			setState(299); match(DOT);
			setState(300);
			_la = _input.LA(1);
			if ( !(_la==5 || _la==10 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(317);
			switch (_input.LA(1)) {
			case GT:
				{
				{
				setState(301); match(GT);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LT) {
					{
					{
					setState(302); element();
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(308); match(1);
				setState(309); match(LPAREN);
				setState(310); type();
				setState(311); match(RPAREN);
				setState(312); match(DOT);
				setState(313); match(Identifier);
				setState(314); match(GT);
				}
				}
				break;
			case 4:
				{
				setState(316); match(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractAttributeContext extends ParserRuleContext {
		public AttachAttributeContext attachAttribute() {
			return getRuleContext(AttachAttributeContext.class,0);
		}
		public GeneralAttributeContext generalAttribute() {
			return getRuleContext(GeneralAttributeContext.class,0);
		}
		public AbstractAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAbstractAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAbstractAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAbstractAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractAttributeContext abstractAttribute() throws RecognitionException {
		AbstractAttributeContext _localctx = new AbstractAttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_abstractAttribute);
		try {
			setState(321);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(319); generalAttribute();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(320); attachAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttachAttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public AttachAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attachAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAttachAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAttachAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAttachAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttachAttributeContext attachAttribute() throws RecognitionException {
		AttachAttributeContext _localctx = new AttachAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attachAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(LPAREN);
			setState(324); type();
			setState(325); match(RPAREN);
			setState(326); match(DOT);
			setState(327); match(Identifier);
			setState(328); match(ASSIGN);
			setState(329); propertyExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralAttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public GeneralAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterGeneralAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitGeneralAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitGeneralAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralAttributeContext generalAttribute() throws RecognitionException {
		GeneralAttributeContext _localctx = new GeneralAttributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_generalAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(Identifier);
			setState(332); match(ASSIGN);
			setState(333); propertyExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkupExtensonContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AbstractAttributeContext abstractAttribute(int i) {
			return getRuleContext(AbstractAttributeContext.class,i);
		}
		public List<AbstractAttributeContext> abstractAttribute() {
			return getRuleContexts(AbstractAttributeContext.class);
		}
		public MarkupExtensonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markupExtenson; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMarkupExtenson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMarkupExtenson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMarkupExtenson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkupExtensonContext markupExtenson() throws RecognitionException {
		MarkupExtensonContext _localctx = new MarkupExtensonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_markupExtenson);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(LBRACE);
			setState(336); type();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN || _la==Identifier) {
				{
				{
				setState(337); abstractAttribute();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyExpressionContext extends ParserRuleContext {
		public MarkupExtensonContext markupExtenson() {
			return getRuleContext(MarkupExtensonContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public PropertyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPropertyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPropertyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyExpressionContext propertyExpression() throws RecognitionException {
		PropertyExpressionContext _localctx = new PropertyExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propertyExpression);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(345); match(StringLiteral);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(346); markupExtenson();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(349); annotation();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355); match(PACKAGE);
			setState(356); qualifiedName();
			setState(357); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(IMPORT);
			setState(361);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(360); match(STATIC);
				}
			}

			setState(363); qualifiedName();
			setState(366);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(364); match(DOT);
				setState(365); match(MUL);
				}
			}

			setState(368); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(399);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(370); classOrInterfaceModifier();
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376); classDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(377); classOrInterfaceModifier();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383); enumDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(384); classOrInterfaceModifier();
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(390); interfaceDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(391); classOrInterfaceModifier();
						}
						} 
					}
					setState(396);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(397); annotationTypeDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(398); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_modifier);
		int _la;
		try {
			setState(403);
			switch (_input.LA(1)) {
			case 6:
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(401); classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(407);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(405); annotation();
				}
				break;
			case 6:
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableModifier);
		try {
			setState(412);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(409); match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(410); annotation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 3);
				{
				setState(411); match(6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); match(CLASS);
			setState(415); match(Identifier);
			setState(417);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(416); typeParameters();
				}
			}

			setState(421);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(419); match(EXTENDS);
				setState(420); type();
				}
			}

			setState(425);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(423); match(IMPLEMENTS);
				setState(424); typeList();
				}
			}

			setState(427); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429); match(LT);
			setState(430); typeParameter();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431); match(COMMA);
				setState(432); typeParameter();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440); match(Identifier);
			setState(443);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(441); match(EXTENDS);
				setState(442); typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); type();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(446); match(BITAND);
				setState(447); type();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(Java8Parser.ENUM, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); match(ENUM);
			setState(454); match(Identifier);
			setState(457);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(455); match(IMPLEMENTS);
				setState(456); typeList();
				}
			}

			setState(459); match(LBRACE);
			setState(461);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(460); enumConstants();
				}
			}

			setState(464);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(463); match(COMMA);
				}
			}

			setState(467);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(466); enumBodyDeclarations();
				}
			}

			setState(469); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471); enumConstant();
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(472); match(COMMA);
					setState(473); enumConstant();
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(479); annotation();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485); match(Identifier);
			setState(487);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(486); arguments();
				}
			}

			setState(490);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(489); classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); match(SEMI);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACE - 69)) | (1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				{
				setState(493); classBodyDeclaration();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499); match(INTERFACE);
			setState(500); match(Identifier);
			setState(502);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(501); typeParameters();
				}
			}

			setState(506);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(504); match(EXTENDS);
				setState(505); typeList();
				}
			}

			setState(508); interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510); type();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(511); match(COMMA);
				setState(512); type();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518); match(LBRACE);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACE - 69)) | (1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				{
				setState(519); classBodyDeclaration();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); match(LBRACE);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (SEMI - 69)) | (1L << (LT - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				{
				setState(528); interfaceBodyDeclaration();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(548);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(537); match(STATIC);
					}
				}

				setState(540); block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(541); modifier();
						}
						} 
					}
					setState(546);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(547); memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public EventDeclarationContext eventDeclaration() {
			return getRuleContext(EventDeclarationContext.class,0);
		}
		public IndexSignatureContext indexSignature() {
			return getRuleContext(IndexSignatureContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_memberDeclaration);
		try {
			setState(562);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550); methodDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551); eventDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552); indexSignature();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(553); propertyDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(554); genericMethodDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(555); fieldDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(556); constructorDeclaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(557); genericConstructorDeclaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(558); interfaceDeclaration();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(559); annotationTypeDeclaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(560); classDeclaration();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(561); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexSignatureContext extends ParserRuleContext {
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public IndexSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIndexSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIndexSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIndexSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexSignatureContext indexSignature() throws RecognitionException {
		IndexSignatureContext _localctx = new IndexSignatureContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_indexSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564); type();
			setState(565); match(LBRACK);
			setState(566); formalParameter();
			setState(567); match(RBRACK);
			setState(568); match(LBRACE);
			setState(569); match(9);
			setState(570); match(LBRACE);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(571); blockStatement();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577); match(RBRACE);
			setState(578); match(7);
			setState(579); match(LBRACE);
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(580); blockStatement();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(586); match(RBRACE);
			setState(587); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case LPAREN:
			case Identifier:
				{
				setState(589); type();
				}
				break;
			case VOID:
				{
				setState(590); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(593);
			_la = _input.LA(1);
			if ( !(_la==5 || _la==10 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(594); formalParameters();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(595); match(LBRACK);
				setState(596); match(RBRACK);
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(602); match(THROWS);
				setState(603); qualifiedNameList();
				}
			}

			setState(608);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(606); methodBody();
				}
				break;
			case SEMI:
				{
				setState(607); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610); typeParameters();
			setState(611); methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613); match(Identifier);
			setState(614); formalParameters();
			setState(617);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(615); match(THROWS);
				setState(616); qualifiedNameList();
				}
			}

			setState(619); constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621); typeParameters();
			setState(622); constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624); type();
			setState(625); variableDeclarators();
			setState(626); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628); type();
			setState(629); match(Identifier);
			setState(630); match(LBRACE);
			setState(642);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(631); match(7);
				setState(640);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(632); match(LBRACE);
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
						{
						{
						setState(633); blockStatement();
						}
						}
						setState(638);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(639); match(RBRACE);
					}
				}

				}
			}

			setState(644); match(9);
			setState(653);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(645); match(LBRACE);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					{
					setState(646); blockStatement();
					}
					}
					setState(651);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(652); match(RBRACE);
				}
			}

			setState(655); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDeclarationContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EventDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEventDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEventDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEventDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDeclarationContext eventDeclaration() throws RecognitionException {
		EventDeclarationContext _localctx = new EventDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_eventDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657); match(8);
			setState(658); type();
			setState(659); match(Identifier);
			setState(660); match(LBRACE);
			setState(672);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(661); match(5);
				setState(670);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(662); match(LBRACE);
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
						{
						{
						setState(663); blockStatement();
						}
						}
						setState(668);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(669); match(RBRACE);
					}
				}

				}
			}

			setState(674); match(10);
			setState(683);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(675); match(LBRACE);
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					{
					setState(676); blockStatement();
					}
					}
					setState(681);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(682); match(RBRACE);
				}
			}

			setState(685); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(695);
			switch (_input.LA(1)) {
			case 6:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LPAREN:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(687); modifier();
						}
						} 
					}
					setState(692);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(693); interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(694); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_interfaceMemberDeclaration);
		try {
			setState(704);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697); constDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698); interfaceMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(699); genericInterfaceMethodDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(700); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(701); annotationTypeDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(702); classDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(703); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706); type();
			setState(707); constantDeclarator();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(708); match(COMMA);
				setState(709); constantDeclarator();
				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(715); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717); match(Identifier);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(718); match(LBRACK);
				setState(719); match(RBRACK);
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725); match(ASSIGN);
			setState(726); variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case LPAREN:
			case Identifier:
				{
				setState(728); type();
				}
				break;
			case VOID:
				{
				setState(729); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(732); match(Identifier);
			setState(733); formalParameters();
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(734); match(LBRACK);
				setState(735); match(RBRACK);
				}
				}
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(743);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(741); match(THROWS);
				setState(742); qualifiedNameList();
				}
			}

			setState(745); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747); typeParameters();
			setState(748); interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750); variableDeclarator();
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(751); match(COMMA);
				setState(752); variableDeclarator();
				}
				}
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758); variableDeclaratorId();
			setState(761);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(759); match(ASSIGN);
				setState(760); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 9) | (1L << 10))) != 0) || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(764); match(LBRACK);
				setState(765); match(RBRACK);
				}
				}
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variableInitializer);
		try {
			setState(773);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771); arrayLiteral();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772); expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(775); match(LBRACK);
			setState(787);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(776); variableInitializer();
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(777); match(COMMA);
						setState(778); variableInitializer();
						}
						} 
					}
					setState(783);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(785);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(784); match(COMMA);
					}
				}

				}
			}

			setState(789); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public PropertyNameAndValueListContext propertyNameAndValueList() {
			return getRuleContext(PropertyNameAndValueListContext.class,0);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791); match(LBRACE);
			setState(793);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IntegerLiteral - 63)) | (1L << (StringLiteral - 63)) | (1L << (Identifier - 63)))) != 0)) {
				{
				setState(792); propertyNameAndValueList();
				}
			}

			setState(796);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(795); match(COMMA);
				}
			}

			setState(798); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameAndValueListContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public PropertyNameAndValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyNameAndValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPropertyNameAndValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPropertyNameAndValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPropertyNameAndValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameAndValueListContext propertyNameAndValueList() throws RecognitionException {
		PropertyNameAndValueListContext _localctx = new PropertyNameAndValueListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_propertyNameAndValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(800); propertyAssignment();
			setState(805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(801); match(COMMA);
					setState(802); propertyAssignment();
					}
					} 
				}
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); propertyName();
			setState(809); match(COLON);
			setState(810); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_propertyName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IntegerLiteral - 63)) | (1L << (StringLiteral - 63)) | (1L << (Identifier - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySetParameterListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PropertySetParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPropertySetParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPropertySetParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPropertySetParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySetParameterListContext propertySetParameterList() throws RecognitionException {
		PropertySetParameterListContext _localctx = new PropertySetParameterListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_propertySetParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_type);
		int _la;
		try {
			int _alt;
			setState(841);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(818); classOrInterfaceType();
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(819); match(LBRACK);
						setState(820); match(RBRACK);
						}
						} 
					}
					setState(825);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(826); primitiveType();
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(827); match(LBRACK);
						setState(828); match(RBRACK);
						}
						} 
					}
					setState(833);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(834); match(LPAREN);
				setState(836);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(835); formalParameterList();
					}
				}

				setState(838); match(RPAREN);
				setState(839); match(COLON);
				setState(840); type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(843); match(Identifier);
			setState(845);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(844); typeArguments();
				}
				break;
			}
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(847); match(DOT);
					setState(848); match(Identifier);
					setState(850);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(849); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859); match(LT);
			setState(860); typeArgument();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(861); match(COMMA);
				setState(862); typeArgument();
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(868); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_typeArgument);
		int _la;
		try {
			setState(876);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case LPAREN:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(870); type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(871); match(QUESTION);
				setState(874);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(872);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(873); type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878); qualifiedName();
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(879); match(COMMA);
				setState(880); qualifiedName();
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886); match(LPAREN);
			setState(888);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(887); formalParameterList();
				}
			}

			setState(890); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(905);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(892); formalParameter();
				setState(897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(893); match(COMMA);
						setState(894); formalParameter();
						}
						} 
					}
					setState(899);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				setState(902);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(900); match(COMMA);
					setState(901); lastFormalParameter();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(904); lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6 || _la==FINAL || _la==AT) {
				{
				{
				setState(907); variableModifier();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(913); type();
			setState(914); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6 || _la==FINAL || _la==AT) {
				{
				{
				setState(916); variableModifier();
				}
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(922); type();
			setState(923); match(ELLIPSIS);
			setState(924); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(930); match(Identifier);
			setState(935);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(931); match(DOT);
					setState(932); match(Identifier);
					}
					} 
				}
				setState(937);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_literal);
		try {
			setState(946);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(938); match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(939); match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(940); match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(941); match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(942); match(BooleanLiteral);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(943); match(NullLiteral);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 7);
				{
				setState(944); arrayLiteral();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(945); objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948); match(AT);
			setState(949); annotationName();
			setState(956);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(950); match(LPAREN);
				setState(953);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(951); elementValuePairs();
					}
					break;

				case 2:
					{
					setState(952); elementValue();
					}
					break;
				}
				setState(955); match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960); elementValuePair();
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(961); match(COMMA);
				setState(962); elementValuePair();
				}
				}
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968); match(Identifier);
			setState(969); match(ASSIGN);
			setState(970); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_elementValue);
		try {
			setState(975);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(973); annotation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(974); elementValueArrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(977); match(LBRACE);
			setState(986);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(978); elementValue();
				setState(983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(979); match(COMMA);
						setState(980); elementValue();
						}
						} 
					}
					setState(985);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
			}

			setState(989);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(988); match(COMMA);
				}
			}

			setState(991); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); match(AT);
			setState(994); match(INTERFACE);
			setState(995); match(Identifier);
			setState(996); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998); match(LBRACE);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (SEMI - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				{
				setState(999); annotationTypeElementDeclaration();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1005); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(1015);
			switch (_input.LA(1)) {
			case 6:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case LPAREN:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1007); modifier();
						}
						} 
					}
					setState(1012);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				setState(1013); annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotationTypeElementRest);
		try {
			setState(1037);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case LPAREN:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017); type();
				setState(1018); annotationMethodOrConstantRest();
				setState(1019); match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021); classDeclaration();
				setState(1023);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1022); match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1025); interfaceDeclaration();
				setState(1027);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1026); match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1029); enumDeclaration();
				setState(1031);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1030); match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1033); annotationTypeDeclaration();
				setState(1035);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1034); match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_annotationMethodOrConstantRest);
		try {
			setState(1041);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1039); annotationMethodRest();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040); annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043); match(Identifier);
			setState(1044); match(LPAREN);
			setState(1045); match(RPAREN);
			setState(1047);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1046); defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051); match(DEFAULT);
			setState(1052); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054); match(LBRACE);
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(1055); blockStatement();
				}
				}
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1061); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_blockStatement);
		try {
			setState(1066);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064); statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065); methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068); localVariableDeclaration();
			setState(1069); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6 || _la==FINAL || _la==AT) {
				{
				{
				setState(1071); variableModifier();
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1077); type();
			setState(1078); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public TerminalNode ASSERT() { return getToken(Java8Parser.ASSERT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1184);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081); match(ASSERT);
				setState(1082); expression(0);
				setState(1085);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1083); match(COLON);
					setState(1084); expression(0);
					}
				}

				setState(1087); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1089); match(IF);
				setState(1090); parExpression();
				setState(1091); statement();
				setState(1094);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1092); match(ELSE);
					setState(1093); statement();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1096); match(FOR);
				setState(1097); match(LPAREN);
				setState(1098); forControl();
				setState(1099); match(RPAREN);
				setState(1100); statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1102); match(WHILE);
				setState(1103); parExpression();
				setState(1104); statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1106); match(DO);
				setState(1107); statement();
				setState(1108); match(WHILE);
				setState(1109); parExpression();
				setState(1110); match(SEMI);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1112); match(TRY);
				setState(1113); block();
				setState(1123);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1114); catchClause();
						}
						}
						setState(1117); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1120);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1119); finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1122); finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1125); match(TRY);
				setState(1126); resourceSpecification();
				setState(1127); block();
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1128); catchClause();
					}
					}
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1135);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1134); finallyBlock();
					}
				}

				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1137); match(SWITCH);
				setState(1138); parExpression();
				setState(1139); match(LBRACE);
				setState(1143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1140); switchBlockStatementGroup();
						}
						} 
					}
					setState(1145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1146); switchLabel();
					}
					}
					setState(1151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1152); match(RBRACE);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1154); match(SYNCHRONIZED);
				setState(1155); parExpression();
				setState(1156); block();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1158); match(RETURN);
				setState(1160);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1159); expression(0);
					}
				}

				setState(1162); match(SEMI);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1163); match(THROW);
				setState(1164); expression(0);
				setState(1165); match(SEMI);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1167); match(BREAK);
				setState(1169);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1168); match(Identifier);
					}
				}

				setState(1171); match(SEMI);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1172); match(CONTINUE);
				setState(1174);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1173); match(Identifier);
					}
				}

				setState(1176); match(SEMI);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1177); match(SEMI);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1178); statementExpression();
				setState(1179); match(SEMI);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1181); match(Identifier);
				setState(1182); match(COLON);
				setState(1183); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186); match(CATCH);
			setState(1187); match(LPAREN);
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6 || _la==FINAL || _la==AT) {
				{
				{
				setState(1188); variableModifier();
				}
				}
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1194); catchType();
			setState(1195); match(Identifier);
			setState(1196); match(RPAREN);
			setState(1197); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199); qualifiedName();
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1200); match(BITOR);
				setState(1201); qualifiedName();
				}
				}
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207); match(FINALLY);
			setState(1208); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210); match(LPAREN);
			setState(1211); resources();
			setState(1213);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1212); match(SEMI);
				}
			}

			setState(1215); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1217); resource();
			setState(1222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1218); match(SEMI);
					setState(1219); resource();
					}
					} 
				}
				setState(1224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6 || _la==FINAL || _la==AT) {
				{
				{
				setState(1225); variableModifier();
				}
				}
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1231); classOrInterfaceType();
			setState(1232); variableDeclaratorId();
			setState(1233); match(ASSIGN);
			setState(1234); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1236); switchLabel();
				}
				}
				setState(1239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1241); blockStatement();
				}
				}
				setState(1244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_switchLabel);
		try {
			setState(1256);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246); match(CASE);
				setState(1247); constantExpression();
				setState(1248); match(COLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250); match(CASE);
				setState(1251); enumConstantName();
				setState(1252); match(COLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1254); match(DEFAULT);
				setState(1255); match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_forControl);
		int _la;
		try {
			setState(1270);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1258); enhancedForControl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1259); forInit();
					}
				}

				setState(1262); match(SEMI);
				setState(1264);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1263); expression(0);
					}
				}

				setState(1266); match(SEMI);
				setState(1268);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1267); forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_forInit);
		try {
			setState(1274);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272); localVariableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273); expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6 || _la==FINAL || _la==AT) {
				{
				{
				setState(1276); variableModifier();
				}
				}
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1282); type();
			setState(1283); match(Identifier);
			setState(1284); match(COLON);
			setState(1285); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287); expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289); match(LPAREN);
			setState(1290); expression(0);
			setState(1291); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293); expression(0);
			setState(1298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1294); match(COMMA);
				setState(1295); expression(0);
				}
				}
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class New1ExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public New1ExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNew1Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNew1Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNew1Expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public GenericCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterGenericCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitGenericCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitGenericCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpressionContext extends ExpressionContext {
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundAssignmentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompoundAssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCompoundAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCompoundAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCompoundAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaAccessContext extends ExpressionContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitAndExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BitAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuperExpressionContext extends ExpressionContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SuperExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpression1Context extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BinaryExpression1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBinaryExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBinaryExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBinaryExpression1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAccessContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIndexerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIndexerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIndexerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstanceofExpressionContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstanceofExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInstanceofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInstanceofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInstanceofExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1306); match(LPAREN);
				setState(1307); type();
				setState(1308); match(RPAREN);
				setState(1309); expression(21);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1311);
				_la = _input.LA(1);
				if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (INC - 91)) | (1L << (DEC - 91)) | (1L << (ADD - 91)) | (1L << (SUB - 91)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1312); expression(15);
				}
				break;

			case 3:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1313);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1314); expression(14);
				}
				break;

			case 4:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1315); primary();
				}
				break;

			case 5:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1316); match(NEW);
				setState(1317); creator();
				}
				break;

			case 6:
				{
				_localctx = new LambdaAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1318); match(LPAREN);
				setState(1327);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1319); match(Identifier);
					setState(1324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1320); match(COMMA);
						setState(1321); match(Identifier);
						}
						}
						setState(1326);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1329); match(RPAREN);
				setState(1333);
				switch (_input.LA(1)) {
				case COLON:
					{
					setState(1330); match(COLON);
					setState(1331); type();
					}
					break;
				case VOID:
					{
					setState(1332); match(VOID);
					}
					break;
				case 2:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1335); match(2);
				setState(1345);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1336); expression(0);
					}
					break;

				case 2:
					{
					{
					setState(1337); match(LBRACE);
					setState(1341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
						{
						{
						setState(1338); blockStatement();
						}
						}
						setState(1343);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1344); match(RBRACE);
					}
					}
					break;
				}
				}
				break;

			case 7:
				{
				_localctx = new LambdaAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1347); match(LPAREN);
				setState(1349);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1348); formalParameterList();
					}
				}

				setState(1351); match(RPAREN);
				setState(1355);
				switch (_input.LA(1)) {
				case COLON:
					{
					setState(1352); match(COLON);
					setState(1353); type();
					}
					break;
				case VOID:
					{
					setState(1354); match(VOID);
					}
					break;
				case 2:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1357); match(2);
				setState(1367);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1358); expression(0);
					}
					break;

				case 2:
					{
					{
					setState(1359); match(LBRACE);
					setState(1363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
						{
						{
						setState(1360); blockStatement();
						}
						}
						setState(1365);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1366); match(RBRACE);
					}
					}
					break;
				}
				}
				break;

			case 8:
				{
				_localctx = new LambdaAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1369); match(Identifier);
				setState(1370); match(2);
				setState(1380);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1371); expression(0);
					}
					break;

				case 2:
					{
					{
					setState(1372); match(LBRACE);
					setState(1376);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
						{
						{
						setState(1373); blockStatement();
						}
						}
						setState(1378);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1379); match(RBRACE);
					}
					}
					break;
				}
				}
				break;

			case 9:
				{
				_localctx = new LambdaAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1382); formalParameter();
				setState(1383); match(2);
				setState(1393);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1384); expression(0);
					}
					break;

				case 2:
					{
					{
					setState(1385); match(LBRACE);
					setState(1389);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
						{
						{
						setState(1386); blockStatement();
						}
						}
						setState(1391);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1392); match(RBRACE);
					}
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1493);
					switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpression1Context(new ExpressionContext(_parentctx, _parentState, _p));
						((BinaryExpression1Context)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1397);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(1398);
						((BinaryExpression1Context)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (MUL - 95)) | (1L << (DIV - 95)) | (1L << (MOD - 95)))) != 0)) ) {
							((BinaryExpression1Context)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1399); ((BinaryExpression1Context)_localctx).right = expression(14);
						}
						break;

					case 2:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1400);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(1401);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1402); expression(13);
						}
						break;

					case 3:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1403);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(1411);
						switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
						case 1:
							{
							setState(1404); match(LT);
							setState(1405); match(LT);
							}
							break;

						case 2:
							{
							setState(1406); match(GT);
							setState(1407); match(GT);
							setState(1408); match(GT);
							}
							break;

						case 3:
							{
							setState(1409); match(GT);
							setState(1410); match(GT);
							}
							break;
						}
						setState(1413); expression(12);
						}
						break;

					case 4:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1414);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(1415);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (GT - 79)) | (1L << (LT - 79)) | (1L << (LE - 79)) | (1L << (GE - 79)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1416); expression(11);
						}
						break;

					case 5:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1417);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(1418);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1419); expression(9);
						}
						break;

					case 6:
						{
						_localctx = new BitAndExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1420);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(1421); match(BITAND);
						setState(1422); expression(8);
						}
						break;

					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1423);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(1424); match(CARET);
						setState(1425); expression(7);
						}
						break;

					case 8:
						{
						_localctx = new BitOrExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1426);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1427); match(BITOR);
						setState(1428); expression(6);
						}
						break;

					case 9:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1429);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1430); match(AND);
						setState(1431); expression(5);
						}
						break;

					case 10:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1432);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1433); match(OR);
						setState(1434); expression(4);
						}
						break;

					case 11:
						{
						_localctx = new CompoundAssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1435);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1448);
						switch (_input.LA(1)) {
						case ASSIGN:
							{
							setState(1436); match(ASSIGN);
							}
							break;
						case ADD_ASSIGN:
							{
							setState(1437); match(ADD_ASSIGN);
							}
							break;
						case SUB_ASSIGN:
							{
							setState(1438); match(SUB_ASSIGN);
							}
							break;
						case MUL_ASSIGN:
							{
							setState(1439); match(MUL_ASSIGN);
							}
							break;
						case DIV_ASSIGN:
							{
							setState(1440); match(DIV_ASSIGN);
							}
							break;
						case AND_ASSIGN:
							{
							setState(1441); match(AND_ASSIGN);
							}
							break;
						case OR_ASSIGN:
							{
							setState(1442); match(OR_ASSIGN);
							}
							break;
						case XOR_ASSIGN:
							{
							setState(1443); match(XOR_ASSIGN);
							}
							break;
						case RSHIFT_ASSIGN:
							{
							setState(1444); match(RSHIFT_ASSIGN);
							}
							break;
						case URSHIFT_ASSIGN:
							{
							setState(1445); match(URSHIFT_ASSIGN);
							}
							break;
						case LSHIFT_ASSIGN:
							{
							setState(1446); match(LSHIFT_ASSIGN);
							}
							break;
						case MOD_ASSIGN:
							{
							setState(1447); match(MOD_ASSIGN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1450); expression(1);
						}
						break;

					case 12:
						{
						_localctx = new CompoundAssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1451);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1452); match(QUESTION);
						setState(1453); expression(0);
						setState(1454); match(COLON);
						setState(1455); expression(3);
						}
						break;

					case 13:
						{
						_localctx = new FieldAccessContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1457);
						if (!(29 >= _localctx._p)) throw new FailedPredicateException(this, "29 >= $_p");
						setState(1458); match(DOT);
						setState(1459);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 9) | (1L << 10))) != 0) || _la==Identifier) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;

					case 14:
						{
						_localctx = new ThisExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1460);
						if (!(28 >= _localctx._p)) throw new FailedPredicateException(this, "28 >= $_p");
						setState(1461); match(DOT);
						setState(1462); match(THIS);
						}
						break;

					case 15:
						{
						_localctx = new New1ExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1463);
						if (!(27 >= _localctx._p)) throw new FailedPredicateException(this, "27 >= $_p");
						setState(1464); match(DOT);
						setState(1465); match(NEW);
						setState(1467);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1466); nonWildcardTypeArguments();
							}
						}

						setState(1469); innerCreator();
						}
						break;

					case 16:
						{
						_localctx = new SuperExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1470);
						if (!(26 >= _localctx._p)) throw new FailedPredicateException(this, "26 >= $_p");
						setState(1471); match(DOT);
						setState(1472); match(SUPER);
						setState(1473); superSuffix();
						}
						break;

					case 17:
						{
						_localctx = new GenericCallExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1474);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(1475); match(DOT);
						setState(1476); explicitGenericInvocation();
						}
						break;

					case 18:
						{
						_localctx = new IndexerExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1477);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(1478); match(LBRACK);
						setState(1479); expression(0);
						setState(1480); match(RBRACK);
						}
						break;

					case 19:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1482);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(1483); match(LPAREN);
						setState(1485);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
							{
							setState(1484); expressionList();
							}
						}

						setState(1487); match(RPAREN);
						}
						break;

					case 20:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1488);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(1489);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;

					case 21:
						{
						_localctx = new InstanceofExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1490);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(1491); match(INSTANCEOF);
						setState(1492); type();
						}
						break;
					}
					} 
				}
				setState(1497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_primary);
		try {
			setState(1521);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498); match(LPAREN);
				setState(1499); expression(0);
				setState(1500); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1502); match(THIS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1503); match(SUPER);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1504); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1505); match(Identifier);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1506); type();
				setState(1507); match(DOT);
				setState(1508); match(CLASS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1510); match(VOID);
				setState(1511); match(DOT);
				setState(1512); match(CLASS);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1513); nonWildcardTypeArguments();
				setState(1517);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1514); explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1515); match(THIS);
					setState(1516); arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1519); arrayLiteral();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1520); objectLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_creator);
		try {
			setState(1532);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523); nonWildcardTypeArguments();
				setState(1524); createdName();
				setState(1525); classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1527); createdName();
				setState(1530);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1528); arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1529); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_createdName);
		int _la;
		try {
			setState(1549);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1534); match(Identifier);
				setState(1536);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1535); typeArgumentsOrDiamond();
					}
				}

				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1538); match(DOT);
					setState(1539); match(Identifier);
					setState(1541);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1540); typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1548); primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551); match(Identifier);
			setState(1553);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1552); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1555); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_arrayCreatorRest);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1557); match(LBRACK);
			setState(1585);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1558); match(RBRACK);
				setState(1563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1559); match(LBRACK);
						setState(1560); match(RBRACK);
						}
						} 
					}
					setState(1565);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
				setState(1566); arrayLiteral();
				}
				break;
			case 6:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LBRACE:
			case LBRACK:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				{
				setState(1567); expression(0);
				setState(1568); match(RBRACK);
				setState(1575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1569); match(LBRACK);
						setState(1570); expression(0);
						setState(1571); match(RBRACK);
						}
						} 
					}
					setState(1577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1578); match(LBRACK);
						setState(1579); match(RBRACK);
						}
						} 
					}
					setState(1584);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587); arguments();
			setState(1589);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1588); classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591); nonWildcardTypeArguments();
			setState(1592); explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594); match(LT);
			setState(1595); typeList();
			setState(1596); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_typeArgumentsOrDiamond);
		try {
			setState(1601);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1598); match(LT);
				setState(1599); match(GT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1600); typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1606);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1603); match(LT);
				setState(1604); match(GT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605); nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_superSuffix);
		try {
			setState(1614);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609); match(DOT);
				setState(1610); match(Identifier);
				setState(1612);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1611); arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1620);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1616); match(SUPER);
				setState(1617); superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618); match(Identifier);
				setState(1619); arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622); match(LPAREN);
			setState(1624);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1623); expressionList();
				}
			}

			setState(1626); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 104: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18: return 23 >= _localctx._p;

		case 19: return 16 >= _localctx._p;

		case 16: return 25 >= _localctx._p;

		case 17: return 24 >= _localctx._p;

		case 20: return 9 >= _localctx._p;

		case 3: return 10 >= _localctx._p;

		case 2: return 11 >= _localctx._p;

		case 1: return 12 >= _localctx._p;

		case 0: return 13 >= _localctx._p;

		case 7: return 5 >= _localctx._p;

		case 6: return 6 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 4: return 8 >= _localctx._p;

		case 11: return 2 >= _localctx._p;

		case 10: return 1 >= _localctx._p;

		case 9: return 3 >= _localctx._p;

		case 8: return 4 >= _localctx._p;

		case 15: return 26 >= _localctx._p;

		case 14: return 27 >= _localctx._p;

		case 13: return 28 >= _localctx._p;

		case 12: return 29 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3w\u065f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\3\2\5\2\u00f0\n\2\3\2\7\2\u00f3\n\2\f\2\16\2\u00f6\13\2\3\2\3\2\3"+
		"\2\3\2\5\2\u00fc\n\2\3\2\7\2\u00ff\n\2\f\2\16\2\u0102\13\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3\u010b\n\3\3\3\5\3\u010e\n\3\3\4\3\4\5\4\u0112\n\4"+
		"\3\5\3\5\3\5\7\5\u0117\n\5\f\5\16\5\u011a\13\5\3\5\3\5\7\5\u011e\n\5\f"+
		"\5\16\5\u0121\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u0128\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u0132\n\6\f\6\16\6\u0135\13\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0140\n\6\3\7\3\7\5\7\u0144\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0155\n\n\f\n\16\n\u0158"+
		"\13\n\3\n\3\n\3\13\3\13\5\13\u015e\n\13\3\f\7\f\u0161\n\f\f\f\16\f\u0164"+
		"\13\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u016c\n\r\3\r\3\r\3\r\5\r\u0171\n\r"+
		"\3\r\3\r\3\16\7\16\u0176\n\16\f\16\16\16\u0179\13\16\3\16\3\16\7\16\u017d"+
		"\n\16\f\16\16\16\u0180\13\16\3\16\3\16\7\16\u0184\n\16\f\16\16\16\u0187"+
		"\13\16\3\16\3\16\7\16\u018b\n\16\f\16\16\16\u018e\13\16\3\16\3\16\5\16"+
		"\u0192\n\16\3\17\3\17\5\17\u0196\n\17\3\20\3\20\5\20\u019a\n\20\3\21\3"+
		"\21\3\21\5\21\u019f\n\21\3\22\3\22\3\22\5\22\u01a4\n\22\3\22\3\22\5\22"+
		"\u01a8\n\22\3\22\3\22\5\22\u01ac\n\22\3\22\3\22\3\23\3\23\3\23\3\23\7"+
		"\23\u01b4\n\23\f\23\16\23\u01b7\13\23\3\23\3\23\3\24\3\24\3\24\5\24\u01be"+
		"\n\24\3\25\3\25\3\25\7\25\u01c3\n\25\f\25\16\25\u01c6\13\25\3\26\3\26"+
		"\3\26\3\26\5\26\u01cc\n\26\3\26\3\26\5\26\u01d0\n\26\3\26\5\26\u01d3\n"+
		"\26\3\26\5\26\u01d6\n\26\3\26\3\26\3\27\3\27\3\27\7\27\u01dd\n\27\f\27"+
		"\16\27\u01e0\13\27\3\30\7\30\u01e3\n\30\f\30\16\30\u01e6\13\30\3\30\3"+
		"\30\5\30\u01ea\n\30\3\30\5\30\u01ed\n\30\3\31\3\31\7\31\u01f1\n\31\f\31"+
		"\16\31\u01f4\13\31\3\32\3\32\3\32\5\32\u01f9\n\32\3\32\3\32\5\32\u01fd"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\7\33\u0204\n\33\f\33\16\33\u0207\13\33"+
		"\3\34\3\34\7\34\u020b\n\34\f\34\16\34\u020e\13\34\3\34\3\34\3\35\3\35"+
		"\7\35\u0214\n\35\f\35\16\35\u0217\13\35\3\35\3\35\3\36\3\36\5\36\u021d"+
		"\n\36\3\36\3\36\7\36\u0221\n\36\f\36\16\36\u0224\13\36\3\36\5\36\u0227"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0235\n\37\3 \3 \3 \3 \3 \3 \3 \3 \7 \u023f\n \f \16 \u0242\13 \3 \3"+
		" \3 \3 \7 \u0248\n \f \16 \u024b\13 \3 \3 \3 \3!\3!\5!\u0252\n!\3!\3!"+
		"\3!\3!\7!\u0258\n!\f!\16!\u025b\13!\3!\3!\5!\u025f\n!\3!\3!\5!\u0263\n"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\5#\u026c\n#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\7&\u027d\n&\f&\16&\u0280\13&\3&\5&\u0283\n&\5&\u0285\n&"+
		"\3&\3&\3&\7&\u028a\n&\f&\16&\u028d\13&\3&\5&\u0290\n&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\7\'\u029b\n\'\f\'\16\'\u029e\13\'\3\'\5\'\u02a1\n\'"+
		"\5\'\u02a3\n\'\3\'\3\'\3\'\7\'\u02a8\n\'\f\'\16\'\u02ab\13\'\3\'\5\'\u02ae"+
		"\n\'\3\'\3\'\3(\7(\u02b3\n(\f(\16(\u02b6\13(\3(\3(\5(\u02ba\n(\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u02c3\n)\3*\3*\3*\3*\7*\u02c9\n*\f*\16*\u02cc\13*\3*"+
		"\3*\3+\3+\3+\7+\u02d3\n+\f+\16+\u02d6\13+\3+\3+\3+\3,\3,\5,\u02dd\n,\3"+
		",\3,\3,\3,\7,\u02e3\n,\f,\16,\u02e6\13,\3,\3,\5,\u02ea\n,\3,\3,\3-\3-"+
		"\3-\3.\3.\3.\7.\u02f4\n.\f.\16.\u02f7\13.\3/\3/\3/\5/\u02fc\n/\3\60\3"+
		"\60\3\60\7\60\u0301\n\60\f\60\16\60\u0304\13\60\3\61\3\61\5\61\u0308\n"+
		"\61\3\62\3\62\3\62\3\62\7\62\u030e\n\62\f\62\16\62\u0311\13\62\3\62\5"+
		"\62\u0314\n\62\5\62\u0316\n\62\3\62\3\62\3\63\3\63\5\63\u031c\n\63\3\63"+
		"\5\63\u031f\n\63\3\63\3\63\3\64\3\64\3\64\7\64\u0326\n\64\f\64\16\64\u0329"+
		"\13\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\79\u0338"+
		"\n9\f9\169\u033b\139\39\39\39\79\u0340\n9\f9\169\u0343\139\39\39\59\u0347"+
		"\n9\39\39\39\59\u034c\n9\3:\3:\5:\u0350\n:\3:\3:\3:\5:\u0355\n:\7:\u0357"+
		"\n:\f:\16:\u035a\13:\3;\3;\3<\3<\3<\3<\7<\u0362\n<\f<\16<\u0365\13<\3"+
		"<\3<\3=\3=\3=\3=\5=\u036d\n=\5=\u036f\n=\3>\3>\3>\7>\u0374\n>\f>\16>\u0377"+
		"\13>\3?\3?\5?\u037b\n?\3?\3?\3@\3@\3@\7@\u0382\n@\f@\16@\u0385\13@\3@"+
		"\3@\5@\u0389\n@\3@\5@\u038c\n@\3A\7A\u038f\nA\fA\16A\u0392\13A\3A\3A\3"+
		"A\3B\7B\u0398\nB\fB\16B\u039b\13B\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E\3E\7E"+
		"\u03a8\nE\fE\16E\u03ab\13E\3F\3F\3F\3F\3F\3F\3F\3F\5F\u03b5\nF\3G\3G\3"+
		"G\3G\3G\5G\u03bc\nG\3G\5G\u03bf\nG\3H\3H\3I\3I\3I\7I\u03c6\nI\fI\16I\u03c9"+
		"\13I\3J\3J\3J\3J\3K\3K\3K\5K\u03d2\nK\3L\3L\3L\3L\7L\u03d8\nL\fL\16L\u03db"+
		"\13L\5L\u03dd\nL\3L\5L\u03e0\nL\3L\3L\3M\3M\3M\3M\3M\3N\3N\7N\u03eb\n"+
		"N\fN\16N\u03ee\13N\3N\3N\3O\7O\u03f3\nO\fO\16O\u03f6\13O\3O\3O\5O\u03fa"+
		"\nO\3P\3P\3P\3P\3P\3P\5P\u0402\nP\3P\3P\5P\u0406\nP\3P\3P\5P\u040a\nP"+
		"\3P\3P\5P\u040e\nP\5P\u0410\nP\3Q\3Q\5Q\u0414\nQ\3R\3R\3R\3R\5R\u041a"+
		"\nR\3S\3S\3T\3T\3T\3U\3U\7U\u0423\nU\fU\16U\u0426\13U\3U\3U\3V\3V\3V\5"+
		"V\u042d\nV\3W\3W\3W\3X\7X\u0433\nX\fX\16X\u0436\13X\3X\3X\3X\3Y\3Y\3Y"+
		"\3Y\3Y\5Y\u0440\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0449\nY\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\6Y\u045e\nY\rY\16Y\u045f\3Y\5"+
		"Y\u0463\nY\3Y\5Y\u0466\nY\3Y\3Y\3Y\3Y\7Y\u046c\nY\fY\16Y\u046f\13Y\3Y"+
		"\5Y\u0472\nY\3Y\3Y\3Y\3Y\7Y\u0478\nY\fY\16Y\u047b\13Y\3Y\7Y\u047e\nY\f"+
		"Y\16Y\u0481\13Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u048b\nY\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\5Y\u0494\nY\3Y\3Y\3Y\5Y\u0499\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04a3"+
		"\nY\3Z\3Z\3Z\7Z\u04a8\nZ\fZ\16Z\u04ab\13Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\7[\u04b5"+
		"\n[\f[\16[\u04b8\13[\3\\\3\\\3\\\3]\3]\3]\5]\u04c0\n]\3]\3]\3^\3^\3^\7"+
		"^\u04c7\n^\f^\16^\u04ca\13^\3_\7_\u04cd\n_\f_\16_\u04d0\13_\3_\3_\3_\3"+
		"_\3_\3`\6`\u04d8\n`\r`\16`\u04d9\3`\6`\u04dd\n`\r`\16`\u04de\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\5a\u04eb\na\3b\3b\5b\u04ef\nb\3b\3b\5b\u04f3\nb"+
		"\3b\3b\5b\u04f7\nb\5b\u04f9\nb\3c\3c\5c\u04fd\nc\3d\7d\u0500\nd\fd\16"+
		"d\u0503\13d\3d\3d\3d\3d\3d\3e\3e\3f\3f\3f\3f\3g\3g\3g\7g\u0513\ng\fg\16"+
		"g\u0516\13g\3h\3h\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\7j\u052d\nj\fj\16j\u0530\13j\5j\u0532\nj\3j\3j\3j\3j\5j\u0538\nj"+
		"\3j\3j\3j\3j\7j\u053e\nj\fj\16j\u0541\13j\3j\5j\u0544\nj\3j\3j\5j\u0548"+
		"\nj\3j\3j\3j\3j\5j\u054e\nj\3j\3j\3j\3j\7j\u0554\nj\fj\16j\u0557\13j\3"+
		"j\5j\u055a\nj\3j\3j\3j\3j\3j\7j\u0561\nj\fj\16j\u0564\13j\3j\5j\u0567"+
		"\nj\3j\3j\3j\3j\3j\7j\u056e\nj\fj\16j\u0571\13j\3j\5j\u0574\nj\5j\u0576"+
		"\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0586\nj\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\5j\u05ab\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\5j\u05be\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\5j\u05d0\nj\3j\3j\3j\3j\3j\3j\7j\u05d8\nj\fj\16j\u05db\13j\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u05f0\nk\3"+
		"k\3k\5k\u05f4\nk\3l\3l\3l\3l\3l\3l\3l\5l\u05fd\nl\5l\u05ff\nl\3m\3m\5"+
		"m\u0603\nm\3m\3m\3m\5m\u0608\nm\7m\u060a\nm\fm\16m\u060d\13m\3m\5m\u0610"+
		"\nm\3n\3n\5n\u0614\nn\3n\3n\3o\3o\3o\3o\7o\u061c\no\fo\16o\u061f\13o\3"+
		"o\3o\3o\3o\3o\3o\3o\7o\u0628\no\fo\16o\u062b\13o\3o\3o\7o\u062f\no\fo"+
		"\16o\u0632\13o\5o\u0634\no\3p\3p\5p\u0638\np\3q\3q\3q\3r\3r\3r\3r\3s\3"+
		"s\3s\5s\u0644\ns\3t\3t\3t\5t\u0649\nt\3u\3u\3u\3u\5u\u064f\nu\5u\u0651"+
		"\nu\3v\3v\3v\3v\5v\u0657\nv\3w\3w\5w\u065b\nw\3w\3w\3w\2x\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\2\20\5\2"+
		"\7\7\f\frr\6\2++\67\67;;>>\7\2\b\b\16\16\37\37.\60\63\64\6\2\7\7\t\t\13"+
		"\frr\5\2AAEErr\n\2\20\20\22\22\25\25\33\33!!((**\62\62\4\2\36\36\65\65"+
		"\3\2]`\3\2ST\4\2abff\3\2_`\4\2QRXY\4\2WWZZ\3\2]^\u070a\2\u00ef\3\2\2\2"+
		"\4\u010d\3\2\2\2\6\u0111\3\2\2\2\b\u0113\3\2\2\2\n\u0129\3\2\2\2\f\u0143"+
		"\3\2\2\2\16\u0145\3\2\2\2\20\u014d\3\2\2\2\22\u0151\3\2\2\2\24\u015d\3"+
		"\2\2\2\26\u0162\3\2\2\2\30\u0169\3\2\2\2\32\u0191\3\2\2\2\34\u0195\3\2"+
		"\2\2\36\u0199\3\2\2\2 \u019e\3\2\2\2\"\u01a0\3\2\2\2$\u01af\3\2\2\2&\u01ba"+
		"\3\2\2\2(\u01bf\3\2\2\2*\u01c7\3\2\2\2,\u01d9\3\2\2\2.\u01e4\3\2\2\2\60"+
		"\u01ee\3\2\2\2\62\u01f5\3\2\2\2\64\u0200\3\2\2\2\66\u0208\3\2\2\28\u0211"+
		"\3\2\2\2:\u0226\3\2\2\2<\u0234\3\2\2\2>\u0236\3\2\2\2@\u0251\3\2\2\2B"+
		"\u0264\3\2\2\2D\u0267\3\2\2\2F\u026f\3\2\2\2H\u0272\3\2\2\2J\u0276\3\2"+
		"\2\2L\u0293\3\2\2\2N\u02b9\3\2\2\2P\u02c2\3\2\2\2R\u02c4\3\2\2\2T\u02cf"+
		"\3\2\2\2V\u02dc\3\2\2\2X\u02ed\3\2\2\2Z\u02f0\3\2\2\2\\\u02f8\3\2\2\2"+
		"^\u02fd\3\2\2\2`\u0307\3\2\2\2b\u0309\3\2\2\2d\u0319\3\2\2\2f\u0322\3"+
		"\2\2\2h\u032a\3\2\2\2j\u032e\3\2\2\2l\u0330\3\2\2\2n\u0332\3\2\2\2p\u034b"+
		"\3\2\2\2r\u034d\3\2\2\2t\u035b\3\2\2\2v\u035d\3\2\2\2x\u036e\3\2\2\2z"+
		"\u0370\3\2\2\2|\u0378\3\2\2\2~\u038b\3\2\2\2\u0080\u0390\3\2\2\2\u0082"+
		"\u0399\3\2\2\2\u0084\u03a0\3\2\2\2\u0086\u03a2\3\2\2\2\u0088\u03a4\3\2"+
		"\2\2\u008a\u03b4\3\2\2\2\u008c\u03b6\3\2\2\2\u008e\u03c0\3\2\2\2\u0090"+
		"\u03c2\3\2\2\2\u0092\u03ca\3\2\2\2\u0094\u03d1\3\2\2\2\u0096\u03d3\3\2"+
		"\2\2\u0098\u03e3\3\2\2\2\u009a\u03e8\3\2\2\2\u009c\u03f9\3\2\2\2\u009e"+
		"\u040f\3\2\2\2\u00a0\u0413\3\2\2\2\u00a2\u0415\3\2\2\2\u00a4\u041b\3\2"+
		"\2\2\u00a6\u041d\3\2\2\2\u00a8\u0420\3\2\2\2\u00aa\u042c\3\2\2\2\u00ac"+
		"\u042e\3\2\2\2\u00ae\u0434\3\2\2\2\u00b0\u04a2\3\2\2\2\u00b2\u04a4\3\2"+
		"\2\2\u00b4\u04b1\3\2\2\2\u00b6\u04b9\3\2\2\2\u00b8\u04bc\3\2\2\2\u00ba"+
		"\u04c3\3\2\2\2\u00bc\u04ce\3\2\2\2\u00be\u04d7\3\2\2\2\u00c0\u04ea\3\2"+
		"\2\2\u00c2\u04f8\3\2\2\2\u00c4\u04fc\3\2\2\2\u00c6\u0501\3\2\2\2\u00c8"+
		"\u0509\3\2\2\2\u00ca\u050b\3\2\2\2\u00cc\u050f\3\2\2\2\u00ce\u0517\3\2"+
		"\2\2\u00d0\u0519\3\2\2\2\u00d2\u0575\3\2\2\2\u00d4\u05f3\3\2\2\2\u00d6"+
		"\u05fe\3\2\2\2\u00d8\u060f\3\2\2\2\u00da\u0611\3\2\2\2\u00dc\u0617\3\2"+
		"\2\2\u00de\u0635\3\2\2\2\u00e0\u0639\3\2\2\2\u00e2\u063c\3\2\2\2\u00e4"+
		"\u0643\3\2\2\2\u00e6\u0648\3\2\2\2\u00e8\u0650\3\2\2\2\u00ea\u0656\3\2"+
		"\2\2\u00ec\u0658\3\2\2\2\u00ee\u00f0\5\26\f\2\u00ef\u00ee\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\5\30\r\2\u00f2\u00f1\3"+
		"\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\5\2\2\u00f8\u00f9\7r"+
		"\2\2\u00f9\u00fb\7I\2\2\u00fa\u00fc\5\b\5\2\u00fb\u00fa\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\5\4\3\2\u00fe\u00fd\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7J\2\2\u0104\u0105\7\2"+
		"\2\3\u0105\3\3\2\2\2\u0106\u010e\5\u00acW\2\u0107\u010e\5\u00b0Y\2\u0108"+
		"\u010e\5\32\16\2\u0109\u010b\7\b\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\5@!\2\u010d\u0106\3\2\2\2\u010d"+
		"\u0107\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u010a\3\2\2\2\u010e\5\3\2\2\2"+
		"\u010f\u0112\5\b\5\2\u0110\u0112\5\n\6\2\u0111\u010f\3\2\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\7\3\2\2\2\u0113\u0114\7R\2\2\u0114\u0118\5p9\2\u0115\u0117"+
		"\5\f\7\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u0127\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011f\7Q"+
		"\2\2\u011c\u011e\5\6\4\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0123\7\3\2\2\u0123\u0124\5p9\2\u0124\u0125\7Q\2\2\u0125\u0128"+
		"\3\2\2\2\u0126\u0128\7\6\2\2\u0127\u011b\3\2\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\t\3\2\2\2\u0129\u012a\7R\2\2\u012a\u012b\7G\2\2\u012b\u012c\5p9\2\u012c"+
		"\u012d\7H\2\2\u012d\u012e\7O\2\2\u012e\u013f\t\2\2\2\u012f\u0133\7Q\2"+
		"\2\u0130\u0132\5\6\4\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\7\3\2\2\u0137\u0138\7G\2\2\u0138\u0139\5p9\2\u0139\u013a\7H\2\2"+
		"\u013a\u013b\7O\2\2\u013b\u013c\7r\2\2\u013c\u013d\7Q\2\2\u013d\u0140"+
		"\3\2\2\2\u013e\u0140\7\6\2\2\u013f\u012f\3\2\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\13\3\2\2\2\u0141\u0144\5\20\t\2\u0142\u0144\5\16\b\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0142\3\2\2\2\u0144\r\3\2\2\2\u0145\u0146\7G\2\2\u0146\u0147"+
		"\5p9\2\u0147\u0148\7H\2\2\u0148\u0149\7O\2\2\u0149\u014a\7r\2\2\u014a"+
		"\u014b\7P\2\2\u014b\u014c\5\24\13\2\u014c\17\3\2\2\2\u014d\u014e\7r\2"+
		"\2\u014e\u014f\7P\2\2\u014f\u0150\5\24\13\2\u0150\21\3\2\2\2\u0151\u0152"+
		"\7I\2\2\u0152\u0156\5p9\2\u0153\u0155\5\f\7\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7J\2\2\u015a\23\3\2\2\2\u015b\u015e"+
		"\7E\2\2\u015c\u015e\5\22\n\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\25\3\2\2\2\u015f\u0161\5\u008cG\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0166\7-\2\2\u0166\u0167\5\u0088E\2\u0167\u0168\7"+
		"M\2\2\u0168\27\3\2\2\2\u0169\u016b\7&\2\2\u016a\u016c\7\63\2\2\u016b\u016a"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0170\5\u0088E"+
		"\2\u016e\u016f\7O\2\2\u016f\u0171\7a\2\2\u0170\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7M\2\2\u0173\31\3\2\2\2\u0174"+
		"\u0176\5\36\20\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u0192\5\"\22\2\u017b\u017d\5\36\20\2\u017c\u017b\3\2\2\2\u017d\u0180"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0192\5*\26\2\u0182\u0184\5\36\20\2\u0183\u0182\3"+
		"\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0192\5\62\32\2\u0189\u018b\5"+
		"\36\20\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0192\5\u0098"+
		"M\2\u0190\u0192\7M\2\2\u0191\u0177\3\2\2\2\u0191\u017e\3\2\2\2\u0191\u0185"+
		"\3\2\2\2\u0191\u018c\3\2\2\2\u0191\u0190\3\2\2\2\u0192\33\3\2\2\2\u0193"+
		"\u0196\5\36\20\2\u0194\u0196\t\3\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3"+
		"\2\2\2\u0196\35\3\2\2\2\u0197\u019a\5\u008cG\2\u0198\u019a\t\4\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a\37\3\2\2\2\u019b\u019f\7\37\2"+
		"\2\u019c\u019f\5\u008cG\2\u019d\u019f\7\b\2\2\u019e\u019b\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f!\3\2\2\2\u01a0\u01a1\7\26\2\2"+
		"\u01a1\u01a3\7r\2\2\u01a2\u01a4\5$\23\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a6\7\36\2\2\u01a6\u01a8\5p9\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01aa\7%"+
		"\2\2\u01aa\u01ac\5\64\33\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\5\66\34\2\u01ae#\3\2\2\2\u01af\u01b0\7R\2\2"+
		"\u01b0\u01b5\5&\24\2\u01b1\u01b2\7N\2\2\u01b2\u01b4\5&\24\2\u01b3\u01b1"+
		"\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7Q\2\2\u01b9%\3\2\2\2\u01ba"+
		"\u01bd\7r\2\2\u01bb\u01bc\7\36\2\2\u01bc\u01be\5(\25\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\'\3\2\2\2\u01bf\u01c4\5p9\2\u01c0\u01c1"+
		"\7c\2\2\u01c1\u01c3\5p9\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5)\3\2\2\2\u01c6\u01c4\3\2\2\2"+
		"\u01c7\u01c8\7\35\2\2\u01c8\u01cb\7r\2\2\u01c9\u01ca\7%\2\2\u01ca\u01cc"+
		"\5\64\33\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2"+
		"\u01cd\u01cf\7I\2\2\u01ce\u01d0\5,\27\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01d3\7N\2\2\u01d2\u01d1\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\5\60\31\2\u01d5\u01d4\3"+
		"\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\7J\2\2\u01d8"+
		"+\3\2\2\2\u01d9\u01de\5.\30\2\u01da\u01db\7N\2\2\u01db\u01dd\5.\30\2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df-\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e3\5\u008cG\2\u01e2\u01e1"+
		"\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e9\7r\2\2\u01e8\u01ea\5\u00ec"+
		"w\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb"+
		"\u01ed\5\66\34\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed/\3\2\2"+
		"\2\u01ee\u01f2\7M\2\2\u01ef\u01f1\5:\36\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\61\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f5\u01f6\7)\2\2\u01f6\u01f8\7r\2\2\u01f7\u01f9\5$\23"+
		"\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01fb"+
		"\7\36\2\2\u01fb\u01fd\5\64\33\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2"+
		"\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\58\35\2\u01ff\63\3\2\2\2\u0200\u0205"+
		"\5p9\2\u0201\u0202\7N\2\2\u0202\u0204\5p9\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\65\3\2\2"+
		"\2\u0207\u0205\3\2\2\2\u0208\u020c\7I\2\2\u0209\u020b\5:\36\2\u020a\u0209"+
		"\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7J\2\2\u0210\67\3\2\2\2"+
		"\u0211\u0215\7I\2\2\u0212\u0214\5N(\2\u0213\u0212\3\2\2\2\u0214\u0217"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0218\u0219\7J\2\2\u02199\3\2\2\2\u021a\u0227\7M\2\2\u021b"+
		"\u021d\7\63\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3"+
		"\2\2\2\u021e\u0227\5\u00a8U\2\u021f\u0221\5\34\17\2\u0220\u021f\3\2\2"+
		"\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225"+
		"\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0227\5<\37\2\u0226\u021a\3\2\2\2\u0226"+
		"\u021c\3\2\2\2\u0226\u0222\3\2\2\2\u0227;\3\2\2\2\u0228\u0235\5@!\2\u0229"+
		"\u0235\5L\'\2\u022a\u0235\5> \2\u022b\u0235\5J&\2\u022c\u0235\5B\"\2\u022d"+
		"\u0235\5H%\2\u022e\u0235\5D#\2\u022f\u0235\5F$\2\u0230\u0235\5\62\32\2"+
		"\u0231\u0235\5\u0098M\2\u0232\u0235\5\"\22\2\u0233\u0235\5*\26\2\u0234"+
		"\u0228\3\2\2\2\u0234\u0229\3\2\2\2\u0234\u022a\3\2\2\2\u0234\u022b\3\2"+
		"\2\2\u0234\u022c\3\2\2\2\u0234\u022d\3\2\2\2\u0234\u022e\3\2\2\2\u0234"+
		"\u022f\3\2\2\2\u0234\u0230\3\2\2\2\u0234\u0231\3\2\2\2\u0234\u0232\3\2"+
		"\2\2\u0234\u0233\3\2\2\2\u0235=\3\2\2\2\u0236\u0237\5p9\2\u0237\u0238"+
		"\7K\2\2\u0238\u0239\5\u0080A\2\u0239\u023a\7L\2\2\u023a\u023b\7I\2\2\u023b"+
		"\u023c\7\13\2\2\u023c\u0240\7I\2\2\u023d\u023f\5\u00aaV\2\u023e\u023d"+
		"\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\7J\2\2\u0244\u0245\7\t"+
		"\2\2\u0245\u0249\7I\2\2\u0246\u0248\5\u00aaV\2\u0247\u0246\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2"+
		"\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7J\2\2\u024d\u024e\7J\2\2\u024e?"+
		"\3\2\2\2\u024f\u0252\5p9\2\u0250\u0252\7=\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\t\2\2\2\u0254\u0259\5|"+
		"?\2\u0255\u0256\7K\2\2\u0256\u0258\7L\2\2\u0257\u0255\3\2\2\2\u0258\u025b"+
		"\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025e\3\2\2\2\u025b"+
		"\u0259\3\2\2\2\u025c\u025d\7:\2\2\u025d\u025f\5z>\2\u025e\u025c\3\2\2"+
		"\2\u025e\u025f\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u0263\5\u0084C\2\u0261"+
		"\u0263\7M\2\2\u0262\u0260\3\2\2\2\u0262\u0261\3\2\2\2\u0263A\3\2\2\2\u0264"+
		"\u0265\5$\23\2\u0265\u0266\5@!\2\u0266C\3\2\2\2\u0267\u0268\7r\2\2\u0268"+
		"\u026b\5|?\2\u0269\u026a\7:\2\2\u026a\u026c\5z>\2\u026b\u0269\3\2\2\2"+
		"\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\5\u0086D\2\u026e"+
		"E\3\2\2\2\u026f\u0270\5$\23\2\u0270\u0271\5D#\2\u0271G\3\2\2\2\u0272\u0273"+
		"\5p9\2\u0273\u0274\5Z.\2\u0274\u0275\7M\2\2\u0275I\3\2\2\2\u0276\u0277"+
		"\5p9\2\u0277\u0278\7r\2\2\u0278\u0284\7I\2\2\u0279\u0282\7\t\2\2\u027a"+
		"\u027e\7I\2\2\u027b\u027d\5\u00aaV\2\u027c\u027b\3\2\2\2\u027d\u0280\3"+
		"\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0281\u0283\7J\2\2\u0282\u027a\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283\u0285\3\2\2\2\u0284\u0279\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u028f\7\13\2\2\u0287\u028b\7I\2\2\u0288\u028a\5\u00aa"+
		"V\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0290\7J"+
		"\2\2\u028f\u0287\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0292\7J\2\2\u0292K\3\2\2\2\u0293\u0294\7\n\2\2\u0294\u0295\5p9\2\u0295"+
		"\u0296\7r\2\2\u0296\u02a2\7I\2\2\u0297\u02a0\7\7\2\2\u0298\u029c\7I\2"+
		"\2\u0299\u029b\5\u00aaV\2\u029a\u0299\3\2\2\2\u029b\u029e\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u029c\3\2"+
		"\2\2\u029f\u02a1\7J\2\2\u02a0\u0298\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a3\3\2\2\2\u02a2\u0297\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2"+
		"\2\2\u02a4\u02ad\7\f\2\2\u02a5\u02a9\7I\2\2\u02a6\u02a8\5\u00aaV\2\u02a7"+
		"\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ae\7J\2\2\u02ad"+
		"\u02a5\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\7J"+
		"\2\2\u02b0M\3\2\2\2\u02b1\u02b3\5\34\17\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6"+
		"\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b7\u02ba\5P)\2\u02b8\u02ba\7M\2\2\u02b9\u02b4\3\2\2"+
		"\2\u02b9\u02b8\3\2\2\2\u02baO\3\2\2\2\u02bb\u02c3\5R*\2\u02bc\u02c3\5"+
		"V,\2\u02bd\u02c3\5X-\2\u02be\u02c3\5\62\32\2\u02bf\u02c3\5\u0098M\2\u02c0"+
		"\u02c3\5\"\22\2\u02c1\u02c3\5*\26\2\u02c2\u02bb\3\2\2\2\u02c2\u02bc\3"+
		"\2\2\2\u02c2\u02bd\3\2\2\2\u02c2\u02be\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c2"+
		"\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3Q\3\2\2\2\u02c4\u02c5\5p9\2\u02c5"+
		"\u02ca\5T+\2\u02c6\u02c7\7N\2\2\u02c7\u02c9\5T+\2\u02c8\u02c6\3\2\2\2"+
		"\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd"+
		"\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02ce\7M\2\2\u02ceS\3\2\2\2\u02cf\u02d4"+
		"\7r\2\2\u02d0\u02d1\7K\2\2\u02d1\u02d3\7L\2\2\u02d2\u02d0\3\2\2\2\u02d3"+
		"\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2"+
		"\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\7P\2\2\u02d8\u02d9\5`\61\2\u02d9"+
		"U\3\2\2\2\u02da\u02dd\5p9\2\u02db\u02dd\7=\2\2\u02dc\u02da\3\2\2\2\u02dc"+
		"\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\7r\2\2\u02df\u02e4\5|?"+
		"\2\u02e0\u02e1\7K\2\2\u02e1\u02e3\7L\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6"+
		"\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e9\3\2\2\2\u02e6"+
		"\u02e4\3\2\2\2\u02e7\u02e8\7:\2\2\u02e8\u02ea\5z>\2\u02e9\u02e7\3\2\2"+
		"\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\7M\2\2\u02ecW\3"+
		"\2\2\2\u02ed\u02ee\5$\23\2\u02ee\u02ef\5V,\2\u02efY\3\2\2\2\u02f0\u02f5"+
		"\5\\/\2\u02f1\u02f2\7N\2\2\u02f2\u02f4\5\\/\2\u02f3\u02f1\3\2\2\2\u02f4"+
		"\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6[\3\2\2\2"+
		"\u02f7\u02f5\3\2\2\2\u02f8\u02fb\5^\60\2\u02f9\u02fa\7P\2\2\u02fa\u02fc"+
		"\5`\61\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc]\3\2\2\2\u02fd"+
		"\u0302\t\5\2\2\u02fe\u02ff\7K\2\2\u02ff\u0301\7L\2\2\u0300\u02fe\3\2\2"+
		"\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303_"+
		"\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0308\5b\62\2\u0306\u0308\5\u00d2j"+
		"\2\u0307\u0305\3\2\2\2\u0307\u0306\3\2\2\2\u0308a\3\2\2\2\u0309\u0315"+
		"\7K\2\2\u030a\u030f\5`\61\2\u030b\u030c\7N\2\2\u030c\u030e\5`\61\2\u030d"+
		"\u030b\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2"+
		"\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0314\7N\2\2\u0313"+
		"\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315\u030a\3\2"+
		"\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7L\2\2\u0318"+
		"c\3\2\2\2\u0319\u031b\7I\2\2\u031a\u031c\5f\64\2\u031b\u031a\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u031f\7N\2\2\u031e\u031d\3\2"+
		"\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\7J\2\2\u0321"+
		"e\3\2\2\2\u0322\u0327\5h\65\2\u0323\u0324\7N\2\2\u0324\u0326\5h\65\2\u0325"+
		"\u0323\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2"+
		"\2\2\u0328g\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032b\5j\66\2\u032b\u032c"+
		"\7V\2\2\u032c\u032d\5\u00d2j\2\u032di\3\2\2\2\u032e\u032f\t\6\2\2\u032f"+
		"k\3\2\2\2\u0330\u0331\7r\2\2\u0331m\3\2\2\2\u0332\u0333\7r\2\2\u0333o"+
		"\3\2\2\2\u0334\u0339\5r:\2\u0335\u0336\7K\2\2\u0336\u0338\7L\2\2\u0337"+
		"\u0335\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2"+
		"\2\2\u033a\u034c\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u0341\5t;\2\u033d\u033e"+
		"\7K\2\2\u033e\u0340\7L\2\2\u033f\u033d\3\2\2\2\u0340\u0343\3\2\2\2\u0341"+
		"\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u034c\3\2\2\2\u0343\u0341\3\2"+
		"\2\2\u0344\u0346\7G\2\2\u0345\u0347\5~@\2\u0346\u0345\3\2\2\2\u0346\u0347"+
		"\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\7H\2\2\u0349\u034a\7V\2\2\u034a"+
		"\u034c\5p9\2\u034b\u0334\3\2\2\2\u034b\u033c\3\2\2\2\u034b\u0344\3\2\2"+
		"\2\u034cq\3\2\2\2\u034d\u034f\7r\2\2\u034e\u0350\5v<\2\u034f\u034e\3\2"+
		"\2\2\u034f\u0350\3\2\2\2\u0350\u0358\3\2\2\2\u0351\u0352\7O\2\2\u0352"+
		"\u0354\7r\2\2\u0353\u0355\5v<\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2"+
		"\2\u0355\u0357\3\2\2\2\u0356\u0351\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356"+
		"\3\2\2\2\u0358\u0359\3\2\2\2\u0359s\3\2\2\2\u035a\u0358\3\2\2\2\u035b"+
		"\u035c\t\7\2\2\u035cu\3\2\2\2\u035d\u035e\7R\2\2\u035e\u0363\5x=\2\u035f"+
		"\u0360\7N\2\2\u0360\u0362\5x=\2\u0361\u035f\3\2\2\2\u0362\u0365\3\2\2"+
		"\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0363"+
		"\3\2\2\2\u0366\u0367\7Q\2\2\u0367w\3\2\2\2\u0368\u036f\5p9\2\u0369\u036c"+
		"\7U\2\2\u036a\u036b\t\b\2\2\u036b\u036d\5p9\2\u036c\u036a\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u0368\3\2\2\2\u036e\u0369\3\2"+
		"\2\2\u036fy\3\2\2\2\u0370\u0375\5\u0088E\2\u0371\u0372\7N\2\2\u0372\u0374"+
		"\5\u0088E\2\u0373\u0371\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2\2"+
		"\2\u0375\u0376\3\2\2\2\u0376{\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u037a"+
		"\7G\2\2\u0379\u037b\5~@\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u037d\7H\2\2\u037d}\3\2\2\2\u037e\u0383\5\u0080A"+
		"\2\u037f\u0380\7N\2\2\u0380\u0382\5\u0080A\2\u0381\u037f\3\2\2\2\u0382"+
		"\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0388\3\2"+
		"\2\2\u0385\u0383\3\2\2\2\u0386\u0387\7N\2\2\u0387\u0389\5\u0082B\2\u0388"+
		"\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u038c\5\u0082"+
		"B\2\u038b\u037e\3\2\2\2\u038b\u038a\3\2\2\2\u038c\177\3\2\2\2\u038d\u038f"+
		"\5 \21\2\u038e\u038d\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\5p"+
		"9\2\u0394\u0395\5^\60\2\u0395\u0081\3\2\2\2\u0396\u0398\5 \21\2\u0397"+
		"\u0396\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2"+
		"\2\2\u039a\u039c\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u039d\5p9\2\u039d\u039e"+
		"\7t\2\2\u039e\u039f\5^\60\2\u039f\u0083\3\2\2\2\u03a0\u03a1\5\u00a8U\2"+
		"\u03a1\u0085\3\2\2\2\u03a2\u03a3\5\u00a8U\2\u03a3\u0087\3\2\2\2\u03a4"+
		"\u03a9\7r\2\2\u03a5\u03a6\7O\2\2\u03a6\u03a8\7r\2\2\u03a7\u03a5\3\2\2"+
		"\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u0089"+
		"\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03b5\7A\2\2\u03ad\u03b5\7B\2\2\u03ae"+
		"\u03b5\7D\2\2\u03af\u03b5\7E\2\2\u03b0\u03b5\7C\2\2\u03b1\u03b5\7F\2\2"+
		"\u03b2\u03b5\5b\62\2\u03b3\u03b5\5d\63\2\u03b4\u03ac\3\2\2\2\u03b4\u03ad"+
		"\3\2\2\2\u03b4\u03ae\3\2\2\2\u03b4\u03af\3\2\2\2\u03b4\u03b0\3\2\2\2\u03b4"+
		"\u03b1\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b5\u008b\3\2"+
		"\2\2\u03b6\u03b7\7s\2\2\u03b7\u03be\5\u008eH\2\u03b8\u03bb\7G\2\2\u03b9"+
		"\u03bc\5\u0090I\2\u03ba\u03bc\5\u0094K\2\u03bb\u03b9\3\2\2\2\u03bb\u03ba"+
		"\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03bf\7H\2\2\u03be"+
		"\u03b8\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u008d\3\2\2\2\u03c0\u03c1\5\u0088"+
		"E\2\u03c1\u008f\3\2\2\2\u03c2\u03c7\5\u0092J\2\u03c3\u03c4\7N\2\2\u03c4"+
		"\u03c6\5\u0092J\2\u03c5\u03c3\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5"+
		"\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u0091\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca"+
		"\u03cb\7r\2\2\u03cb\u03cc\7P\2\2\u03cc\u03cd\5\u0094K\2\u03cd\u0093\3"+
		"\2\2\2\u03ce\u03d2\5\u00d2j\2\u03cf\u03d2\5\u008cG\2\u03d0\u03d2\5\u0096"+
		"L\2\u03d1\u03ce\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d0\3\2\2\2\u03d2"+
		"\u0095\3\2\2\2\u03d3\u03dc\7I\2\2\u03d4\u03d9\5\u0094K\2\u03d5\u03d6\7"+
		"N\2\2\u03d6\u03d8\5\u0094K\2\u03d7\u03d5\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2"+
		"\2\2\u03dc\u03d4\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de"+
		"\u03e0\7N\2\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2"+
		"\2\2\u03e1\u03e2\7J\2\2\u03e2\u0097\3\2\2\2\u03e3\u03e4\7s\2\2\u03e4\u03e5"+
		"\7)\2\2\u03e5\u03e6\7r\2\2\u03e6\u03e7\5\u009aN\2\u03e7\u0099\3\2\2\2"+
		"\u03e8\u03ec\7I\2\2\u03e9\u03eb\5\u009cO\2\u03ea\u03e9\3\2\2\2\u03eb\u03ee"+
		"\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee"+
		"\u03ec\3\2\2\2\u03ef\u03f0\7J\2\2\u03f0\u009b\3\2\2\2\u03f1\u03f3\5\34"+
		"\17\2\u03f2\u03f1\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4"+
		"\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u03fa\5\u009e"+
		"P\2\u03f8\u03fa\7M\2\2\u03f9\u03f4\3\2\2\2\u03f9\u03f8\3\2\2\2\u03fa\u009d"+
		"\3\2\2\2\u03fb\u03fc\5p9\2\u03fc\u03fd\5\u00a0Q\2\u03fd\u03fe\7M\2\2\u03fe"+
		"\u0410\3\2\2\2\u03ff\u0401\5\"\22\2\u0400\u0402\7M\2\2\u0401\u0400\3\2"+
		"\2\2\u0401\u0402\3\2\2\2\u0402\u0410\3\2\2\2\u0403\u0405\5\62\32\2\u0404"+
		"\u0406\7M\2\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0410\3\2"+
		"\2\2\u0407\u0409\5*\26\2\u0408\u040a\7M\2\2\u0409\u0408\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u0410\3\2\2\2\u040b\u040d\5\u0098M\2\u040c\u040e"+
		"\7M\2\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f"+
		"\u03fb\3\2\2\2\u040f\u03ff\3\2\2\2\u040f\u0403\3\2\2\2\u040f\u0407\3\2"+
		"\2\2\u040f\u040b\3\2\2\2\u0410\u009f\3\2\2\2\u0411\u0414\5\u00a2R\2\u0412"+
		"\u0414\5\u00a4S\2\u0413\u0411\3\2\2\2\u0413\u0412\3\2\2\2\u0414\u00a1"+
		"\3\2\2\2\u0415\u0416\7r\2\2\u0416\u0417\7G\2\2\u0417\u0419\7H\2\2\u0418"+
		"\u041a\5\u00a6T\2\u0419\u0418\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u00a3"+
		"\3\2\2\2\u041b\u041c\5Z.\2\u041c\u00a5\3\2\2\2\u041d\u041e\7\31\2\2\u041e"+
		"\u041f\5\u0094K\2\u041f\u00a7\3\2\2\2\u0420\u0424\7I\2\2\u0421\u0423\5"+
		"\u00aaV\2\u0422\u0421\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2\2"+
		"\u0424\u0425\3\2\2\2\u0425\u0427\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u0428"+
		"\7J\2\2\u0428\u00a9\3\2\2\2\u0429\u042d\5\u00acW\2\u042a\u042d\5\u00b0"+
		"Y\2\u042b\u042d\5@!\2\u042c\u0429\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042b"+
		"\3\2\2\2\u042d\u00ab\3\2\2\2\u042e\u042f\5\u00aeX\2\u042f\u0430\7M\2\2"+
		"\u0430\u00ad\3\2\2\2\u0431\u0433\5 \21\2\u0432\u0431\3\2\2\2\u0433\u0436"+
		"\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0437\3\2\2\2\u0436"+
		"\u0434\3\2\2\2\u0437\u0438\5p9\2\u0438\u0439\5Z.\2\u0439\u00af\3\2\2\2"+
		"\u043a\u04a3\5\u00a8U\2\u043b\u043c\7\17\2\2\u043c\u043f\5\u00d2j\2\u043d"+
		"\u043e\7V\2\2\u043e\u0440\5\u00d2j\2\u043f\u043d\3\2\2\2\u043f\u0440\3"+
		"\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\7M\2\2\u0442\u04a3\3\2\2\2\u0443"+
		"\u0444\7#\2\2\u0444\u0445\5\u00caf\2\u0445\u0448\5\u00b0Y\2\u0446\u0447"+
		"\7\34\2\2\u0447\u0449\5\u00b0Y\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2"+
		"\2\u0449\u04a3\3\2\2\2\u044a\u044b\7\"\2\2\u044b\u044c\7G\2\2\u044c\u044d"+
		"\5\u00c2b\2\u044d\u044e\7H\2\2\u044e\u044f\5\u00b0Y\2\u044f\u04a3\3\2"+
		"\2\2\u0450\u0451\7?\2\2\u0451\u0452\5\u00caf\2\u0452\u0453\5\u00b0Y\2"+
		"\u0453\u04a3\3\2\2\2\u0454\u0455\7\32\2\2\u0455\u0456\5\u00b0Y\2\u0456"+
		"\u0457\7?\2\2\u0457\u0458\5\u00caf\2\u0458\u0459\7M\2\2\u0459\u04a3\3"+
		"\2\2\2\u045a\u045b\7<\2\2\u045b\u0465\5\u00a8U\2\u045c\u045e\5\u00b2Z"+
		"\2\u045d\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460"+
		"\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u0463\5\u00b6\\\2\u0462\u0461\3\2\2"+
		"\2\u0462\u0463\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0466\5\u00b6\\\2\u0465"+
		"\u045d\3\2\2\2\u0465\u0464\3\2\2\2\u0466\u04a3\3\2\2\2\u0467\u0468\7<"+
		"\2\2\u0468\u0469\5\u00b8]\2\u0469\u046d\5\u00a8U\2\u046a\u046c\5\u00b2"+
		"Z\2\u046b\u046a\3\2\2\2\u046c\u046f\3\2\2\2\u046d\u046b\3\2\2\2\u046d"+
		"\u046e\3\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u0470\u0472\5\u00b6"+
		"\\\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u04a3\3\2\2\2\u0473"+
		"\u0474\7\66\2\2\u0474\u0475\5\u00caf\2\u0475\u0479\7I\2\2\u0476\u0478"+
		"\5\u00be`\2\u0477\u0476\3\2\2\2\u0478\u047b\3\2\2\2\u0479\u0477\3\2\2"+
		"\2\u0479\u047a\3\2\2\2\u047a\u047f\3\2\2\2\u047b\u0479\3\2\2\2\u047c\u047e"+
		"\5\u00c0a\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2"+
		"\2\u047f\u0480\3\2\2\2\u0480\u0482\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0483"+
		"\7J\2\2\u0483\u04a3\3\2\2\2\u0484\u0485\7\67\2\2\u0485\u0486\5\u00caf"+
		"\2\u0486\u0487\5\u00a8U\2\u0487\u04a3\3\2\2\2\u0488\u048a\7\61\2\2\u0489"+
		"\u048b\5\u00d2j\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c"+
		"\3\2\2\2\u048c\u04a3\7M\2\2\u048d\u048e\79\2\2\u048e\u048f\5\u00d2j\2"+
		"\u048f\u0490\7M\2\2\u0490\u04a3\3\2\2\2\u0491\u0493\7\21\2\2\u0492\u0494"+
		"\7r\2\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u04a3\7M\2\2\u0496\u0498\7\30\2\2\u0497\u0499\7r\2\2\u0498\u0497\3\2"+
		"\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u04a3\7M\2\2\u049b"+
		"\u04a3\7M\2\2\u049c\u049d\5\u00ceh\2\u049d\u049e\7M\2\2\u049e\u04a3\3"+
		"\2\2\2\u049f\u04a0\7r\2\2\u04a0\u04a1\7V\2\2\u04a1\u04a3\5\u00b0Y\2\u04a2"+
		"\u043a\3\2\2\2\u04a2\u043b\3\2\2\2\u04a2\u0443\3\2\2\2\u04a2\u044a\3\2"+
		"\2\2\u04a2\u0450\3\2\2\2\u04a2\u0454\3\2\2\2\u04a2\u045a\3\2\2\2\u04a2"+
		"\u0467\3\2\2\2\u04a2\u0473\3\2\2\2\u04a2\u0484\3\2\2\2\u04a2\u0488\3\2"+
		"\2\2\u04a2\u048d\3\2\2\2\u04a2\u0491\3\2\2\2\u04a2\u0496\3\2\2\2\u04a2"+
		"\u049b\3\2\2\2\u04a2\u049c\3\2\2\2\u04a2\u049f\3\2\2\2\u04a3\u00b1\3\2"+
		"\2\2\u04a4\u04a5\7\24\2\2\u04a5\u04a9\7G\2\2\u04a6\u04a8\5 \21\2\u04a7"+
		"\u04a6\3\2\2\2\u04a8\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2"+
		"\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u04ad\5\u00b4[\2\u04ad"+
		"\u04ae\7r\2\2\u04ae\u04af\7H\2\2\u04af\u04b0\5\u00a8U\2\u04b0\u00b3\3"+
		"\2\2\2\u04b1\u04b6\5\u0088E\2\u04b2\u04b3\7d\2\2\u04b3\u04b5\5\u0088E"+
		"\2\u04b4\u04b2\3\2\2\2\u04b5\u04b8\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7"+
		"\3\2\2\2\u04b7\u00b5\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b9\u04ba\7 \2\2\u04ba"+
		"\u04bb\5\u00a8U\2\u04bb\u00b7\3\2\2\2\u04bc\u04bd\7G\2\2\u04bd\u04bf\5"+
		"\u00ba^\2\u04be\u04c0\7M\2\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u04c2\7H\2\2\u04c2\u00b9\3\2\2\2\u04c3\u04c8\5\u00bc"+
		"_\2\u04c4\u04c5\7M\2\2\u04c5\u04c7\5\u00bc_\2\u04c6\u04c4\3\2\2\2\u04c7"+
		"\u04ca\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u00bb\3\2"+
		"\2\2\u04ca\u04c8\3\2\2\2\u04cb\u04cd\5 \21\2\u04cc\u04cb\3\2\2\2\u04cd"+
		"\u04d0\3\2\2\2\u04ce\u04cc\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1\3\2"+
		"\2\2\u04d0\u04ce\3\2\2\2\u04d1\u04d2\5r:\2\u04d2\u04d3\5^\60\2\u04d3\u04d4"+
		"\7P\2\2\u04d4\u04d5\5\u00d2j\2\u04d5\u00bd\3\2\2\2\u04d6\u04d8\5\u00c0"+
		"a\2\u04d7\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9"+
		"\u04da\3\2\2\2\u04da\u04dc\3\2\2\2\u04db\u04dd\5\u00aaV\2\u04dc\u04db"+
		"\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df"+
		"\u00bf\3\2\2\2\u04e0\u04e1\7\23\2\2\u04e1\u04e2\5\u00d0i\2\u04e2\u04e3"+
		"\7V\2\2\u04e3\u04eb\3\2\2\2\u04e4\u04e5\7\23\2\2\u04e5\u04e6\5n8\2\u04e6"+
		"\u04e7\7V\2\2\u04e7\u04eb\3\2\2\2\u04e8\u04e9\7\31\2\2\u04e9\u04eb\7V"+
		"\2\2\u04ea\u04e0\3\2\2\2\u04ea\u04e4\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb"+
		"\u00c1\3\2\2\2\u04ec\u04f9\5\u00c6d\2\u04ed\u04ef\5\u00c4c\2\u04ee\u04ed"+
		"\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f2\7M\2\2\u04f1"+
		"\u04f3\5\u00d2j\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4"+
		"\3\2\2\2\u04f4\u04f6\7M\2\2\u04f5\u04f7\5\u00c8e\2\u04f6\u04f5\3\2\2\2"+
		"\u04f6\u04f7\3\2\2\2\u04f7\u04f9\3\2\2\2\u04f8\u04ec\3\2\2\2\u04f8\u04ee"+
		"\3\2\2\2\u04f9\u00c3\3\2\2\2\u04fa\u04fd\5\u00aeX\2\u04fb\u04fd\5\u00cc"+
		"g\2\u04fc\u04fa\3\2\2\2\u04fc\u04fb\3\2\2\2\u04fd\u00c5\3\2\2\2\u04fe"+
		"\u0500\5 \21\2\u04ff\u04fe\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff\3\2"+
		"\2\2\u0501\u0502\3\2\2\2\u0502\u0504\3\2\2\2\u0503\u0501\3\2\2\2\u0504"+
		"\u0505\5p9\2\u0505\u0506\7r\2\2\u0506\u0507\7V\2\2\u0507\u0508\5\u00d2"+
		"j\2\u0508\u00c7\3\2\2\2\u0509\u050a\5\u00ccg\2\u050a\u00c9\3\2\2\2\u050b"+
		"\u050c\7G\2\2\u050c\u050d\5\u00d2j\2\u050d\u050e\7H\2\2\u050e\u00cb\3"+
		"\2\2\2\u050f\u0514\5\u00d2j\2\u0510\u0511\7N\2\2\u0511\u0513\5\u00d2j"+
		"\2\u0512\u0510\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u00cd\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u0518\5\u00d2j"+
		"\2\u0518\u00cf\3\2\2\2\u0519\u051a\5\u00d2j\2\u051a\u00d1\3\2\2\2\u051b"+
		"\u051c\bj\1\2\u051c\u051d\7G\2\2\u051d\u051e\5p9\2\u051e\u051f\7H\2\2"+
		"\u051f\u0520\5\u00d2j\2\u0520\u0576\3\2\2\2\u0521\u0522\t\t\2\2\u0522"+
		"\u0576\5\u00d2j\2\u0523\u0524\t\n\2\2\u0524\u0576\5\u00d2j\2\u0525\u0576"+
		"\5\u00d4k\2\u0526\u0527\7,\2\2\u0527\u0576\5\u00d6l\2\u0528\u0531\7G\2"+
		"\2\u0529\u052e\7r\2\2\u052a\u052b\7N\2\2\u052b\u052d\7r\2\2\u052c\u052a"+
		"\3\2\2\2\u052d\u0530\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0532\3\2\2\2\u0530\u052e\3\2\2\2\u0531\u0529\3\2\2\2\u0531\u0532\3\2"+
		"\2\2\u0532\u0533\3\2\2\2\u0533\u0537\7H\2\2\u0534\u0535\7V\2\2\u0535\u0538"+
		"\5p9\2\u0536\u0538\7=\2\2\u0537\u0534\3\2\2\2\u0537\u0536\3\2\2\2\u0537"+
		"\u0538\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u0543\7\4\2\2\u053a\u0544\5\u00d2"+
		"j\2\u053b\u053f\7I\2\2\u053c\u053e\5\u00aaV\2\u053d\u053c\3\2\2\2\u053e"+
		"\u0541\3\2\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0542\3\2"+
		"\2\2\u0541\u053f\3\2\2\2\u0542\u0544\7J\2\2\u0543\u053a\3\2\2\2\u0543"+
		"\u053b\3\2\2\2\u0544\u0576\3\2\2\2\u0545\u0547\7G\2\2\u0546\u0548\5~@"+
		"\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054d"+
		"\7H\2\2\u054a\u054b\7V\2\2\u054b\u054e\5p9\2\u054c\u054e\7=\2\2\u054d"+
		"\u054a\3\2\2\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2"+
		"\2\2\u054f\u0559\7\4\2\2\u0550\u055a\5\u00d2j\2\u0551\u0555\7I\2\2\u0552"+
		"\u0554\5\u00aaV\2\u0553\u0552\3\2\2\2\u0554\u0557\3\2\2\2\u0555\u0553"+
		"\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0558\3\2\2\2\u0557\u0555\3\2\2\2\u0558"+
		"\u055a\7J\2\2\u0559\u0550\3\2\2\2\u0559\u0551\3\2\2\2\u055a\u0576\3\2"+
		"\2\2\u055b\u055c\7r\2\2\u055c\u0566\7\4\2\2\u055d\u0567\5\u00d2j\2\u055e"+
		"\u0562\7I\2\2\u055f\u0561\5\u00aaV\2\u0560\u055f\3\2\2\2\u0561\u0564\3"+
		"\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0565\3\2\2\2\u0564"+
		"\u0562\3\2\2\2\u0565\u0567\7J\2\2\u0566\u055d\3\2\2\2\u0566\u055e\3\2"+
		"\2\2\u0567\u0576\3\2\2\2\u0568\u0569\5\u0080A\2\u0569\u0573\7\4\2\2\u056a"+
		"\u0574\5\u00d2j\2\u056b\u056f\7I\2\2\u056c\u056e\5\u00aaV\2\u056d\u056c"+
		"\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570"+
		"\u0572\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0574\7J\2\2\u0573\u056a\3\2"+
		"\2\2\u0573\u056b\3\2\2\2\u0574\u0576\3\2\2\2\u0575\u051b\3\2\2\2\u0575"+
		"\u0521\3\2\2\2\u0575\u0523\3\2\2\2\u0575\u0525\3\2\2\2\u0575\u0526\3\2"+
		"\2\2\u0575\u0528\3\2\2\2\u0575\u0545\3\2\2\2\u0575\u055b\3\2\2\2\u0575"+
		"\u0568\3\2\2\2\u0576\u05d9\3\2\2\2\u0577\u0578\6j\2\3\u0578\u0579\t\13"+
		"\2\2\u0579\u05d8\5\u00d2j\2\u057a\u057b\6j\3\3\u057b\u057c\t\f\2\2\u057c"+
		"\u05d8\5\u00d2j\2\u057d\u0585\6j\4\3\u057e\u057f\7R\2\2\u057f\u0586\7"+
		"R\2\2\u0580\u0581\7Q\2\2\u0581\u0582\7Q\2\2\u0582\u0586\7Q\2\2\u0583\u0584"+
		"\7Q\2\2\u0584\u0586\7Q\2\2\u0585\u057e\3\2\2\2\u0585\u0580\3\2\2\2\u0585"+
		"\u0583\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u05d8\5\u00d2j\2\u0588\u0589"+
		"\6j\5\3\u0589\u058a\t\r\2\2\u058a\u05d8\5\u00d2j\2\u058b\u058c\6j\6\3"+
		"\u058c\u058d\t\16\2\2\u058d\u05d8\5\u00d2j\2\u058e\u058f\6j\7\3\u058f"+
		"\u0590\7c\2\2\u0590\u05d8\5\u00d2j\2\u0591\u0592\6j\b\3\u0592\u0593\7"+
		"e\2\2\u0593\u05d8\5\u00d2j\2\u0594\u0595\6j\t\3\u0595\u0596\7d\2\2\u0596"+
		"\u05d8\5\u00d2j\2\u0597\u0598\6j\n\3\u0598\u0599\7[\2\2\u0599\u05d8\5"+
		"\u00d2j\2\u059a\u059b\6j\13\3\u059b\u059c\7\\\2\2\u059c\u05d8\5\u00d2"+
		"j\2\u059d\u05aa\6j\f\3\u059e\u05ab\7P\2\2\u059f\u05ab\7g\2\2\u05a0\u05ab"+
		"\7h\2\2\u05a1\u05ab\7i\2\2\u05a2\u05ab\7j\2\2\u05a3\u05ab\7k\2\2\u05a4"+
		"\u05ab\7l\2\2\u05a5\u05ab\7m\2\2\u05a6\u05ab\7p\2\2\u05a7\u05ab\7q\2\2"+
		"\u05a8\u05ab\7o\2\2\u05a9\u05ab\7n\2\2\u05aa\u059e\3\2\2\2\u05aa\u059f"+
		"\3\2\2\2\u05aa\u05a0\3\2\2\2\u05aa\u05a1\3\2\2\2\u05aa\u05a2\3\2\2\2\u05aa"+
		"\u05a3\3\2\2\2\u05aa\u05a4\3\2\2\2\u05aa\u05a5\3\2\2\2\u05aa\u05a6\3\2"+
		"\2\2\u05aa\u05a7\3\2\2\2\u05aa\u05a8\3\2\2\2\u05aa\u05a9\3\2\2\2\u05ab"+
		"\u05ac\3\2\2\2\u05ac\u05d8\5\u00d2j\2\u05ad\u05ae\6j\r\3\u05ae\u05af\7"+
		"U\2\2\u05af\u05b0\5\u00d2j\2\u05b0\u05b1\7V\2\2\u05b1\u05b2\5\u00d2j\2"+
		"\u05b2\u05d8\3\2\2\2\u05b3\u05b4\6j\16\3\u05b4\u05b5\7O\2\2\u05b5\u05d8"+
		"\t\5\2\2\u05b6\u05b7\6j\17\3\u05b7\u05b8\7O\2\2\u05b8\u05d8\78\2\2\u05b9"+
		"\u05ba\6j\20\3\u05ba\u05bb\7O\2\2\u05bb\u05bd\7,\2\2\u05bc\u05be\5\u00e2"+
		"r\2\u05bd\u05bc\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf"+
		"\u05d8\5\u00dan\2\u05c0\u05c1\6j\21\3\u05c1\u05c2\7O\2\2\u05c2\u05c3\7"+
		"\65\2\2\u05c3\u05d8\5\u00e8u\2\u05c4\u05c5\6j\22\3\u05c5\u05c6\7O\2\2"+
		"\u05c6\u05d8\5\u00e0q\2\u05c7\u05c8\6j\23\3\u05c8\u05c9\7K\2\2\u05c9\u05ca"+
		"\5\u00d2j\2\u05ca\u05cb\7L\2\2\u05cb\u05d8\3\2\2\2\u05cc\u05cd\6j\24\3"+
		"\u05cd\u05cf\7G\2\2\u05ce\u05d0\5\u00ccg\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0"+
		"\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d8\7H\2\2\u05d2\u05d3\6j\25\3\u05d3"+
		"\u05d8\t\17\2\2\u05d4\u05d5\6j\26\3\u05d5\u05d6\7\'\2\2\u05d6\u05d8\5"+
		"p9\2\u05d7\u0577\3\2\2\2\u05d7\u057a\3\2\2\2\u05d7\u057d\3\2\2\2\u05d7"+
		"\u0588\3\2\2\2\u05d7\u058b\3\2\2\2\u05d7\u058e\3\2\2\2\u05d7\u0591\3\2"+
		"\2\2\u05d7\u0594\3\2\2\2\u05d7\u0597\3\2\2\2\u05d7\u059a\3\2\2\2\u05d7"+
		"\u059d\3\2\2\2\u05d7\u05ad\3\2\2\2\u05d7\u05b3\3\2\2\2\u05d7\u05b6\3\2"+
		"\2\2\u05d7\u05b9\3\2\2\2\u05d7\u05c0\3\2\2\2\u05d7\u05c4\3\2\2\2\u05d7"+
		"\u05c7\3\2\2\2\u05d7\u05cc\3\2\2\2\u05d7\u05d2\3\2\2\2\u05d7\u05d4\3\2"+
		"\2\2\u05d8\u05db\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05da\3\2\2\2\u05da"+
		"\u00d3\3\2\2\2\u05db\u05d9\3\2\2\2\u05dc\u05dd\7G\2\2\u05dd\u05de\5\u00d2"+
		"j\2\u05de\u05df\7H\2\2\u05df\u05f4\3\2\2\2\u05e0\u05f4\78\2\2\u05e1\u05f4"+
		"\7\65\2\2\u05e2\u05f4\5\u008aF\2\u05e3\u05f4\7r\2\2\u05e4\u05e5\5p9\2"+
		"\u05e5\u05e6\7O\2\2\u05e6\u05e7\7\26\2\2\u05e7\u05f4\3\2\2\2\u05e8\u05e9"+
		"\7=\2\2\u05e9\u05ea\7O\2\2\u05ea\u05f4\7\26\2\2\u05eb\u05ef\5\u00e2r\2"+
		"\u05ec\u05f0\5\u00eav\2\u05ed\u05ee\78\2\2\u05ee\u05f0\5\u00ecw\2\u05ef"+
		"\u05ec\3\2\2\2\u05ef\u05ed\3\2\2\2\u05f0\u05f4\3\2\2\2\u05f1\u05f4\5b"+
		"\62\2\u05f2\u05f4\5d\63\2\u05f3\u05dc\3\2\2\2\u05f3\u05e0\3\2\2\2\u05f3"+
		"\u05e1\3\2\2\2\u05f3\u05e2\3\2\2\2\u05f3\u05e3\3\2\2\2\u05f3\u05e4\3\2"+
		"\2\2\u05f3\u05e8\3\2\2\2\u05f3\u05eb\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3"+
		"\u05f2\3\2\2\2\u05f4\u00d5\3\2\2\2\u05f5\u05f6\5\u00e2r\2\u05f6\u05f7"+
		"\5\u00d8m\2\u05f7\u05f8\5\u00dep\2\u05f8\u05ff\3\2\2\2\u05f9\u05fc\5\u00d8"+
		"m\2\u05fa\u05fd\5\u00dco\2\u05fb\u05fd\5\u00dep\2\u05fc\u05fa\3\2\2\2"+
		"\u05fc\u05fb\3\2\2\2\u05fd\u05ff\3\2\2\2\u05fe\u05f5\3\2\2\2\u05fe\u05f9"+
		"\3\2\2\2\u05ff\u00d7\3\2\2\2\u0600\u0602\7r\2\2\u0601\u0603\5\u00e4s\2"+
		"\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u060b\3\2\2\2\u0604\u0605"+
		"\7O\2\2\u0605\u0607\7r\2\2\u0606\u0608\5\u00e4s\2\u0607\u0606\3\2\2\2"+
		"\u0607\u0608\3\2\2\2\u0608\u060a\3\2\2\2\u0609\u0604\3\2\2\2\u060a\u060d"+
		"\3\2\2\2\u060b\u0609\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u0610\3\2\2\2\u060d"+
		"\u060b\3\2\2\2\u060e\u0610\5t;\2\u060f\u0600\3\2\2\2\u060f\u060e\3\2\2"+
		"\2\u0610\u00d9\3\2\2\2\u0611\u0613\7r\2\2\u0612\u0614\5\u00e6t\2\u0613"+
		"\u0612\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\5\u00de"+
		"p\2\u0616\u00db\3\2\2\2\u0617\u0633\7K\2\2\u0618\u061d\7L\2\2\u0619\u061a"+
		"\7K\2\2\u061a\u061c\7L\2\2\u061b\u0619\3\2\2\2\u061c\u061f\3\2\2\2\u061d"+
		"\u061b\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0620\3\2\2\2\u061f\u061d\3\2"+
		"\2\2\u0620\u0634\5b\62\2\u0621\u0622\5\u00d2j\2\u0622\u0629\7L\2\2\u0623"+
		"\u0624\7K\2\2\u0624\u0625\5\u00d2j\2\u0625\u0626\7L\2\2\u0626\u0628\3"+
		"\2\2\2\u0627\u0623\3\2\2\2\u0628\u062b\3\2\2\2\u0629\u0627\3\2\2\2\u0629"+
		"\u062a\3\2\2\2\u062a\u0630\3\2\2\2\u062b\u0629\3\2\2\2\u062c\u062d\7K"+
		"\2\2\u062d\u062f\7L\2\2\u062e\u062c\3\2\2\2\u062f\u0632\3\2\2\2\u0630"+
		"\u062e\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0634\3\2\2\2\u0632\u0630\3\2"+
		"\2\2\u0633\u0618\3\2\2\2\u0633\u0621\3\2\2\2\u0634\u00dd\3\2\2\2\u0635"+
		"\u0637\5\u00ecw\2\u0636\u0638\5\66\34\2\u0637\u0636\3\2\2\2\u0637\u0638"+
		"\3\2\2\2\u0638\u00df\3\2\2\2\u0639\u063a\5\u00e2r\2\u063a\u063b\5\u00ea"+
		"v\2\u063b\u00e1\3\2\2\2\u063c\u063d\7R\2\2\u063d\u063e\5\64\33\2\u063e"+
		"\u063f\7Q\2\2\u063f\u00e3\3\2\2\2\u0640\u0641\7R\2\2\u0641\u0644\7Q\2"+
		"\2\u0642\u0644\5v<\2\u0643\u0640\3\2\2\2\u0643\u0642\3\2\2\2\u0644\u00e5"+
		"\3\2\2\2\u0645\u0646\7R\2\2\u0646\u0649\7Q\2\2\u0647\u0649\5\u00e2r\2"+
		"\u0648\u0645\3\2\2\2\u0648\u0647\3\2\2\2\u0649\u00e7\3\2\2\2\u064a\u0651"+
		"\5\u00ecw\2\u064b\u064c\7O\2\2\u064c\u064e\7r\2\2\u064d\u064f\5\u00ec"+
		"w\2\u064e\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0651\3\2\2\2\u0650"+
		"\u064a\3\2\2\2\u0650\u064b\3\2\2\2\u0651\u00e9\3\2\2\2\u0652\u0653\7\65"+
		"\2\2\u0653\u0657\5\u00e8u\2\u0654\u0655\7r\2\2\u0655\u0657\5\u00ecw\2"+
		"\u0656\u0652\3\2\2\2\u0656\u0654\3\2\2\2\u0657\u00eb\3\2\2\2\u0658\u065a"+
		"\7G\2\2\u0659\u065b\5\u00ccg\2\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2"+
		"\u065b\u065c\3\2\2\2\u065c\u065d\7H\2\2\u065d\u00ed\3\2\2\2\u00c2\u00ef"+
		"\u00f4\u00fb\u0100\u010a\u010d\u0111\u0118\u011f\u0127\u0133\u013f\u0143"+
		"\u0156\u015d\u0162\u016b\u0170\u0177\u017e\u0185\u018c\u0191\u0195\u0199"+
		"\u019e\u01a3\u01a7\u01ab\u01b5\u01bd\u01c4\u01cb\u01cf\u01d2\u01d5\u01de"+
		"\u01e4\u01e9\u01ec\u01f2\u01f8\u01fc\u0205\u020c\u0215\u021c\u0222\u0226"+
		"\u0234\u0240\u0249\u0251\u0259\u025e\u0262\u026b\u027e\u0282\u0284\u028b"+
		"\u028f\u029c\u02a0\u02a2\u02a9\u02ad\u02b4\u02b9\u02c2\u02ca\u02d4\u02dc"+
		"\u02e4\u02e9\u02f5\u02fb\u0302\u0307\u030f\u0313\u0315\u031b\u031e\u0327"+
		"\u0339\u0341\u0346\u034b\u034f\u0354\u0358\u0363\u036c\u036e\u0375\u037a"+
		"\u0383\u0388\u038b\u0390\u0399\u03a9\u03b4\u03bb\u03be\u03c7\u03d1\u03d9"+
		"\u03dc\u03df\u03ec\u03f4\u03f9\u0401\u0405\u0409\u040d\u040f\u0413\u0419"+
		"\u0424\u042c\u0434\u043f\u0448\u045f\u0462\u0465\u046d\u0471\u0479\u047f"+
		"\u048a\u0493\u0498\u04a2\u04a9\u04b6\u04bf\u04c8\u04ce\u04d9\u04de\u04ea"+
		"\u04ee\u04f2\u04f6\u04f8\u04fc\u0501\u0514\u052e\u0531\u0537\u053f\u0543"+
		"\u0547\u054d\u0555\u0559\u0562\u0566\u056f\u0573\u0575\u0585\u05aa\u05bd"+
		"\u05cf\u05d7\u05d9\u05ef\u05f3\u05fc\u05fe\u0602\u0607\u060b\u060f\u0613"+
		"\u061d\u0629\u0630\u0633\u0637\u0643\u0648\u064e\u0650\u0656\u065a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}