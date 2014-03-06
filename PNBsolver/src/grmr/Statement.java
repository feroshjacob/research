package grmr;

import java.util.List;

public class Statement {

	private String string1;
	private String string2;
	private int type;
	public Statement(String string1, String string2, int type) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		this.type = type;
	}
	private int opType;
	private List<String> variables;
	public Statement(int op, List<String> vars) {
		this.setOpType(op);
		this.setVariables(vars);
	}
	
	private String id;
	private Expression outerExpr;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Expression getOuterExpr() {
		return outerExpr;
	}
	public void setOuterExpr(Expression outerExpr) {
		this.outerExpr = outerExpr;
	}
	public Expression getInnerExpr() {
		return innerExpr;
	}
	public void setInnerExpr(Expression innerExpr) {
		this.innerExpr = innerExpr;
	}
	private Expression innerExpr;
	
	public Statement(String id, Expression expr1, Expression expr2) {
	 this.id=id;
	 this.innerExpr=expr2;
	 this.outerExpr=expr1;
	}
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<String> getVariables() {
		return variables;
	}
	public void setVariables(List<String> variables) {
		this.variables = variables;
	}
	public int getOpType() {
		return opType;
	}
	public void setOpType(int opType) {
		this.opType = opType;
	}
	

}
   