package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex19_Operator {
		public static void main(String[] args) throws IOException {
//			Ex19_Operator
//			연산자 종류
//		 	1. 행동(목적)
//		 		a. 산술 연산자
//		 		b. 비교 연산자
//		 		c. 논리 연산자
//		 		d. 대입 연산자
//		 		e. 증감 연산자
//		 		f. 조건 연산자
//		 	1. 형태(피연산자 개수)
//		 		a. 1항 연산자
//		 		b. 2항 연산자
//		 		c. 3항 연산자
		
//			연산자 우선 순위
//			1. ()
//			2. 산술 연산자
//				a. *, / , %
//				b. +, -
//			3. 비교 연산자
//			4. 논리 연산자
			
			/*
			비교 연산자
			- >, >=, <, <=, ==(같다, equals), !=(같지 않다. not equals)
			- 2항 연산자
			- 피연산자들의 우위 비교를 하는 연산자.
			- 피연산자는 숫자형을 가진다.
			- 연산의 결과가 boolean이다. (true, false)
			 
			 */

			int a = 10;
			int b = 3;
			
			System.out.println(a>b);
			System.out.println(a>=b);
			System.out.println(a<b);
			System.out.println(a<=b);
			System.out.println(a==b);
			System.out.println(a!=b);
			
			//프로그램 흐름 > 조건 재사용
			
			//요구사항] 사용자 나이 입력 > 성인(19세 이상) o,x
			System.out.print("나이:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine() ; //나이
			
			int age =Integer.parseInt(input);
			
			if(age>=19 && age<60) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
			
			
			boolean b1 = true;
			boolean b2 = true;
			System.out.println(b1 == b2 );
			System.out.println(b1 != b2);
			
			String s1= "홍길동";
			String s2= "홍길동";
			String s3= "아무개";
			String s4= "홍";
			s4 = s4 + "길동";
			
			System.out.println(s1==s2);// true
			System.out.println(s1==s3);// false
			System.out.println(s1==s4);// false
			
			//***문자열의 비교는 ==, != 연산자를 절대 사용하면 안된다.
			//***문자열의 비교는 equals() 메소드를 사용한다.
			
			System.out.println();
			System.out.println(s1.equals(s2));//s1==s2
			
			/*
			 
			 논리 연산자
			 - &&(and), ||(or), !(not)
			 - 비트연산자 > &(and),|(or),^(xor) 
			 - 2항 연산자 (&&,||)
			 - 1항 연산자 (!)
			 - 피연산자의 자료형이 boolean이다.
			 - 연산의 결과는 boolean이다.
			 
			 A && B = ?
			 
			 T && T = T
			 T && F = F
			 F && T = F
			 F && F = F
			 
			 A || B = ?
			 
			 T || T = T
			 T || F = T
			 F || T = T
			 F || F = F
			
			 1 && 1 = 1
			 1 && 0 = 0
			 0 && 1 = 0
			 0 && 0 = 0
			
			 1 || 1 = 1
			 1 || 0 = 1
			 0 || 1 = 1
			 0 || 0 = 0
			 
			 */
			
			
			//boolean을 반대로 뒤집기
			System.out.println(!true);
			System.out.println(!false);
			
			System.out.println(true&true);
			System.out.println(false|true);
			
			
			System.out.println();
			//베타적 논리합
			//- 좌우가 서로 다른 true
			//- 암호화
			System.out.println(true^true);
			System.out.println(true^false);
			System.out.println(false^true);
			System.out.println(false^false);
			
			
		}
}
