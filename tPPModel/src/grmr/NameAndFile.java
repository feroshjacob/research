package grmr;

public class NameAndFile {
	private String name;
	private String fileName;


	public NameAndFile(String name, String fileName) {
		super();
		this.name = name;
		this.fileName = fileName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
	   return "name="+ name + "file=" + fileName;
	}
	@Override
	public boolean equals(Object obj) {
	 if(! (obj instanceof NameAndFile)) return false;
	 NameAndFile andFile = (NameAndFile) obj;
		return andFile.getFileName().equals(fileName) && andFile.getName().equals(name);
	}
}