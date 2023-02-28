package com.test.question;

class MyQueue {
	private String[] list; //보조
	private int index; //******************** 주인공!!! > 현재 데이터가 들어갈 방번호
	   
	public MyQueue() {
		this.list=new String[4];
		this.index= 0;
		
	}
	
	@Override
	public String toString() {
		String temp = "";
		temp += "length:" +this.list.length +"/r/n";
		
		temp += "index:" +this.index +"/r/n" ;
		temp += "/r/n" ;
		for (int i = 0; i < this.list.length; i++) {
			temp += "   " + i + ":" +this.list[i] +"\r\n";
		}
		temp += "]";
		
		return temp;

	}
	
	public void add(String s) {
		
		if(this.index >= this.list.length) {
			String[] temp = new String[this.list.length *2 ];
			for (int i = 0; i < this.index; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
		}
		this.list[this.index]= s;
		this.index ++;
		
		
	}

	public String poll() {
		String temp = this.list[0];
		for (int i = 0; i <= this.list.length-2; i++) {
			this.list[i]= this.list[i+1];
		}
		this.index--;
		
		return temp;
	}

	public int size() {
		
		return this.index;
	}

	public String peek() {
		
		return this.list[0];
	}

	public void trimToSize() {
		String[] temp = new String[this.index];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = this.list[i];
		}
		this.list=temp;
	}
	public void clear() {
		this.index=0;
	}
	
	
	
}
