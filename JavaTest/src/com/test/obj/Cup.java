package com.test.obj;

public class Cup {
	
	private String color;
	private int weight;
	private int price;
	private String type;
	private int level;
	
	//color > Setter + Getter
	public void setColor(String color) {
		//private 을 public 처럼!
		this.color=color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getPrice() {
		return this.price = price;
	}
	
	public int getLevel() {
		if(this.weight<500 && this.price < 1000) {
			return 1; //등급
		}else if(this.weight<700 && this.price < 5000) {
			return 2;
		}return 3;
	}

	
}
