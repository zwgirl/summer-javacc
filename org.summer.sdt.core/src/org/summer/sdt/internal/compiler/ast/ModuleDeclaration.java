package org.summer.sdt.internal.compiler.ast;

import java.util.ArrayList;
import java.util.List;

import org.summer.sdt.internal.compiler.lookup.CompilationUnitScope;
import org.summer.sdt.internal.compiler.lookup.ModuleScope;
import org.summer.sdt.internal.compiler.problem.AbortCompilationUnit;
import org.summer.sdt.internal.compiler.xaml.Element;

public class ModuleDeclaration extends ASTNode {
	
	public Element element;
	// public ImportReference currentPackage;
	// public ImportReference[] imports;
	// public TypeDeclaration[] types;
	// public int[][] comments;
	//
	// public boolean ignoreFurtherInvestigation = false; // once pointless to
	// investigate due to errors
	// public boolean ignoreMethodBodies = false;
	public ModuleScope scope;
	// // public CompilationResult compilationResult;
	//
	// // public LocalTypeBinding[] localTypes;
	// public int localTypeCount = 0;
	//
	// public boolean isPropagatingInnerClassEmulation;
	//
	// // public Javadoc javadoc; // 1.5 addition for package-info.java
	// //
	// // public NLSTag[] nlsTags;
	// // private StringLiteral[] stringLiterals;
	// // private int stringLiteralsPtr;
	// // private HashSetOfInt stringLiteralsStart;
	//
	// public boolean[] validIdentityComparisonLines;
	//
	// // IrritantSet[] suppressWarningIrritants; // irritant for suppressed
	// warnings
	// Annotation[] suppressWarningAnnotations;
	// long[] suppressWarningScopePositions; // (start << 32) + end
	// int suppressWarningsCount;
	// public int functionalExpressionsCount;
	// public FunctionalExpression[] functionalExpressions;

	String name;

	public List<ASTNode> contents = new ArrayList<ASTNode>();

	public ModuleDeclaration(CompilationUnitDeclaration unit/*
							 * ProblemReporter problemReporter,
							 * CompilationResult compilationResult, int
							 * sourceLength
							 */) {
		// this.problemReporter = problemReporter;
		// this.compilationResult = compilationResult;
		// by definition of a compilation unit....
		this.sourceStart = 0;
		// this.sourceEnd = sourceLength - 1;
	}

	public void resolve(CompilationUnitScope scope) {
		for(ASTNode node : contents){
			node.resolve(this.scope);
		}
	}
	
	/**
	 * javascript generation
	 */
	public void generateCode() {
		try {
			for(ASTNode node : contents){
				node.generateCode();
			}
		} catch (AbortCompilationUnit e) {
			// ignore
		}
	}
}
