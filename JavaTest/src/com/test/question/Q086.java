package com.test.question;

import java.util.Scanner;

public class Q086 {
//	Java 아래의 요구사항을 구현하시오.
//	Skill: 문자열
//	요구사항
//	숫자를 입력받아 3자리마다 , 를 붙이시오.
//
//	조건..
//	%,d 사용 금지
//	입력..
//	숫자: 1234 
//
//	출력..
//	결과: 1,234
//	입력..
//	숫자: 1234567 
//
//	출력..
//	결과: 1,234,567
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		String input = scan.nextLine();
		String result="";
		
		//1234567
		while(input.length()>3) {
			result=","+input.substring(input.length()-3,input.length())+result;
			input= input.substring(0,input.length()-3);
		}
		System.out.println();
		System.out.println("결과: "+input+result);
	}
}
