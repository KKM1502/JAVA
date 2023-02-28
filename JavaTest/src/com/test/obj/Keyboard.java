package com.test.obj;

public class Keyboard {

	
	//클래스의 멤버변수 접근 지정자
	//1. private으로 지정한다. > 유효하지 않은 값이 들어갈까봐...
	//2. public 메소드 선언 > private 변수를 접근한다.
	
	private String model;
	private int price;
	
	
	//외부에서 직접 접근이 불가능한 private 변수를
	//public 메소드가 중간에서 연결을 시켜줌.
//	public void aaa(String a) {
//		model = a ;
//	}
//	public void bbb(int b) {
//		//유효성 검사
//		if(b>0&&b<=200000) {
//			price= b;
//		}{
//			System.out.println("가격오류!");
//		}
//	}
//	public String ccc() {
//		return model;
//	}
//		
//	public int ddd() {
//		return price;
//	}
//
	//public void add(String a)
	//- set 멤버 변수형
	//- 쓰기 메소드 > setter
	public void setModel(String model) {
//		model = model;
		//this? > 객체 접근(지정) 연산자 > 객체 자신을 가르키는 표현 > "나"
		this.model = model;
		
	}
	public String getModel() {
//		model = model;
		//this? > 객체 접근(지정) 연산자 > 객체 자신을 가르키는 표현 > "나"
		return this.model;
		
	}
	public void setPrice(int price) {
//		model = model;
		//this? > 객체 접근(지정) 연산자 > 객체 자신을 가르키는 표현 > "나"
		this.price = price;
		
	}
	public int getPrice() {
//		model = model;
		//this? > 객체 접근(지정) 연산자 > 객체 자신을 가르키는 표현 > "나"
		return this.price;
		
	}
	
	
	
}
