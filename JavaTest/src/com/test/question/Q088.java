package com.test.question;

import java.util.Scanner;

public class Q088 {
//	Java 아래의 요구사항을 구현하시오.
//	Skill: 문자열
//	요구사항
//	금지어를 마스킹 처리 하시오.
//
//	조건..
//	금지어
//	바보
//	멍청이
//	입력..
//	입력: 너랑 안놀아 바보야!! 
//
//	출력..
//	너랑 안놀아 **야!!
//	금지어를 1회 마스킹했습니다.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String input = scan.nextLine();
	
		String[] ban = {"바보", "멍청이"};
		for (int i = 0; i < ban.length; i++) {
			if(input.contains(ban[i])) {
				System.out.println("h");
				
			}
		}
		System.out.println(input);
		
		
		
		
	}
}
