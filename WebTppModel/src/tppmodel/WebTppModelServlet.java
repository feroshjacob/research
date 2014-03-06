package tppmodel;

import grmr.Content;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.*;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import main.NameAndContent;
import sca.ParserHelper;
import sca.RefactorMain;
import template.CodeGenerator;
import template.MakeFileGenerator;
import utils.ResourceUtils;

@SuppressWarnings("serial")
public class WebTppModelServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String tppContent= req.getParameter("tppCode").toString();
		String mainProg= req.getParameter("cCode").toString();
		resp.setContentType("text/html");
		String result=""; 
		   try {
			Content content = new Content(tppContent);
				   
			   ParserHelper helper = new ParserHelper(mainProg);
			   RefactorMain main = new RefactorMain(content, helper,mainProg);
			   main.refactor();
			   
			   CodeGenerator generator = new CodeGenerator(content, helper.getSymbolTable());
			   generator.generate();
			  
			   
			   MakeFileGenerator mkgenerator= new MakeFileGenerator(content);
			   mkgenerator.generate();
			   result= display(main.getRefactoredContent(), main.getAbstractHeader(),
					   generator.getTemplates(),mkgenerator.getMakefileContent());
		} catch (Exception e) {
			 result = "ERROR: " + e.getMessage() +" , try again";
		}     
		   resp.getWriter().println(result);

	}
	private String  display(NameAndContent refactoredContent,
			NameAndContent abstractHeader, List<NameAndContent> templates,
			NameAndContent makefileContent) {
		STGroup group = new STGroupFile("display.stg");
		ST st = group.getInstanceOf("template");
		st.add("main_content", refactoredContent);
		st.add("make_content", makefileContent);
		for(NameAndContent tempContent: templates)
		st.add("temp_content", tempContent);
				
		st.add("abs_content", abstractHeader);
	   return st.render();
		
	}
}
