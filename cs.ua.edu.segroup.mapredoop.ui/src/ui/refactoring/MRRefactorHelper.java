package ui.refactoring;

import hdp.parser.HelperHPDParser;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.internal.corext.ValidateEditException;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;

public class MRRefactorHelper {
	protected CompilationUnit astRoot =null;
	protected AST ast =null; 
	protected  ICompilationUnit unit =null;
	protected MRVisitor visitor = null;
	protected ASTRewrite rewrite =null;
	
	public MRRefactorHelper(ICompilationUnit unit) {
		ASTParser parser = ASTParser.newParser(AST.JLS3);
		parser.setSource(unit);
		astRoot = (CompilationUnit) parser.createAST(null);
		//parser.setResolveBindings(true);
		ast = astRoot.getAST();
		this.unit = unit;   
		visitor = new MRVisitor();
        astRoot.accept(visitor);
	}
	
	public void replaceMapReduceCode (String mapCode, String reduceCode) {
		rewrite = ASTRewrite.create(astRoot.getAST());
  	   Statement repMap = (Statement) rewrite.createStringPlaceholder(modifyString(mapCode), ASTNode.BLOCK);
  	  ListRewrite listrewriteMap=  rewrite.getListRewrite(visitor.getMapBlock(), Block.STATEMENTS_PROPERTY);
  	ListRewrite listrewriteRed=  rewrite.getListRewrite(visitor.getReduceBlock(), Block.STATEMENTS_PROPERTY);
  	 Statement repRed = (Statement) rewrite.createStringPlaceholder(modifyString(reduceCode), ASTNode.BLOCK);
  	 listrewriteMap.insertFirst(repMap, null);
  	 listrewriteRed.insertFirst(repRed, null);
			try {
				JavaModelUtil.applyEdit(unit, rewrite.rewriteAST(), true, null);
			} catch (ValidateEditException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	private String mapName ;
	
	private String modifyString(String text){
		List<String> params = getParams(text);
		StringBuffer buffer =  new StringBuffer(mapName+"(");
		for(String str : params){
			
			buffer.append(isNative(str)+",");
		}
		buffer.append("context");
		return "new Utils()."+buffer.toString()+");";
	}

	private String isNative(String str) {
		String type = HelperHPDParser.name2Type.get(str);
		if(HelperHPDParser.isNative(type))return str+".get()";
		return str;
	}

	private List<String> getParams(String text) {
		List<String> params = new ArrayList<String>();
		 String[] list = text.split("\\(");
		 mapName =list[0].trim().replace('[', ' ');
				
		 String str = list[1].split("\\)")[0];
		 String finals[] = str.split(",");
		 for(int i=0; i<finals.length;i++){
			 params.add(finals[i].trim());
		 }
		 return params;
	}
}
