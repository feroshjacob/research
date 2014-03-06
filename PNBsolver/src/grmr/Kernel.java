package grmr;

import java.util.List;

public class Kernel {
	private String string;
	private Statement expressionStmt;
	public String getKernelName() {
		return string;
	}
	public void setKernelName(String string) {
		this.string = string;
	}
	public List<Statement> getReadWriteStmts() {
		return readwritestmts;
	}
	public void setReadWriteStmts(List<Statement> stmts) {
		this.readwritestmts = stmts;
	}
	public Kernel(String string, List<Statement> stmts, Statement stmt, List<Statement> decls) {
		super();
		this.string = string;
		this.readwritestmts = stmts;
		this.setDeclarations(decls);
		this.setExpressionStmt(stmt);
	}
	public Statement getExpressionStmt() {
		return expressionStmt;
	}
	public void setExpressionStmt(Statement expressionStmt) {
		this.expressionStmt = expressionStmt;
	}
	public List<Statement> getDeclarations() {
		return declarations;
	}
	public void setDeclarations(List<Statement> declarations) {
		this.declarations = declarations;
	}
	private List<Statement> readwritestmts;
	private List<Statement> declarations;

}
