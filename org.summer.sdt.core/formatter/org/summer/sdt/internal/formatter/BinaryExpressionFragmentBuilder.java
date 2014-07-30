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
package org.summer.sdt.internal.formatter;

import java.util.ArrayList;

import org.summer.sdt.internal.compiler.ASTVisitor;
import org.summer.sdt.internal.compiler.ast.AND_AND_Expression;
import org.summer.sdt.internal.compiler.ast.ASTNode;
import org.summer.sdt.internal.compiler.ast.AllocationExpression;
import org.summer.sdt.internal.compiler.ast.ArrayAllocationExpression;
import org.summer.sdt.internal.compiler.ast.ArrayInitializer;
import org.summer.sdt.internal.compiler.ast.ArrayQualifiedTypeReference;
import org.summer.sdt.internal.compiler.ast.ArrayReference;
import org.summer.sdt.internal.compiler.ast.ArrayTypeReference;
import org.summer.sdt.internal.compiler.ast.Assignment;
import org.summer.sdt.internal.compiler.ast.BinaryExpression;
import org.summer.sdt.internal.compiler.ast.CastExpression;
import org.summer.sdt.internal.compiler.ast.CharLiteral;
import org.summer.sdt.internal.compiler.ast.ClassLiteralAccess;
import org.summer.sdt.internal.compiler.ast.CombinedBinaryExpression;
import org.summer.sdt.internal.compiler.ast.CompoundAssignment;
import org.summer.sdt.internal.compiler.ast.ConditionalExpression;
import org.summer.sdt.internal.compiler.ast.DoubleLiteral;
import org.summer.sdt.internal.compiler.ast.EqualExpression;
import org.summer.sdt.internal.compiler.ast.Expression;
import org.summer.sdt.internal.compiler.ast.ExtendedStringLiteral;
import org.summer.sdt.internal.compiler.ast.FalseLiteral;
import org.summer.sdt.internal.compiler.ast.FieldReference;
import org.summer.sdt.internal.compiler.ast.FloatLiteral;
import org.summer.sdt.internal.compiler.ast.InstanceOfExpression;
import org.summer.sdt.internal.compiler.ast.IntLiteral;
import org.summer.sdt.internal.compiler.ast.LongLiteral;
import org.summer.sdt.internal.compiler.ast.MessageSend;
import org.summer.sdt.internal.compiler.ast.NullLiteral;
import org.summer.sdt.internal.compiler.ast.OR_OR_Expression;
import org.summer.sdt.internal.compiler.ast.OperatorIds;
import org.summer.sdt.internal.compiler.ast.PostfixExpression;
import org.summer.sdt.internal.compiler.ast.PrefixExpression;
import org.summer.sdt.internal.compiler.ast.QualifiedAllocationExpression;
import org.summer.sdt.internal.compiler.ast.QualifiedNameReference;
import org.summer.sdt.internal.compiler.ast.QualifiedSuperReference;
import org.summer.sdt.internal.compiler.ast.QualifiedThisReference;
import org.summer.sdt.internal.compiler.ast.SingleNameReference;
import org.summer.sdt.internal.compiler.ast.StringLiteral;
import org.summer.sdt.internal.compiler.ast.StringLiteralConcatenation;
import org.summer.sdt.internal.compiler.ast.SuperReference;
import org.summer.sdt.internal.compiler.ast.ThisReference;
import org.summer.sdt.internal.compiler.ast.TrueLiteral;
import org.summer.sdt.internal.compiler.ast.UnaryExpression;
import org.summer.sdt.internal.compiler.lookup.BlockScope;
import org.summer.sdt.internal.compiler.lookup.ClassScope;
import org.summer.sdt.internal.compiler.parser.TerminalTokens;

