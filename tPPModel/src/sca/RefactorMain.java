package sca;

import grmr.Content;
import grmr.Declaration;
import grmr.NameTypeAndFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

import main.NameAndContent;

import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorIncludeStatement;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorPragmaStatement;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.misc.ErrorBuffer;

import utils.ParseUtils;
import utils.ResourceUtils;

public class RefactorMain {
private String mainContent;
private Hashtable<String, HotspotDS> hotspots;
private Content content;
private IASTPreprocessorIncludeStatement includeStatement;
private StringBuffer abstractHeader = new StringBuffer();

private StringBuffer refactoredContent= new StringBuffer();
private Hashtable<String, VariableDS> symbolTable;
	
	public RefactorMain(Content content,ParserHelper helper, String mainContent) {
		this.mainContent = mainContent;
		this.hotspots = helper.getHotspots();
		this.content = content;
		this.symbolTable = helper.getSymbolTable();
		this.includeStatement= helper.getIncludeStatement();
	}
	public void refactor() {
		if(hotspots.size()<1) return;
		System.out.println("Modifying main file");
		String tobeReplaced = includeStatement.getRawSignature() +"\n#ifdef TPPMODEL_DEFINED \n#include \"pp_abstract.h\"\n#endif  ";
		String temp =ParseUtils.replaceNodeinString(includeStatement,tobeReplaced,mainContent);
		refactoredContent = new StringBuffer(temp);
		ParserHelper helper = new ParserHelper(refactoredContent.toString());
		hotspots = helper.getHotspots();
		symbolTable= helper.getSymbolTable();
		for(String key : hotspots.keySet()){
			 		String out = getReplacementText(key, hotspots.get(key).getStatement().getRawSignature());
			 		String[] strs = out.split("SEPARATEDBY");
			 		String maincontent =  strs[1];
			 		int length = hotspots.get(key).getStatement().getFileLocation().getNodeOffset()+
			 				hotspots.get(key).getStatement().getFileLocation().getNodeLength()- hotspots.get(key).getPragmaStatement().getFileLocation().getNodeOffset(); 
			 		temp =ResourceUtils.replaceContentbyString(hotspots.get(key).getPragmaStatement().getFileLocation().getNodeOffset(),length, maincontent, refactoredContent.toString());
					refactoredContent = new StringBuffer(temp);
			 		abstractHeader.append(strs[0]);
				   
	   }
		
	}
	private String getReplacementText(String key, String statementstr) {
		STGroup group = new STGroupFile(ResourceUtils.getTemplatePath()+ "mainfile.stg" );
		ST st = group.getInstanceOf("template");
		st.add("name", key);

		Declaration declaration = content.getDeclaration(key);
		setInput(st, declaration);
		setOutput(st, declaration);
		st.add("statement", statementstr);
		
   String out = st.render();
		return out;
	}

	private void setInput(ST st, Declaration declaration) {
		for (int i = 0; i < declaration.getInputVariables().size(); i++) {
			String variable = declaration.getInputVariables().get(i);
			VariableDS ds = symbolTable.get(variable);
			if (!symbolTable.containsKey(variable))
				throw new RuntimeException("Variable not identified "
						+ variable);
			if (ds.getSize() != null)
				st.add("_ptrs", ds);
			else
				st.add("_vars", ds);

		}
	}
	private void setOutput(ST st, Declaration declaration) {
		if (declaration.getOutputVariables().size() > 1)
			throw new RuntimeException(
					"Only one output variable allowed");
		VariableDS ds = symbolTable.get(declaration
				.getOutputVariables().get(0));
		if (ds.getSize() == null || ds.getSize().length() < 1)
			throw new RuntimeException(
					"Only pointer output variable allowed");

		st.add("o_ptr", ds);
	}
	public NameAndContent getAbstractHeader() {
		return new NameAndContent("pp_abstract.h",abstractHeader.toString());
	}
	public NameAndContent getRefactoredContent() {
		return new NameAndContent(content.getDeclarations().get(0).getFileName(),refactoredContent.toString());
	}
 
}
