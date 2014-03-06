package grmr;

import java.util.List;

public class Content {

	private List<Kernel> kernels;
	private Execution execution;
	public List<Kernel> getKernels() {
		return kernels;
	}
	public void setKernels(List<Kernel> kernels) {
		this.kernels = kernels;
	}
	public Execution getExecution() { 
		return execution;
	}
	public void setExecution(Execution execution) {
		this.execution = execution;
	}
	public Content(List<Kernel> l_decls, Execution execution) {
		super();
		this.kernels = l_decls;
		this.execution = execution;
	}


}
