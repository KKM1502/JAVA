package com.test.java;

public class Ex22_Method {
	
	//main 메소드
	//- 특수한 메소드
	//- 이름이 고정(예약어)
	//- 프로그램을 실행하면 자바가 자동으로 실행(호출)하는 메소드 > 무조건 main()안의 코드는 자동으로 실행된다.
	
	public static void main(String[] args) {
//	Ex22_Method
	/*
	 	메소드, Method
	 	-메소드(Method), 함수(Function), 프로시저(Procedure), 서브루틴(SubRoutine)
	 	-코드의 집합
	 	-같은 목적을 가진 코드의 집합
	 	
	 	메소드 사용
	 	1. 메소드 선언하기
	 		-1회
	 	
	 	2. 메소드 호출하기
	 		-1회 ~ 무한대 
	 	
	 		
	 	요구사항]"안녕하세요" x5회 출력
	 	수정사항]"반갑습니다" x5회 출력
	 	
	 	
	 */
		
		//복붙 -> 유지보수가 힘들다 
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		//메소드 호출하기
		hello();
		hello();
		hello();
		hello();
		hello();
	}// main
	
	//메소드 선언하기
//	public 		static 		void 		hello		()		<<헤더
//  접근지정자 	정적키워드		반환자료형 	메소드명		인자리스트
//	{
//		System.out.println("안녕하세요"); <<바디
//	}
	
	//코드의 재사용성
	public static void hello() {
		//구현부 (Body)
		//- 메소드가 하려는 업무 코드 구현
		System.out.println("반갑습니다");
	}
}
