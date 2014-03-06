package template;

import grmr.Content;
import grmr.Declaration;
import grmr.NameTypeAndFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import main.NameAndContent;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STErrorListener;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.misc.ErrorBuffer;
import org.stringtemplate.v4.misc.STMessage;

import sca.VariableDS;
import utils.ResourceUtils;

public class CodeGenerator {
	private Content content;
	private Hashtable<String, VariableDS> symbolTable;
	private List<NameAndContent> templates = new ArrayList<NameAndContent>();

	public List<NameAndContent> getTemplates() {
		return templates;
	}

	public CodeGenerator(Content content,
			Hashtable<String, VariableDS> symbolTable) {
		this.content = content;
		this.symbolTable = symbolTable;
	}

	public void generate() {
		for (String key : content.getMappings().keySet()) {
			for (NameTypeAndFile types : content.getMappings().get(key)) {
				STGroup group = new STGroupFile(ResourceUtils.getTemplatePath()
						+ getTemplateFile(types.getType()));
				ST st = group.getInstanceOf("template");
				st.add("name", key);
				Declaration declaration = content.getDeclaration(key);
				setInput(st, declaration);
				setOutput(st, declaration);
				
				
			    String outfileName= types.getNameAndFile().getFileName().split("\\.")[0]; 
			    String extension = types.getType().equals("CUDA")? ".cu": ".cpp";
			    outfileName = 	 outfileName+ extension;
			    templates.add(new NameAndContent(outfileName,st.render()));
			   
			}

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
			
			if (i != declaration.getInputVariables().size() - 1) {
				st.add("i_ptr_ws", ds);
			}
			else 
				st.add("size", ds.getName());
		}
	}



	private String getTemplateFile(String type) {
	
		if (type.equals("CUDA")){
			System.out.println("generating  CUDA code.... ");
			return "cuda.stg";
		}
		else if (type.equals("OMP")){
			System.out.println("generating  OpenMP code.... ");
			return "omp.stg";
		}
		else if (type.equals("MPI")){
			System.out.println("generating  MPI code.... ");
			return "mpi.stg";
		}
			throw new RuntimeException("Only CUDA, OpenMP and MPI are supported now");

	}
}
