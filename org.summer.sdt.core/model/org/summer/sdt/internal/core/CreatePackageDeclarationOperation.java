/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.summer.sdt.internal.core;

import org.eclipse.core.runtime.IStatus;
import org.summer.sdt.core.ICompilationUnit;
import org.summer.sdt.core.IImportDeclaration;
import org.summer.sdt.core.IJavaElement;
import org.summer.sdt.core.IJavaModelStatus;
import org.summer.sdt.core.IJavaModelStatusConstants;
import org.summer.sdt.core.IJavaProject;
import org.summer.sdt.core.IType;
import org.summer.sdt.core.JavaConventions;
import org.summer.sdt.core.JavaCore;
import org.summer.sdt.core.JavaModelException;
import org.summer.sdt.core.dom.AST;
import org.summer.sdt.core.dom.ASTNode;
import org.summer.sdt.core.dom.CompilationUnit;
import org.summer.sdt.core.dom.Name;
import org.summer.sdt.core.dom.PackageDeclaration;
import org.summer.sdt.core.dom.StructuralPropertyDescriptor;
import org.summer.sdt.core.dom.rewrite.ASTRewrite;
import org.summer.sdt.internal.core.util.Messages;

/**
 * <p>This operation adds/replaces a package declaration in an existing compilation unit.
 * If the compilation unit already includes the specified package declaration,
 * it is not generated (it does not generate duplicates).
 *
 * <p>Required Attributes:<ul>
 *  <li>Compilation unit element
 *  <li>Package name
 * </ul>
 */
public class CreatePackageDeclarationOperation extends CreateElementInCUOperation {
	/**
	 * The name of the package declaration being created
	 */
	protected String name = null;
/**
 * When executed, this operation will add a package declaration to the given compilation unit.
 */
public CreatePackageDeclarationOperation(String name, ICompilationUnit parentElement) {
	super(parentElement);
	this.name= name;
}
protected StructuralPropertyDescriptor getChildPropertyDescriptor(ASTNode parent) {
	return CompilationUnit.PACKAGE_PROPERTY;
}
protected ASTNode generateElementAST(ASTRewrite rewriter, ICompilationUnit cu) throws JavaModelException {
	//look for an existing package declaration
	IJavaElement[] children = getCompilationUnit().getChildren();
	for (int i = 0; i < children.length; i++) {
		if (children[i].getElementType() ==  IJavaElement.PACKAGE_DECLARATION && this.name.equals(children[i].getElementName())) {
			//equivalent package declaration already exists
			this.creationOccurred = false;
			return null;
		}
	}
	AST ast = this.cuAST.getAST();
	PackageDeclaration pkgDeclaration = ast.newPackageDeclaration();
	Name astName = ast.newName(this.name);
	pkgDeclaration.setName(astName);
	return pkgDeclaration;
}
/**
 * Creates and returns the handle for the element this operation created.
 */
protected IJavaElement generateResultHandle() {
	return getCompilationUnit().getPackageDeclaration(this.name);
}
/**
 * @see CreateElementInCUOperation#getMainTaskName()
 */
public String getMainTaskName(){
	return Messages.operation_createPackageProgress;
}
/**
 * Sets the correct position for new package declaration:<ul>
 * <li> before the first import
 * <li> if no imports, before the first type
 * <li> if no type - first thing in the CU
 * <li>
 */
protected void initializeDefaultPosition() {
	try {
		ICompilationUnit cu = getCompilationUnit();
		IImportDeclaration[] imports = cu.getImports();
		if (imports.length > 0) {
			createBefore(imports[0]);
			return;
		}
		IType[] types = cu.getTypes();
		if (types.length > 0) {
			createBefore(types[0]);
			return;
		}
	} catch (JavaModelException e) {
		// cu doesn't exist: ignore
	}
}
/**
 * Possible failures: <ul>
 *  <li>NO_ELEMENTS_TO_PROCESS - no compilation unit was supplied to the operation
 *  <li>INVALID_NAME - a name supplied to the operation was not a valid
 * 		package declaration name.
 * </ul>
 * @see IJavaModelStatus
 * @see JavaConventions
 */
public IJavaModelStatus verify() {
	IJavaModelStatus status = super.verify();
	if (!status.isOK()) {
		return status;
	}
	IJavaProject project = getParentElement().getJavaProject();
	if (JavaConventions.validatePackageName(this.name, project.getOption(JavaCore.COMPILER_SOURCE, true), project.getOption(JavaCore.COMPILER_COMPLIANCE, true)).getSeverity() == IStatus.ERROR) {
		return new JavaModelStatus(IJavaModelStatusConstants.INVALID_NAME, this.name);
	}
	return JavaModelStatus.VERIFIED_OK;
}
}
