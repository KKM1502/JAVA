package com.test.question;

import java.util.Scanner;

public class Q082 {
//	Java 아래의 요구사항을 구현하시오.
//	Skill: 문자열
//	요구사항
//	숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
//
//	입력..
//	숫자: 314 
//
//	출력..	
//	결과: 3 + 1 + 4 = 8
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		String input = scan.nextLine();
		
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char k=input.charAt(i);
			sum +=k-48;
			System.out.print(k);
			if(i==input.length()-1) {
				break;
			}
			System.out.print(" + ");
			
			
			
		}
		System.out.printf(" = %d",sum);
	}
}
