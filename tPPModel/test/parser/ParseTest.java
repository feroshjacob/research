package parser;


import java.util.Hashtable;

import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;

import sca.ParserHelper;
import sca.VariableDS;
import utils.ParseUtils;
import utils.ResourceUtils;

import junit.framework.TestCase;


public class ParseTest extends TestCase{

	public void testHello() {
		String resourcePath ="test/parser/resources/";
		
		String fileName = resourcePath + "hello.c";
    
	    String content = ResourceUtils.readAsString(fileName);	
		IASTTranslationUnit unit = ParseUtils.getTranslationUnit(content);
		assertNotNull(unit);
		assertEquals(1,unit.getDeclarations().length);
		fileName = resourcePath + "is.c";
		
		 ParserHelper helper =	new ParserHelper(fileName);
		    helper.parse();
			Hashtable<String, VariableDS> symboltbl = helper.getSymbolTable();
	   assertNotNull(symboltbl);
	//   assertEquals(1, symboltbl.size());
//	   assertEquals("x", symboltbl.keys().nextElement());
	}
	public void testIS() {
	    ParserHelper helper =	new ParserHelper("is.c");
	    helper.parse();
		Hashtable<String, VariableDS> symboltbl = helper.getSymbolTable();  
	//	assertTrue(symboltbl.containsKey("key_array"));
		for(String key : symboltbl.keySet())
		System.out.println(symboltbl.get(key));
		Hashtable< String, String> typedeHashtable =  helper.getTypeDefinitions();
				for(String key : typedeHashtable.keySet())
					System.out.println("-----" +key+":"+typedeHashtable.get(key));

	}
	

}
