/**
 */
package org.summer.sdt.internal.compiler.xaml;

import org.summer.sdt.internal.compiler.ast.Expression;
import org.summer.sdt.internal.compiler.ast.FieldReference;
import org.summer.sdt.internal.compiler.ast.TypeReference;

/**
 * 
 * @author cym
 *
 */
public class AbstractAttribute {
	protected TypeReference type;
	protected FieldReference field;
	protected Expression value;

	protected AbstractAttribute() {
		super();
	}

	public FieldReference getField() {
		return field;
	}

	public void setField(FieldReference newField) {
		field = newField;
	}

	public Expression getValue() {
		return value;
	}

	public void setValue(Expression newValue) {
		this.value = newValue;
	}

	public TypeReference getType() {
		return type;
	}

	public void setType(TypeReference newType) {
		type = newType;
	}

}
