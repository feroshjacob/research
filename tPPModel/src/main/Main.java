package main;

import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import grmr.Content;
import sca.ParserHelper;
import sca.RefactorMain;
import template.CodeGenerator;
import template.MakeFileGenerator;
import utils.ParseUtils;
import utils.ResourceUtils;

public class Main {
	
	public static void main(String[] args) {
		

		if(parseArguments(args)) {
		
		String fileName = "test/parser/resources/va.tpp";
		String tppContent = ResourceUtils.readAsString(fileName);
		   Content content = new Content(tppContent);
		String mainProg =    "test/parser/resources/vectoradd.cpp";
		String genFolder ="test/parser/resources/gen";
		String cppContent = ResourceUtils.readAsString(mainProg);
			   
		   ParserHelper helper = new ParserHelper(cppContent);
		   RefactorMain main = new RefactorMain(content, helper,cppContent);
		   main.refactor();
		  
		 //  ResourceUtils.writeNameandContent(genFolder, main.getRefactoredContent());
		   
		   CodeGenerator generator = new CodeGenerator(content, helper.getSymbolTable());
		   generator.generate();
		   for(NameAndContent andContent : generator.getTemplates()){
			//   ResourceUtils.writeNameandContent(genFolder,andContent);
		   }
		   
		   MakeFileGenerator mkgenerator= new MakeFileGenerator(content);
		   mkgenerator.generate();
		   display(main.getRefactoredContent(), main.getAbstractHeader(),
				   generator.getTemplates(),mkgenerator.getMakefileContent());
		       
		   //ResourceUtils.writeNameandContent(genFolder,mkgenerator.getMakefileContent());
		}
		
	}

	private static void display(NameAndContent refactoredContent,
			NameAndContent abstractHeader, List<NameAndContent> templates,
			NameAndContent makefileContent) {
		STGroup group = new STGroupFile("/home/jacob/ferosh/research/parallel/workspace/WebTppModel/war/display.stg");
		ST st = group.getInstanceOf("template");
		st.add("main_content", refactoredContent);
		st.add("make_content", makefileContent);
		for(NameAndContent tempContent: templates)
		st.add("temp_content", tempContent);
				
		st.add("abs_content", abstractHeader);
	   System.out.println(st.render());
		
	}

	private static boolean parseArguments(String[] args) {
		CommandLineParser lineParser = new  BasicParser();
		Options options = new Options();
		
		options.addOption("s", true, "root source folder");
		options.addOption("g", true, "output folder");
		HelpFormatter formatter = new HelpFormatter();
		if(args.length < 1){
			formatter.printHelp( "ant -s file -g folder file1.tpp", options );
			return false;
		}
		

		String filePath = args[args.length-1];
		
		try {
			CommandLine cmd = lineParser.parse( options, args);
			if(cmd.hasOption("s")) {
			//	ResourceUtils.setResourcePath(cmd.getOptionValue("s"));
		        System.out.println(cmd.getOptionValue("s")); 
			}
			if(cmd.hasOption("g")){
				//ResourceUtils.setGenPath(cmd.getOptionValue("s"));
		        System.out.println(cmd.getOptionValue("s")); 
			}
			
			return true;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
 