package template;

import java.io.File;
import java.io.IOException;

import main.NameAndContent;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.misc.ErrorBuffer;

import utils.ResourceUtils;
import grmr.Content;
import grmr.Declaration;
import grmr.Execution;
import grmr.NameTypeAndFile;

public class MakeFileGenerator {

	private Content content;
	private NameAndContent makefileContent  ;
	public MakeFileGenerator(Content content) {
		 this.content= content;
	}
	public void generate() {
	   System.out.println("Generating Makefile");
		Configuration configuration = getConfiguration();
		STGroup group = new STGroupFile(ResourceUtils.getTemplatePath()
				+ "makefile.stg");
		ST st = group.getInstanceOf("template");
		
		st.add("executable", configuration.getExecutable());
		st.add("ccfiles", configuration.getCcfiles());
		st.add("cufiles", configuration.getCufiles());
		st.add("flag", configuration.getFlag());
		st.add("link", configuration.getLink());
		
		makefileContent = new NameAndContent("Makefile",st.render());
	}
	private Configuration getConfiguration() {
		Execution execution =content.getExecution();
		 Configuration configuration = new Configuration(execution.getExecutableName());
		 configuration.addCCFile(content.getDeclarations().get(0).getFileName());
		 
		 for(String executiontype : execution.getExecutionpath()){
			  NameTypeAndFile andFile = content.getMapping(executiontype);
			  configuration.addFlag(content.getMappedDeclaration(executiontype));
			  if(andFile.getType().equals("CUDA")) configuration.addCUFile(andFile.getNameAndFile().getFileName());
			  else configuration.addCCFile(andFile.getNameAndFile().getFileName());
			  
				  if(andFile.getType().equals("OMP")) configuration.setOMP();
			 
				  
			  
		 }
		 return configuration;
	}
	public NameAndContent getMakefileContent() {
		return makefileContent;
	}


}
