package com.test.java;



public class Ex25_Method {
	public static void main(String[] args) {
		
		//Ex25_Method.java
		
//		int num = getNum();

		System.out.println();
		
		//TODO 확인점 
		test();

		
		//이클립스 기능(메소드 관련)
		
		//****동일한 목적을 가지는 동일한 코드가 2번 이상 반복되면 안된다.
		
		hello();

		hello2();
		
		
		String name = "홍길동";
		
		hi(name);
		
		score();
		score2(100);
		String result = score3("홍길동"); //Ctrl +1 
		
		System.out.println();
		System.out.println();
		System.out.println();
		aaa();

		
	}//main



	private static void aaa() {
		
		//BreakPoint(Ctrl + shift + B) > 실행(f11) 
		//f5를 누르면서 값의 변화를 확인
		int num = 10;
		int sum=0;
		num++;
//		System.out.println(num);
		num *=2;
		sum = num +100;
		System.out.println(sum);
		
		
	}



	private static String score3(String string) {

		return null;
	}



	private static void score2(int i) {
		
		
	}



	private static void score() {
		
		
	}



	public static void hello2() {
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다.");
		System.out.println("환영합니다.");
	}



	public static void hi(String name) {
		System.out.println(name + "안녕.");
		System.out.println(name + "하이");
		System.out.println(name + "하하하하~.");
	}



	private static void hello() {
		hello2();
	}
	
	
	
	public static void test() {
		System.out.println("one");
		
		//빈 리턴문
//		1.메소드를 종료한다
		return;
		
//		System.out.println("two");
	}
	
	public static int getNum() {
		
		System.out.println("하나");
		return 100; //메소드 종료 
		
		//Unreachable code > 코드 실행 불가 
		
		
	}
}
