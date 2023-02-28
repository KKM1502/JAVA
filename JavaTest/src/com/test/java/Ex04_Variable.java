package com.test.java;

public class Ex04_Variable {
	
	public static void main(String[] args) {
		
		byte kor; //변수 선언
		
		kor = 100;	
		
		byte eng = 100;
		
		byte math;
		
		byte math1, math2, math3;
		byte math4=20, math5=30, math6=40; // 수학점수들
		
		//The local variable age may not have been initialized
		//초기화 되지 않은 변수 age를 출력하려고 했음~~~~그러면 안되잖슴~~
		byte age; //null 상태
		//- null 값의 변수는 출력할 수 없다.
		//System.out.println(age);
		
		//수학 원주율
		//double pi = 3.14;
		//pi = 5.24; //이 행동은 멍청한 짓
		
		final double pi = 3.14;//상수(final 변수) 할당 이후에는 더 이상 수정할 수 없다.
		System.out.println(pi);
		
		
		
	}

}
