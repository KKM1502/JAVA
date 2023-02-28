package com.test.question;

import java.util.Scanner;

public class Q085 {
//	Java 아래의 요구사항을 구현하시오.
//	Skill: 문자열
//	요구사항
//	주민 등록 번호 유효성 검사를 하시오.
//
//	조건..
//	'-'의 입력 유무 상관없이 검사하시오.
//	입력..
//	주민등록번호: 951220-1021547 
//
//	출력..
//	올바른 주민등록번호입니다.
//	입력..
//	주민등록번호: 951220-1234567 
//
//	출력..
//	올바르지 않은 주민등록번호입니다.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호: ");
		String input = scan.nextLine();
		input = input.replace("-", "");
		int sum =0;
		for (int i = 0; i < 12; i++) {
			sum = sum + Integer.parseInt(input.substring(i, i+1))*(i%8 +2);
		}
		sum%=11;
		sum = 11 - (sum%10);
		
		if(sum == Integer.parseInt(input.substring(input.length()-1,input.length()))) {
			System.out.println("올바른 주민등록번호입니다.");
		}else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
	}
}
