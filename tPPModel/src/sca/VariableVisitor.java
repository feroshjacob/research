package sca;

import java.util.HashMap;
import java.util.Hashtable;

import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTArrayDeclarator;
import org.eclipse.cdt.core.dom.ast.IASTArrayModifier;
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression;
import org.eclipse.cdt.core.dom.ast.IASTDeclSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTDeclarator;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTFieldDeclarator;
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression;
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition;
import org.eclipse.cdt.core.dom.ast.IASTNamedTypeSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTTypeId;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTDeclarator;
import org.eclipse.cdt.core.parser.util.HashTable;



public class VariableVisitor extends ASTVisitor{
	private Hashtable<String, VariableDS> symbolTable ;
	private Hashtable<String, String> typedefinitions;
	
	public VariableVisitor() {
	 this.shouldVisitDeclarations =true;
	 this.shouldVisitExpressions = true;
	 this.symbolTable=new  Hashtable<String, VariableDS>();
	 this.typedefinitions =  new Hashtable<String, String>();
	}

	
	@Override
	public int visit(IASTArrayModifier arrayModifier) {
		// TODO Auto-generated method stub
		return super.visit(arrayModifier);
	}
	
	@Override
	public int visit(IASTDeclaration declaration) {
		
		if(!(declaration instanceof IASTSimpleDeclaration )){
		return super.visit(declaration);
		}

		String name,type,size=null;
		IASTSimpleDeclaration simpleDeclaration = (IASTSimpleDeclaration) declaration;
		if(simpleDeclaration.getDeclSpecifier().getStorageClass()== IASTDeclSpecifier.sc_typedef){
			IASTSimpleDeclSpecifier simpleDeclSpecifier = (IASTSimpleDeclSpecifier)simpleDeclaration.getDeclSpecifier();
			typedefinitions.put(simpleDeclaration.getDeclarators()[0].getName().toString(), simpleDeclSpecifier.getType()+"");
			return super.visit(declaration);
		}
		 type = simpleDeclaration.getDeclSpecifier().getRawSignature();
		if(simpleDeclaration.getDeclSpecifier() instanceof IASTNamedTypeSpecifier && typedefinitions.containsKey(type))
			type=  typedefinitions.get(type);
	   
	    
	    for(int i=0;i<simpleDeclaration.getDeclarators().length;i++){
			
			IASTDeclarator declarator = simpleDeclaration.getDeclarators()[i];
			
			if(declarator instanceof IASTFieldDeclarator ){
				IASTFieldDeclarator fieldDeclarator = (IASTFieldDeclarator)declarator;
				name = fieldDeclarator.getName().toString();
			}
			else if (declarator instanceof IASTArrayDeclarator){
				IASTArrayDeclarator arrayDeclarator = (IASTArrayDeclarator) declarator;
				name = arrayDeclarator.getName().toString();
				if(arrayDeclarator.getArrayModifiers().length>0) {
					IASTArrayModifier arrayModifier = arrayDeclarator.getArrayModifiers()[0];
					size =arrayModifier.getConstantExpression().getRawSignature();
				}
			}
			else if(declarator instanceof ICPPASTDeclarator ){
				ICPPASTDeclarator varDeclarator = (ICPPASTDeclarator)declarator;
				name = varDeclarator.getName().toString();
			}
			
			else{
				//System.out.println(declarator.getClass().getName()+":" + declarator.getRawSignature());
				return super.visit(declaration);
			}
			
			if(symbolTable.get(name)==null)
				symbolTable.put(name,new VariableDS(name, type, size));
			else {
				VariableDS pv = symbolTable.get(name);
				pv.setType(type);
				}
		}
		
		return super.visit(declaration);
	}
	@Override
	public int visit(IASTExpression expression) {
		
	//	System.out.println(expression.getRawSignature() + ":" + expression.getClass().getName());
		if(!(expression instanceof IASTFunctionCallExpression)) return super.visit(expression);
		IASTFunctionCallExpression functionCallExpression = (IASTFunctionCallExpression)expression;
		 String name =  functionCallExpression.getFunctionNameExpression().getRawSignature();
		 if(!(name.equals("malloc"))) return super.visit(expression);
		 IASTBinaryExpression binaryExpression = getBinaryExpression(functionCallExpression);
		 String key =null;
		 if(binaryExpression==null) {
			 IASTDeclarator decla= getDeclarator(functionCallExpression);
			 key =  decla.getName().toString();
		 }
		 else {
			key = binaryExpression.getOperand1().getRawSignature(); 
		 }
			String size = functionCallExpression.getParameterExpression().getRawSignature();
		 VariableDS pv = symbolTable.get(key);
		 if(pv==null) new VariableDS(binaryExpression.getOperand1().getRawSignature(), "", size);
		 else pv.setSize(size);
		return super.visit(expression);
		
	}

	private IASTBinaryExpression getBinaryExpression(
			IASTFunctionCallExpression functionCallExpression) {
		    IASTNode node = functionCallExpression.getParent();
		    
		    int i=0;
		    while(node!=null &&  !(node instanceof IASTBinaryExpression) && !(node instanceof IASTFunctionDefinition)){
		    	
		    	node = node.getParent();
		    }
		    if(node==null||node instanceof IASTFunctionDefinition) return null;
		    else return (IASTBinaryExpression)node;

	}
	private IASTDeclarator getDeclarator(
			IASTFunctionCallExpression functionCallExpression) {
		    IASTNode node = functionCallExpression.getParent();
		    
		    int i=0;
		    while(node!=null &&  !(node instanceof IASTDeclarator)&& !(node instanceof IASTFunctionDefinition)){
		    	
		    	node = node.getParent();
		    	
		    }
		    if(node==null||node instanceof IASTFunctionDefinition) return null;
			
		    
		    
		    else return (IASTDeclarator)node;

	}
	public Hashtable<String, VariableDS> getSymbolTable () {
		return symbolTable;
	}
	public Hashtable<String, String> getTypeDefintions () {
		return typedefinitions;
	}

	

}
