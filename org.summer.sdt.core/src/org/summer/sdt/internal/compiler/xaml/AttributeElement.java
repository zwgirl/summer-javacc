/**
 */
package org.summer.sdt.internal.compiler.xaml;

import org.summer.sdt.internal.compiler.ast.FieldReference;

/**
 * 
 * @author cym
 *
 */
public class AttributeElement extends Element {
	protected FieldReference field;
	protected FieldReference closeField;

	protected AttributeElement() {
		super();
	}

	public FieldReference getField() {
		return field;
	}

	public void setField(FieldReference newField) {
		field = newField;
	}

	public FieldReference getCloseField() {
		return closeField;
	}

	public void setCloseField(FieldReference newCloseField) {
		closeField = newCloseField;
	}

}