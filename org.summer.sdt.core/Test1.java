/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.internal.codeassist.complete;

/*
 * Parser able to build specific completion parse nodes, given a cursorLocation.
 *
 * Cursor location denotes the position of the last character behind which completion
 * got requested:
 *  -1 means completion at the very beginning of the source
 *	0  means completion behind the first character
 *  n  means completion behind the n-th character
 */

import java.util.HashSet;
import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.jdt.internal.compiler.*;
import org.eclipse.jdt.internal.compiler.classfmt.ClassFileConstants;
import org.eclipse.jdt.internal.compiler.env.*;
import org.eclipse.jdt.internal.compiler.ast.*;
import org.eclipse.jdt.internal.compiler.parser.*;
import org.eclipse.jdt.internal.compiler.problem.*;
import org.eclipse.jdt.internal.compiler.util.HashtableOfObjectToInt;
import org.eclipse.jdt.internal.compiler.util.Util;
import org.eclipse.jdt.core.compiler.CharOperation;
import org.eclipse.jdt.internal.codeassist.impl.*;
import org.summer.sdt.internal.compiler.parser.Java8Listener;
import org.summer.sdt.internal.compiler.parser.Java8Parser;
import org.summer.sdt.internal.compiler.parser.Java8Visitor;
import org.summer.sdt.internal.compiler.parser.Java8Parser.*;

module Test{

	<Test name="1212">
		<Test1 name="@12121" />
		<Test1 name="sasasa" />
	</Test>

	export String hhhh(){
		return "sasasasa";
	}
	
	//String result = ((String p1, String p1):String -> {return p1 + p2;})("sasas", "Sasas");
	
	String result = ((String p1, String p1):String -> {return p1 + p2;})("sasas", "Sasas");
	
	this.test.test1.get();
	
	test(a-> 1>2);
	
	test(a-> { return 1>2; });
	
	test((a, b)-> 1>2);
	
	test((a, b)-> {return 1>2;} );
	
	this.add(1);
	
	int[] a = [1,2,3,3];
	int a1[] = [1,2,2,3];
	int[] b = [];
	
	Object kk = {a:[1,2,3], "b" : "21212"};
	 @SuppressWarnings("rawtypes")
	 class CompletionParser extends AssistParser {
		String [int index] {
			get{
				return list.get(index);
			}
			set {
				list.add(value);
			}
		}
		
		void ggg()  {
			int gg = 0;
			gg >>>= 10;
			
			boolean h = this.field>10;
			int h11 = this.field >>> 10;
			
			this.test.test1.get();
		}
	}
	 

}

