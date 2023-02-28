package com.test.question;

class MyStack {
	private String[] list;
	private int index;
	
	public MyStack(){
		this.list = new String[4];
		this.index= 0;
	}

	public void push(String string) {
		if(this.index >= this.list.length) {
			String[] temp = new String[this.list.length *2 ];
			for (int i = 0; i < this.index; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
		}
		this.list[this.index]= string;
		this.index ++;
	}

	public String pop() {
		
		
		this.index--;
		return  this.list[this.index];
	}

	public int size() {
		
		return this.index;
	}

	public String peek() {
		
		return  this.list[this.index-1];
	}

	public void trimToSize() {
		String[] temp = new String[index];
		for (int i = 0; i < this.index; i++) {
			temp[i] = this.list[i];
			
		}
		this.list = temp;
	}

	public void clear() {
		this.index = 0;
	}
	
}
