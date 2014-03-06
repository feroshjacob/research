package templ;

import java.util.ArrayList;
import java.util.List;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import utils.ResourceUtils;

import junit.framework.TestCase;
public class TemplateTest extends TestCase {
	String resourcePath ="test/parser/resources/";
	
	public void testTemplate() {
		
		STGroup group = new STGroupFile(resourcePath+"test.stg");
		ST st = group.getInstanceOf("decl");
		st.add("type", "int");
		st.add("name", "x");
		st.add("value", 0);
		String result = st.render();
	    assertEquals("int x=0;\nso what", result);
		
	}
	public void testVA () {
		STGroup group = new STGroupFile(resourcePath+"cuda.stg");
		 String expected = ResourceUtils.readAsString(resourcePath+"expectedVA.cu");
		ST st = group.getInstanceOf("cuda_temp");
		//List<String> names =  new ArrayList<String>();
		st.add("name", "VecAdd");
		st.add("list", "Hello");
		st.add("list", "World");
	    String result = st.render();
		System.out.println(result);
	   // assertEquals(expected, result);
	}

}
