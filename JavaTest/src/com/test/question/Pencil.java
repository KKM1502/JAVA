package com.test.question;

public class Pencil {
	private String hardness;

	public void setHardness(String hardness) {
		this.hardness = hardness;
		
	}

	public String getHardness() {
		return this.hardness;
	}
	public String info() {
		return String.format("%s등급의 연필", this.hardness);
	}
}
