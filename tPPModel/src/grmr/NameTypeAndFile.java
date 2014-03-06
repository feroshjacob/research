package grmr;

public class NameTypeAndFile {

	private String type;
	public String getType() {
		return type;
	}
	public NameAndFile getNameAndFile() {
		return nameAndFile;
	}
	public NameTypeAndFile(String type, NameAndFile nameAndFile) {
		super();
		this.type = type;
		this.nameAndFile = nameAndFile;
	}
	private NameAndFile nameAndFile;
	
	@Override
	public String toString() {
	   
		return "type="+ type +  nameAndFile.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		 if(! (obj instanceof NameTypeAndFile)) return false;
		 NameTypeAndFile andFile = (NameTypeAndFile) obj;
		return type.equals(andFile.getType()) && nameAndFile.equals(andFile.getNameAndFile()) ;
	}
	
}
