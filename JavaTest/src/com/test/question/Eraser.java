package com.test.question;

public class Eraser {
	private String size;


	public void setSize(String size) {
		this.size = size;
	}

	public String getSize() {
		return this.size;
	}
	public String info() {
		return String.format("%s�������� ���찳", this.size);
	}
}
