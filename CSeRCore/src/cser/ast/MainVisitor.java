package cser.ast;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.AssertStatement;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.LabeledStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.SynchronizedStatement;
import org.eclipse.jdt.core.dom.ThrowStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jface.text.Position;

import cser.utils.PositionUtils;


public class MainVisitor extends ASTVisitor {

    private Position position =null;
	public MainVisitor(Position position) {
     this.position = position;
	}
	private List<ASTNode> statements = new ArrayList<ASTNode>();


	@Override
	public boolean visit(TryStatement node) {
		addStatement(node);
		return super.visit(node);
	}
	@Override
	public boolean visit(ArrayInitializer node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(SynchronizedStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(SwitchStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(ThrowStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(VariableDeclarationStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(ConstructorInvocation node) {
		addStatement(node);
		List arguments = node.arguments();
		for(int i=0;i< arguments.size();i++){
			addStatement((ASTNode)arguments.get(i));
		}
		return super.visit(node);

	}

	@Override
	public boolean visit(SuperConstructorInvocation node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(IfStatement node) {
		addStatement(node);
		addStatement(node.getExpression());
	

		return super.visit(node);
	}


	@Override
	public boolean visit(LabeledStatement node) {
		addStatement(node);
		return super.visit(node);
	}



	@Override
	public boolean visit(AssertStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(BreakStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(ContinueStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(DoStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(ForStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(WhileStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(EnhancedForStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(AnnotationTypeMemberDeclaration node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(EnumConstantDeclaration node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(Initializer node) {
		addStatement(node);
		return super.visit(node);
	}




	public boolean visit(MethodDeclaration node) {
		addStatement(node);
		return super.visit(node);

	}

	public boolean visit(MethodInvocation node) {
		addStatement(node);
		List arguments = node.arguments();
		for(int i=0;i< arguments.size();i++){
			addStatement((ASTNode)arguments.get(i));
		}
		return super.visit(node);
	}

	public boolean visit(FieldDeclaration node) {
		addStatement(node);
		return super.visit(node);

	}

	public boolean visit(ExpressionStatement node) {
		addStatement(node);
		return super.visit(node);
	}

	public boolean visit(ReturnStatement node) {
		addStatement(node);
		return super.visit(node);
	}


	public boolean visit(VariableDeclarationFragment nod) {

		addStatement(nod);
		return super.visit(nod);

	}

	public boolean visit(SingleVariableDeclaration nod) {

		addStatement(nod);
		return super.visit(nod);

	}

	public boolean visit(Block node) {
		addStatement(node);
		return super.visit(node);
	}

	public boolean visit(ImportDeclaration node) {
		addStatement(node);
		return super.visit(node);
	}

	public boolean visit(NumberLiteral node) {
		addStatement(node);
		return super.visit(node);
	}

	

	/*
	 * 
	 * Something is wrong not able to use this
	 */
	/*
	 * @Override public boolean visit(Modifier node) { addStatement(node);
	 * return super.visit(node); }
	 */
	@Override
	public boolean visit(PackageDeclaration node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(TypeDeclaration node) {
		addStatement(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(StringLiteral node) {
		addStatement(node);
		return super.visit(node);
	}

	
	public boolean visit(SimpleName node) {
		addStatement(node);
		return super.visit(node);
	}
	
	
	
	
	public List<ASTNode> getStatements() {
		return statements;
	}


	private void addStatement(ASTNode node) {
		if(position==null){
			statements.add(node);
			return;
		}
		if(position !=null && checkInside(node) )  
		statements.add(node);
	}
	private boolean checkInside(ASTNode node) {
		if(PositionUtils.contains(position, new Position(node.getStartPosition(),node.getLength())))
		return true;
		return false;

	}
	
}