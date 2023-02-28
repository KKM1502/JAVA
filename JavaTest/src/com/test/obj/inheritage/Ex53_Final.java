package com.test.obj.inheritage;

public class Ex53_Final {
	public static void main(String[] args) {
		
		/*
		 
		 final 키워드
		 1. 지역 변수
		 2. 메소드 적용
		 3. 클래스 적용
		 
		 */
		
		//지역 변수
		int a = 10;
		a = 20;
		a = 30;
		
		final int b =10;
		//b=20;
		//b=30;
		
		// 이 방식 비권장 > 일반 변수처럼 보임
		final int c ;
		c = 10;
		// c =20;
		
		//권장
		final int d = 10;
		
		//상수명의 모두 대문자로 작성한다. > 변수와 구분짓기 위해
		final double PI = 3.14;
		
		
		
	}
}


class Gender{
	
	//남자(1) 여자(2)
	public final int MALE = 1;
	public final int FEMALE = 2;
	
}