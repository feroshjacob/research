package utils;

import grmr.Content;
import grmr.TPPModelLexer;
import grmr.TPPModelParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;


import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.parser.IScannerInfo;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ptp.internal.rdt.core.model.TranslationUnit;

public class ParseUtils {
	
 public static	IASTTranslationUnit getTranslationUnit(String filePath, boolean isFile) {
	 
		TranslationUnit unit = getTranslationUnitFromContent(filePath,isFile); 
		IScannerInfo scannerInfo = new IScannerInfo() {
			public Map<String, String> getDefinedSymbols() {
				return Collections.emptyMap();
			}
  
			public String[] getIncludePaths() {
				return new String[0];
			}
		};
		unit.setLanguage(new GPPLanguage());
		unit.setASTContext(scannerInfo, Collections.<String,String>emptyMap());
		try {
			return unit.getAST();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	 return null;
 }
 public static	IASTTranslationUnit getTranslationUnit(String filePath) {
	 return getTranslationUnit(filePath, false);
 }
 

private static TranslationUnit getTranslationUnitFromContent(String fileorContent , boolean isFile) {
	if(isFile){
	    File file = new File( fileorContent);
	return new TranslationUnit(null, file.getName(), "test", file.toURI());
	}
	return new TranslationUnit(null, "sample.c", "test", fileorContent);
}
	public static String replaceNodeinString(IASTNode nodetobeReplaced, String replacement, String oldContent) {
	  return	ResourceUtils.replaceContentbyString(nodetobeReplaced.getFileLocation().getNodeOffset(),  nodetobeReplaced.getFileLocation().getNodeLength(), replacement, oldContent);
	
	}


}