@SuppressWarnings({ "rawtypes", "unchecked" })
class BinaryExpressionFragmentBuilder
	extends ASTVisitor {

	ArrayList fragmentsList;
	ArrayList operatorsList;
	private int realFragmentsSize;

	BinaryExpressionFragmentBuilder() {
		this.fragmentsList = new ArrayList();
		this.operatorsList = new ArrayList();
		this.realFragmentsSize = 0;
	}

	private final void addRealFragment(ASTNode node) {
		this.fragmentsList.add(node);
		this.realFragmentsSize++;
	}

	private final void addSmallFragment(ASTNode node) {
		this.fragmentsList.add(node);
	}

	private boolean buildFragments(Expression expression) {
		if (((expression.bits & ASTNode.ParenthesizedMASK) >> ASTNode.ParenthesizedSHIFT) != 0) {
			addRealFragment(expression);
			return false;
		}
		return true;
	}

	public ASTNode[] fragments() {
		ASTNode[] fragments = new ASTNode[this.fragmentsList.size()];
		this.fragmentsList.toArray(fragments);
		return fragments;
	}

	public int[] operators() {
		int length = this.operatorsList.size();
		int[] tab = new int[length];
		for (int i = 0; i < length; i++) {
			tab[i] = ((Integer)this.operatorsList.get(i)).intValue();
		}
		return tab;
	}

	public int realFragmentsSize() {
		return this.realFragmentsSize;
	}

	public boolean visit(
		AllocationExpression allocationExpression,
		BlockScope scope) {
			addRealFragment(allocationExpression);
			return false;
	}

	public boolean visit(
		AND_AND_Expression and_and_Expression,
		BlockScope scope) {

		if (((and_and_Expression.bits & ASTNode.ParenthesizedMASK) >> ASTNode.ParenthesizedSHIFT) != 0) {
			addRealFragment(and_and_Expression);
		} else {
			and_and_Expression.left.traverse(this, scope);
			this.operatorsList.add(new Integer(TerminalTokens.TokenNameAND_AND));
			and_and_Expression.right.traverse(this, scope);
		}
		return false;
	}

	public boolean visit(
		ArrayAllocationExpression arrayAllocationExpression,
		BlockScope scope) {
			addRealFragment(arrayAllocationExpression);
			return false;
	}

	public boolean visit(ArrayInitializer arrayInitializer, BlockScope scope) {
		addRealFragment(arrayInitializer);
		return false;
	}

	public boolean visit(
		ArrayQualifiedTypeReference arrayQualifiedTypeReference,
		BlockScope scope) {
			addRealFragment(arrayQualifiedTypeReference);
			return false;
	}

	public boolean visit(
		ArrayQualifiedTypeReference arrayQualifiedTypeReference,
		ClassScope scope) {
			addRealFragment(arrayQualifiedTypeReference);
			return false;
	}

	public boolean visit(ArrayReference arrayReference, BlockScope scope) {
		addRealFragment(arrayReference);
		return false;
	}

	public boolean visit(
		ArrayTypeReference arrayTypeReference,
		BlockScope scope) {
			addRealFragment(arrayTypeReference);
			return false;
	}

	public boolean visit(
		ArrayTypeReference arrayTypeReference,
		ClassScope scope) {
			addRealFragment(arrayTypeReference);
			return false;
	}

	public boolean visit(Assignment assignment, BlockScope scope) {
		addRealFragment(assignment);
		return false;
	}

	public boolean visit(BinaryExpression binaryExpression, BlockScope scope) {
		if (binaryExpression instanceof CombinedBinaryExpression) {
			CombinedBinaryExpression expression = (CombinedBinaryExpression) binaryExpression;
			if (expression.referencesTable != null) {
				return this.visit(expression, scope);
			}
		}
		final int numberOfParens = (binaryExpression.bits & ASTNode.ParenthesizedMASK) >> ASTNode.ParenthesizedSHIFT;
		if (numberOfParens > 0) {
			addRealFragment(binaryExpression);
		} else {
			switch((binaryExpression.bits & ASTNode.OperatorMASK) >> ASTNode.OperatorSHIFT) {
				case OperatorIds.PLUS :
					if (buildFragments(binaryExpression)) {
						binaryExpression.left.traverse(this, scope);
						this.operatorsList.add(new Integer(TerminalTokens.TokenNamePLUS));
						binaryExpression.right.traverse(this, scope);
					}
					return false;
				case OperatorIds.MINUS :
					if (buildFragments(binaryExpression)) {
						binaryExpression.left.traverse(this, scope);
						this.operatorsList.add(new Integer(TerminalTokens.TokenNameMINUS));
						binaryExpression.right.traverse(this, scope);
					}
					return false;
				case OperatorIds.MULTIPLY :
					if (buildFragments(binaryExpression)) {
						binaryExpression.left.traverse(this, scope);
						this.operatorsList.add(new Integer(TerminalTokens.TokenNameMULTIPLY));
						binaryExpression.right.traverse(this, scope);
					}
					return false;
				case OperatorIds.REMAINDER :
					if (buildFragments(binaryExpression)) {
						binaryExpression.left.traverse(this, scope);
						this.operatorsList.add(new Integer(TerminalTokens.TokenNameREMAINDER));
						binaryExpression.right.traverse(this, scope);
					}
					return false;
				case OperatorIds.XOR :
					if (buildFragments(binaryExpression)) {
						binaryExpression.left.traverse(this, scope);
						this.operatorsList.add(new Integer(TerminalTokens.TokenNameXOR));
						binaryExpression.right.traverse(this, scope);
					}
					return false;
				case OperatorIds.DIVIDE :
					if (buildFragments(binaryExpression)) {
						binaryExpression.left.traverse(this, scope);
						this.operatorsList.add(new Integer(TerminalTokens.TokenNameDIVIDE));
						binaryExpression.right.traverse(this, scope);
					}
					return false;
				case OperatorIds.OR :
					if (buildFragments(binaryExpression)) {
						binaryExpression.left.traverse(this, scope);
						this.operatorsList.add(new Integer(TerminalTokens.TokenNameOR));
						binaryExpression.right.traverse(this, scope);
					}
					return false;
				case OperatorIds.AND :
					if (buildFragments(binaryExpression)) {
						binaryExpression.left.traverse(this, scope);
						this.operatorsList.add(new Integer(TerminalTokens.TokenNameAND));
						binaryExpression.right.traverse(this, scope);
					}
					return false;
				default:
					addRealFragment(binaryExpression);
			}
		}
		return false;
	}

	public boolean visit(CombinedBinaryExpression combinedBinaryExpression, BlockScope scope) {
		// keep implementation in sync with BinaryExpression#resolveType
		if (combinedBinaryExpression.referencesTable == null) {
			addRealFragment(combinedBinaryExpression.left);
			this.operatorsList.add(new Integer(TerminalTokens.TokenNamePLUS));
			addRealFragment(combinedBinaryExpression.right);
			return false;
		}
		BinaryExpression cursor = combinedBinaryExpression.referencesTable[0];
		if (cursor.left instanceof CombinedBinaryExpression) {
			this.visit((CombinedBinaryExpression) cursor.left, scope);
		} else {
			addRealFragment(cursor.left);
		}
		for (int i = 0, end = combinedBinaryExpression.arity; i < end; i ++) {
			this.operatorsList.add(new Integer(TerminalTokens.TokenNamePLUS));
			addRealFragment(combinedBinaryExpression.referencesTable[i].right);
		}
		this.operatorsList.add(new Integer(TerminalTokens.TokenNamePLUS));
		addRealFragment(combinedBinaryExpression.right);
		return false;
	}

	public boolean visit(CastExpression castExpression, BlockScope scope) {
		addRealFragment(castExpression);
		return false;
	}

	public boolean visit(CharLiteral charLiteral, BlockScope scope) {
		addSmallFragment(charLiteral);
		return false;
	}

	public boolean visit(
		ClassLiteralAccess classLiteralAccess,
		BlockScope scope) {
			addRealFragment(classLiteralAccess);
			return false;
	}

	public boolean visit(
		CompoundAssignment compoundAssignment,
		BlockScope scope) {
			addRealFragment(compoundAssignment);
			return false;
	}

	public boolean visit(
		ConditionalExpression conditionalExpression,
		BlockScope scope) {
			addRealFragment(conditionalExpression);
			return false;
	}

	public boolean visit(DoubleLiteral doubleLiteral, BlockScope scope) {
		addSmallFragment(doubleLiteral);
		return false;
	}

	public boolean visit(EqualExpression equalExpression, BlockScope scope) {
		addRealFragment(equalExpression);
		return false;
	}

	public boolean visit(
		ExtendedStringLiteral extendedStringLiteral,
		BlockScope scope) {
			addRealFragment(extendedStringLiteral);
			return false;
	}

	public boolean visit(FalseLiteral falseLiteral, BlockScope scope) {
		addSmallFragment(falseLiteral);
		return false;
	}

	public boolean visit(FieldReference fieldReference, BlockScope scope) {
		addRealFragment(fieldReference);
		return false;
	}

	public boolean visit(FloatLiteral floatLiteral, BlockScope scope) {
		addSmallFragment(floatLiteral);
		return false;
	}

	public boolean visit(
		InstanceOfExpression instanceOfExpression,
		BlockScope scope) {
			addRealFragment(instanceOfExpression);
			return false;
	}

	public boolean visit(IntLiteral intLiteral, BlockScope scope) {
		addSmallFragment(intLiteral);
		return false;
	}

	public boolean visit(LongLiteral longLiteral, BlockScope scope) {
		addSmallFragment(longLiteral);
		return false;
	}

	public boolean visit(MessageSend messageSend, BlockScope scope) {
		addRealFragment(messageSend);
		return false;
	}

	public boolean visit(StringLiteralConcatenation stringLiteral, BlockScope scope) {
		if (((stringLiteral.bits & ASTNode.ParenthesizedMASK) >> ASTNode.ParenthesizedSHIFT) != 0) {
			addRealFragment(stringLiteral);
		} else {
			for (int i = 0, max = stringLiteral.counter; i < max; i++) {
				addRealFragment(stringLiteral.literals[i]);
				if (i < max - 1) {
					this.operatorsList.add(new Integer(TerminalTokens.TokenNamePLUS));
				}
			}
		}
		return false;
	}

	public boolean visit(NullLiteral nullLiteral, BlockScope scope) {
		addRealFragment(nullLiteral);
		return false;
	}

	public boolean visit(OR_OR_Expression or_or_Expression, BlockScope scope) {
		if (((or_or_Expression.bits & ASTNode.ParenthesizedMASK) >> ASTNode.ParenthesizedSHIFT) != 0) {
			addRealFragment(or_or_Expression);
		} else {
			or_or_Expression.left.traverse(this, scope);
			this.operatorsList.add(new Integer(TerminalTokens.TokenNameOR_OR));
			or_or_Expression.right.traverse(this, scope);
		}
		return false;
	}

	public boolean visit(
		PostfixExpression postfixExpression,
		BlockScope scope) {
			addRealFragment(postfixExpression);
			return false;
	}

	public boolean visit(PrefixExpression prefixExpression, BlockScope scope) {
		addRealFragment(prefixExpression);
		return false;
	}

	public boolean visit(
		QualifiedAllocationExpression qualifiedAllocationExpression,
		BlockScope scope) {
			addRealFragment(qualifiedAllocationExpression);
			return false;
	}
	public boolean visit(
		QualifiedNameReference qualifiedNameReference,
		BlockScope scope) {
			addRealFragment(qualifiedNameReference);
			return false;
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.internal.compiler.ASTVisitor#visit(org.summer.sdt.internal.compiler.ast.QualifiedSuperReference, org.summer.sdt.internal.compiler.lookup.BlockScope)
	 */
	public boolean visit(
			QualifiedSuperReference qualifiedSuperReference,
			BlockScope scope) {
		addRealFragment(qualifiedSuperReference);
		return false;
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.internal.compiler.ASTVisitor#visit(org.summer.sdt.internal.compiler.ast.QualifiedThisReference, org.summer.sdt.internal.compiler.lookup.BlockScope)
	 */
	public boolean visit(
			QualifiedThisReference qualifiedThisReference,
			BlockScope scope) {
		addRealFragment(qualifiedThisReference);
		return false;
	}

	public boolean visit(
		SingleNameReference singleNameReference,
		BlockScope scope) {
			addRealFragment(singleNameReference);
			return false;
	}

	public boolean visit(StringLiteral stringLiteral, BlockScope scope) {
		addRealFragment(stringLiteral);
		return false;
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.internal.compiler.ASTVisitor#visit(org.summer.sdt.internal.compiler.ast.SuperReference, org.summer.sdt.internal.compiler.lookup.BlockScope)
	 */
	public boolean visit(SuperReference superReference, BlockScope scope) {
		addRealFragment(superReference);
		return false;
	}

	public boolean visit(ThisReference thisReference, BlockScope scope) {
		addRealFragment(thisReference);
		return false;
	}

	public boolean visit(TrueLiteral trueLiteral, BlockScope scope) {
		addSmallFragment(trueLiteral);
		return false;
	}

	public boolean visit(UnaryExpression unaryExpression, BlockScope scope) {
		addRealFragment(unaryExpression);
		return false;
	}

	public int size() {
		return this.fragmentsList.size();
	}
}
