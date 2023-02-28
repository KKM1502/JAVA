package com.test.java;

import java.util.Scanner;

public class Ex21_Operator {
	public static void main(String[] args) {
//		Ex21_Operator
		
//		요구사항] 사용자로부터 문자 1개를 입력 > 영어 소문자인지 검사?
		
//		시나리오
//		1. Scanner 생성
//		2. 라벨 출력
//		3. 문자 1를 입력받기
//		4. 입력받은 문자가 영어 소문자인지 검사 (***)
//		5. 결과 출력
		
		//화면 설계
		Scanner scan= new Scanner(System.in);//1
		System.out.println("문자입력:"); //2
		String input1 = scan.nextLine(); //문자열 반환, "a" 
		char c =input1.charAt(0); //문자열의 첫 글자의 char로 뽑아낸다.
		
		
		//97~ 122사이의 숫자인지 검사    >> 4
		String result=(c>=97 && c<=122?"소문자입니다.":"소문자가 아닙니다.");//5-1
		System.out.printf("입력받은 문자 %c는 %s", c, result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
