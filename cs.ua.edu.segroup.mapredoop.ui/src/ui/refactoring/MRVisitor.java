package ui.refactoring;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.MethodDeclaration;

public class MRVisitor extends ASTVisitor {
	
	private Block mapBlock = null;
	private Block reduceBlock =null;
	
	public Block getMapBlock() {
		return mapBlock;
	}

	public void setMapBlock(Block mapBlock) {
		this.mapBlock = mapBlock;
	}

	public Block getReduceBlock() {
		return reduceBlock;
	}

	public void setReduceBlock(Block reduceBlock) {
		this.reduceBlock = reduceBlock;
	}

	public boolean visit(MethodDeclaration node) {
		
		if(node.getName().getIdentifier().equals("map")) mapBlock = node.getBody();
		if(node.getName().getIdentifier().equals("reduce")) reduceBlock = node.getBody();	
		
		return super.visit(node);
	}

}
