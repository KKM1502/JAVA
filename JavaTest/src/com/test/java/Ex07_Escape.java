package com.test.java;


public class Ex07_Escape {
	
	public static void main(String[] args) {
		
/*		Ex07_Escape.java
		특수문자 > Escape Sequence
		-컴파일러가 번역을 할 때, 문자 그대로 출력하지 않고 미리 약속된 표현으로 바꿔서 출력하는 구성요소
		
		1. \n
		-new line, line feed
		-개행 문자 = enter
*/
		char c1 = '\n';
		String s1 = "\n";
		
		//요구사항] "안녕하세요. 홍길동입니다."를 출력
		//수정사항] "안녕하세요." 와 "홍길동입니다." 각각 다른 줄에 출력
		
		//***문자열 리터럴("") 안에는 엔터를 칠 수 없다.
		String msg = "안녕하세요."+c1+"홍길동입니다.";
		System.out.println(msg);
		
		/* 2.\r
		-carriage return
		-캐럿의 위치를 현재 라인의 맨앞으로 이동
		-키보드>Home 키 역할
		-이클립스 콘솔창에서는 \n과 동일하게 동작
		*/
		msg = "안녕하세요.\r홍길동";
		System.out.println(msg);		
		
		//운영체제의 엔터
		//1. 윈도우:\r\n
		//2. 맥OS:\r
		//3. 리눅스:\n
		
		/* 3.\t
		-탭문자, tab
		-탭 > 행동x > 이미 정해져있는 열의 위치값들
		-탭키 > 가장 가까운 탭으로 이동
		-
		*/
		
		msg = "하나\t\t둘\t\t\t셋";
		System.out.println(msg);
		
		/* 4.\b
		-backsapce
		-이클립스 콘솔에서 동작 안함
		*/
		msg= "홍길동\b입니다";
		System.out.println(msg); 

		/* 5.\", \',\\
		요구사항] 홍길동: "안녕하세요" >출력
		*/
		msg = "홍길동: \"안녕하세요\"";
		System.out.println(msg); 
		//요구사항] 수업 폴더 경로를 출력하시오.
		//C:\class\code\java
		System.out.println("수업 폴더: C:\\class\\code\\java");
		
	}

}
