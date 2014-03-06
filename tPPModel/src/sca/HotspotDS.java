package sca;

import org.eclipse.cdt.core.dom.ast.IASTPreprocessorPragmaStatement;
import org.eclipse.cdt.core.dom.ast.IASTStatement;

public class HotspotDS {
	private IASTPreprocessorPragmaStatement pragmaStatement;
	private IASTStatement statement;
	public HotspotDS(IASTPreprocessorPragmaStatement pragmaStatement,
			IASTStatement statement) {
		super();
		this.pragmaStatement = pragmaStatement;
		this.statement = statement;
	}
	public IASTPreprocessorPragmaStatement getPragmaStatement() {
		return pragmaStatement;
	}
	public IASTStatement getStatement() {
		return statement;
	}
	

}
