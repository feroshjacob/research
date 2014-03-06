package grmr;

import java.util.List;

public class Declaration { 
	private String kernelName;
	private List<Statement> statements;

	public String getKernelName() {
		return kernelName;
	}

	public void setKernelName(String id1) {
		this.kernelName = id1;
	}

	public List<Statement> getStatements() {
		return statements;
	}

	public void setStatements(List<Statement> kernels) {
		this.statements = kernels;
	}

	public Declaration(String id1, List<Statement> kernels) {
		super();
		this.kernelName = id1;
		this.statements = kernels;
	}


}
  