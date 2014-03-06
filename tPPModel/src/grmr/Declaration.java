package grmr;

import java.util.List;

public class Declaration {
	public String getName() {
		return nameAndFile.getName(); 
	}
	public String getFileName() {
		return nameAndFile.getFileName();
	}
	public List<String> getInputVariables() {
		return inputVariables;
	}
	public List<String> getOutputVariables() {
		return outputVariables;
	}
	private NameAndFile nameAndFile = null;
	private List<String> inputVariables;
	private List<String> outputVariables;
	public Declaration(NameAndFile nameAndFile,
			List<String> inputVariables, List<String> outputVariables) {
		this.nameAndFile = nameAndFile;
		this.inputVariables = inputVariables;
		this.outputVariables = outputVariables;
	}
	@Override
	public String toString() {
		 
		return "nf=" + nameAndFile.toString() + " in=" 
		+ inputVariables.toString() + " out=" + outputVariables.toString();
	}
	

}
