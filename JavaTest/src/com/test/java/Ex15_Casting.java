package com.test.java;

public class Ex15_Casting {

	public static void main(String[] args) {
//		Ex15_Casting
		
		
		/*
		 (자료)형 변환
		 Casting, Data Type Casting
		 하나의 자료형을 또 다른 자료형으로 변환
		 코드 작성을 유연하게 하기 위해서 사용
		 값형끼리만  가능(boolean 제외)
		 byte, short, int, long, float, double, char
		 */
		
		int n1;
		int n2;
		//= 연산자
		//- Lvalue(공간) = RValue(값)
		//- Lvalue와 RValue의 자료형은 동일해야 한다.

		n1 = 100;
		n2 = n1;
		
		//암시적 형변환
		short a = 10;
		int b;
		b = a ;
		System.out.println(b);
		
		//명시적 형변환
		//명시적 형변환 시 발생하는 데이터가 넘치는 현상 > 오버플로우
		//오버플로우가 발생할 만한 상황을 미리 예측하고 관리 필수!
		int e =10;
		short f ;
		
		f=(short)e;
		System.out.println(f);
		
	}
	
}
