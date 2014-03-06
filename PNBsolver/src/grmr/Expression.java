package grmr;

import java.util.List;

public class Expression {

	private Expression expression1;
	private Expression expression2;
	private String optype;
	private String special;

	public Expression(Expression expression1, Expression expression2,
			String optype) {
		super();
		this.expression1 = expression1;
		this.setExpression2(expression2);
		this.optype = optype;
	}

	private String identifier;

	public Expression(String id) {
		this.setIdentifier(id);
	}

	public Expression(Expression e1, List<Expression> exprlist,
			List<String> opslist) {
		this.expression1 = e1;

		if (exprlist.size() < 2) {
			this.expression2 = exprlist.get(0);
			this.optype = opslist.get(0);

		} else {
			Expression tmpExpression = new Expression(exprlist.get(exprlist
					.size() - 2), exprlist.get(exprlist.size() - 1),
					opslist.get(opslist.size() - 1));
			this.optype = opslist.get(0);
			for (int i = exprlist.size() - 3; i >= 0; i--) {
				Expression expression = exprlist.get(i);
				Expression expression2 = new Expression(expression,
						tmpExpression, opslist.get(i));
				tmpExpression = expression2;
			}
			this.expression2 = tmpExpression;
		}
	}

	public Expression(Expression expr, String special) {
		this.expression1=expr;
		this.special=special;
		
	}
     private int pow_n ;
	public Expression(Expression expr, int n) {
	    this.expression1=expr;
	    this.special="pow";
	    this.pow_n=n;
	}

	public Expression getExpression1() {
		return expression1;
	}

	public void setExpression1(Expression expression) {
		this.expression1 = expression;
	}

	public String getOptype() {
		return optype;
	}

	public void setOptype(String optype) {
		this.optype = optype;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}


	public Expression getExpression2() {
		return expression2;
	}

	public void setExpression2(Expression expression2) {
		this.expression2 = expression2;
	}
	@Override
	public String toString() {
		if(special!=null && special.equals("exp")) return "exp( " + getExpression1()+")"; 
		if(special!=null && special.equals("pow")) return  "pow( " + getExpression1() +"," +pow_n +")";
		if (optype == null ){
			if(this.identifier.equals("R")) return "sqrt(t1)";
		
			if(this.identifier.equals("Q")) return "q[i-1]";
			return this.identifier;
		}
		return getExpression1() + " " + getOptype() + " " + getExpression2();
	}


}
