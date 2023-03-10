package com.test.java;

public class Ex16_Casting {

	public static void main(String[] args) {
		//Ex16_Casting
		
		//정수형 리터럴은 int
		//실수형 리터럴은 double
		//대입 연산자는 좌우 자료형이 동일해야한다.
		
		//byte = int
		//작은형(1) = 큰형(4) > 명시적 형변환
		byte m1 = 10;	
		
		//short = int
		//작은형(2) = 큰형(4) > 명시적
		short m2 = 10;
		
		//int = int
		//형변환 없음 
		int m3 = 10;
		
		//long = int
		//큰형(8) = 작은형(4) > 암시적
		long m4 = 10;
		
		//float = double
		//작은형(4) = 큰형(8)
		//float f1 = (float)3.14;
		float f1 = 3.14f;
		double f2 = 3.14;
		
		
		//정수 <> 실수
		long n1 = 100;	//원본(8)
		float n2;		//복사(4)
		
		double n3 = 3.14;
		int n4;
		
		//작은형 - 큰형
		n4 = (int)n3;
		System.out.println(n4);//소수점 이하 절삭
		
		//정수와 실수간의 크기 비교는 단순히 물리 크기이 byte로 계산하는게 아닌 실제 표현 가능한 숫자의 범위로 표현해야 한다.
		
		//크기 정리
		//byte(1) < short(2) < int(4) < long(8) <<<<<float(4) < double(8)
	
		//char(2byte) = short(2byte)
		
		char c1 = 'A';
		short s1;
		
		s1 = (short)c1;
		System.out.println("s1: "+s1); //'A' > 65
		
		short s2 = 97; //원본
		char c2;
		c2 = (char)s2;	//명시적 변환
		System.out.println(c2);//97 > 'a'
		
		//*** char을 short로 변환하면 안된다.
		//*** char을 문자코드로 변환하려면 int를 사용한다.
		//-char > int
		//- int > char
		
		//몇몇 문자의 코드 암기
		System.out.println((int)'A'); //65
		System.out.println((int)'Z'); //90
		
		System.out.println((int)'a'); //97
		System.out.println((int)'z'); //122
		
		System.out.println((int)'0'); //48
		System.out.println((int)'9'); //57
		
		//한글 체계
		//- 완성형 한글(가, 나, 다, 강...)
		//- 조합형 한글(ㄱ, ㄴ, ㅏ, ㅑ...) > 사용x 
		System.out.println((int)'가');
		System.out.println((int)'힣');
		
		
		
	}
	
	
	
	
	
}
