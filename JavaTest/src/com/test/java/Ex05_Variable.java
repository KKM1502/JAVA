package com.test.java;

public class Ex05_Variable {

	public static void main(String[] args) {
		
		//Ex05_Variable.java
		
		//1. 각 자료형 > 변수 만들기
		//2. 각 자료형 > 데이터 대입 + 출력
		
		//정수형
		byte b1;
		b1 =10; //10 > 데이터 > 뎅터 표현한 10 > *리터럴(Literal), 상수
		System.out.println(b1);
		
		//변수(변하는) <-> 상수(변하지않는)
		
		//b1 = 128;//Type mismatch: cannot convert from int to byte
		//자료형이 표현할 수 있는 범위를 넘어섬
		//System.out.println(b1)
		
		//유틸 크래스 (래퍼 클래스)
		//1. byte	 > Byte
		//2. short	 > Short
		//3. int	 > Integer
		//4. long	 > Long
		//5. float	 > Float
		//6. double	 > Double
		//7. boolean > Boolean

		b1 = Byte.MAX_VALUE; //변수 > 상수 > JDK가 미리 제공하는 상수
		System.out.println(b1);//127
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		//실수형 상수는 double형이다.
		float f1; 
		f1 = 3.14f;
		System.out.println(f1);
		
		char c1;
		c1 = 'A';
		System.out.println(c1);
		
		c1 = '@';
		System.out.println(c1);
		
		c1 = '1';
		System.out.println(c1);
		
		
		//홀길동
//		c1 = '홍길동'; //Invalid character constant
		String c2;
		c2 = "홍길동";
		System.out.println(c2);
		
		//논리형
		boolean flag;
		
		flag = true;	//논리형 리터럴
		flag = false;	//논리형 상수 
		
		
		
	}
	
	
	
}
