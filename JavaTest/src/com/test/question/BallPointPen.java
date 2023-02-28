package com.test.question;

public class BallPointPen {

	private double thickness;
	private String color;
	
	
	public double getThickness() {
		return this.thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String info() {
		return String.format("%s»ö»ó %s º¼Ææ", this.color,this.thickness);
	}
	
}
