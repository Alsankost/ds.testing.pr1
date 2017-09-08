package model;

public class Error {
	private int pos, len;
	private String description;
	
	public int getPos() {
		return pos;
	}
	
	public int getLen() {
		return len;
	}

	@Override
	public String toString() {
		return description;
	}
	
	public Error(int pos, int len, String description) {
		this.pos = pos;
		this.len = len;
		this.description = description;
	}
}
