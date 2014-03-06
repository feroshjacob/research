package cser.ast;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;

public class ASTRewriter {

	private ASTNode astNode = null;
	public ASTRewriter(ASTNode node) {
		this.astNode = node;
	}
	void doRewrite() {
		final ASTRewrite rewrite= ASTRewrite.create(astNode.getAST());
	}

}
