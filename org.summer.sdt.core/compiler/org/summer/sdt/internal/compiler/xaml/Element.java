/**
 */
package org.summer.sdt.internal.compiler.xaml;

import java.util.List;

import org.summer.sdt.internal.compiler.ast.TypeReference;
import org.summer.sdt.internal.compiler.xaml.AbstractAttribute;
import org.summer.sdt.internal.compiler.xaml.Element;

/**
 * 
 * @author cym
 *
 */
public class Element {
	protected List<Element> contents;
	protected TypeReference type;
	protected TypeReference closeType;
	protected List<AbstractAttribute> properties;

	protected Element() {
		super();
	}

	public List<Element> getContents() {
		return contents;
	}

	public TypeReference getType() {
		return type;
	}

	public void setType(TypeReference newType) {
		type = newType;
	}

	public TypeReference getCloseType() {
		return closeType;
	}

	public void setCloseType(TypeReference newCloseType) {
		closeType = newCloseType;
	}

	public List<AbstractAttribute> getProperties() {
		return properties;
	}
}
