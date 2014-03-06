package grmr;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Content {
	private List<Declaration> declarations = new ArrayList<Declaration>();
	private Map<String, List<NameTypeAndFile>> mappings = new HashMap<String, List<NameTypeAndFile>>();
	private Execution execution ;
	public Execution getExecution() {
		return execution;
	}
	public Content(List<Declaration> declarations,
			Map<String, List<NameTypeAndFile>> mappings, Execution execution) {
		super();
		this.declarations = declarations;
		this.mappings = mappings;
		this.execution = execution;
	}
	public List<Declaration> getDeclarations() {
		return declarations;
	}
	public Map<String, List<NameTypeAndFile>> getMappings() {
		return mappings;
	}
	
  	

public  Content (String text) {
	try {
		ByteArrayInputStream bs = new ByteArrayInputStream(text.getBytes());
    ANTLRInputStream input = new ANTLRInputStream(bs);
	TPPModelLexer lexer = new TPPModelLexer(input);
	TPPModelParser parser = new TPPModelParser(new CommonTokenStream(lexer));
		Content content= parser.content();
		this.declarations = content.getDeclarations();
		this.execution= content.getExecution();
		this.mappings= content.getMappings();
		if(declarations.size() < 1) throw new RuntimeException("At least one declaration required");

	}catch(RecognitionException exception) {
		exception.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}	public Declaration getDeclaration(String key) {
	for (Declaration declaration : getDeclarations()) {
		if (declaration.getName().equals(key))
			return declaration;
	}
	throw new RuntimeException("No declaration found for " + key);
	}
	
	public NameTypeAndFile getMapping(String key){
		for(String key1 : getMappings().keySet()){
			 for(NameTypeAndFile andFile : getMappings().get(key1)){
				if(andFile.getNameAndFile().getName().equals(key)) return andFile;
			 }
		}
		throw new RuntimeException("No Mapping found for " + key);
	}
	public String getMappedDeclaration(String key){
		for(String key1 : getMappings().keySet()){
			 for(NameTypeAndFile andFile : getMappings().get(key1)){
				if(andFile.getNameAndFile().getName().equals(key)) return key1;
			 }
		}
		throw new RuntimeException("No Mapped declaration found for " + key);
	}

 
}
