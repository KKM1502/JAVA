package com.test.obj;

public class Ex82_Annoymous {
	public static void main(String[] args) {
//		익명 객체 , Anonymous Object
//		- 익명 클래스, Anonymous Class
//		- 이름이 없는 클래스
//		- 반드시 인터페이스가 필요하다.
//
//		실명 클래스
//		1. 객체를 N개 만들 수 있다.
//			- 클래스 선언 > 객체 생성
//
//		익명 클래스 
//		1. 객체를 딱 1개만 만들 수 있다. > 1회용 클래스
//			- 클래스 + 객체 생성 

		//프로젝트
		// - 클래스 개수 > 많음 > 수백개~ 수천개 이상
		// - 이름 짓기... > 영어 + 의미
		
		
		
		//요구사항] 인터페이스를 구현한 클래스 선언하기 > 객체를 생성하기

		//1.본인 타입의 참조 변수
		BB o1 = new BB();
		o1.aaa();

		//2.부모 타입의 참조 변수
		AA o2 = new BB();  //업캐스팅
		o2.aaa();

		//3.추상 클래스, 인터페이스 > 객체를 생성할 수 없다. > 추상 메서드 때문
//		AA o3 = new AA();  
//		o3.aaa();


		//AA를 상속받는 이름 없는 클래스 선언 중 
		AA o4 = new AA() {
			@Override
			public void aaa() {
				System.out.println("추상메소드 구현2");
			}
		};



	}
}

interface AA{
	void aaa();
}

class BB implements AA{
	@Override
	public void aaa() {
		System.out.println("추상메소드 구현");
	}
}
