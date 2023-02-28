package com.test.java;

public class Ex26_LocalVariable {

	public static void main(String[] args) {
//		Ex26_LocalVariable
		/*
		  	자바 변수의 종류
		  	1. 멤버변수, Member Variable
		  		- 클래스
		  	2. 지역변수, Local Variable
		  		- 지금까지 수업하면서 만들었던 모든 변수들
		  		- 메소드 안에서 선언한 변수
		  		- 변수는 자신이 선언된 메소드 영역을 자신의 영역이라고 생각 > Variable Scope (변수 가용 영역) > 변수는 자신의 영역을 벗어날 수 없다.
		  		- 지역변수는 자신의 영역 밖에서는 사용할 수 없다.
		  		
		  	지역 변수의 생명 주기, Life Cycle
		  	- 변수가 언제 메모리에 생성되고, 언제 메모리에서 소멸되는지
		  	- 생성: 변수 선언문이 실행되는 순간
		  	- 소멸: 변수 선언문이 포함된 자신의 영역(메서드)에서 제어가 벗어나는 순간 
		  		
		 */
		
		//a 변수의 영역은 main 메소드이다.
		int a = 10;
		
		int c = 30;
		
		
		m1();
		
		
		
	}//main

	public static void m1() {
		
		//b 변수의 영역은 m1 메소드이다.
		int b = 20;
		
		int c = 40;
		
	}
	
	
}
