package com.test.java;

import java.util.Scanner;

public class Ex20_Operator {
	
	public static void main(String[] args) {
//		Ex20_Operator
//		연산자 종류
//	 	1. 행동(목적)
//	 		a. 산술 연산자
//	 		b. 비교 연산자
//	 		c. 논리 연산자
//	 		d. 대입 연산자
//	 		e. 증감 연산자
//	 		f. 조건 연산자
//	 	1. 형태(피연산자 개수)
//	 		a. 1항 연산자
//	 		b. 2항 연산자
//	 		c. 3항 연산자
	
//		연산자 우선 순위
//		1. ()
//		2. 산술 연산자
//			a. *, / , %
//			b. +, -
//		3. 비교 연산자
//		4. 논리 연산자
//		5. 대입 연산자
		
		
		/*
		 	대입 연산자, 할당 연산자
		 	- =
		 	- +=, -=, *=, /=, %= (복합 대입 연산자)
		 	- LValue(변수) = RValue(변수, 상수)
		 	- LValue와 RValue의 자료형은 동일해야한다. > 형변환
		 	- 대입 연산자의 연산자 우선순위는 가장 낮다.
		 	
		 
		 
		 
		 */
		
		/*
			증감 연산자
			- ++(증가), --(감소)
			- 1항 연산자
			- 피연산자는 숫자형을 가진다.
			- 누적 연산을 한다. 기존의 값에 +1, -1을 한다.
			
			*** 피연산자의 위치가 바뀔 수 있다. > 연산자 우선순위가 달라질 수 있다.
			++n 전위 배치(전치)
			n++ 후위 배치(후치) 연산자 우선순위가 가장 낮음 
	 	
	 	
	 
	 
	 
		 */
		int sum = 1 + 2 * 3;
		System.out.println(sum);
		
		//복합 연산자
		int n = 10;
		
		//요구사항] n에 1을 더하시오 > n의 값에 1을 더해서 다시 n에 넣어라
		//		> 누적(***)

		n +=1;
		System.out.println(n); //11
		
		n=n+1;
		n+=1;
		++n;
		System.out.println(n); //14
		
		n = n -1 ;
		n -= 1;
		--n;
		System.out.println(n);
		
		n=10;
		++n;
		n++;
		System.out.println(n);
		
		
		
		
		
		
		
		n=10;
		int result = 0;
		result = 10 + ++n;
		System.out.printf("result= %d\n",result);
		
		
		//개선 (나눠서 쓰자)
		n=10;
		result = 0;
		++n;
		result = 10 + n;
		System.out.printf("result= %d\n",result);
		
		
		
		
		n=10;
		result = 10 + n++; // 가독성 저하 (******)
		System.out.printf("result= %d\nn= %d",result,n);
		
		//개선 (나눠서 쓰자)
		n=10;
		result = 10;
		result = 10 + n ;
		n++;
		System.out.printf("result= %d\nn= %d",result,n);
		
		/*
		  	조건 연산자
		  	- ?:
		  	- A ? B : C
		  	- 3항 연산자
		  	- A: 조건(boolean)
		  	- B,C: 결과(상수, 변수)
		 */
		
		boolean flag = true;
		String m1 = "참";
		String m2 = "거짓";

		//					A	?	b	:	C
		String m3 = flag? m1 : m2;
		System.out.println(m3);
		
		//나이 > 성인?
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이: ");
		int age = scan.nextInt();
		
		System.out.println(age >= 19 ? "통과" : "거절");
	
		System.out.println(age % 2 == 0 ? "짝수" : "홀수");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//산술 연산자
		//- +
		//- 숫자+숫자
		
		//문자열 연산자
		//- +
		//- 문자열 + 문자열 
		//문자열 연산자
		
		
		//연산자 연산 방향
		//- 같은 우선순위를 가지는 연산들이 어느 방향으로 실행되는지
		//- 1+2+3
		//- 대부분의 연산자는 왼쪽 > 오른쪽 방향으로 실행된다.
		//- 대입 연산자(=)는 오른쪽> 왼쪽 방향으로 실행된다.
		
		
		
		
		
	}
}