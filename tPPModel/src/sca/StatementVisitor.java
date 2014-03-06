package sca;

import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTFileLocation;
import org.eclipse.cdt.core.dom.ast.IASTStatement;

public class StatementVisitor extends ASTVisitor {
	
	private IASTFileLocation fileLocation;
	public StatementVisitor(IASTFileLocation iastFileLocation) {
     this.fileLocation = iastFileLocation;
	 this.shouldVisitStatements=true;
	}
	private IASTStatement nextStatement;
	public IASTStatement getNextStatement() {
		return nextStatement;
	}
	@Override
	public int visit(IASTStatement statement) {
		if(valueof(statement) < valueof(fileLocation)) return super.visit(statement);
		if(nextStatement ==null) nextStatement = statement;
		if(statement.getFileLocation().getNodeOffset() < nextStatement.getFileLocation().getNodeOffset()){
			nextStatement=statement;
		}

			
		return super.visit(statement);
	}
	private int valueof(IASTStatement statement) {
		 return valueof(statement.getFileLocation());
	}
	private int valueof(IASTFileLocation fileLocation2) {
		return fileLocation2.getNodeOffset();
	}
	

}
