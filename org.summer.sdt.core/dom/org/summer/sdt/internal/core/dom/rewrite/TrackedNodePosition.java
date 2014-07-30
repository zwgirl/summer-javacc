/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.summer.sdt.internal.core.dom.rewrite;

import org.eclipse.text.edits.TextEdit;
import org.eclipse.text.edits.TextEditGroup;
import org.eclipse.jface.text.IRegion;
import org.summer.sdt.core.dom.ASTNode;
import org.summer.sdt.core.dom.rewrite.ITrackedNodePosition;

/**
 *
 */
public class TrackedNodePosition implements ITrackedNodePosition {

	private final TextEditGroup group;
	private final ASTNode node;

	public TrackedNodePosition(TextEditGroup group, ASTNode node) {
		this.group= group;
		this.node= node;
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.internal.corext.dom.ITrackedNodePosition#getStartPosition()
	 */
	public int getStartPosition() {
		if (this.group.isEmpty()) {
			return this.node.getStartPosition();
		}
		IRegion coverage= TextEdit.getCoverage(this.group.getTextEdits());
		if (coverage == null) {
			return this.node.getStartPosition();
		}
		return coverage.getOffset();
	}

	/* (non-Javadoc)
	 * @see org.summer.sdt.internal.corext.dom.ITrackedNodePosition#getLength()
	 */
	public int getLength() {
		if (this.group.isEmpty()) {
			return this.node.getLength();
		}
		IRegion coverage= TextEdit.getCoverage(this.group.getTextEdits());
		if (coverage == null) {
			return this.node.getLength();
		}
		return coverage.getLength();
	}
}
