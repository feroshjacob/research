package grmr;

public class Execution {

	
	public Execution(String string, int platform, int md) {
		super();
		this.identifier = string;
		this.platform = platform;
		this.mode = md;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String string) {
		this.identifier = string;
	}
	public int getPlatform() {
		return platform;
	}
	public void setPlatform(int platform) {
		this.platform = platform;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int md) {
		this.mode = md;
	}
	private String identifier;
	private int platform;
	private int mode;


}
