package com.test.question;

public class Ruler {
	private int length;
	private  String shape;
	
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getShape() {
		return this.shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String info() {
		return String.format("%scm %s¿‘¥œ¥Ÿ.", this.length,this.shape);
	}
	
}
