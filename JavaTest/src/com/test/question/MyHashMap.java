package com.test.question;

public class MyHashMap {

	private String[ ] keys;
	private String[] values;
	private int index;
	
	public MyHashMap() {
		this.index= 0;
		this.keys = new String[4];
		this.values = new String[4];
	}
	
	@Override
	public String toString() {
		
		String temp = "";
		temp += String.format("index: %d\n", this.index);
		temp += String.format("length: %d\n", this.keys.length);
		
		for (int i = 0; i < keys.length; i++) {
			temp+=String.format(" [%s] = %s \n", this.keys[i], this.values[i]);
		}
		
		
		
		return temp;
	}
	

	public void put(String key, String value) {
		if(getIndex(key)==-1) {
			if(this.index >= this.keys.length) {
				String[] temp = new String[this.keys.length *2 ];
				String[] temp2 = new String[this.values.length *2 ];
				for (int i = 0; i < this.index; i++) {
					temp[i] = this.keys[i];
					temp2[i] = this.values[i];
				}
				this.keys=temp;
				this.values = temp2;
			}
			for (int i = 0; i < this.index; i++) {
				if(this.keys[i].equals(key)) {
					this.values[i] = value;
				}
			}
		
				this.keys[this.index]= key;
				this.values[this.index]= value;
				this.index ++;
		
			}
		else {
			this.values[getIndex(key)]=value;
			
		}
	}
		
	public int getIndex(String key) {
		for (int i = 0; i < this.index; i++) {
			if(this.keys[i].equals(key)) {
				return i;
			}
			
		}
		return -1;
	}

	public String get(String key) {
		
		return this.values[getIndex(key)];
		
//		for (int i = 0; i < keys.length; i++) {
//			if(keys[i].equals(key)) {
//				values
//			}
//		}
	}

	public int size() {
		
		return this.index;
	}

	public void remove(String key) {
		String[] temp = new String[this.keys.length];
		String[] temp2 = new String[this.values.length];
		for (int i = 0; i < getIndex(key); i++) {
			temp[i] = this.keys[i];
			temp2[i] = this.values[i];
		}
		for (int i = getIndex(key)+1; i < this.index; i++) {
			temp[i] = this.keys[i];
			temp2[i] = this.values[i];
		}
		temp[getIndex(key)]=key;
		temp2[getIndex(key)]=null;
		
		this.keys = temp;
		this.values = temp2;
		
	}

	public void clear() {
		this.index = 0;
	}

	public boolean containsKey(String key) {
		for (int i = 0; i < this.keys.length; i++) {
			if(this.keys[i].equals(key)) {
				return true;
			}
		}
		return false;
	}

	public boolean containsValue(String value) {
		for (int i = 0; i < this.values.length; i++) {
			if(this.values[i].equals(value)) {
				return true;
			}
		}
		return false;
	}
	
}



