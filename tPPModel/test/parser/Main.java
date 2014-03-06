package parser;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map; 


import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.parser.IScannerInfo;
import org.eclipse.cdt.internal.core.indexer.StandaloneFastIndexer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ptp.internal.rdt.core.model.TranslationUnit;

@SuppressWarnings("restriction")
public class Main {
	
	IASTTranslationUnit parse(File file) throws CoreException, URISyntaxException, IOException {

		 
		TranslationUnit unit = new TranslationUnit(null, file.getName(), "test", file.toURI()); //$NON-NLS-1$
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
		return unit.getAST();
	}
	

	
	public static void main(String[] args)  {
		Main tests = new Main();
		IASTTranslationUnit ast;
		try {
			String fileName = args[0];
			ast = tests.parse(new File(fileName));
			if(ast.getDeclarations().length>0)
			System.out.println("first declaration parsed: "+ast.getDeclarations()[0].getRawSignature());
			else
			System.out.println("No declaration found");
			List<IASTName> names = tests.getNames(ast);
                        if(names.size()>0)
			System.out.println("first identifier parsed: "+names.get(0).toString());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //$NON-NLS-1$

		
	}
	
	public List<IASTName> getNames(IASTTranslationUnit unit) {
		
		final List<IASTName> names = new ArrayList<IASTName>();
		ASTVisitor visitor = new ASTVisitor() {
			@Override
			public int visit(IASTName name) {
				names.add(name);
				return ASTVisitor.PROCESS_CONTINUE;
			}
		};
		visitor.shouldVisitNames = true;
		unit.accept(visitor);
		return names;
	}
}
