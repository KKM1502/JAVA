package com.test.java;

public class Ex27_Overloading {
	
	
	public static void main(String[ ] args) {
	//Ex27_Overloading.java
	
	/*
	 	***메소드 오버로딩, Method Overloading
	 	- 동일한 이름 메소드가 인자 리스트를 다양하게 가지면서 여러개 선언하는 기술
	 	
	 	메소드 오버로딩을 하는 이유?
	 	- 성능 향상x
	 	- 개발자에게 도움o > 메소드 이름을 외우기 편하게 해줌
	 	
	 	메소드 오버로딩 구현 조건 > 가능
	 	1. 매개변수의 갯수
	 	2. 매개변수의 자료형
	 	
	 	메소드 선언하는 중...
	 	1. public static void test() {} 		//잘 만들어짐
	 	2. public static void test() {} 		//실패 (1번 때문에)
	 	3. public static void test(int n) {}	//o
	 	4. public static void test(int m) {}	//실패 (3번 때문에)
	 	5. public static void test(String s) {}	//o
	 	6. public static void test(int n, int m) {}	//o
	 	7. public static int test() {}	//x
	 	 
	 	
	 	메소드 호출하기(검증 방법)
	 	test(); //1번
	 	test(100); //3번
	 	test("홍길동")//5번
	 	int num = test() //7번
	 	
	 	메소드 오버로딩 구현 조건 > 불가능
	 	1. 매개변수의 이름
	 	2. 반환값의 자료형
	 	
	 	
	 */
		//장점 : 가독성이 좋음 
		//단점 : 메소드명 > 외울게 많음 
//		drawLineEqual();
//		drawLineAsterisk();
//		drawLineHash();
		
		
		//장점 : 메소드명이 한개
		//단점 : 인자 리스트가 달라야한다. > 특징 
		drawLine();
		drawLine("8");

		System.out.println(100);//println(int n)
		
		
		
	}//main
	
	
	public static void drawLine() {
		
		System.out.println("==============================");
		
	}
	
	public static void drawLine(String s) {
		
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		
	}
	
	
	//요구사항] 선을 그리는 메소드
	public static void drawLineEqual() {
		
		System.out.println("==============================");
	
	}
	
	//추가사항] 선의 모양 변경
	
	public static void drawLineAsterisk() {
		
		System.out.println("******************************");
	
	}
	
	public static void drawLineHash() {
		
		System.out.println("##############################");
		
	}
	
	
}
