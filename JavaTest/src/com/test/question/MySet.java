package com.test.question;

public class MySet {
	private String[] list;
	private int index;
	private int sindex;
	
	public MySet(){
		this.list = new String[4];
		this.index= 0;
		this.sindex = 0;
	}

	public boolean add(String value) {
		
		if(this.index >= this.list.length) {
			String[] temp = new String[this.list.length *2 ];
			for (int i = 0; i < this.index; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
		}
		this.list[this.index]= value;
		this.index ++;
		return true;

		
	}

	public int size() {
		
		return index;
	}

	public boolean remove(String value) {
		//s 		: 삭제할 요소
		//return 	: 성공 유무
		
		int index = 0;
		for (int i = 0; i < index; i++) {
			if(list[i].equals(value)) {
				index = i;
				break;
			}
		}
		for (int i = sindex; i < this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;
		return true;
	
	}

	public void clear() {
		this.index =0 ; 
	}

	public boolean hasNext() {
		if(this.sindex < this.index) {
			return true;
		}
		return false;
	}
	
	public String next() {
		String temp = this.list[this.sindex];
		this.sindex++;
		return temp;
	}
	
	@Override
	//dump
	public String toString() {
		
		String temp = "";
		temp +="\n";
		temp +=String.format("length:%d \n", this.list.length);
		temp +=String.format("size: ", this.index);
		temp +=String.format("[\n");
		for (int i = 0; i < this.list.length; i++) {
			temp+= String.format("    %d: %s\n",i, this.list[i]);
		}
		temp+= String.format("]");
		temp +="\n";
		
		return temp;
	}
	
	
}
