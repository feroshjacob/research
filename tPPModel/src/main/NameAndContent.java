package main;

public class NameAndContent {
	private String name ;
	private String content;
	private String text;
	public String getText() {
		String temp= content.replaceAll("\"", "'");
		temp = temp.replaceAll("<", " &lt; ");
		temp = temp.replaceAll(">", " &gt; ");
		//text = temp.replaceAll("\n", "\"+\n+\"");
		return temp;
	}
	public NameAndContent() {
		// TODO Auto-generated constructor stub
	}
	public NameAndContent(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "FileName is: "+name+"\n" +content;
		}

}
