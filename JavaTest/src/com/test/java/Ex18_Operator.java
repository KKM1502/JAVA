package com.test.java;

public class Ex18_Operator {
	
	public static void main(String[] args) {
		//Ex18_Operator
		/*
		 	연산자, Operator
		 	- 수학 연산자 > 프로그래밍 연산자
		 	- 피연산자를 대상으로 미리 정해진 연산을 한 후에, 연산의 결과를 반환하는 요소
		 	- 주로 기호를 많이 사용 + 영단어도 많이 사용
		 	
		 	1.문장, Statement
		 	2.표현식, Expression
		 	3.연산자, Operator
		 	4.피연산자, Operand
		 	5.연산자 우선순위
		 	6.연산자 연산방향
		 	
		 	문장, Statement
		 	- 1개 이상의 표현식이 모여서 문장을 만든다.
		 	- int sum = 10 + 20;
		 	
		 	표현식, Expression
		 	- 문장을 구성하는 최소 단위
		 	- int sum
		 	- 10 + 20
		 	
		 	연산자, Operator
		 	- +
		 	- =
		 	
		 	피연산자, Operand
		 	- +: 10, 20
		 	- =: sum = 30
		 	
		 	연산자 우선순위
		 	- 하나의 문장에 속해있는 모든 연산들은, 누가 먼저 실행해야 하는지 순서가 정해져있다.
		 	연산자 연산방향
		 	- 1 + 2 + 3 = 6
		 	
		 	연산자 종류
		 	1. 행동(목적)
		 		a. 산술 연산자
		 		b. 비교 연산자
		 		c. 논리 연산자
		 		d. 대입 연산자
		 		e. 증감 연산자
		 		f. 조건 연산자
		 	1. 형태(피연산자 개수)
		 		a. 1항 연산자
		 		b. 2항 연산자
		 		c. 3항 연산자
		 */
		
		int sum = 10 + 20;
		System.out.println(sum);
		
		/*
		 	산술 연산자
		 	- +, -, *, /, %(mod, 나머지연산자)
		 	- 2항 연산자
		 	- 피연산자는 숫자를 가진다. (정수,실수)
		 	모든 산술 연산자의 결과값의 자료형은 두 피연산자의 자료형중에서 더 크기가 큰 자료형으로 반환된다.
		 */
		
		int a = 10;
		int b = 3;
		System.out.printf("%d + %d = %d\n", a,b,a+b);
		System.out.printf("%d - %d = %d\n", a,b,a-b);
		System.out.printf("%d * %d = %d\n", a,b,a*b);
		System.out.printf("%d / %d = %d\n", a,b,a/b);
		System.out.printf("%d %% %d = %d\n", a,b,a%b);
	
		int e = 1000000000;
		int f = 2000000000;
		// int + int = int
		long g = (long)e+f;
		System.out.println(g); // int 는 21억까지 가능~~ 오버플로우와 언더플로우를 조심하자
		
		//달력 만들기 > 로직 
		//1. a년 b월 1일 > 무슨 요일 ? 수 
		//2. a년 b월 마지막일? 28
		//나머지연산 사용

		
		//정수 중 int를 주로 사용하는지?
		// - 정수형 리터럴이 int 
		// - 
		byte b1 = 10;
		byte b2 = 20;
		
		//byte + byte = byte(x)
		System.out.println(b1+b2);
		//byte + byte = int(o)
		//***byte, short의 산술 연산은 무조건 int다. > CPU 처리 단위 
				
		byte b3 = (byte)(b1 + b2); // ()연산자의 우선순위를 높여준다.		
		System.out.println(b3);
		
		int b4 = b1 + b2;
		
		//정수(byte, short, int, long)>int(주로), long(가끔)
		//실수(float, double) > double(주로) - 정밀도때문
		
		
	}//main
}
