package grmr;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import utils.ResourceUtils;

import junit.framework.TestCase;

public class GrmrTest extends TestCase {

	public void testTPP() {

		String fileName = "resources/pnbfiles/" + "force.pnb";
		String text = ResourceUtils.readAsString(fileName);
		ByteArrayInputStream bs = new ByteArrayInputStream(text.getBytes());
		try {
        ANTLRInputStream input = new ANTLRInputStream(bs);
		PNBsolverLexer lexer = new PNBsolverLexer(input);
		
		PNBsolverParser parser = new PNBsolverParser(new CommonTokenStream(lexer));

			Content content = parser.content();
			assertNotNull(content);
			assertNotNull(content.getKernels());
			assertNotNull(content.getExecution());
			Execution exection = content.getExecution();
			assertEquals(exection.getPlatform(), IConstants.OMP);  
			assertEquals(exection.getMode(), IConstants.ACCURATE);
			System.out.println(exection.getIdentifier());
			assertEquals(content.getKernels().get(0).getDeclarations().get(0).getVariables().get(0),"F");
			assertEquals(content.getKernels().get(0).getDeclarations().get(0).getOpType(),IConstants.vector);
			assertEquals(content.getKernels().get(0).getReadWriteStmts().get(0).getString1(), "\"<R_1 R_2 R_3>M\"");
			Expression expression = content.getKernels().get(0).getExpressionStmt().getInnerExpr();
			System.out.println(content.getExecution().getPlatform());
			assertNotNull(expression);
			Expression expr= expression;
			System.out.println(expr);
		   
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
