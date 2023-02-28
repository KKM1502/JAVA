package com.test.question;


import java.util.Scanner;

public class Q080 {
//	Java 아래의 요구사항을 구현하시오.
//	Skill: 문자열
//	요구사항
//	문장을 입력받아 역순으로 출력하시오.
//
//	입력..
//	문장 입력 : 가나다 
//
//	출력..
//	역순 결과 : "다나가"
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문장 입력: ");//김경민 // 3 
		String input = scan.nextLine();
		System.out.printf("역순결과: \"");
		for (int i = 0; i < input.length(); i++) {
		
			char k =input.charAt(input.length()-i-1);
			System.out.printf("%c",k);
		}
		System.out.println("\"");

	}
}
