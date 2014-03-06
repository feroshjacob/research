package template;

import utils.ResourceUtils;

public class Configuration {

	private String executable ;
	private String ccfiles="";
	private String cufiles="";
	private String link="";
	private String flag="-DTPPMODEL_DEFINED ";
	public Configuration(String name) {
	this.executable = name;
	}
	public String getCcfiles() {
		return ccfiles;
	}
	public String getCufiles() {
		return cufiles;
	}
	public String getExecutable() {
		return executable;
	}
	public void addCUFile(String cufile ) {
//	    String outfileName= cufile.split("\\.")[0]; 
//	    outfileName = 	 outfileName+"_host.cu";

		cufiles = cufiles+cufile +" ";
	}
	public void addFlag(String flag  ) {
		this.flag = this.flag+"-D" +flag+"_DEFINED ";
	}
	public String getLink() {
		return link;
	}
	public String getFlag() {
		return flag;
	}
	public void addCCFile(String ccfile ) {
		ccfiles = ccfiles+ ccfile +" ";
	}
	public void  setOMP() {
		this.flag= flag+"-fopenmp ";
		this.link= link+"-lgomp ";
	}
}
