package sca;

import java.util.Hashtable;

import org.eclipse.cdt.core.dom.ast.IASTPreprocessorIncludeStatement;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorMacroDefinition;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorPragmaStatement;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorStatement;
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;

import utils.ParseUtils;
import utils.ResourceUtils;

public class ParserHelper {
	private String content;
	private VariableVisitor variableVisitor;
	private Hashtable<String, VariableDS>  symbolTable;
	private Hashtable<String, HotspotDS> hotspots;
	private IASTPreprocessorIncludeStatement includeStatement;
	public Hashtable<String, HotspotDS> getHotspots() {
		return hotspots;
	}

	public ParserHelper(String content) {
		this.content=content;
		hotspots =new Hashtable<String, HotspotDS>();
		parse();
	}
	
	public void parse () {
		
		 IASTTranslationUnit unit = ParseUtils.getTranslationUnit(content);
		  variableVisitor = new VariableVisitor();
		 unit.accept(variableVisitor);
		 symbolTable= variableVisitor.getSymbolTable();
		  IASTPreprocessorStatement[]  prstms=   unit.getAllPreprocessorStatements();
		  for(IASTPreprocessorStatement preprocessorStatement: prstms){
			  if(preprocessorStatement instanceof IASTPreprocessorMacroDefinition){
				   IASTPreprocessorMacroDefinition definition= (IASTPreprocessorMacroDefinition)preprocessorStatement;
		             String type = getType(definition.getExpansion());
		             String name = definition.getName().toString();
		             VariableDS ds = new VariableDS(name, type, null);
		             symbolTable.put(name, ds);
		            // System.out.println("Adding DS: " + ds.toString());
			  }
			  if(preprocessorStatement instanceof IASTPreprocessorPragmaStatement){
				  IASTPreprocessorPragmaStatement pragmaStatement = (IASTPreprocessorPragmaStatement)preprocessorStatement;
				  String message = String.copyValueOf(pragmaStatement.getMessage());
				  if(message.startsWith("tppmodel")){
					  if(message.split(" ").length <2)
							throw new RuntimeException("pragma statement require a name: #pragma tppmodel name ");
					  String name = message.split(" ")[1];	
					  hotspots.put(name, new HotspotDS(pragmaStatement,getNextStatement(pragmaStatement)));
				  }
			  }
			  if(preprocessorStatement instanceof IASTPreprocessorIncludeStatement){
				    includeStatement = (IASTPreprocessorIncludeStatement) preprocessorStatement;
				  
			  }
		  }
		 
	}

	public IASTPreprocessorIncludeStatement getIncludeStatement() {
		return includeStatement;
	}

	private IASTStatement getNextStatement(IASTPreprocessorPragmaStatement statement) {
		if(variableVisitor==null) parse();
		StatementVisitor visitor =  new StatementVisitor(statement.getFileLocation());
		statement.getTranslationUnit().accept(visitor);
		//System.out.println(" ---" +visitor.getNextStatement().getRawSignature());
		return  visitor.getNextStatement();
		
	}
	
	private String getType(String expansion) {
		 for(String key : symbolTable.keySet() ){
			 if(expansion.contains(key)) return symbolTable.get(key).getType();
		 }
		 char[] charstr = expansion.toCharArray();
		 for(int i=0;i<charstr.length;i++){
			 if(charstr[i] >'a' && charstr[i]<'z') return ""+IASTSimpleDeclSpecifier.t_char;
			 if(charstr[i] >'A' && charstr[i]<'Z') return ""+IASTSimpleDeclSpecifier.t_char;
		 }
		 if(expansion.contains(".")) return "" + IASTSimpleDeclSpecifier.t_float;
		 return "" + IASTSimpleDeclSpecifier.t_int;
	}

	public Hashtable<String, VariableDS> getSymbolTable() {
		 if(variableVisitor!=null) return variableVisitor.getSymbolTable();
		 else 
			 parse(); 
		 return symbolTable;
	}

	public Hashtable<String, String> getTypeDefinitions() {
		 if(variableVisitor!=null) return variableVisitor.getTypeDefintions();
		 else 
			 parse(); 
		 return variableVisitor.getTypeDefintions();
	}

}
