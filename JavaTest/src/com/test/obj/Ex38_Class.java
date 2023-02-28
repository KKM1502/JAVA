package com.test.obj;

public class Ex38_Class {
	public static void main(String[] args) {
	
		/*
		 클래스, Class
		 - 코드의 집합
		 - 같은 목적을 가지는 코드의 집합
		 - 데이터 집합
		 
		 
		 
		 */
		
		//요구사항] 지도 > 우리집 > 좌표 > 저장+사용
		
		//Case 1.
		//- 간편, 즉시 생성
		//- 식별자 문제 > 같은 성질의 데이터를 저장하는 식별자가 서로 다른 이름을 사용
		
		//우리집 좌표
		int x = 100;
		int y = 200;
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n",x,y)	;
		
		//마트 좌표
		int x2 = 300;
		int y2 = 400;

		//Case 2.
		//- 배열 사용
		//- 간편, 즉시 생성
		//- 데이터 저장 구조 생성, 관리 용이 + 가독성 향상
		//- 각 방의 데이터가 구분이 힘들다. > 요소를 방번호로 구분하기 때문 .. 
		
		
		//우리집
		int[] a1 = {100,200};
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n",a1[0],a1[1])	;
		
		//마트
		int[] a2 = {300,400};
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n",a2[0],a2[1])	;
	
		
		//Case 3.
		//- 클래스 사용
		
		//변수 생성
		//- 자료형 변수명;
		int a;
		
		//클랙스 객체명 = 객체생성연산자 생성자();
		//- 클래스 == 붕어빵틀 == 설계도 == 사람 == 포메라이언
		//- 객체 == 붕어빵 == 제품 == 홍길동 == 똘이
		Point p1 = new Point();
		
		p1.x = 100;
		p1.y=200;


		Size s1 = new Size();
		s1.name = "노트북";
		s1.width = 60;
		s1.height = 50;
	
		
		//UML, 
		// - 여러가지 다이어그램
		// - 클래스 다이어그램
		// - 유스케이스 다이어그램
		// - 시퀀스 다이어그램
	}//main
}


//class 선언하기
//class 클래스명{
//	public int a ;
//	public int b;
//}

//좌표값 저장하기 위한 클래스
class Point{
	
	public int x;
	public int y;
	
}

class Size{
	public String name;
	public int width;
	public int height;
}

