package com.test.java;

import java.util.Scanner;

public class Ex29_if {
	public static void main(String[] args) {
		
		//Ex29_if.java
		
		/*
		 	프로그램
		 	- 수많은 문장의 집합
		 	- 명령어들이 미리 정해진 제어의 흐름에 따라 실행(위 > 아래)
		 	
		 	제어문
		 	- 그 흐름을 통제하는 역할
		 	- 조건 제어, 반복 제어, 분기 제어
		 	
		 	1. 조건문
		 		- 개발자가 조건을 제시한 후 프로그램 흐름을 제어
		 		a. if
		 		b. switch
		 	
		 	2. 반복문
		 		- 특정 코드를 개발자가 원하는 횟수만큼 반복 실행
		 		a. for
		 		b. while
		 		c. do while
		 		d. for		 	
		 	
		 	3. 분기문
		 		- 개발자가 코드의 흐름을 원하는 곳으로 이동
		 		a. break
		 		b. continue
		 		c. goto(JDK 1.5 폐기)
		 	
		 */
		
		/*
		 	if문
		 	- 조건을 제시 후 프로그램 흐름을 제어
		 	- 조건식 > boolean 값을 가진다.
		 	
		 	if(조건식){
		 		실행문;
		 	}
		 	
		 	조건식
		 	-boolean
		 	-비교식, 논리식
		 	
		 	다른 언어의 조건식
		 	- boolean이 아닌 자료형을  사용하기도 한다.
		 	
		 	자바는 c계열 언어이다.
		 	- c언어는 boolean형이 없다. > 정수 사용(1,0)
		 	
		 	- 정수: 0(false), 1(true), 0이 아닌 모든 숫자(true)
		 	- 실수: 0.0(false), 0이 아닌 모든 숫자(true)
		 	- 문자: \0(null 문자, 문자 코드값 : 0)(false) 그 이외의 문자(true)
		 	- 문자열: 
		 */
		//m1();
		//m2();
		//m3();
		m5();
		
		
		
		
		
		
	}//main

	
	
	private static void m5() {
		// TODO Auto-generated method stub
		
	}



	private static void m3() {
		Scanner scan = new Scanner(System.in);
		//설문조사
		System.out.println("A. 무슨색을 좋아합니까?");
		System.out.println("1.노란색");
		System.out.println("2.빨간색");
		System.out.println("3.파랑색");
		
		System.out.print("선택: ");
		int sum = 0 ;
		int sel = scan.nextInt();
		if (sel ==1 ) {
			sum+= 10;
		}else if (sel ==2 ) {
			sum +=5;
		}else if (sel ==3 ) {
			sum +=3;
		}
		
		
		System.out.println("B. 어떤 개발을 좋아하는가");
		System.out.println("1.java");
		System.out.println("2.python");
		System.out.println("3.c");
		
		System.out.print("선택: ");
		int sel2 = scan.nextInt();
		if (sel2 ==1 ) {
			sum+= 10;
		}else if (sel2 ==2 ) {
			sum +=5;
		}else if (sel2 ==3 ) {
			sum +=3;
		}
		
		System.out.println("완료\n");
		System.out.println("결과\n");
		System.out.print("당신은 "); 
		if (sum >=6 && sum<8 ) {
			System.out.println("별로");
		}else if (sum>=8 && sum<20 ) {
			System.out.println("꽤 괜찮은 개발자");
		}else{
			System.out.println("최고!");
		}
		
		
		
		
	}

	private static void m2() {

			//요구사항] 나이를 입력받아 성인, 미성년자인지 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.print("나이: ");
		int age = scan.nextInt();
		System.out.println(age>19?"성인":"미성년자");
		
		if(age>19) {
			System.out.println("성인");
		}
		else {
			System.out.println("미성년자");
		}
		
	}

	private static void m1() {
		if(true) {// true block
			System.out.println("안녕하세요.");
		}
		System.out.println("프로그램 종료.");
		
		
		int n= 0;
		if(n>0) {
			System.out.println("양수입니다.");
		}
		else if(n<0){
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0입니다.");
		}
	}
}
