package grmr;

import java.util.List;

public class Execution {
	private List<String> executionpath;
	private String executableName;
	public List<String> getExecutionpath() {
		return executionpath;
	}
	public String getExecutableName() {
		return executableName;
	}
	public Execution( String executableName,List<String> executionpath) {
		super();
		this.executionpath = executionpath;
		this.executableName = executableName;
	}

}
