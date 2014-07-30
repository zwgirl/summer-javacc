/*******************************************************************************
 * Copyright (c) 2008, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.summer.sdt.internal.codeassist;

import java.util.Map;

import org.summer.sdt.core.IAnnotation;
import org.summer.sdt.core.ICompilationUnit;
import org.summer.sdt.core.IMemberValuePair;
import org.summer.sdt.internal.compiler.ast.ASTNode;
import org.summer.sdt.internal.compiler.ast.Expression;
import org.summer.sdt.internal.compiler.ast.MemberValuePair;
import org.summer.sdt.internal.compiler.ast.ParameterizedQualifiedTypeReference;
import org.summer.sdt.internal.compiler.ast.ParameterizedSingleTypeReference;
import org.summer.sdt.internal.compiler.ast.TypeReference;
import org.summer.sdt.internal.compiler.parser.Parser;
import org.summer.sdt.internal.core.AnnotatableInfo;
import org.summer.sdt.internal.core.Annotation;
import org.summer.sdt.internal.core.CompilationUnit;
import org.summer.sdt.internal.core.CompilationUnitElementInfo;
import org.summer.sdt.internal.core.CompilationUnitStructureRequestor;
import org.summer.sdt.internal.core.ImportContainer;
import org.summer.sdt.internal.core.ImportDeclaration;
import org.summer.sdt.internal.core.Initializer;
import org.summer.sdt.internal.core.JavaElement;
import org.summer.sdt.internal.core.JavaModelManager;
import org.summer.sdt.internal.core.PackageDeclaration;
import org.summer.sdt.internal.core.SourceField;
import org.summer.sdt.internal.core.SourceMethod;
import org.summer.sdt.internal.core.SourceType;
import org.summer.sdt.internal.core.TypeParameter;
import org.summer.sdt.internal.codeassist.complete.CompletionOnMarkerAnnotationName;
import org.summer.sdt.internal.codeassist.complete.CompletionOnMemberValueName;
import org.summer.sdt.internal.codeassist.complete.CompletionOnParameterizedQualifiedTypeReference;
import org.summer.sdt.internal.codeassist.complete.CompletionOnQualifiedNameReference;
import org.summer.sdt.internal.codeassist.complete.CompletionOnQualifiedTypeReference;
import org.summer.sdt.internal.codeassist.complete.CompletionOnSingleNameReference;
import org.summer.sdt.internal.codeassist.complete.CompletionOnSingleTypeReference;
import org.summer.sdt.internal.codeassist.impl.AssistAnnotation;
import org.summer.sdt.internal.codeassist.impl.AssistImportContainer;
import org.summer.sdt.internal.codeassist.impl.AssistImportDeclaration;
import org.summer.sdt.internal.codeassist.impl.AssistInitializer;
import org.summer.sdt.internal.codeassist.impl.AssistPackageDeclaration;
import org.summer.sdt.internal.codeassist.impl.AssistSourceField;
import org.summer.sdt.internal.codeassist.impl.AssistSourceMethod;
import org.summer.sdt.internal.codeassist.impl.AssistSourceType;
import org.summer.sdt.internal.codeassist.impl.AssistTypeParameter;

@SuppressWarnings({"rawtypes", "unchecked"})
public class CompletionUnitStructureRequestor extends CompilationUnitStructureRequestor {
	private ASTNode assistNode;

	private Map bindingCache;
	private Map elementCache;
	private Map elementWithProblemCache;

	public CompletionUnitStructureRequestor(
			ICompilationUnit unit,
			CompilationUnitElementInfo unitInfo,
			Parser parser,
			ASTNode assistNode,
			Map bindingCache,
			Map elementCache,
			Map elementWithProblemCache,
			Map newElements) {
		super(unit, unitInfo, newElements);
		this.parser = parser;
		this.assistNode = assistNode;
		this.bindingCache = bindingCache;
		this.elementCache = elementCache;
		this.elementWithProblemCache = elementWithProblemCache;
	}

	protected Annotation createAnnotation(JavaElement parent, String name) {
		return new AssistAnnotation(parent, name, this.newElements);
	}

	protected SourceField createField(JavaElement parent, FieldInfo fieldInfo) {
		String fieldName = JavaModelManager.getJavaModelManager().intern(new String(fieldInfo.name));
		AssistSourceField field = new AssistSourceField(parent, fieldName, this.bindingCache, this.newElements);
		if (fieldInfo.node.binding != null) {
			this.bindingCache.put(field, fieldInfo.node.binding);
			this.elementCache.put(fieldInfo.node.binding, field);
		} else {
			this.elementWithProblemCache.put(fieldInfo.node, field);
		}
		return field;
	}

	protected ImportContainer createImportContainer(ICompilationUnit parent) {
		return new AssistImportContainer((CompilationUnit)parent, this.newElements);
	}

	protected ImportDeclaration createImportDeclaration(ImportContainer parent, String name, boolean onDemand) {
		return new AssistImportDeclaration(parent, name, onDemand, this.newElements);
	}

	protected Initializer createInitializer(JavaElement parent) {
		return new AssistInitializer(parent, 1, this.bindingCache, this.newElements);
	}

	protected SourceMethod createMethodHandle(JavaElement parent, MethodInfo methodInfo) {
		String selector = JavaModelManager.getJavaModelManager().intern(new String(methodInfo.name));
		String[] parameterTypeSigs = convertTypeNamesToSigs(methodInfo.parameterTypes);
		AssistSourceMethod method = new AssistSourceMethod(parent, selector, parameterTypeSigs, this.bindingCache, this.newElements);
		if (methodInfo.node.binding != null) {
			this.bindingCache.put(method, methodInfo.node.binding);
			this.elementCache.put(methodInfo.node.binding, method);
		} else {
			this.elementWithProblemCache.put(methodInfo.node, method);
		}
		return method;
	}

	protected PackageDeclaration createPackageDeclaration(JavaElement parent, String name) {
		return new AssistPackageDeclaration((CompilationUnit) parent, name, this.newElements);
	}

	protected SourceType createTypeHandle(JavaElement parent, TypeInfo typeInfo) {
		String nameString= new String(typeInfo.name);
		AssistSourceType type = new AssistSourceType(parent, nameString, this.bindingCache, this.newElements);
		if (typeInfo.node.binding != null) {
			this.bindingCache.put(type, typeInfo.node.binding);
			this.elementCache.put(typeInfo.node.binding, type);
		} else {
			this.elementWithProblemCache.put(typeInfo.node, type);
		}
		return type;
	}

	protected TypeParameter createTypeParameter(JavaElement parent, String name) {
		return new AssistTypeParameter(parent, name, this.newElements);
	}

	protected IAnnotation acceptAnnotation(
			org.summer.sdt.internal.compiler.ast.Annotation annotation,
			AnnotatableInfo parentInfo,
			JavaElement parentHandle) {
		if (annotation instanceof CompletionOnMarkerAnnotationName) {
			if (hasEmptyName(annotation.type, this.assistNode)) {
				super.acceptAnnotation(annotation, null, parentHandle);
				return null;
			}
		}
		return super.acceptAnnotation(annotation, parentInfo, parentHandle);
	}

	protected Object getMemberValue(
			org.summer.sdt.internal.core.MemberValuePair memberValuePair,
			Expression expression) {
		if (expression instanceof CompletionOnSingleNameReference) {
			CompletionOnSingleNameReference reference = (CompletionOnSingleNameReference) expression;
			if (reference.token.length == 0) return null;
		} else if (expression instanceof CompletionOnQualifiedNameReference) {
			CompletionOnQualifiedNameReference reference = (CompletionOnQualifiedNameReference) expression;
			if (reference.tokens[reference.tokens.length - 1].length == 0) return null;
		}
		return super.getMemberValue(memberValuePair, expression);
	}
	protected IMemberValuePair[] getMemberValuePairs(MemberValuePair[] memberValuePairs) {
		int membersLength = memberValuePairs.length;
		int membersCount = 0;
		IMemberValuePair[] members = new IMemberValuePair[membersLength];
		next : for (int j = 0; j < membersLength; j++) {
			if (memberValuePairs[j] instanceof CompletionOnMemberValueName) continue next;

			members[membersCount++] = getMemberValuePair(memberValuePairs[j]);
		}

		if (membersCount > membersLength) {
			System.arraycopy(members, 0, members, 0, membersCount);
		}
		return members;
	}

	protected static boolean hasEmptyName(TypeReference reference, ASTNode assistNode) {
		if (reference == null) return false;

		// https://bugs.eclipse.org/bugs/show_bug.cgi?id=397070
		if (reference != assistNode &&
				reference.sourceStart <= assistNode.sourceStart && assistNode.sourceEnd <= reference.sourceEnd) return false;

		if (reference instanceof CompletionOnSingleTypeReference ||
				reference instanceof CompletionOnQualifiedTypeReference ||
				reference instanceof CompletionOnParameterizedQualifiedTypeReference) {
			char[][] typeName = reference.getTypeName();
			if (typeName[typeName.length - 1].length == 0) return true;
		}
		if (reference instanceof ParameterizedSingleTypeReference) {
			ParameterizedSingleTypeReference parameterizedReference = (ParameterizedSingleTypeReference) reference;
			TypeReference[] typeArguments = parameterizedReference.typeArguments;
			if (typeArguments != null) {
				for (int i = 0; i < typeArguments.length; i++) {
					if (hasEmptyName(typeArguments[i], assistNode)) return true;
				}
			}
		} else if (reference instanceof ParameterizedQualifiedTypeReference) {
			ParameterizedQualifiedTypeReference parameterizedReference = (ParameterizedQualifiedTypeReference) reference;
			TypeReference[][] typeArguments = parameterizedReference.typeArguments;
			if (typeArguments != null) {
				for (int i = 0; i < typeArguments.length; i++) {
					if (typeArguments[i] != null) {
						for (int j = 0; j < typeArguments[i].length; j++) {
							if (hasEmptyName(typeArguments[i][j], assistNode)) return true;
						}
					}
				}
			}
		}
		return false;
	}
}
