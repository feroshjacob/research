package sca;

import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier;

public class VariableDS {


	private String name = null;
	private String type = null;
	private String size = null;
	private String tType = null;
	private String parameter=null;

	public VariableDS(String identifier, String type, String size) {
		super();
		this.setName(identifier);
		this.setType(type);
		this.setSize(size);
	}

	public void setName(String identifier) {
		this.name = identifier;
	}

	public String getName() {
		return name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof VariableDS))
			return false;
		VariableDS ptrvVariable = (VariableDS) obj;
		return ptrvVariable.getName().equals(getName());

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return getName().hashCode();
	}

	@Override
	public String toString() {
		return "name=" + getName() + ", type=" + getType() + getSizeString();
	}

	private String getSizeString() {
		if (size != null)
			return ", size=" + getSize();
		return "";
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSize() {

		return size;
	}

	public String getTType() {
     	try {
			int val = Integer.parseInt(type);
			if (val == IASTSimpleDeclSpecifier.t_char)
				return "char";
			if (val == IASTSimpleDeclSpecifier.t_int)
				return "int";
			if (val == IASTSimpleDeclSpecifier.t_float)
				return "float";
		} catch (NumberFormatException e) {

		}
		return type;
	}

	public String getParameter() {
	      if(size!=null) return getTType() + "* " + name; 
	      return getTType() + " " + name;
	}
}
