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

		String fileName = "test/parser/resources/" + "basic.tpp";
		String text = ResourceUtils.readAsString(fileName);
		ByteArrayInputStream bs = new ByteArrayInputStream(text.getBytes());
		try {
        ANTLRInputStream input = new ANTLRInputStream(bs);
		TPPModelLexer lexer = new TPPModelLexer(input);
		
		TPPModelParser parser = new TPPModelParser(new CommonTokenStream(lexer));

			Content content = parser.content();
			assertNotNull(content);
			assertNotNull(content.getDeclarations());
			assertNotNull(content.getExecution());
			assertNotNull(content.getMappings());

			assertEquals(content.getDeclarations().size(), 1);
			System.out.println(content.getDeclarations().get(0).getFileName());
			assertEquals(content.getDeclarations().get(0).getFileName(), "is.c");
			assertEquals(content.getDeclarations().get(0).getFileName(), "is.c");
			assertEquals(content.getDeclarations().get(0).getInputVariables()
					.size(), 2);
			assertEquals(content.getDeclarations().get(0).getInputVariables()
					.get(1), "max_value");

			// map random<-OMP omp_random [ompis.c], CUDA cuda_rand1 [rand.cu],
			// CUDA cuda_rand2[rand2.cu]

			NameTypeAndFile typeAndFile1 = new NameTypeAndFile("OMP",
					new NameAndFile("omp_random", "ompis.c"));
			NameTypeAndFile typeAndFile2 = new NameTypeAndFile("CUDA",
					new NameAndFile("cuda_rand1", "rand.cu"));
			NameTypeAndFile typeAndFile3 = new NameTypeAndFile("CUDA",
					new NameAndFile("cuda_rand2", "rand2.cu"));

			List<NameTypeAndFile> list = new ArrayList<NameTypeAndFile>();
			list.add(typeAndFile1);
			list.add(typeAndFile2);
			list.add(typeAndFile3);
			assertEquals(content.getMappings().size(), 1);
			assertEquals(content.getMappings().keySet().iterator().next(),
					"random");
			assertEquals(content.getMappings().get("random"), list);
			assertEquals(content.getExecution().getExecutableName(),
					"ISExecutable");
			assertEquals(content.getExecution().getExecutionpath().size(), 2);
			assertEquals(content.getExecution().getExecutionpath().get(0),
					"omp_random");
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
