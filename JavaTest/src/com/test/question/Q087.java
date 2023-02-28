package com.test.question;

import java.util.Scanner;

public class Q087 {
//	Java 아래의 요구사항을 구현하시오.
//	Skill: 문자열
//	요구사항
//	영단어를 입력받아 분리하시오.
//
//	조건..
//	합성어를 입력한다.
//	합성어는 파스칼 표기법으로 입력한다.
//	출력은 각 단어를 공백으로 구분한다.
//	입력..
//	단어: StudentName 
//
//	출력..
//	결과: Student Name
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("단어: ");
		String input = scan.nextLine();
		int index = 0;
		String text = "";
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)>'A' && input.charAt(i)<'Z') {
				text+=" "+input.charAt(i);
			}
			else {
				text+=input.charAt(i);
			}
		}
		System.out.println(text);
		
		
		

	}
}


