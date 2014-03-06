package parser;

import org.eclipse.cdt.core.dom.ast.IASTPreprocessorPragmaStatement;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTTranslationUnit;

import utils.ParseUtils;
import junit.framework.TestCase;

public class PreprocessTest extends TestCase {
	
	public void testDefines() {

		IASTTranslationUnit unit = ParseUtils.getTranslationUnit("is.c");
		assertNotNull(unit);
		for(int i=0;i< unit.getAllPreprocessorStatements().length;i++){
			
		if(unit.getAllPreprocessorStatements()[i]  instanceof IASTPreprocessorPragmaStatement){
			IASTPreprocessorPragmaStatement pragmaStatement = (IASTPreprocessorPragmaStatement)
					                unit.getAllPreprocessorStatements()[i];
			//System.out.println(""+pragmaStatement.getNodeLocations().);
		}
	
	
			
		System.out.println(unit.getAllPreprocessorStatements()[i].getRawSignature());
		}
	
	}

}
